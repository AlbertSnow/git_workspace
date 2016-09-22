package com.google.android.gms.ads.internal.webview;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import aoq;
import com.google.android.gms.ads.internal.av;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.csi.e;
import com.google.android.gms.ads.internal.csi.j;
import com.google.android.gms.ads.internal.csi.k;
import com.google.android.gms.ads.internal.gmsg.aq;
import com.google.android.gms.ads.internal.gmsg.ar;
import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.overlay.ab;
import com.google.android.gms.ads.internal.state.h;
import com.google.android.gms.ads.internal.util.ad;
import com.google.android.gms.ads.internal.util.bk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import ha;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
final class l extends WebView
  implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, b
{
  private bk A;
  private int B = -1;
  private int C = -1;
  private int D = -1;
  private int E = -1;
  private Map F;
  private final WindowManager G;
  private final n a;
  private final Object b = new Object();
  private final ha c;
  private final VersionInfoParcel d;
  private final av e;
  private final com.google.android.gms.ads.internal.m f;
  private c g;
  private ab h;
  private AdSizeParcel i;
  private boolean j;
  private boolean k;
  private boolean l;
  private boolean m;
  private Boolean n;
  private int o;
  private boolean p = true;
  private boolean q = false;
  private String r = "";
  private o s;
  private boolean t;
  private j u;
  private j v;
  private j w;
  private k x;
  private WeakReference y;
  private ab z;

  protected l(n paramn, AdSizeParcel paramAdSizeParcel, boolean paramBoolean, ha paramha, VersionInfoParcel paramVersionInfoParcel, com.google.android.gms.ads.internal.csi.l paraml, av paramav, com.google.android.gms.ads.internal.m paramm)
  {
    super(paramn);
    this.a = paramn;
    this.i = paramAdSizeParcel;
    this.l = paramBoolean;
    this.o = -1;
    this.c = paramha;
    this.d = paramVersionInfoParcel;
    this.e = paramav;
    this.f = paramm;
    this.G = ((WindowManager)getContext().getSystemService("window"));
    setBackgroundColor(0);
    WebSettings localWebSettings = getSettings();
    localWebSettings.setAllowFileAccess(false);
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setSavePassword(false);
    localWebSettings.setSupportMultipleWindows(true);
    localWebSettings.setJavaScriptCanOpenWindowsAutomatically(true);
    if (Build.VERSION.SDK_INT >= 21)
      localWebSettings.setMixedContentMode(2);
    localWebSettings.setUserAgentString(bc.a().e.a(paramn, paramVersionInfoParcel.b));
    bc.a().g.a(getContext(), localWebSettings);
    setDownloadListener(this);
    I();
    if (aoq.a(17))
      addJavascriptInterface(new r(this), "googleAdsJsInterface");
    if (aoq.a(11))
    {
      removeJavascriptInterface("accessibility");
      removeJavascriptInterface("accessibilityTraversal");
    }
    this.A = new bk(this.a.a, this, this, null);
    a(paraml);
  }

  private boolean D()
  {
    if (!this.g.a())
      return false;
    DisplayMetrics localDisplayMetrics = y.a(this.G);
    int i1 = com.google.android.gms.ads.internal.util.client.a.b(localDisplayMetrics, localDisplayMetrics.widthPixels);
    int i2 = com.google.android.gms.ads.internal.util.client.a.b(localDisplayMetrics, localDisplayMetrics.heightPixels);
    Activity localActivity = this.a.a;
    int i3;
    int i4;
    if ((localActivity == null) || (localActivity.getWindow() == null))
    {
      i3 = i2;
      i4 = i1;
      label91: if ((this.C == i1) && (this.B == i2) && (this.D == i4) && (this.E == i3))
        break label258;
      if ((this.C == i1) && (this.B == i2))
        break label260;
    }
    label258: label260: for (int i5 = 1; ; i5 = 0)
    {
      this.C = i1;
      this.B = i2;
      this.D = i4;
      this.E = i3;
      new com.google.android.gms.ads.internal.mraid.m(this).a(i1, i2, i4, i3, localDisplayMetrics.density, this.G.getDefaultDisplay().getRotation());
      return i5;
      int[] arrayOfInt = bc.a().e.a(localActivity);
      i4 = com.google.android.gms.ads.internal.util.client.a.b(localDisplayMetrics, arrayOfInt[0]);
      i3 = com.google.android.gms.ads.internal.util.client.a.b(localDisplayMetrics, arrayOfInt[1]);
      break label91;
      break;
    }
  }

