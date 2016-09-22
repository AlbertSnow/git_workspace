package com.alipay.mobilesecuritysdk.constant;

public enum WifiInfoEnum
{
  private String value;

  static
  {
    BSSID = new WifiInfoEnum("BSSID", 2, "bssid");
    SSID = new WifiInfoEnum("SSID", 3, "ssid");
    LEVEL = new WifiInfoEnum("LEVEL", 4, "level");
    CURRENT = new WifiInfoEnum("CURRENT", 5, "isCurrent");
    TIME = new WifiInfoEnum("TIME", 6, "time");
    START_TAG = new WifiInfoEnum("START_TAG", 7, "wifi");
    WifiInfoEnum[] arrayOfWifiInfoEnum = new WifiInfoEnum[8];
    arrayOfWifiInfoEnum[0] = CURRENT_WIFI_ITEM;
    arrayOfWifiInfoEnum[1] = WIFI_ITEM;
    arrayOfWifiInfoEnum[2] = BSSID;
    arrayOfWifiInfoEnum[3] = SSID;
    arrayOfWifiInfoEnum[4] = LEVEL;
    arrayOfWifiInfoEnum[5] = CURRENT;
    arrayOfWifiInfoEnum[6] = TIME;
    arrayOfWifiInfoEnum[7] = START_TAG;
    ENUM$VALUES = arrayOfWifiInfoEnum;
  }

  private WifiInfoEnum(String arg3)
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
 * Qualified Name:     com.alipay.mobilesecuritysdk.constant.WifiInfoEnum
 * JD-Core Version:    0.6.0
 */