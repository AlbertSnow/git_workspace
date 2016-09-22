package com.google.android.gms.ads.internal.customrenderedad;

import android.view.View;
import apj;
import apn;
import com.google.android.gms.ads.internal.customrenderedad.client.b;
import com.google.android.gms.ads.internal.v;

@com.google.android.gms.ads.internal.report.client.a
public final class a extends b
{
  private final v a;
  private final String b;
  private final String c;

  public a(v paramv, String paramString1, String paramString2)
  {
    this.a = paramv;
    this.b = paramString1;
    this.c = paramString2;
  }

  public final String a()
  {
    return this.b;
  }

  public final void a(apj paramapj)
  {
    if (paramapj == null)
      return;
    this.a.b((View)apn.a(paramapj));
  }

  public final String b()
  {
    return this.c;
  }

  public final void c()
  {
    this.a.H();
  }

  public final void d()
  {
    this.a.I();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.customrenderedad.a
 * JD-Core Version:    0.6.0
 */