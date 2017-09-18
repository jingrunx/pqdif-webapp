/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.incesa.sympqd.pqdif;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 *
 * @author Gabriel
 */
public class ObservationRecord {
ByteBuffer outputBuffer = ByteBuffer.allocate(PqdifConstants.DATASOURCE_MAX_SIZE);
  private int MAX_LEVELS = 10;
  private int MAX_REL_LINK_INDEX = 40;
  private int bodySize;
  private int[][] indexOfRelativeLinks = new int[MAX_LEVELS][MAX_REL_LINK_INDEX]; // Levels x Index per Level

  public void ObservationRecord() {
    outputBuffer.clear();
    this.bodySize = 0;
    for (int i=0; i<this.MAX_LEVELS; i++){
      for (int j=0; j<this.MAX_REL_LINK_INDEX; j++) {
        this.indexOfRelativeLinks[i][j] = 0;
      }
    }
  }

  public int getBodySize() {
    return this.bodySize;
  }
  
  public byte[] generate(int recordBegin, int valuesNumber, String[] series1, float[] series2) {
    int[] inputSavedPosition = new int[MAX_LEVELS];
    int[] outputSavedPosition = new int[MAX_LEVELS];
    int[] elementSize = new int[MAX_LEVELS];
    
    outputBuffer.order(ByteOrder.LITTLE_ENDIAN);
    byte[] serializedContent = new byte[32];
    
    // initializari
    for (int i=0; i<MAX_LEVELS; i++) {
      inputSavedPosition[i] = 0;
      outputSavedPosition[i] = 0;
    }
    
    // record header
    serializedContent = PqdifConstants.recordSignature.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    serializedContent = PqdifConstants.tagRecObservation.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.putInt(PqdifConstants.RECORD_HEADER_SIZE);
    outputBuffer.putInt(0xDEADBEEF);  // body size
    outputBuffer.putInt(0xFEEDBABE);  // absolute link to next record = 0 + headerSize + bodySize
    outputBuffer.putInt(0x00000000);  // checksum (optional !?)
    for(int j=0; j<4; j++) {          // auiReserved
      outputBuffer.putInt(0);
    }
    
    // record body
    int bodyStart = outputBuffer.position();
    System.out.printf("bs os = %d\n\r", bodyStart);
    
    int previousPosition = outputBuffer.position();
    outputBuffer.putInt(7);
    int currentPosition = outputBuffer.position();
    this.bodySize += (currentPosition - previousPosition);
    
    int crtLevel = 0;
    // e1
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagObservationName.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_VECTOR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_CHAR1);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[crtLevel][inputSavedPosition[crtLevel]] = outputBuffer.position();
    inputSavedPosition[crtLevel]++;
    outputBuffer.putInt(0x0000CEFA);    // rel Link
    outputBuffer.putInt(0x0000ADBE);    // element size
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    this.bodySize += elementSize[crtLevel];
    
