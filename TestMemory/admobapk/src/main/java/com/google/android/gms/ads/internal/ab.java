package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.Window;
import anw;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.k;
import com.google.android.gms.ads.internal.gmsg.ak;
import com.google.android.gms.ads.internal.gmsg.al;
import com.google.android.gms.ads.internal.gmsg.r;
import com.google.android.gms.ads.internal.mediation.client.e;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.ai;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.bf;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class ab extends g
  implements com.google.android.gms.ads.internal.gmsg.ad, al
{
  boolean i;
  float j;
  private transient boolean k = false;
  private int l = -1;

  public ab(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, com.google.android.gms.ads.internal.mediation.client.b paramb, VersionInfoParcel paramVersionInfoParcel, m paramm)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramb, paramVersionInfoParcel, paramm);
  }

  private final void a(Bundle paramBundle)
  {
    bc.a().e.b(this.d.c, this.d.e.b, "gmob-apps", paramBundle, false);
  }

  private static com.google.android.gms.ads.internal.state.b b(com.google.android.gms.ads.internal.state.b paramb)
  {
    try
    {
      String str1 = com.google.android.gms.ads.internal.request.service.j.a(paramb.b).toString();
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("pubid", paramb.a.e);
      String str2 = localJSONObject.toString();
      com.google.android.gms.ads.internal.mediation.b localb = new com.google.android.gms.ads.internal.mediation.b(str1, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), str2, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList());
      com.google.android.gms.ads.internal.mediation.c localc = new com.google.android.gms.ads.internal.mediation.c(Collections.singletonList(localb), -1L, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1L, 0, 1, null, 0, -1, -1L, false);
      AdResponseParcel localAdResponseParcel1 = paramb.b;
      AdResponseParcel localAdResponseParcel2 = new AdResponseParcel(paramb.a, localAdResponseParcel1.b, localAdResponseParcel1.c, localAdResponseParcel1.d, localAdResponseParcel1.f, localAdResponseParcel1.g, true, localAdResponseParcel1.i, localAdResponseParcel1.j, localAdResponseParcel1.k, localAdResponseParcel1.l, localAdResponseParcel1.m, localAdResponseParcel1.n, localAdResponseParcel1.o, localAdResponseParcel1.p, localAdResponseParcel1.q, localAdResponseParcel1.r, localAdResponseParcel1.s, localAdResponseParcel1.t, localAdResponseParcel1.u, localAdResponseParcel1.v, localAdResponseParcel1.w, localAdResponseParcel1.z, localAdResponseParcel1.A, localAdResponseParcel1.B, localAdResponseParcel1.C, localAdResponseParcel1.D, localAdResponseParcel1.E, localAdResponseParcel1.F, localAdResponseParcel1.G, localAdResponseParcel1.H, localAdResponseParcel1.I, localAdResponseParcel1.J, localAdResponseParcel1.K, localAdResponseParcel1.L, localAdResponseParcel1.M);
      return new com.google.android.gms.ads.internal.state.b(paramb.a, localAdResponseParcel2, localc, paramb.d, paramb.e, paramb.f, paramb.g, paramb.h);
    }
    catch (JSONException localJSONException)
    {
      com.google.android.gms.ads.internal.util.c.b("Unable to generate ad state for an interstitial ad with pooling.", localJSONException);
    }
    return paramb;
  }

  public final void E()
  {
    anw.b("showInterstitial must be called on the main UI thread.");
    if (this.d.j == null)
    {
      com.google.android.gms.ads.internal.util.c.e("The interstitial has not loaded.");
      return;
    }
    d locald1 = com.google.android.gms.ads.internal.config.m.ac;
    if (((Boolean)bc.a().n.a(locald1)).booleanValue())
      if (this.d.c.getApplicationContext() == null)
        break label250;
    label250: for (String str = this.d.c.getApplicationContext().getPackageName(); ; str = this.d.c.getPackageName())
    {
      if (!this.k)
      {
        com.google.android.gms.ads.internal.util.c.e("It is not recommended to show an interstitial before onAdLoaded completes.");
        Bundle localBundle2 = new Bundle();
        localBundle2.putString("appid", str);
        localBundle2.putString("action", "show_interstitial_before_load_finish");
        a(localBundle2);
      }
      if (!bc.a().e.e(this.d.c))
      {
        com.google.android.gms.ads.internal.util.c.e("It is not recommended to show an interstitial when app is not in foreground.");
        Bundle localBundle1 = new Bundle();
        localBundle1.putString("appid", str);
        localBundle1.putString("action", "show_interstitial_app_not_in_foreground");
        a(localBundle1);
      }
      if (this.d.d())
        break;
      if ((!this.d.j.m) || (this.d.j.o == null))
        break label265;
      try
      {
        this.d.j.o.b();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.c.c("Could not show interstitial.", localRemoteException);
        M();
        return;
      }
    }
    label265: if (this.d.j.b == null)
    {
      com.google.android.gms.ads.internal.util.c.e("The interstitial failed to load.");
      return;
    }
    if (this.d.j.b.p())
    {
      com.google.android.gms.ads.internal.util.c.e("The interstitial is already showing.");
      return;
    }
    this.d.j.b.a(true);
    if (this.d.j.j != null)
      this.f.a(this.d.i, this.d.j);
    Bitmap localBitmap;
    bf localbf;
    if (this.d.G)
    {
      localBitmap = bc.a().e.f(this.d.c);
      localbf = bc.a().u;
      if (localBitmap != null)
        break label468;
      com.google.android.gms.ads.internal.util.c.b("Bitmap is null. Skipping putting into the Memory Map.");
    }
    for (int m = -1; ; m = localbf.b.getAndIncrement())
    {
      this.l = m;
      d locald2 = com.google.android.gms.ads.internal.config.m.at;
      if ((!((Boolean)bc.a().n.a(locald2)).booleanValue()) || (localBitmap == null))
        break label501;
      ((Future)new ac(this, this.l).d());
      return;
      localBitmap = null;
      break;
      label468: localbf.a.put(Integer.valueOf(localbf.b.get()), localBitmap);
    }
    label501: InterstitialAdParameterParcel localInterstitialAdParameterParcel = new InterstitialAdParameterParcel(this.d.G, L(), false, 0.0F, -1);
    int n = this.d.j.b.q();
    if (n == -1)
      n = this.d.j.g;
    AdOverlayInfoParcel localAdOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.d.j.b, n, this.d.e, this.d.j.z, localInterstitialAdParameterParcel);
    ai.a(this.d.c, localAdOverlayInfoParcel, true);
  }

  protected final boolean L()
  {
    if (!(this.d.c instanceof Activity))
      return false;
    Window localWindow = ((Activity)this.d.c).getWindow();
    if ((localWindow == null) || (localWindow.getDecorView() == null))
      return false;
    Rect localRect1 = new Rect();
    Rect localRect2 = new Rect();
    localWindow.getDecorView().getGlobalVisibleRect(localRect1, null);
    localWindow.getDecorView().getWindowVisibleDisplayFrame(localRect2);
    return (localRect1.bottom != 0) && (localRect2.bottom != 0) && (localRect1.top == localRect2.top);
  }

  public final void M()
  {
    bf localbf = bc.a().u;
    Integer localInteger = Integer.valueOf(this.l);
    localbf.a.remove(localInteger);
    if (this.d.c())
    {
      this.d.a();
      this.d.j = null;
      this.d.G = false;
      this.k = false;
    }
  }

  public final void N()
  {
    if ((this.d.j != null) && (this.d.j.v != null))
      y.a(this.d.c, this.d.e.b, this.d.j.v);
    q();
  }

  protected final com.google.android.gms.ads.internal.webview.b a(com.google.android.gms.ads.internal.state.b paramb, n paramn, com.google.android.gms.ads.internal.safebrowsing.m paramm)
  {
    com.google.android.gms.ads.internal.webview.b localb = com.google.android.gms.ads.internal.webview.j.a(this.d.c, this.d.i, false, false, this.d.d, this.d.e, this.a, this, this.g);
    com.google.android.gms.ads.internal.webview.c localc = localb.l();
    d locald = com.google.android.gms.ads.internal.config.m.I;
    localc.a(this, null, this, this, ((Boolean)bc.a().n.a(locald)).booleanValue(), this, this, paramn, null, paramm);
    a(localb);
    localb.b(paramb.a.w);
    localb.l().a("/reward", new ak(this));
    r.a(localb);
    return localb;
  }

  public final void a(com.google.android.gms.ads.internal.state.b paramb, com.google.android.gms.ads.internal.csi.l paraml)
  {
    int m = 1;
    d locald = com.google.android.gms.ads.internal.config.m.O;
    if (!((Boolean)bc.a().n.a(locald)).booleanValue())
    {
      super.a(paramb, paraml);
      return;
    }
    if (paramb.e != -2)
    {
      super.a(paramb, paraml);
      return;
    }
    Bundle localBundle = paramb.a.c.m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
    int n;
    if ((localBundle == null) || (!localBundle.containsKey("gw")))
    {
      n = m;
      if (paramb.b.h)
        break label135;
    }
    while (true)
    {
      if ((n != 0) && (m != 0))
        this.d.k = b(paramb);
      super.a(this.d.k, paraml);
      return;
      n = 0;
      break;
      label135: m = 0;
    }
  }

  public final void a(boolean paramBoolean, float paramFloat)
  {
    this.i = paramBoolean;
    this.j = paramFloat;
  }

  public final boolean a(AdRequestParcel paramAdRequestParcel, com.google.android.gms.ads.internal.csi.l paraml)
  {
    if (this.d.j != null)
    {
      com.google.android.gms.ads.internal.util.c.e("An interstitial is already loading. Aborting.");
      return false;
    }
    return super.a(paramAdRequestParcel, paraml);
  }

  protected final boolean a(AdRequestParcel paramAdRequestParcel, com.google.android.gms.ads.internal.state.a parama, boolean paramBoolean)
  {
    if ((this.d.c()) && (parama.b != null))
      com.google.android.gms.ads.internal.util.ad.a(parama.b);
    return this.c.b;
  }

  public final boolean a(com.google.android.gms.ads.internal.state.a parama1, com.google.android.gms.ads.internal.state.a parama2)
  {
    if (!super.a(parama1, parama2))
      return false;
    if ((!this.d.c()) && (this.d.D != null) && (parama2.j != null))
      this.f.a(this.d.i, parama2, this.d.D);
    return true;
  }

  public final void b(RewardItemParcel paramRewardItemParcel)
  {
    if (this.d.j != null)
    {
      if (this.d.j.w != null)
        y.a(this.d.c, this.d.e.b, this.d.j.w);
      if (this.d.j.u != null)
        paramRewardItemParcel = this.d.j.u;
    }
    a(paramRewardItemParcel);
  }

  public final void b(boolean paramBoolean)
  {
    this.d.G = paramBoolean;
  }

  protected final void m()
  {
    M();
    super.m();
  }

  protected final void p()
  {
    super.p();
    this.k = true;
  }

  public final void t()
  {
    C();
    super.t();
    if ((this.d.j != null) && (this.d.j.b != null))
    {
      com.google.android.gms.ads.internal.webview.c localc = this.d.j.b.l();
      if (localc != null)
        localc.c();
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.ab
 * JD-Core Version:    0.6.0
 */