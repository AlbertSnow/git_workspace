package com.alipay.wandoujia;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

final class z
  implements LocationListener
{
  public final void onLocationChanged(Location paramLocation)
  {
    if (paramLocation != null)
    {
      y.a(paramLocation.getLatitude());
      y.b(paramLocation.getLongitude());
    }
  }

  public final void onProviderDisabled(String paramString)
  {
    y.a(-1.0D);
    y.b(-1.0D);
  }

  public final void onProviderEnabled(String paramString)
  {
  }

  public final void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.z
 * JD-Core Version:    0.6.0
 */