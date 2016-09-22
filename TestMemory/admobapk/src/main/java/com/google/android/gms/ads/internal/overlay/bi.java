package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.report.client.a;

@a
final class bi
  implements SensorEventListener
{
  final SensorManager a;
  Handler b;
  bk c;
  private final Object d;
  private final Display e;
  private final float[] f;
  private final float[] g;
  private float[] h;

  bi(Context paramContext)
  {
    this.a = ((SensorManager)paramContext.getSystemService("sensor"));
    this.e = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    this.f = new float[9];
    this.g = new float[9];
    this.d = new Object();
  }

  private final void a(int paramInt1, int paramInt2)
  {
    float f1 = this.g[paramInt1];
    this.g[paramInt1] = this.g[paramInt2];
    this.g[paramInt2] = f1;
  }

  final void a()
  {
    if (this.b == null)
      return;
    this.a.unregisterListener(this);
    this.b.post(new bj(this));
    this.b = null;
  }

  final boolean a(float[] paramArrayOfFloat)
  {
    synchronized (this.d)
    {
      if (this.h == null)
        return false;
      System.arraycopy(this.h, 0, paramArrayOfFloat, 0, this.h.length);
      return true;
    }
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    float[] arrayOfFloat = paramSensorEvent.values;
    if ((arrayOfFloat[0] != 0.0F) || (arrayOfFloat[1] != 0.0F) || (arrayOfFloat[2] != 0.0F));
    while (true)
    {
      synchronized (this.d)
      {
        if (this.h != null)
          continue;
        this.h = new float[9];
        SensorManager.getRotationMatrixFromVector(this.f, arrayOfFloat);
        switch (this.e.getRotation())
        {
        default:
          System.arraycopy(this.f, 0, this.g, 0, 9);
          a(1, 3);
          a(2, 6);
          a(5, 7);
        case 1:
        case 2:
        case 3:
        }
      }
      synchronized (this.d)
      {
        System.arraycopy(this.g, 0, this.h, 0, 9);
        if (this.c != null)
          this.c.a();
        return;
        localObject2 = finally;
        monitorexit;
        throw localObject2;
        SensorManager.remapCoordinateSystem(this.f, 2, 129, this.g);
        continue;
        SensorManager.remapCoordinateSystem(this.f, 129, 130, this.g);
        continue;
        SensorManager.remapCoordinateSystem(this.f, 130, 1, this.g);
      }
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.bi
 * JD-Core Version:    0.6.0
 */