package com.google.android.gms.ads.internal.formats.client;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import apj;
import apn;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.internal.util.client.e;

@com.google.android.gms.ads.internal.report.client.a
public final class d extends b
{
  private final a a;
  private final Drawable b;
  private final Uri c;
  private final double d;

  public d(a parama)
  {
    this.a = parama;
    try
    {
      apj localapj = this.a.a();
      if (localapj != null)
      {
        localDrawable = (Drawable)apn.a(localapj);
        this.b = localDrawable;
      }
    }
    catch (RemoteException localRemoteException2)
    {
      try
      {
        Uri localUri2 = this.a.b();
        localUri1 = localUri2;
        this.c = localUri1;
        d1 = 1.0D;
      }
      catch (RemoteException localRemoteException2)
      {
        try
        {
          while (true)
          {
            double d2 = this.a.c();
            double d1 = d2;
            this.d = d1;
            return;
            localRemoteException1 = localRemoteException1;
            e.b("Failed to get drawable.", localRemoteException1);
            Drawable localDrawable = null;
          }
          localRemoteException2 = localRemoteException2;
          e.b("Failed to get uri.", localRemoteException2);
          Uri localUri1 = null;
        }
        catch (RemoteException localRemoteException3)
        {
          while (true)
            e.b("Failed to get scale.", localRemoteException3);
        }
      }
    }
  }

  public final Drawable a()
  {
    return this.b;
  }

  public final Uri b()
  {
    return this.c;
  }

  public final double c()
  {
    return this.d;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.client.d
 * JD-Core Version:    0.6.0
 */