import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

final class aka
  implements amd
{
  final int a;
  private final WeakReference b;
  private final aia c;

  public aka(ajy paramajy, aia paramaia, int paramInt)
  {
    this.b = new WeakReference(paramajy);
    this.c = paramaia;
    this.a = paramInt;
  }

  public final void a(ConnectionResult paramConnectionResult)
  {
    ajy localajy = (ajy)this.b.get();
    if (localajy == null)
      return;
    Looper localLooper1 = Looper.myLooper();
    Looper localLooper2 = localajy.a.m.c;
    boolean bool1 = false;
    if (localLooper1 == localLooper2)
      bool1 = true;
    anw.a(bool1, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
    localajy.b.lock();
    try
    {
      boolean bool2 = localajy.b(0);
      if (!bool2)
        return;
      if (!paramConnectionResult.b())
        localajy.b(paramConnectionResult, this.c, this.a);
      if (localajy.d())
        localajy.e();
      return;
    }
    finally
    {
      localajy.b.unlock();
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aka
 * JD-Core Version:    0.6.0
 */