/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.incesa.sympqd.pqdif;

/**
 *
 * @author Gabriel Stoian
 * 
 */

public class Guid {
  private static final int DATA4_SIZE = 8;
  private static final int GUID_SIZE = 16;
  private int data1;
  private short data2;
  private short data3;
  private byte[] data4;
  private byte[] serialized;
 
  private Guid(int d1, int d2, int d3, 
               int d40, int d41, int d42, int d43, 
               int d44, int d45, int d46, int d47) {
    data1 = d1;
    data2 = (short) d2;
    data3 = (short) d3;
    
    data4 = new byte[DATA4_SIZE];
    data4[0] = (byte) d40;
    data4[1] = (byte) d41;
    data4[2] = (byte) d42;
    data4[3] = (byte) d43;
    data4[4] = (byte) d44;
    data4[5] = (byte) d45;
    data4[6] = (byte) d46;
    data4[7] = (byte) d47;
    
    serialized = new byte[GUID_SIZE];
    serialized[0] = (byte)((d1 >>  0) & 0xff);
    serialized[1] = (byte)((d1 >>  8) & 0xff);
    serialized[2] = (byte)((d1 >> 16) & 0xff);
    serialized[3] = (byte)((d1 >> 24) & 0xff);
    serialized[4] = (byte)((d2 >>  0) & 0xff);
    serialized[5] = (byte)((d2 >>  8) & 0xff);
    serialized[6] = (byte)((d3 >>  0) & 0xff);
    serialized[7] = (byte)((d3 >>  8) & 0xff);
    serialized[8] = (byte) d40;
    serialized[9] = (byte) d41;
    serialized[10] = (byte) d42;
    serialized[11] = (byte) d43;
    serialized[12] = (byte) d44;
    serialized[13] = (byte) d45;
    serialized[14] = (byte) d46;
    serialized[15] = (byte) d47;
  }
  
  public static Guid create(int d1, int d2, int d3, 
                            int d40, int d41, int d42, int d43, 
                            int d44, int d45, int d46, int d47) {
    
    return new Guid(d1, d2, d3, d40, d41, d42, d43, d44, d45, d46, d47);
  }
  
  public static Guid copy(Guid obj) {  
    int d1 = obj.data1;
    int d2 = obj.data2;
    int d3 = obj.data3;
    int d40 = obj.data4[0];
    int d41 = obj.data4[1];
    int d42 = obj.data4[2];
    int d43 = obj.data4[3];
    int d44 = obj.data4[4];
    int d45 = obj.data4[5];
    int d46 = obj.data4[6];
    int d47 = obj.data4[7];
    return new Guid(d1, d2, d3, d40, d41, d42, d43, d44, d45, d46, d47);
  }
  
  public void set(Guid obj) {
    this.data1 = obj.data1;
    this.data2 = obj.data2;
    this.data3 = obj.data3;
    for(int i=0; i<DATA4_SIZE; i++) {
      this.data4[i] = obj.data4[i];
    }
  }
  
  @Override
  public boolean equals(Object obj) {
    boolean status;
    // self check
    if (this == obj) {
        status = true;
    }
    else {
      // null check
      if (obj == null) {
        status = false;
      }
      else {
        // type check and cast
        if (getClass() != obj.getClass()) {
          status = false;
        }
        else {
          Guid guid = (Guid) obj;
          // field comparison
          status = false;
          if (this.data1 == guid.data1 && this.data2 == guid.data2 && this.data3 == guid.data3) {
            status = true;
            for (int i=0; i<DATA4_SIZE; i++) {
              if (this.data4[i] != guid.data4[i]) {
                status = false;
              }
            }
          }
        }
      }
    }
    return status;
  }

  public byte[] getSerialized() {
    return serialized;
  }
  public String toHexString() {
    return String.format("%08x-%04x-%04x-%02x%02x%02x%02x%02x%02x%02x%02x", data1, data2, data3, 
        data4[0], data4[1], data4[2], data4[3], data4[4], data4[5], data4[6], data4[7]);
  }
  
}
