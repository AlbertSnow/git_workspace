import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.ads.afma.nano.d;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class aqh
  implements alz, ama
{
  private aqi a;
  private final String b;
  private final String c;
  private final LinkedBlockingQueue d;
  private final HandlerThread e;

  public aqh(Context paramContext, String paramString1, String paramString2)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.e = new HandlerThread("GassClient");
    this.e.start();
    this.a = new aqi(paramContext, this.e.getLooper(), this, this);
    this.d = new LinkedBlockingQueue();
    this.a.i();
  }

  private aql a()
  {
    try
    {
      aql localaql = (aql)this.a.l();
      return localaql;
    }
    catch (DeadObjectException localDeadObjectException)
    {
    }
    return null;
  }

  private void b()
  {
    if (this.a != null)
      this.a.d();
  }

  public final void a(int paramInt)
  {
  }

  // ERROR //
  public final void a(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 74	aqh:a	()Laql;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull +59 -> 65
    //   9: aload_2
    //   10: new 76	com/google/android/gms/gass/internal/GassRequestParcel
    //   13: dup
    //   14: aload_0
    //   15: getfield 24	aqh:b	Ljava/lang/String;
    //   18: aload_0
    //   19: getfield 26	aqh:c	Ljava/lang/String;
    //   22: invokespecial 79	com/google/android/gms/gass/internal/GassRequestParcel:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: invokeinterface 82 2 0
    //   30: astore 7
    //   32: aload 7
    //   34: invokevirtual 86	com/google/android/gms/gass/internal/GassResponseParcel:a	()V
    //   37: aload 7
    //   39: getfield 89	com/google/android/gms/gass/internal/GassResponseParcel:b	Lcom/google/ads/afma/nano/d;
    //   42: astore 8
    //   44: aload_0
    //   45: getfield 54	aqh:d	Ljava/util/concurrent/LinkedBlockingQueue;
    //   48: aload 8
    //   50: invokevirtual 93	java/util/concurrent/LinkedBlockingQueue:put	(Ljava/lang/Object;)V
    //   53: aload_0
    //   54: invokespecial 95	aqh:b	()V
    //   57: aload_0
    //   58: getfield 35	aqh:e	Landroid/os/HandlerThread;
    //   61: invokevirtual 99	android/os/HandlerThread:quit	()Z
    //   64: pop
    //   65: return
    //   66: astore 5
    //   68: aload_0
    //   69: invokespecial 95	aqh:b	()V
    //   72: aload_0
    //   73: getfield 35	aqh:e	Landroid/os/HandlerThread;
    //   76: invokevirtual 99	android/os/HandlerThread:quit	()Z
    //   79: pop
    //   80: return
    //   81: astore_3
    //   82: aload_0
    //   83: invokespecial 95	aqh:b	()V
    //   86: aload_0
    //   87: getfield 35	aqh:e	Landroid/os/HandlerThread;
    //   90: invokevirtual 99	android/os/HandlerThread:quit	()Z
    //   93: pop
    //   94: aload_3
    //   95: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   9	53	66	java/lang/Throwable
    //   9	53	81	finally
  }

  public final void a(ConnectionResult paramConnectionResult)
  {
  }

  public final d b(int paramInt)
  {
    try
    {
      locald = (d)this.d.poll(2000L, TimeUnit.MILLISECONDS);
      if (locald == null)
        locald = new d();
      return locald;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        d locald = null;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aqh
 * JD-Core Version:    0.6.0
 */