    // e2
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagTimeCreate.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_TIMESTAMPPQDIF);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[crtLevel][inputSavedPosition[crtLevel]] = outputBuffer.position();
    inputSavedPosition[crtLevel]++;
    outputBuffer.putInt(0x0000CEFA);    // rel Link
    outputBuffer.putInt(0x0000ADBE);    // element size
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    this.bodySize += elementSize[crtLevel];
    
    // e3
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagTimeStart.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_TIMESTAMPPQDIF);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[crtLevel][inputSavedPosition[crtLevel]] = outputBuffer.position();
    inputSavedPosition[crtLevel]++;
    outputBuffer.putInt(0x0000CEFA);    // rel Link
    outputBuffer.putInt(0x0000ADBE);    // element size
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    this.bodySize += elementSize[crtLevel];
    
    // e4
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagTriggerMethodID.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_UNS_INTEGER4);
    outputBuffer.put((byte) 1);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    outputBuffer.putInt(PqdifConstants.ID_TRIGGER_METH_NONE);    // embedded Value
    outputBuffer.putInt(0);    // element size
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    this.bodySize += elementSize[crtLevel];
    
    // e5
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagChannelInstances.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_COLLECTION);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_NA);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[crtLevel][inputSavedPosition[crtLevel]] = outputBuffer.position();
    inputSavedPosition[crtLevel]++;
    outputBuffer.putInt(0x0000CEFA);    // rel Link
    outputBuffer.putInt(0x0000ADBE);    // element size
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    this.bodySize += elementSize[crtLevel];
    
    // e1 content - (tagObservationName)
    previousPosition = currentPosition;
    int currentRelativeLink = currentPosition;
    String tempString = "Secundar transformator";   // din forma web
    int charsLength = tempString.length()+1;
    int rem4 = charsLength % 4;
    int arraySize = charsLength;
    if (rem4 != 0) {
      arraySize = charsLength + 4 - rem4;
    }
    int paddingZeroes = arraySize - charsLength + 1;
    outputBuffer.putInt(charsLength);
    outputBuffer.put(tempString.getBytes());
    for (int i=0; i<paddingZeroes;i++) {
      outputBuffer.put((byte) 0);
    }
    currentPosition = outputBuffer.position();
    int returnPosition = currentPosition;
    elementSize[crtLevel] = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize[crtLevel];
    
    // e2 content - tagTimeCreate
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    tempString = "12/6/2016 1:58:03 PM"; // generat de aplicatia web (sau prima valoare din CSV)
    DateTime dt = DateTime.create(0,0);
    dt.setFromString(tempString);
    serializedContent = dt.getTimestamp();
    outputBuffer.put(serializedContent, 0, 12);
    currentPosition = outputBuffer.position();
    returnPosition = currentPosition;
    elementSize[crtLevel] = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize[crtLevel];
    
    // e3 content - tagTimeStart
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    tempString = "12/6/2016 1:58:03 PM"; // generat de aplicatia web (sau prima valoare din CSV)
    dt = DateTime.create(0,0);
    dt.setFromString(tempString);
    serializedContent = dt.getTimestamp();
    outputBuffer.put(serializedContent, 0, 12);
    currentPosition = outputBuffer.position();
    returnPosition = currentPosition;
    elementSize[crtLevel] = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize[crtLevel];
    
    // e4 content is embedded
    
    // e5 content - tagChannelInstances [COLLECTION]
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    outputBuffer.putInt(1);   // e5 collection elements count
    crtLevel++;   // Level 1
    elementSize[crtLevel-1] = 0;
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    // e5.1
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagOneChannelInst.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_COLLECTION);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_NA);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[crtLevel][inputSavedPosition[crtLevel]] = outputBuffer.position();
    inputSavedPosition[crtLevel]++;
    outputBuffer.putInt(0x0000CEFA);    // rel Link
    outputBuffer.putInt(0x0000ADBE);    // element size
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
        
    returnPosition = currentPosition;
    crtLevel--; // return to Level 0
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);

    //Level 1 content
    crtLevel++;   // Level 1
    
    // 5.1 content - tagOneChannelInst [COLLECTION]
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    outputBuffer.putInt(2);   // e5.1 collection elements count
    crtLevel++;   // Level 2
    elementSize[crtLevel-1] = 0;
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    // e5.1.1    
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagChannelDefnIdx.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_UNS_INTEGER4);
    outputBuffer.put((byte) 1);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    outputBuffer.putInt(0);    // embedded Value
    outputBuffer.putInt(0);    // element size
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    // e5.1.2
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagSeriesInstances.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_COLLECTION);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_NA);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[crtLevel][inputSavedPosition[crtLevel]] = outputBuffer.position();
    inputSavedPosition[crtLevel]++;
    outputBuffer.putInt(0x0000CEFA);    // rel Link
    outputBuffer.putInt(0x0000ADBE);    // element size
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    returnPosition = currentPosition;
    crtLevel--; // return to Level 1
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    
    //Level 2 content
    crtLevel++;   // Level 2
    
    // 5.1.2 content - tagSeriesInstances [COLLECTION]
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    outputBuffer.putInt(2);   // e5.1.2 collection elements count
    crtLevel++;   // Level 3
    elementSize[crtLevel-1] = 0;
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    // e5.1.2.1
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagOneSeriesInstance.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_COLLECTION);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_NA);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[crtLevel][inputSavedPosition[crtLevel]] = outputBuffer.position();
    inputSavedPosition[crtLevel]++;
    outputBuffer.putInt(0x0000CEFA);    // rel Link
    outputBuffer.putInt(0x0000ADBE);    // element size
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    // e5.1.2.2
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagOneSeriesInstance.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_COLLECTION);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_NA);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[crtLevel][inputSavedPosition[crtLevel]] = outputBuffer.position();
    inputSavedPosition[crtLevel]++;
    outputBuffer.putInt(0x0000CEFA);    // rel Link
    outputBuffer.putInt(0x0000ADBE);    // element size
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    returnPosition = currentPosition;
    crtLevel--; // return to Level 2
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    
    //Level 3 content
    crtLevel++;   // Level 3
    
    // 5.1.2.1 content - tagOneSeriesInstance [COLLECTION]
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    outputBuffer.putInt(1);   // e5.1.2.1 collection elements count
    crtLevel++;   // Level 4
    elementSize[crtLevel-1] = 0;
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    // e5.1.2.1.1
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagSeriesValues.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_VECTOR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_TIMESTAMPPQDIF);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[crtLevel][inputSavedPosition[crtLevel]] = outputBuffer.position();
    inputSavedPosition[crtLevel]++;
    outputBuffer.putInt(0x0000CEFA);    // rel Link
    outputBuffer.putInt(0x0000ADBE);    // element size
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    returnPosition = currentPosition;
    crtLevel--; // return to Level 3
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    
    // 5.1.2.2 content - tagOneSeriesInstance [COLLECTION]
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    outputBuffer.putInt(1);   // e5.1.2.2 collection elements count
    crtLevel++;   // Level 4
    elementSize[crtLevel-1] = 0;
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    // e5.1.2.2.1
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagSeriesValues.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_VECTOR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_REAL4);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[crtLevel][inputSavedPosition[crtLevel]] = outputBuffer.position();
    inputSavedPosition[crtLevel]++;
    outputBuffer.putInt(0x0000CEFA);    // rel Link
    outputBuffer.putInt(0x0000ADBE);    // element size
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    returnPosition = currentPosition;
    crtLevel--; // return to Level 3
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    
    // Level 4 content
    crtLevel++;   // Level 4
    
    // e5.1.2.1.1 content - TIMP
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    System.out.println(valuesNumber);
    outputBuffer.putInt(valuesNumber);    // numar de elemente vector
    for(int i=0;i<valuesNumber;i++) {
      tempString = series1[i];
      dt = DateTime.create(0,0);
      dt.setFromString(tempString);
      serializedContent = dt.getTimestamp();
      outputBuffer.put(serializedContent, 0, 12);
    }
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    this.bodySize += elementSize[crtLevel];
    
    returnPosition = currentPosition;
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    
// e5.1.2.1.1 content - TENSIUNE
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    outputBuffer.putInt(valuesNumber);    // numar de elemente vector
    for(int i=0;i<valuesNumber;i++) {
      outputBuffer.putFloat(series2[i]);
    }
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    this.bodySize += elementSize[crtLevel];
    
    returnPosition = currentPosition;
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    
    
    returnPosition = currentPosition;
    outputBuffer.position(PqdifConstants.INDEX_OF_BODY_SIZE); // index of bodySize field from header
    outputBuffer.putInt(this.bodySize);
    outputBuffer.putInt(0); // Last record in PQD File
    outputBuffer.position(returnPosition);
    
    
    //return value
    return this.outputBuffer.array();
  }
}
