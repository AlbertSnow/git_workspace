package com.wandoujia.plugin.qr.a;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.SurfaceHolder;
import java.io.IOException;

public final class e
{
  private final c a;
  private Camera b;
  private a c;
  private Rect d;
  private Rect e;
  private boolean f;
  private boolean g;
  private int h;
  private int i;
  private final g j;

  static
  {
    e.class.getSimpleName();
  }

  public e(Context paramContext)
  {
    this.a = new c(paramContext);
    this.j = new g(this.a);
  }

  private void a(int paramInt1, int paramInt2)
  {
    monitorenter;
    try
    {
      if (this.f)
      {
        Point localPoint = this.a.b();
        if (paramInt1 > localPoint.x)
          paramInt1 = localPoint.x;
        if (paramInt2 > localPoint.y)
          paramInt2 = localPoint.y;
        int k = (localPoint.x - paramInt1) / 2;
        int m = (localPoint.y - paramInt2) / 2;
        this.d = new Rect(k, m, k + paramInt1, m + paramInt2);
        new StringBuilder("Calculated manual framing rect: ").append(this.d);
        this.e = null;
      }
      while (true)
      {
        return;
        this.h = paramInt1;
        this.i = paramInt2;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a()
  {
    monitorenter;
    try
    {
      if (this.b != null)
      {
        this.b.release();
        this.b = null;
        this.d = null;
        this.e = null;
      }
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final void a(Handler paramHandler, int paramInt)
  {
    monitorenter;
    try
    {
      Camera localCamera = this.b;
      if ((localCamera != null) && (this.g))
      {
        this.j.a(paramHandler, paramInt);
        localCamera.setOneShotPreviewCallback(this.j);
      }
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a(SurfaceHolder paramSurfaceHolder)
  {
    monitorenter;
    try
    {
      localObject2 = this.b;
      if (localObject2 != null)
        break label107;
      int k = Build.VERSION.SDK_INT;
      int m = 0;
      if (k >= 9)
        while (true)
        {
          int n = Camera.getNumberOfCameras();
          if (m >= n)
            break label90;
          try
          {
            Camera localCamera = Camera.open(m);
            localObject2 = localCamera;
            if (localObject2 != null)
              break label90;
            m++;
          }
          catch (RuntimeException localRuntimeException)
          {
            while (true)
              new StringBuilder("Camera failed to open: ").append(localRuntimeException.getLocalizedMessage());
          }
        }
    }
    finally
    {
      monitorexit;
    }
    Object localObject2 = Camera.open();
    label90: if (localObject2 == null)
      throw new IOException();
    this.b = ((Camera)localObject2);
    label107: ((Camera)localObject2).setPreviewDisplay(paramSurfaceHolder);
    if (!this.f)
    {
      this.f = true;
      this.a.a((Camera)localObject2);
      if ((this.h > 0) && (this.i > 0))
      {
        a(this.h, this.i);
        this.h = 0;
        this.i = 0;
      }
    }
    this.a.b((Camera)localObject2);
    monitorexit;
  }

  // ERROR //
  public final void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 86	com/wandoujia/plugin/qr/a/e:b	Landroid/hardware/Camera;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +36 -> 44
    //   11: aload_0
    //   12: getfield 94	com/wandoujia/plugin/qr/a/e:g	Z
    //   15: istore_3
    //   16: iload_3
    //   17: ifne +27 -> 44
    //   20: aload_2
    //   21: invokevirtual 143	android/hardware/Camera:startPreview	()V
    //   24: aload_0
    //   25: iconst_1
    //   26: putfield 94	com/wandoujia/plugin/qr/a/e:g	Z
    //   29: aload_0
    //   30: new 145	com/wandoujia/plugin/qr/a/a
    //   33: dup
    //   34: aload_0
    //   35: getfield 86	com/wandoujia/plugin/qr/a/e:b	Landroid/hardware/Camera;
    //   38: invokespecial 147	com/wandoujia/plugin/qr/a/a:<init>	(Landroid/hardware/Camera;)V
    //   41: putfield 149	com/wandoujia/plugin/qr/a/e:c	Lcom/wandoujia/plugin/qr/a/a;
    //   44: aload_0
    //   45: monitorexit
    //   46: return
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    //   52: astore 4
    //   54: goto -10 -> 44
    //
    // Exception table:
    //   from	to	target	type
    //   2	7	47	finally
    //   11	16	47	finally
    //   20	44	47	finally
    //   20	44	52	java/lang/RuntimeException
  }

  public final void c()
  {
    monitorenter;
    try
    {
      if (this.c != null)
      {
        this.c.b();
        this.c = null;
      }
      if ((this.b != null) && (this.g))
      {
        this.b.stopPreview();
        this.j.a(null, 0);
        this.g = false;
      }
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final Rect d()
  {
    int k = 600;
    monitorenter;
    try
    {
      Rect localRect;
      Point localPoint;
      int m;
      label69: int n;
      if (this.d == null)
      {
        Camera localCamera = this.b;
        localRect = null;
        if (localCamera == null);
        do
        {
          return localRect;
          localPoint = this.a.b();
          localRect = null;
        }
        while (localPoint == null);
        m = 3 * localPoint.x / 4;
        if (m >= 240)
          break label165;
        k = 240;
        n = 3 * localPoint.y / 4;
        if (n >= 240)
          break label177;
        n = 240;
      }
      while (true)
      {
        int i1 = (localPoint.x - k) / 2;
        int i2 = (localPoint.y - n) / 2;
        this.d = new Rect(i1, i2, k + i1, n + i2);
        new StringBuilder("Calculated framing rect: ").append(this.d);
        localRect = this.d;
        break;
        label165: if (m > k)
          break label69;
        k = m;
        break label69;
        label177: if (n <= 400)
          continue;
        n = 400;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final Rect e()
  {
    monitorenter;
    try
    {
      Rect localRect2;
      Rect localRect1;
      if (this.e == null)
      {
        localRect2 = d();
        localRect1 = null;
        if (localRect2 != null);
      }
      while (true)
      {
        return localRect1;
        Rect localRect3 = new Rect(localRect2);
        Point localPoint1 = this.a.a();
        Point localPoint2 = this.a.b();
        localRect1 = null;
        if (localPoint1 == null)
          continue;
        localRect1 = null;
        if (localPoint2 == null)
          continue;
        localRect3.left = (localRect3.left * localPoint1.y / localPoint2.x);
        localRect3.right = (localRect3.right * localPoint1.y / localPoint2.x);
        localRect3.top = (localRect3.top * localPoint1.x / localPoint2.y);
        localRect3.bottom = (localRect3.bottom * localPoint1.x / localPoint2.y);
        this.e = localRect3;
        localRect1 = this.e;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.plugin.qr.a.e
 * JD-Core Version:    0.6.0
 */