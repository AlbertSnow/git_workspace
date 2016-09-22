package com.google.android.gms.ads.internal.js;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.gmsg.ab;
import com.google.android.gms.ads.internal.gmsg.ad;
import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.overlay.ak;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import com.google.android.gms.ads.internal.webview.c;
import ha;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class g
  implements a
{
  final com.google.android.gms.ads.internal.webview.b a;

  public g(Context paramContext, VersionInfoParcel paramVersionInfoParcel, ha paramha)
  {
    this.a = com.google.android.gms.ads.internal.bc.a().f.a(paramContext, new AdSizeParcel(), false, false, paramha, paramVersionInfoParcel);
    this.a.a().setWillNotDraw(true);
  }

  private static void a(Runnable paramRunnable)
  {
    if (com.google.android.gms.ads.internal.util.client.a.b())
    {
      paramRunnable.run();
      return;
    }
    y.a.post(paramRunnable);
  }

  public final void a()
  {
    this.a.destroy();
  }

  public final void a(com.google.android.gms.ads.internal.client.a parama, ak paramak, com.google.android.gms.ads.internal.gmsg.b paramb, com.google.android.gms.ads.internal.overlay.bc parambc, boolean paramBoolean, ab paramab, ad paramad, com.google.android.gms.ads.internal.mraid.n paramn)
  {
    this.a.l().a(parama, paramak, paramb, parambc, false, null, null, new com.google.android.gms.ads.internal.n(this.a.getContext(), false), null, null);
  }

  public final void a(b paramb)
  {
    this.a.l().e = new m(this, paramb);
  }

  public final void a(String paramString)
  {
    a(new j(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] { paramString })));
  }

  public final void a(String paramString, t paramt)
  {
    this.a.l().a(paramString, paramt);
  }

  public final void a(String paramString1, String paramString2)
  {
    a(new i(this, paramString1, paramString2));
  }

  public final void a(String paramString, JSONObject paramJSONObject)
  {
    a(new h(this, paramString, paramJSONObject));
  }

  public final al b()
  {
    return new am(this);
  }

  public final void b(String paramString)
  {
    a(new l(this, paramString));
  }

  public final void b(String paramString, t paramt)
  {
    this.a.l().b(paramString, paramt);
  }

  public final void b(String paramString, JSONObject paramJSONObject)
  {
    this.a.b(paramString, paramJSONObject);
  }

  public final void c(String paramString)
  {
    a(new k(this, paramString));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.js.g
 * JD-Core Version:    0.6.0
 */