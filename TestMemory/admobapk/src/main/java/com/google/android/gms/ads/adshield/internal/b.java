package com.google.android.gms.ads.adshield.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import apj;
import apn;
import app;
import apq;
import oy;

public final class b extends app
{
  private static final b a = new b();

  private b()
  {
    super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
  }

  public static c a(String paramString, Context paramContext, boolean paramBoolean)
  {
    Object localObject;
    if (oy.c.a(paramContext) == 0)
    {
      localObject = a.b(paramString, paramContext, paramBoolean);
      if (localObject != null);
    }
    else
    {
      localObject = new a(paramString, paramContext, paramBoolean);
    }
    return (c)localObject;
  }

  private final c b(String paramString, Context paramContext, boolean paramBoolean)
  {
    apj localapj = apn.a(paramContext);
    if (paramBoolean);
    try
    {
      localIBinder = ((f)a(paramContext)).newAdShieldClient(paramString, localapj);
      break label105;
      localIBinder = ((f)a(paramContext)).newAdShieldClientWithoutAdvertisingId(paramString, localapj);
      break label105;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      if ((localIInterface != null) && ((localIInterface instanceof c)))
        return (c)localIInterface;
      e locale = new e(localIBinder);
      return locale;
    }
    catch (RemoteException localRemoteException)
    {
      return null;
    }
    catch (apq localapq)
    {
      IBinder localIBinder;
      label98: label105: 
      do
        break label98;
      while (localIBinder != null);
    }
    return null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.adshield.internal.b
 * JD-Core Version:    0.6.0
 */