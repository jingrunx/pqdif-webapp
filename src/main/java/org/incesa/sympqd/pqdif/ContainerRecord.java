/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.incesa.sympqd.pqdif;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.incesa.pqdif.input.MetaData;

/**
 *
 * @author Gabriel
 */
public class ContainerRecord {
  ByteBuffer outputBuffer = ByteBuffer.allocate(PqdifConstants.CONTAINER_MAX_SIZE);
  private int numberOfElements = 14;
  private int bodySize;
  private int[] indexOfRelativeLinks = new int[numberOfElements];
  private MetaData metaData;

  public ContainerRecord(MetaData metaData) {
    outputBuffer.clear();
    this.bodySize = 0;
    for (int i=0; i<this.numberOfElements; i++){
      this.indexOfRelativeLinks[i] = 0;
    }
    this.metaData = metaData;
  }

  public int getBodySize() {
    return this.bodySize;
  }
  
  public byte[] generate(int recordBegin) {
    outputBuffer.order(ByteOrder.LITTLE_ENDIAN);
    byte[] serializedContent = new byte[32];
    
    // record header
    serializedContent = PqdifConstants.recordSignature.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    serializedContent = PqdifConstants.tagContainer.getSerialized();
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
    System.out.printf("bs ct = %d\n\r", bodyStart);
    
    int previousPosition = outputBuffer.position();
    outputBuffer.putInt(this.numberOfElements);
    int currentPosition = outputBuffer.position();
    this.bodySize += (currentPosition - previousPosition);
    
    int currentElement = 1;
    // e1
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagVersionInfo.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_VECTOR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_UNS_INTEGER4);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[currentElement-1] = outputBuffer.position();
    outputBuffer.putInt(668);    // rel Link
    outputBuffer.putInt(20);     // element size
    currentPosition = outputBuffer.position();
    int elementSize = (currentPosition - previousPosition);
    this.bodySize += elementSize;
    
