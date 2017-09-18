package org.incesa.sympqd.pqdif;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.incesa.sympqd.pqdif.DateTime;
import org.incesa.sympqd.pqdif.PqdifConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
public class DataSourceRecord {
  ByteBuffer outputBuffer = ByteBuffer.allocate(PqdifConstants.DATASOURCE_MAX_SIZE);
  private int MAX_LEVELS = 10;
  private int MAX_REL_LINK_INDEX = 40;
  private int bodySize;
  private int[][] indexOfRelativeLinks = new int[MAX_LEVELS][MAX_REL_LINK_INDEX]; // Levels x Index per Level

  public void DataSourceRecord() {
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
  
  public byte[] generate(int recordBegin) {

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
    serializedContent = PqdifConstants.tagRecDataSource.getSerialized();
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
    System.out.printf("bs ds = %d\n\r", bodyStart);
    
    int previousPosition = outputBuffer.position();
    outputBuffer.putInt(7);
    int currentPosition = outputBuffer.position();
    this.bodySize += (currentPosition - previousPosition);
    
    int crtLevel = 0;
    // e1
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagDataSourceTypeID.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_GUID);
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
    serializedContent = PqdifConstants.tagCustomSourceInfo.getSerialized();
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
    
    // e3
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagSerialNumberDS.getSerialized();
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
    
    // e4
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagVersionDS.getSerialized();
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
    
    // e5
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagNameDS.getSerialized();
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
    
    // e6
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagEffective.getSerialized();
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
    
    // e7
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagChannelDefns.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_COLLECTION);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_NA);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[crtLevel][inputSavedPosition[crtLevel]] = outputBuffer.position();
    inputSavedPosition[crtLevel]++;     // = count ?
    outputBuffer.putInt(0x0000CEFA);    // rel Link
    outputBuffer.putInt(0x0000ADBE);    // element size
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    this.bodySize += elementSize[crtLevel];
    
    // Content Level 0
    
    // e1 content = tagDataSourceTypeID
    previousPosition = currentPosition;
    int currentRelativeLink = currentPosition;
    serializedContent = PqdifConstants.ID_DS_TYPE_MEASURE.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    currentPosition = outputBuffer.position();
    int returnPosition = currentPosition;
    elementSize[crtLevel] = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize[crtLevel];
    
    // e2 content = tagCustomSourceInfo [COLLECTION]
    crtLevel++;   // Level 1
    elementSize[crtLevel-1] = 0;
    
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    outputBuffer.putInt(3);   // e2 collection elements count
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    // e2.1
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagInstrumentTypeID.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_GUID);
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
    
    // e2.2
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagInstrumentModelName.getSerialized();
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
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    // e2.3
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagInstrumentModelNumber.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_VECTOR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_CHAR1);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[crtLevel][inputSavedPosition[crtLevel]] = outputBuffer.position();
    inputSavedPosition[crtLevel]++;     // = count ?
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
    
    // e3 content - tagSerialNumberDS
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    String tempString = "26297";   // din forma web
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
    returnPosition = currentPosition;
    elementSize[crtLevel] = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize[crtLevel];

    // e4 content - tagVersionDS
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    tempString = "v6.15fa5 06.03.14";   // din forma web
    charsLength = tempString.length()+1;
    rem4 = charsLength % 4;
    arraySize = charsLength;
    if (rem4 != 0) {
      arraySize = charsLength + 4 - rem4;
    }
    paddingZeroes = arraySize - charsLength + 1;
    outputBuffer.putInt(charsLength);
    outputBuffer.put(tempString.getBytes());
    for (int i=0; i<paddingZeroes;i++) {
      outputBuffer.put((byte) 0);
    }
    currentPosition = outputBuffer.position();
    returnPosition = currentPosition;
    elementSize[crtLevel] = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize[crtLevel];
    
    // e5 content - tagNameDS
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    tempString = "MEg 40+";   // din forma web
    charsLength = tempString.length()+1;
    rem4 = charsLength % 4;
    arraySize = charsLength;
    if (rem4 != 0) {
      arraySize = charsLength + 4 - rem4;
    }
    paddingZeroes = arraySize - charsLength + 1;
    outputBuffer.putInt(charsLength);
    outputBuffer.put(tempString.getBytes());
    for (int i=0; i<paddingZeroes;i++) {
      outputBuffer.put((byte) 0);
    }
    currentPosition = outputBuffer.position();
    returnPosition = currentPosition;
    elementSize[crtLevel] = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize[crtLevel];
    
    // e6 content - tagEffective
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

    // e7 content = tagChannelDefns [COLLECTION]
    crtLevel++;   // Level 1
    elementSize[crtLevel-1] = 0;
    
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    outputBuffer.putInt(1);   // e7 collection elements count
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    // e7.1
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagOneChannelDefn.getSerialized();
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

    // Content Level 1
    crtLevel++;
    // e2.1 content = tagInstrumentTypeTypeID
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    serializedContent = PqdifConstants.ID_INSTR_TYPE_SA.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    currentPosition = outputBuffer.position();
    returnPosition = currentPosition;
    elementSize[crtLevel] = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize[crtLevel];
    
    // e2.2 content - tagInstrumentModelName
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    tempString = "MEg 40+";   // din forma web
    charsLength = tempString.length()+1;
    rem4 = charsLength % 4;
    arraySize = charsLength;
    if (rem4 != 0) {
      arraySize = charsLength + 4 - rem4;
    }
    paddingZeroes = arraySize - charsLength + 1;
    outputBuffer.putInt(charsLength);
    outputBuffer.put(tempString.getBytes());
    for (int i=0; i<paddingZeroes;i++) {
      outputBuffer.put((byte) 0);
    }
    currentPosition = outputBuffer.position();
    returnPosition = currentPosition;
    elementSize[crtLevel] = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize[crtLevel];

    // e2.3 content - tagInstrumentModelNumber
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    tempString = "N/A";   // din forma web
    charsLength = tempString.length()+1;
    rem4 = charsLength % 4;
    arraySize = charsLength;
    if (rem4 != 0) {
      arraySize = charsLength + 4 - rem4;
    }
    paddingZeroes = arraySize - charsLength + 1;
    outputBuffer.putInt(charsLength);
    outputBuffer.put(tempString.getBytes());
    for (int i=0; i<paddingZeroes;i++) {
      outputBuffer.put((byte) 0);
    }
    currentPosition = outputBuffer.position();
    returnPosition = currentPosition;
    elementSize[crtLevel] = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize[crtLevel];
    
    // e7.1 content = tagOneChannelDefn [COLLECTION]
    crtLevel++;   // Level 2
    elementSize[crtLevel-1] = 0;
    
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    outputBuffer.putInt(5);   // e7.1 collection elements count
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    // e7.1.1
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagChannelName.getSerialized();
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
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
           
    // e7.1.2
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagPhaseID.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_UNS_INTEGER4);
    outputBuffer.put((byte) 1);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    outputBuffer.putInt(PqdifConstants.ID_PHASE_AN);    // embedded Value
    outputBuffer.putInt(0);    // element size
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    // e7.1.3
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagQuantityTypeID.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_GUID);
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

    // e7.1.4
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagQuantityMeasuredID.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_UNS_INTEGER4);
    outputBuffer.put((byte) 1);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    outputBuffer.putInt(PqdifConstants.ID_QM_VOLTAGE);    // embedded Value
    outputBuffer.putInt(0);    // element size
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];

    // e7.1.5
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagSeriesDefns.getSerialized();
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

    // Content Level 2
    crtLevel++;
    // e7.1.1 content (tagChannelName)
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    tempString = "Tensiune - Faza R";   // din forma web
    charsLength = tempString.length()+1;
    rem4 = charsLength % 4;
    arraySize = charsLength;
    if (rem4 != 0) {
      arraySize = charsLength + 4 - rem4;
    }
    paddingZeroes = arraySize - charsLength + 1;
    outputBuffer.putInt(charsLength);
    outputBuffer.put(tempString.getBytes());
    for (int i=0; i<paddingZeroes;i++) {
      outputBuffer.put((byte) 0);
    }
    currentPosition = outputBuffer.position();
    returnPosition = currentPosition;
    elementSize[crtLevel] = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize[crtLevel];    
    
    // e7.1.2 content is embedded
    
    // e7.1.3 content = tagQuantityTypeID
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    serializedContent = PqdifConstants.ID_QT_VALUELOG.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    currentPosition = outputBuffer.position();
    returnPosition = currentPosition;
    elementSize[crtLevel] = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize[crtLevel];

    // e7.1.4 content is embedded
    
    // e7.1.5 content (tagSeriesDefns [COLLECTION]
    crtLevel++;   // Level 3
    elementSize[crtLevel-1] = 0;
    
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    outputBuffer.putInt(2);   // e7.1.5 collection elements count
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    // e7.1.5.1
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagOneSeriesDefn.getSerialized();
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
    
    // e7.1.5.2
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagOneSeriesDefn.getSerialized();
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
    
    // Content Level 3
    crtLevel++;
    
    // e7.1.5.1 content (tagOneSeriesDefn [COLLECTION]
    crtLevel++;   // Level 4
    elementSize[crtLevel-1] = 0;
    
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    outputBuffer.putInt(4);   // e7.1.5.1 collection elements count
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    // e7.1.5.1.1
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagValueTypeID.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_GUID);
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
    
    // e7.1.5.1.2
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagQuantityUnitsID.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_UNS_INTEGER4);
    outputBuffer.put((byte) 1);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    outputBuffer.putInt(PqdifConstants.ID_QU_SECONDS);    // embedded Value
    outputBuffer.putInt(0);    // element size
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    // e7.1.5.1.3
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagQuantityCharacteristicID.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_GUID);
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
    
    // e7.1.5.1.4
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagStorageMethodID.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_UNS_INTEGER4);
    outputBuffer.put((byte) 1);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    outputBuffer.putInt(PqdifConstants.ID_SERIES_METHOD_VALUES);    // embedded Value
    outputBuffer.putInt(0);    // element size
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
    
    // e7.1.5.2 content  (tagOneSeriesDefn [COLLECTION]
    crtLevel++;   // Level 4
    elementSize[crtLevel-1] = 0;
    
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    outputBuffer.putInt(4);   // e7.1.5.2 collection elements count
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    // e7.1.5.2.1
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagValueTypeID.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_GUID);
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
    
    // e7.1.5.2.2
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagQuantityUnitsID.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_UNS_INTEGER4);
    outputBuffer.put((byte) 1);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    outputBuffer.putInt(PqdifConstants.ID_QU_VOLTS);    // embedded Value
    outputBuffer.putInt(0);    // element size
    currentPosition = outputBuffer.position();
    elementSize[crtLevel] = (currentPosition - previousPosition);
    elementSize[crtLevel-1] += elementSize[crtLevel];
    this.bodySize += elementSize[crtLevel];
    
    // e7.1.5.2.3
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagQuantityCharacteristicID.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_GUID);
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
    
    // e7.1.5.2.4
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagStorageMethodID.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_UNS_INTEGER4);
    outputBuffer.put((byte) 1);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    outputBuffer.putInt(PqdifConstants.ID_SERIES_METHOD_VALUES);    // embedded Value
    outputBuffer.putInt(0);    // element size
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

    // Content Level 4
    crtLevel++;
    
    // e7.1.5.1.1 content (tagValueTypeID)
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    serializedContent = PqdifConstants.ID_SERIES_VALUE_TYPE_TIME.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    currentPosition = outputBuffer.position();
    returnPosition = currentPosition;
    elementSize[crtLevel] = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize[crtLevel];

    // e7.1.5.1.2 content is embedded
    // e7.1.5.1.3 content (tagQuantityCharacteristicID)
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    serializedContent = PqdifConstants.ID_QC_NONE.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    currentPosition = outputBuffer.position();
    returnPosition = currentPosition;
    elementSize[crtLevel] = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize[crtLevel];
    
    // e7.1.5.1.4 content is embedded

    // e7.1.5.2.1 content (tagValueTypeID)
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    serializedContent = PqdifConstants.ID_SERIES_VALUE_TYPE_MIN.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    currentPosition = outputBuffer.position();
    returnPosition = currentPosition;
    elementSize[crtLevel] = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize[crtLevel];

    // e7.1.5.2.2 content is embedded
    // e7.1.5.2.3 content (tagQuantityCharacteristicID)
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    serializedContent = PqdifConstants.ID_QC_RMS.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    currentPosition = outputBuffer.position();
    returnPosition = currentPosition;
    elementSize[crtLevel] = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[crtLevel][outputSavedPosition[crtLevel]]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize[crtLevel]);
    outputSavedPosition[crtLevel]++;
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize[crtLevel];

    // e7.1.5.2.4 content is embedded

    returnPosition = currentPosition;
    outputBuffer.position(PqdifConstants.INDEX_OF_BODY_SIZE); // index of bodySize field from header
    outputBuffer.putInt(this.bodySize);
    outputBuffer.putInt(this.bodySize+PqdifConstants.RECORD_HEADER_SIZE+recordBegin);
    //outputBuffer.putInt(0);  // Last record - for test purposes
    outputBuffer.position(returnPosition);
     
    return this.outputBuffer.array();
  }
}
