package com.google.android.gms.ads.internal.webview;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.gmsg.ab;
import com.google.android.gms.ads.internal.gmsg.ac;
import com.google.android.gms.ads.internal.gmsg.af;
import com.google.android.gms.ads.internal.gmsg.ag;
import com.google.android.gms.ads.internal.gmsg.e;
import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.mraid.l;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.ai;
import com.google.android.gms.ads.internal.overlay.ak;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import ha;
import hb;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

@com.google.android.gms.ads.internal.report.client.a
public class c extends WebViewClient
{
  private static final String[] s = { "UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS" };
  private static final String[] t = { "NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID" };
  public b a;
  final Object b = new Object();
  public com.google.android.gms.ads.internal.client.a c;
  public ak d;
  public f e;
  public com.google.android.gms.ads.internal.gmsg.b f;
  public g g;
  public boolean h = false;
  public ab i;
  boolean j;
  public com.google.android.gms.ads.internal.overlay.bc k;
  public final l l;
  public com.google.android.gms.ads.internal.n m;
  public com.google.android.gms.ads.internal.mraid.d n;
  public com.google.android.gms.ads.internal.safebrowsing.m o;
  boolean p;
  boolean q;
  int r;
  private final HashMap u = new HashMap();
  private boolean v;
  private boolean w;

  public c(b paramb, boolean paramBoolean)
  {
    this(paramb, paramBoolean, new l(paramb, paramb.g(), new com.google.android.gms.ads.internal.common.a(paramb.getContext())), null);
  }

  private c(b paramb, boolean paramBoolean, l paraml, com.google.android.gms.ads.internal.mraid.d paramd)
  {
    this.a = paramb;
    this.j = paramBoolean;
    this.l = paraml;
    this.n = null;
  }

