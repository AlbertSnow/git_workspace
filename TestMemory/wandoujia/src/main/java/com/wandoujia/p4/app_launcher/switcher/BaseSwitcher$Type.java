package com.wandoujia.p4.app_launcher.switcher;

public enum BaseSwitcher$Type
{
  static
  {
    MobileData = new Type("MobileData", 1);
    AirplaneMode = new Type("AirplaneMode", 2);
    Bluetooth = new Type("Bluetooth", 3);
    ScreenRotation = new Type("ScreenRotation", 4);
    FlashLight = new Type("FlashLight", 5);
    ScreenLight = new Type("ScreenLight", 6);
    RingerMode = new Type("RingerMode", 7);
    Type[] arrayOfType = new Type[8];
    arrayOfType[0] = Wifi;
    arrayOfType[1] = MobileData;
    arrayOfType[2] = AirplaneMode;
    arrayOfType[3] = Bluetooth;
    arrayOfType[4] = ScreenRotation;
    arrayOfType[5] = FlashLight;
    arrayOfType[6] = ScreenLight;
    arrayOfType[7] = RingerMode;
    $VALUES = arrayOfType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.switcher.BaseSwitcher.Type
 * JD-Core Version:    0.6.0
 */