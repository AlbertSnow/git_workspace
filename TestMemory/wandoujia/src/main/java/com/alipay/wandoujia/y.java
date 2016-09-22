package com.alipay.wandoujia;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

public final class y
{
  private static double a = -1.0D;
  private static double b = -1.0D;

  public static String a()
  {
    return b + ";" + a;
  }

  public static void a(Context paramContext)
  {
    try
    {
      LocationManager localLocationManager = (LocationManager)paramContext.getSystemService("location");
      if (localLocationManager.isProviderEnabled("gps"))
      {
        Location localLocation2 = localLocationManager.getLastKnownLocation("gps");
        if (localLocation2 != null)
        {
          a = localLocation2.getLatitude();
          b = localLocation2.getLongitude();
          return;
        }
      }
      else
      {
        localLocationManager.requestLocationUpdates("network", 1000L, 0.0F, new z());
        Location localLocation1 = localLocationManager.getLastKnownLocation("network");
        if (localLocation1 != null)
        {
          a = localLocation1.getLatitude();
          b = localLocation1.getLongitude();
          return;
        }
      }
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.y
 * JD-Core Version:    0.6.0
 */