  private Boolean E()
  {
    synchronized (this.b)
    {
      Boolean localBoolean = this.n;
      return localBoolean;
    }
  }

  private final void H()
  {
    e.a(this.x.b, this.v, new String[] { "aeh2" });
  }

  private final void I()
  {
    while (true)
    {
      synchronized (this.b)
      {
        if ((this.l) || (this.i.e))
        {
          if (Build.VERSION.SDK_INT >= 14)
            continue;
          com.google.android.gms.ads.internal.util.c.b("Disabling hardware acceleration on an overlay.");
          J();
          return;
          com.google.android.gms.ads.internal.util.c.b("Enabling hardware acceleration on an overlay.");
          K();
        }
      }
      if (Build.VERSION.SDK_INT < 18)
      {
        com.google.android.gms.ads.internal.util.c.b("Disabling hardware acceleration on an AdView.");
        J();
        continue;
      }
      com.google.android.gms.ads.internal.util.c.b("Enabling hardware acceleration on an AdView.");
      K();
    }
  }

  private final void J()
  {
    synchronized (this.b)
    {
      if (!this.m)
        bc.a().g.c(this);
      this.m = true;
      return;
    }
  }

  private final void K()
  {
    synchronized (this.b)
    {
      if (this.m)
        bc.a().g.b(this);
      this.m = false;
      return;
    }
  }

  private final void L()
  {
    synchronized (this.b)
    {
      if (this.F != null)
      {
        Iterator localIterator = this.F.values().iterator();
        if (localIterator.hasNext())
          ((ar)localIterator.next()).b();
      }
    }
    this.F = null;
    monitorexit;
  }

  private final void M()
  {
    if (this.x == null);
    com.google.android.gms.ads.internal.csi.l locall;
    do
    {
      return;
      locall = this.x.b;
    }
    while ((locall == null) || (bc.a().h.c() == null));
    bc.a().h.c().a(locall);
  }

  private final void a(com.google.android.gms.ads.internal.csi.l paraml)
  {
    M();
    this.x = new k(new com.google.android.gms.ads.internal.csi.l(true, "make_wv", this.i.b));
    com.google.android.gms.ads.internal.csi.l locall = this.x.b;
    synchronized (locall.b)
    {
      locall.e = paraml;
      this.v = e.a(this.x.b);
      this.x.a("native:view_create", this.v);
      this.w = null;
      this.u = null;
      return;
    }
  }

  private void a(Boolean paramBoolean)
  {
    h localh;
    synchronized (this.b)
    {
      this.n = paramBoolean;
      localh = bc.a().h;
    }
    synchronized (localh.a)
    {
      localh.f = paramBoolean;
      return;
      localObject2 = finally;
      monitorexit;
      throw localObject2;
    }
  }

  private void d(String paramString)
  {
    synchronized (this.b)
    {
      if (!r())
      {
        loadUrl(paramString);
        return;
      }
      com.google.android.gms.ads.internal.util.c.e("The webview is destroyed. Ignoring action.");
    }
  }

  private final void d(boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    if (paramBoolean);
    for (String str = "1"; ; str = "0")
    {
      localHashMap.put("isVisible", str);
      a("onAdVisibilityChanged", localHashMap);
      return;
    }
  }

