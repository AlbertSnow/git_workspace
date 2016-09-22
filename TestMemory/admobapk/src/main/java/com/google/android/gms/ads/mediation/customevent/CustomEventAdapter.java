package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.common.annotation.KeepName;
import mi;

@KeepName
public final class CustomEventAdapter
  implements com.google.android.gms.ads.mediation.d, f, com.google.android.gms.ads.mediation.h
{
  private e a;
  private g b;
  private h c;

  private static Object a(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString).newInstance();
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      String str = String.valueOf(localThrowable.getMessage());
      com.google.android.gms.ads.internal.util.client.e.e(46 + String.valueOf(paramString).length() + String.valueOf(str).length() + "Could not instantiate custom event adapter: " + paramString + ". " + str);
    }
    return null;
  }

  public final void a()
  {
  }

  public final void a(Context paramContext, com.google.android.gms.ads.mediation.e parame, Bundle paramBundle1, mi parammi, a parama, Bundle paramBundle2)
  {
    this.a = ((e)a(paramBundle1.getString("class_name")));
    if (this.a == null)
    {
      parame.a(0);
      return;
    }
    if (paramBundle2 != null)
      paramBundle2.getBundle(paramBundle1.getString("class_name"));
    new b(this, parame);
    paramBundle1.getString("parameter");
  }

  public final void a(Context paramContext, com.google.android.gms.ads.mediation.g paramg, Bundle paramBundle1, a parama, Bundle paramBundle2)
  {
    this.b = ((g)a(paramBundle1.getString("class_name")));
    if (this.b == null)
    {
      paramg.b(0);
      return;
    }
    if (paramBundle2 != null)
      paramBundle2.getBundle(paramBundle1.getString("class_name"));
    new c(this, this, paramg);
    paramBundle1.getString("parameter");
  }

  public final void a(Context paramContext, i parami, Bundle paramBundle1, m paramm, Bundle paramBundle2)
  {
    this.c = ((h)a(paramBundle1.getString("class_name")));
    if (this.c == null)
    {
      parami.c(0);
      return;
    }
    if (paramBundle2 != null)
      paramBundle2.getBundle(paramBundle1.getString("class_name"));
    new d(this, parami);
    paramBundle1.getString("parameter");
  }

  public final void b()
  {
  }

  public final void c()
  {
  }

  public final View d()
  {
    return null;
  }

  public final void e()
  {
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventAdapter
 * JD-Core Version:    0.6.0
 */