    currentElement++;
    // e2
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagFileName.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_VECTOR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_CHAR1);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[currentElement-1] = outputBuffer.position();
    outputBuffer.putInt(668);    // rel Link
    outputBuffer.putInt(20);     // element size
    currentPosition = outputBuffer.position();
    elementSize = (currentPosition - previousPosition);
    this.bodySize += elementSize;
    
    currentElement++;
    // e3
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagCreation.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_TIMESTAMPPQDIF);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[currentElement-1] = outputBuffer.position();
    outputBuffer.putInt(668);    // rel Link
    outputBuffer.putInt(20);     // element size
    currentPosition = outputBuffer.position();
    elementSize = (currentPosition - previousPosition);
    this.bodySize += elementSize;
    
    currentElement++;
    // e4
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagSubject.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_VECTOR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_CHAR1);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[currentElement-1] = outputBuffer.position();
    outputBuffer.putInt(668);    // rel Link
    outputBuffer.putInt(20);     // element size
    currentPosition = outputBuffer.position();
    elementSize = (currentPosition - previousPosition);
    this.bodySize += elementSize;
    
    currentElement++;
    // e5
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagAuthor.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_VECTOR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_CHAR1);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[currentElement-1] = outputBuffer.position();
    outputBuffer.putInt(668);    // rel Link
    outputBuffer.putInt(20);     // element size
    currentPosition = outputBuffer.position();
    elementSize = (currentPosition - previousPosition);
    this.bodySize += elementSize;
    
    currentElement++;
    // e6
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagApplication.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_VECTOR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_CHAR1);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[currentElement-1] = outputBuffer.position();
    outputBuffer.putInt(668);    // rel Link
    outputBuffer.putInt(20);     // element size
    currentPosition = outputBuffer.position();
    elementSize = (currentPosition - previousPosition);
    this.bodySize += elementSize;

    currentElement++;
    // e7
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagCopyright.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_VECTOR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_CHAR1);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[currentElement-1] = outputBuffer.position();
    outputBuffer.putInt(668);    // rel Link
    outputBuffer.putInt(20);     // element size
    currentPosition = outputBuffer.position();
    elementSize = (currentPosition - previousPosition);
    this.bodySize += elementSize;

    currentElement++;
    // e8
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagTrademarks.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_VECTOR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_CHAR1);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[currentElement-1] = outputBuffer.position();
    outputBuffer.putInt(668);    // rel Link
    outputBuffer.putInt(20);     // element size
    currentPosition = outputBuffer.position();
    elementSize = (currentPosition - previousPosition);
    this.bodySize += elementSize;

    currentElement++;
    // e9
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagComments.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_VECTOR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_CHAR1);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[currentElement-1] = outputBuffer.position();
    outputBuffer.putInt(668);    // rel Link
    outputBuffer.putInt(20);     // element size
    currentPosition = outputBuffer.position();
    elementSize = (currentPosition - previousPosition);
    this.bodySize += elementSize;

    currentElement++;
    // e10
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagNotes.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_VECTOR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_CHAR1);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[currentElement-1] = outputBuffer.position();
    outputBuffer.putInt(668);    // rel Link
    outputBuffer.putInt(20);     // element size
    currentPosition = outputBuffer.position();
    elementSize = (currentPosition - previousPosition);
    this.bodySize += elementSize;

    currentElement++;
    // e11
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagLanguage.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_VECTOR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_CHAR1);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[currentElement-1] = outputBuffer.position();
    outputBuffer.putInt(668);    // rel Link
    outputBuffer.putInt(20);     // element size
    currentPosition = outputBuffer.position();
    elementSize = (currentPosition - previousPosition);
    this.bodySize += elementSize;

    currentElement++;
    // e12
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagOwner.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_VECTOR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_CHAR1);
    outputBuffer.put((byte) 0);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    this.indexOfRelativeLinks[currentElement-1] = outputBuffer.position();
    outputBuffer.putInt(668);    // rel Link
    outputBuffer.putInt(20);     // element size
    currentPosition = outputBuffer.position();
    elementSize = (currentPosition - previousPosition);
    this.bodySize += elementSize;

    currentElement++;
    // e13
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagCompressionStyleID.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_UNS_INTEGER4);
    outputBuffer.put((byte) 1);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    //this.indexOfRelativeLinks[currentElement-1] = outputBuffer.position();
    outputBuffer.putInt(PqdifConstants.ID_COMP_STYLE_NONE);     // embedded Value
    outputBuffer.putInt(0);     // element size
    currentPosition = outputBuffer.position();
    elementSize = (currentPosition - previousPosition);
    this.bodySize += elementSize;
    
    currentElement++;
    // e14
    previousPosition = currentPosition;
    serializedContent = PqdifConstants.tagCompressionAlgorithmID.getSerialized();
    outputBuffer.put(serializedContent, 0, 16);
    outputBuffer.put((byte) PqdifConstants.ID_ELEMENT_TYPE_SCALAR);
    outputBuffer.put((byte) PqdifConstants.ID_PHYS_TYPE_UNS_INTEGER4);
    outputBuffer.put((byte) 1);  // is embedded ?
    outputBuffer.put((byte) 0);  // reserved
    //this.indexOfRelativeLinks[currentElement-1] = outputBuffer.position();
    outputBuffer.putInt(PqdifConstants.ID_COMP_ALG_NONE);     // embedded Value
    outputBuffer.putInt(0);     // element size
    currentPosition = outputBuffer.position();
    elementSize = (currentPosition - previousPosition);
    this.bodySize += elementSize;
    
    currentElement = 1;
    // e1 content = tagVersionInfo
    previousPosition = currentPosition;
    int currentRelativeLink = currentPosition;
    outputBuffer.putInt(4);
    outputBuffer.putInt(1);
    outputBuffer.putInt(5);
    outputBuffer.putInt(1);
    outputBuffer.putInt(5);
    currentPosition = outputBuffer.position();
    int returnPosition = currentPosition;
    elementSize = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[currentElement-1]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize);
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize;
    
    currentElement++;
    // e2 content = tagFileName
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    String tempString = metaData.getTagFileName();   // tb. generat de aplicatia web
    
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
    elementSize = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[currentElement-1]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize);
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize;

    currentElement++;
    // e3 content = tagCreation
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    tempString = metaData.getTagCreation(); // generat de aplicatia web
    
    DateTime dt = DateTime.create(0,0);
    dt.setFromString(tempString);
    serializedContent = dt.getTimestamp();
    outputBuffer.put(serializedContent, 0, 12);
    
    currentPosition = outputBuffer.position();
    returnPosition = currentPosition;
    elementSize = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[currentElement-1]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize);
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize;
    
    currentElement++;
    // e4 content = tagSubject
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    tempString = metaData.getTagSubject();  // din forma web
    
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
    elementSize = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[currentElement-1]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize);
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize;

    currentElement++;
    // e5 content = tagAuthor
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    tempString = metaData.getTagAuthor(); // din forma web
    
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
    elementSize = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[currentElement-1]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize);
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize;

    currentElement++;
    // e6 content = tagApplication
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    tempString = metaData.getTagApplication(); // valoare fixa [numele pluginului]
    
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
    elementSize = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[currentElement-1]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize);
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize;

    currentElement++;
    // e7 content = tagCopyright
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    tempString = metaData.getTagCopyright(); // valoare fixa - TBD
    
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
    elementSize = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[currentElement-1]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize);
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize;

    currentElement++;
    // e8 content = tagTrademark
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    tempString = metaData.getTagTrademark(); // valoare fixa - TBD
    
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
    elementSize = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[currentElement-1]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize);
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize;

    currentElement++;
    // e9 content = tagComments
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    tempString = "PT213 Craiova"; // din forma web
    
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
    elementSize = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[currentElement-1]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize);
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize;

    currentElement++;
    // e10 content = tagNotes
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    tempString = metaData.getTagNotes(); // din forma web
    
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
    elementSize = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[currentElement-1]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize);
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize;
    
    currentElement++;
    // e11 content = tagLanguage
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    tempString = metaData.getTagLanguage(); // valoare fixa
        
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
    elementSize = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[currentElement-1]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize);
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize;

    currentElement++;
    // e12 content = tagOwner
    previousPosition = currentPosition;
    currentRelativeLink = currentPosition;
    tempString = metaData.getTagOwner(); // valoare fixa - TBD
    
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
    elementSize = (currentPosition - previousPosition);
    outputBuffer.position(this.indexOfRelativeLinks[currentElement-1]);
    outputBuffer.putInt(currentRelativeLink - bodyStart);
    outputBuffer.putInt(elementSize);
    outputBuffer.position(returnPosition);
    this.bodySize += elementSize;

    returnPosition = currentPosition;
    outputBuffer.position(PqdifConstants.INDEX_OF_BODY_SIZE); // index of bodySize field from header
    outputBuffer.putInt(this.bodySize);
    outputBuffer.putInt(this.bodySize+PqdifConstants.RECORD_HEADER_SIZE);
    //outputBuffer.putInt(0);  Last record - for test purposes
    outputBuffer.position(returnPosition);
    
    return this.outputBuffer.array();
  }
}
