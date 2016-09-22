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

@a
public final class e extends app
{
  public e()
  {
    super("com.google.android.gms.ads.AdManagerCreatorImpl");
  }

  public final ah a(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, b paramb, int paramInt)
  {
    try
    {
      apj localapj = apn.a(paramContext);
      ah localah = ai.a(((ak)a(paramContext)).newAdManagerByType(localapj, paramAdSizeParcel, paramString, paramb, amj.b, paramInt));
      return localah;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.a("Could not create remote AdManager.", localRemoteException);
      return null;
    }
    catch (apq localapq)
    {
      label40: break label40;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.e
 * JD-Core Version:    0.6.0
 */