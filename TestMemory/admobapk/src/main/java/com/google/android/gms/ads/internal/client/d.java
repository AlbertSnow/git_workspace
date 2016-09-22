package com.google.android.gms.ads.internal.client;

import amj;
import android.content.Context;
import android.os.RemoteException;
import apj;
import apn;
import app;
import apq;
import com.google.android.gms.ads.internal.mediation.client.b;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.client.e;

@a
public final class d extends app
{
  public d()
  {
    super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
  }

  public final ab a(Context paramContext, String paramString, b paramb)
  {
    try
    {
      apj localapj = apn.a(paramContext);
      ab localab = ac.a(((ae)a(paramContext)).newAdLoaderBuilder(localapj, paramString, paramb, amj.b));
      return localab;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Could not create remote builder for AdLoader.", localRemoteException);
      return null;
    }
    catch (apq localapq)
    {
      while (true)
        e.c("Could not create remote builder for AdLoader.", localapq);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.d
 * JD-Core Version:    0.6.0
 */