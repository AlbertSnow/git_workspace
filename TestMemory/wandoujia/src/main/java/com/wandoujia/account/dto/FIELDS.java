package com.wandoujia.account.dto;

public enum FIELDS
{
  static
  {
    BASIC_SOCIAL = new FIELDS("BASIC_SOCIAL", 2);
    COMPLETE_SOCIAL = new FIELDS("COMPLETE_SOCIAL", 3);
    PRIVICY_SOCIAL = new FIELDS("PRIVICY_SOCIAL", 4);
    SIMPLE_INFO = new FIELDS("SIMPLE_INFO", 5);
    FIELDS[] arrayOfFIELDS = new FIELDS[6];
    arrayOfFIELDS[0] = BASIC_DEVICE;
    arrayOfFIELDS[1] = COMPLETE_DEVICE;
    arrayOfFIELDS[2] = BASIC_SOCIAL;
    arrayOfFIELDS[3] = COMPLETE_SOCIAL;
    arrayOfFIELDS[4] = PRIVICY_SOCIAL;
    arrayOfFIELDS[5] = SIMPLE_INFO;
    $VALUES = arrayOfFIELDS;
  }

  @com.fasterxml.jackson.annotation.JsonCreator
  @org.codehaus.jackson.annotate.JsonCreator
  public static FIELDS forValue(String paramString)
  {
    if (paramString != null)
      for (FIELDS localFIELDS : values())
        if (paramString.equalsIgnoreCase(localFIELDS.name()))
          return localFIELDS;
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.dto.FIELDS
 * JD-Core Version:    0.6.0
 */