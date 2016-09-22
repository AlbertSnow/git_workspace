import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

final class akh
  implements aiq, air
{
  akh(ajy paramajy)
  {
  }

  public final void a(int paramInt)
  {
  }

  public final void a(Bundle paramBundle)
  {
    this.a.e.a(new akf(this.a));
  }

  public final void a(ConnectionResult paramConnectionResult)
  {
    this.a.b.lock();
    try
    {
      if (this.a.a(paramConnectionResult))
      {
        this.a.f();
        this.a.e();
      }
      while (true)
      {
        return;
        this.a.b(paramConnectionResult);
      }
    }
    finally
    {
      this.a.b.unlock();
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     akh
 * JD-Core Version:    0.6.0
 */