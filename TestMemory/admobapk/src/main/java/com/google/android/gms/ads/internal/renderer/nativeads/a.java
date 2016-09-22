package com.google.android.gms.ads.internal.renderer.nativeads;

import android.content.Context;
import com.google.android.gms.ads.internal.an;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.js.aj;
import com.google.android.gms.ads.internal.js.n;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import ha;
import java.util.concurrent.TimeUnit;

@com.google.android.gms.ads.internal.report.client.a
public final class a
{
  static final long a = TimeUnit.SECONDS.toMillis(60L);
  static final Object b = new Object();
  static boolean c = false;
  static n d = null;
  final Context e;
  final com.google.android.gms.ads.internal.state.b f;
  final an g;
  final ha h;
  com.google.android.gms.ads.internal.js.c i;
  aj j;
  com.google.android.gms.ads.internal.js.a k;
  boolean l = false;

  public a(Context paramContext, com.google.android.gms.ads.internal.state.b paramb, an paraman, ha paramha)
  {
    this.e = paramContext;
    this.f = paramb;
    this.g = paraman;
    this.h = paramha;
    this.l = ((Boolean)m.aw.a()).booleanValue();
  }

  static String a(com.google.android.gms.ads.internal.state.b paramb)
  {
    String str1 = (String)m.M.a();
    if (paramb.b.b.indexOf("https") == 0);
    String str3;
    for (String str2 = "https:"; ; str2 = "http:")
    {
      str3 = String.valueOf(str2);
      String str4 = String.valueOf(str1);
      if (str4.length() == 0)
        break;
      return str3.concat(str4);
    }
    return new String(str3);
  }

  public final void a(e parame)
  {
    if (this.l)
    {
      aj localaj = this.j;
      if (localaj == null)
      {
        com.google.android.gms.ads.internal.util.c.e("SharedJavascriptEngine not initialized");
        return;
      }
      localaj.a(new b(this, parame), new c(this, parame));
      return;
    }
    com.google.android.gms.ads.internal.js.a locala = this.k;
    if (locala == null)
    {
      com.google.android.gms.ads.internal.util.c.e("JavascriptEngine not initialized");
      return;
    }
    parame.a(locala);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.nativeads.a
 * JD-Core Version:    0.6.0
 */