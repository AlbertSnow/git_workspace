package com.google.android.gms.ads.internal.mediation.client;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.i;
import com.google.ads.mediation.q;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.customevent.f;
import java.util.Map;

@com.google.android.gms.ads.internal.report.client.a
public final class a extends c
{
  public Map a;

  private final e c(String paramString)
  {
    try
    {
      Class localClass = Class.forName(paramString, false, a.class.getClassLoader());
      if (i.class.isAssignableFrom(localClass))
      {
        i locali = (i)localClass.newInstance();
        return new z(locali, (q)this.a.get(locali.a()));
      }
      if (b.class.isAssignableFrom(localClass))
        return new u((b)localClass.newInstance());
      com.google.android.gms.ads.internal.util.client.e.e(64 + String.valueOf(paramString).length() + "Could not instantiate mediation adapter: " + paramString + " (not a valid adapter).");
      throw new RemoteException();
    }
    catch (Throwable localThrowable)
    {
    }
    return d(paramString);
  }

  private final e d(String paramString)
  {
    do
    {
      try
      {
        com.google.android.gms.ads.internal.util.client.e.b("Reflection failed, retrying using direct instantiation");
        if ("com.google.ads.mediation.admob.AdMobAdapter".equals(paramString))
          return new u(new AdMobAdapter());
        if ("com.google.ads.mediation.AdUrlAdapter".equals(paramString))
        {
          u localu = new u(new AdUrlAdapter());
          return localu;
        }
      }
      catch (Throwable localThrowable)
      {
        com.google.android.gms.ads.internal.util.client.e.c(43 + String.valueOf(paramString).length() + "Could not instantiate mediation adapter: " + paramString + ". ", localThrowable);
        throw new RemoteException();
      }
      if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(paramString))
        return new u(new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter());
    }
    while (!"com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString));
    z localz = new z(new com.google.ads.mediation.customevent.CustomEventAdapter(), (f)this.a.get(f.class));
    return localz;
  }

  public final e a(String paramString)
  {
    return c(paramString);
  }

  public final boolean b(String paramString)
  {
    try
    {
      boolean bool = com.google.android.gms.ads.mediation.customevent.a.class.isAssignableFrom(Class.forName(paramString, false, a.class.getClassLoader()));
      return bool;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.e.e(80 + String.valueOf(paramString).length() + "Could not load custom event implementation class: " + paramString + ", assuming old implementation.");
    }
    return false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.client.a
 * JD-Core Version:    0.6.0
 */