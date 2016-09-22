package com.tencent.mm.sdk.platformtools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;

public class LBSManager extends BroadcastReceiver
{
  private static a a;
  private int b;

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Location localLocation = (Location)paramIntent.getExtras().get("location");
    this.b = (1 + this.b);
    if (localLocation != null)
    {
      boolean bool = "gps".equals(localLocation.getProvider());
      if (((bool) && (localLocation.getAccuracy() <= 200.0F)) || ((!bool) && (localLocation.getAccuracy() <= 1000.0F) && (localLocation.getAccuracy() > 0.0F)))
        if (!bool)
          break label182;
    }
    label182: for (int i = 0; ; i = 1)
    {
      float f1 = (float)localLocation.getLatitude();
      float f2 = (float)localLocation.getLongitude();
      int j = (int)localLocation.getAccuracy();
      if (j != 0)
      {
        new StringBuilder("setLocationCache [").append(f1).append(",").append(f2).append("] acc:").append(j).append(" source:").append(i);
        b.d("MicroMsg.LBSManager");
        if (a == null)
          a = new a();
        System.currentTimeMillis();
      }
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.LBSManager
 * JD-Core Version:    0.6.0
 */