  private final void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    if (!((Boolean)com.google.android.gms.ads.internal.config.m.ad.a()).booleanValue())
      return;
    Bundle localBundle = new Bundle();
    localBundle.putString("err", paramString1);
    localBundle.putString("code", paramString2);
    Uri localUri;
    if (!TextUtils.isEmpty(paramString3))
    {
      localUri = Uri.parse(paramString3);
      if (localUri.getHost() == null);
    }
    for (String str = localUri.getHost(); ; str = "")
    {
      localBundle.putString("host", str);
      com.google.android.gms.ads.internal.bc.a().e.a(paramContext, this.a.o().b, "gmob-apps", localBundle, true);
      return;
    }
  }

  public final void a(Uri paramUri)
  {
    String str1 = paramUri.getPath();
    List localList = (List)this.u.get(str1);
    if (localList != null)
    {
      Map localMap = y.a(paramUri);
      if (com.google.android.gms.ads.internal.util.c.a(2))
      {
        String str3 = String.valueOf(str1);
        if (str3.length() != 0);
        for (String str4 = "Received GMSG: ".concat(str3); ; str4 = new String("Received GMSG: "))
        {
          com.google.android.gms.ads.internal.util.c.a(str4);
          Iterator localIterator2 = localMap.keySet().iterator();
          while (localIterator2.hasNext())
          {
            String str5 = (String)localIterator2.next();
            String str6 = (String)localMap.get(str5);
            com.google.android.gms.ads.internal.util.c.a(4 + String.valueOf(str5).length() + String.valueOf(str6).length() + "  " + str5 + ": " + str6);
          }
        }
      }
      Iterator localIterator1 = localList.iterator();
      while (localIterator1.hasNext())
        ((t)localIterator1.next()).a(this.a, localMap);
    }
    String str2 = String.valueOf(paramUri);
    com.google.android.gms.ads.internal.util.c.a(32 + String.valueOf(str2).length() + "No GMSG handler found for GMSG: " + str2);
  }

  public final void a(com.google.android.gms.ads.internal.client.a parama, ak paramak, com.google.android.gms.ads.internal.gmsg.b paramb, com.google.android.gms.ads.internal.overlay.bc parambc, boolean paramBoolean, ab paramab, com.google.android.gms.ads.internal.gmsg.ad paramad, com.google.android.gms.ads.internal.n paramn, com.google.android.gms.ads.internal.mraid.n paramn1, com.google.android.gms.ads.internal.safebrowsing.m paramm)
  {
    if (paramn == null)
      paramn = new com.google.android.gms.ads.internal.n(this.a.getContext());
    this.n = new com.google.android.gms.ads.internal.mraid.d(this.a, paramn1);
    this.o = paramm;
    a("/appEvent", new com.google.android.gms.ads.internal.gmsg.a(paramb));
    a("/backButton", e.j);
    a("/refresh", e.k);
    a("/canOpenURLs", e.a);
    a("/canOpenIntents", e.b);
    a("/click", e.c);
    a("/close", e.d);
    a("/customClose", e.f);
    a("/instrument", e.o);
    a("/delayPageLoaded", new i(this));
    a("/httpTrack", e.g);
    a("/log", e.h);
    a("/mraid", new af(paramn, this.n));
    a("/mraidLoaded", this.l);
    a("/open", new ag(paramab, paramn, this.n));
    a("/precache", e.n);
    a("/touch", e.i);
    a("/video", e.l);
    a("/videoMeta", e.m);
    a("/appStreaming", e.e);
    if (paramad != null)
      a("/setInterstitialProperties", new ac(paramad));
    this.c = parama;
    this.d = paramak;
    this.f = paramb;
    this.i = paramab;
    this.k = parambc;
    this.m = paramn;
    this.h = paramBoolean;
  }

  public final void a(AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel)
  {
    boolean bool = this.a.p();
    com.google.android.gms.ads.internal.client.a locala;
    ak localak;
    if ((bool) && (!this.a.k().e))
    {
      locala = null;
      localak = null;
      if (!bool)
        break label75;
    }
    while (true)
    {
      a(new AdOverlayInfoParcel(paramAdLauncherIntentInfoParcel, locala, localak, this.k, this.a.o()));
      return;
      locala = this.c;
      break;
      label75: localak = this.d;
    }
  }

  public final void a(AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    if (this.n != null);
    for (boolean bool1 = this.n.b(); ; bool1 = false)
    {
      Context localContext = this.a.getContext();
      boolean bool2 = false;
      if (!bool1)
        bool2 = true;
      ai.a(localContext, paramAdOverlayInfoParcel, bool2);
      if (this.o != null)
      {
        String str = paramAdOverlayInfoParcel.m;
        if ((str == null) && (paramAdOverlayInfoParcel.b != null))
          str = paramAdOverlayInfoParcel.b.c;
        this.o.a(str);
      }
      return;
    }
  }

  public final void a(String paramString, t paramt)
  {
    synchronized (this.b)
    {
      Object localObject3 = (List)this.u.get(paramString);
      if (localObject3 == null)
      {
        localObject3 = new CopyOnWriteArrayList();
        this.u.put(paramString, localObject3);
      }
      ((List)localObject3).add(paramt);
      return;
    }
  }

  public final boolean a()
  {
    synchronized (this.b)
    {
      boolean bool = this.j;
      return bool;
    }
  }

  public final void b(String paramString, t paramt)
  {
    synchronized (this.b)
    {
      List localList = (List)this.u.get(paramString);
      if (localList == null)
        return;
      localList.remove(paramt);
      return;
    }
  }

  public final boolean b()
  {
    synchronized (this.b)
    {
      boolean bool = this.v;
      return bool;
    }
  }

  public final void c()
  {
    if (this.o != null)
      y.a.post(new d(this));
  }

  final void d()
  {
    synchronized (this.b)
    {
      this.v = true;
      this.r = (1 + this.r);
      e();
      return;
    }
  }

  public final void e()
  {
    f localf;
    b localb;
    if ((this.e != null) && (((this.w) && (this.r <= 0)) || (this.q)))
    {
      localf = this.e;
      localb = this.a;
      if (this.q)
        break label70;
    }
    label70: for (boolean bool = true; ; bool = false)
    {
      localf.a(localb, bool);
      this.e = null;
      this.a.B();
      return;
    }
  }

  public final void f()
  {
    if (this.o != null)
    {
      this.o.a();
      this.o = null;
    }
    synchronized (this.b)
    {
      this.u.clear();
      this.c = null;
      this.d = null;
      this.e = null;
      this.f = null;
      this.h = false;
      this.j = false;
      this.v = false;
      this.i = null;
      this.k = null;
      this.g = null;
      if (this.n != null)
      {
        this.n.a(true);
        this.n = null;
      }
      return;
    }
  }

  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0);
    for (String str2 = "Loading resource: ".concat(str1); ; str2 = new String("Loading resource: "))
    {
      com.google.android.gms.ads.internal.util.c.a(str2);
      Uri localUri = Uri.parse(paramString);
      if (("gmsg".equalsIgnoreCase(localUri.getScheme())) && ("mobileads.google.com".equalsIgnoreCase(localUri.getHost())))
        a(localUri);
      return;
    }
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    synchronized (this.b)
    {
      if (this.p)
      {
        com.google.android.gms.ads.internal.util.c.a("Blank page loaded, 1...");
        this.a.s();
        return;
      }
      this.w = true;
      e();
      return;
    }
  }

  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    if ((paramInt < 0) && (-1 + -paramInt < s.length));
    for (String str = s[(-1 + -paramInt)]; ; str = String.valueOf(paramInt))
    {
      a(this.a.getContext(), "http_err", str, paramString2);
      super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
      return;
    }
  }

  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    int i1;
    if (paramSslError != null)
    {
      i1 = paramSslError.getPrimaryError();
      if ((i1 < 0) || (i1 >= t.length))
        break label68;
    }
    label68: for (String str = t[i1]; ; str = String.valueOf(i1))
    {
      a(this.a.getContext(), "ssl_err", str, com.google.android.gms.ads.internal.bc.a().g.a(paramSslError));
      super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
      return;
    }
  }

  public boolean shouldOverrideKeyEvent(WebView paramWebView, KeyEvent paramKeyEvent)
  {
    switch (paramKeyEvent.getKeyCode())
    {
    default:
      return false;
    case 79:
    case 85:
    case 86:
    case 87:
    case 88:
    case 89:
    case 90:
    case 91:
    case 126:
    case 127:
    case 128:
    case 129:
    case 130:
    case 222:
    }
    return true;
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    String str1 = String.valueOf(paramString);
    String str2;
    Object localObject1;
    if (str1.length() != 0)
    {
      str2 = "AdWebView shouldOverrideUrlLoading: ".concat(str1);
      com.google.android.gms.ads.internal.util.c.a(str2);
      localObject1 = Uri.parse(paramString);
      if ((!"gmsg".equalsIgnoreCase(((Uri)localObject1).getScheme())) || (!"mobileads.google.com".equalsIgnoreCase(((Uri)localObject1).getHost())))
        break label83;
      a((Uri)localObject1);
    }
    while (true)
    {
      return true;
      str2 = new String("AdWebView shouldOverrideUrlLoading: ");
      break;
      label83: if ((this.h) && (paramWebView == this.a.a()))
      {
        String str7 = ((Uri)localObject1).getScheme();
        if (("http".equalsIgnoreCase(str7)) || ("https".equalsIgnoreCase(str7)));
        for (int i1 = 1; i1 != 0; i1 = 0)
        {
          if ((this.c != null) && (((Boolean)com.google.android.gms.ads.internal.config.m.J.a()).booleanValue()))
          {
            this.c.e();
            if (this.o != null)
              this.o.a(paramString);
            this.c = null;
          }
          return super.shouldOverrideUrlLoading(paramWebView, paramString);
        }
      }
      if (this.a.a().willNotDraw())
        break label381;
      try
      {
        ha localha = this.a.n();
        if ((localha != null) && (localha.b((Uri)localObject1)))
        {
          Uri localUri = localha.a((Uri)localObject1, this.a.getContext());
          localObject1 = localUri;
        }
        localObject2 = localObject1;
        if ((this.m == null) || (this.m.a()))
          a(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", localObject2.toString(), null, null, null, null, null));
      }
      catch (hb localhb)
      {
        Object localObject2;
        String str5 = String.valueOf(paramString);
        if (str5.length() != 0);
        for (String str6 = "Unable to append parameter to URL: ".concat(str5); ; str6 = new String("Unable to append parameter to URL: "))
        {
          com.google.android.gms.ads.internal.util.c.e(str6);
          localObject2 = localObject1;
          break;
        }
        this.m.a(paramString);
      }
    }
    label381: String str3 = String.valueOf(paramString);
    if (str3.length() != 0);
    for (String str4 = "AdWebView unable to handle URL: ".concat(str3); ; str4 = new String("AdWebView unable to handle URL: "))
    {
      com.google.android.gms.ads.internal.util.c.e(str4);
      break;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.c
 * JD-Core Version:    0.6.0
 */