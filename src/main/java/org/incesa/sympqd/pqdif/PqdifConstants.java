/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.incesa.sympqd.pqdif;

/** 
 *
 * @author Gabriel Stoian
 */
public class PqdifConstants {

  static public final int RECORD_HEADER_SIZE = 64;
  static public final int INDEX_OF_BODY_SIZE = 36;
  static public final int INDEX_OF_ABS_LINK_NEXT_RECORD = 40;
  static public final int CONTAINER_MAX_SIZE = 1000;
  static public final int DATASOURCE_MAX_SIZE = 10000;
  static public final int OBSERVATION_MAX_SIZE = 100000;
  
  //  PQDIF physical constants
    //  ========================
    static public final int ID_PHYS_TYPE_NA               = 0;

    //  Boolean
    static public final int ID_PHYS_TYPE_BOOLEAN1         = 1;
    static public final int ID_PHYS_TYPE_BOOLEAN2         = 2;
    static public final int ID_PHYS_TYPE_BOOLEAN4         = 3;

    //  Char/string
    static public final int ID_PHYS_TYPE_CHAR1            = 10; //  ASCII
    static public final int ID_PHYS_TYPE_CHAR2            = 11; //  Unicode

    //  Signed integers
    static public final int ID_PHYS_TYPE_INTEGER1         = 20;
    static public final int ID_PHYS_TYPE_INTEGER2         = 21;
    static public final int ID_PHYS_TYPE_INTEGER4         = 22;

    //  Unsigned integers
    static public final int ID_PHYS_TYPE_UNS_INTEGER1     = 30;
    static public final int ID_PHYS_TYPE_UNS_INTEGER2     = 31;
    static public final int ID_PHYS_TYPE_UNS_INTEGER4     = 32;

    //  Real/complex
    static public final int ID_PHYS_TYPE_REAL4            = 40;
    static public final int ID_PHYS_TYPE_REAL8            = 41;
    static public final int ID_PHYS_TYPE_COMPLEX8         = 42; //  Two REAL4s: real, imag
    static public final int ID_PHYS_TYPE_COMPLEX16        = 43; //  Two REAL8s: real, imag

    //  Date/time variations
    static public final int ID_PHYS_TYPE_TIMESTAMPPQDIF   = 50; //  Physical: total 12 bytes

    //  GUID
    static public final int ID_PHYS_TYPE_GUID             = 60; //  Physical: total 16 bytes
    
  //  RECORD BODY STRUCTURE
    //  =====================
    static public final int ID_ELEMENT_TYPE_COLLECTION  = 1;
    static public final int ID_ELEMENT_TYPE_SCALAR      = 2;
    static public final int ID_ELEMENT_TYPE_VECTOR      = 3;
    
  //  Integer constants
    static public final int    ID_COMP_STYLE_NONE = 0;
    static public final String name_ID_COMP_STYLE_NONE = "ID_COMP_STYLE_NONE" ;

    static public final int    ID_COMP_STYLE_RECORDLEVEL = 2;
    static public final String name_ID_COMP_STYLE_RECORDLEVEL = "ID_COMP_STYLE_RECORDLEVEL" ;

    static public final int    ID_COMP_STYLE_TOTALFILE = 1;
    static public final String name_ID_COMP_STYLE_TOTALFILE = "ID_COMP_STYLE_TOTALFILE" ;

    static public final int    ID_COMP_ALG_NONE = 0;
    static public final String name_ID_COMP_ALG_NONE = "ID_COMP_ALG_NONE" ;

    static public final int    ID_COMP_ALG_ZLIB = 1;
    static public final String name_ID_COMP_ALG_ZLIB = "ID_COMP_ALG_ZLIB" ;

    static public final int    ID_COMP_ALG_PKZIPCL = 64;
    static public final String name_ID_COMP_ALG_PKZIPCL = "ID_COMP_ALG_PKZIPCL" ;

    static public final int    ID_PHASE_NONE = 0;
    static public final String name_ID_PHASE_NONE = "ID_PHASE_NONE" ;

    static public final int    ID_PHASE_AN = 1;
    static public final String name_ID_PHASE_AN = "ID_PHASE_AN" ;

    static public final int    ID_PHASE_BN = 2;
    static public final String name_ID_PHASE_BN = "ID_PHASE_BN" ;

    static public final int    ID_PHASE_CN = 3;
    static public final String name_ID_PHASE_CN = "ID_PHASE_CN" ;

    static public final int    ID_PHASE_NG = 4;
    static public final String name_ID_PHASE_NG = "ID_PHASE_NG" ;

    static public final int    ID_PHASE_AB = 5;
    static public final String name_ID_PHASE_AB = "ID_PHASE_AB" ;

    static public final int    ID_PHASE_BC = 6;
    static public final String name_ID_PHASE_BC = "ID_PHASE_BC" ;

    static public final int    ID_PHASE_CA = 7;
    static public final String name_ID_PHASE_CA = "ID_PHASE_CA" ;

    static public final int    ID_PHASE_RES = 8;
    static public final String name_ID_PHASE_RES = "ID_PHASE_RES" ;

    static public final int    ID_PHASE_NET = 9;
    static public final String name_ID_PHASE_NET = "ID_PHASE_NET" ;

    static public final int    ID_PHASE_TOTAL = 13;
    static public final String name_ID_PHASE_TOTAL = "ID_PHASE_TOTAL" ;

    static public final int    ID_PHASE_LN_AVE = 14;
    static public final String name_ID_PHASE_LN_AVE = "ID_PHASE_LN_AVE" ;

    static public final int    ID_PHASE_LL_AVE = 15;
    static public final String name_ID_PHASE_LL_AVE = "ID_PHASE_LL_AVE" ;

    static public final int    ID_PHASE_WORST = 16;
    static public final String name_ID_PHASE_WORST = "ID_PHASE_WORST" ;

    static public final int    ID_PHASE_PLUS = 17;
    static public final String name_ID_PHASE_PLUS = "ID_PHASE_PLUS" ;

    static public final int    ID_PHASE_MINUS = 18;
    static public final String name_ID_PHASE_MINUS = "ID_PHASE_MINUS" ;

    static public final int    ID_PHASE_GENERAL_1 = 19;
    static public final String name_ID_PHASE_GENERAL_1 = "ID_PHASE_GENERAL_1" ;

    static public final int    ID_PHASE_GENERAL_2 = 20;
    static public final String name_ID_PHASE_GENERAL_2 = "ID_PHASE_GENERAL_2" ;

    static public final int    ID_PHASE_GENERAL_3 = 21;
    static public final String name_ID_PHASE_GENERAL_3 = "ID_PHASE_GENERAL_3" ;

    static public final int    ID_PHASE_GENERAL_4 = 22;
    static public final String name_ID_PHASE_GENERAL_4 = "ID_PHASE_GENERAL_4" ;

    static public final int    ID_PHASE_GENERAL_5 = 23;
    static public final String name_ID_PHASE_GENERAL_5 = "ID_PHASE_GENERAL_5" ;

    static public final int    ID_PHASE_GENERAL_6 = 24;
    static public final String name_ID_PHASE_GENERAL_6 = "ID_PHASE_GENERAL_6" ;

    static public final int    ID_PHASE_GENERAL_7 = 25;
    static public final String name_ID_PHASE_GENERAL_7 = "ID_PHASE_GENERAL_7" ;

    static public final int    ID_PHASE_GENERAL_8 = 26;
    static public final String name_ID_PHASE_GENERAL_8 = "ID_PHASE_GENERAL_8" ;

    static public final int    ID_PHASE_GENERAL_9 = 27;
    static public final String name_ID_PHASE_GENERAL_9 = "ID_PHASE_GENERAL_9" ;

    static public final int    ID_PHASE_GENERAL_10 = 28;
    static public final String name_ID_PHASE_GENERAL_10 = "ID_PHASE_GENERAL_10" ;

    static public final int    ID_PHASE_GENERAL_11 = 29;
    static public final String name_ID_PHASE_GENERAL_11 = "ID_PHASE_GENERAL_11" ;

    static public final int    ID_PHASE_GENERAL_12 = 30;
    static public final String name_ID_PHASE_GENERAL_12 = "ID_PHASE_GENERAL_12" ;

    static public final int    ID_PHASE_GENERAL_13 = 31;
    static public final String name_ID_PHASE_GENERAL_13 = "ID_PHASE_GENERAL_13" ;

    static public final int    ID_PHASE_GENERAL_14 = 32;
    static public final String name_ID_PHASE_GENERAL_14 = "ID_PHASE_GENERAL_14" ;

    static public final int    ID_PHASE_GENERAL_15 = 33;
    static public final String name_ID_PHASE_GENERAL_15 = "ID_PHASE_GENERAL_15" ;

    static public final int    ID_PHASE_GENERAL_16 = 34;
    static public final String name_ID_PHASE_GENERAL_16 = "ID_PHASE_GENERAL_16" ;

    static public final int    ID_QU_NONE = 0;
    static public final String name_ID_QU_NONE = "ID_QU_NONE" ;

    static public final int    ID_QU_SECONDS = 2;
    static public final String name_ID_QU_SECONDS = "ID_QU_SECONDS" ;

    static public final int    ID_QU_TIMESTAMP = 1;
    static public final String name_ID_QU_TIMESTAMP = "ID_QU_TIMESTAMP" ;

    static public final int    ID_QU_CYCLES = 3;
    static public final String name_ID_QU_CYCLES = "ID_QU_CYCLES" ;

    static public final int    ID_QU_VOLTS = 6;
    static public final String name_ID_QU_VOLTS = "ID_QU_VOLTS" ;

    static public final int    ID_QU_AMPS = 7;
    static public final String name_ID_QU_AMPS = "ID_QU_AMPS" ;

    static public final int    ID_QU_VA = 8;
    static public final String name_ID_QU_VA = "ID_QU_VA" ;

    static public final int    ID_QU_WATTS = 9;
    static public final String name_ID_QU_WATTS = "ID_QU_WATTS" ;

    static public final int    ID_QU_VARS = 10;
    static public final String name_ID_QU_VARS = "ID_QU_VARS" ;

    static public final int    ID_QU_OHMS = 11;
    static public final String name_ID_QU_OHMS = "ID_QU_OHMS" ;

    static public final int    ID_QU_SIEMENS = 12;
    static public final String name_ID_QU_SIEMENS = "ID_QU_SIEMENS" ;

    static public final int    ID_QU_VOLTSPERAMP = 13;
    static public final String name_ID_QU_VOLTSPERAMP = "ID_QU_VOLTSPERAMP" ;

    static public final int    ID_QU_JOULES = 14;
    static public final String name_ID_QU_JOULES = "ID_QU_JOULES" ;

    static public final int    ID_QU_HERTZ = 15;
    static public final String name_ID_QU_HERTZ = "ID_QU_HERTZ" ;

    static public final int    ID_QU_CELCIUS = 16;
    static public final String name_ID_QU_CELCIUS = "ID_QU_CELCIUS" ;

    static public final int    ID_QU_DEGREES = 17;
    static public final String name_ID_QU_DEGREES = "ID_QU_DEGREES" ;

    static public final int    ID_QU_DB = 18;
    static public final String name_ID_QU_DB = "ID_QU_DB" ;

    static public final int    ID_QU_PERCENT = 19;
    static public final String name_ID_QU_PERCENT = "ID_QU_PERCENT" ;

    static public final int    ID_QU_PERUNIT = 20;
    static public final String name_ID_QU_PERUNIT = "ID_QU_PERUNIT" ;

    static public final int    ID_QU_SAMPLES = 21;
    static public final String name_ID_QU_SAMPLES = "ID_QU_SAMPLES" ;

    static public final int    ID_QU_VARHOURS = 22;
    static public final String name_ID_QU_VARHOURS = "ID_QU_VARHOURS" ;

    static public final int    ID_QU_WATTHOURS = 23;
    static public final String name_ID_QU_WATTHOURS = "ID_QU_WATTHOURS" ;

    static public final int    ID_QU_VAHOURS = 24;
    static public final String name_ID_QU_VAHOURS = "ID_QU_VAHOURS" ;

    static public final int    ID_QU_MPS = 25;
    static public final String name_ID_QU_MPS = "ID_QU_MPS" ;

    static public final int    ID_QU_MPH = 26;
    static public final String name_ID_QU_MPH = "ID_QU_MPH" ;

    static public final int    ID_QU_BARS = 27;
    static public final String name_ID_QU_BARS = "ID_QU_BARS" ;

    static public final int    ID_QU_PASCALS = 28;
    static public final String name_ID_QU_PASCALS = "ID_QU_PASCALS" ;

    static public final int    ID_QU_NEWTONS = 29;
    static public final String name_ID_QU_NEWTONS = "ID_QU_NEWTONS" ;

    static public final int    ID_QU_NEWTONMETERS = 30;
    static public final String name_ID_QU_NEWTONMETERS = "ID_QU_NEWTONMETERS" ;

    static public final int    ID_QU_RPM = 31;
    static public final String name_ID_QU_RPM = "ID_QU_RPM" ;

    static public final int    ID_QU_RADPERSEC = 32;
    static public final String name_ID_QU_RADPERSEC = "ID_QU_RADPERSEC" ;

    static public final int    ID_QU_METERS = 33;
    static public final String name_ID_QU_METERS = "ID_QU_METERS" ;

    static public final int    ID_QU_WEBERTURNS = 34;
    static public final String name_ID_QU_WEBERTURNS = "ID_QU_WEBERTURNS" ;

    static public final int    ID_QU_TESLAS = 35;
    static public final String name_ID_QU_TESLAS = "ID_QU_TESLAS" ;

    static public final int    ID_QU_WEBERS = 36;
    static public final String name_ID_QU_WEBERS = "ID_QU_WEBERS" ;

    static public final int    ID_QU_VOLTSPERVOLT = 37;
    static public final String name_ID_QU_VOLTSPERVOLT = "ID_QU_VOLTSPERVOLT" ;

    static public final int    ID_QU_AMPSPERAMP = 38;
    static public final String name_ID_QU_AMPSPERAMP = "ID_QU_AMPSPERAMP" ;

    static public final int    ID_QU_AMPSPERVOLT = 39;
    static public final String name_ID_QU_AMPSPERVOLT = "ID_QU_AMPSPERVOLT" ;

    static public final int    ID_SERIES_METHOD_VALUES = 1;
    static public final String name_ID_SERIES_METHOD_VALUES = "ID_SERIES_METHOD_VALUES" ;

    static public final int    ID_SERIES_METHOD_SCALED = 2;
    static public final String name_ID_SERIES_METHOD_SCALED = "ID_SERIES_METHOD_SCALED" ;

    static public final int    ID_SERIES_METHOD_INCREMENT = 4;
    static public final String name_ID_SERIES_METHOD_INCREMENT = "ID_SERIES_METHOD_INCREMENT" ;

    static public final int    ID_GREEK_DONTCARE = 0;
    static public final String name_ID_GREEK_DONTCARE = "ID_GREEK_DONTCARE" ;

    static public final int    ID_GREEK_FEMTO = 1;
    static public final String name_ID_GREEK_FEMTO = "ID_GREEK_FEMTO" ;

    static public final int    ID_GREEK_PICO = 2;
    static public final String name_ID_GREEK_PICO = "ID_GREEK_PICO" ;

    static public final int    ID_GREEK_NANO = 3;
    static public final String name_ID_GREEK_NANO = "ID_GREEK_NANO" ;

    static public final int    ID_GREEK_MICRO = 4;
    static public final String name_ID_GREEK_MICRO = "ID_GREEK_MICRO" ;

    static public final int    ID_GREEK_MILLI = 5;
    static public final String name_ID_GREEK_MILLI = "ID_GREEK_MILLI" ;

    static public final int    ID_GREEK_NONE = 6;
    static public final String name_ID_GREEK_NONE = "ID_GREEK_NONE" ;

    static public final int    ID_GREEK_KILO = 7;
    static public final String name_ID_GREEK_KILO = "ID_GREEK_KILO" ;

    static public final int    ID_GREEK_MEGA = 8;
    static public final String name_ID_GREEK_MEGA = "ID_GREEK_MEGA" ;

    static public final int    ID_GREEK_TERA = 10;
    static public final String name_ID_GREEK_TERA = "ID_GREEK_TERA" ;

    static public final int    ID_GREEK_GIGA = 9;
    static public final String name_ID_GREEK_GIGA = "ID_GREEK_GIGA" ;

    static public final int    ID_PREFER_ENG = 1;
    static public final String name_ID_PREFER_ENG = "ID_PREFER_ENG" ;

    static public final int    ID_PREFER_PCT = 2;
    static public final String name_ID_PREFER_PCT = "ID_PREFER_PCT" ;

    static public final int    ID_PREFER_PU = 3;
    static public final String name_ID_PREFER_PU = "ID_PREFER_PU" ;

    static public final int    ID_DEFAULT_DONTCARE = 0;
    static public final String name_ID_DEFAULT_DONTCARE = "ID_DEFAULT_DONTCARE" ;

    static public final int    ID_DEFAULT_MAG = 1;
    static public final String name_ID_DEFAULT_MAG = "ID_DEFAULT_MAG" ;

    static public final int    ID_DEFAULT_ANG = 2;
    static public final String name_ID_DEFAULT_ANG = "ID_DEFAULT_ANG" ;

    static public final int    ID_DEFAULT_REAL = 3;
    static public final String name_ID_DEFAULT_REAL = "ID_DEFAULT_REAL" ;

    static public final int    ID_DEFAULT_IMAG = 4;
    static public final String name_ID_DEFAULT_IMAG = "ID_DEFAULT_IMAG" ;

    static public final int    ID_DEFAULT_RX = 5;
    static public final String name_ID_DEFAULT_RX = "ID_DEFAULT_RX" ;

    static public final int    ID_TRIG_NONE = 0;
    static public final String name_ID_TRIG_NONE = "ID_TRIG_NONE" ;

    static public final int    ID_TRIG_LOW = 1;
    static public final String name_ID_TRIG_LOW = "ID_TRIG_LOW" ;

    static public final int    ID_TRIG_HIGH = 2;
    static public final String name_ID_TRIG_HIGH = "ID_TRIG_HIGH" ;

    static public final int    ID_TRIG_RATE = 4;
    static public final String name_ID_TRIG_RATE = "ID_TRIG_RATE" ;

    static public final int    ID_TRIG_SHAPE = 8;
    static public final String name_ID_TRIG_SHAPE = "ID_TRIG_SHAPE" ;

    static public final int    ID_TRIG_OTHER = 16;
    static public final String name_ID_TRIG_OTHER = "ID_TRIG_OTHER" ;

    static public final int    ID_XFORMER_TYPE_CT = 2;
    static public final String name_ID_XFORMER_TYPE_CT = "ID_XFORMER_TYPE_CT" ;

    static public final int    ID_XFORMER_TYPE_PT = 1;
    static public final String name_ID_XFORMER_TYPE_PT = "ID_XFORMER_TYPE_PT" ;

    static public final int    ID_TRIGGER_METH_NONE = 0;
    static public final String name_ID_TRIGGER_METH_NONE = "ID_TRIGGER_METH_NONE" ;

    static public final int    ID_TRIGGER_METH_CHANNEL = 1;
    static public final String name_ID_TRIGGER_METH_CHANNEL = "ID_TRIGGER_METH_CHANNEL" ;

    static public final int    ID_TRIGGER_METH_PERIODIC = 2;
    static public final String name_ID_TRIGGER_METH_PERIODIC = "ID_TRIGGER_METH_PERIODIC" ;

    static public final int    ID_TRIGGER_METH_EXTERNAL = 3;
    static public final String name_ID_TRIGGER_METH_EXTERNAL = "ID_TRIGGER_METH_EXTERNAL" ;

    static public final int    ID_TRIGGER_METH_PERIODIC_STATS = 4;
    static public final String name_ID_TRIGGER_METH_PERIODIC_STATS = "ID_TRIGGER_METH_PERIODIC_STATS" ;

    static public final int    ID_QM_NONE = 0;
    static public final String name_ID_QM_NONE = "ID_QM_NONE" ;

    static public final int    ID_QM_VOLTAGE = 1;
    static public final String name_ID_QM_VOLTAGE = "ID_QM_VOLTAGE" ;

    static public final int    ID_QM_CURRENT = 2;
    static public final String name_ID_QM_CURRENT = "ID_QM_CURRENT" ;

    static public final int    ID_QM_POWER = 3;
    static public final String name_ID_QM_POWER = "ID_QM_POWER" ;

    static public final int    ID_QM_ENERGY = 4;
    static public final String name_ID_QM_ENERGY = "ID_QM_ENERGY" ;

    static public final int    ID_QM_TEMPERATURE = 5;
    static public final String name_ID_QM_TEMPERATURE = "ID_QM_TEMPERATURE" ;

    static public final int    ID_QM_PRESSURE = 6;
    static public final String name_ID_QM_PRESSURE = "ID_QM_PRESSURE" ;

    static public final int    ID_QM_CHARGE = 7;
    static public final String name_ID_QM_CHARGE = "ID_QM_CHARGE" ;

    static public final int    ID_QM_EFIELD = 8;
    static public final String name_ID_QM_EFIELD = "ID_QM_EFIELD" ;

    static public final int    ID_QM_MFIELD = 9;
    static public final String name_ID_QM_MFIELD = "ID_QM_MFIELD" ;

    static public final int    ID_QM_VELOCITY = 10;
    static public final String name_ID_QM_VELOCITY = "ID_QM_VELOCITY" ;

    static public final int    ID_QM_BEARING = 11;
    static public final String name_ID_QM_BEARING = "ID_QM_BEARING" ;

    static public final int    ID_QM_FORCE = 12;
    static public final String name_ID_QM_FORCE = "ID_QM_FORCE" ;

    static public final int    ID_QM_TORQUE = 13;
    static public final String name_ID_QM_TORQUE = "ID_QM_TORQUE" ;

    static public final int    ID_QM_POSITION = 14;
    static public final String name_ID_QM_POSITION = "ID_QM_POSITION" ;

    static public final int    ID_QM_FLUXLINKAGE = 15;
    static public final String name_ID_QM_FLUXLINKAGE = "ID_QM_FLUXLINKAGE" ;

    static public final int    ID_QM_FLUXDENSITY = 16;
    static public final String name_ID_QM_FLUXDENSITY = "ID_QM_FLUXDENSITY" ;

    static public final int    ID_QM_STATUS = 17;
    static public final String name_ID_QM_STATUS = "ID_QM_STATUS" ;

    static public final int    ID_CTT_NONE = 0;
    static public final String name_ID_CTT_NONE = "ID_CTT_NONE" ;

    static public final int    ID_CTT_NORMAL_TO_LO = 1;
    static public final String name_ID_CTT_NORMAL_TO_LO = "ID_CTT_NORMAL_TO_LO" ;

    static public final int    ID_CTT_NORMAL_TO_LO_LO = 2;
    static public final String name_ID_CTT_NORMAL_TO_LO_LO = "ID_CTT_NORMAL_TO_LO_LO" ;

    static public final int    ID_CTT_NORMAL_TO_HI = 3;
    static public final String name_ID_CTT_NORMAL_TO_HI = "ID_CTT_NORMAL_TO_HI" ;

    static public final int    ID_CTT_NORMAL_TO_HI_HI = 4;
    static public final String name_ID_CTT_NORMAL_TO_HI_HI = "ID_CTT_NORMAL_TO_HI_HI" ;

    static public final int    ID_CTT_LO_LO_TO_LO = 5;
    static public final String name_ID_CTT_LO_LO_TO_LO = "ID_CTT_LO_LO_TO_LO" ;

    static public final int    ID_CTT_LO_LO_TO_NORMAL = 6;
    static public final String name_ID_CTT_LO_LO_TO_NORMAL = "ID_CTT_LO_LO_TO_NORMAL" ;

    static public final int    ID_CTT_LO_LO_TO_HI = 7;
    static public final String name_ID_CTT_LO_LO_TO_HI = "ID_CTT_LO_LO_TO_HI" ;

    static public final int    ID_CTT_LO_LO_TO_HI_HI = 8;
    static public final String name_ID_CTT_LO_LO_TO_HI_HI = "ID_CTT_LO_LO_TO_HI_HI" ;

    static public final int    ID_CTT_LO_TO_LO_LO = 9;
    static public final String name_ID_CTT_LO_TO_LO_LO = "ID_CTT_LO_TO_LO_LO" ;

    static public final int    ID_CTT_LO_TO_NORMAL = 10;
    static public final String name_ID_CTT_LO_TO_NORMAL = "ID_CTT_LO_TO_NORMAL" ;

    static public final int    ID_CTT_LO_TO_HI = 11;
    static public final String name_ID_CTT_LO_TO_HI = "ID_CTT_LO_TO_HI" ;

    static public final int    ID_CTT_LO_TO_HI_HI = 12;
    static public final String name_ID_CTT_LO_TO_HI_HI = "ID_CTT_LO_TO_HI_HI" ;

    static public final int    ID_CTT_HI_TO_LO_LO = 13;
    static public final String name_ID_CTT_HI_TO_LO_LO = "ID_CTT_HI_TO_LO_LO" ;

    static public final int    ID_CTT_HI_TO_LO = 14;
    static public final String name_ID_CTT_HI_TO_LO = "ID_CTT_HI_TO_LO" ;

    static public final int    ID_CTT_HI_TO_NORMAL = 15;
    static public final String name_ID_CTT_HI_TO_NORMAL = "ID_CTT_HI_TO_NORMAL" ;

    static public final int    ID_CTT_HI_TO_HI_HI = 16;
    static public final String name_ID_CTT_HI_TO_HI_HI = "ID_CTT_HI_TO_HI_HI" ;

    static public final int    ID_CTT_HI_HI_TO_LO_LO = 17;
    static public final String name_ID_CTT_HI_HI_TO_LO_LO = "ID_CTT_HI_HI_TO_LO_LO" ;

    static public final int    ID_CTT_HI_HI_TO_LO = 18;
    static public final String name_ID_CTT_HI_HI_TO_LO = "ID_CTT_HI_HI_TO_LO" ;

    static public final int    ID_CTT_HI_HI_TO_NORMAL = 19;
    static public final String name_ID_CTT_HI_HI_TO_NORMAL = "ID_CTT_HI_HI_TO_NORMAL" ;

    static public final int    ID_CTT_HI_HI_TO_HI = 20;
    static public final String name_ID_CTT_HI_HI_TO_HI = "ID_CTT_HI_HI_TO_HI" ;

    static public final int    ID_CTT_DB_LO = 21;
    static public final String name_ID_CTT_DB_LO = "ID_CTT_DB_LO" ;

    static public final int    ID_CTT_DB_HI = 22;
    static public final String name_ID_CTT_DB_HI = "ID_CTT_DB_HI" ;

