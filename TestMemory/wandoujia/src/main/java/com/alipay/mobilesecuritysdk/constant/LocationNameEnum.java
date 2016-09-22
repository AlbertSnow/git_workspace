package com.alipay.mobilesecuritysdk.constant;

public enum LocationNameEnum
{
  private String value;

  static
  {
    LOCATE_CELL_ID = new LocationNameEnum("LOCATE_CELL_ID", 2, "c");
    LOCATE_LAC = new LocationNameEnum("LOCATE_LAC", 3, "l");
    TIME_STAMP = new LocationNameEnum("TIME_STAMP", 4, "s");
    LOCATE_WIFI = new LocationNameEnum("LOCATE_WIFI", 5, "w");
    LOCATION_ITEM = new LocationNameEnum("LOCATION_ITEM", 6, "locationitem");
    START_TAG = new LocationNameEnum("START_TAG", 7, "locations");
    VERSION = new LocationNameEnum("VERSION", 8, "ver");
    LocationNameEnum[] arrayOfLocationNameEnum = new LocationNameEnum[9];
    arrayOfLocationNameEnum[0] = LOCATE_LATITUDE;
    arrayOfLocationNameEnum[1] = LOCATE_LONGITUDE;
    arrayOfLocationNameEnum[2] = LOCATE_CELL_ID;
    arrayOfLocationNameEnum[3] = LOCATE_LAC;
    arrayOfLocationNameEnum[4] = TIME_STAMP;
    arrayOfLocationNameEnum[5] = LOCATE_WIFI;
    arrayOfLocationNameEnum[6] = LOCATION_ITEM;
    arrayOfLocationNameEnum[7] = START_TAG;
    arrayOfLocationNameEnum[8] = VERSION;
    ENUM$VALUES = arrayOfLocationNameEnum;
  }

  private LocationNameEnum(String arg3)
  {
    String str;
    setValue(str);
  }

  public final String getValue()
  {
    return this.value;
  }

  public final void setValue(String paramString)
  {
    this.value = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.mobilesecuritysdk.constant.LocationNameEnum
 * JD-Core Version:    0.6.0
 */