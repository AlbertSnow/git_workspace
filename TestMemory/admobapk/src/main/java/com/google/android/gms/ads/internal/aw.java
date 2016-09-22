package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebSettings;
import android.webkit.WebView;
import anw;
import apj;
import apn;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.adshield.b;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.client.ai;
import com.google.android.gms.ads.internal.client.an;
import com.google.android.gms.ads.internal.client.at;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.client.v;
import com.google.android.gms.ads.internal.config.k;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.purchase.client.p;
import com.google.android.gms.ads.internal.reward.client.j;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

@com.google.android.gms.ads.internal.report.client.a
public final class aw extends ai
{
  final VersionInfoParcel a;
  final Future b;
  final Context c;
  WebView d;
  v e;
  com.google.android.gms.ads.adshield.a f;
  private final AdSizeParcel g;
  private final bb h;
  private AsyncTask i;

  public aw(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, VersionInfoParcel paramVersionInfoParcel)
  {
    this.c = paramContext;
    this.a = paramVersionInfoParcel;
    this.g = paramAdSizeParcel;
    this.d = new WebView(this.c);
    az localaz = new az(this);
    this.b = com.google.android.gms.ads.internal.util.s.a(com.google.android.gms.ads.internal.util.s.a, localaz);
    this.h = new bb(paramString);
    a(0);
    this.d.setVerticalScrollBarEnabled(false);
    this.d.getSettings().setJavaScriptEnabled(true);
    this.d.setWebViewClient(new ax(this));
    this.d.setOnTouchListener(new ay(this));
  }

  public final String D()
  {
    return null;
  }

  public final void E()
  {
    throw new IllegalStateException("Unused method");
  }

  public final void a()
  {
    anw.b("destroy must be called on the main UI thread.");
    this.i.cancel(true);
    this.b.cancel(true);
    this.d.destroy();
    this.d = null;
  }

