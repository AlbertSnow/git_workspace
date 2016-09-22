package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import apj;
import apn;
import com.google.android.gms.ads.internal.formats.client.p;
import java.util.List;

@com.google.android.gms.ads.internal.report.client.a
public final class e extends p
  implements i
{
  private String a;
  private List b;
  private String c;
  private com.google.android.gms.ads.internal.formats.client.a d;
  private String e;
  private String f;
  private a g;
  private Bundle h;
  private Object i = new Object();
  private h j;

  public e(String paramString1, List paramList, String paramString2, com.google.android.gms.ads.internal.formats.client.a parama, String paramString3, String paramString4, a parama1, Bundle paramBundle)
  {
    this.a = paramString1;
    this.b = paramList;
    this.c = paramString2;
    this.d = parama;
    this.e = paramString3;
    this.f = paramString4;
    this.g = parama1;
    this.h = paramBundle;
  }

  public final String a()
  {
    return this.a;
  }

  public final void a(h paramh)
  {
    synchronized (this.i)
    {
      this.j = paramh;
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

  public final String f()
  {
    return this.f;
  }

  public final apj g()
  {
    return apn.a(this.j);
  }

  public final Bundle h()
  {
    return this.h;
  }

  public final void i()
  {
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = null;
    this.g = null;
    this.h = null;
    this.i = null;
    this.j = null;
  }

  public final String j()
  {
    return "1";
  }

  public final String k()
  {
    return "";
  }

  public final a l()
  {
    return this.g;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.e
 * JD-Core Version:    0.6.0
 */