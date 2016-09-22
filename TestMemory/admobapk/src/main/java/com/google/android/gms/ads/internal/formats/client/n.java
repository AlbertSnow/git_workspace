package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.RemoteException;
import apj;
import com.google.android.gms.ads.formats.f;
import com.google.android.gms.ads.internal.util.client.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@com.google.android.gms.ads.internal.report.client.a
public final class n extends f
{
  private final k a;
  private final List b = new ArrayList();
  private final d c;

  public n(k paramk)
  {
    this.a = paramk;
    while (true)
    {
      a locala2;
      try
      {
        List localList = this.a.b();
        if (localList != null)
        {
          Iterator localIterator = localList.iterator();
          if (localIterator.hasNext())
          {
            Object localObject = localIterator.next();
            if (!(localObject instanceof IBinder))
              break label150;
            locala2 = b.a((IBinder)localObject);
            if (locala2 == null)
              continue;
            this.b.add(new d(locala2));
            continue;
          }
        }
      }
      catch (RemoteException localRemoteException1)
      {
        e.b("Failed to get image.", localRemoteException1);
      }
      try
      {
        a locala1 = this.a.d();
        if (locala1 != null)
        {
          locald = new d(locala1);
          this.c = locald;
          return;
          label150: locala2 = null;
        }
      }
      catch (RemoteException localRemoteException2)
      {
        while (true)
        {
          e.b("Failed to get icon.", localRemoteException2);
          d locald = null;
        }
      }
    }
  }

  private apj j()
  {
    try
    {
      apj localapj = this.a.i();
      return localapj;
    }
    catch (RemoteException localRemoteException)
    {
      e.b("Failed to retrieve native ad engine.", localRemoteException);
    }
    return null;
  }

  public final CharSequence b()
  {
    try
    {
      String str = this.a.a();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      e.b("Failed to get headline.", localRemoteException);
    }
    return null;
  }

  public final List c()
  {
    return this.b;
  }

  public final CharSequence d()
  {
    try
    {
      String str = this.a.c();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      e.b("Failed to get body.", localRemoteException);
    }
    return null;
  }

  public final com.google.android.gms.ads.formats.b e()
  {
    return this.c;
  }

  public final CharSequence f()
  {
    try
    {
      String str = this.a.e();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      e.b("Failed to get call to action.", localRemoteException);
    }
    return null;
  }

  public final Double g()
  {
    try
    {
      double d = this.a.f();
      if (d == -1.0D)
        return null;
      Double localDouble = Double.valueOf(d);
      return localDouble;
    }
    catch (RemoteException localRemoteException)
    {
      e.b("Failed to get star rating.", localRemoteException);
    }
    return null;
  }

  public final CharSequence h()
  {
    try
    {
      String str = this.a.g();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      e.b("Failed to get store", localRemoteException);
    }
    return null;
  }

  public final CharSequence i()
  {
    try
    {
      String str = this.a.h();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      e.b("Failed to get price.", localRemoteException);
    }
    return null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.client.n
 * JD-Core Version:    0.6.0
 */