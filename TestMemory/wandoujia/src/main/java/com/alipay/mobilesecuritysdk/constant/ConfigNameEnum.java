package com.alipay.mobilesecuritysdk.constant;

public enum ConfigNameEnum
{
  private String value;

  static
  {
    MAIN_SWITCH_INTERVAL = new ConfigNameEnum("MAIN_SWITCH_INTERVAL", 2, "mainSwitchInterval");
    LOCATE_LUT = new ConfigNameEnum("LOCATE_LUT", 3, "locateLUT");
    LOCATE_INTERVAL = new ConfigNameEnum("LOCATE_INTERVAL", 4, "locateInterval");
    APP_LUT = new ConfigNameEnum("APP_LUT", 5, "appLUT");
    APP_INTERVAL = new ConfigNameEnum("APP_INTERVAL", 6, "appInterval");
    PACKAGE_CHANGED = new ConfigNameEnum("PACKAGE_CHANGED", 7, "pkgchanged");
    LOCATION_MAX_LINES = new ConfigNameEnum("LOCATION_MAX_LINES", 8, "locationMaxLines");
    CONFIGS = new ConfigNameEnum("CONFIGS", 9, "configs");
    ConfigNameEnum[] arrayOfConfigNameEnum = new ConfigNameEnum[10];
    arrayOfConfigNameEnum[0] = MAIN_SWITCH_LUT;
    arrayOfConfigNameEnum[1] = MAIN_SWITCH_STATE;
    arrayOfConfigNameEnum[2] = MAIN_SWITCH_INTERVAL;
    arrayOfConfigNameEnum[3] = LOCATE_LUT;
    arrayOfConfigNameEnum[4] = LOCATE_INTERVAL;
    arrayOfConfigNameEnum[5] = APP_LUT;
    arrayOfConfigNameEnum[6] = APP_INTERVAL;
    arrayOfConfigNameEnum[7] = PACKAGE_CHANGED;
    arrayOfConfigNameEnum[8] = LOCATION_MAX_LINES;
    arrayOfConfigNameEnum[9] = CONFIGS;
    ENUM$VALUES = arrayOfConfigNameEnum;
  }

  private ConfigNameEnum(String arg3)
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
 * Qualified Name:     com.alipay.mobilesecuritysdk.constant.ConfigNameEnum
 * JD-Core Version:    0.6.0
 */