  // ERROR //
  private void e(String paramString)
  {
    // Byte code:
    //   0: bipush 19
    //   2: invokestatic 198	aoq:a	(I)Z
    //   5: ifeq +182 -> 187
    //   8: aload_0
    //   9: invokespecial 450	com/google/android/gms/ads/internal/webview/l:E	()Ljava/lang/Boolean;
    //   12: ifnonnull +55 -> 67
    //   15: aload_0
    //   16: getfield 76	com/google/android/gms/ads/internal/webview/l:b	Ljava/lang/Object;
    //   19: astore 8
    //   21: aload 8
    //   23: monitorenter
    //   24: aload_0
    //   25: invokestatic 163	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   28: getfield 373	com/google/android/gms/ads/internal/bc:h	Lcom/google/android/gms/ads/internal/state/h;
    //   31: invokevirtual 452	com/google/android/gms/ads/internal/state/h:h	()Ljava/lang/Boolean;
    //   34: putfield 293	com/google/android/gms/ads/internal/webview/l:n	Ljava/lang/Boolean;
    //   37: aload_0
    //   38: getfield 293	com/google/android/gms/ads/internal/webview/l:n	Ljava/lang/Boolean;
    //   41: astore 10
    //   43: aload 10
    //   45: ifnonnull +19 -> 64
    //   48: aload_0
    //   49: ldc_w 454
    //   52: aconst_null
    //   53: invokevirtual 458	com/google/android/gms/ads/internal/webview/l:evaluateJavascript	(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    //   56: aload_0
    //   57: iconst_1
    //   58: invokestatic 464	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   61: invokespecial 466	com/google/android/gms/ads/internal/webview/l:a	(Ljava/lang/Boolean;)V
    //   64: aload 8
    //   66: monitorexit
    //   67: aload_0
    //   68: invokespecial 450	com/google/android/gms/ads/internal/webview/l:E	()Ljava/lang/Boolean;
    //   71: invokevirtual 469	java/lang/Boolean:booleanValue	()Z
    //   74: ifeq +67 -> 141
    //   77: aload_0
    //   78: getfield 76	com/google/android/gms/ads/internal/webview/l:b	Ljava/lang/Object;
    //   81: astore 6
    //   83: aload 6
    //   85: monitorenter
    //   86: aload_0
    //   87: invokevirtual 421	com/google/android/gms/ads/internal/webview/l:r	()Z
    //   90: ifne +34 -> 124
    //   93: aload_0
    //   94: aload_1
    //   95: aconst_null
    //   96: invokevirtual 458	com/google/android/gms/ads/internal/webview/l:evaluateJavascript	(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    //   99: aload 6
    //   101: monitorexit
    //   102: return
    //   103: astore 11
    //   105: aload_0
    //   106: iconst_0
    //   107: invokestatic 464	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   110: invokespecial 466	com/google/android/gms/ads/internal/webview/l:a	(Ljava/lang/Boolean;)V
    //   113: goto -49 -> 64
    //   116: astore 9
    //   118: aload 8
    //   120: monitorexit
    //   121: aload 9
    //   123: athrow
    //   124: ldc_w 426
    //   127: invokestatic 428	com/google/android/gms/ads/internal/util/c:e	(Ljava/lang/String;)V
    //   130: goto -31 -> 99
    //   133: astore 7
    //   135: aload 6
    //   137: monitorexit
    //   138: aload 7
    //   140: athrow
    //   141: aload_1
    //   142: invokestatic 472	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   145: astore 4
    //   147: aload 4
    //   149: invokevirtual 475	java/lang/String:length	()I
    //   152: ifeq +20 -> 172
    //   155: ldc_w 477
    //   158: aload 4
    //   160: invokevirtual 481	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   163: astore 5
    //   165: aload_0
    //   166: aload 5
    //   168: invokespecial 483	com/google/android/gms/ads/internal/webview/l:d	(Ljava/lang/String;)V
    //   171: return
    //   172: new 305	java/lang/String
    //   175: dup
    //   176: ldc_w 477
    //   179: invokespecial 485	java/lang/String:<init>	(Ljava/lang/String;)V
    //   182: astore 5
    //   184: goto -19 -> 165
    //   187: aload_1
    //   188: invokestatic 472	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   191: astore_2
    //   192: aload_2
    //   193: invokevirtual 475	java/lang/String:length	()I
    //   196: ifeq +17 -> 213
    //   199: ldc_w 477
    //   202: aload_2
    //   203: invokevirtual 481	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   206: astore_3
    //   207: aload_0
    //   208: aload_3
    //   209: invokespecial 483	com/google/android/gms/ads/internal/webview/l:d	(Ljava/lang/String;)V
    //   212: return
    //   213: new 305	java/lang/String
    //   216: dup
    //   217: ldc_w 477
    //   220: invokespecial 485	java/lang/String:<init>	(Ljava/lang/String;)V
    //   223: astore_3
    //   224: goto -17 -> 207
    //
    // Exception table:
    //   from	to	target	type
    //   48	64	103	java/lang/IllegalStateException
    //   24	43	116	finally
    //   48	64	116	finally
    //   64	67	116	finally
    //   105	113	116	finally
    //   118	121	116	finally
    //   86	99	133	finally
    //   99	102	133	finally
    //   124	130	133	finally
    //   135	138	133	finally
  }

