package com.google.android.gms.ads.internal.webview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.av;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.csi.k;
import com.google.android.gms.ads.internal.csi.l;
import com.google.android.gms.ads.internal.gmsg.ar;
import com.google.android.gms.ads.internal.js.ak;
import com.google.android.gms.ads.internal.m;
import com.google.android.gms.ads.internal.overlay.ab;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import ha;
import java.util.Map;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public abstract interface b extends com.google.android.gms.ads.internal.activeview.j, av, ak
{
  public abstract void A();

  public abstract void B();

  public abstract View.OnClickListener C();

  public abstract WebView a();

  public abstract void a(int paramInt);

  public abstract void a(Context paramContext);

  public abstract void a(Context paramContext, AdSizeParcel paramAdSizeParcel, l paraml);

  public abstract void a(AdSizeParcel paramAdSizeParcel);

  public abstract void a(ab paramab);

  public abstract void a(o paramo);

  public abstract void a(String paramString);

  public abstract void a(String paramString, ar paramar);

  public abstract void a(String paramString1, String paramString2);

  public abstract void a(String paramString, Map paramMap);

  public abstract void a(String paramString, JSONObject paramJSONObject);

  public abstract void a(boolean paramBoolean);

  public abstract View b();

  public abstract void b(int paramInt);

  public abstract void b(ab paramab);

  public abstract void b(String paramString);

  public abstract void b(boolean paramBoolean);

  public abstract ar c(String paramString);

  public abstract void c();

  public abstract void c(boolean paramBoolean);

  public abstract void d();

  public abstract void destroy();

  public abstract void e();

  public abstract Activity f();

  public abstract Context g();

  public abstract Context getContext();

  public abstract ViewGroup.LayoutParams getLayoutParams();

  public abstract void getLocationOnScreen(int[] paramArrayOfInt);

  public abstract int getMeasuredHeight();

  public abstract int getMeasuredWidth();

  public abstract ViewParent getParent();

  public abstract m h();

  public abstract ab i();

  public abstract ab j();

  public abstract AdSizeParcel k();

  public abstract c l();

  public abstract void loadData(String paramString1, String paramString2, String paramString3);

  public abstract void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);

  public abstract void loadUrl(String paramString);

  public abstract boolean m();

  public abstract void measure(int paramInt1, int paramInt2);

  public abstract ha n();

  public abstract VersionInfoParcel o();

  public abstract void onPause();

  public abstract void onResume();

  public abstract boolean p();

  public abstract int q();

  public abstract boolean r();

  public abstract void s();

  public abstract void setBackgroundColor(int paramInt);

  public abstract void setOnClickListener(View.OnClickListener paramOnClickListener);

  public abstract void setOnTouchListener(View.OnTouchListener paramOnTouchListener);

  public abstract void setWebChromeClient(WebChromeClient paramWebChromeClient);

  public abstract void setWebViewClient(WebViewClient paramWebViewClient);

  public abstract void stopLoading();

  public abstract boolean t();

  public abstract boolean u();

  public abstract String v();

  public abstract a w();

  public abstract com.google.android.gms.ads.internal.csi.j x();

  public abstract k y();

  public abstract o z();
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.b
 * JD-Core Version:    0.6.0
 */