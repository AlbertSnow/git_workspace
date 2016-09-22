package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import apj;
import apn;
import com.google.android.gms.ads.internal.formats.client.l;
import java.util.List;

@com.google.android.gms.ads.internal.report.client.a
public final class d extends l
  implements i
{
  private String a;
  private List b;
  private String c;
  private com.google.android.gms.ads.internal.formats.client.a d;
  private String e;
  private double f;
  private String g;
  private String h;
  private a i;
  private Bundle j;
  private Object k = new Object();
  private h l;

  public d(String paramString1, List paramList, String paramString2, com.google.android.gms.ads.internal.formats.client.a parama, String paramString3, double paramDouble, String paramString4, String paramString5, a parama1, Bundle paramBundle)
  {
    this.a = paramString1;
    this.b = paramList;
    this.c = paramString2;
    this.d = parama;
    this.e = paramString3;
    this.f = paramDouble;
    this.g = paramString4;
    this.h = paramString5;
    this.i = parama1;
    this.j = paramBundle;
  }

  public final String a()
  {
    return this.a;
  }

  public final void a(h paramh)
  {
    synchronized (this.k)
    {
      this.l = paramh;
      return;
    }
  }

  public final List b()
  {
    return this.b;
  }

  public final String c()
  {
    return this.c;
  }

  public final com.google.android.gms.ads.internal.formats.client.a d()
  {
    return this.d;
  }

  public final String e()
  {
    return this.e;
  }

  public final double f()
  {
    return this.f;
  }

  public final String g()
  {
    return this.g;
  }

  public final String h()
  {
    return this.h;
  }

  public final apj i()
  {
    return apn.a(this.l);
  }

  public final String j()
  {
    return "2";
  }

  public final String k()
  {
    return "";
  }

  public final a l()
  {
    return this.i;
  }

  public final Bundle m()
  {
    return this.j;
  }

  public final void n()
  {
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = 0.0D;
    this.g = null;
    this.h = null;
    this.i = null;
    this.j = null;
    this.k = null;
    this.l = null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.d
 * JD-Core Version:    0.6.0
 */