    static public final int    ID_CTT_PERIODIC = 23;
    static public final String name_ID_CTT_PERIODIC = "ID_CTT_PERIODIC" ;

    static public final int    ID_CTT_MANUAL = 24;
    static public final String name_ID_CTT_MANUAL = "ID_CTT_MANUAL" ;

    static public final int    ID_CTT_INT_CROSS_TRIG = 25;
    static public final String name_ID_CTT_INT_CROSS_TRIG = "ID_CTT_INT_CROSS_TRIG" ;

    static public final int    ID_CTT_EXT_CROSS_TRIG = 26;
    static public final String name_ID_CTT_EXT_CROSS_TRIG = "ID_CTT_EXT_CROSS_TRIG" ;

    static public final int    ID_CTT_MODULE = 27;
    static public final String name_ID_CTT_MODULE = "ID_CTT_MODULE" ;

    static public final int    ID_CTT_RATE = 28;
    static public final String name_ID_CTT_RATE = "ID_CTT_RATE" ;

    static public final int    ID_SINGLE_PHASE = 1;
    static public final String name_ID_SINGLE_PHASE = "ID_SINGLE_PHASE" ;

    static public final int    ID_2ELEMENT_DELTA = 2;
    static public final String name_ID_2ELEMENT_DELTA = "ID_2ELEMENT_DELTA" ;

    static public final int    ID_2_5ELEMENT_WYE = 3;
    static public final String name_ID_2_5ELEMENT_WYE = "ID_2_5ELEMENT_WYE" ;

    static public final int    ID_3ELMENT_WYE = 4;
    static public final String name_ID_3ELMENT_WYE = "ID_3ELMENT_WYE" ;

    static public final int    ID_3ELEMENT_DELTA = 5;
    static public final String name_ID_3ELEMENT_DELTA = "ID_3ELEMENT_DELTA" ;

    static public final int    ID_SPLIT_PHASE = 6;
    static public final String name_ID_SPLIT_PHASE = "ID_SPLIT_PHASE" ;

    static public final int    ID_2ELEMENT_2PHASE = 7;
    static public final String name_ID_2ELEMENT_2PHASE = "ID_2ELEMENT_2PHASE" ;

  //  GUID constants
    static public final Guid recordSignature = Guid.create(0x4a111440, 0xe49f, 0x11cf, 0x99, 0x00, 0x50, 0x51, 0x44, 0x49, 0x46, 0x00);
    static public final String name_recordSignature = "recordSignature";
    
