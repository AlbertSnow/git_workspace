package com.google.android.gms.ads.internal.webview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import anw;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.csi.j;
import com.google.android.gms.ads.internal.csi.l;
import com.google.android.gms.ads.internal.gmsg.ar;
import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.m;
import com.google.android.gms.ads.internal.overlay.ab;
import com.google.android.gms.ads.internal.overlay.ao;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import ha;
import java.util.Map;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
final class k extends FrameLayout
  implements b
{
  private final b a;
  private final a b;

  public k(b paramb)
  {
    super(paramb.getContext());
    this.a = paramb;
    this.b = new a(paramb.g(), this, this);
    c localc = this.a.l();
    if (localc != null)
      localc.a = this;
    addView(this.a.b());
  }

  public final void A()
  {
    this.a.A();
  }

  public final void B()
  {
    this.a.B();
  }

  public final View.OnClickListener C()
  {
    return this.a.C();
  }

  public final void F()
  {
    this.a.F();
  }

  public final void G()
  {
    this.a.G();
  }

  public final WebView a()
  {
    return this.a.a();
  }

  public final void a(int paramInt)
  {
    this.a.a(paramInt);
  }

  public final void a(Context paramContext)
  {
    this.a.a(paramContext);
  }

  public final void a(Context paramContext, AdSizeParcel paramAdSizeParcel, l paraml)
  {
    this.b.b();
    this.a.a(paramContext, paramAdSizeParcel, paraml);
  }

  public final void a(com.google.android.gms.ads.internal.activeview.a parama, boolean paramBoolean)
  {
    this.a.a(parama, paramBoolean);
  }

  public final void a(AdSizeParcel paramAdSizeParcel)
  {
    this.a.a(paramAdSizeParcel);
  }

  public final void a(ab paramab)
  {
    this.a.a(paramab);
  }

  public final void a(o paramo)
  {
    this.a.a(paramo);
  }

  public final void a(String paramString)
  {
    this.a.a(paramString);
  }

  public final void a(String paramString, ar paramar)
  {
    this.a.a(paramString, paramar);
  }

  public final void a(String paramString, t paramt)
  {
    this.a.a(paramString, paramt);
  }

  public final void a(String paramString1, String paramString2)
  {
    this.a.a(paramString1, paramString2);
  }

  public final void a(String paramString, Map paramMap)
  {
    this.a.a(paramString, paramMap);
  }

  public final void a(String paramString, JSONObject paramJSONObject)
  {
    this.a.a(paramString, paramJSONObject);
  }

  public final void a(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }

  public final View b()
  {
    return this;
  }

  public final void b(int paramInt)
  {
    this.a.b(paramInt);
  }

  public final void b(ab paramab)
  {
    this.a.b(paramab);
  }

  public final void b(String paramString)
  {
    this.a.b(paramString);
  }

  public final void b(String paramString, t paramt)
  {
    this.a.b(paramString, paramt);
  }

  public final void b(String paramString, JSONObject paramJSONObject)
  {
    this.a.b(paramString, paramJSONObject);
  }

  public final void b(boolean paramBoolean)
  {
    this.a.b(paramBoolean);
  }

  public final ar c(String paramString)
  {
    return this.a.c(paramString);
  }

  public final void c()
  {
    this.a.c();
  }

  public final void c(boolean paramBoolean)
  {
    this.a.c(paramBoolean);
  }

  public final void d()
  {
    this.a.d();
  }

  public final void destroy()
  {
    this.a.destroy();
  }

  public final void e()
  {
    this.a.e();
  }

  public final Activity f()
  {
    return this.a.f();
  }

  public final Context g()
  {
    return this.a.g();
  }

  public final m h()
  {
    return this.a.h();
  }

  public final ab i()
  {
    return this.a.i();
  }

  public final ab j()
  {
    return this.a.j();
  }

  public final AdSizeParcel k()
  {
    return this.a.k();
  }

  public final c l()
  {
    return this.a.l();
  }

  public final void loadData(String paramString1, String paramString2, String paramString3)
  {
    this.a.loadData(paramString1, paramString2, paramString3);
  }

  public final void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.a.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
  }

  public final void loadUrl(String paramString)
  {
    this.a.loadUrl(paramString);
  }

  public final boolean m()
  {
    return this.a.m();
  }

  public final ha n()
  {
    return this.a.n();
  }

  public final VersionInfoParcel o()
  {
    return this.a.o();
  }

  public final void onPause()
  {
    a locala = this.b;
    anw.b("onPause must be called from the UI thread.");
    if (locala.d != null)
      locala.d.g();
    this.a.onPause();
  }

  public final void onResume()
  {
    this.a.onResume();
  }

  public final boolean p()
  {
    return this.a.p();
  }

  public final int q()
  {
    return this.a.q();
  }

  public final boolean r()
  {
    return this.a.r();
  }

  public final void s()
  {
    this.b.b();
    this.a.s();
  }

  public final void setBackgroundColor(int paramInt)
  {
    this.a.setBackgroundColor(paramInt);
  }

  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.a.setOnClickListener(paramOnClickListener);
  }

  public final void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    this.a.setOnTouchListener(paramOnTouchListener);
  }

  public final void setWebChromeClient(WebChromeClient paramWebChromeClient)
  {
    this.a.setWebChromeClient(paramWebChromeClient);
  }

  public final void setWebViewClient(WebViewClient paramWebViewClient)
  {
    this.a.setWebViewClient(paramWebViewClient);
  }

  public final void stopLoading()
  {
    this.a.stopLoading();
  }

  public final boolean t()
  {
    return this.a.t();
  }

  public final boolean u()
  {
    return this.a.u();
  }

  public final String v()
  {
    return this.a.v();
  }

  public final a w()
  {
    return this.b;
  }

  public final j x()
  {
    return this.a.x();
  }

  public final com.google.android.gms.ads.internal.csi.k y()
  {
    return this.a.y();
  }

  public final o z()
  {
    return this.a.z();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.k
 * JD-Core Version:    0.6.0
 */