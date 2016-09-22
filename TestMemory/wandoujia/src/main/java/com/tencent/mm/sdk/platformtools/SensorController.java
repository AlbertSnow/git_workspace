package com.tencent.mm.sdk.platformtools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

public class SensorController extends BroadcastReceiver
  implements SensorEventListener
{
  private static float a = 4.294967E+009F;
  private boolean b;

  public void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.intent.action.HEADSET_PLUG"))
    {
      int i = paramIntent.getIntExtra("state", 0);
      if (i == 1)
        this.b = true;
      if (i == 0)
        this.b = false;
    }
  }

  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    if (this.b);
    float f;
    do
    {
      return;
      f = paramSensorEvent.values[0];
      switch (paramSensorEvent.sensor.getType())
      {
      default:
        return;
      case 8:
      }
    }
    while (f >= a);
    a = f;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.SensorController
 * JD-Core Version:    0.6.0
 */