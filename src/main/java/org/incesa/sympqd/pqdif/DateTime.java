/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.incesa.sympqd.pqdif;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabriel
 */
public class DateTime {
  private int     day; // days since January 1, 1900, UTC
  private double  sec; // milliseconds since midnight of the day
  
  private static final long MILLISECONDS_PER_DAY = 24*60*60*1000;
  private static final int  SECONDS_PER_DAY = 86400;
  private static final int  DAYCOUNT_ADJUST_1970 = 25569;
  
  private DateTime(int d, double s) {
    this.day = d;
    this.sec = s;
  }
  
  public static DateTime create(int d, double s) {
    return new DateTime(d,s);
  }
  
  public static DateTime copy(DateTime obj) {
    return new DateTime(obj.getDaysSince1900(),obj.getFractionalSeconds());
  }

  public int getDaysSince1900() {
    return this.day;
  }
  
  public double getFractionalSeconds() {
    return this.sec;
  }
  
  public void setFromDate(Date date) {
    long milliseconds = date.getTime();
    long daysSince1970 = milliseconds / MILLISECONDS_PER_DAY;
    long remainder = milliseconds % MILLISECONDS_PER_DAY;
    this.day = ((int) daysSince1970) + DAYCOUNT_ADJUST_1970;
    this.sec = ((double) remainder) / 1000.0;
  }
  
  public Date toDate(){
    long milliseconds = (long)(this.day - DAYCOUNT_ADJUST_1970);
    milliseconds *= MILLISECONDS_PER_DAY;
    milliseconds += (long)(this.sec * 1000.0);
    return new Date(milliseconds);
  }
  
  public String toString() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    return sdf.format(this.toDate());
  }

  public void setFromString(String dateTime) {
    SimpleDateFormat sdf = new SimpleDateFormat("M/d/y h:m:s a");
    Date date = null;
    try {
      date = sdf.parse(dateTime);
    } catch (ParseException ex) {
      Logger.getLogger(DateTime.class.getName()).log(Level.SEVERE, null, ex);
    }
    setFromDate(date);
  }
  
  public byte[] getTimestamp () {
    byte[]  timestamp = new byte[12];
    
    timestamp[0] = (byte)((this.day >>  0) & 0xff);
    timestamp[1] = (byte)((this.day >>  8) & 0xff);
    timestamp[2] = (byte)((this.day >> 16) & 0xff);
    timestamp[3] = (byte)((this.day >> 24) & 0xff);
    long tempLong = Double.doubleToLongBits(this.sec);
    for(int i=0; i<8; i++) {
      timestamp[4+i] = (byte)((tempLong >> (i*8)) & 0xFFL);
    }
    return timestamp;
  }
}