  final void a(int paramInt)
  {
    if (this.d == null)
      return;
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, paramInt);
    this.d.setLayoutParams(localLayoutParams);
  }

  public final void a(AdSizeParcel paramAdSizeParcel)
  {
    throw new IllegalStateException("AdSize must be set before initialization");
  }

  public final void a(VideoOptionsParcel paramVideoOptionsParcel)
  {
    throw new IllegalStateException("Unused method");
  }

  public final void a(an paraman)
  {
    throw new IllegalStateException("Unused method");
  }

  public final void a(at paramat)
  {
    throw new IllegalStateException("Unused method");
  }

  public final void a(com.google.android.gms.ads.internal.client.s params)
  {
    throw new IllegalStateException("Unused method");
  }

  public final void a(v paramv)
  {
    this.e = paramv;
  }

  public final void a(com.google.android.gms.ads.internal.customrenderedad.client.d paramd)
  {
    throw new IllegalStateException("Unused method");
  }

  public final void a(com.google.android.gms.ads.internal.purchase.client.d paramd)
  {
    throw new IllegalStateException("Unused method");
  }

  public final void a(p paramp, String paramString)
  {
    throw new IllegalStateException("Unused method");
  }

  public final void a(j paramj)
  {
    throw new IllegalStateException("Unused method");
  }

  public final void a(String paramString)
  {
    throw new IllegalStateException("Unused method");
  }

  public final void a(boolean paramBoolean)
  {
  }

  public final boolean a(AdRequestParcel paramAdRequestParcel)
  {
    anw.a(this.d, "This Search Ad has already been torn down");
    bb localbb = this.h;
    localbb.c = paramAdRequestParcel.j.o;
    if (paramAdRequestParcel.m != null);
    for (Bundle localBundle = paramAdRequestParcel.m.getBundle(AdMobAdapter.class.getName()); ; localBundle = null)
    {
      if (localBundle != null)
      {
        com.google.android.gms.ads.internal.config.d locald = m.aK;
        String str1 = (String)bc.a().n.a(locald);
        Iterator localIterator = localBundle.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str2 = (String)localIterator.next();
          if (str1.equals(str2))
          {
            localbb.d = localBundle.getString(str2);
            continue;
          }
          if (!str2.startsWith("csa_"))
            continue;
          localbb.b.put(str2.substring(4), localBundle.getString(str2));
        }
      }
      this.i = new ba(this).execute(new Void[0]);
      return true;
    }
  }

  final int b(String paramString)
  {
    String str = Uri.parse(paramString).getQueryParameter("height");
    if (TextUtils.isEmpty(str))
      return 0;
    try
    {
      int j = q.a().a.a(this.c, Integer.parseInt(str));
      return j;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return 0;
  }

  public final apj b()
  {
    anw.b("getAdFrame must be called on the main UI thread.");
    return apn.a(this.d);
  }

  public final AdSizeParcel c()
  {
    return this.g;
  }

  final String c(String paramString)
  {
    if (this.f == null)
      return paramString;
    Uri localUri1 = Uri.parse(paramString);
    try
    {
      com.google.android.gms.ads.adshield.a locala = this.f;
      Context localContext = this.c;
      apj localapj1 = apn.a(localUri1);
      apj localapj2 = apn.a(localContext);
      localapj3 = locala.a.b(localapj1, localapj2);
      if (localapj3 == null)
        throw new b();
    }
    catch (RemoteException localRemoteException)
    {
      apj localapj3;
      com.google.android.gms.ads.internal.util.c.c("Unable to process ad data", localRemoteException);
      for (localUri2 = localUri1; ; localUri2 = (Uri)apn.a(localapj3))
        return localUri2.toString();
    }
    catch (b localb)
    {
      while (true)
      {
        com.google.android.gms.ads.internal.util.c.c("Unable to parse ad click url", localb);
        Uri localUri2 = localUri1;
      }
    }
  }

  public final boolean d()
  {
    return false;
  }

  final String e()
  {
    Uri.Builder localBuilder1 = new Uri.Builder();
    Uri.Builder localBuilder2 = localBuilder1.scheme("https://");
    com.google.android.gms.ads.internal.config.d locald = m.aJ;
    localBuilder2.appendEncodedPath((String)bc.a().n.a(locald));
    localBuilder1.appendQueryParameter("query", this.h.c);
    localBuilder1.appendQueryParameter("pubId", this.h.a);
    Map localMap = this.h.b;
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str3 = (String)localIterator.next();
      localBuilder1.appendQueryParameter(str3, (String)localMap.get(str3));
    }
    Uri localUri1 = localBuilder1.build();
    if (this.f != null);
    try
    {
      com.google.android.gms.ads.adshield.a locala = this.f;
      Context localContext = this.c;
      apj localapj1 = apn.a(localUri1);
      apj localapj2 = apn.a(localContext);
      localapj3 = locala.a.a(localapj1, localapj2);
      if (localapj3 == null)
        throw new b();
    }
    catch (b localb)
    {
      apj localapj3;
      com.google.android.gms.ads.internal.util.c.c("Unable to process ad data", localb);
      for (Uri localUri2 = localUri1; ; localUri2 = (Uri)apn.a(localapj3))
      {
        String str1 = String.valueOf(f());
        String str2 = String.valueOf(localUri2.getEncodedQuery());
        return 1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + "#" + str2;
      }
    }
    catch (RemoteException localRemoteException)
    {
      label205: break label205;
    }
  }

  final String f()
  {
    String str1 = this.h.d;
    if (TextUtils.isEmpty(str1));
    for (String str2 = "www.google.com"; ; str2 = str1)
    {
      String str3 = String.valueOf("https://");
      com.google.android.gms.ads.internal.config.d locald = m.aJ;
      String str4 = (String)bc.a().n.a(locald);
      return 0 + String.valueOf(str3).length() + String.valueOf(str2).length() + String.valueOf(str4).length() + str3 + str2 + str4;
    }
  }

  public final void g()
  {
    throw new IllegalStateException("Unused method");
  }

  public final void h()
  {
    anw.b("pause must be called on the main UI thread.");
  }

  public final void i()
  {
    anw.b("resume must be called on the main UI thread.");
  }

  public final void j()
  {
  }

  public final boolean k()
  {
    return false;
  }

  public final com.google.android.gms.ads.internal.client.bc l()
  {
    return null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.aw
 * JD-Core Version:    0.6.0
 */