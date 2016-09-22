package de.greenrobot.event;

import android.os.Handler;
import android.os.Looper;

final class h extends Handler
{
  private final k a;
  private final c b;
  private boolean c;

  h(c paramc, Looper paramLooper)
  {
    super(paramLooper);
    this.b = paramc;
    this.a = new k();
  }

  final void a(o paramo, Object paramObject)
  {
    j localj = j.a(paramo, paramObject);
    monitorenter;
    try
    {
      this.a.a(localj);
      if (!this.c)
      {
        this.c = true;
        if (!sendMessage(obtainMessage()))
          throw new EventBusException("Could not send handler message");
      }
    }
    finally
    {
      monitorexit;
    }
    monitorexit;
  }

  // ERROR //
  public final void handleMessage(android.os.Message paramMessage)
  {
    // Byte code:
    //   0: invokestatic 58	android/os/SystemClock:uptimeMillis	()J
    //   3: lstore_3
    //   4: aload_0
    //   5: getfield 24	de/greenrobot/event/h:a	Lde/greenrobot/event/k;
    //   8: invokevirtual 61	de/greenrobot/event/k:a	()Lde/greenrobot/event/j;
    //   11: astore 5
    //   13: aload 5
    //   15: ifnonnull +34 -> 49
    //   18: aload_0
    //   19: monitorenter
    //   20: aload_0
    //   21: getfield 24	de/greenrobot/event/h:a	Lde/greenrobot/event/k;
    //   24: invokevirtual 61	de/greenrobot/event/k:a	()Lde/greenrobot/event/j;
    //   27: astore 5
    //   29: aload 5
    //   31: ifnonnull +16 -> 47
    //   34: aload_0
    //   35: iconst_0
    //   36: putfield 35	de/greenrobot/event/h:c	Z
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_0
    //   42: iconst_0
    //   43: putfield 35	de/greenrobot/event/h:c	Z
    //   46: return
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_0
    //   50: getfield 17	de/greenrobot/event/h:b	Lde/greenrobot/event/c;
    //   53: aload 5
    //   55: invokevirtual 64	de/greenrobot/event/c:a	(Lde/greenrobot/event/j;)V
    //   58: invokestatic 58	android/os/SystemClock:uptimeMillis	()J
    //   61: lload_3
    //   62: lsub
    //   63: ldc2_w 65
    //   66: lcmp
    //   67: iflt -63 -> 4
    //   70: aload_0
    //   71: aload_0
    //   72: invokevirtual 39	de/greenrobot/event/h:obtainMessage	()Landroid/os/Message;
    //   75: invokevirtual 43	de/greenrobot/event/h:sendMessage	(Landroid/os/Message;)Z
    //   78: ifne +28 -> 106
    //   81: new 45	de/greenrobot/event/EventBusException
    //   84: dup
    //   85: ldc 47
    //   87: invokespecial 50	de/greenrobot/event/EventBusException:<init>	(Ljava/lang/String;)V
    //   90: athrow
    //   91: astore_2
    //   92: aload_0
    //   93: iconst_0
    //   94: putfield 35	de/greenrobot/event/h:c	Z
    //   97: aload_2
    //   98: athrow
    //   99: astore 6
    //   101: aload_0
    //   102: monitorexit
    //   103: aload 6
    //   105: athrow
    //   106: aload_0
    //   107: iconst_1
    //   108: putfield 35	de/greenrobot/event/h:c	Z
    //   111: return
    //
    // Exception table:
    //   from	to	target	type
    //   0	4	91	finally
    //   4	13	91	finally
    //   18	20	91	finally
    //   49	91	91	finally
    //   103	106	91	finally
    //   20	29	99	finally
    //   34	41	99	finally
    //   47	49	99	finally
    //   101	103	99	finally
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     de.greenrobot.event.h
 * JD-Core Version:    0.6.0
 */