  public final void A()
  {
    this.A.a();
  }

  public final void B()
  {
    if (this.w == null)
    {
      this.w = e.a(this.x.b);
      this.x.a("native:view_load", this.w);
    }
  }

  public final View.OnClickListener C()
  {
    return (View.OnClickListener)this.y.get();
  }

  public final void F()
  {
    synchronized (this.b)
    {
      this.q = true;
      if (this.e != null)
        this.e.F();
      return;
    }
  }

  public final void G()
  {
    synchronized (this.b)
    {
      this.q = false;
      if (this.e != null)
        this.e.G();
      return;
    }
  }

  public final WebView a()
  {
    return this;
  }

  public final void a(int paramInt)
  {
    H();
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("closetype", String.valueOf(paramInt));
    localHashMap.put("version", this.d.b);
    a("onhide", localHashMap);
  }

  public final void a(Context paramContext)
  {
    this.a.setBaseContext(paramContext);
    this.A.a = this.a.a;
  }

  public final void a(Context paramContext, AdSizeParcel paramAdSizeParcel, com.google.android.gms.ads.internal.csi.l paraml)
  {
    synchronized (this.b)
    {
      this.A.b();
      a(paramContext);
      this.h = null;
      this.i = paramAdSizeParcel;
      this.l = false;
      this.j = false;
      this.r = "";
      this.o = -1;
      ad.b(this);
      loadUrl("about:blank");
      this.g.f();
      setOnTouchListener(null);
      setOnClickListener(null);
      this.p = true;
      this.q = false;
      this.s = null;
      a(paraml);
      this.t = false;
      bc.a().x.a(this);
      L();
      return;
    }
  }

  public final void a(com.google.android.gms.ads.internal.activeview.a parama, boolean paramBoolean)
  {
    synchronized (this.b)
    {
      this.t = paramBoolean;
      d(paramBoolean);
      return;
    }
  }

  public final void a(AdSizeParcel paramAdSizeParcel)
  {
    synchronized (this.b)
    {
      this.i = paramAdSizeParcel;
      requestLayout();
      return;
    }
  }

  public final void a(ab paramab)
  {
    synchronized (this.b)
    {
      this.h = paramab;
      return;
    }
  }

  public final void a(o paramo)
  {
    synchronized (this.b)
    {
      if (this.s != null)
      {
        com.google.android.gms.ads.internal.util.c.c("Attempt to create multiple AdWebViewVideoControllers.");
        return;
      }
      this.s = paramo;
      return;
    }
  }

