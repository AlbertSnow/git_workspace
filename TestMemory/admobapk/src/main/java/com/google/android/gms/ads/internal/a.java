package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import anw;
import aoo;
import apj;
import apn;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ThinAdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.client.ai;
import com.google.android.gms.ads.internal.client.an;
import com.google.android.gms.ads.internal.client.at;
import com.google.android.gms.ads.internal.client.f;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.client.s;
import com.google.android.gms.ads.internal.client.v;
import com.google.android.gms.ads.internal.purchase.client.p;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.state.h;
import com.google.android.gms.ads.internal.state.i;
import com.google.android.gms.ads.internal.util.ac;
import com.google.android.gms.ads.internal.util.ad;
import com.google.android.gms.ads.internal.util.bk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Timer;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;

@com.google.android.gms.ads.internal.report.client.a
public abstract class a extends ai
  implements com.google.android.gms.ads.internal.client.a, com.google.android.gms.ads.internal.gmsg.b, com.google.android.gms.ads.internal.overlay.bc, com.google.android.gms.ads.internal.renderer.k, com.google.android.gms.ads.internal.request.b, com.google.android.gms.ads.internal.state.j
{
  public com.google.android.gms.ads.internal.csi.l a;
  public boolean b = false;
  public final as c;
  public final bd d;
  public transient AdRequestParcel e;
  public final com.google.android.gms.ads.internal.activeview.l f;
  public final m g;
  private com.google.android.gms.ads.internal.csi.j h;
  private com.google.android.gms.ads.internal.csi.j i;

  a(bd parambd, as paramas, m paramm)
  {
    this.d = parambd;
    y localy;
    Context localContext;
    if (paramas != null)
    {
      this.c = paramas;
      this.g = paramm;
      localy = bc.a().e;
      localContext = this.d.c;
      if (!localy.e)
        break label207;
    }
    while (true)
    {
      bc.a().h.a(this.d.c, this.d.e);
      this.f = bc.a().h.c;
      com.google.android.gms.ads.internal.config.d locald1 = com.google.android.gms.ads.internal.config.m.az;
      if (((Boolean)bc.a().n.a(locald1)).booleanValue())
      {
        Timer localTimer = new Timer();
        com.google.android.gms.ads.internal.config.d locald2 = com.google.android.gms.ads.internal.config.m.aB;
        b localb = new b(this, new CountDownLatch(((Integer)bc.a().n.a(locald2)).intValue()), localTimer);
        com.google.android.gms.ads.internal.config.d locald3 = com.google.android.gms.ads.internal.config.m.aA;
        localTimer.schedule(localb, 0L, ((Long)bc.a().n.a(locald3)).longValue());
      }
      return;
      paramas = new as(this);
      break;
      label207: IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.USER_PRESENT");
      localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
      localContext.getApplicationContext().registerReceiver(new ac(localy), localIntentFilter);
      localy.e = true;
    }
  }

  static Bundle a(com.google.android.gms.ads.internal.appcontent.d paramd)
  {
    Bundle localBundle;
    if (paramd == null)
    {
      localBundle = null;
      return localBundle;
    }
    if (paramd.a);
    while (true)
    {
      synchronized (paramd.b)
      {
        paramd.a = false;
        paramd.b.notifyAll();
        com.google.android.gms.ads.internal.util.c.b("ContentFetchThread: wakeup");
        com.google.android.gms.ads.internal.appcontent.a locala = paramd.c.a();
        if (locala == null)
          break label177;
        str1 = locala.f;
        str2 = locala.g;
        String str3 = String.valueOf(locala.toString());
        if (str3.length() != 0)
        {
          str4 = "In AdManager: loadAd, ".concat(str3);
          com.google.android.gms.ads.internal.util.c.b(str4);
          if (str1 == null)
            continue;
          bc.a().h.a(str1);
          if (str1 == null)
            break label192;
          localBundle = new Bundle(1);
          localBundle.putString("fingerprint", str1);
          if (str1.equals(str2))
            break;
          localBundle.putString("v_fp", str2);
          return localBundle;
        }
      }
      String str4 = new String("In AdManager: loadAd, ");
      continue;
      label177: String str1 = bc.a().h.g();
      String str2 = null;
    }
    label192: return null;
  }

  private static long b(String paramString)
  {
    int j = paramString.indexOf("ufe");
    int k = paramString.indexOf(',', j);
    if (k == -1)
      k = paramString.length();
    int m = j + 4;
    try
    {
      long l = Long.parseLong(paramString.substring(m, k));
      return l;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      com.google.android.gms.ads.internal.util.c.e("Invalid index for Url fetch time in CSI latency info.");
      return -1L;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
        com.google.android.gms.ads.internal.util.c.e("Cannot find valid format of Url fetch time in CSI latency info.");
    }
  }

  public void a()
  {
    anw.b("destroy must be called on the main UI thread.");
    this.c.a();
    com.google.android.gms.ads.internal.activeview.l locall = this.f;
    com.google.android.gms.ads.internal.state.a locala = this.d.j;
    synchronized (locall.a)
    {
      com.google.android.gms.ads.internal.activeview.a locala1 = (com.google.android.gms.ads.internal.activeview.a)locall.b.get(locala);
      if (locala1 != null)
        locala1.f();
      bd localbd = this.d;
      if (localbd.f != null)
      {
        be localbe = localbd.f;
        com.google.android.gms.ads.internal.util.c.a("Disable position monitoring on adFrame.");
        if (localbe.b != null)
          localbe.b.b();
      }
      localbd.n = null;
      localbd.o = null;
      localbd.r = null;
      localbd.q = null;
      localbd.y = null;
      localbd.p = null;
      localbd.a(false);
      if (localbd.f != null)
        localbd.f.removeAllViews();
      localbd.a();
      localbd.b();
      localbd.j = null;
      return;
    }
  }

  protected final void a(int paramInt)
  {
    com.google.android.gms.ads.internal.util.c.e(30 + "Failed to load ad: " + paramInt);
    this.b = false;
    if (this.d.n != null);
    try
    {
      this.d.n.a(paramInt);
      if (this.d.z == null);
    }
    catch (RemoteException localRemoteException2)
    {
      try
      {
        this.d.z.a(paramInt);
        return;
        localRemoteException2 = localRemoteException2;
        com.google.android.gms.ads.internal.util.c.c("Could not call AdListener.onAdFailedToLoad().", localRemoteException2);
      }
      catch (RemoteException localRemoteException1)
      {
        com.google.android.gms.ads.internal.util.c.c("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", localRemoteException1);
      }
    }
  }

  protected final void a(View paramView)
  {
    this.d.f.addView(paramView, bc.a().g.d());
  }

  public final void a(AdSizeParcel paramAdSizeParcel)
  {
    anw.b("setAdSize must be called on the main UI thread.");
    this.d.i = paramAdSizeParcel;
    if ((this.d.j != null) && (this.d.j.b != null) && (this.d.E == 0))
      this.d.j.b.a(paramAdSizeParcel);
    if (this.d.f == null)
      return;
    if (this.d.f.getChildCount() > 1)
      this.d.f.removeView(this.d.f.getNextView());
    this.d.f.setMinimumWidth(paramAdSizeParcel.g);
    this.d.f.setMinimumHeight(paramAdSizeParcel.d);
    this.d.f.requestLayout();
  }

  public final void a(VideoOptionsParcel paramVideoOptionsParcel)
  {
    anw.b("setVideoOptions must be called on the main UI thread.");
    this.d.x = paramVideoOptionsParcel;
  }

  public final void a(an paraman)
  {
    anw.b("setAppEventListener must be called on the main UI thread.");
    this.d.o = paraman;
  }

  public final void a(at paramat)
  {
    anw.b("setCorrelationIdProvider must be called on the main UI thread");
    this.d.p = paramat;
  }

  public final void a(s params)
  {
    anw.b("setAdListener must be called on the main UI thread.");
    this.d.m = params;
  }

  public final void a(v paramv)
  {
    anw.b("setAdListener must be called on the main UI thread.");
    this.d.n = paramv;
  }

  public void a(com.google.android.gms.ads.internal.customrenderedad.client.d paramd)
  {
    throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
  }

  public void a(com.google.android.gms.ads.internal.purchase.client.d paramd)
  {
    throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
  }

  public void a(p paramp, String paramString)
  {
    throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
  }

  public final void a(com.google.android.gms.ads.internal.reward.client.j paramj)
  {
    anw.b("setRewardedVideoAdListener can only be called from the UI thread.");
    this.d.z = paramj;
  }

  public final void a(RewardItemParcel paramRewardItemParcel)
  {
    if (this.d.z == null)
      return;
    String str = "";
    int j = 0;
    if (paramRewardItemParcel != null);
    try
    {
      str = paramRewardItemParcel.b;
      j = paramRewardItemParcel.c;
      this.d.z.a(new com.google.android.gms.ads.internal.reward.a(str, j));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.c.c("Could not call RewardedVideoAdListener.onRewarded().", localRemoteException);
    }
  }

  public final void a(com.google.android.gms.ads.internal.state.b paramb)
  {
    if ((paramb.b.n != -1L) && (!TextUtils.isEmpty(paramb.b.y)))
    {
      long l = b(paramb.b.y);
      if (l != -1L)
      {
        com.google.android.gms.ads.internal.csi.j localj = this.a.a(l + paramb.b.n);
        this.a.a(localj, new String[] { "stc" });
      }
    }
    com.google.android.gms.ads.internal.csi.l locall = this.a;
    String str = paramb.b.y;
    if (locall.a);
    synchronized (locall.b)
    {
      locall.c = str;
      this.a.a(this.h, new String[] { "arf" });
      this.i = this.a.a();
      this.a.a("gqi", paramb.b.z);
      this.d.g = null;
      this.d.k = paramb;
      a(paramb, this.a);
      return;
    }
  }

  public abstract void a(com.google.android.gms.ads.internal.state.b paramb, com.google.android.gms.ads.internal.csi.l paraml);

  public final void a(String paramString)
  {
    com.google.android.gms.ads.internal.util.c.e("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
  }

  public final void a(String paramString1, String paramString2)
  {
    if (this.d.o != null);
    try
    {
      this.d.o.a(paramString1, paramString2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.c.c("Could not call the AppEventListener.", localRemoteException);
    }
  }

  public final void a(HashSet paramHashSet)
  {
    this.d.H = paramHashSet;
  }

  public void a(boolean paramBoolean)
  {
    throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
  }

  public boolean a(AdRequestParcel paramAdRequestParcel)
  {
    anw.b("loadAd must be called on the main UI thread.");
    if ((aoo.b(this.d.c)) && (paramAdRequestParcel.k != null))
    {
      f localf = new f(paramAdRequestParcel);
      localf.a = null;
      paramAdRequestParcel = localf.a();
    }
    if ((this.d.g != null) || (this.d.h != null))
    {
      if (this.e != null)
        com.google.android.gms.ads.internal.util.c.e("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
      while (true)
      {
        this.e = paramAdRequestParcel;
        return false;
        com.google.android.gms.ads.internal.util.c.e("Loading already in progress, saving this object for future refreshes.");
      }
    }
    com.google.android.gms.ads.internal.util.c.d("Starting ad request.");
    com.google.android.gms.ads.internal.config.d locald = com.google.android.gms.ads.internal.config.m.v;
    this.a = new com.google.android.gms.ads.internal.csi.l(((Boolean)bc.a().n.a(locald)).booleanValue(), "load_ad", this.d.i.b);
    this.h = new com.google.android.gms.ads.internal.csi.j(-1L, null, null);
    this.i = new com.google.android.gms.ads.internal.csi.j(-1L, null, null);
    this.h = this.a.a();
    if (!paramAdRequestParcel.f)
    {
      String str = String.valueOf(q.a().a.a(this.d.c));
      com.google.android.gms.ads.internal.util.c.d(71 + String.valueOf(str).length() + "Use AdRequest.Builder.addTestDevice(\"" + str + "\") to get test ads on this device.");
    }
    this.b = a(paramAdRequestParcel, this.a);
    return this.b;
  }

  protected abstract boolean a(AdRequestParcel paramAdRequestParcel, com.google.android.gms.ads.internal.csi.l paraml);

  boolean a(com.google.android.gms.ads.internal.state.a parama)
  {
    return false;
  }

  public abstract boolean a(com.google.android.gms.ads.internal.state.a parama1, com.google.android.gms.ads.internal.state.a parama2);

  public final apj b()
  {
    anw.b("getAdFrame must be called on the main UI thread.");
    return apn.a(this.d.f);
  }

  public void b(com.google.android.gms.ads.internal.state.a parama)
  {
    this.a.a(this.i, new String[] { "awr" });
    this.d.h = null;
    h localh;
    HashSet localHashSet;
    if ((parama.d != -2) && (parama.d != 3))
    {
      localh = bc.a().h;
      localHashSet = this.d.H;
    }
    synchronized (localh.a)
    {
      localh.d.addAll(localHashSet);
      if (parama.d == -1)
      {
        this.b = false;
        return;
      }
    }
    if (a(parama))
      com.google.android.gms.ads.internal.util.c.b("Ad refresh scheduled.");
    if (parama.d != -2)
    {
      a(parama.d);
      return;
    }
    if (this.d.C == null)
      this.d.C = new com.google.android.gms.ads.internal.state.k(this.d.b);
    this.f.a(this.d.j);
    String str1;
    label295: String str2;
    label329: com.google.android.gms.ads.internal.csi.l locall3;
    if (a(this.d.j, parama))
    {
      this.d.j = parama;
      bd localbd = this.d;
      localbd.l.a(localbd.j.x);
      localbd.l.b(localbd.j.y);
      localbd.l.a(localbd.i.e);
      localbd.l.b(localbd.j.m);
      com.google.android.gms.ads.internal.csi.l locall1 = this.a;
      if (!this.d.j.a())
        break label505;
      str1 = "1";
      locall1.a("is_mraid", str1);
      com.google.android.gms.ads.internal.csi.l locall2 = this.a;
      if (!this.d.j.m)
        break label513;
      str2 = "1";
      locall2.a("is_mediation", str2);
      if ((this.d.j.b != null) && (this.d.j.b.l() != null))
      {
        locall3 = this.a;
        if (!this.d.j.b.l().b())
          break label521;
      }
    }
    label513: label521: for (String str3 = "1"; ; str3 = "0")
    {
      locall3.a("is_delay_pl", str3);
      this.a.a(this.h, new String[] { "ttc" });
      if (bc.a().h.c() != null)
        bc.a().h.c().a(this.a);
      if (this.d.c())
        p();
      if (parama.D == null)
        break;
      bc.a().e.a(this.d.c, parama.D);
      return;
      label505: str1 = "0";
      break label295;
      str2 = "0";
      break label329;
    }
  }

  protected boolean b(AdRequestParcel paramAdRequestParcel)
  {
    if (this.d.f == null)
      return false;
    ViewParent localViewParent = this.d.f.getParent();
    if (!(localViewParent instanceof View))
      return false;
    View localView = (View)localViewParent;
    return bc.a().e.a(localView, localView.getContext());
  }

  public final AdSizeParcel c()
  {
    anw.b("getAdSize must be called on the main UI thread.");
    if (this.d.i == null)
      return null;
    return new ThinAdSizeParcel(this.d.i);
  }

  public final boolean d()
  {
    anw.b("isLoaded must be called on the main UI thread.");
    return (this.d.g == null) && (this.d.h == null) && (this.d.j != null);
  }

  public void e()
  {
    if (this.d.j == null)
      com.google.android.gms.ads.internal.util.c.e("Ad state was null when trying to ping click URLs.");
    while (true)
    {
      return;
      com.google.android.gms.ads.internal.util.c.b("Pinging click URLs.");
      com.google.android.gms.ads.internal.state.c localc = this.d.l;
      synchronized (localc.c)
      {
        if (localc.j != -1L)
        {
          com.google.android.gms.ads.internal.state.d locald = new com.google.android.gms.ads.internal.state.d();
          locald.a = SystemClock.elapsedRealtime();
          localc.b.add(locald);
          localc.h = (1L + localc.h);
          localc.a.b().a();
          localc.a.a(localc);
        }
        if (this.d.j.c != null)
          y.a(this.d.c, this.d.e.b, this.d.j.c);
        if (this.d.m == null)
          continue;
        try
        {
          this.d.m.a();
          return;
        }
        catch (RemoteException localRemoteException)
        {
          com.google.android.gms.ads.internal.util.c.c("Could not notify onAdClicked event.", localRemoteException);
          return;
        }
      }
    }
  }

  public final void f()
  {
    n();
  }

  public final void g()
  {
    anw.b("recordManualImpression must be called on the main UI thread.");
    if (this.d.j == null)
      com.google.android.gms.ads.internal.util.c.e("Ad state was null when trying to ping manual tracking URLs.");
    do
    {
      return;
      com.google.android.gms.ads.internal.util.c.b("Pinging manual tracking URLs.");
    }
    while ((this.d.j.f == null) || (this.d.j.C));
    y.a(this.d.c, this.d.e.b, this.d.j.f);
    this.d.j.C = true;
  }

  public void h()
  {
    anw.b("pause must be called on the main UI thread.");
  }

  public void i()
  {
    anw.b("resume must be called on the main UI thread.");
  }

  public final void j()
  {
    anw.b("stopLoading must be called on the main UI thread.");
    this.b = false;
    this.d.a(true);
  }

  public final boolean k()
  {
    return this.b;
  }

  public com.google.android.gms.ads.internal.client.bc l()
  {
    return null;
  }

  public void m()
  {
    com.google.android.gms.ads.internal.util.c.d("Ad closing.");
    if (this.d.n != null);
    try
    {
      this.d.n.a();
      if (this.d.z == null);
    }
    catch (RemoteException localRemoteException2)
    {
      try
      {
        this.d.z.d();
        return;
        localRemoteException2 = localRemoteException2;
        com.google.android.gms.ads.internal.util.c.c("Could not call AdListener.onAdClosed().", localRemoteException2);
      }
      catch (RemoteException localRemoteException1)
      {
        com.google.android.gms.ads.internal.util.c.c("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", localRemoteException1);
      }
    }
  }

  public final void n()
  {
    com.google.android.gms.ads.internal.util.c.d("Ad leaving application.");
    if (this.d.n != null);
    try
    {
      this.d.n.b();
      if (this.d.z == null);
    }
    catch (RemoteException localRemoteException2)
    {
      try
      {
        this.d.z.e();
        return;
        localRemoteException2 = localRemoteException2;
        com.google.android.gms.ads.internal.util.c.c("Could not call AdListener.onAdLeftApplication().", localRemoteException2);
      }
      catch (RemoteException localRemoteException1)
      {
        com.google.android.gms.ads.internal.util.c.c("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", localRemoteException1);
      }
    }
  }

  public final void o()
  {
    com.google.android.gms.ads.internal.util.c.d("Ad opening.");
    if (this.d.n != null);
    try
    {
      this.d.n.d();
      if (this.d.z == null);
    }
    catch (RemoteException localRemoteException2)
    {
      try
      {
        this.d.z.b();
        return;
        localRemoteException2 = localRemoteException2;
        com.google.android.gms.ads.internal.util.c.c("Could not call AdListener.onAdOpened().", localRemoteException2);
      }
      catch (RemoteException localRemoteException1)
      {
        com.google.android.gms.ads.internal.util.c.c("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", localRemoteException1);
      }
    }
  }

  protected void p()
  {
    com.google.android.gms.ads.internal.util.c.d("Ad finished loading.");
    this.b = false;
    if (this.d.n != null);
    try
    {
      this.d.n.c();
      if (this.d.z == null);
    }
    catch (RemoteException localRemoteException2)
    {
      try
      {
        this.d.z.a();
        return;
        localRemoteException2 = localRemoteException2;
        com.google.android.gms.ads.internal.util.c.c("Could not call AdListener.onAdLoaded().", localRemoteException2);
      }
      catch (RemoteException localRemoteException1)
      {
        com.google.android.gms.ads.internal.util.c.c("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", localRemoteException1);
      }
    }
  }

  public final void q()
  {
    if (this.d.z == null)
      return;
    try
    {
      this.d.z.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.c.c("Could not call RewardedVideoAdListener.onVideoStarted().", localRemoteException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.a
 * JD-Core Version:    0.6.0
 */