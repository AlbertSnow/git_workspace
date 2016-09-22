package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import anw;
import apn;
import com.google.android.gms.ads.internal.activeview.l;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.k;
import com.google.android.gms.ads.internal.gmsg.r;
import com.google.android.gms.ads.internal.mediation.client.e;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import java.util.List;
import mi;

@com.google.android.gms.ads.internal.report.client.a
public final class o extends g
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private boolean i;

  public o(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, com.google.android.gms.ads.internal.mediation.client.b paramb, VersionInfoParcel paramVersionInfoParcel, m paramm)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramb, paramVersionInfoParcel, paramm);
  }

  private final boolean b(com.google.android.gms.ads.internal.state.a parama1, com.google.android.gms.ads.internal.state.a parama2)
  {
    View localView2;
    if (parama2.m)
    {
      localView2 = af.a(parama2);
      if (localView2 == null)
      {
        com.google.android.gms.ads.internal.util.c.e("Could not get mediation view");
        return false;
      }
      View localView3 = this.d.f.getNextView();
      if (localView3 != null)
      {
        if ((localView3 instanceof com.google.android.gms.ads.internal.webview.b))
          ((com.google.android.gms.ads.internal.webview.b)localView3).destroy();
        this.d.f.removeView(localView3);
      }
      if (af.b(parama2));
    }
    while (true)
    {
      View localView1;
      try
      {
        a(localView2);
        if (this.d.f.getChildCount() <= 1)
          continue;
        this.d.f.showNext();
        if (parama1 == null)
          continue;
        localView1 = this.d.f.getNextView();
        if (!(localView1 instanceof com.google.android.gms.ads.internal.webview.b))
          break label276;
        ((com.google.android.gms.ads.internal.webview.b)localView1).a(this.d.c, this.d.i, this.a);
        this.d.b();
        this.d.f.setVisibility(0);
        return true;
      }
      catch (Throwable localThrowable)
      {
        com.google.android.gms.ads.internal.util.c.c("Could not add mediation view to view hierarchy.", localThrowable);
        return false;
      }
      if ((parama2.t == null) || (parama2.b == null))
        continue;
      parama2.b.a(parama2.t);
      this.d.f.removeAllViews();
      this.d.f.setMinimumWidth(parama2.t.g);
      this.d.f.setMinimumHeight(parama2.t.d);
      a(parama2.b.b());
      continue;
      label276: if (localView1 == null)
        continue;
      this.d.f.removeView(localView1);
    }
  }

  private void c(com.google.android.gms.ads.internal.state.a parama)
  {
    if (parama == null);
    do
      return;
    while ((parama.l) || (this.d.f == null) || (!bc.a().e.a(this.d.f, this.d.c)) || (!this.d.f.getGlobalVisibleRect(new Rect(), null)));
    a(parama, false);
    parama.l = true;
  }

  public final void E()
  {
    throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
  }

  protected final com.google.android.gms.ads.internal.webview.b a(com.google.android.gms.ads.internal.state.b paramb, n paramn, com.google.android.gms.ads.internal.safebrowsing.m paramm)
  {
    AdSizeParcel localAdSizeParcel;
    if (this.d.i.j)
    {
      bd localbd = this.d;
      if (paramb.b.A)
      {
        localAdSizeParcel = this.d.i;
        localbd.i = localAdSizeParcel;
      }
    }
    else
    {
      com.google.android.gms.ads.internal.webview.b localb = super.a(paramb, paramn, paramm);
      r.a(localb);
      return localb;
    }
    String str = paramb.b.m;
    String[] arrayOfString;
    if (str != null)
    {
      arrayOfString = str.split("[xX]");
      arrayOfString[0] = arrayOfString[0].trim();
      arrayOfString[1] = arrayOfString[1].trim();
    }
    for (mi localmi = new mi(Integer.parseInt(arrayOfString[0]), Integer.parseInt(arrayOfString[1])); ; localmi = this.d.i.c())
    {
      localAdSizeParcel = new AdSizeParcel(this.d.c, localmi);
      break;
    }
  }

  protected final void a(com.google.android.gms.ads.internal.state.a parama, boolean paramBoolean)
  {
    super.a(parama, paramBoolean);
    q localq;
    com.google.android.gms.ads.internal.webview.b localb;
    if (af.b(parama))
    {
      localq = new q(this);
      if ((parama != null) && (af.b(parama)))
      {
        localb = parama.b;
        if (localb == null)
          break label64;
      }
    }
    label64: for (View localView = localb.b(); localView == null; localView = null)
    {
      com.google.android.gms.ads.internal.util.c.e("AdWebView is null");
      return;
    }
    List localList;
    while (true)
    {
      try
      {
        if (parama.n != null)
        {
          localList = parama.n.o;
          if ((localList != null) && (!localList.isEmpty()))
            break;
          com.google.android.gms.ads.internal.util.c.e("No template ids present in mediation response");
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.c.c("Error occurred while recording impression and registering for clicks", localRemoteException);
        return;
      }
      localList = null;
    }
    if (parama.o != null);
    for (com.google.android.gms.ads.internal.mediation.client.n localn = parama.o.h(); ; localn = null)
    {
      e locale = parama.o;
      com.google.android.gms.ads.internal.mediation.client.q localq1 = null;
      if (locale != null)
        localq1 = parama.o.i();
      if ((localList.contains("2")) && (localn != null))
      {
        localn.b(apn.a(localView));
        if (!localn.j())
          localn.i();
        localb.l().a("/nativeExpressViewClicked", af.a(localn, null, localq));
        return;
      }
      if ((localList.contains("1")) && (localq1 != null))
      {
        localq1.b(apn.a(localView));
        if (!localq1.h())
          localq1.g();
        localb.l().a("/nativeExpressViewClicked", af.a(null, localq1, localq));
        return;
      }
      com.google.android.gms.ads.internal.util.c.e("No matching template id and mapper");
      return;
    }
  }

  public final void a(boolean paramBoolean)
  {
    anw.b("setManualImpressionsEnabled must be called from the main thread.");
    this.i = paramBoolean;
  }

  public final boolean a(AdRequestParcel paramAdRequestParcel)
  {
    if (paramAdRequestParcel.h == this.i)
      return super.a(paramAdRequestParcel);
    int j = paramAdRequestParcel.a;
    long l = paramAdRequestParcel.b;
    Bundle localBundle = paramAdRequestParcel.c;
    int k = paramAdRequestParcel.d;
    List localList = paramAdRequestParcel.e;
    boolean bool1 = paramAdRequestParcel.f;
    int m = paramAdRequestParcel.g;
    if ((paramAdRequestParcel.h) || (this.i));
    for (boolean bool2 = true; ; bool2 = false)
    {
      paramAdRequestParcel = new AdRequestParcel(j, l, localBundle, k, localList, bool1, m, bool2, paramAdRequestParcel.i, paramAdRequestParcel.j, paramAdRequestParcel.k, paramAdRequestParcel.l, paramAdRequestParcel.m, paramAdRequestParcel.n, paramAdRequestParcel.o, paramAdRequestParcel.p, paramAdRequestParcel.q, paramAdRequestParcel.r);
      break;
    }
  }

  public final boolean a(com.google.android.gms.ads.internal.state.a parama1, com.google.android.gms.ads.internal.state.a parama2)
  {
    if (!super.a(parama1, parama2))
      return false;
    if ((this.d.c()) && (!b(parama1, parama2)))
    {
      a(0);
      return false;
    }
    String str;
    if (parama2.k)
    {
      c(parama2);
      com.google.android.gms.ads.internal.util.weaklisteners.a.a(this.d.f, this);
      com.google.android.gms.ads.internal.util.weaklisteners.a.a(this.d.f, this);
      com.google.android.gms.ads.internal.webview.b localb = parama2.b;
      com.google.android.gms.ads.internal.webview.o localo = null;
      if (localb != null)
      {
        localo = parama2.b.z();
        com.google.android.gms.ads.internal.webview.c localc = parama2.b.l();
        if (localc != null)
          localc.c();
      }
      if ((this.d.x != null) && (localo != null))
      {
        boolean bool = this.d.x.b;
        label179: synchronized (localo.b)
        {
          if (!bool)
            break label318;
        }
      }
      if (parama2.b != null)
      {
        if (parama2.j != null)
          this.f.a(this.d.i, parama2);
        if (!parama2.a())
          break label326;
        this.f.a(this.d.i, parama2).a(parama2.b);
      }
    }
    while (true)
    {
      return true;
      if (this.d.d())
      {
        d locald = com.google.android.gms.ads.internal.config.m.av;
        if (!((Boolean)bc.a().n.a(locald)).booleanValue())
          break;
      }
      a(parama2, false);
      break;
      localObject2 = finally;
      monitorexit;
      throw localObject2;
      label318: str = "0";
      break label179;
      label326: parama2.b.l().g = new p(this, parama2);
      continue;
      if ((this.d.D == null) || (parama2.j == null))
        continue;
      this.f.a(this.d.i, parama2, this.d.D);
    }
  }

  public final com.google.android.gms.ads.internal.client.bc l()
  {
    anw.b("getVideoController must be called from the main thread.");
    if ((this.d.j != null) && (this.d.j.b != null))
      return this.d.j.b.z();
    return null;
  }

  public final void onGlobalLayout()
  {
    c(this.d.j);
  }

  public final void onScrollChanged()
  {
    c(this.d.j);
  }

  protected final boolean r()
  {
    int j = 1;
    if (!y.a(this.d.c.getPackageManager(), this.d.c.getPackageName(), "android.permission.INTERNET"))
    {
      com.google.android.gms.ads.internal.client.q.a().a.a(this.d.f, this.d.i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
      j = 0;
    }
    if (!y.a(this.d.c))
    {
      com.google.android.gms.ads.internal.client.q.a().a.a(this.d.f, this.d.i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
      j = 0;
    }
    if ((j == 0) && (this.d.f != null))
      this.d.f.setVisibility(0);
    return j;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.o
 * JD-Core Version:    0.6.0
 */