  public final void a(String paramString)
  {
    synchronized (this.b)
    {
      try
      {
        super.loadUrl(paramString);
        return;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          String str = String.valueOf(localThrowable);
          com.google.android.gms.ads.internal.util.c.e(24 + String.valueOf(str).length() + "Could not call loadUrl. " + str);
        }
      }
    }
  }

  public final void a(String paramString, ar paramar)
  {
    synchronized (this.b)
    {
      if (this.F == null)
        this.F = new HashMap();
      this.F.put(paramString, paramar);
      return;
    }
  }

  public final void a(String paramString, t paramt)
  {
    if (this.g != null)
      this.g.a(paramString, paramt);
  }

  public final void a(String paramString1, String paramString2)
  {
    e(3 + String.valueOf(paramString1).length() + String.valueOf(paramString2).length() + paramString1 + "(" + paramString2 + ");");
  }

  public final void a(String paramString, Map paramMap)
  {
    try
    {
      JSONObject localJSONObject = bc.a().e.a(paramMap);
      b(paramString, localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      com.google.android.gms.ads.internal.util.c.e("Could not convert parameters to JSON.");
    }
  }

  public final void a(String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
      paramJSONObject = new JSONObject();
    a(paramString, paramJSONObject.toString());
  }

  public final void a(boolean paramBoolean)
  {
    synchronized (this.b)
    {
      this.l = paramBoolean;
      I();
      return;
    }
  }

  public final View b()
  {
    return this;
  }

  public final void b(int paramInt)
  {
    synchronized (this.b)
    {
      this.o = paramInt;
      if (this.h != null)
        this.h.a(this.o);
      return;
    }
  }

  public final void b(ab paramab)
  {
    synchronized (this.b)
    {
      this.z = paramab;
      return;
    }
  }

  public final void b(String paramString)
  {
    Object localObject1 = this.b;
    monitorenter;
    if (paramString == null)
      paramString = "";
    try
    {
      this.r = paramString;
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject2;
  }

  public final void b(String paramString, t paramt)
  {
    if (this.g != null)
      this.g.b(paramString, paramt);
  }

  public final void b(String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
      paramJSONObject = new JSONObject();
    String str1 = paramJSONObject.toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AFMA_ReceiveMessage('");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    localStringBuilder.append(",");
    localStringBuilder.append(str1);
    localStringBuilder.append(");");
    String str2 = String.valueOf(localStringBuilder.toString());
    if (str2.length() != 0);
    for (String str3 = "Dispatching AFMA event: ".concat(str2); ; str3 = new String("Dispatching AFMA event: "))
    {
      com.google.android.gms.ads.internal.util.c.a(str3);
      e(localStringBuilder.toString());
      return;
    }
  }

  public final void b(boolean paramBoolean)
  {
    synchronized (this.b)
    {
      if (this.h != null)
      {
        this.h.a(this.g.a(), paramBoolean);
        return;
      }
      this.j = paramBoolean;
    }
  }

  public final ar c(String paramString)
  {
    synchronized (this.b)
    {
      if (this.F == null)
        return null;
      ar localar = (ar)this.F.get(paramString);
      return localar;
    }
  }

  public final void c()
  {
    H();
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.d.b);
    a("onhide", localHashMap);
  }

  public final void c(boolean paramBoolean)
  {
    synchronized (this.b)
    {
      this.p = paramBoolean;
      return;
    }
  }

  public final void d()
  {
    if (this.u == null)
    {
      e.a(this.x.b, this.w, new String[] { "aes" });
      this.u = e.a(this.x.b);
      this.x.a("native:view_show", this.u);
    }
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.d.b);
    a("onshow", localHashMap);
  }

  public final void destroy()
  {
    c localc;
    synchronized (this.b)
    {
      M();
      this.A.b();
      if (this.h != null)
      {
        this.h.a();
        this.h.k();
        this.h = null;
      }
      this.g.f();
      if (this.k)
        return;
      bc.a().x.a(this);
      L();
      this.k = true;
      com.google.android.gms.ads.internal.util.c.a("Initiating WebView self destruct sequence in 3...");
      localc = this.g;
    }
    synchronized (localc.b)
    {
      com.google.android.gms.ads.internal.util.c.a("Loading blank page in WebView, 2...");
      localc.p = true;
      localc.a.a("about:blank");
      monitorexit;
      return;
      localObject2 = finally;
      monitorexit;
      throw localObject2;
    }
  }

  public final void e()
  {
    HashMap localHashMap = new HashMap(3);
    localHashMap.put("app_muted", String.valueOf(y.e()));
    localHashMap.put("app_volume", String.valueOf(y.d()));
    AudioManager localAudioManager = y.g(getContext());
    float f1 = 0.0F;
    if (localAudioManager == null);
    while (true)
    {
      localHashMap.put("device_volume", String.valueOf(f1));
      a("volume", localHashMap);
      return;
      int i1 = localAudioManager.getStreamMaxVolume(3);
      int i2 = localAudioManager.getStreamVolume(3);
      f1 = 0.0F;
      if (i1 == 0)
        continue;
      f1 = i2 / i1;
    }
  }

  @TargetApi(19)
  public final void evaluateJavascript(String paramString, ValueCallback paramValueCallback)
  {
    synchronized (this.b)
    {
      if (r())
      {
        com.google.android.gms.ads.internal.util.c.e("The webview is destroyed. Ignoring action.");
        if (paramValueCallback != null)
          paramValueCallback.onReceiveValue(null);
        return;
      }
      super.evaluateJavascript(paramString, paramValueCallback);
      return;
    }
  }

  public final Activity f()
  {
    return this.a.a;
  }

  protected final void finalize()
  {
    synchronized (this.b)
    {
      if (!this.k)
      {
        this.g.f();
        bc.a().x.a(this);
        L();
      }
      super.finalize();
      return;
    }
  }

  public final Context g()
  {
    return this.a.b;
  }

  public final com.google.android.gms.ads.internal.m h()
  {
    return this.f;
  }

  public final ab i()
  {
    synchronized (this.b)
    {
      ab localab = this.h;
      return localab;
    }
  }

  public final ab j()
  {
    synchronized (this.b)
    {
      ab localab = this.z;
      return localab;
    }
  }

  public final AdSizeParcel k()
  {
    synchronized (this.b)
    {
      AdSizeParcel localAdSizeParcel = this.i;
      return localAdSizeParcel;
    }
  }

  public final c l()
  {
    return this.g;
  }

  public final void loadData(String paramString1, String paramString2, String paramString3)
  {
    synchronized (this.b)
    {
      if (!r())
      {
        super.loadData(paramString1, paramString2, paramString3);
        return;
      }
      com.google.android.gms.ads.internal.util.c.e("The webview is destroyed. Ignoring action.");
    }
  }

  public final void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    synchronized (this.b)
    {
      if (!r())
      {
        super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
        return;
      }
      com.google.android.gms.ads.internal.util.c.e("The webview is destroyed. Ignoring action.");
    }
  }

  public final void loadUrl(String paramString)
  {
    while (true)
    {
      synchronized (this.b)
      {
        boolean bool = r();
        if (!bool)
          try
          {
            super.loadUrl(paramString);
            return;
          }
          catch (Throwable localThrowable)
          {
            String str = String.valueOf(localThrowable);
            com.google.android.gms.ads.internal.util.c.e(24 + String.valueOf(str).length() + "Could not call loadUrl. " + str);
            continue;
          }
      }
      com.google.android.gms.ads.internal.util.c.e("The webview is destroyed. Ignoring action.");
    }
  }

  public final boolean m()
  {
    synchronized (this.b)
    {
      boolean bool = this.j;
      return bool;
    }
  }

  public final ha n()
  {
    return this.c;
  }

  public final VersionInfoParcel o()
  {
    return this.d;
  }

  protected final void onAttachedToWindow()
  {
    synchronized (this.b)
    {
      super.onAttachedToWindow();
      if (!r())
        this.A.c();
      d(this.t);
      return;
    }
  }

  protected final void onDetachedFromWindow()
  {
    synchronized (this.b)
    {
      if (!r())
        this.A.d();
      super.onDetachedFromWindow();
      d(false);
      return;
    }
  }

  public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setDataAndType(Uri.parse(paramString1), paramString4);
      y.a(getContext(), localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      com.google.android.gms.ads.internal.util.c.b(51 + String.valueOf(paramString1).length() + String.valueOf(paramString4).length() + "Couldn't find an Activity to view url/mimetype: " + paramString1 + " / " + paramString4);
    }
  }

  @TargetApi(21)
  protected final void onDraw(Canvas paramCanvas)
  {
    if (r());
    do
      return;
    while ((Build.VERSION.SDK_INT == 21) && (paramCanvas.isHardwareAccelerated()) && (!isAttachedToWindow()));
    super.onDraw(paramCanvas);
  }

  public final void onGlobalLayout()
  {
    boolean bool = D();
    ab localab = i();
    if ((localab != null) && (bool) && (localab.h))
    {
      localab.h = false;
      localab.m();
    }
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 2147483647;
    synchronized (this.b)
    {
      if (r())
      {
        setMeasuredDimension(0, 0);
        return;
      }
      if ((isInEditMode()) || (this.l) || (this.i.i) || (this.i.j))
      {
        super.onMeasure(paramInt1, paramInt2);
        return;
      }
    }
    if (this.i.e)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      this.G.getDefaultDisplay().getMetrics(localDisplayMetrics);
      setMeasuredDimension(localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels);
      monitorexit;
      return;
    }
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i4 = View.MeasureSpec.getMode(paramInt2);
    int i5 = View.MeasureSpec.getSize(paramInt2);
    if (i2 != -2147483648)
      if (i2 == 1073741824)
        break label390;
    while (true)
    {
      if ((this.i.g > i6) || (this.i.d > i1))
      {
        float f1 = this.a.getResources().getDisplayMetrics().density;
        int i7 = (int)(this.i.g / f1);
        int i8 = (int)(this.i.d / f1);
        int i9 = (int)(i3 / f1);
        int i10 = (int)(i5 / f1);
        com.google.android.gms.ads.internal.util.c.e(103 + "Not enough space to show ad. Needs " + i7 + "x" + i8 + " dp, but only has " + i9 + "x" + i10 + " dp.");
        if (getVisibility() != 8)
          setVisibility(4);
        setMeasuredDimension(0, 0);
      }
      while (true)
      {
        monitorexit;
        return;
        if (getVisibility() != 8)
          setVisibility(0);
        setMeasuredDimension(this.i.g, this.i.d);
      }
      int i6 = i1;
      break label394;
      label390: i6 = i3;
      label394: if ((i4 != -2147483648) && (i4 != 1073741824))
        continue;
      i1 = i5;
    }
  }

  public final void onPause()
  {
    if (r());
    while (true)
    {
      return;
      try
      {
        if (!aoq.a(11))
          continue;
        super.onPause();
        return;
      }
      catch (Exception localException)
      {
        com.google.android.gms.ads.internal.util.c.b("Could not pause webview.", localException);
      }
    }
  }

  public final void onResume()
  {
    if (r());
    while (true)
    {
      return;
      try
      {
        if (!aoq.a(11))
          continue;
        super.onResume();
        return;
      }
      catch (Exception localException)
      {
        com.google.android.gms.ads.internal.util.c.b("Could not resume webview.", localException);
      }
    }
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.c != null)
      this.c.a(paramMotionEvent);
    if (r())
      return false;
    return super.onTouchEvent(paramMotionEvent);
  }

  public final boolean p()
  {
    synchronized (this.b)
    {
      boolean bool = this.l;
      return bool;
    }
  }

  public final int q()
  {
    synchronized (this.b)
    {
      int i1 = this.o;
      return i1;
    }
  }

  public final boolean r()
  {
    synchronized (this.b)
    {
      boolean bool = this.k;
      return bool;
    }
  }

  public final void s()
  {
    synchronized (this.b)
    {
      com.google.android.gms.ads.internal.util.c.a("Destroying WebView!");
      y.a.post(new m(this));
      return;
    }
  }

  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.y = new WeakReference(paramOnClickListener);
    super.setOnClickListener(paramOnClickListener);
  }

  public final void setWebViewClient(WebViewClient paramWebViewClient)
  {
    super.setWebViewClient(paramWebViewClient);
    if ((paramWebViewClient instanceof c))
      this.g = ((c)paramWebViewClient);
  }

  public final void stopLoading()
  {
    if (r())
      return;
    try
    {
      super.stopLoading();
      return;
    }
    catch (Exception localException)
    {
      com.google.android.gms.ads.internal.util.c.b("Could not stop loading webview.", localException);
    }
  }

  public final boolean t()
  {
    synchronized (this.b)
    {
      e.a(this.x.b, this.v, new String[] { "aebb2" });
      boolean bool = this.p;
      return bool;
    }
  }

  public final boolean u()
  {
    synchronized (this.b)
    {
      boolean bool = this.q;
      return bool;
    }
  }

  public final String v()
  {
    synchronized (this.b)
    {
      String str = this.r;
      return str;
    }
  }

  public final a w()
  {
    return null;
  }

  public final j x()
  {
    return this.w;
  }

  public final k y()
  {
    return this.x;
  }

  public final o z()
  {
    synchronized (this.b)
    {
      o localo = this.s;
      return localo;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.l
 * JD-Core Version:    0.6.0
 */