package com.wandoujia.base.infos;

import android.content.pm.FeatureInfo;
import java.util.HashMap;

public class FeatureInfos
{
  private static final long FEATURE_AUDIO_LOW_LATENCY = 34359738368L;
  private static final long FEATURE_BLUETOOTH = 17179869184L;
  private static final long FEATURE_CAMERA = 8589934592L;
  private static final long FEATURE_CAMERA_ANY = 68719476736L;
  private static final long FEATURE_CAMERA_AUTOFOCUS = 4294967296L;
  private static final long FEATURE_CAMERA_FLASH = 2147483648L;
  private static final long FEATURE_CAMERA_FRONT = 1073741824L;
  private static final long FEATURE_FAKETOUCH = 536870912L;
  private static final long FEATURE_FAKETOUCH_MULTITOUCH_DISTINCT = 268435456L;
  private static final long FEATURE_FAKETOUCH_MULTITOUCH_JAZZHAND = 134217728L;
  private static final long FEATURE_LIVE_WALLPAPER = 67108864L;
  private static final long FEATURE_LOCATION = 33554432L;
  private static final long FEATURE_LOCATION_GPS = 16777216L;
  private static final long FEATURE_LOCATION_NETWORK = 8388608L;
  private static final long FEATURE_MICROPHONE = 4194304L;
  private static final long FEATURE_NFC = 2097152L;
  private static final long FEATURE_SCREEN_LANDSCAPE = 1048576L;
  private static final long FEATURE_SCREEN_PORTRAIT = 524288L;
  private static final long FEATURE_SENSOR_ACCELEROMETER = 262144L;
  private static final long FEATURE_SENSOR_BAROMETER = 131072L;
  private static final long FEATURE_SENSOR_COMPASS = 65536L;
  private static final long FEATURE_SENSOR_GYROSCOPE = 32768L;
  private static final long FEATURE_SENSOR_LIGHT = 16384L;
  private static final long FEATURE_SENSOR_PROXIMITY = 8192L;
  private static final long FEATURE_SIP = 4096L;
  private static final long FEATURE_SIP_VOIP = 2048L;
  private static final long FEATURE_TELEPHONY = 1024L;
  private static final long FEATURE_TELEPHONY_CDMA = 512L;
  private static final long FEATURE_TELEPHONY_GSM = 256L;
  private static final long FEATURE_TELEVISION = 137438953472L;
  private static final long FEATURE_TOUCHSCREEN = 128L;
  private static final long FEATURE_TOUCHSCREEN_MULTITOUCH = 64L;
  private static final long FEATURE_TOUCHSCREEN_MULTITOUCH_DISTINCT = 32L;
  private static final long FEATURE_TOUCHSCREEN_MULTITOUCH_JAZZHAND = 16L;
  private static final long FEATURE_USB_ACCESSORY = 8L;
  private static final long FEATURE_USB_HOST = 4L;
  private static final long FEATURE_WIFI = 2L;
  private static final long FEATURE_WIFI_DIRECT = 1L;

  public static long genFeatureInfos(FeatureInfo[] paramArrayOfFeatureInfo)
  {
    long l1 = 0L;
    if ((paramArrayOfFeatureInfo == null) || (paramArrayOfFeatureInfo.length == 0))
      return l1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("android.hardware.type.television", Long.valueOf(137438953472L));
    localHashMap.put("android.hardware.camera.any", Long.valueOf(68719476736L));
    localHashMap.put("android.hardware.audio.low_latency", Long.valueOf(34359738368L));
    localHashMap.put("android.hardware.bluetooth", Long.valueOf(17179869184L));
    localHashMap.put("android.hardware.camera", Long.valueOf(8589934592L));
    localHashMap.put("android.hardware.camera.autofocus", Long.valueOf(4294967296L));
    localHashMap.put("android.hardware.camera.flash", Long.valueOf(2147483648L));
    localHashMap.put("android.hardware.camera.front", Long.valueOf(1073741824L));
    localHashMap.put("android.hardware.faketouch", Long.valueOf(536870912L));
    localHashMap.put("android.hardware.faketouch.multitouch.distinct", Long.valueOf(268435456L));
    localHashMap.put("android.hardware.faketouch.multitouch.jazzhand", Long.valueOf(134217728L));
    localHashMap.put("android.software.live_wallpaper", Long.valueOf(67108864L));
    localHashMap.put("android.hardware.location", Long.valueOf(33554432L));
    localHashMap.put("android.hardware.location.gps", Long.valueOf(16777216L));
    localHashMap.put("android.hardware.location.network", Long.valueOf(8388608L));
    localHashMap.put("android.hardware.microphone", Long.valueOf(4194304L));
    localHashMap.put("android.hardware.nfc", Long.valueOf(2097152L));
    localHashMap.put("android.hardware.screen.landscape", Long.valueOf(1048576L));
    localHashMap.put("android.hardware.screen.portrait", Long.valueOf(524288L));
    localHashMap.put("android.hardware.sensor.accelerometer", Long.valueOf(262144L));
    localHashMap.put("android.hardware.sensor.barometer", Long.valueOf(131072L));
    localHashMap.put("android.hardware.sensor.compass", Long.valueOf(65536L));
    localHashMap.put("android.hardware.sensor.gyroscope", Long.valueOf(32768L));
    localHashMap.put("android.hardware.sensor.light", Long.valueOf(16384L));
    localHashMap.put("android.hardware.sensor.proximity", Long.valueOf(8192L));
    localHashMap.put("android.software.sip", Long.valueOf(4096L));
    localHashMap.put("android.software.sip.voip", Long.valueOf(2048L));
    localHashMap.put("android.hardware.telephony", Long.valueOf(1024L));
    localHashMap.put("android.hardware.telephony.cdma", Long.valueOf(512L));
    localHashMap.put("android.hardware.telephony.gsm", Long.valueOf(256L));
    localHashMap.put("android.hardware.touchscreen", Long.valueOf(128L));
    localHashMap.put("android.hardware.touchscreen.multitouch", Long.valueOf(64L));
    localHashMap.put("android.hardware.touchscreen.multitouch.distinct", Long.valueOf(32L));
    localHashMap.put("android.hardware.touchscreen.multitouch.jazzhand", Long.valueOf(16L));
    localHashMap.put("android.hardware.usb.accessory", Long.valueOf(8L));
    localHashMap.put("android.hardware.usb.host", Long.valueOf(4L));
    localHashMap.put("android.hardware.wifi", Long.valueOf(2L));
    localHashMap.put("android.hardware.wifi.direct", Long.valueOf(1L));
    int i = paramArrayOfFeatureInfo.length;
    int j = 0;
    label520: long l2;
    if (j < i)
    {
      FeatureInfo localFeatureInfo = paramArrayOfFeatureInfo[j];
      if (!localHashMap.containsKey(localFeatureInfo.name))
        break label573;
      l2 = l1 | ((Long)localHashMap.get(localFeatureInfo.name)).longValue();
    }
    while (true)
    {
      j++;
      l1 = l2;
      break label520;
      break;
      label573: l2 = l1;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.infos.FeatureInfos
 * JD-Core Version:    0.6.0
 */