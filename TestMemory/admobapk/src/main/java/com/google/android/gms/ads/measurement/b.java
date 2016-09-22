package com.google.android.gms.ads.measurement;

import aiq;
import air;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.state.h;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.common.ConnectionResult;

@com.google.android.gms.ads.internal.report.client.a
public final class b
  implements aiq, air
{
  public a a;
  private final Object b = new Object();
  private Context c;
  private Bundle d;

  b(Context paramContext, Bundle paramBundle)
  {
    this.c = paramContext;
    this.d = paramBundle;
    Looper localLooper = paramContext.getMainLooper();
    this.a = new a(this.c, localLooper, this, this);
  }

  private com.google.android.gms.ads.measurement.service.a a()
  {
    try
    {
      synchronized (this.b)
      {
        com.google.android.gms.ads.measurement.service.a locala = this.a.c();
        return locala;
        label21: return null;
      }
    }
    catch (DeadObjectException localDeadObjectException)
    {
      break label21;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      break label21;
    }
  }

  private void b()
  {
    synchronized (this.b)
    {
      if ((this.a.e()) || (this.a.f()))
        this.a.d();
      Binder.flushPendingCommands();
      return;
    }
  }

  public final void a(int paramInt)
  {
    c.b("Disconnected from remote conversion tracking service.");
  }

  public final void a(Bundle paramBundle)
  {
    try
    {
      c.b("Reporting inAppPurchase entry in GmpInAppPurchaseClientTask.");
      com.google.android.gms.ads.measurement.service.a locala = a();
      if (locala == null)
        c.c("Invalid conversion tracking service.");
      while (true)
      {
        return;
        locala.a(this.d);
      }
    }
    catch (RemoteException localRemoteException)
    {
      c.b("Could not report data to conversion tracking service.", localRemoteException);
      bc.a().h.a(localRemoteException, true);
      return;
    }
    finally
    {
      b();
    }
    throw localObject;
  }

  public final void a(ConnectionResult paramConnectionResult)
  {
    c.b("Cannot connect to remote conversion tracking service.");
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.measurement.b
 * JD-Core Version:    0.6.0
 */