    static public final Guid tagBlank = Guid.create( 0x89738618, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagBlank = "tagBlank" ;

    static public final Guid tagContainer = Guid.create( 0x89738606, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagContainer = "tagContainer" ;

    static public final Guid tagRecDataSource = Guid.create( 0x89738619, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagRecDataSource = "tagRecDataSource" ;

    static public final Guid tagRecMonitorSettings = Guid.create( 0xb48d858c, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagRecMonitorSettings = "tagRecMonitorSettings" ;

    static public final Guid tagRecObservation = Guid.create( 0x8973861a, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagRecObservation = "tagRecObservation" ;

    static public final Guid tagVersionInfo = Guid.create( 0x89738607, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagVersionInfo = "tagVersionInfo" ;

    static public final Guid tagFileName = Guid.create( 0x89738608, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagFileName = "tagFileName" ;

    static public final Guid tagCreation = Guid.create( 0x89738609, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagCreation = "tagCreation" ;

    static public final Guid tagLastSaved = Guid.create( 0x8973860a, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagLastSaved = "tagLastSaved" ;

    static public final Guid tagTimesSaved = Guid.create( 0x8973860b, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagTimesSaved = "tagTimesSaved" ;

    static public final Guid tagLanguage = Guid.create( 0x8973860c, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagLanguage = "tagLanguage" ;

    static public final Guid tagTitle = Guid.create( 0x8973860d, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagTitle = "tagTitle" ;

    static public final Guid tagSubject = Guid.create( 0x8973860e, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagSubject = "tagSubject" ;

    static public final Guid tagAuthor = Guid.create( 0x8973860f, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagAuthor = "tagAuthor" ;

    static public final Guid tagKeywords = Guid.create( 0x89738610, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagKeywords = "tagKeywords" ;

    static public final Guid tagComments = Guid.create( 0x89738611, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagComments = "tagComments" ;

    static public final Guid tagLastSavedBy = Guid.create( 0x89738612, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagLastSavedBy = "tagLastSavedBy" ;

    static public final Guid tagApplication = Guid.create( 0x89738623, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagApplication = "tagApplication" ;

    static public final Guid tagSecurity = Guid.create( 0x89738613, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagSecurity = "tagSecurity" ;

    static public final Guid tagOwner = Guid.create( 0x89738614, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagOwner = "tagOwner" ;

    static public final Guid tagCopyright = Guid.create( 0x89738615, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagCopyright = "tagCopyright" ;

    static public final Guid tagTrademarks = Guid.create( 0x89738616, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagTrademarks = "tagTrademarks" ;

    static public final Guid tagNotes = Guid.create( 0x89738617, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagNotes = "tagNotes" ;

    static public final Guid tagCompressionStyleID = Guid.create( 0x8973861b, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagCompressionStyleID = "tagCompressionStyleID" ;

    static public final Guid tagCompressionAlgorithmID = Guid.create( 0x8973861c, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagCompressionAlgorithmID = "tagCompressionAlgorithmID" ;

    static public final Guid tagCompressionChecksum = Guid.create( 0x8973861d, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagCompressionChecksum = "tagCompressionChecksum" ;

    static public final Guid tagName = Guid.create( 0xb48d85a2, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagName = "tagName" ;

    static public final Guid tagAddress1 = Guid.create( 0xb48d85a3, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagAddress1 = "tagAddress1" ;

    static public final Guid tagAddress2 = Guid.create( 0xb48d85a4, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagAddress2 = "tagAddress2" ;

    static public final Guid tagCity = Guid.create( 0xb48d85a5, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagCity = "tagCity" ;

    static public final Guid tagState = Guid.create( 0xb48d85a6, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagState = "tagState" ;

    static public final Guid tagPostalCode = Guid.create( 0xb48d85a7, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagPostalCode = "tagPostalCode" ;

    static public final Guid tagCountry = Guid.create( 0xb48d85a8, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagCountry = "tagCountry" ;

    static public final Guid tagPhoneVoice = Guid.create( 0xb48d85a9, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagPhoneVoice = "tagPhoneVoice" ;

    static public final Guid tagPhoneFAX = Guid.create( 0x3d786f80, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagPhoneFAX = "tagPhoneFAX" ;

    static public final Guid tagEMail = Guid.create( 0x3d786f81, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagEMail = "tagEMail" ;

    static public final Guid tagDataSourceTypeID = Guid.create( 0xb48d8581, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagDataSourceTypeID = "tagDataSourceTypeID" ;

    static public final Guid tagVendorID = Guid.create( 0xb48d8582, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagVendorID = "tagVendorID" ;

    static public final Guid tagEquipmentID = Guid.create( 0xb48d8583, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagEquipmentID = "tagEquipmentID" ;

    static public final Guid tagCustomSourceInfo = Guid.create( 0xb48d8584, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagCustomSourceInfo = "tagCustomSourceInfo" ;

    static public final Guid tagSerialNumberDS = Guid.create( 0xb48d8585, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagSerialNumberDS = "tagSerialNumberDS" ;

    static public final Guid tagVersionDS = Guid.create( 0xb48d8586, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagVersionDS = "tagVersionDS" ;

    static public final Guid tagNameDS = Guid.create( 0xb48d8587, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagNameDS = "tagNameDS" ;

    static public final Guid tagOwnerDS = Guid.create( 0xb48d8588, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagOwnerDS = "tagOwnerDS" ;

    static public final Guid tagLocationDS = Guid.create( 0xb48d8589, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagLocationDS = "tagLocationDS" ;

    static public final Guid tagTimeZoneDS = Guid.create( 0xb48d858a, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagTimeZoneDS = "tagTimeZoneDS" ;

    static public final Guid tagCoordinatesDS = Guid.create( 0xb48d858b, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagCoordinatesDS = "tagCoordinatesDS" ;

    static public final Guid tagChannelDefns = Guid.create( 0xb48d858d, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagChannelDefns = "tagChannelDefns" ;

    static public final Guid tagInstrumentTypeID = Guid.create( 0x3d786f82, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagInstrumentTypeID = "tagInstrumentTypeID" ;

    static public final Guid tagInstrumentModelName = Guid.create( 0x3d786f83, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagInstrumentModelName = "tagInstrumentModelName" ;

    static public final Guid tagInstrumentModelNumber = Guid.create( 0x3d786f84, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagInstrumentModelNumber = "tagInstrumentModelNumber" ;

    static public final Guid tagOneChannelDefn = Guid.create( 0xb48d858e, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagOneChannelDefn = "tagOneChannelDefn" ;

    static public final Guid tagChannelName = Guid.create( 0xb48d8590, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagChannelName = "tagChannelName" ;

    static public final Guid tagPhaseID = Guid.create( 0xb48d8591, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagPhaseID = "tagPhaseID" ;

    static public final Guid tagOtherChannelIdentifier = Guid.create( 0xb48d8593, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagOtherChannelIdentifier = "tagOtherChannelIdentifier" ;

    static public final Guid tagGroupName = Guid.create( 0xb48d8594, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagGroupName = "tagGroupName" ;

    static public final Guid tagQuantityTypeID = Guid.create( 0xb48d8592, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagQuantityTypeID = "tagQuantityTypeID" ;

    static public final Guid tagQuantityMeasuredID = Guid.create( 0xc690e872, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagQuantityMeasuredID = "tagQuantityMeasuredID" ;

    static public final Guid tagPhysicalChannel = Guid.create( 0x89738622, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagPhysicalChannel = "tagPhysicalChannel" ;

    static public final Guid tagQuantityName = Guid.create( 0xb48d8595, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagQuantityName = "tagQuantityName" ;

    static public final Guid tagPrimarySeriesIdx = Guid.create( 0xb48d8596, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagPrimarySeriesIdx = "tagPrimarySeriesIdx" ;

    static public final Guid tagSeriesDefns = Guid.create( 0xb48d8598, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagSeriesDefns = "tagSeriesDefns" ;

    static public final Guid tagOneSeriesDefn = Guid.create( 0xb48d859a, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagOneSeriesDefn = "tagOneSeriesDefn" ;

    static public final Guid tagValueTypeID = Guid.create( 0xb48d859c, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagValueTypeID = "tagValueTypeID" ;

    static public final Guid tagQuantityUnitsID = Guid.create( 0xb48d859b, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagQuantityUnitsID = "tagQuantityUnitsID" ;

    static public final Guid tagQuantityCharacteristicID = Guid.create( 0x3d786f9e, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagQuantityCharacteristicID = "tagQuantityCharacteristicID" ;

    static public final Guid tagQuantitySignificantDigitsID = Guid.create( 0xa112f421, 0xb111, 0x11d2, 0x9b, 0x37, 0x0, 0x40, 0x5, 0x2c, 0x2d, 0x28 );
    static public final String  name_tagQuantitySignificantDigitsID = "tagQuantitySignificantDigitsID" ;

    static public final Guid tagQuantityResolutionID = Guid.create( 0xfb228ee0, 0xfc8d, 0x11d2, 0xb4, 0x9a, 0x0, 0x60, 0x8, 0xb3, 0x71, 0x83 );
    static public final String  name_tagQuantityResolutionID = "tagQuantityResolutionID" ;

    static public final Guid tagStorageMethodID = Guid.create( 0xb48d85a1, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagStorageMethodID = "tagStorageMethodID" ;

    static public final Guid tagValueTypeName = Guid.create( 0xb48d859d, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagValueTypeName = "tagValueTypeName" ;

    static public final Guid tagHintGreekPrefixID = Guid.create( 0xb48d859e, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagHintGreekPrefixID = "tagHintGreekPrefixID" ;

    static public final Guid tagHintPreferredUnitsID = Guid.create( 0xb48d859f, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagHintPreferredUnitsID = "tagHintPreferredUnitsID" ;

    static public final Guid tagHintDefaultDisplayID = Guid.create( 0xb48d85a0, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagHintDefaultDisplayID = "tagHintDefaultDisplayID" ;

    static public final Guid tagProbInterval = Guid.create( 0x2747d441, 0x2bd0, 0x11d2, 0xae, 0x42, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_tagProbInterval = "tagProbInterval" ;

    static public final Guid tagProbPercentile = Guid.create( 0x2747d440, 0x2bd0, 0x11d2, 0xae, 0x42, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_tagProbPercentile = "tagProbPercentile" ;

    static public final Guid tagSeriesNominalQuantity = Guid.create( 0xfa118c8, 0xcb4a, 0x11d2, 0xb3, 0xb, 0xfe, 0x25, 0xcb, 0x9a, 0x17, 0x60 );
    static public final String  name_tagSeriesNominalQuantity = "tagSeriesNominalQuantity" ;

    static public final Guid tagEffective = Guid.create( 0x62f28183, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagEffective = "tagEffective" ;

    static public final Guid tagTimeInstalled = Guid.create( 0x3d786f85, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagTimeInstalled = "tagTimeInstalled" ;

    static public final Guid tagTimeRemoved = Guid.create( 0x3d786f86, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagTimeRemoved = "tagTimeRemoved" ;

    static public final Guid tagUseCalibration = Guid.create( 0x62f28180, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagUseCalibration = "tagUseCalibration" ;

    static public final Guid tagUseTransducer = Guid.create( 0x62f28181, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagUseTransducer = "tagUseTransducer" ;

    static public final Guid tagChannelSettingsArray = Guid.create( 0x62f28182, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagChannelSettingsArray = "tagChannelSettingsArray" ;

    static public final Guid tagNominalFrequency = Guid.create( 0xfa118c3, 0xcb4a, 0x11d2, 0xb3, 0xb, 0xfe, 0x25, 0xcb, 0x9a, 0x17, 0x60 );
    static public final String  name_tagNominalFrequency = "tagNominalFrequency" ;

    static public final Guid tagSettingPhysicalConnection = Guid.create( 0x9f256ee0, 0x803b, 0x11d3, 0xb9, 0x2f, 0x0, 0x50, 0xda, 0x2b, 0x1f, 0x4d );
    static public final String  name_tagSettingPhysicalConnection = "tagSettingPhysicalConnection" ;

    static public final Guid tagOneChannelSetting = Guid.create( 0x3d786f9a, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagOneChannelSetting = "tagOneChannelSetting" ;

    static public final Guid tagChannelDefnIdx = Guid.create( 0xb48d858f, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagChannelDefnIdx = "tagChannelDefnIdx" ;

    static public final Guid tagTriggerTypeID = Guid.create( 0x62f28184, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagTriggerTypeID = "tagTriggerTypeID" ;

    static public final Guid tagFullScale = Guid.create( 0x3d786f87, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagFullScale = "tagFullScale" ;

    static public final Guid tagNoiseFloor = Guid.create( 0x3d786f89, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagNoiseFloor = "tagNoiseFloor" ;

    static public final Guid tagTriggerShapeParam = Guid.create( 0x62f28188, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagTriggerShapeParam = "tagTriggerShapeParam" ;

    static public final Guid tagXDTransformerTypeID = Guid.create( 0x62f28189, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagXDTransformerTypeID = "tagXDTransformerTypeID" ;

    static public final Guid tagXDSystemSideRatio = Guid.create( 0x62f2818a, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagXDSystemSideRatio = "tagXDSystemSideRatio" ;

    static public final Guid tagXDMonitorSideRatio = Guid.create( 0x62f2818b, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagXDMonitorSideRatio = "tagXDMonitorSideRatio" ;

    static public final Guid tagXDFrequencyResponse = Guid.create( 0x62f2818c, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagXDFrequencyResponse = "tagXDFrequencyResponse" ;

    static public final Guid tagCalTimeSkew = Guid.create( 0x62f2818d, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagCalTimeSkew = "tagCalTimeSkew" ;

    static public final Guid tagCalOffset = Guid.create( 0x62f2818e, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagCalOffset = "tagCalOffset" ;

    static public final Guid tagCalRatio = Guid.create( 0x62f2818f, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagCalRatio = "tagCalRatio" ;

    static public final Guid tagCalMustUseARCal = Guid.create( 0x62f28190, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagCalMustUseARCal = "tagCalMustUseARCal" ;

    static public final Guid tagCalApplied = Guid.create( 0x62f28191, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagCalApplied = "tagCalApplied" ;

    static public final Guid tagCalRecorded = Guid.create( 0x62f28192, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagCalRecorded = "tagCalRecorded" ;

    static public final Guid tagTriggerHighHigh = Guid.create( 0x5b12f431, 0xff54, 0x11d3, 0xb9, 0x68, 0x0, 0x50, 0xda, 0x2b, 0x1f, 0x4d );
    static public final String  name_tagTriggerHighHigh = "tagTriggerHighHigh" ;

    static public final Guid tagTriggerHigh = Guid.create( 0x62f28186, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagTriggerHigh = "tagTriggerHigh" ;

    static public final Guid tagTriggerLow = Guid.create( 0x62f28185, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagTriggerLow = "tagTriggerLow" ;

    static public final Guid tagTriggerLowLow = Guid.create( 0x5b12f430, 0xff54, 0x11d3, 0xb9, 0x68, 0x0, 0x50, 0xda, 0x2b, 0x1f, 0x4d );
    static public final String  name_tagTriggerLowLow = "tagTriggerLowLow" ;

    static public final Guid tagTriggerDeadBand = Guid.create( 0x5b12f432, 0xff54, 0x11d3, 0xb9, 0x68, 0x0, 0x50, 0xda, 0x2b, 0x1f, 0x4d );
    static public final String  name_tagTriggerDeadBand = "tagTriggerDeadBand" ;

    static public final Guid tagTriggerRate = Guid.create( 0x62f28187, 0xf9c4, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagTriggerRate = "tagTriggerRate" ;

    static public final Guid tagObservationName = Guid.create( 0x3d786f8a, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagObservationName = "tagObservationName" ;

    static public final Guid tagTimeCreate = Guid.create( 0x3d786f8b, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagTimeCreate = "tagTimeCreate" ;

    static public final Guid tagTimeStart = Guid.create( 0x3d786f8c, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagTimeStart = "tagTimeStart" ;

    static public final Guid tagTriggerMethodID = Guid.create( 0x3d786f8d, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagTriggerMethodID = "tagTriggerMethodID" ;

    static public final Guid tagTimeTriggered = Guid.create( 0x3d786f8e, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagTimeTriggered = "tagTimeTriggered" ;

    static public final Guid tagChannelTriggerIdx = Guid.create( 0x3d786f8f, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagChannelTriggerIdx = "tagChannelTriggerIdx" ;

    static public final Guid tagObservationSerial = Guid.create( 0x3d786f90, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagObservationSerial = "tagObservationSerial" ;

    static public final Guid tagObservationAggregationSerial = Guid.create( 0x89738621, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagObservationAggregationSerial = "tagObservationAggregationSerial" ;

    static public final Guid tagDisturbanceCategoryID = Guid.create( 0xb48d8597, 0xf5f5, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagDisturbanceCategoryID = "tagDisturbanceCategoryID" ;

    static public final Guid tagChannelInstances = Guid.create( 0x3d786f91, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagChannelInstances = "tagChannelInstances" ;

    static public final Guid tagCharactDisturbDirection = Guid.create( 0xfa118c0, 0xcb4a, 0x11d2, 0xb3, 0xb, 0xfe, 0x25, 0xcb, 0x9a, 0x17, 0x60 );
    static public final String  name_tagCharactDisturbDirection = "tagCharactDisturbDirection" ;

    static public final Guid tagCharactDisturbDirectionQuality = Guid.create( 0xfa118c1, 0xcb4a, 0x11d2, 0xb3, 0xb, 0xfe, 0x25, 0xcb, 0x9a, 0x17, 0x60 );
    static public final String  name_tagCharactDisturbDirectionQuality = "tagCharactDisturbDirectionQuality" ;

    static public final Guid tagOneChannelInst = Guid.create( 0x3d786f92, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagOneChannelInst = "tagOneChannelInst" ;

    static public final Guid tagCharactDuration = Guid.create( 0x2747d444, 0x2bd0, 0x11d2, 0xae, 0x42, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_tagCharactDuration = "tagCharactDuration" ;

    static public final Guid tagSeriesInstances = Guid.create( 0x3d786f93, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagSeriesInstances = "tagSeriesInstances" ;

    static public final Guid tagCharactMagnitude = Guid.create( 0x2747d443, 0x2bd0, 0x11d2, 0xae, 0x42, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_tagCharactMagnitude = "tagCharactMagnitude" ;

    static public final Guid tagCharactFrequency = Guid.create( 0x2747d445, 0x2bd0, 0x11d2, 0xae, 0x42, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_tagCharactFrequency = "tagCharactFrequency" ;

    static public final Guid tagChanTriggerModuleInfo = Guid.create( 0xfa118c7, 0xcb4a, 0x11d2, 0xb3, 0xb, 0xfe, 0x25, 0xcb, 0x9a, 0x17, 0x60 );
    static public final String  name_tagChanTriggerModuleInfo = "tagChanTriggerModuleInfo" ;

    static public final Guid tagChanTriggerModuleName = Guid.create( 0xfa118c6, 0xcb4a, 0x11d2, 0xb3, 0xb, 0xfe, 0x25, 0xcb, 0x9a, 0x17, 0x60 );
    static public final String  name_tagChanTriggerModuleName = "tagChanTriggerModuleName" ;

    static public final Guid tagCrossTriggerDeviceName = Guid.create( 0xfa118c5, 0xcb4a, 0x11d2, 0xb3, 0xb, 0xfe, 0x25, 0xcb, 0x9a, 0x17, 0x60 );
    static public final String  name_tagCrossTriggerDeviceName = "tagCrossTriggerDeviceName" ;

    static public final Guid tagCrossTriggerChanIdx = Guid.create( 0xfa118c4, 0xcb4a, 0x11d2, 0xb3, 0xb, 0xfe, 0x25, 0xcb, 0x9a, 0x17, 0x60 );
    static public final String  name_tagCrossTriggerChanIdx = "tagCrossTriggerChanIdx" ;

    static public final Guid tagChanTriggerTypeID = Guid.create( 0xfa118c2, 0xcb4a, 0x11d2, 0xb3, 0xb, 0xfe, 0x25, 0xcb, 0x9a, 0x17, 0x60 );
    static public final String  name_tagChanTriggerTypeID = "tagChanTriggerTypeID" ;

    static public final Guid tagChannelFrequency = Guid.create( 0x2747d442, 0x2bd0, 0x11d2, 0xae, 0x42, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_tagChannelFrequency = "tagChannelFrequency" ;

    static public final Guid tagChannelGroupID = Guid.create( 0xf90de218, 0xe67b, 0x4cf1, 0xa2, 0x95, 0xb0, 0x21, 0xa2, 0xd4, 0x67, 0x67 );
    static public final String  name_tagChannelGroupID = "tagChannelGroupID" ;

    static public final Guid tagOneSeriesInstance = Guid.create( 0x3d786f94, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagOneSeriesInstance = "tagOneSeriesInstance" ;

    static public final Guid tagSeriesBaseQuantity = Guid.create( 0x3d786f95, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagSeriesBaseQuantity = "tagSeriesBaseQuantity" ;

    static public final Guid tagSeriesScale = Guid.create( 0x3d786f96, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagSeriesScale = "tagSeriesScale" ;

    static public final Guid tagSeriesOffset = Guid.create( 0x3d786f97, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagSeriesOffset = "tagSeriesOffset" ;

    static public final Guid tagSeriesShareChannelIdx = Guid.create( 0x8973861f, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagSeriesShareChannelIdx = "tagSeriesShareChannelIdx" ;

    static public final Guid tagSeriesShareSeriesIdx = Guid.create( 0x89738620, 0xf1c3, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagSeriesShareSeriesIdx = "tagSeriesShareSeriesIdx" ;

    static public final Guid tagSeriesValues = Guid.create( 0x3d786f99, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_tagSeriesValues = "tagSeriesValues" ;

    static public final Guid ID_DS_TYPE_MEASURE = Guid.create( 0xe6b51730, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_DS_TYPE_MEASURE = "ID_DS_TYPE_MEASURE" ;

    static public final Guid ID_DS_TYPE_MANUAL = Guid.create( 0xe6b51731, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_DS_TYPE_MANUAL = "ID_DS_TYPE_MANUAL" ;

    static public final Guid ID_DS_TYPE_SIMULATE = Guid.create( 0xe6b51732, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_DS_TYPE_SIMULATE = "ID_DS_TYPE_SIMULATE" ;

    static public final Guid ID_DS_TYPE_BENCHMARK = Guid.create( 0xe6b51733, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_DS_TYPE_BENCHMARK = "ID_DS_TYPE_BENCHMARK" ;

    static public final Guid ID_DS_TYPE_DEBUG = Guid.create( 0xe6b51734, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_DS_TYPE_DEBUG = "ID_DS_TYPE_DEBUG" ;

    static public final Guid ID_VENDOR_SATEC = Guid.create( 0xe2da5081, 0x7fdb, 0x11d3, 0x9b, 0x39, 0x0, 0x40, 0x5, 0x2c, 0x2d, 0x28 );
    static public final String  name_ID_VENDOR_SATEC = "ID_VENDOR_SATEC" ;

    static public final Guid ID_VENDOR_WPT = Guid.create( 0xe2da5082, 0x7fdb, 0x11d3, 0x9b, 0x39, 0x0, 0x40, 0x5, 0x2c, 0x2d, 0x28 );
    static public final String  name_ID_VENDOR_WPT = "ID_VENDOR_WPT" ;

    static public final Guid ID_VENDOR_NONE = Guid.create( 0xe6b51701, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_NONE = "ID_VENDOR_NONE" ;

    static public final Guid ID_VENDOR_BMI = Guid.create( 0xe6b51702, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_BMI = "ID_VENDOR_BMI" ;

    static public final Guid ID_VENDOR_BPA = Guid.create( 0xe6b51703, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_BPA = "ID_VENDOR_BPA" ;

    static public final Guid ID_VENDOR_CESI = Guid.create( 0xe6b51704, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_CESI = "ID_VENDOR_CESI" ;

    static public final Guid ID_VENDOR_COOPER = Guid.create( 0xe6b51705, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_COOPER = "ID_VENDOR_COOPER" ;

    static public final Guid ID_VENDOR_DCG = Guid.create( 0xe6b51706, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_DCG = "ID_VENDOR_DCG" ;

    static public final Guid ID_VENDOR_DRANETZ = Guid.create( 0xe6b51707, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_DRANETZ = "ID_VENDOR_DRANETZ" ;

    static public final Guid ID_VENDOR_EDF = Guid.create( 0xe6b51708, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_EDF = "ID_VENDOR_EDF" ;

    static public final Guid ID_VENDOR_EPRI = Guid.create( 0xe6b51709, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_EPRI = "ID_VENDOR_EPRI" ;

    static public final Guid ID_VENDOR_ELECTROTEK = Guid.create( 0xe6b5170a, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_ELECTROTEK = "ID_VENDOR_ELECTROTEK" ;

    static public final Guid ID_VENDOR_FLUKE = Guid.create( 0xe6b5170b, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_FLUKE = "ID_VENDOR_FLUKE" ;

    static public final Guid ID_VENDOR_HYDROQUEBEC = Guid.create( 0xe6b5170c, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_HYDROQUEBEC = "ID_VENDOR_HYDROQUEBEC" ;

    static public final Guid ID_VENDOR_IEEE = Guid.create( 0xe6b5170d, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_IEEE = "ID_VENDOR_IEEE" ;

    static public final Guid ID_VENDOR_KREISSJOHNSON = Guid.create( 0xe6b5170e, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_KREISSJOHNSON = "ID_VENDOR_KREISSJOHNSON" ;

    static public final Guid ID_VENDOR_METROSONIC = Guid.create( 0xe6b5170f, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_METROSONIC = "ID_VENDOR_METROSONIC" ;

    static public final Guid ID_VENDOR_PML = Guid.create( 0xe6b51710, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_PML = "ID_VENDOR_PML" ;

    static public final Guid ID_VENDOR_PSI = Guid.create( 0xe6b51711, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_PSI = "ID_VENDOR_PSI" ;

    static public final Guid ID_VENDOR_PTI = Guid.create( 0xe6b51712, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_PTI = "ID_VENDOR_PTI" ;

    static public final Guid ID_VENDOR_PUBLICDOMAIN = Guid.create( 0xe6b51713, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_PUBLICDOMAIN = "ID_VENDOR_PUBLICDOMAIN" ;

    static public final Guid ID_VENDOR_RPM = Guid.create( 0xe6b51714, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_RPM = "ID_VENDOR_RPM" ;

    static public final Guid ID_VENDOR_SQUAREDPOWERLOGIC = Guid.create( 0xe6b51715, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_SQUAREDPOWERLOGIC = "ID_VENDOR_SQUAREDPOWERLOGIC" ;

    static public final Guid ID_VENDOR_TELOG = Guid.create( 0xe6b51716, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_VENDOR_TELOG = "ID_VENDOR_TELOG" ;

    static public final Guid ID_VENDOR_PMI = Guid.create( 0x609acec0, 0x993d, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_VENDOR_PMI = "ID_VENDOR_PMI" ;

    static public final Guid ID_VENDOR_METONE = Guid.create( 0xb5b5da61, 0xe2e1, 0x11d4, 0x82, 0xd9, 0x0, 0xe0, 0x98, 0x72, 0xa0, 0x94 );
    static public final String  name_ID_VENDOR_METONE = "ID_VENDOR_METONE" ;

    static public final Guid ID_VENDOR_TRINERGI = Guid.create( 0xfd5a3a8, 0xd73a, 0x11d2, 0xac, 0x3e, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_VENDOR_TRINERGI = "ID_VENDOR_TRINERGI" ;

    static public final Guid ID_VENDOR_GE = Guid.create( 0x5202bd00, 0x245c, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_VENDOR_GE = "ID_VENDOR_GE" ;

    static public final Guid ID_VENDOR_LEM = Guid.create( 0x80c4a722, 0x2816, 0x11d4, 0x8a, 0xb4, 0x0, 0x40, 0x5, 0x69, 0x8d, 0x26 );
    static public final String  name_ID_VENDOR_LEM = "ID_VENDOR_LEM" ;

    static public final Guid ID_VENDOR_ACTL = Guid.create( 0x80c4a761, 0x2816, 0x11d4, 0x8a, 0xb4, 0x0, 0x40, 0x5, 0x69, 0x8d, 0x26 );
    static public final String  name_ID_VENDOR_ACTL = "ID_VENDOR_ACTL" ;

    static public final Guid ID_VENDOR_ADVANTECH = Guid.create( 0x650f988f, 0x378c, 0x47b8, 0xba, 0xed, 0xcc, 0xcb, 0x3f, 0x95, 0x9a, 0xd7 );
    static public final String  name_ID_VENDOR_ADVANTECH = "ID_VENDOR_ADVANTECH" ;

    static public final Guid ID_VENDOR_ELCOM = Guid.create( 0xf7e9eb70, 0x6f1d, 0x11d6, 0x9c, 0xb3, 0x0, 0x20, 0xe0, 0x10, 0x45, 0x3b );
    static public final String  name_ID_VENDOR_ELCOM = "ID_VENDOR_ELCOM" ;

    static public final Guid ID_EQUIP_WPT_5530 = Guid.create( 0xe2da5083, 0x7fdb, 0x11d3, 0x9b, 0x39, 0x0, 0x40, 0x5, 0x2c, 0x2d, 0x28 );
    static public final String  name_ID_EQUIP_WPT_5530 = "ID_EQUIP_WPT_5530" ;

    static public final Guid ID_EQUIP_WPT_5540 = Guid.create( 0xe2da5084, 0x7fdb, 0x11d3, 0x9b, 0x39, 0x0, 0x40, 0x5, 0x2c, 0x2d, 0x28 );
    static public final String  name_ID_EQUIP_WPT_5540 = "ID_EQUIP_WPT_5540" ;

    static public final Guid ID_EQUIP_BMI_3100 = Guid.create( 0xf1c04780, 0x50fb, 0x11d3, 0xac, 0x3e, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_EQUIP_BMI_3100 = "ID_EQUIP_BMI_3100" ;

    static public final Guid ID_EQUIP_BMI_7100 = Guid.create( 0xe6b51717, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_BMI_7100 = "ID_EQUIP_BMI_7100" ;

    static public final Guid ID_EQUIP_BMI_8010 = Guid.create( 0xe6b51718, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_BMI_8010 = "ID_EQUIP_BMI_8010" ;

    static public final Guid ID_EQUIP_BMI_8020 = Guid.create( 0xe6b51719, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_BMI_8020 = "ID_EQUIP_BMI_8020" ;

    static public final Guid ID_EQUIP_BMI_9010 = Guid.create( 0xe6b5171a, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_BMI_9010 = "ID_EQUIP_BMI_9010" ;

    static public final Guid ID_EQUIP_COOPER_VHARM = Guid.create( 0xe6b5171b, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_COOPER_VHARM = "ID_EQUIP_COOPER_VHARM" ;

    static public final Guid ID_EQUIP_COOPER_VFLICKER = Guid.create( 0xe6b5171c, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_COOPER_VFLICKER = "ID_EQUIP_COOPER_VFLICKER" ;

    static public final Guid ID_EQUIP_DCG_EMTP = Guid.create( 0xe6b5171d, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_DCG_EMTP = "ID_EQUIP_DCG_EMTP" ;

    static public final Guid ID_EQUIP_DRANETZ_656 = Guid.create( 0xe6b5171e, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_DRANETZ_656 = "ID_EQUIP_DRANETZ_656" ;

    static public final Guid ID_EQUIP_DRANETZ_658 = Guid.create( 0xe6b5171f, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_DRANETZ_658 = "ID_EQUIP_DRANETZ_658" ;

    static public final Guid ID_EQUIP_ETK_TESTPROGRAM = Guid.create( 0xe6b51721, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_ETK_TESTPROGRAM = "ID_EQUIP_ETK_TESTPROGRAM" ;

    static public final Guid ID_EQUIP_DRANETZ_8000 = Guid.create( 0xe6b51720, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_DRANETZ_8000 = "ID_EQUIP_DRANETZ_8000" ;

    static public final Guid ID_EQUIP_ETK_PQDIFEDITOR = Guid.create( 0xe6b51722, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_ETK_PQDIFEDITOR = "ID_EQUIP_ETK_PQDIFEDITOR" ;

    static public final Guid ID_EQUIP_ETK_PASS = Guid.create( 0xe6b51723, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_ETK_PASS = "ID_EQUIP_ETK_PASS" ;

    static public final Guid ID_EQUIP_ETK_SUPERHARM = Guid.create( 0xe6b51724, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_ETK_SUPERHARM = "ID_EQUIP_ETK_SUPERHARM" ;

    static public final Guid ID_EQUIP_ETK_SUPERTRAN = Guid.create( 0xe6b51725, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_ETK_SUPERTRAN = "ID_EQUIP_ETK_SUPERTRAN" ;

    static public final Guid ID_EQUIP_ETK_TOP = Guid.create( 0xe6b51726, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_ETK_TOP = "ID_EQUIP_ETK_TOP" ;

    static public final Guid ID_EQUIP_ETK_PQVIEW = Guid.create( 0xe6b51727, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_ETK_PQVIEW = "ID_EQUIP_ETK_PQVIEW" ;

    static public final Guid ID_EQUIP_ETK_HARMONI = Guid.create( 0xe6b51728, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_ETK_HARMONI = "ID_EQUIP_ETK_HARMONI" ;

    static public final Guid ID_EQUIP_FLUKE_CUR = Guid.create( 0xe6b51729, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_FLUKE_CUR = "ID_EQUIP_FLUKE_CUR" ;

    static public final Guid ID_EQUIP_IEEE_COMTRADE = Guid.create( 0xe6b5172b, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_IEEE_COMTRADE = "ID_EQUIP_IEEE_COMTRADE" ;

    static public final Guid ID_EQUIP_FLUKE_F41 = Guid.create( 0xe6b5172a, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_FLUKE_F41 = "ID_EQUIP_FLUKE_F41" ;

    static public final Guid ID_EQUIP_PUBLIC_ATP = Guid.create( 0xe6b5172c, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_PUBLIC_ATP = "ID_EQUIP_PUBLIC_ATP" ;

    static public final Guid ID_EQUIP_METROSONIC_M1 = Guid.create( 0xe6b5172d, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_METROSONIC_M1 = "ID_EQUIP_METROSONIC_M1" ;

    static public final Guid ID_EQUIP_SQD_SMS = Guid.create( 0xe6b5172e, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_SQD_SMS = "ID_EQUIP_SQD_SMS" ;

    static public final Guid ID_EQUIP_TELOG_M1 = Guid.create( 0xe6b5172f, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_TELOG_M1 = "ID_EQUIP_TELOG_M1" ;

    static public final Guid ID_EQUIP_PML_3710 = Guid.create( 0x85726d0, 0x1dc0, 0x11d0, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_PML_3710 = "ID_EQUIP_PML_3710" ;

    static public final Guid ID_EQUIP_PML_3720 = Guid.create( 0x85726d1, 0x1dc0, 0x11d0, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_PML_3720 = "ID_EQUIP_PML_3720" ;

    static public final Guid ID_EQUIP_PML_3800 = Guid.create( 0x85726d2, 0x1dc0, 0x11d0, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_PML_3800 = "ID_EQUIP_PML_3800" ;

    static public final Guid ID_EQUIP_PML_7300 = Guid.create( 0x85726d3, 0x1dc0, 0x11d0, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_PML_7300 = "ID_EQUIP_PML_7300" ;

    static public final Guid ID_EQUIP_PML_7700 = Guid.create( 0x85726d4, 0x1dc0, 0x11d0, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_PML_7700 = "ID_EQUIP_PML_7700" ;

    static public final Guid ID_EQUIP_PML_VIP = Guid.create( 0x85726d5, 0x1dc0, 0x11d0, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_PML_VIP = "ID_EQUIP_PML_VIP" ;

    static public final Guid ID_EQUIP_PML_LOGSERVER = Guid.create( 0x85726d6, 0x1dc0, 0x11d0, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_EQUIP_PML_LOGSERVER = "ID_EQUIP_PML_LOGSERVER" ;

    static public final Guid ID_EQUIP_METONE_ELT15 = Guid.create( 0xb5b5da62, 0xe2e1, 0x11d4, 0x82, 0xd9, 0x0, 0xe0, 0x98, 0x72, 0xa0, 0x94 );
    static public final String  name_ID_EQUIP_METONE_ELT15 = "ID_EQUIP_METONE_ELT15" ;

    static public final Guid ID_EQUIP_PMI_SCANNER = Guid.create( 0x609acec1, 0x993d, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_EQUIP_PMI_SCANNER = "ID_EQUIP_PMI_SCANNER" ;

    static public final Guid ID_EQUIP_ADVANTECH_ADAM4017 = Guid.create( 0x92b7977b, 0xc02, 0x4766, 0x95, 0xcf, 0xdd, 0x37, 0x9c, 0xae, 0xb4, 0x17 );
    static public final String  name_ID_EQUIP_ADVANTECH_ADAM4017 = "ID_EQUIP_ADVANTECH_ADAM4017" ;

    static public final Guid ID_EQUIP_ETK_DSS = Guid.create( 0xd347ba66, 0xe34c, 0x11d4, 0x82, 0xd9, 0x0, 0xe0, 0x98, 0x72, 0xa0, 0x94 );
    static public final String  name_ID_EQUIP_ETK_DSS = "ID_EQUIP_ETK_DSS" ;

    static public final Guid ID_EQUIP_ADVANTECH_ADAM4018 = Guid.create( 0x3008151e, 0x2317, 0x4405, 0xa5, 0x9e, 0xe7, 0xb3, 0xb2, 0x6, 0x67, 0xa9 );
    static public final String  name_ID_EQUIP_ADVANTECH_ADAM4018 = "ID_EQUIP_ADVANTECH_ADAM4018" ;

    static public final Guid ID_EQUIP_ADVANTECH_ADAM4018M = Guid.create( 0x3a1af807, 0x1347, 0x45f8, 0x96, 0x6a, 0xf4, 0x81, 0xc6, 0xae, 0x20, 0x8e );
    static public final String  name_ID_EQUIP_ADVANTECH_ADAM4018M = "ID_EQUIP_ADVANTECH_ADAM4018M" ;

    static public final Guid ID_EQUIP_ADVANTECH_ADAM4052 = Guid.create( 0x8bba416b, 0xa7ec, 0x4616, 0x8b, 0x8f, 0x59, 0xfe, 0xd7, 0x49, 0x32, 0x3d );
    static public final String  name_ID_EQUIP_ADVANTECH_ADAM4052 = "ID_EQUIP_ADVANTECH_ADAM4052" ;

    static public final Guid ID_EQUIP_BMI_8800 = Guid.create( 0xe77d1a81, 0x1235, 0x11d5, 0xa3, 0x90, 0x0, 0x10, 0xa4, 0x92, 0x4e, 0xcc );
    static public final String  name_ID_EQUIP_BMI_8800 = "ID_EQUIP_BMI_8800" ;

    static public final Guid ID_EQUIP_TRINERGI_PQM = Guid.create( 0xfd5a3aa, 0xd73a, 0x11d2, 0xac, 0x3e, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_EQUIP_TRINERGI_PQM = "ID_EQUIP_TRINERGI_PQM" ;

    static public final Guid ID_EQUIP_MEDCAL = Guid.create( 0xf3bfa0a1, 0xeb87, 0x11d2, 0xac, 0x3e, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_EQUIP_MEDCAL = "ID_EQUIP_MEDCAL" ;

    static public final Guid ID_EQUIP_GE_KV = Guid.create( 0x5202bd01, 0x245c, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_EQUIP_GE_KV = "ID_EQUIP_GE_KV" ;

    static public final Guid ID_EQUIP_GE_KV2 = Guid.create( 0x5202bd03, 0x245c, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_EQUIP_GE_KV2 = "ID_EQUIP_GE_KV2" ;

    static public final Guid ID_EQUIP_ACUMENTRICS_CONTROL = Guid.create( 0x5202bd04, 0x245c, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_EQUIP_ACUMENTRICS_CONTROL = "ID_EQUIP_ACUMENTRICS_CONTROL" ;

    static public final Guid ID_EQUIP_ETK_TEXTPQDIF = Guid.create( 0x5202bd05, 0x245c, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_EQUIP_ETK_TEXTPQDIF = "ID_EQUIP_ETK_TEXTPQDIF" ;

    static public final Guid ID_EQUIP_ETK_PQWEB = Guid.create( 0x5202bd06, 0x245c, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_EQUIP_ETK_PQWEB = "ID_EQUIP_ETK_PQWEB" ;

    static public final Guid ID_EQUIP_QWAVE_POWER_DISTRIBUTION = Guid.create( 0x80c4a723, 0x2816, 0x11d4, 0x8a, 0xb4, 0x0, 0x40, 0x5, 0x69, 0x8d, 0x26 );
    static public final String  name_ID_EQUIP_QWAVE_POWER_DISTRIBUTION = "ID_EQUIP_QWAVE_POWER_DISTRIBUTION" ;

    static public final Guid ID_EQUIP_QWAVE_POWER_TRANSMISSION = Guid.create( 0x80c4a725, 0x2816, 0x11d4, 0x8a, 0xb4, 0x0, 0x40, 0x5, 0x69, 0x8d, 0x26 );
    static public final String  name_ID_EQUIP_QWAVE_POWER_TRANSMISSION = "ID_EQUIP_QWAVE_POWER_TRANSMISSION" ;

    static public final Guid ID_EQUIP_QWAVE_MICRO = Guid.create( 0x80c4a727, 0x2816, 0x11d4, 0x8a, 0xb4, 0x0, 0x40, 0x5, 0x69, 0x8d, 0x26 );
    static public final String  name_ID_EQUIP_QWAVE_MICRO = "ID_EQUIP_QWAVE_MICRO" ;

    static public final Guid ID_EQUIP_QWAVE_TWIN = Guid.create( 0x80c4a728, 0x2816, 0x11d4, 0x8a, 0xb4, 0x0, 0x40, 0x5, 0x69, 0x8d, 0x26 );
    static public final String  name_ID_EQUIP_QWAVE_TWIN = "ID_EQUIP_QWAVE_TWIN" ;

    static public final Guid ID_EQUIP_QWAVE_PREMIUM = Guid.create( 0x80c4a729, 0x2816, 0x11d4, 0x8a, 0xb4, 0x0, 0x40, 0x5, 0x69, 0x8d, 0x26 );
    static public final String  name_ID_EQUIP_QWAVE_PREMIUM = "ID_EQUIP_QWAVE_PREMIUM" ;

    static public final Guid ID_EQUIP_QWAVE_LIGHT = Guid.create( 0x80c4a72a, 0x2816, 0x11d4, 0x8a, 0xb4, 0x0, 0x40, 0x5, 0x69, 0x8d, 0x26 );
    static public final String  name_ID_EQUIP_QWAVE_LIGHT = "ID_EQUIP_QWAVE_LIGHT" ;

    static public final Guid ID_EQUIP_QWAVE_NOMAD = Guid.create( 0x80c4a72b, 0x2816, 0x11d4, 0x8a, 0xb4, 0x0, 0x40, 0x5, 0x69, 0x8d, 0x26 );
    static public final String  name_ID_EQUIP_QWAVE_NOMAD = "ID_EQUIP_QWAVE_NOMAD" ;

    static public final Guid ID_EQUIP_EWON_4000 = Guid.create( 0x80c4a762, 0x2816, 0x11d4, 0x8a, 0xb4, 0x0, 0x40, 0x5, 0x69, 0x8d, 0x26 );
    static public final String  name_ID_EQUIP_EWON_4000 = "ID_EQUIP_EWON_4000" ;

    static public final Guid ID_EQUIP_QUALIMETRE = Guid.create( 0x80c4a764, 0x2816, 0x11d4, 0x8a, 0xb4, 0x0, 0x40, 0x5, 0x69, 0x8d, 0x26 );
    static public final String  name_ID_EQUIP_QUALIMETRE = "ID_EQUIP_QUALIMETRE" ;

    static public final Guid ID_EQUIP_LEM_ANALYST3Q = Guid.create( 0xd567cb71, 0xbcc0, 0x41ee, 0x8e, 0x8c, 0x35, 0x85, 0x15, 0x53, 0xf6, 0x55 );
    static public final String  name_ID_EQUIP_LEM_ANALYST3Q = "ID_EQUIP_LEM_ANALYST3Q" ;

    static public final Guid ID_EQUIP_LEM_ANALYST1Q = Guid.create( 0x477ecb3b, 0x917f, 0x4915, 0xaf, 0x99, 0xa6, 0xc2, 0x9a, 0xc1, 0x87, 0x64 );
    static public final String  name_ID_EQUIP_LEM_ANALYST1Q = "ID_EQUIP_LEM_ANALYST1Q" ;

    static public final Guid ID_EQUIP_LEM_ANALYST2050 = Guid.create( 0x9878ccab, 0xa842, 0x4cac, 0x95, 0xf, 0x6d, 0x47, 0x21, 0x5b, 0xff, 0xdf );
    static public final String  name_ID_EQUIP_LEM_ANALYST2050 = "ID_EQUIP_LEM_ANALYST2050" ;

    static public final Guid ID_EQUIP_LEM_ANALYST2060 = Guid.create( 0x312471a2, 0xb586, 0x491c, 0x85, 0x5a, 0xca, 0x5, 0x45, 0x9a, 0x7e, 0x20 );
    static public final String  name_ID_EQUIP_LEM_ANALYST2060 = "ID_EQUIP_LEM_ANALYST2060" ;

    static public final Guid ID_EQUIP_LEM_MIDGET200 = Guid.create( 0x8449f6b9, 0x10f4, 0x40a7, 0xa1, 0xc3, 0xbe, 0x33, 0x8e, 0xb9, 0x74, 0x22 );
    static public final String  name_ID_EQUIP_LEM_MIDGET200 = "ID_EQUIP_LEM_MIDGET200" ;

    static public final Guid ID_EQUIP_LEM_MBX300 = Guid.create( 0xd4578d61, 0xdf2b, 0x4218, 0xa7, 0xb1, 0x5e, 0xf1, 0xa9, 0xbb, 0x85, 0xfa );
    static public final String  name_ID_EQUIP_LEM_MBX300 = "ID_EQUIP_LEM_MBX300" ;

    static public final Guid ID_EQUIP_LEM_MBX800 = Guid.create( 0x1c14b57a, 0xba25, 0x47fb, 0x88, 0xfa, 0x5f, 0xe5, 0xce, 0xc9, 0x9e, 0x6a );
    static public final String  name_ID_EQUIP_LEM_MBX800 = "ID_EQUIP_LEM_MBX800" ;

    static public final Guid ID_EQUIP_LEM_MBX601 = Guid.create( 0x1f3cda7b, 0x2ce1, 0x4030, 0xa3, 0x90, 0xe3, 0xd4, 0x9c, 0x56, 0x15, 0xd2 );
    static public final String  name_ID_EQUIP_LEM_MBX601 = "ID_EQUIP_LEM_MBX601" ;

    static public final Guid ID_EQUIP_LEM_MBX602 = Guid.create( 0x4a157756, 0x414a, 0x427b, 0x99, 0x32, 0x55, 0x76, 0xe, 0xd5, 0xf7, 0x7 );
    static public final String  name_ID_EQUIP_LEM_MBX602 = "ID_EQUIP_LEM_MBX602" ;

    static public final Guid ID_EQUIP_LEM_MBX603 = Guid.create( 0xf7b4677b, 0xb277, 0x45b5, 0xaa, 0xae, 0x5f, 0xb3, 0x93, 0x41, 0xb3, 0x90 );
    static public final String  name_ID_EQUIP_LEM_MBX603 = "ID_EQUIP_LEM_MBX603" ;

    static public final Guid ID_EQUIP_LEM_MBX686 = Guid.create( 0x40004266, 0xa978, 0x4991, 0x9e, 0xd6, 0xc1, 0xcd, 0x73, 0xf, 0x5b, 0xf5 );
    static public final String  name_ID_EQUIP_LEM_MBX686 = "ID_EQUIP_LEM_MBX686" ;

    static public final Guid ID_EQUIP_LEM_PERMA701 = Guid.create( 0x9b0dfd9d, 0xd4e9, 0x419d, 0xba, 0x10, 0xc1, 0xce, 0xe6, 0xcf, 0x8f, 0x93 );
    static public final String  name_ID_EQUIP_LEM_PERMA701 = "ID_EQUIP_LEM_PERMA701" ;

    static public final Guid ID_EQUIP_LEM_PERMA702 = Guid.create( 0x7f5d62ac, 0x9fab, 0x400f, 0xb5, 0x1a, 0xf0, 0xf3, 0x94, 0x1f, 0xb5, 0xaa );
    static public final String  name_ID_EQUIP_LEM_PERMA702 = "ID_EQUIP_LEM_PERMA702" ;

    static public final Guid ID_EQUIP_LEM_PERMA705 = Guid.create( 0xd85fea9c, 0x14d5, 0x45eb, 0x83, 0x1f, 0xe0, 0x39, 0x73, 0x9, 0x2b, 0xd8 );
    static public final String  name_ID_EQUIP_LEM_PERMA705 = "ID_EQUIP_LEM_PERMA705" ;

    static public final Guid ID_EQUIP_LEM_PERMA706 = Guid.create( 0x16d6bbfc, 0xb5a, 0x4cf0, 0x81, 0xcf, 0x48, 0xa3, 0x10, 0x5e, 0xff, 0x4f );
    static public final String  name_ID_EQUIP_LEM_PERMA706 = "ID_EQUIP_LEM_PERMA706" ;

    static public final Guid ID_EQUIP_LEM_QWAVEMICRO = Guid.create( 0xe0380e52, 0xc205, 0x43a0, 0x9f, 0xf4, 0x76, 0xfb, 0xd6, 0x76, 0x5f, 0x37 );
    static public final String  name_ID_EQUIP_LEM_QWAVEMICRO = "ID_EQUIP_LEM_QWAVEMICRO" ;

    static public final Guid ID_EQUIP_LEM_QWAVENOMAD = Guid.create( 0x165f145d, 0x90c3, 0x4591, 0x95, 0x9a, 0x33, 0xb1, 0x1, 0xd4, 0xbf, 0x8b );
    static public final String  name_ID_EQUIP_LEM_QWAVENOMAD = "ID_EQUIP_LEM_QWAVENOMAD" ;

    static public final Guid ID_EQUIP_LEM_QWAVELIGHT = Guid.create( 0x5198ceb9, 0x4b4e, 0x439c, 0xa1, 0xc0, 0x21, 0x8c, 0x96, 0x3d, 0x6a, 0x9c );
    static public final String  name_ID_EQUIP_LEM_QWAVELIGHT = "ID_EQUIP_LEM_QWAVELIGHT" ;

    static public final Guid ID_EQUIP_LEM_QWAVETWIN = Guid.create( 0x67a42a2d, 0xb831, 0x4222, 0x80, 0x5e, 0xd5, 0xfd, 0xeb, 0xdd, 0x3a, 0x46 );
    static public final String  name_ID_EQUIP_LEM_QWAVETWIN = "ID_EQUIP_LEM_QWAVETWIN" ;

    static public final Guid ID_EQUIP_LEM_QWAVEPOWER_DISTRIBUTION = Guid.create( 0x2401bf48, 0x9db2, 0x46ec, 0xac, 0xde, 0x5d, 0xed, 0xde, 0x25, 0xe5, 0x4e );
    static public final String  name_ID_EQUIP_LEM_QWAVEPOWER_DISTRIBUTION = "ID_EQUIP_LEM_QWAVEPOWER_DISTRIBUTION" ;

    static public final Guid ID_EQUIP_LEM_QWAVEPREMIUM = Guid.create( 0x6b609a29, 0x4a64, 0x4d1c, 0xa6, 0xe3, 0xca, 0xef, 0x94, 0xfa, 0x56, 0xa0 );
    static public final String  name_ID_EQUIP_LEM_QWAVEPREMIUM = "ID_EQUIP_LEM_QWAVEPREMIUM" ;

    static public final Guid ID_EQUIP_LEM_QWAVEPOWER_TRANSPORT = Guid.create( 0xd4422eeb, 0xb1cd, 0x4ba9, 0xa7, 0xc8, 0x5d, 0x14, 0x1d, 0xf4, 0x5, 0x18 );
    static public final String  name_ID_EQUIP_LEM_QWAVEPOWER_TRANSPORT = "ID_EQUIP_LEM_QWAVEPOWER_TRANSPORT" ;

    static public final Guid ID_EQUIP_LEM_TOPASLT = Guid.create( 0x9c46483a, 0x541e, 0x4d66, 0x9c, 0x10, 0xf9, 0x43, 0xab, 0xfc, 0x34, 0x8a );
    static public final String  name_ID_EQUIP_LEM_TOPASLT = "ID_EQUIP_LEM_TOPASLT" ;

    static public final Guid ID_EQUIP_LEM_TOPAS1000 = Guid.create( 0x459b8614, 0x6724, 0x48fb, 0xb5, 0xd4, 0xf1, 0x49, 0xed, 0xc, 0x62, 0xf5 );
    static public final String  name_ID_EQUIP_LEM_TOPAS1000 = "ID_EQUIP_LEM_TOPAS1000" ;

    static public final Guid ID_EQUIP_LEM_TOPAS1019 = Guid.create( 0x7b11408b, 0x9d2c, 0x407c, 0x84, 0xa5, 0x89, 0x44, 0x2, 0x18, 0xdc, 0xf8 );
    static public final String  name_ID_EQUIP_LEM_TOPAS1019 = "ID_EQUIP_LEM_TOPAS1019" ;

    static public final Guid ID_EQUIP_LEM_TOPAS1020 = Guid.create( 0xd1def77d, 0x990f, 0x484e, 0xa1, 0x66, 0xf7, 0x92, 0x11, 0x70, 0xa6, 0x4b );
    static public final String  name_ID_EQUIP_LEM_TOPAS1020 = "ID_EQUIP_LEM_TOPAS1020" ;

    static public final Guid ID_EQUIP_LEM_TOPAS1040 = Guid.create( 0xd3cc1de2, 0x6e6b, 0x4b6e, 0xad, 0x90, 0x10, 0xd6, 0x58, 0x5f, 0x8f, 0xa2 );
    static public final String  name_ID_EQUIP_LEM_TOPAS1040 = "ID_EQUIP_LEM_TOPAS1040" ;

    static public final Guid ID_EQUIP_LEM_BEN5000 = Guid.create( 0xa70e32b1, 0x2f1a, 0x4543, 0xa6, 0x84, 0x78, 0xa4, 0xb5, 0xbe, 0x34, 0xbb );
    static public final String  name_ID_EQUIP_LEM_BEN5000 = "ID_EQUIP_LEM_BEN5000" ;

    static public final Guid ID_EQUIP_LEM_BEN6000 = Guid.create( 0x5a4c1b5, 0x6681, 0x47e6, 0x9f, 0x64, 0x8d, 0xa1, 0x25, 0xdb, 0xec, 0x32 );
    static public final String  name_ID_EQUIP_LEM_BEN6000 = "ID_EQUIP_LEM_BEN6000" ;

    static public final Guid ID_EQUIP_LEM_EWAVE = Guid.create( 0xe46981d5, 0x708d, 0x4822, 0x97, 0xaa, 0xfd, 0xb6, 0xf7, 0x3b, 0x3a, 0xf2 );
    static public final String  name_ID_EQUIP_LEM_EWAVE = "ID_EQUIP_LEM_EWAVE" ;

    static public final Guid ID_EQUIP_LEM_EWON4000 = Guid.create( 0xd4c0895c, 0xfd48, 0x4981, 0x99, 0x7c, 0x9e, 0x70, 0xd8, 0xe, 0xfb, 0x6 );
    static public final String  name_ID_EQUIP_LEM_EWON4000 = "ID_EQUIP_LEM_EWON4000" ;

    static public final Guid ID_EQUIP_WPT_5510 = Guid.create( 0x752871de, 0x583, 0x4d44, 0xa9, 0xae, 0xc5, 0xfa, 0xdc, 0x1, 0x44, 0xac );
    static public final String  name_ID_EQUIP_WPT_5510 = "ID_EQUIP_WPT_5510" ;

    static public final Guid ID_EQUIP_WPT_5520 = Guid.create( 0xb72d289, 0x7645, 0x40b8, 0x94, 0x6e, 0xc3, 0xce, 0x4f, 0x1b, 0xcd, 0x37 );
    static public final String  name_ID_EQUIP_WPT_5520 = "ID_EQUIP_WPT_5520" ;

    static public final Guid ID_EQUIP_WPT_5530T = Guid.create( 0x8f88ea9e, 0x1007, 0x4569, 0xab, 0x47, 0x75, 0x6f, 0x29, 0x2a, 0x23, 0xed );
    static public final String  name_ID_EQUIP_WPT_5530T = "ID_EQUIP_WPT_5530T" ;

    static public final Guid ID_EQUIP_WPT_5560 = Guid.create( 0x5fd9c0ff, 0x4432, 0x41b5, 0x9a, 0x9e, 0x9a, 0x32, 0xba, 0x2c, 0xf0, 0x5 );
    static public final String  name_ID_EQUIP_WPT_5560 = "ID_EQUIP_WPT_5560" ;

    static public final Guid ID_EQUIP_WPT_5590 = Guid.create( 0x2861d5ca, 0x23ac, 0x4a51, 0xa5, 0xa0, 0x49, 0x8d, 0xa6, 0x1d, 0x26, 0xdd );
    static public final String  name_ID_EQUIP_WPT_5590 = "ID_EQUIP_WPT_5590" ;

    static public final Guid ID_EQUIP_ETK_NODECENTER = Guid.create( 0xc52e8460, 0x58b4, 0x4f1a, 0x84, 0x69, 0x69, 0xca, 0x3f, 0xef, 0x9f, 0xf1 );
    static public final String  name_ID_EQUIP_ETK_NODECENTER = "ID_EQUIP_ETK_NODECENTER" ;

    static public final Guid ID_EQUIP_WPT_DRANVIEW = Guid.create( 0x8d97aa1, 0x1719, 0x11d6, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_EQUIP_WPT_DRANVIEW = "ID_EQUIP_WPT_DRANVIEW" ;

    static public final Guid ID_EQUIP_ADVANTECH_ADAM5017 = Guid.create( 0x2f46263c, 0x92ac, 0x4717, 0x8a, 0x8, 0xa6, 0x17, 0x7d, 0xf3, 0xf6, 0x11 );
    static public final String  name_ID_EQUIP_ADVANTECH_ADAM5017 = "ID_EQUIP_ADVANTECH_ADAM5017" ;

    static public final Guid ID_EQUIP_ADVANTECH_ADAM5018 = Guid.create( 0xcc2d3247, 0xfe65, 0x4db6, 0x82, 0x6, 0x50, 0xa, 0x23, 0x15, 0x1b, 0xb2 );
    static public final String  name_ID_EQUIP_ADVANTECH_ADAM5018 = "ID_EQUIP_ADVANTECH_ADAM5018" ;

    static public final Guid ID_EQUIP_ADVANTECH_ADAM5080 = Guid.create( 0x6c37b63c, 0xe770, 0x4b85, 0xbd, 0x32, 0x47, 0x39, 0xd6, 0xeb, 0x98, 0x46 );
    static public final String  name_ID_EQUIP_ADVANTECH_ADAM5080 = "ID_EQUIP_ADVANTECH_ADAM5080" ;

    static public final Guid ID_EQUIP_ADVANTECH_ADAM5052 = Guid.create( 0xe9261dfe, 0x3d44, 0x47e3, 0xac, 0x36, 0x3b, 0x9, 0x7f, 0xaa, 0x8c, 0xda );
    static public final String  name_ID_EQUIP_ADVANTECH_ADAM5052 = "ID_EQUIP_ADVANTECH_ADAM5052" ;

    static public final Guid ID_EQUIP_ADVANTECH_ADAM4050 = Guid.create( 0x9212066d, 0xea65, 0x477e, 0xbf, 0x95, 0xe4, 0xa0, 0x6, 0x6d, 0x25, 0xce );
    static public final String  name_ID_EQUIP_ADVANTECH_ADAM4050 = "ID_EQUIP_ADVANTECH_ADAM4050" ;

    static public final Guid ID_EQUIP_ADVANTECH_ADAM4053 = Guid.create( 0xdc29b83f, 0xbebe, 0x4cf3, 0xb3, 0xfb, 0x0, 0xdc, 0x63, 0x62, 0x6d, 0xd9 );
    static public final String  name_ID_EQUIP_ADVANTECH_ADAM4053 = "ID_EQUIP_ADVANTECH_ADAM4053" ;

    static public final Guid ID_EQUIP_ADVANTECH_ADAM4080 = Guid.create( 0x64fc42c6, 0x3c90, 0x4633, 0x99, 0xdf, 0x2c, 0x60, 0x58, 0x21, 0x4b, 0x72 );
    static public final String  name_ID_EQUIP_ADVANTECH_ADAM4080 = "ID_EQUIP_ADVANTECH_ADAM4080" ;

    static public final Guid ID_EQUIP_ADVANTECH_ADAM5050 = Guid.create( 0xc950a2e3, 0x7a35, 0x440c, 0x86, 0x60, 0x63, 0xf6, 0x11, 0x97, 0x25, 0x19 );
    static public final String  name_ID_EQUIP_ADVANTECH_ADAM5050 = "ID_EQUIP_ADVANTECH_ADAM5050" ;

    static public final Guid ID_EQUIP_ADVANTECH_ADAM5051 = Guid.create( 0xc8f92334, 0xa69b, 0x4856, 0xb2, 0x53, 0xec, 0x24, 0x71, 0xd1, 0x37, 0xd6 );
    static public final String  name_ID_EQUIP_ADVANTECH_ADAM5051 = "ID_EQUIP_ADVANTECH_ADAM5051" ;

    static public final Guid ID_EQUIP_ELCOM_BK550 = Guid.create( 0xf4380a60, 0x6f1d, 0x11d6, 0x9c, 0xb3, 0x0, 0x20, 0xe0, 0x10, 0x45, 0x3b );
    static public final String  name_ID_EQUIP_ELCOM_BK550 = "ID_EQUIP_ELCOM_BK550" ;

    static public final Guid ID_INSTR_TYPE_SCOPE = Guid.create( 0xe6b51735, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_INSTR_TYPE_SCOPE = "ID_INSTR_TYPE_SCOPE" ;

    static public final Guid ID_INSTR_TYPE_FR = Guid.create( 0xe6b51736, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_INSTR_TYPE_FR = "ID_INSTR_TYPE_FR" ;

    static public final Guid ID_INSTR_TYPE_PQM = Guid.create( 0xe6b51737, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_INSTR_TYPE_PQM = "ID_INSTR_TYPE_PQM" ;

    static public final Guid ID_INSTR_TYPE_VR = Guid.create( 0xe6b51738, 0xf747, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_INSTR_TYPE_VR = "ID_INSTR_TYPE_VR" ;

    static public final Guid ID_INSTR_TYPE_SA = Guid.create( 0xc690e871, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_INSTR_TYPE_SA = "ID_INSTR_TYPE_SA" ;

    static public final Guid ID_QT_WAVEFORM = Guid.create( 0x67f6af80, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_QT_WAVEFORM = "ID_QT_WAVEFORM" ;

    static public final Guid ID_QT_VALUELOG = Guid.create( 0x67f6af82, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_QT_VALUELOG = "ID_QT_VALUELOG" ;

    static public final Guid ID_QT_PHASOR = Guid.create( 0x67f6af81, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_QT_PHASOR = "ID_QT_PHASOR" ;

    static public final Guid ID_QT_RESPONSE = Guid.create( 0x67f6af85, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_QT_RESPONSE = "ID_QT_RESPONSE" ;

    static public final Guid ID_QT_FLASH = Guid.create( 0x67f6af83, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_QT_FLASH = "ID_QT_FLASH" ;

    static public final Guid ID_QT_HISTOGRAM = Guid.create( 0x67f6af87, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_QT_HISTOGRAM = "ID_QT_HISTOGRAM" ;

    static public final Guid ID_QT_HISTOGRAM3D = Guid.create( 0x67f6af88, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_QT_HISTOGRAM3D = "ID_QT_HISTOGRAM3D" ;

    static public final Guid ID_QT_CPF = Guid.create( 0x67f6af89, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_QT_CPF = "ID_QT_CPF" ;

    static public final Guid ID_QT_XY = Guid.create( 0x67f6af8a, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_QT_XY = "ID_QT_XY" ;

    static public final Guid ID_QT_MAGDUR = Guid.create( 0x67f6af8b, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_QT_MAGDUR = "ID_QT_MAGDUR" ;

    static public final Guid ID_QT_XYZ = Guid.create( 0x67f6af8c, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_QT_XYZ = "ID_QT_XYZ" ;

    static public final Guid ID_QT_MAGDURTIME = Guid.create( 0x67f6af8d, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_QT_MAGDURTIME = "ID_QT_MAGDURTIME" ;

    static public final Guid ID_QT_MAGDURCOUNT = Guid.create( 0x67f6af8e, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_QT_MAGDURCOUNT = "ID_QT_MAGDURCOUNT" ;

    static public final Guid ID_DISTURB_1159_NONE = Guid.create( 0x67f6af8f, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_DISTURB_1159_NONE = "ID_DISTURB_1159_NONE" ;

    static public final Guid ID_DISTURB_1159_TRANSIENT = Guid.create( 0x67f6af90, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_DISTURB_1159_TRANSIENT = "ID_DISTURB_1159_TRANSIENT" ;

    static public final Guid ID_DISTURB_1159_TRANSIENT_IMPULSIVE = Guid.create( 0xdd56ef60, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_TRANSIENT_IMPULSIVE = "ID_DISTURB_1159_TRANSIENT_IMPULSIVE" ;

    static public final Guid ID_DISTURB_1159_TRANSIENT_IMPULSIVE_NANO = Guid.create( 0xdd56ef61, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_TRANSIENT_IMPULSIVE_NANO = "ID_DISTURB_1159_TRANSIENT_IMPULSIVE_NANO" ;

    static public final Guid ID_DISTURB_1159_TRANSIENT_IMPULSIVE_MICRO = Guid.create( 0xdd56ef63, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_TRANSIENT_IMPULSIVE_MICRO = "ID_DISTURB_1159_TRANSIENT_IMPULSIVE_MICRO" ;

    static public final Guid ID_DISTURB_1159_TRANSIENT_IMPULSIVE_MILLI = Guid.create( 0xdd56ef64, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_TRANSIENT_IMPULSIVE_MILLI = "ID_DISTURB_1159_TRANSIENT_IMPULSIVE_MILLI" ;

    static public final Guid ID_DISTURB_1159_TRANSIENT_OSCILLATORY = Guid.create( 0xdd56ef65, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_TRANSIENT_OSCILLATORY = "ID_DISTURB_1159_TRANSIENT_OSCILLATORY" ;

    static public final Guid ID_DISTURB_1159_TRANSIENT_OSCILLATORY_LOWFREQ = Guid.create( 0xdd56ef66, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_TRANSIENT_OSCILLATORY_LOWFREQ = "ID_DISTURB_1159_TRANSIENT_OSCILLATORY_LOWFREQ" ;

    static public final Guid ID_DISTURB_1159_TRANSIENT_OSCILLATORY_MEDFREQ = Guid.create( 0xdd56ef67, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_TRANSIENT_OSCILLATORY_MEDFREQ = "ID_DISTURB_1159_TRANSIENT_OSCILLATORY_MEDFREQ" ;

    static public final Guid ID_DISTURB_1159_TRANSIENT_OSCILLATORY_HIGHFREQ = Guid.create( 0xdd56ef68, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_TRANSIENT_OSCILLATORY_HIGHFREQ = "ID_DISTURB_1159_TRANSIENT_OSCILLATORY_HIGHFREQ" ;

    static public final Guid ID_DISTURB_1159_SHORTDUR = Guid.create( 0x67f6af91, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_DISTURB_1159_SHORTDUR = "ID_DISTURB_1159_SHORTDUR" ;

    static public final Guid ID_DISTURB_1159_SHORTDUR_INSTANT = Guid.create( 0xdd56ef69, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_SHORTDUR_INSTANT = "ID_DISTURB_1159_SHORTDUR_INSTANT" ;

    static public final Guid ID_DISTURB_1159_SHORTDUR_INSTANT_SAG = Guid.create( 0xdd56ef6a, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_SHORTDUR_INSTANT_SAG = "ID_DISTURB_1159_SHORTDUR_INSTANT_SAG" ;

    static public final Guid ID_DISTURB_1159_SHORTDUR_INSTANT_SWELL = Guid.create( 0xdd56ef6b, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_SHORTDUR_INSTANT_SWELL = "ID_DISTURB_1159_SHORTDUR_INSTANT_SWELL" ;

    static public final Guid ID_DISTURB_1159_SHORTDUR_MOMENT = Guid.create( 0xdd56ef6c, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_SHORTDUR_MOMENT = "ID_DISTURB_1159_SHORTDUR_MOMENT" ;

    static public final Guid ID_DISTURB_1159_SHORTDUR_MOMENT_INTERRUPT = Guid.create( 0xdd56ef6d, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_SHORTDUR_MOMENT_INTERRUPT = "ID_DISTURB_1159_SHORTDUR_MOMENT_INTERRUPT" ;

    static public final Guid ID_DISTURB_1159_SHORTDUR_MOMENT_SAG = Guid.create( 0xdd56ef6e, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_SHORTDUR_MOMENT_SAG = "ID_DISTURB_1159_SHORTDUR_MOMENT_SAG" ;

    static public final Guid ID_DISTURB_1159_SHORTDUR_MOMENT_SWELL = Guid.create( 0xdd56ef6f, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_SHORTDUR_MOMENT_SWELL = "ID_DISTURB_1159_SHORTDUR_MOMENT_SWELL" ;

    static public final Guid ID_DISTURB_1159_SHORTDUR_TEMP = Guid.create( 0xdd56ef70, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_SHORTDUR_TEMP = "ID_DISTURB_1159_SHORTDUR_TEMP" ;

    static public final Guid ID_DISTURB_1159_SHORTDUR_TEMP_INTERRUPT = Guid.create( 0xdd56ef71, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_SHORTDUR_TEMP_INTERRUPT = "ID_DISTURB_1159_SHORTDUR_TEMP_INTERRUPT" ;

    static public final Guid ID_DISTURB_1159_SHORTDUR_TEMP_SAG = Guid.create( 0xdd56ef72, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_SHORTDUR_TEMP_SAG = "ID_DISTURB_1159_SHORTDUR_TEMP_SAG" ;

    static public final Guid ID_DISTURB_1159_SHORTDUR_TEMP_SWELL = Guid.create( 0xdd56ef73, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_SHORTDUR_TEMP_SWELL = "ID_DISTURB_1159_SHORTDUR_TEMP_SWELL" ;

    static public final Guid ID_DISTURB_1159_LONGDUR = Guid.create( 0x67f6af92, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_DISTURB_1159_LONGDUR = "ID_DISTURB_1159_LONGDUR" ;

    static public final Guid ID_DISTURB_1159_LONGDUR_INTERRUPT = Guid.create( 0xdd56ef74, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_LONGDUR_INTERRUPT = "ID_DISTURB_1159_LONGDUR_INTERRUPT" ;

    static public final Guid ID_DISTURB_1159_LONGDUR_SAG = Guid.create( 0xdd56ef75, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_LONGDUR_SAG = "ID_DISTURB_1159_LONGDUR_SAG" ;

    static public final Guid ID_DISTURB_1159_LONGDUR_SWELL = Guid.create( 0xdd56ef76, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_LONGDUR_SWELL = "ID_DISTURB_1159_LONGDUR_SWELL" ;

    static public final Guid ID_DISTURB_1159_IMBALANCE = Guid.create( 0xdd56ef77, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_IMBALANCE = "ID_DISTURB_1159_IMBALANCE" ;

    static public final Guid ID_DISTURB_1159_POWERFREQVARIATION = Guid.create( 0xdd56ef7e, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_POWERFREQVARIATION = "ID_DISTURB_1159_POWERFREQVARIATION" ;

    static public final Guid ID_DISTURB_1159_VOLTAGEFLUCTUATION = Guid.create( 0x67f6af93, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_DISTURB_1159_VOLTAGEFLUCTUATION = "ID_DISTURB_1159_VOLTAGEFLUCTUATION" ;

    static public final Guid ID_DISTURB_1159_WAVEDISTORT = Guid.create( 0x67f6af94, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_DISTURB_1159_WAVEDISTORT = "ID_DISTURB_1159_WAVEDISTORT" ;

    static public final Guid ID_DISTURB_1159_WAVEDISTORT_DCOFFSET = Guid.create( 0xdd56ef78, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_WAVEDISTORT_DCOFFSET = "ID_DISTURB_1159_WAVEDISTORT_DCOFFSET" ;

    static public final Guid ID_DISTURB_1159_WAVEDISTORT_HARMONIC = Guid.create( 0xdd56ef79, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_WAVEDISTORT_HARMONIC = "ID_DISTURB_1159_WAVEDISTORT_HARMONIC" ;

    static public final Guid ID_DISTURB_1159_WAVEDISTORT_INTERHARMONIC = Guid.create( 0xdd56ef7a, 0x7edd, 0x11d2, 0xb3, 0xa, 0x0, 0x60, 0x97, 0x89, 0xd1, 0x93 );
    static public final String  name_ID_DISTURB_1159_WAVEDISTORT_INTERHARMONIC = "ID_DISTURB_1159_WAVEDISTORT_INTERHARMONIC" ;

    static public final Guid ID_DISTURB_1159_WAVEDISTORT_NOTCHING = Guid.create( 0x67f6af95, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_DISTURB_1159_WAVEDISTORT_NOTCHING = "ID_DISTURB_1159_WAVEDISTORT_NOTCHING" ;

    static public final Guid ID_DISTURB_1159_WAVEDISTORT_NOISE = Guid.create( 0x67f6af96, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_DISTURB_1159_WAVEDISTORT_NOISE = "ID_DISTURB_1159_WAVEDISTORT_NOISE" ;

    static public final Guid ID_SERIES_VALUE_TYPE_VAL = Guid.create( 0x67f6af97, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_VAL = "ID_SERIES_VALUE_TYPE_VAL" ;

    static public final Guid ID_SERIES_VALUE_TYPE_TIME = Guid.create( 0xc690e862, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_TIME = "ID_SERIES_VALUE_TYPE_TIME" ;

    static public final Guid ID_SERIES_VALUE_TYPE_MIN = Guid.create( 0x67f6af98, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_MIN = "ID_SERIES_VALUE_TYPE_MIN" ;

    static public final Guid ID_SERIES_VALUE_TYPE_MAX = Guid.create( 0x67f6af99, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_MAX = "ID_SERIES_VALUE_TYPE_MAX" ;

    static public final Guid ID_SERIES_VALUE_TYPE_AVG = Guid.create( 0x67f6af9a, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_AVG = "ID_SERIES_VALUE_TYPE_AVG" ;

    static public final Guid ID_SERIES_VALUE_TYPE_INST = Guid.create( 0x67f6af9b, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_INST = "ID_SERIES_VALUE_TYPE_INST" ;

    static public final Guid ID_SERIES_VALUE_TYPE_PHASEANGLE = Guid.create( 0x3d786f9d, 0xf76e, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_PHASEANGLE = "ID_SERIES_VALUE_TYPE_PHASEANGLE" ;

    static public final Guid ID_SERIES_VALUE_TYPE_PHASEANGLE_MIN = Guid.create( 0xdc762340, 0x3c56, 0x11d2, 0xae, 0x44, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_SERIES_VALUE_TYPE_PHASEANGLE_MIN = "ID_SERIES_VALUE_TYPE_PHASEANGLE_MIN" ;

    static public final Guid ID_SERIES_VALUE_TYPE_PHASEANGLE_MAX = Guid.create( 0xdc762341, 0x3c56, 0x11d2, 0xae, 0x44, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_SERIES_VALUE_TYPE_PHASEANGLE_MAX = "ID_SERIES_VALUE_TYPE_PHASEANGLE_MAX" ;

    static public final Guid ID_SERIES_VALUE_TYPE_PHASEANGLE_AVG = Guid.create( 0xdc762342, 0x3c56, 0x11d2, 0xae, 0x44, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_SERIES_VALUE_TYPE_PHASEANGLE_AVG = "ID_SERIES_VALUE_TYPE_PHASEANGLE_AVG" ;

    static public final Guid ID_SERIES_VALUE_TYPE_AREA = Guid.create( 0xc7825ce0, 0x8ace, 0x11d3, 0xb9, 0x2f, 0x0, 0x50, 0xda, 0x2b, 0x1f, 0x4d );
    static public final String  name_ID_SERIES_VALUE_TYPE_AREA = "ID_SERIES_VALUE_TYPE_AREA" ;

    static public final Guid ID_SERIES_VALUE_TYPE_LATITUDE = Guid.create( 0xc690e864, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_LATITUDE = "ID_SERIES_VALUE_TYPE_LATITUDE" ;

    static public final Guid ID_SERIES_VALUE_TYPE_DURATION = Guid.create( 0xc690e863, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_DURATION = "ID_SERIES_VALUE_TYPE_DURATION" ;

    static public final Guid ID_SERIES_VALUE_TYPE_LONGITUDE = Guid.create( 0xc690e865, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_LONGITUDE = "ID_SERIES_VALUE_TYPE_LONGITUDE" ;

    static public final Guid ID_SERIES_VALUE_TYPE_POLARITY = Guid.create( 0xc690e866, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_POLARITY = "ID_SERIES_VALUE_TYPE_POLARITY" ;

    static public final Guid ID_SERIES_VALUE_TYPE_ELLIPSE = Guid.create( 0xc690e867, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_ELLIPSE = "ID_SERIES_VALUE_TYPE_ELLIPSE" ;

    static public final Guid ID_SERIES_VALUE_TYPE_BINID = Guid.create( 0xc690e869, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_BINID = "ID_SERIES_VALUE_TYPE_BINID" ;

    static public final Guid ID_SERIES_VALUE_TYPE_BINHIGH = Guid.create( 0xc690e86a, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_BINHIGH = "ID_SERIES_VALUE_TYPE_BINHIGH" ;

    static public final Guid ID_SERIES_VALUE_TYPE_BINLOW = Guid.create( 0xc690e86b, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_BINLOW = "ID_SERIES_VALUE_TYPE_BINLOW" ;

    static public final Guid ID_SERIES_VALUE_TYPE_XBINHIGH = Guid.create( 0xc690e86c, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_XBINHIGH = "ID_SERIES_VALUE_TYPE_XBINHIGH" ;

    static public final Guid ID_SERIES_VALUE_TYPE_XBINLOW = Guid.create( 0xc690e86d, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_XBINLOW = "ID_SERIES_VALUE_TYPE_XBINLOW" ;

    static public final Guid ID_SERIES_VALUE_TYPE_YBINHIGH = Guid.create( 0xc690e86e, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_YBINHIGH = "ID_SERIES_VALUE_TYPE_YBINHIGH" ;

    static public final Guid ID_SERIES_VALUE_TYPE_YBINLOW = Guid.create( 0xc690e86f, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_YBINLOW = "ID_SERIES_VALUE_TYPE_YBINLOW" ;

    static public final Guid ID_SERIES_VALUE_TYPE_COUNT = Guid.create( 0xc690e870, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_COUNT = "ID_SERIES_VALUE_TYPE_COUNT" ;

    static public final Guid ID_SERIES_VALUE_TYPE_TRANSITION = Guid.create( 0x5369c260, 0xc347, 0x11d2, 0x92, 0x3f, 0x0, 0x10, 0x4b, 0x2b, 0x84, 0xb1 );
    static public final String  name_ID_SERIES_VALUE_TYPE_TRANSITION = "ID_SERIES_VALUE_TYPE_TRANSITION" ;

    static public final Guid ID_SERIES_VALUE_TYPE_PROB = Guid.create( 0x6763cc71, 0x17d6, 0x11d4, 0x9f, 0x1c, 0x0, 0x20, 0x78, 0xe0, 0xb7, 0x23 );
    static public final String  name_ID_SERIES_VALUE_TYPE_PROB = "ID_SERIES_VALUE_TYPE_PROB" ;

    static public final Guid ID_SERIES_VALUE_TYPE_INTERVAL = Guid.create( 0x72e82a40, 0x336c, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_SERIES_VALUE_TYPE_INTERVAL = "ID_SERIES_VALUE_TYPE_INTERVAL" ;

    static public final Guid ID_SERIES_VALUE_TYPE_STATUS = Guid.create( 0xb82b5c82, 0x55c7, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_SERIES_VALUE_TYPE_STATUS = "ID_SERIES_VALUE_TYPE_STATUS" ;

    static public final Guid ID_SERIES_VALUE_TYPE_P1 = Guid.create( 0x67f6af9c, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_P1 = "ID_SERIES_VALUE_TYPE_P1" ;

    static public final Guid ID_SERIES_VALUE_TYPE_P5 = Guid.create( 0x67f6af9d, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_P5 = "ID_SERIES_VALUE_TYPE_P5" ;

    static public final Guid ID_SERIES_VALUE_TYPE_P10 = Guid.create( 0x67f6af9e, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_P10 = "ID_SERIES_VALUE_TYPE_P10" ;

    static public final Guid ID_SERIES_VALUE_TYPE_P90 = Guid.create( 0x67f6af9f, 0xf753, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_P90 = "ID_SERIES_VALUE_TYPE_P90" ;

    static public final Guid ID_SERIES_VALUE_TYPE_P95 = Guid.create( 0xc690e860, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_P95 = "ID_SERIES_VALUE_TYPE_P95" ;

    static public final Guid ID_SERIES_VALUE_TYPE_P99 = Guid.create( 0xc690e861, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_P99 = "ID_SERIES_VALUE_TYPE_P99" ;

    static public final Guid ID_SERIES_VALUE_TYPE_FREQUENCY = Guid.create( 0xc690e868, 0xf755, 0x11cf, 0x9d, 0x89, 0x0, 0x80, 0xc7, 0x2e, 0x70, 0xa3 );
    static public final String  name_ID_SERIES_VALUE_TYPE_FREQUENCY = "ID_SERIES_VALUE_TYPE_FREQUENCY" ;

    static public final Guid ID_QC_NONE = Guid.create( 0xa6b31adf, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_NONE = "ID_QC_NONE" ;

    static public final Guid ID_QC_INSTANTANEOUS = Guid.create( 0xa6b31add, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_INSTANTANEOUS = "ID_QC_INSTANTANEOUS" ;

    static public final Guid ID_QC_SPECTRA = Guid.create( 0xa6b31ae9, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_SPECTRA = "ID_QC_SPECTRA" ;

    static public final Guid ID_QC_PEAK = Guid.create( 0xa6b31ae2, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_PEAK = "ID_QC_PEAK" ;

    static public final Guid ID_QC_RMS = Guid.create( 0xa6b31ae5, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_RMS = "ID_QC_RMS" ;

    static public final Guid ID_QC_HRMS = Guid.create( 0xa6b31adc, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_HRMS = "ID_QC_HRMS" ;

    static public final Guid ID_QC_FREQUENCY = Guid.create( 0x7ef68af, 0x9ff5, 0x11d2, 0xb3, 0xb, 0x0, 0x60, 0x8, 0xb3, 0x71, 0x83 );
    static public final String  name_ID_QC_FREQUENCY = "ID_QC_FREQUENCY" ;

    static public final Guid ID_QC_TOTAL_THD = Guid.create( 0xa6b31aec, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_TOTAL_THD = "ID_QC_TOTAL_THD" ;

    static public final Guid ID_QC_EVEN_THD = Guid.create( 0xa6b31ad4, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_EVEN_THD = "ID_QC_EVEN_THD" ;

    static public final Guid ID_QC_ODD_THD = Guid.create( 0xa6b31ae0, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_ODD_THD = "ID_QC_ODD_THD" ;

    static public final Guid ID_QC_CREST_FACTOR = Guid.create( 0xa6b31ad2, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_CREST_FACTOR = "ID_QC_CREST_FACTOR" ;

    static public final Guid ID_QC_FORM_FACTOR = Guid.create( 0xa6b31adb, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_FORM_FACTOR = "ID_QC_FORM_FACTOR" ;

    static public final Guid ID_QC_ARITH_SUM = Guid.create( 0xa6b31ad0, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_ARITH_SUM = "ID_QC_ARITH_SUM" ;

    static public final Guid ID_QC_S0S1 = Guid.create( 0xa6b31ae7, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_S0S1 = "ID_QC_S0S1" ;

    static public final Guid ID_QC_S2S1 = Guid.create( 0xa6b31ae8, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_S2S1 = "ID_QC_S2S1" ;

    static public final Guid ID_QC_SPOS = Guid.create( 0xa6b31aea, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_SPOS = "ID_QC_SPOS" ;

    static public final Guid ID_QC_SNEG = Guid.create( 0xd71a4b91, 0x3c92, 0x11d4, 0x9f, 0x2c, 0x0, 0x20, 0x78, 0xe0, 0xb7, 0x23 );
    static public final String  name_ID_QC_SNEG = "ID_QC_SNEG" ;

    static public final Guid ID_QC_SZERO = Guid.create( 0xd71a4b92, 0x3c92, 0x11d4, 0x9f, 0x2c, 0x0, 0x20, 0x78, 0xe0, 0xb7, 0x23 );
    static public final String  name_ID_QC_SZERO = "ID_QC_SZERO" ;

    static public final Guid ID_QC_AVG_IMBAL = Guid.create( 0xa6b31ad1, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_AVG_IMBAL = "ID_QC_AVG_IMBAL" ;

    static public final Guid ID_QC_TOTAL_THD_RMS = Guid.create( 0xf3d216e0, 0x2aa5, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_TOTAL_THD_RMS = "ID_QC_TOTAL_THD_RMS" ;

    static public final Guid ID_QC_ODD_THD_RMS = Guid.create( 0xf3d216e1, 0x2aa5, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_ODD_THD_RMS = "ID_QC_ODD_THD_RMS" ;

    static public final Guid ID_QC_EVEN_THD_RMS = Guid.create( 0xf3d216e2, 0x2aa5, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_EVEN_THD_RMS = "ID_QC_EVEN_THD_RMS" ;

    static public final Guid ID_QC_TID = Guid.create( 0xf3d216e3, 0x2aa5, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_TID = "ID_QC_TID" ;

    static public final Guid ID_QC_TID_RMS = Guid.create( 0xf3d216e4, 0x2aa5, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_TID_RMS = "ID_QC_TID_RMS" ;

    static public final Guid ID_QC_IHRMS = Guid.create( 0xf3d216e5, 0x2aa5, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_IHRMS = "ID_QC_IHRMS" ;

    static public final Guid ID_QC_SPECTRA_HGROUP = Guid.create( 0x53be6ba8, 0x789, 0x455b, 0x9a, 0x95, 0xda, 0x12, 0x86, 0x83, 0xdd, 0xa7 );
    static public final String  name_ID_QC_SPECTRA_HGROUP = "ID_QC_SPECTRA_HGROUP" ;

    static public final Guid ID_QC_SPECTRA_IGROUP = Guid.create( 0x5e51e006, 0x9c95, 0x4c5e, 0x87, 0x8f, 0x7c, 0xa8, 0x7c, 0xd, 0x2a, 0xe );
    static public final String  name_ID_QC_SPECTRA_IGROUP = "ID_QC_SPECTRA_IGROUP" ;

    static public final Guid ID_QC_TIF = Guid.create( 0xa6b31aeb, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_TIF = "ID_QC_TIF" ;

    static public final Guid ID_QC_FLKR_MAG_AVG = Guid.create( 0xa6b31ad6, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_FLKR_MAG_AVG = "ID_QC_FLKR_MAG_AVG" ;

    static public final Guid ID_QC_FLKR_MAX_DVV = Guid.create( 0xa6b31ad8, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_FLKR_MAX_DVV = "ID_QC_FLKR_MAX_DVV" ;

    static public final Guid ID_QC_FLKR_FREQ_MAX = Guid.create( 0xa6b31ad5, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_FLKR_FREQ_MAX = "ID_QC_FLKR_FREQ_MAX" ;

    static public final Guid ID_QC_FLKR_MAG_MAX = Guid.create( 0xa6b31ad7, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_FLKR_MAG_MAX = "ID_QC_FLKR_MAG_MAX" ;

    static public final Guid ID_QC_FLKR_WGT_AVG = Guid.create( 0xa6b31ada, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_FLKR_WGT_AVG = "ID_QC_FLKR_WGT_AVG" ;

    static public final Guid ID_QC_FLKR_SPECTRUM = Guid.create( 0xa6b31ad9, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_FLKR_SPECTRUM = "ID_QC_FLKR_SPECTRUM" ;

    static public final Guid ID_QC_FLKR_PST = Guid.create( 0x515bf320, 0x71ca, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_FLKR_PST = "ID_QC_FLKR_PST" ;

    static public final Guid ID_QC_FLKR_PLT = Guid.create( 0x515bf321, 0x71ca, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_FLKR_PLT = "ID_QC_FLKR_PLT" ;

    static public final Guid ID_QC_TIF_RMS = Guid.create( 0xf3d216e6, 0x2aa5, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_TIF_RMS = "ID_QC_TIF_RMS" ;

    static public final Guid ID_QC_FLKR_PLTSLIDE = Guid.create( 0x2257ec05, 0x6ea, 0x4709, 0xb4, 0x3a, 0xc, 0x0, 0x53, 0x4d, 0x55, 0x4a );
    static public final String  name_ID_QC_FLKR_PLTSLIDE = "ID_QC_FLKR_PLTSLIDE" ;

    static public final Guid ID_QC_FLKR_PILPF = Guid.create( 0x4d693eec, 0x5d1d, 0x4531, 0x99, 0x3a, 0x79, 0x3b, 0x53, 0x56, 0xc6, 0x3d );
    static public final String  name_ID_QC_FLKR_PILPF = "ID_QC_FLKR_PILPF" ;

    static public final Guid ID_QC_FLKR_PIMAX = Guid.create( 0x126de61c, 0x6691, 0x4d16, 0x8f, 0xdf, 0x46, 0x48, 0x2b, 0xca, 0x46, 0x94 );
    static public final String  name_ID_QC_FLKR_PIMAX = "ID_QC_FLKR_PIMAX" ;

    static public final Guid ID_QC_FLKR_PIROOT = Guid.create( 0xe065b621, 0xffdb, 0x4598, 0x93, 0x30, 0x4d, 0x9, 0x35, 0x39, 0x88, 0xb6 );
    static public final String  name_ID_QC_FLKR_PIROOT = "ID_QC_FLKR_PIROOT" ;

    static public final Guid ID_QC_FLKR_PIROOTLPF = Guid.create( 0x7d11f283, 0x1ce7, 0x4e58, 0x8a, 0xf0, 0x79, 0x4, 0x87, 0x93, 0xb8, 0xa7 );
    static public final String  name_ID_QC_FLKR_PIROOTLPF = "ID_QC_FLKR_PIROOTLPF" ;

    static public final Guid ID_QC_IT = Guid.create( 0xa6b31ade, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_IT = "ID_QC_IT" ;

    static public final Guid ID_QC_RMS_DEMAND = Guid.create( 0x7ef68a0, 0x9ff5, 0x11d2, 0xb3, 0xb, 0x0, 0x60, 0x8, 0xb3, 0x71, 0x83 );
    static public final String  name_ID_QC_RMS_DEMAND = "ID_QC_RMS_DEMAND" ;

    static public final Guid ID_QC_ANSI_TDF = Guid.create( 0x8786ca10, 0x9113, 0x11d3, 0xb9, 0x30, 0x0, 0x50, 0xda, 0x2b, 0x1f, 0x4d );
    static public final String  name_ID_QC_ANSI_TDF = "ID_QC_ANSI_TDF" ;

    static public final Guid ID_QC_K_FACTOR = Guid.create( 0x8786ca11, 0x9113, 0x11d3, 0xb9, 0x30, 0x0, 0x50, 0xda, 0x2b, 0x1f, 0x4d );
    static public final String  name_ID_QC_K_FACTOR = "ID_QC_K_FACTOR" ;

    static public final Guid ID_QC_TDD = Guid.create( 0xf3d216e7, 0x2aa5, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_TDD = "ID_QC_TDD" ;

    static public final Guid ID_QC_RMS_PEAK_DEMAND = Guid.create( 0x72e82a44, 0x336c, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_RMS_PEAK_DEMAND = "ID_QC_RMS_PEAK_DEMAND" ;

    static public final Guid ID_QC_P = Guid.create( 0xa6b31ae1, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_P = "ID_QC_P" ;

    static public final Guid ID_QC_Q = Guid.create( 0xa6b31ae4, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_Q = "ID_QC_Q" ;

    static public final Guid ID_QC_S = Guid.create( 0xa6b31ae6, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_S = "ID_QC_S" ;

    static public final Guid ID_QC_PF = Guid.create( 0xa6b31ae3, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_PF = "ID_QC_PF" ;

    static public final Guid ID_QC_DF = Guid.create( 0xa6b31ad3, 0xb451, 0x11d1, 0xae, 0x17, 0x0, 0x60, 0x8, 0x3a, 0x26, 0x28 );
    static public final String  name_ID_QC_DF = "ID_QC_DF" ;

    static public final Guid ID_QC_P_DEMAND = Guid.create( 0x7ef68a1, 0x9ff5, 0x11d2, 0xb3, 0xb, 0x0, 0x60, 0x8, 0xb3, 0x71, 0x83 );
    static public final String  name_ID_QC_P_DEMAND = "ID_QC_P_DEMAND" ;

    static public final Guid ID_QC_Q_DEMAND = Guid.create( 0x7ef68a2, 0x9ff5, 0x11d2, 0xb3, 0xb, 0x0, 0x60, 0x8, 0xb3, 0x71, 0x83 );
    static public final String  name_ID_QC_Q_DEMAND = "ID_QC_Q_DEMAND" ;

    static public final Guid ID_QC_S_DEMAND = Guid.create( 0x7ef68a3, 0x9ff5, 0x11d2, 0xb3, 0xb, 0x0, 0x60, 0x8, 0xb3, 0x71, 0x83 );
    static public final String  name_ID_QC_S_DEMAND = "ID_QC_S_DEMAND" ;

    static public final Guid ID_QC_DF_DEMAND = Guid.create( 0x7ef68a4, 0x9ff5, 0x11d2, 0xb3, 0xb, 0x0, 0x60, 0x8, 0xb3, 0x71, 0x83 );
    static public final String  name_ID_QC_DF_DEMAND = "ID_QC_DF_DEMAND" ;

    static public final Guid ID_QC_PF_DEMAND = Guid.create( 0x7ef68a5, 0x9ff5, 0x11d2, 0xb3, 0xb, 0x0, 0x60, 0x8, 0xb3, 0x71, 0x83 );
    static public final String  name_ID_QC_PF_DEMAND = "ID_QC_PF_DEMAND" ;

    static public final Guid ID_QC_P_PRED_DEMAND = Guid.create( 0x672d0305, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_P_PRED_DEMAND = "ID_QC_P_PRED_DEMAND" ;

    static public final Guid ID_QC_Q_PRED_DEMAND = Guid.create( 0x672d0306, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_Q_PRED_DEMAND = "ID_QC_Q_PRED_DEMAND" ;

    static public final Guid ID_QC_S_PRED_DEMAND = Guid.create( 0x672d0307, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_S_PRED_DEMAND = "ID_QC_S_PRED_DEMAND" ;

    static public final Guid ID_QC_P_CO_Q_DEMAND = Guid.create( 0x672d030a, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_P_CO_Q_DEMAND = "ID_QC_P_CO_Q_DEMAND" ;

    static public final Guid ID_QC_P_CO_S_DEMAND = Guid.create( 0x672d030b, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_P_CO_S_DEMAND = "ID_QC_P_CO_S_DEMAND" ;

    static public final Guid ID_QC_Q_CO_P_DEMAND = Guid.create( 0x672d030d, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_Q_CO_P_DEMAND = "ID_QC_Q_CO_P_DEMAND" ;

    static public final Guid ID_QC_Q_CO_S_DEMAND = Guid.create( 0x672d030e, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_Q_CO_S_DEMAND = "ID_QC_Q_CO_S_DEMAND" ;

    static public final Guid ID_QC_DF_CO_S_DEMAND = Guid.create( 0x7ef68ad, 0x9ff5, 0x11d2, 0xb3, 0xb, 0x0, 0x60, 0x8, 0xb3, 0x71, 0x83 );
    static public final String  name_ID_QC_DF_CO_S_DEMAND = "ID_QC_DF_CO_S_DEMAND" ;

    static public final Guid ID_QC_PF_CO_S_DEMAND = Guid.create( 0x7ef68ae, 0x9ff5, 0x11d2, 0xb3, 0xb, 0x0, 0x60, 0x8, 0xb3, 0x71, 0x83 );
    static public final String  name_ID_QC_PF_CO_S_DEMAND = "ID_QC_PF_CO_S_DEMAND" ;

    static public final Guid ID_QC_PF_CO_P_DEMAND = Guid.create( 0x672d0308, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_PF_CO_P_DEMAND = "ID_QC_PF_CO_P_DEMAND" ;

    static public final Guid ID_QC_PF_CO_Q_DEMAND = Guid.create( 0x672d0309, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_PF_CO_Q_DEMAND = "ID_QC_PF_CO_Q_DEMAND" ;

    static public final Guid ID_QC_ANGLE_FUND = Guid.create( 0x672d030f, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_ANGLE_FUND = "ID_QC_ANGLE_FUND" ;

    static public final Guid ID_QC_Q_FUND = Guid.create( 0x672d0310, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_Q_FUND = "ID_QC_Q_FUND" ;

    static public final Guid ID_QC_PF_VECTOR = Guid.create( 0x672d0311, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_PF_VECTOR = "ID_QC_PF_VECTOR" ;

    static public final Guid ID_QC_DF_VECTOR = Guid.create( 0x672d0312, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_DF_VECTOR = "ID_QC_DF_VECTOR" ;

    static public final Guid ID_QC_S_VECTOR = Guid.create( 0x672d0314, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_S_VECTOR = "ID_QC_S_VECTOR" ;

    static public final Guid ID_QC_S_VECTOR_FUND = Guid.create( 0x672d0315, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_S_VECTOR_FUND = "ID_QC_S_VECTOR_FUND" ;

    static public final Guid ID_QC_S_FUND = Guid.create( 0x672d0316, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_S_FUND = "ID_QC_S_FUND" ;

    static public final Guid ID_QC_S_CO_P_DEMAND = Guid.create( 0x672d0317, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_S_CO_P_DEMAND = "ID_QC_S_CO_P_DEMAND" ;

    static public final Guid ID_QC_S_CO_Q_DEMAND = Guid.create( 0x672d0318, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_S_CO_Q_DEMAND = "ID_QC_S_CO_Q_DEMAND" ;

    static public final Guid ID_QC_PF_ARITH = Guid.create( 0x1c39fb00, 0xa6aa, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_PF_ARITH = "ID_QC_PF_ARITH" ;

    static public final Guid ID_QC_DF_ARITH = Guid.create( 0x1c39fb01, 0xa6aa, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_DF_ARITH = "ID_QC_DF_ARITH" ;

    static public final Guid ID_QC_S_ARITH = Guid.create( 0x1c39fb02, 0xa6aa, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_S_ARITH = "ID_QC_S_ARITH" ;

    static public final Guid ID_QC_S_ARITH_FUND = Guid.create( 0x1c39fb03, 0xa6aa, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_S_ARITH_FUND = "ID_QC_S_ARITH_FUND" ;

    static public final Guid ID_QC_S_PEAK_DEMAND = Guid.create( 0x72e82a43, 0x336c, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_S_PEAK_DEMAND = "ID_QC_S_PEAK_DEMAND" ;

    static public final Guid ID_QC_Q_PEAK_DEMAND = Guid.create( 0x72e82a42, 0x336c, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_Q_PEAK_DEMAND = "ID_QC_Q_PEAK_DEMAND" ;

    static public final Guid ID_QC_P_PEAK_DEMAND = Guid.create( 0x72e82a41, 0x336c, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_P_PEAK_DEMAND = "ID_QC_P_PEAK_DEMAND" ;

    static public final Guid ID_QC_P_HARMONIC = Guid.create( 0xb82b5c80, 0x55c7, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_P_HARMONIC = "ID_QC_P_HARMONIC" ;

    static public final Guid ID_QC_P_HARMONIC_UNSIGNED = Guid.create( 0xb82b5c81, 0x55c7, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_P_HARMONIC_UNSIGNED = "ID_QC_P_HARMONIC_UNSIGNED" ;

    static public final Guid ID_QC_P_FUND = Guid.create( 0x1cdda475, 0x1ebb, 0x42d8, 0x80, 0x87, 0xd0, 0x1b, 0xb, 0x5c, 0xfa, 0x97 );
    static public final String  name_ID_QC_P_FUND = "ID_QC_P_FUND" ;

    static public final Guid ID_QC_P_INTG = Guid.create( 0x7ef68a6, 0x9ff5, 0x11d2, 0xb3, 0xb, 0x0, 0x60, 0x8, 0xb3, 0x71, 0x83 );
    static public final String  name_ID_QC_P_INTG = "ID_QC_P_INTG" ;

    static public final Guid ID_QC_P_INTG_POS = Guid.create( 0x7ef68a7, 0x9ff5, 0x11d2, 0xb3, 0xb, 0x0, 0x60, 0x8, 0xb3, 0x71, 0x83 );
    static public final String  name_ID_QC_P_INTG_POS = "ID_QC_P_INTG_POS" ;

    static public final Guid ID_QC_P_INTG_POS_FUND = Guid.create( 0x672d0300, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_P_INTG_POS_FUND = "ID_QC_P_INTG_POS_FUND" ;

    static public final Guid ID_QC_P_INTG_NEG = Guid.create( 0x7ef68a8, 0x9ff5, 0x11d2, 0xb3, 0xb, 0x0, 0x60, 0x8, 0xb3, 0x71, 0x83 );
    static public final String  name_ID_QC_P_INTG_NEG = "ID_QC_P_INTG_NEG" ;

    static public final Guid ID_QC_P_INTG_NEG_FUND = Guid.create( 0x672d0301, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_P_INTG_NEG_FUND = "ID_QC_P_INTG_NEG_FUND" ;

    static public final Guid ID_QC_Q_INTG = Guid.create( 0x7ef68a9, 0x9ff5, 0x11d2, 0xb3, 0xb, 0x0, 0x60, 0x8, 0xb3, 0x71, 0x83 );
    static public final String  name_ID_QC_Q_INTG = "ID_QC_Q_INTG" ;

    static public final Guid ID_QC_Q_INTG_POS = Guid.create( 0x7ef68aa, 0x9ff5, 0x11d2, 0xb3, 0xb, 0x0, 0x60, 0x8, 0xb3, 0x71, 0x83 );
    static public final String  name_ID_QC_Q_INTG_POS = "ID_QC_Q_INTG_POS" ;

    static public final Guid ID_QC_Q_INTG_POS_FUND = Guid.create( 0x672d0303, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_Q_INTG_POS_FUND = "ID_QC_Q_INTG_POS_FUND" ;

    static public final Guid ID_QC_Q_INTG_NEG_FUND = Guid.create( 0x672d0304, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_Q_INTG_NEG_FUND = "ID_QC_Q_INTG_NEG_FUND" ;

    static public final Guid ID_QC_Q_INTG_NEG = Guid.create( 0x7ef68ab, 0x9ff5, 0x11d2, 0xb3, 0xb, 0x0, 0x60, 0x8, 0xb3, 0x71, 0x83 );
    static public final String  name_ID_QC_Q_INTG_NEG = "ID_QC_Q_INTG_NEG" ;

    static public final Guid ID_QC_S_INTG = Guid.create( 0x7ef68ac, 0x9ff5, 0x11d2, 0xb3, 0xb, 0x0, 0x60, 0x8, 0xb3, 0x71, 0x83 );
    static public final String  name_ID_QC_S_INTG = "ID_QC_S_INTG" ;

    static public final Guid ID_QC_S_INTG_FUND = Guid.create( 0x672d0313, 0x7810, 0x11d4, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_S_INTG_FUND = "ID_QC_S_INTG_FUND" ;

    static public final Guid ID_QC_P_IVL_INTG = Guid.create( 0xf098a9a0, 0x3ee4, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_P_IVL_INTG = "ID_QC_P_IVL_INTG" ;

    static public final Guid ID_QC_P_IVL_INTG_POS = Guid.create( 0xf098a9a1, 0x3ee4, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_P_IVL_INTG_POS = "ID_QC_P_IVL_INTG_POS" ;

    static public final Guid ID_QC_P_IVL_INTG_POS_FUND = Guid.create( 0xf098a9a2, 0x3ee4, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_P_IVL_INTG_POS_FUND = "ID_QC_P_IVL_INTG_POS_FUND" ;

    static public final Guid ID_QC_P_IVL_INTG_NEG = Guid.create( 0xf098a9a3, 0x3ee4, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_P_IVL_INTG_NEG = "ID_QC_P_IVL_INTG_NEG" ;

    static public final Guid ID_QC_P_IVL_INTG_NEG_FUND = Guid.create( 0xf098a9a4, 0x3ee4, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_P_IVL_INTG_NEG_FUND = "ID_QC_P_IVL_INTG_NEG_FUND" ;

    static public final Guid ID_QC_Q_IVL_INTG = Guid.create( 0xf098a9a5, 0x3ee4, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_Q_IVL_INTG = "ID_QC_Q_IVL_INTG" ;

    static public final Guid ID_QC_Q_IVL_INTG_POS = Guid.create( 0xf098a9a6, 0x3ee4, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_Q_IVL_INTG_POS = "ID_QC_Q_IVL_INTG_POS" ;

    static public final Guid ID_QC_Q_IVL_INTG_POS_FUND = Guid.create( 0xf098a9a7, 0x3ee4, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_Q_IVL_INTG_POS_FUND = "ID_QC_Q_IVL_INTG_POS_FUND" ;

    static public final Guid ID_QC_Q_IVL_INTG_NEG_FUND = Guid.create( 0xf098a9a8, 0x3ee4, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_Q_IVL_INTG_NEG_FUND = "ID_QC_Q_IVL_INTG_NEG_FUND" ;

    static public final Guid ID_QC_Q_IVL_INTG_NEG = Guid.create( 0xf098a9a9, 0x3ee4, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_Q_IVL_INTG_NEG = "ID_QC_Q_IVL_INTG_NEG" ;

    static public final Guid ID_QC_S_IVL_INTG = Guid.create( 0xf098a9aa, 0x3ee4, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_S_IVL_INTG = "ID_QC_S_IVL_INTG" ;

    static public final Guid ID_QC_S_IVL_INTG_FUND = Guid.create( 0xf098a9ab, 0x3ee4, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_S_IVL_INTG_FUND = "ID_QC_S_IVL_INTG_FUND" ;

    static public final Guid ID_QC_DAXISFIELD = Guid.create( 0xd347ba65, 0xe34c, 0x11d4, 0x82, 0xd9, 0x0, 0xe0, 0x98, 0x72, 0xa0, 0x94 );
    static public final String  name_ID_QC_DAXISFIELD = "ID_QC_DAXISFIELD" ;

    static public final Guid ID_QC_QAXIS = Guid.create( 0xd347ba64, 0xe34c, 0x11d4, 0x82, 0xd9, 0x0, 0xe0, 0x98, 0x72, 0xa0, 0x94 );
    static public final String  name_ID_QC_QAXIS = "ID_QC_QAXIS" ;

    static public final Guid ID_QC_ROTATIONAL = Guid.create( 0xd347ba62, 0xe34c, 0x11d4, 0x82, 0xd9, 0x0, 0xe0, 0x98, 0x72, 0xa0, 0x94 );
    static public final String  name_ID_QC_ROTATIONAL = "ID_QC_ROTATIONAL" ;

    static public final Guid ID_QC_DAXIS = Guid.create( 0xd347ba63, 0xe34c, 0x11d4, 0x82, 0xd9, 0x0, 0xe0, 0x98, 0x72, 0xa0, 0x94 );
    static public final String  name_ID_QC_DAXIS = "ID_QC_DAXIS" ;

    static public final Guid ID_QC_LINEAR = Guid.create( 0xd347ba61, 0xe34c, 0x11d4, 0x82, 0xd9, 0x0, 0xe0, 0x98, 0x72, 0xa0, 0x94 );
    static public final String  name_ID_QC_LINEAR = "ID_QC_LINEAR" ;

    static public final Guid ID_QC_TRANSFERFUNC = Guid.create( 0x5202bd07, 0x245c, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_TRANSFERFUNC = "ID_QC_TRANSFERFUNC" ;

    static public final Guid ID_QC_STATUS = Guid.create( 0xb82b5c83, 0x55c7, 0x11d5, 0xa4, 0xb3, 0x44, 0x45, 0x53, 0x54, 0x0, 0x0 );
    static public final String  name_ID_QC_STATUS = "ID_QC_STATUS" ;


/**  Returns the name of the specified GUID (tag or ID). */
    static public final String getNameGUID( Guid value )
    {
        if( value.equals( tagBlank ) )
            return name_tagBlank;
        if( value.equals( tagContainer ) )
            return name_tagContainer;
        if( value.equals( tagRecDataSource ) )
            return name_tagRecDataSource;
        if( value.equals( tagRecMonitorSettings ) )
            return name_tagRecMonitorSettings;
        if( value.equals( tagRecObservation ) )
            return name_tagRecObservation;
        if( value.equals( tagVersionInfo ) )
            return name_tagVersionInfo;
        if( value.equals( tagFileName ) )
            return name_tagFileName;
        if( value.equals( tagCreation ) )
            return name_tagCreation;
        if( value.equals( tagLastSaved ) )
            return name_tagLastSaved;
        if( value.equals( tagTimesSaved ) )
            return name_tagTimesSaved;
        if( value.equals( tagLanguage ) )
            return name_tagLanguage;
        if( value.equals( tagTitle ) )
            return name_tagTitle;
        if( value.equals( tagSubject ) )
            return name_tagSubject;
        if( value.equals( tagAuthor ) )
            return name_tagAuthor;
        if( value.equals( tagKeywords ) )
            return name_tagKeywords;
        if( value.equals( tagComments ) )
            return name_tagComments;
        if( value.equals( tagLastSavedBy ) )
            return name_tagLastSavedBy;
        if( value.equals( tagApplication ) )
            return name_tagApplication;
        if( value.equals( tagSecurity ) )
            return name_tagSecurity;
        if( value.equals( tagOwner ) )
            return name_tagOwner;
        if( value.equals( tagCopyright ) )
            return name_tagCopyright;
        if( value.equals( tagTrademarks ) )
            return name_tagTrademarks;
        if( value.equals( tagNotes ) )
            return name_tagNotes;
        if( value.equals( tagCompressionStyleID ) )
            return name_tagCompressionStyleID;
        if( value.equals( tagCompressionAlgorithmID ) )
            return name_tagCompressionAlgorithmID;
        if( value.equals( tagCompressionChecksum ) )
            return name_tagCompressionChecksum;
        if( value.equals( tagName ) )
            return name_tagName;
        if( value.equals( tagAddress1 ) )
            return name_tagAddress1;
        if( value.equals( tagAddress2 ) )
            return name_tagAddress2;
        if( value.equals( tagCity ) )
            return name_tagCity;
        if( value.equals( tagState ) )
            return name_tagState;
        if( value.equals( tagPostalCode ) )
            return name_tagPostalCode;
        if( value.equals( tagCountry ) )
            return name_tagCountry;
        if( value.equals( tagPhoneVoice ) )
            return name_tagPhoneVoice;
        if( value.equals( tagPhoneFAX ) )
            return name_tagPhoneFAX;
        if( value.equals( tagEMail ) )
            return name_tagEMail;
        if( value.equals( tagDataSourceTypeID ) )
            return name_tagDataSourceTypeID;
        if( value.equals( tagVendorID ) )
            return name_tagVendorID;
        if( value.equals( tagEquipmentID ) )
            return name_tagEquipmentID;
        if( value.equals( tagCustomSourceInfo ) )
            return name_tagCustomSourceInfo;
        if( value.equals( tagSerialNumberDS ) )
            return name_tagSerialNumberDS;
        if( value.equals( tagVersionDS ) )
            return name_tagVersionDS;
        if( value.equals( tagNameDS ) )
            return name_tagNameDS;
        if( value.equals( tagOwnerDS ) )
            return name_tagOwnerDS;
        if( value.equals( tagLocationDS ) )
            return name_tagLocationDS;
        if( value.equals( tagTimeZoneDS ) )
            return name_tagTimeZoneDS;
        if( value.equals( tagCoordinatesDS ) )
            return name_tagCoordinatesDS;
        if( value.equals( tagChannelDefns ) )
            return name_tagChannelDefns;
        if( value.equals( tagInstrumentTypeID ) )
            return name_tagInstrumentTypeID;
        if( value.equals( tagInstrumentModelName ) )
            return name_tagInstrumentModelName;
        if( value.equals( tagInstrumentModelNumber ) )
            return name_tagInstrumentModelNumber;
        if( value.equals( tagOneChannelDefn ) )
            return name_tagOneChannelDefn;
        if( value.equals( tagChannelName ) )
            return name_tagChannelName;
        if( value.equals( tagPhaseID ) )
            return name_tagPhaseID;
        if( value.equals( tagOtherChannelIdentifier ) )
            return name_tagOtherChannelIdentifier;
        if( value.equals( tagGroupName ) )
            return name_tagGroupName;
        if( value.equals( tagQuantityTypeID ) )
            return name_tagQuantityTypeID;
        if( value.equals( tagQuantityMeasuredID ) )
            return name_tagQuantityMeasuredID;
        if( value.equals( tagPhysicalChannel ) )
            return name_tagPhysicalChannel;
        if( value.equals( tagQuantityName ) )
            return name_tagQuantityName;
        if( value.equals( tagPrimarySeriesIdx ) )
            return name_tagPrimarySeriesIdx;
        if( value.equals( tagSeriesDefns ) )
            return name_tagSeriesDefns;
        if( value.equals( tagOneSeriesDefn ) )
            return name_tagOneSeriesDefn;
        if( value.equals( tagValueTypeID ) )
            return name_tagValueTypeID;
        if( value.equals( tagQuantityUnitsID ) )
            return name_tagQuantityUnitsID;
        if( value.equals( tagQuantityCharacteristicID ) )
            return name_tagQuantityCharacteristicID;
        if( value.equals( tagQuantitySignificantDigitsID ) )
            return name_tagQuantitySignificantDigitsID;
        if( value.equals( tagQuantityResolutionID ) )
            return name_tagQuantityResolutionID;
        if( value.equals( tagStorageMethodID ) )
            return name_tagStorageMethodID;
        if( value.equals( tagValueTypeName ) )
            return name_tagValueTypeName;
        if( value.equals( tagHintGreekPrefixID ) )
            return name_tagHintGreekPrefixID;
        if( value.equals( tagHintPreferredUnitsID ) )
            return name_tagHintPreferredUnitsID;
        if( value.equals( tagHintDefaultDisplayID ) )
            return name_tagHintDefaultDisplayID;
        if( value.equals( tagProbInterval ) )
            return name_tagProbInterval;
        if( value.equals( tagProbPercentile ) )
            return name_tagProbPercentile;
        if( value.equals( tagSeriesNominalQuantity ) )
            return name_tagSeriesNominalQuantity;
        if( value.equals( tagEffective ) )
            return name_tagEffective;
        if( value.equals( tagTimeInstalled ) )
            return name_tagTimeInstalled;
        if( value.equals( tagTimeRemoved ) )
            return name_tagTimeRemoved;
        if( value.equals( tagUseCalibration ) )
            return name_tagUseCalibration;
        if( value.equals( tagUseTransducer ) )
            return name_tagUseTransducer;
        if( value.equals( tagChannelSettingsArray ) )
            return name_tagChannelSettingsArray;
        if( value.equals( tagNominalFrequency ) )
            return name_tagNominalFrequency;
        if( value.equals( tagSettingPhysicalConnection ) )
            return name_tagSettingPhysicalConnection;
        if( value.equals( tagOneChannelSetting ) )
            return name_tagOneChannelSetting;
        if( value.equals( tagChannelDefnIdx ) )
            return name_tagChannelDefnIdx;
        if( value.equals( tagTriggerTypeID ) )
            return name_tagTriggerTypeID;
        if( value.equals( tagFullScale ) )
            return name_tagFullScale;
        if( value.equals( tagNoiseFloor ) )
            return name_tagNoiseFloor;
        if( value.equals( tagTriggerShapeParam ) )
            return name_tagTriggerShapeParam;
        if( value.equals( tagXDTransformerTypeID ) )
            return name_tagXDTransformerTypeID;
        if( value.equals( tagXDSystemSideRatio ) )
            return name_tagXDSystemSideRatio;
        if( value.equals( tagXDMonitorSideRatio ) )
            return name_tagXDMonitorSideRatio;
        if( value.equals( tagXDFrequencyResponse ) )
            return name_tagXDFrequencyResponse;
        if( value.equals( tagCalTimeSkew ) )
            return name_tagCalTimeSkew;
        if( value.equals( tagCalOffset ) )
            return name_tagCalOffset;
        if( value.equals( tagCalRatio ) )
            return name_tagCalRatio;
        if( value.equals( tagCalMustUseARCal ) )
            return name_tagCalMustUseARCal;
        if( value.equals( tagCalApplied ) )
            return name_tagCalApplied;
        if( value.equals( tagCalRecorded ) )
            return name_tagCalRecorded;
        if( value.equals( tagTriggerHighHigh ) )
            return name_tagTriggerHighHigh;
        if( value.equals( tagTriggerHigh ) )
            return name_tagTriggerHigh;
        if( value.equals( tagTriggerLow ) )
            return name_tagTriggerLow;
        if( value.equals( tagTriggerLowLow ) )
            return name_tagTriggerLowLow;
        if( value.equals( tagTriggerDeadBand ) )
            return name_tagTriggerDeadBand;
        if( value.equals( tagTriggerRate ) )
            return name_tagTriggerRate;
        if( value.equals( tagObservationName ) )
            return name_tagObservationName;
        if( value.equals( tagTimeCreate ) )
            return name_tagTimeCreate;
        if( value.equals( tagTimeStart ) )
            return name_tagTimeStart;
        if( value.equals( tagTriggerMethodID ) )
            return name_tagTriggerMethodID;
        if( value.equals( tagTimeTriggered ) )
            return name_tagTimeTriggered;
        if( value.equals( tagChannelTriggerIdx ) )
            return name_tagChannelTriggerIdx;
        if( value.equals( tagObservationSerial ) )
            return name_tagObservationSerial;
        if( value.equals( tagObservationAggregationSerial ) )
            return name_tagObservationAggregationSerial;
        if( value.equals( tagDisturbanceCategoryID ) )
            return name_tagDisturbanceCategoryID;
        if( value.equals( tagChannelInstances ) )
            return name_tagChannelInstances;
        if( value.equals( tagCharactDisturbDirection ) )
            return name_tagCharactDisturbDirection;
        if( value.equals( tagCharactDisturbDirectionQuality ) )
            return name_tagCharactDisturbDirectionQuality;
        if( value.equals( tagOneChannelInst ) )
            return name_tagOneChannelInst;
        if( value.equals( tagCharactDuration ) )
            return name_tagCharactDuration;
        if( value.equals( tagSeriesInstances ) )
            return name_tagSeriesInstances;
        if( value.equals( tagCharactMagnitude ) )
            return name_tagCharactMagnitude;
        if( value.equals( tagCharactFrequency ) )
            return name_tagCharactFrequency;
        if( value.equals( tagChanTriggerModuleInfo ) )
            return name_tagChanTriggerModuleInfo;
        if( value.equals( tagChanTriggerModuleName ) )
            return name_tagChanTriggerModuleName;
        if( value.equals( tagCrossTriggerDeviceName ) )
            return name_tagCrossTriggerDeviceName;
        if( value.equals( tagCrossTriggerChanIdx ) )
            return name_tagCrossTriggerChanIdx;
        if( value.equals( tagChanTriggerTypeID ) )
            return name_tagChanTriggerTypeID;
        if( value.equals( tagChannelFrequency ) )
            return name_tagChannelFrequency;
        if( value.equals( tagChannelGroupID ) )
            return name_tagChannelGroupID;
        if( value.equals( tagOneSeriesInstance ) )
            return name_tagOneSeriesInstance;
        if( value.equals( tagSeriesBaseQuantity ) )
            return name_tagSeriesBaseQuantity;
        if( value.equals( tagSeriesScale ) )
            return name_tagSeriesScale;
        if( value.equals( tagSeriesOffset ) )
            return name_tagSeriesOffset;
        if( value.equals( tagSeriesShareChannelIdx ) )
            return name_tagSeriesShareChannelIdx;
        if( value.equals( tagSeriesShareSeriesIdx ) )
            return name_tagSeriesShareSeriesIdx;
        if( value.equals( tagSeriesValues ) )
            return name_tagSeriesValues;
        if( value.equals( ID_DS_TYPE_MEASURE ) )
            return name_ID_DS_TYPE_MEASURE;
        if( value.equals( ID_DS_TYPE_MANUAL ) )
            return name_ID_DS_TYPE_MANUAL;
        if( value.equals( ID_DS_TYPE_SIMULATE ) )
            return name_ID_DS_TYPE_SIMULATE;
        if( value.equals( ID_DS_TYPE_BENCHMARK ) )
            return name_ID_DS_TYPE_BENCHMARK;
        if( value.equals( ID_DS_TYPE_DEBUG ) )
            return name_ID_DS_TYPE_DEBUG;
        if( value.equals( ID_VENDOR_SATEC ) )
            return name_ID_VENDOR_SATEC;
        if( value.equals( ID_VENDOR_WPT ) )
            return name_ID_VENDOR_WPT;
        if( value.equals( ID_VENDOR_NONE ) )
            return name_ID_VENDOR_NONE;
        if( value.equals( ID_VENDOR_BMI ) )
            return name_ID_VENDOR_BMI;
        if( value.equals( ID_VENDOR_BPA ) )
            return name_ID_VENDOR_BPA;
        if( value.equals( ID_VENDOR_CESI ) )
            return name_ID_VENDOR_CESI;
        if( value.equals( ID_VENDOR_COOPER ) )
            return name_ID_VENDOR_COOPER;
        if( value.equals( ID_VENDOR_DCG ) )
            return name_ID_VENDOR_DCG;
        if( value.equals( ID_VENDOR_DRANETZ ) )
            return name_ID_VENDOR_DRANETZ;
        if( value.equals( ID_VENDOR_EDF ) )
            return name_ID_VENDOR_EDF;
        if( value.equals( ID_VENDOR_EPRI ) )
            return name_ID_VENDOR_EPRI;
        if( value.equals( ID_VENDOR_ELECTROTEK ) )
            return name_ID_VENDOR_ELECTROTEK;
        if( value.equals( ID_VENDOR_FLUKE ) )
            return name_ID_VENDOR_FLUKE;
        if( value.equals( ID_VENDOR_HYDROQUEBEC ) )
            return name_ID_VENDOR_HYDROQUEBEC;
        if( value.equals( ID_VENDOR_IEEE ) )
            return name_ID_VENDOR_IEEE;
        if( value.equals( ID_VENDOR_KREISSJOHNSON ) )
            return name_ID_VENDOR_KREISSJOHNSON;
        if( value.equals( ID_VENDOR_METROSONIC ) )
            return name_ID_VENDOR_METROSONIC;
        if( value.equals( ID_VENDOR_PML ) )
            return name_ID_VENDOR_PML;
        if( value.equals( ID_VENDOR_PSI ) )
            return name_ID_VENDOR_PSI;
        if( value.equals( ID_VENDOR_PTI ) )
            return name_ID_VENDOR_PTI;
        if( value.equals( ID_VENDOR_PUBLICDOMAIN ) )
            return name_ID_VENDOR_PUBLICDOMAIN;
        if( value.equals( ID_VENDOR_RPM ) )
            return name_ID_VENDOR_RPM;
        if( value.equals( ID_VENDOR_SQUAREDPOWERLOGIC ) )
            return name_ID_VENDOR_SQUAREDPOWERLOGIC;
        if( value.equals( ID_VENDOR_TELOG ) )
            return name_ID_VENDOR_TELOG;
        if( value.equals( ID_VENDOR_PMI ) )
            return name_ID_VENDOR_PMI;
        if( value.equals( ID_VENDOR_METONE ) )
            return name_ID_VENDOR_METONE;
        if( value.equals( ID_VENDOR_TRINERGI ) )
            return name_ID_VENDOR_TRINERGI;
        if( value.equals( ID_VENDOR_GE ) )
            return name_ID_VENDOR_GE;
        if( value.equals( ID_VENDOR_LEM ) )
            return name_ID_VENDOR_LEM;
        if( value.equals( ID_VENDOR_ACTL ) )
            return name_ID_VENDOR_ACTL;
        if( value.equals( ID_VENDOR_ADVANTECH ) )
            return name_ID_VENDOR_ADVANTECH;
        if( value.equals( ID_VENDOR_ELCOM ) )
            return name_ID_VENDOR_ELCOM;
        if( value.equals( ID_EQUIP_WPT_5530 ) )
            return name_ID_EQUIP_WPT_5530;
        if( value.equals( ID_EQUIP_WPT_5540 ) )
            return name_ID_EQUIP_WPT_5540;
        if( value.equals( ID_EQUIP_BMI_3100 ) )
            return name_ID_EQUIP_BMI_3100;
        if( value.equals( ID_EQUIP_BMI_7100 ) )
            return name_ID_EQUIP_BMI_7100;
        if( value.equals( ID_EQUIP_BMI_8010 ) )
            return name_ID_EQUIP_BMI_8010;
        if( value.equals( ID_EQUIP_BMI_8020 ) )
            return name_ID_EQUIP_BMI_8020;
        if( value.equals( ID_EQUIP_BMI_9010 ) )
            return name_ID_EQUIP_BMI_9010;
        if( value.equals( ID_EQUIP_COOPER_VHARM ) )
            return name_ID_EQUIP_COOPER_VHARM;
        if( value.equals( ID_EQUIP_COOPER_VFLICKER ) )
            return name_ID_EQUIP_COOPER_VFLICKER;
        if( value.equals( ID_EQUIP_DCG_EMTP ) )
            return name_ID_EQUIP_DCG_EMTP;
        if( value.equals( ID_EQUIP_DRANETZ_656 ) )
            return name_ID_EQUIP_DRANETZ_656;
        if( value.equals( ID_EQUIP_DRANETZ_658 ) )
            return name_ID_EQUIP_DRANETZ_658;
        if( value.equals( ID_EQUIP_ETK_TESTPROGRAM ) )
            return name_ID_EQUIP_ETK_TESTPROGRAM;
        if( value.equals( ID_EQUIP_DRANETZ_8000 ) )
            return name_ID_EQUIP_DRANETZ_8000;
        if( value.equals( ID_EQUIP_ETK_PQDIFEDITOR ) )
            return name_ID_EQUIP_ETK_PQDIFEDITOR;
        if( value.equals( ID_EQUIP_ETK_PASS ) )
            return name_ID_EQUIP_ETK_PASS;
        if( value.equals( ID_EQUIP_ETK_SUPERHARM ) )
            return name_ID_EQUIP_ETK_SUPERHARM;
        if( value.equals( ID_EQUIP_ETK_SUPERTRAN ) )
            return name_ID_EQUIP_ETK_SUPERTRAN;
        if( value.equals( ID_EQUIP_ETK_TOP ) )
            return name_ID_EQUIP_ETK_TOP;
        if( value.equals( ID_EQUIP_ETK_PQVIEW ) )
            return name_ID_EQUIP_ETK_PQVIEW;
        if( value.equals( ID_EQUIP_ETK_HARMONI ) )
            return name_ID_EQUIP_ETK_HARMONI;
        if( value.equals( ID_EQUIP_FLUKE_CUR ) )
            return name_ID_EQUIP_FLUKE_CUR;
        if( value.equals( ID_EQUIP_IEEE_COMTRADE ) )
            return name_ID_EQUIP_IEEE_COMTRADE;
        if( value.equals( ID_EQUIP_FLUKE_F41 ) )
            return name_ID_EQUIP_FLUKE_F41;
        if( value.equals( ID_EQUIP_PUBLIC_ATP ) )
            return name_ID_EQUIP_PUBLIC_ATP;
        if( value.equals( ID_EQUIP_METROSONIC_M1 ) )
            return name_ID_EQUIP_METROSONIC_M1;
        if( value.equals( ID_EQUIP_SQD_SMS ) )
            return name_ID_EQUIP_SQD_SMS;
        if( value.equals( ID_EQUIP_TELOG_M1 ) )
            return name_ID_EQUIP_TELOG_M1;
        if( value.equals( ID_EQUIP_PML_3710 ) )
            return name_ID_EQUIP_PML_3710;
        if( value.equals( ID_EQUIP_PML_3720 ) )
            return name_ID_EQUIP_PML_3720;
        if( value.equals( ID_EQUIP_PML_3800 ) )
            return name_ID_EQUIP_PML_3800;
        if( value.equals( ID_EQUIP_PML_7300 ) )
            return name_ID_EQUIP_PML_7300;
        if( value.equals( ID_EQUIP_PML_7700 ) )
            return name_ID_EQUIP_PML_7700;
        if( value.equals( ID_EQUIP_PML_VIP ) )
            return name_ID_EQUIP_PML_VIP;
        if( value.equals( ID_EQUIP_PML_LOGSERVER ) )
            return name_ID_EQUIP_PML_LOGSERVER;
        if( value.equals( ID_EQUIP_METONE_ELT15 ) )
            return name_ID_EQUIP_METONE_ELT15;
        if( value.equals( ID_EQUIP_PMI_SCANNER ) )
            return name_ID_EQUIP_PMI_SCANNER;
        if( value.equals( ID_EQUIP_ADVANTECH_ADAM4017 ) )
            return name_ID_EQUIP_ADVANTECH_ADAM4017;
        if( value.equals( ID_EQUIP_ETK_DSS ) )
            return name_ID_EQUIP_ETK_DSS;
        if( value.equals( ID_EQUIP_ADVANTECH_ADAM4018 ) )
            return name_ID_EQUIP_ADVANTECH_ADAM4018;
        if( value.equals( ID_EQUIP_ADVANTECH_ADAM4018M ) )
            return name_ID_EQUIP_ADVANTECH_ADAM4018M;
        if( value.equals( ID_EQUIP_ADVANTECH_ADAM4052 ) )
            return name_ID_EQUIP_ADVANTECH_ADAM4052;
        if( value.equals( ID_EQUIP_BMI_8800 ) )
            return name_ID_EQUIP_BMI_8800;
        if( value.equals( ID_EQUIP_TRINERGI_PQM ) )
            return name_ID_EQUIP_TRINERGI_PQM;
        if( value.equals( ID_EQUIP_MEDCAL ) )
            return name_ID_EQUIP_MEDCAL;
        if( value.equals( ID_EQUIP_GE_KV ) )
            return name_ID_EQUIP_GE_KV;
        if( value.equals( ID_EQUIP_GE_KV2 ) )
            return name_ID_EQUIP_GE_KV2;
        if( value.equals( ID_EQUIP_ACUMENTRICS_CONTROL ) )
            return name_ID_EQUIP_ACUMENTRICS_CONTROL;
        if( value.equals( ID_EQUIP_ETK_TEXTPQDIF ) )
            return name_ID_EQUIP_ETK_TEXTPQDIF;
        if( value.equals( ID_EQUIP_ETK_PQWEB ) )
            return name_ID_EQUIP_ETK_PQWEB;
        if( value.equals( ID_EQUIP_QWAVE_POWER_DISTRIBUTION ) )
            return name_ID_EQUIP_QWAVE_POWER_DISTRIBUTION;
        if( value.equals( ID_EQUIP_QWAVE_POWER_TRANSMISSION ) )
            return name_ID_EQUIP_QWAVE_POWER_TRANSMISSION;
        if( value.equals( ID_EQUIP_QWAVE_MICRO ) )
            return name_ID_EQUIP_QWAVE_MICRO;
        if( value.equals( ID_EQUIP_QWAVE_TWIN ) )
            return name_ID_EQUIP_QWAVE_TWIN;
        if( value.equals( ID_EQUIP_QWAVE_PREMIUM ) )
            return name_ID_EQUIP_QWAVE_PREMIUM;
        if( value.equals( ID_EQUIP_QWAVE_LIGHT ) )
            return name_ID_EQUIP_QWAVE_LIGHT;
        if( value.equals( ID_EQUIP_QWAVE_NOMAD ) )
            return name_ID_EQUIP_QWAVE_NOMAD;
        if( value.equals( ID_EQUIP_EWON_4000 ) )
            return name_ID_EQUIP_EWON_4000;
        if( value.equals( ID_EQUIP_QUALIMETRE ) )
            return name_ID_EQUIP_QUALIMETRE;
        if( value.equals( ID_EQUIP_LEM_ANALYST3Q ) )
            return name_ID_EQUIP_LEM_ANALYST3Q;
        if( value.equals( ID_EQUIP_LEM_ANALYST1Q ) )
            return name_ID_EQUIP_LEM_ANALYST1Q;
        if( value.equals( ID_EQUIP_LEM_ANALYST2050 ) )
            return name_ID_EQUIP_LEM_ANALYST2050;
        if( value.equals( ID_EQUIP_LEM_ANALYST2060 ) )
            return name_ID_EQUIP_LEM_ANALYST2060;
        if( value.equals( ID_EQUIP_LEM_MIDGET200 ) )
            return name_ID_EQUIP_LEM_MIDGET200;
        if( value.equals( ID_EQUIP_LEM_MBX300 ) )
            return name_ID_EQUIP_LEM_MBX300;
        if( value.equals( ID_EQUIP_LEM_MBX800 ) )
            return name_ID_EQUIP_LEM_MBX800;
        if( value.equals( ID_EQUIP_LEM_MBX601 ) )
            return name_ID_EQUIP_LEM_MBX601;
        if( value.equals( ID_EQUIP_LEM_MBX602 ) )
            return name_ID_EQUIP_LEM_MBX602;
        if( value.equals( ID_EQUIP_LEM_MBX603 ) )
            return name_ID_EQUIP_LEM_MBX603;
        if( value.equals( ID_EQUIP_LEM_MBX686 ) )
            return name_ID_EQUIP_LEM_MBX686;
        if( value.equals( ID_EQUIP_LEM_PERMA701 ) )
            return name_ID_EQUIP_LEM_PERMA701;
        if( value.equals( ID_EQUIP_LEM_PERMA702 ) )
            return name_ID_EQUIP_LEM_PERMA702;
        if( value.equals( ID_EQUIP_LEM_PERMA705 ) )
            return name_ID_EQUIP_LEM_PERMA705;
        if( value.equals( ID_EQUIP_LEM_PERMA706 ) )
            return name_ID_EQUIP_LEM_PERMA706;
        if( value.equals( ID_EQUIP_LEM_QWAVEMICRO ) )
            return name_ID_EQUIP_LEM_QWAVEMICRO;
        if( value.equals( ID_EQUIP_LEM_QWAVENOMAD ) )
            return name_ID_EQUIP_LEM_QWAVENOMAD;
        if( value.equals( ID_EQUIP_LEM_QWAVELIGHT ) )
            return name_ID_EQUIP_LEM_QWAVELIGHT;
        if( value.equals( ID_EQUIP_LEM_QWAVETWIN ) )
            return name_ID_EQUIP_LEM_QWAVETWIN;
        if( value.equals( ID_EQUIP_LEM_QWAVEPOWER_DISTRIBUTION ) )
            return name_ID_EQUIP_LEM_QWAVEPOWER_DISTRIBUTION;
        if( value.equals( ID_EQUIP_LEM_QWAVEPREMIUM ) )
            return name_ID_EQUIP_LEM_QWAVEPREMIUM;
        if( value.equals( ID_EQUIP_LEM_QWAVEPOWER_TRANSPORT ) )
            return name_ID_EQUIP_LEM_QWAVEPOWER_TRANSPORT;
        if( value.equals( ID_EQUIP_LEM_TOPASLT ) )
            return name_ID_EQUIP_LEM_TOPASLT;
        if( value.equals( ID_EQUIP_LEM_TOPAS1000 ) )
            return name_ID_EQUIP_LEM_TOPAS1000;
        if( value.equals( ID_EQUIP_LEM_TOPAS1019 ) )
            return name_ID_EQUIP_LEM_TOPAS1019;
        if( value.equals( ID_EQUIP_LEM_TOPAS1020 ) )
            return name_ID_EQUIP_LEM_TOPAS1020;
        if( value.equals( ID_EQUIP_LEM_TOPAS1040 ) )
            return name_ID_EQUIP_LEM_TOPAS1040;
        if( value.equals( ID_EQUIP_LEM_BEN5000 ) )
            return name_ID_EQUIP_LEM_BEN5000;
        if( value.equals( ID_EQUIP_LEM_BEN6000 ) )
            return name_ID_EQUIP_LEM_BEN6000;
        if( value.equals( ID_EQUIP_LEM_EWAVE ) )
            return name_ID_EQUIP_LEM_EWAVE;
        if( value.equals( ID_EQUIP_LEM_EWON4000 ) )
            return name_ID_EQUIP_LEM_EWON4000;
        if( value.equals( ID_EQUIP_WPT_5510 ) )
            return name_ID_EQUIP_WPT_5510;
        if( value.equals( ID_EQUIP_WPT_5520 ) )
            return name_ID_EQUIP_WPT_5520;
        if( value.equals( ID_EQUIP_WPT_5530T ) )
            return name_ID_EQUIP_WPT_5530T;
        if( value.equals( ID_EQUIP_WPT_5560 ) )
            return name_ID_EQUIP_WPT_5560;
        if( value.equals( ID_EQUIP_WPT_5590 ) )
            return name_ID_EQUIP_WPT_5590;
        if( value.equals( ID_EQUIP_ETK_NODECENTER ) )
            return name_ID_EQUIP_ETK_NODECENTER;
        if( value.equals( ID_EQUIP_WPT_DRANVIEW ) )
            return name_ID_EQUIP_WPT_DRANVIEW;
        if( value.equals( ID_EQUIP_ADVANTECH_ADAM5017 ) )
            return name_ID_EQUIP_ADVANTECH_ADAM5017;
        if( value.equals( ID_EQUIP_ADVANTECH_ADAM5018 ) )
            return name_ID_EQUIP_ADVANTECH_ADAM5018;
        if( value.equals( ID_EQUIP_ADVANTECH_ADAM5080 ) )
            return name_ID_EQUIP_ADVANTECH_ADAM5080;
        if( value.equals( ID_EQUIP_ADVANTECH_ADAM5052 ) )
            return name_ID_EQUIP_ADVANTECH_ADAM5052;
        if( value.equals( ID_EQUIP_ADVANTECH_ADAM4050 ) )
            return name_ID_EQUIP_ADVANTECH_ADAM4050;
        if( value.equals( ID_EQUIP_ADVANTECH_ADAM4053 ) )
            return name_ID_EQUIP_ADVANTECH_ADAM4053;
        if( value.equals( ID_EQUIP_ADVANTECH_ADAM4080 ) )
            return name_ID_EQUIP_ADVANTECH_ADAM4080;
        if( value.equals( ID_EQUIP_ADVANTECH_ADAM5050 ) )
            return name_ID_EQUIP_ADVANTECH_ADAM5050;
        if( value.equals( ID_EQUIP_ADVANTECH_ADAM5051 ) )
            return name_ID_EQUIP_ADVANTECH_ADAM5051;
        if( value.equals( ID_EQUIP_ELCOM_BK550 ) )
            return name_ID_EQUIP_ELCOM_BK550;
        if( value.equals( ID_INSTR_TYPE_SCOPE ) )
            return name_ID_INSTR_TYPE_SCOPE;
        if( value.equals( ID_INSTR_TYPE_FR ) )
            return name_ID_INSTR_TYPE_FR;
        if( value.equals( ID_INSTR_TYPE_PQM ) )
            return name_ID_INSTR_TYPE_PQM;
        if( value.equals( ID_INSTR_TYPE_VR ) )
            return name_ID_INSTR_TYPE_VR;
        if( value.equals( ID_INSTR_TYPE_SA ) )
            return name_ID_INSTR_TYPE_SA;
        if( value.equals( ID_QT_WAVEFORM ) )
            return name_ID_QT_WAVEFORM;
        if( value.equals( ID_QT_VALUELOG ) )
            return name_ID_QT_VALUELOG;
        if( value.equals( ID_QT_PHASOR ) )
            return name_ID_QT_PHASOR;
        if( value.equals( ID_QT_RESPONSE ) )
            return name_ID_QT_RESPONSE;
        if( value.equals( ID_QT_FLASH ) )
            return name_ID_QT_FLASH;
        if( value.equals( ID_QT_HISTOGRAM ) )
            return name_ID_QT_HISTOGRAM;
        if( value.equals( ID_QT_HISTOGRAM3D ) )
            return name_ID_QT_HISTOGRAM3D;
        if( value.equals( ID_QT_CPF ) )
            return name_ID_QT_CPF;
        if( value.equals( ID_QT_XY ) )
            return name_ID_QT_XY;
        if( value.equals( ID_QT_MAGDUR ) )
            return name_ID_QT_MAGDUR;
        if( value.equals( ID_QT_XYZ ) )
            return name_ID_QT_XYZ;
        if( value.equals( ID_QT_MAGDURTIME ) )
            return name_ID_QT_MAGDURTIME;
        if( value.equals( ID_QT_MAGDURCOUNT ) )
            return name_ID_QT_MAGDURCOUNT;
        if( value.equals( ID_DISTURB_1159_NONE ) )
            return name_ID_DISTURB_1159_NONE;
        if( value.equals( ID_DISTURB_1159_TRANSIENT ) )
            return name_ID_DISTURB_1159_TRANSIENT;
        if( value.equals( ID_DISTURB_1159_TRANSIENT_IMPULSIVE ) )
            return name_ID_DISTURB_1159_TRANSIENT_IMPULSIVE;
        if( value.equals( ID_DISTURB_1159_TRANSIENT_IMPULSIVE_NANO ) )
            return name_ID_DISTURB_1159_TRANSIENT_IMPULSIVE_NANO;
        if( value.equals( ID_DISTURB_1159_TRANSIENT_IMPULSIVE_MICRO ) )
            return name_ID_DISTURB_1159_TRANSIENT_IMPULSIVE_MICRO;
        if( value.equals( ID_DISTURB_1159_TRANSIENT_IMPULSIVE_MILLI ) )
            return name_ID_DISTURB_1159_TRANSIENT_IMPULSIVE_MILLI;
        if( value.equals( ID_DISTURB_1159_TRANSIENT_OSCILLATORY ) )
            return name_ID_DISTURB_1159_TRANSIENT_OSCILLATORY;
        if( value.equals( ID_DISTURB_1159_TRANSIENT_OSCILLATORY_LOWFREQ ) )
            return name_ID_DISTURB_1159_TRANSIENT_OSCILLATORY_LOWFREQ;
        if( value.equals( ID_DISTURB_1159_TRANSIENT_OSCILLATORY_MEDFREQ ) )
            return name_ID_DISTURB_1159_TRANSIENT_OSCILLATORY_MEDFREQ;
        if( value.equals( ID_DISTURB_1159_TRANSIENT_OSCILLATORY_HIGHFREQ ) )
            return name_ID_DISTURB_1159_TRANSIENT_OSCILLATORY_HIGHFREQ;
        if( value.equals( ID_DISTURB_1159_SHORTDUR ) )
            return name_ID_DISTURB_1159_SHORTDUR;
        if( value.equals( ID_DISTURB_1159_SHORTDUR_INSTANT ) )
            return name_ID_DISTURB_1159_SHORTDUR_INSTANT;
        if( value.equals( ID_DISTURB_1159_SHORTDUR_INSTANT_SAG ) )
            return name_ID_DISTURB_1159_SHORTDUR_INSTANT_SAG;
        if( value.equals( ID_DISTURB_1159_SHORTDUR_INSTANT_SWELL ) )
            return name_ID_DISTURB_1159_SHORTDUR_INSTANT_SWELL;
        if( value.equals( ID_DISTURB_1159_SHORTDUR_MOMENT ) )
            return name_ID_DISTURB_1159_SHORTDUR_MOMENT;
        if( value.equals( ID_DISTURB_1159_SHORTDUR_MOMENT_INTERRUPT ) )
            return name_ID_DISTURB_1159_SHORTDUR_MOMENT_INTERRUPT;
        if( value.equals( ID_DISTURB_1159_SHORTDUR_MOMENT_SAG ) )
            return name_ID_DISTURB_1159_SHORTDUR_MOMENT_SAG;
        if( value.equals( ID_DISTURB_1159_SHORTDUR_MOMENT_SWELL ) )
            return name_ID_DISTURB_1159_SHORTDUR_MOMENT_SWELL;
        if( value.equals( ID_DISTURB_1159_SHORTDUR_TEMP ) )
            return name_ID_DISTURB_1159_SHORTDUR_TEMP;
        if( value.equals( ID_DISTURB_1159_SHORTDUR_TEMP_INTERRUPT ) )
            return name_ID_DISTURB_1159_SHORTDUR_TEMP_INTERRUPT;
        if( value.equals( ID_DISTURB_1159_SHORTDUR_TEMP_SAG ) )
            return name_ID_DISTURB_1159_SHORTDUR_TEMP_SAG;
        if( value.equals( ID_DISTURB_1159_SHORTDUR_TEMP_SWELL ) )
            return name_ID_DISTURB_1159_SHORTDUR_TEMP_SWELL;
        if( value.equals( ID_DISTURB_1159_LONGDUR ) )
            return name_ID_DISTURB_1159_LONGDUR;
        if( value.equals( ID_DISTURB_1159_LONGDUR_INTERRUPT ) )
            return name_ID_DISTURB_1159_LONGDUR_INTERRUPT;
        if( value.equals( ID_DISTURB_1159_LONGDUR_SAG ) )
            return name_ID_DISTURB_1159_LONGDUR_SAG;
        if( value.equals( ID_DISTURB_1159_LONGDUR_SWELL ) )
            return name_ID_DISTURB_1159_LONGDUR_SWELL;
        if( value.equals( ID_DISTURB_1159_IMBALANCE ) )
            return name_ID_DISTURB_1159_IMBALANCE;
        if( value.equals( ID_DISTURB_1159_POWERFREQVARIATION ) )
            return name_ID_DISTURB_1159_POWERFREQVARIATION;
        if( value.equals( ID_DISTURB_1159_VOLTAGEFLUCTUATION ) )
            return name_ID_DISTURB_1159_VOLTAGEFLUCTUATION;
        if( value.equals( ID_DISTURB_1159_WAVEDISTORT ) )
            return name_ID_DISTURB_1159_WAVEDISTORT;
        if( value.equals( ID_DISTURB_1159_WAVEDISTORT_DCOFFSET ) )
            return name_ID_DISTURB_1159_WAVEDISTORT_DCOFFSET;
        if( value.equals( ID_DISTURB_1159_WAVEDISTORT_HARMONIC ) )
            return name_ID_DISTURB_1159_WAVEDISTORT_HARMONIC;
        if( value.equals( ID_DISTURB_1159_WAVEDISTORT_INTERHARMONIC ) )
            return name_ID_DISTURB_1159_WAVEDISTORT_INTERHARMONIC;
        if( value.equals( ID_DISTURB_1159_WAVEDISTORT_NOTCHING ) )
            return name_ID_DISTURB_1159_WAVEDISTORT_NOTCHING;
        if( value.equals( ID_DISTURB_1159_WAVEDISTORT_NOISE ) )
            return name_ID_DISTURB_1159_WAVEDISTORT_NOISE;
        if( value.equals( ID_SERIES_VALUE_TYPE_VAL ) )
            return name_ID_SERIES_VALUE_TYPE_VAL;
        if( value.equals( ID_SERIES_VALUE_TYPE_TIME ) )
            return name_ID_SERIES_VALUE_TYPE_TIME;
        if( value.equals( ID_SERIES_VALUE_TYPE_MIN ) )
            return name_ID_SERIES_VALUE_TYPE_MIN;
        if( value.equals( ID_SERIES_VALUE_TYPE_MAX ) )
            return name_ID_SERIES_VALUE_TYPE_MAX;
        if( value.equals( ID_SERIES_VALUE_TYPE_AVG ) )
            return name_ID_SERIES_VALUE_TYPE_AVG;
        if( value.equals( ID_SERIES_VALUE_TYPE_INST ) )
            return name_ID_SERIES_VALUE_TYPE_INST;
        if( value.equals( ID_SERIES_VALUE_TYPE_PHASEANGLE ) )
            return name_ID_SERIES_VALUE_TYPE_PHASEANGLE;
        if( value.equals( ID_SERIES_VALUE_TYPE_PHASEANGLE_MIN ) )
            return name_ID_SERIES_VALUE_TYPE_PHASEANGLE_MIN;
        if( value.equals( ID_SERIES_VALUE_TYPE_PHASEANGLE_MAX ) )
            return name_ID_SERIES_VALUE_TYPE_PHASEANGLE_MAX;
        if( value.equals( ID_SERIES_VALUE_TYPE_PHASEANGLE_AVG ) )
            return name_ID_SERIES_VALUE_TYPE_PHASEANGLE_AVG;
        if( value.equals( ID_SERIES_VALUE_TYPE_AREA ) )
            return name_ID_SERIES_VALUE_TYPE_AREA;
        if( value.equals( ID_SERIES_VALUE_TYPE_LATITUDE ) )
            return name_ID_SERIES_VALUE_TYPE_LATITUDE;
        if( value.equals( ID_SERIES_VALUE_TYPE_DURATION ) )
            return name_ID_SERIES_VALUE_TYPE_DURATION;
        if( value.equals( ID_SERIES_VALUE_TYPE_LONGITUDE ) )
            return name_ID_SERIES_VALUE_TYPE_LONGITUDE;
        if( value.equals( ID_SERIES_VALUE_TYPE_POLARITY ) )
            return name_ID_SERIES_VALUE_TYPE_POLARITY;
        if( value.equals( ID_SERIES_VALUE_TYPE_ELLIPSE ) )
            return name_ID_SERIES_VALUE_TYPE_ELLIPSE;
        if( value.equals( ID_SERIES_VALUE_TYPE_BINID ) )
            return name_ID_SERIES_VALUE_TYPE_BINID;
        if( value.equals( ID_SERIES_VALUE_TYPE_BINHIGH ) )
            return name_ID_SERIES_VALUE_TYPE_BINHIGH;
        if( value.equals( ID_SERIES_VALUE_TYPE_BINLOW ) )
            return name_ID_SERIES_VALUE_TYPE_BINLOW;
        if( value.equals( ID_SERIES_VALUE_TYPE_XBINHIGH ) )
            return name_ID_SERIES_VALUE_TYPE_XBINHIGH;
        if( value.equals( ID_SERIES_VALUE_TYPE_XBINLOW ) )
            return name_ID_SERIES_VALUE_TYPE_XBINLOW;
        if( value.equals( ID_SERIES_VALUE_TYPE_YBINHIGH ) )
            return name_ID_SERIES_VALUE_TYPE_YBINHIGH;
        if( value.equals( ID_SERIES_VALUE_TYPE_YBINLOW ) )
            return name_ID_SERIES_VALUE_TYPE_YBINLOW;
        if( value.equals( ID_SERIES_VALUE_TYPE_COUNT ) )
            return name_ID_SERIES_VALUE_TYPE_COUNT;
        if( value.equals( ID_SERIES_VALUE_TYPE_TRANSITION ) )
            return name_ID_SERIES_VALUE_TYPE_TRANSITION;
        if( value.equals( ID_SERIES_VALUE_TYPE_PROB ) )
            return name_ID_SERIES_VALUE_TYPE_PROB;
        if( value.equals( ID_SERIES_VALUE_TYPE_INTERVAL ) )
            return name_ID_SERIES_VALUE_TYPE_INTERVAL;
        if( value.equals( ID_SERIES_VALUE_TYPE_STATUS ) )
            return name_ID_SERIES_VALUE_TYPE_STATUS;
        if( value.equals( ID_SERIES_VALUE_TYPE_P1 ) )
            return name_ID_SERIES_VALUE_TYPE_P1;
        if( value.equals( ID_SERIES_VALUE_TYPE_P5 ) )
            return name_ID_SERIES_VALUE_TYPE_P5;
        if( value.equals( ID_SERIES_VALUE_TYPE_P10 ) )
            return name_ID_SERIES_VALUE_TYPE_P10;
        if( value.equals( ID_SERIES_VALUE_TYPE_P90 ) )
            return name_ID_SERIES_VALUE_TYPE_P90;
        if( value.equals( ID_SERIES_VALUE_TYPE_P95 ) )
            return name_ID_SERIES_VALUE_TYPE_P95;
        if( value.equals( ID_SERIES_VALUE_TYPE_P99 ) )
            return name_ID_SERIES_VALUE_TYPE_P99;
        if( value.equals( ID_SERIES_VALUE_TYPE_FREQUENCY ) )
            return name_ID_SERIES_VALUE_TYPE_FREQUENCY;
        if( value.equals( ID_QC_NONE ) )
            return name_ID_QC_NONE;
        if( value.equals( ID_QC_INSTANTANEOUS ) )
            return name_ID_QC_INSTANTANEOUS;
        if( value.equals( ID_QC_SPECTRA ) )
            return name_ID_QC_SPECTRA;
        if( value.equals( ID_QC_PEAK ) )
            return name_ID_QC_PEAK;
        if( value.equals( ID_QC_RMS ) )
            return name_ID_QC_RMS;
        if( value.equals( ID_QC_HRMS ) )
            return name_ID_QC_HRMS;
        if( value.equals( ID_QC_FREQUENCY ) )
            return name_ID_QC_FREQUENCY;
        if( value.equals( ID_QC_TOTAL_THD ) )
            return name_ID_QC_TOTAL_THD;
        if( value.equals( ID_QC_EVEN_THD ) )
            return name_ID_QC_EVEN_THD;
        if( value.equals( ID_QC_ODD_THD ) )
            return name_ID_QC_ODD_THD;
        if( value.equals( ID_QC_CREST_FACTOR ) )
            return name_ID_QC_CREST_FACTOR;
        if( value.equals( ID_QC_FORM_FACTOR ) )
            return name_ID_QC_FORM_FACTOR;
        if( value.equals( ID_QC_ARITH_SUM ) )
            return name_ID_QC_ARITH_SUM;
        if( value.equals( ID_QC_S0S1 ) )
            return name_ID_QC_S0S1;
        if( value.equals( ID_QC_S2S1 ) )
            return name_ID_QC_S2S1;
        if( value.equals( ID_QC_SPOS ) )
            return name_ID_QC_SPOS;
        if( value.equals( ID_QC_SNEG ) )
            return name_ID_QC_SNEG;
        if( value.equals( ID_QC_SZERO ) )
            return name_ID_QC_SZERO;
        if( value.equals( ID_QC_AVG_IMBAL ) )
            return name_ID_QC_AVG_IMBAL;
        if( value.equals( ID_QC_TOTAL_THD_RMS ) )
            return name_ID_QC_TOTAL_THD_RMS;
        if( value.equals( ID_QC_ODD_THD_RMS ) )
            return name_ID_QC_ODD_THD_RMS;
        if( value.equals( ID_QC_EVEN_THD_RMS ) )
            return name_ID_QC_EVEN_THD_RMS;
        if( value.equals( ID_QC_TID ) )
            return name_ID_QC_TID;
        if( value.equals( ID_QC_TID_RMS ) )
            return name_ID_QC_TID_RMS;
        if( value.equals( ID_QC_IHRMS ) )
            return name_ID_QC_IHRMS;
        if( value.equals( ID_QC_SPECTRA_HGROUP ) )
            return name_ID_QC_SPECTRA_HGROUP;
        if( value.equals( ID_QC_SPECTRA_IGROUP ) )
            return name_ID_QC_SPECTRA_IGROUP;
        if( value.equals( ID_QC_TIF ) )
            return name_ID_QC_TIF;
        if( value.equals( ID_QC_FLKR_MAG_AVG ) )
            return name_ID_QC_FLKR_MAG_AVG;
        if( value.equals( ID_QC_FLKR_MAX_DVV ) )
            return name_ID_QC_FLKR_MAX_DVV;
        if( value.equals( ID_QC_FLKR_FREQ_MAX ) )
            return name_ID_QC_FLKR_FREQ_MAX;
        if( value.equals( ID_QC_FLKR_MAG_MAX ) )
            return name_ID_QC_FLKR_MAG_MAX;
        if( value.equals( ID_QC_FLKR_WGT_AVG ) )
            return name_ID_QC_FLKR_WGT_AVG;
        if( value.equals( ID_QC_FLKR_SPECTRUM ) )
            return name_ID_QC_FLKR_SPECTRUM;
        if( value.equals( ID_QC_FLKR_PST ) )
            return name_ID_QC_FLKR_PST;
        if( value.equals( ID_QC_FLKR_PLT ) )
            return name_ID_QC_FLKR_PLT;
        if( value.equals( ID_QC_TIF_RMS ) )
            return name_ID_QC_TIF_RMS;
        if( value.equals( ID_QC_FLKR_PLTSLIDE ) )
            return name_ID_QC_FLKR_PLTSLIDE;
        if( value.equals( ID_QC_FLKR_PILPF ) )
            return name_ID_QC_FLKR_PILPF;
        if( value.equals( ID_QC_FLKR_PIMAX ) )
            return name_ID_QC_FLKR_PIMAX;
        if( value.equals( ID_QC_FLKR_PIROOT ) )
            return name_ID_QC_FLKR_PIROOT;
        if( value.equals( ID_QC_FLKR_PIROOTLPF ) )
            return name_ID_QC_FLKR_PIROOTLPF;
        if( value.equals( ID_QC_IT ) )
            return name_ID_QC_IT;
        if( value.equals( ID_QC_RMS_DEMAND ) )
            return name_ID_QC_RMS_DEMAND;
        if( value.equals( ID_QC_ANSI_TDF ) )
            return name_ID_QC_ANSI_TDF;
        if( value.equals( ID_QC_K_FACTOR ) )
            return name_ID_QC_K_FACTOR;
        if( value.equals( ID_QC_TDD ) )
            return name_ID_QC_TDD;
        if( value.equals( ID_QC_RMS_PEAK_DEMAND ) )
            return name_ID_QC_RMS_PEAK_DEMAND;
        if( value.equals( ID_QC_P ) )
            return name_ID_QC_P;
        if( value.equals( ID_QC_Q ) )
            return name_ID_QC_Q;
        if( value.equals( ID_QC_S ) )
            return name_ID_QC_S;
        if( value.equals( ID_QC_PF ) )
            return name_ID_QC_PF;
        if( value.equals( ID_QC_DF ) )
            return name_ID_QC_DF;
        if( value.equals( ID_QC_P_DEMAND ) )
            return name_ID_QC_P_DEMAND;
        if( value.equals( ID_QC_Q_DEMAND ) )
            return name_ID_QC_Q_DEMAND;
        if( value.equals( ID_QC_S_DEMAND ) )
            return name_ID_QC_S_DEMAND;
        if( value.equals( ID_QC_DF_DEMAND ) )
            return name_ID_QC_DF_DEMAND;
        if( value.equals( ID_QC_PF_DEMAND ) )
            return name_ID_QC_PF_DEMAND;
        if( value.equals( ID_QC_P_PRED_DEMAND ) )
            return name_ID_QC_P_PRED_DEMAND;
        if( value.equals( ID_QC_Q_PRED_DEMAND ) )
            return name_ID_QC_Q_PRED_DEMAND;
        if( value.equals( ID_QC_S_PRED_DEMAND ) )
            return name_ID_QC_S_PRED_DEMAND;
        if( value.equals( ID_QC_P_CO_Q_DEMAND ) )
            return name_ID_QC_P_CO_Q_DEMAND;
        if( value.equals( ID_QC_P_CO_S_DEMAND ) )
            return name_ID_QC_P_CO_S_DEMAND;
        if( value.equals( ID_QC_Q_CO_P_DEMAND ) )
            return name_ID_QC_Q_CO_P_DEMAND;
        if( value.equals( ID_QC_Q_CO_S_DEMAND ) )
            return name_ID_QC_Q_CO_S_DEMAND;
        if( value.equals( ID_QC_DF_CO_S_DEMAND ) )
            return name_ID_QC_DF_CO_S_DEMAND;
        if( value.equals( ID_QC_PF_CO_S_DEMAND ) )
            return name_ID_QC_PF_CO_S_DEMAND;
        if( value.equals( ID_QC_PF_CO_P_DEMAND ) )
            return name_ID_QC_PF_CO_P_DEMAND;
        if( value.equals( ID_QC_PF_CO_Q_DEMAND ) )
            return name_ID_QC_PF_CO_Q_DEMAND;
        if( value.equals( ID_QC_ANGLE_FUND ) )
            return name_ID_QC_ANGLE_FUND;
        if( value.equals( ID_QC_Q_FUND ) )
            return name_ID_QC_Q_FUND;
        if( value.equals( ID_QC_PF_VECTOR ) )
            return name_ID_QC_PF_VECTOR;
        if( value.equals( ID_QC_DF_VECTOR ) )
            return name_ID_QC_DF_VECTOR;
        if( value.equals( ID_QC_S_VECTOR ) )
            return name_ID_QC_S_VECTOR;
        if( value.equals( ID_QC_S_VECTOR_FUND ) )
            return name_ID_QC_S_VECTOR_FUND;
        if( value.equals( ID_QC_S_FUND ) )
            return name_ID_QC_S_FUND;
        if( value.equals( ID_QC_S_CO_P_DEMAND ) )
            return name_ID_QC_S_CO_P_DEMAND;
        if( value.equals( ID_QC_S_CO_Q_DEMAND ) )
            return name_ID_QC_S_CO_Q_DEMAND;
        if( value.equals( ID_QC_PF_ARITH ) )
            return name_ID_QC_PF_ARITH;
        if( value.equals( ID_QC_DF_ARITH ) )
            return name_ID_QC_DF_ARITH;
        if( value.equals( ID_QC_S_ARITH ) )
            return name_ID_QC_S_ARITH;
        if( value.equals( ID_QC_S_ARITH_FUND ) )
            return name_ID_QC_S_ARITH_FUND;
        if( value.equals( ID_QC_S_PEAK_DEMAND ) )
            return name_ID_QC_S_PEAK_DEMAND;
        if( value.equals( ID_QC_Q_PEAK_DEMAND ) )
            return name_ID_QC_Q_PEAK_DEMAND;
        if( value.equals( ID_QC_P_PEAK_DEMAND ) )
            return name_ID_QC_P_PEAK_DEMAND;
        if( value.equals( ID_QC_P_HARMONIC ) )
            return name_ID_QC_P_HARMONIC;
        if( value.equals( ID_QC_P_HARMONIC_UNSIGNED ) )
            return name_ID_QC_P_HARMONIC_UNSIGNED;
        if( value.equals( ID_QC_P_FUND ) )
            return name_ID_QC_P_FUND;
        if( value.equals( ID_QC_P_INTG ) )
            return name_ID_QC_P_INTG;
        if( value.equals( ID_QC_P_INTG_POS ) )
            return name_ID_QC_P_INTG_POS;
        if( value.equals( ID_QC_P_INTG_POS_FUND ) )
            return name_ID_QC_P_INTG_POS_FUND;
        if( value.equals( ID_QC_P_INTG_NEG ) )
            return name_ID_QC_P_INTG_NEG;
        if( value.equals( ID_QC_P_INTG_NEG_FUND ) )
            return name_ID_QC_P_INTG_NEG_FUND;
        if( value.equals( ID_QC_Q_INTG ) )
            return name_ID_QC_Q_INTG;
        if( value.equals( ID_QC_Q_INTG_POS ) )
            return name_ID_QC_Q_INTG_POS;
        if( value.equals( ID_QC_Q_INTG_POS_FUND ) )
            return name_ID_QC_Q_INTG_POS_FUND;
        if( value.equals( ID_QC_Q_INTG_NEG_FUND ) )
            return name_ID_QC_Q_INTG_NEG_FUND;
        if( value.equals( ID_QC_Q_INTG_NEG ) )
            return name_ID_QC_Q_INTG_NEG;
        if( value.equals( ID_QC_S_INTG ) )
            return name_ID_QC_S_INTG;
        if( value.equals( ID_QC_S_INTG_FUND ) )
            return name_ID_QC_S_INTG_FUND;
        if( value.equals( ID_QC_P_IVL_INTG ) )
            return name_ID_QC_P_IVL_INTG;
        if( value.equals( ID_QC_P_IVL_INTG_POS ) )
            return name_ID_QC_P_IVL_INTG_POS;
        if( value.equals( ID_QC_P_IVL_INTG_POS_FUND ) )
            return name_ID_QC_P_IVL_INTG_POS_FUND;
        if( value.equals( ID_QC_P_IVL_INTG_NEG ) )
            return name_ID_QC_P_IVL_INTG_NEG;
        if( value.equals( ID_QC_P_IVL_INTG_NEG_FUND ) )
            return name_ID_QC_P_IVL_INTG_NEG_FUND;
        if( value.equals( ID_QC_Q_IVL_INTG ) )
            return name_ID_QC_Q_IVL_INTG;
        if( value.equals( ID_QC_Q_IVL_INTG_POS ) )
            return name_ID_QC_Q_IVL_INTG_POS;
        if( value.equals( ID_QC_Q_IVL_INTG_POS_FUND ) )
            return name_ID_QC_Q_IVL_INTG_POS_FUND;
        if( value.equals( ID_QC_Q_IVL_INTG_NEG_FUND ) )
            return name_ID_QC_Q_IVL_INTG_NEG_FUND;
        if( value.equals( ID_QC_Q_IVL_INTG_NEG ) )
            return name_ID_QC_Q_IVL_INTG_NEG;
        if( value.equals( ID_QC_S_IVL_INTG ) )
            return name_ID_QC_S_IVL_INTG;
        if( value.equals( ID_QC_S_IVL_INTG_FUND ) )
            return name_ID_QC_S_IVL_INTG_FUND;
        if( value.equals( ID_QC_DAXISFIELD ) )
            return name_ID_QC_DAXISFIELD;
        if( value.equals( ID_QC_QAXIS ) )
            return name_ID_QC_QAXIS;
        if( value.equals( ID_QC_ROTATIONAL ) )
            return name_ID_QC_ROTATIONAL;
        if( value.equals( ID_QC_DAXIS ) )
            return name_ID_QC_DAXIS;
        if( value.equals( ID_QC_LINEAR ) )
            return name_ID_QC_LINEAR;
        if( value.equals( ID_QC_TRANSFERFUNC ) )
            return name_ID_QC_TRANSFERFUNC;
        if( value.equals( ID_QC_STATUS ) )
            return name_ID_QC_STATUS;

         return null;
     }


/**  Returns the name of the specified integer ID (when correctly specified with its owner tag). */
    static public final String getNameIntegerID( Guid tag, int id )
    {
        if( tag.equals( tagCompressionStyleID ) && id == ID_COMP_STYLE_NONE )
            return name_ID_COMP_STYLE_NONE;
        if( tag.equals( tagCompressionStyleID ) && id == ID_COMP_STYLE_RECORDLEVEL )
            return name_ID_COMP_STYLE_RECORDLEVEL;
        if( tag.equals( tagCompressionStyleID ) && id == ID_COMP_STYLE_TOTALFILE )
            return name_ID_COMP_STYLE_TOTALFILE;
        if( tag.equals( tagCompressionAlgorithmID ) && id == ID_COMP_ALG_NONE )
            return name_ID_COMP_ALG_NONE;
        if( tag.equals( tagCompressionAlgorithmID ) && id == ID_COMP_ALG_ZLIB )
            return name_ID_COMP_ALG_ZLIB;
        if( tag.equals( tagCompressionAlgorithmID ) && id == ID_COMP_ALG_PKZIPCL )
            return name_ID_COMP_ALG_PKZIPCL;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_NONE )
            return name_ID_PHASE_NONE;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_AN )
            return name_ID_PHASE_AN;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_BN )
            return name_ID_PHASE_BN;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_CN )
            return name_ID_PHASE_CN;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_NG )
            return name_ID_PHASE_NG;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_AB )
            return name_ID_PHASE_AB;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_BC )
            return name_ID_PHASE_BC;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_CA )
            return name_ID_PHASE_CA;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_RES )
            return name_ID_PHASE_RES;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_NET )
            return name_ID_PHASE_NET;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_TOTAL )
            return name_ID_PHASE_TOTAL;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_LN_AVE )
            return name_ID_PHASE_LN_AVE;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_LL_AVE )
            return name_ID_PHASE_LL_AVE;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_WORST )
            return name_ID_PHASE_WORST;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_PLUS )
            return name_ID_PHASE_PLUS;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_MINUS )
            return name_ID_PHASE_MINUS;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_GENERAL_1 )
            return name_ID_PHASE_GENERAL_1;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_GENERAL_2 )
            return name_ID_PHASE_GENERAL_2;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_GENERAL_3 )
            return name_ID_PHASE_GENERAL_3;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_GENERAL_4 )
            return name_ID_PHASE_GENERAL_4;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_GENERAL_5 )
            return name_ID_PHASE_GENERAL_5;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_GENERAL_6 )
            return name_ID_PHASE_GENERAL_6;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_GENERAL_7 )
            return name_ID_PHASE_GENERAL_7;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_GENERAL_8 )
            return name_ID_PHASE_GENERAL_8;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_GENERAL_9 )
            return name_ID_PHASE_GENERAL_9;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_GENERAL_10 )
            return name_ID_PHASE_GENERAL_10;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_GENERAL_11 )
            return name_ID_PHASE_GENERAL_11;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_GENERAL_12 )
            return name_ID_PHASE_GENERAL_12;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_GENERAL_13 )
            return name_ID_PHASE_GENERAL_13;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_GENERAL_14 )
            return name_ID_PHASE_GENERAL_14;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_GENERAL_15 )
            return name_ID_PHASE_GENERAL_15;
        if( tag.equals( tagPhaseID ) && id == ID_PHASE_GENERAL_16 )
            return name_ID_PHASE_GENERAL_16;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_NONE )
            return name_ID_QU_NONE;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_SECONDS )
            return name_ID_QU_SECONDS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_TIMESTAMP )
            return name_ID_QU_TIMESTAMP;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_CYCLES )
            return name_ID_QU_CYCLES;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_VOLTS )
            return name_ID_QU_VOLTS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_AMPS )
            return name_ID_QU_AMPS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_VA )
            return name_ID_QU_VA;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_WATTS )
            return name_ID_QU_WATTS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_VARS )
            return name_ID_QU_VARS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_OHMS )
            return name_ID_QU_OHMS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_SIEMENS )
            return name_ID_QU_SIEMENS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_VOLTSPERAMP )
            return name_ID_QU_VOLTSPERAMP;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_JOULES )
            return name_ID_QU_JOULES;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_HERTZ )
            return name_ID_QU_HERTZ;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_CELCIUS )
            return name_ID_QU_CELCIUS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_DEGREES )
            return name_ID_QU_DEGREES;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_DB )
            return name_ID_QU_DB;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_PERCENT )
            return name_ID_QU_PERCENT;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_PERUNIT )
            return name_ID_QU_PERUNIT;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_SAMPLES )
            return name_ID_QU_SAMPLES;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_VARHOURS )
            return name_ID_QU_VARHOURS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_WATTHOURS )
            return name_ID_QU_WATTHOURS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_VAHOURS )
            return name_ID_QU_VAHOURS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_MPS )
            return name_ID_QU_MPS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_MPH )
            return name_ID_QU_MPH;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_BARS )
            return name_ID_QU_BARS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_PASCALS )
            return name_ID_QU_PASCALS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_NEWTONS )
            return name_ID_QU_NEWTONS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_NEWTONMETERS )
            return name_ID_QU_NEWTONMETERS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_RPM )
            return name_ID_QU_RPM;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_RADPERSEC )
            return name_ID_QU_RADPERSEC;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_METERS )
            return name_ID_QU_METERS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_WEBERTURNS )
            return name_ID_QU_WEBERTURNS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_TESLAS )
            return name_ID_QU_TESLAS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_WEBERS )
            return name_ID_QU_WEBERS;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_VOLTSPERVOLT )
            return name_ID_QU_VOLTSPERVOLT;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_AMPSPERAMP )
            return name_ID_QU_AMPSPERAMP;
        if( tag.equals( tagQuantityUnitsID ) && id == ID_QU_AMPSPERVOLT )
            return name_ID_QU_AMPSPERVOLT;
        if( tag.equals( tagStorageMethodID ) && id == ID_SERIES_METHOD_VALUES )
            return name_ID_SERIES_METHOD_VALUES;
        if( tag.equals( tagStorageMethodID ) && id == ID_SERIES_METHOD_SCALED )
            return name_ID_SERIES_METHOD_SCALED;
        if( tag.equals( tagStorageMethodID ) && id == ID_SERIES_METHOD_INCREMENT )
            return name_ID_SERIES_METHOD_INCREMENT;
        if( tag.equals( tagHintGreekPrefixID ) && id == ID_GREEK_DONTCARE )
            return name_ID_GREEK_DONTCARE;
        if( tag.equals( tagHintGreekPrefixID ) && id == ID_GREEK_FEMTO )
            return name_ID_GREEK_FEMTO;
        if( tag.equals( tagHintGreekPrefixID ) && id == ID_GREEK_PICO )
            return name_ID_GREEK_PICO;
        if( tag.equals( tagHintGreekPrefixID ) && id == ID_GREEK_NANO )
            return name_ID_GREEK_NANO;
        if( tag.equals( tagHintGreekPrefixID ) && id == ID_GREEK_MICRO )
            return name_ID_GREEK_MICRO;
        if( tag.equals( tagHintGreekPrefixID ) && id == ID_GREEK_MILLI )
            return name_ID_GREEK_MILLI;
        if( tag.equals( tagHintGreekPrefixID ) && id == ID_GREEK_NONE )
            return name_ID_GREEK_NONE;
        if( tag.equals( tagHintGreekPrefixID ) && id == ID_GREEK_KILO )
            return name_ID_GREEK_KILO;
        if( tag.equals( tagHintGreekPrefixID ) && id == ID_GREEK_MEGA )
            return name_ID_GREEK_MEGA;
        if( tag.equals( tagHintGreekPrefixID ) && id == ID_GREEK_TERA )
            return name_ID_GREEK_TERA;
        if( tag.equals( tagHintGreekPrefixID ) && id == ID_GREEK_GIGA )
            return name_ID_GREEK_GIGA;
        if( tag.equals( tagHintPreferredUnitsID ) && id == ID_PREFER_ENG )
            return name_ID_PREFER_ENG;
        if( tag.equals( tagHintPreferredUnitsID ) && id == ID_PREFER_PCT )
            return name_ID_PREFER_PCT;
        if( tag.equals( tagHintPreferredUnitsID ) && id == ID_PREFER_PU )
            return name_ID_PREFER_PU;
        if( tag.equals( tagHintDefaultDisplayID ) && id == ID_DEFAULT_DONTCARE )
            return name_ID_DEFAULT_DONTCARE;
        if( tag.equals( tagHintDefaultDisplayID ) && id == ID_DEFAULT_MAG )
            return name_ID_DEFAULT_MAG;
        if( tag.equals( tagHintDefaultDisplayID ) && id == ID_DEFAULT_ANG )
            return name_ID_DEFAULT_ANG;
        if( tag.equals( tagHintDefaultDisplayID ) && id == ID_DEFAULT_REAL )
            return name_ID_DEFAULT_REAL;
        if( tag.equals( tagHintDefaultDisplayID ) && id == ID_DEFAULT_IMAG )
            return name_ID_DEFAULT_IMAG;
        if( tag.equals( tagHintDefaultDisplayID ) && id == ID_DEFAULT_RX )
            return name_ID_DEFAULT_RX;
        if( tag.equals( tagTriggerTypeID ) && id == ID_TRIG_NONE )
            return name_ID_TRIG_NONE;
        if( tag.equals( tagTriggerTypeID ) && id == ID_TRIG_LOW )
            return name_ID_TRIG_LOW;
        if( tag.equals( tagTriggerTypeID ) && id == ID_TRIG_HIGH )
            return name_ID_TRIG_HIGH;
        if( tag.equals( tagTriggerTypeID ) && id == ID_TRIG_RATE )
            return name_ID_TRIG_RATE;
        if( tag.equals( tagTriggerTypeID ) && id == ID_TRIG_SHAPE )
            return name_ID_TRIG_SHAPE;
        if( tag.equals( tagTriggerTypeID ) && id == ID_TRIG_OTHER )
            return name_ID_TRIG_OTHER;
        if( tag.equals( tagXDTransformerTypeID ) && id == ID_XFORMER_TYPE_CT )
            return name_ID_XFORMER_TYPE_CT;
        if( tag.equals( tagXDTransformerTypeID ) && id == ID_XFORMER_TYPE_PT )
            return name_ID_XFORMER_TYPE_PT;
        if( tag.equals( tagTriggerMethodID ) && id == ID_TRIGGER_METH_NONE )
            return name_ID_TRIGGER_METH_NONE;
        if( tag.equals( tagTriggerMethodID ) && id == ID_TRIGGER_METH_CHANNEL )
            return name_ID_TRIGGER_METH_CHANNEL;
        if( tag.equals( tagTriggerMethodID ) && id == ID_TRIGGER_METH_PERIODIC )
            return name_ID_TRIGGER_METH_PERIODIC;
        if( tag.equals( tagTriggerMethodID ) && id == ID_TRIGGER_METH_EXTERNAL )
            return name_ID_TRIGGER_METH_EXTERNAL;
        if( tag.equals( tagTriggerMethodID ) && id == ID_TRIGGER_METH_PERIODIC_STATS )
            return name_ID_TRIGGER_METH_PERIODIC_STATS;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_NONE )
            return name_ID_QM_NONE;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_VOLTAGE )
            return name_ID_QM_VOLTAGE;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_CURRENT )
            return name_ID_QM_CURRENT;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_POWER )
            return name_ID_QM_POWER;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_ENERGY )
            return name_ID_QM_ENERGY;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_TEMPERATURE )
            return name_ID_QM_TEMPERATURE;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_PRESSURE )
            return name_ID_QM_PRESSURE;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_CHARGE )
            return name_ID_QM_CHARGE;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_EFIELD )
            return name_ID_QM_EFIELD;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_MFIELD )
            return name_ID_QM_MFIELD;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_VELOCITY )
            return name_ID_QM_VELOCITY;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_BEARING )
            return name_ID_QM_BEARING;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_FORCE )
            return name_ID_QM_FORCE;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_TORQUE )
            return name_ID_QM_TORQUE;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_POSITION )
            return name_ID_QM_POSITION;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_FLUXLINKAGE )
            return name_ID_QM_FLUXLINKAGE;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_FLUXDENSITY )
            return name_ID_QM_FLUXDENSITY;
        if( tag.equals( tagQuantityMeasuredID ) && id == ID_QM_STATUS )
            return name_ID_QM_STATUS;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_NONE )
            return name_ID_CTT_NONE;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_NORMAL_TO_LO )
            return name_ID_CTT_NORMAL_TO_LO;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_NORMAL_TO_LO_LO )
            return name_ID_CTT_NORMAL_TO_LO_LO;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_NORMAL_TO_HI )
            return name_ID_CTT_NORMAL_TO_HI;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_NORMAL_TO_HI_HI )
            return name_ID_CTT_NORMAL_TO_HI_HI;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_LO_LO_TO_LO )
            return name_ID_CTT_LO_LO_TO_LO;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_LO_LO_TO_NORMAL )
            return name_ID_CTT_LO_LO_TO_NORMAL;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_LO_LO_TO_HI )
            return name_ID_CTT_LO_LO_TO_HI;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_LO_LO_TO_HI_HI )
            return name_ID_CTT_LO_LO_TO_HI_HI;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_LO_TO_LO_LO )
            return name_ID_CTT_LO_TO_LO_LO;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_LO_TO_NORMAL )
            return name_ID_CTT_LO_TO_NORMAL;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_LO_TO_HI )
            return name_ID_CTT_LO_TO_HI;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_LO_TO_HI_HI )
            return name_ID_CTT_LO_TO_HI_HI;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_HI_TO_LO_LO )
            return name_ID_CTT_HI_TO_LO_LO;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_HI_TO_LO )
            return name_ID_CTT_HI_TO_LO;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_HI_TO_NORMAL )
            return name_ID_CTT_HI_TO_NORMAL;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_HI_TO_HI_HI )
            return name_ID_CTT_HI_TO_HI_HI;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_HI_HI_TO_LO_LO )
            return name_ID_CTT_HI_HI_TO_LO_LO;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_HI_HI_TO_LO )
            return name_ID_CTT_HI_HI_TO_LO;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_HI_HI_TO_NORMAL )
            return name_ID_CTT_HI_HI_TO_NORMAL;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_HI_HI_TO_HI )
            return name_ID_CTT_HI_HI_TO_HI;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_DB_LO )
            return name_ID_CTT_DB_LO;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_DB_HI )
            return name_ID_CTT_DB_HI;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_PERIODIC )
            return name_ID_CTT_PERIODIC;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_MANUAL )
            return name_ID_CTT_MANUAL;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_INT_CROSS_TRIG )
            return name_ID_CTT_INT_CROSS_TRIG;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_EXT_CROSS_TRIG )
            return name_ID_CTT_EXT_CROSS_TRIG;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_MODULE )
            return name_ID_CTT_MODULE;
        if( tag.equals( tagChanTriggerTypeID ) && id == ID_CTT_RATE )
            return name_ID_CTT_RATE;
        if( tag.equals( tagSettingPhysicalConnection ) && id == ID_SINGLE_PHASE )
            return name_ID_SINGLE_PHASE;
        if( tag.equals( tagSettingPhysicalConnection ) && id == ID_2ELEMENT_DELTA )
            return name_ID_2ELEMENT_DELTA;
        if( tag.equals( tagSettingPhysicalConnection ) && id == ID_2_5ELEMENT_WYE )
            return name_ID_2_5ELEMENT_WYE;
        if( tag.equals( tagSettingPhysicalConnection ) && id == ID_3ELMENT_WYE )
            return name_ID_3ELMENT_WYE;
        if( tag.equals( tagSettingPhysicalConnection ) && id == ID_3ELEMENT_DELTA )
            return name_ID_3ELEMENT_DELTA;
        if( tag.equals( tagSettingPhysicalConnection ) && id == ID_SPLIT_PHASE )
            return name_ID_SPLIT_PHASE;
        if( tag.equals( tagSettingPhysicalConnection ) && id == ID_2ELEMENT_2PHASE )
            return name_ID_2ELEMENT_2PHASE;

         return null;
     }
}

