package com.wandoujia.plugin.qr.a;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Timer;
import java.util.TimerTask;

final class a
  implements Camera.AutoFocusCallback
{
  private static final Collection<String> a;
  private boolean b;
  private final boolean c;
  private final Camera d;
  private final Timer e;
  private TimerTask f;

  static
  {
    a.class.getSimpleName();
    ArrayList localArrayList = new ArrayList(2);
    a = localArrayList;
    localArrayList.add("auto");
    a.add("macro");
  }

  a(Camera paramCamera)
  {
    this.d = paramCamera;
    this.e = new Timer(bool);
    String str = paramCamera.getParameters().getFocusMode();
    if ((com.wandoujia.plugin.qr.b.a()) && (a.contains(str)));
    while (true)
    {
      this.c = bool;
      new StringBuilder("Current focus mode '").append(str).append("'; use auto focus? ").append(this.c);
      a();
      return;
      bool = false;
    }
  }

  // ERROR //
  final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 77	com/wandoujia/plugin/qr/a/a:c	Z
    //   6: ifeq +16 -> 22
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield 98	com/wandoujia/plugin/qr/a/a:b	Z
    //   14: aload_0
    //   15: getfield 49	com/wandoujia/plugin/qr/a/a:d	Landroid/hardware/Camera;
    //   18: aload_0
    //   19: invokevirtual 104	android/hardware/Camera:autoFocus	(Landroid/hardware/Camera$AutoFocusCallback;)V
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    //   30: astore_2
    //   31: goto -9 -> 22
    //
    // Exception table:
    //   from	to	target	type
    //   2	14	25	finally
    //   14	22	25	finally
    //   14	22	30	java/lang/RuntimeException
  }

  // ERROR //
  final void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 77	com/wandoujia/plugin/qr/a/a:c	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +10 -> 18
    //   11: aload_0
    //   12: getfield 49	com/wandoujia/plugin/qr/a/a:d	Landroid/hardware/Camera;
    //   15: invokevirtual 107	android/hardware/Camera:cancelAutoFocus	()V
    //   18: aload_0
    //   19: getfield 109	com/wandoujia/plugin/qr/a/a:f	Ljava/util/TimerTask;
    //   22: ifnull +16 -> 38
    //   25: aload_0
    //   26: getfield 109	com/wandoujia/plugin/qr/a/a:f	Ljava/util/TimerTask;
    //   29: invokevirtual 114	java/util/TimerTask:cancel	()Z
    //   32: pop
    //   33: aload_0
    //   34: aconst_null
    //   35: putfield 109	com/wandoujia/plugin/qr/a/a:f	Ljava/util/TimerTask;
    //   38: aload_0
    //   39: iconst_0
    //   40: putfield 98	com/wandoujia/plugin/qr/a/a:b	Z
    //   43: aload_0
    //   44: monitorexit
    //   45: return
    //   46: astore_1
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_1
    //   50: athrow
    //   51: astore 4
    //   53: goto -35 -> 18
    //
    // Exception table:
    //   from	to	target	type
    //   2	7	46	finally
    //   11	18	46	finally
    //   18	38	46	finally
    //   38	43	46	finally
    //   11	18	51	java/lang/RuntimeException
  }

  public final void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    monitorenter;
    try
    {
      if (this.b)
      {
        this.f = new b(this);
        this.e.schedule(this.f, 2000L);
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
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.plugin.qr.a.a
 * JD-Core Version:    0.6.0
 */