import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

final class aju
  implements alb
{
  aju(ajs paramajs)
  {
  }

  public final void a(int paramInt, boolean paramBoolean)
  {
    this.a.h.lock();
    try
    {
      if (this.a.g)
      {
        this.a.g = false;
        this.a.a(paramInt, paramBoolean);
        return;
      }
      this.a.g = true;
      this.a.b.a(paramInt);
      return;
    }
    finally
    {
      this.a.h.unlock();
    }
    throw localObject;
  }

  public final void a(Bundle paramBundle)
  {
    this.a.h.lock();
    while (true)
    {
      ajs localajs;
      try
      {
        this.a.f = ConnectionResult.a;
        localajs = this.a;
        if (!ajs.b(localajs.e))
          break label186;
        if ((ajs.b(localajs.f)) || (localajs.e()))
        {
          switch (localajs.i)
          {
          default:
            Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            localajs.i = 0;
            return;
          case 2:
            localajs.a.a(localajs.d);
          case 1:
          }
          localajs.d();
          continue;
        }
      }
      finally
      {
        this.a.h.unlock();
      }
      if (localajs.f == null)
        continue;
      if (localajs.i == 1)
      {
        localajs.d();
        continue;
      }
      localajs.a(localajs.f);
      localajs.b.b();
      continue;
      label186: if ((localajs.e != null) && (ajs.b(localajs.f)))
      {
        localajs.c.b();
        localajs.a(localajs.e);
        continue;
      }
      if ((localajs.e == null) || (localajs.f == null))
        continue;
      ConnectionResult localConnectionResult = localajs.e;
      if (localajs.c.l < localajs.b.l)
        localConnectionResult = localajs.f;
      localajs.a(localConnectionResult);
    }
  }

  public final void a(ConnectionResult paramConnectionResult)
  {
    this.a.h.lock();
    while (true)
    {
      ajs localajs;
      try
      {
        this.a.f = paramConnectionResult;
        localajs = this.a;
        if (!ajs.b(localajs.e))
          break label186;
        if ((ajs.b(localajs.f)) || (localajs.e()))
        {
          switch (localajs.i)
          {
          default:
            Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            localajs.i = 0;
            return;
          case 2:
            localajs.a.a(localajs.d);
          case 1:
          }
          localajs.d();
          continue;
        }
      }
      finally
      {
        this.a.h.unlock();
      }
      if (localajs.f == null)
        continue;
      if (localajs.i == 1)
      {
        localajs.d();
        continue;
      }
      localajs.a(localajs.f);
      localajs.b.b();
      continue;
      label186: if ((localajs.e != null) && (ajs.b(localajs.f)))
      {
        localajs.c.b();
        localajs.a(localajs.e);
        continue;
      }
      if ((localajs.e == null) || (localajs.f == null))
        continue;
      ConnectionResult localConnectionResult = localajs.e;
      if (localajs.c.l < localajs.b.l)
        localConnectionResult = localajs.f;
      localajs.a(localConnectionResult);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aju
 * JD-Core Version:    0.6.0
 */