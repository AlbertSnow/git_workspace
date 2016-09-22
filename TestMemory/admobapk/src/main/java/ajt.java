import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

final class ajt
  implements alb
{
  ajt(ajs paramajs)
  {
  }

  public final void a(int paramInt, boolean paramBoolean)
  {
    this.a.h.lock();
    try
    {
      if ((this.a.g) || (this.a.f == null) || (!this.a.f.b()))
      {
        this.a.g = false;
        this.a.a(paramInt, paramBoolean);
        return;
      }
      this.a.g = true;
      this.a.c.a(paramInt);
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
      ajs localajs2;
      try
      {
        ajs localajs1 = this.a;
        if (localajs1.d != null)
          continue;
        localajs1.d = paramBundle;
        this.a.e = ConnectionResult.a;
        localajs2 = this.a;
        if (!ajs.b(localajs2.e))
          break label235;
        if ((!ajs.b(localajs2.f)) && (!localajs2.e()))
          break label189;
        switch (localajs2.i)
        {
        default:
          Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
          localajs2.i = 0;
          return;
          if (paramBundle == null)
            continue;
          localajs1.d.putAll(paramBundle);
          continue;
        case 2:
        case 1:
        }
      }
      finally
      {
        this.a.h.unlock();
      }
      localajs2.a.a(localajs2.d);
      localajs2.d();
      continue;
      label189: if (localajs2.f == null)
        continue;
      if (localajs2.i == 1)
      {
        localajs2.d();
        continue;
      }
      localajs2.a(localajs2.f);
      localajs2.b.b();
      continue;
      label235: if ((localajs2.e != null) && (ajs.b(localajs2.f)))
      {
        localajs2.c.b();
        localajs2.a(localajs2.e);
        continue;
      }
      if ((localajs2.e == null) || (localajs2.f == null))
        continue;
      ConnectionResult localConnectionResult = localajs2.e;
      if (localajs2.c.l < localajs2.b.l)
        localConnectionResult = localajs2.f;
      localajs2.a(localConnectionResult);
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
        this.a.e = paramConnectionResult;
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
 * Qualified Name:     ajt
 * JD-Core Version:    0.6.0
 */