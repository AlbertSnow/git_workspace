package com.google.android.gms.ads.internal.request;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.state.h;
import com.google.android.gms.ads.internal.util.an;
import com.google.android.gms.ads.internal.util.c;

@com.google.android.gms.ads.internal.report.client.a
public abstract class k
  implements i, an
{
  private final com.google.android.gms.ads.internal.util.promise.a a;
  private final i b;
  private final Object c = new Object();

  public k(com.google.android.gms.ads.internal.util.promise.a parama, i parami)
  {
    this.a = parama;
    this.b = parami;
  }

  public abstract void a();

  public final void a(AdResponseParcel paramAdResponseParcel)
  {
    synchronized (this.c)
    {
      this.b.a(paramAdResponseParcel);
      a();
      return;
    }
  }

  final boolean a(w paramw, AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    try
    {
      paramw.a(paramAdRequestInfoParcel, new s(this));
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      c.c("Could not fetch ad response from ad request service.", localRemoteException);
      bc.a().h.a(localRemoteException, true);
      this.b.a(new AdResponseParcel(0));
      return false;
    }
    catch (NullPointerException localNullPointerException)
    {
      while (true)
      {
        c.c("Could not fetch ad response from ad request service due to an Exception.", localNullPointerException);
        bc.a().h.a(localNullPointerException, true);
      }
    }
    catch (SecurityException localSecurityException)
    {
      while (true)
      {
        c.c("Could not fetch ad response from ad request service due to an Exception.", localSecurityException);
        bc.a().h.a(localSecurityException, true);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        c.c("Could not fetch ad response from ad request service due to an Exception.", localThrowable);
        bc.a().h.a(localThrowable, true);
      }
    }
  }

  public abstract w b();

  public final void c()
  {
    a();
  }

  public final Void e()
  {
    w localw = b();
    if (localw == null)
    {
      this.b.a(new AdResponseParcel(0));
      a();
      return null;
    }
    this.a.a(new l(this, localw), new m(this));
    return null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.k
 * JD-Core Version:    0.6.0
 */