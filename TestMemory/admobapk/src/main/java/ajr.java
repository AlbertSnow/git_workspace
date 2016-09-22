import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

public final class ajr
  implements aiq, air
{
  public final aia a;
  akp b;
  private final int c;

  public ajr(aia paramaia, int paramInt)
  {
    this.a = paramaia;
    this.c = paramInt;
  }

  private final void a()
  {
    anw.a(this.b, "Callbacks must be attached to a GoogleApiClient instance before connecting the client.");
  }

  public final void a(int paramInt)
  {
    a();
    this.b.a(paramInt);
  }

  public final void a(Bundle paramBundle)
  {
    a();
    akp localakp = this.b;
    localakp.a.lock();
    try
    {
      localakp.k.a(paramBundle);
      return;
    }
    finally
    {
      localakp.a.unlock();
    }
    throw localObject;
  }

  public final void a(ConnectionResult paramConnectionResult)
  {
    a();
    akp localakp = this.b;
    aia localaia = this.a;
    int i = this.c;
    localakp.a.lock();
    try
    {
      localakp.k.a(paramConnectionResult, localaia, i);
      return;
    }
    finally
    {
      localakp.a.unlock();
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ajr
 * JD-Core Version:    0.6.0
 */