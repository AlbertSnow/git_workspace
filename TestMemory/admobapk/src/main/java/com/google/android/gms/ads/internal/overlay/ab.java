package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.webview.b;
import com.google.android.gms.ads.internal.webview.j;
import java.util.Collections;
import java.util.concurrent.Future;

@com.google.android.gms.ads.internal.report.client.a
public final class ab extends com.google.android.gms.ads.internal.overlay.client.c
  implements bh
{
  private static int k = Color.argb(0, 0, 0, 0);
  public final Activity a;
  AdOverlayInfoParcel b;
  public aw c;
  public boolean d = false;
  public FrameLayout e;
  public WebChromeClient.CustomViewCallback f;
  public ae g;
  public boolean h = false;
  public ar i;
  public boolean j;
  private b l;
  private af m;
  private boolean n = false;
  private boolean o = false;
  private int p = 0;
  private boolean q = false;
  private boolean r = true;

  public ab(Activity paramActivity)
  {
    this.a = paramActivity;
    this.i = new bf();
  }

  private void b(boolean paramBoolean)
  {
    if (!this.j)
      this.a.requestWindowFeature(1);
    Window localWindow = this.a.getWindow();
    if (localWindow == null)
      throw new ad("Invalid activity, no window available.");
    if ((!this.o) || ((this.b.q != null) && (this.b.q.c)))
      localWindow.setFlags(1024, 1024);
    boolean bool1 = this.b.e.l().a();
    this.h = false;
    boolean bool4;
    label148: label224: com.google.android.gms.ads.internal.m localm;
    if (bool1)
    {
      if (this.b.k != bc.a().g.a())
        break label605;
      if (this.a.getResources().getConfiguration().orientation == 1)
      {
        bool4 = true;
        this.h = bool4;
      }
    }
    else
    {
      boolean bool2 = this.h;
      com.google.android.gms.ads.internal.util.c.b(46 + "Delay onShow to next orientation change: " + bool2);
      a(this.b.k);
      if (bc.a().g.a(localWindow))
        com.google.android.gms.ads.internal.util.c.b("Hardware acceleration on the AdActivity window enabled.");
      if (this.o)
        break label659;
      this.g.setBackgroundColor(-16777216);
      this.a.setContentView(this.g);
      this.j = true;
      if (!paramBoolean)
        break label726;
      this.l = j.a(this.a, this.b.e.k(), true, bool1, null, this.b.n, null, null, this.b.e.h());
      this.l.l().a(null, null, this.b.f, this.b.j, true, this.b.o, null, this.b.e.l().m, null, null);
      this.l.l().e = new ac(this);
      if (this.b.m == null)
        break label672;
      this.l.loadUrl(this.b.m);
      label398: if (this.b.e != null)
        this.b.e.b(this);
      label421: this.l.a(this);
      ViewParent localViewParent = this.l.getParent();
      if ((localViewParent != null) && ((localViewParent instanceof ViewGroup)))
        ((ViewGroup)localViewParent).removeView(this.l.b());
      if (this.o)
        this.l.setBackgroundColor(k);
      this.g.addView(this.l.b(), -1, -1);
      if ((!paramBoolean) && (!this.h))
        m();
      a(bool1);
      if (this.l.m())
        a(bool1, true);
      localm = this.l.h();
      if (localm == null)
        break label753;
    }
    label605: label753: for (as localas = localm.c; ; localas = null)
    {
      if (localas == null)
        break label759;
      this.i = localas.a(this.a, this.l, this.g);
      return;
      bool4 = false;
      break;
      if (this.b.k != bc.a().g.b())
        break label148;
      if (this.a.getResources().getConfiguration().orientation == 2);
      for (boolean bool3 = true; ; bool3 = false)
      {
        this.h = bool3;
        break;
      }
      this.g.setBackgroundColor(k);
      break label224;
      if (this.b.i != null)
      {
        this.l.loadDataWithBaseURL(this.b.g, this.b.i, "text/html", "UTF-8", null);
        break label398;
      }
      throw new ad("No URL or HTML to display in ad overlay.");
      this.l = this.b.e;
      this.l.a(this.a);
      break label421;
    }
    label659: label672: label726: label759: com.google.android.gms.ads.internal.util.c.e("Appstreaming controller is null.");
  }

  private void n()
  {
    if ((!this.a.isFinishing()) || (this.q))
      return;
    this.q = true;
    if (this.l != null)
    {
      int i1 = this.p;
      this.l.a(i1);
      this.g.removeView(this.l.b());
      if (this.m == null)
        break label176;
      this.l.a(this.m.d);
      this.l.a(false);
      this.m.c.addView(this.l.b(), this.m.a, this.m.b);
      this.m = null;
    }
    while (true)
    {
      this.l = null;
      if ((this.b != null) && (this.b.d != null))
        this.b.d.s();
      this.i.c();
      return;
      label176: if (this.a.getApplicationContext() == null)
        continue;
      this.l.a(this.a.getApplicationContext());
    }
  }

  public final void a()
  {
    this.p = 2;
    this.a.finish();
  }

  public final void a(int paramInt)
  {
    this.a.setRequestedOrientation(paramInt);
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  public final void a(Bundle paramBundle)
  {
    this.a.requestWindowFeature(1);
    boolean bool = false;
    if (paramBundle != null)
      bool = paramBundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
    this.n = bool;
    do
    {
      try
      {
        this.b = AdOverlayInfoParcel.a(this.a.getIntent());
        if (this.b == null)
          throw new ad("Could not get info for ad overlay.");
      }
      catch (ad localad)
      {
        com.google.android.gms.ads.internal.util.c.e(localad.getMessage());
        this.p = 3;
        this.a.finish();
        return;
      }
      if (this.b.n.d > 7500000)
        this.p = 3;
      if (this.a.getIntent() != null)
        this.r = this.a.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
      if (this.b.q != null);
      for (this.o = this.b.q.b; ; this.o = false)
      {
        if ((((Boolean)com.google.android.gms.ads.internal.config.m.at.a()).booleanValue()) && (this.o) && (this.b.q.g != -1))
          ((Future)new ag(this).d());
        if (paramBundle == null)
        {
          if ((this.b.d != null) && (this.r))
            this.b.d.t();
          if ((this.b.l != 1) && (this.b.c != null))
            this.b.c.e();
        }
        this.g = new ae(this.a, this.b.p);
        this.g.setId(1000);
        switch (this.b.l)
        {
        default:
          throw new ad("Could not determine ad overlay type.");
        case 1:
        case 2:
        case 3:
        case 4:
        }
      }
      b(false);
      return;
      this.m = new af(this.b.e);
      b(false);
      return;
      b(true);
      return;
      if (!this.n)
        continue;
      this.p = 3;
      this.a.finish();
      return;
    }
    while (bc.a().b.a(this.a, this.b.b, this.b.j));
    this.p = 3;
    this.a.finish();
  }

  public final void a(boolean paramBoolean)
  {
    int i1;
    RelativeLayout.LayoutParams localLayoutParams;
    if (paramBoolean)
    {
      i1 = 50;
      this.c = new aw(this.a, i1, this);
      localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams.addRule(10);
      if (!paramBoolean)
        break label90;
    }
    label90: for (int i2 = 11; ; i2 = 9)
    {
      localLayoutParams.addRule(i2);
      this.c.a(paramBoolean, this.b.h);
      this.g.addView(this.c, localLayoutParams);
      return;
      i1 = 32;
      break;
    }
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.c != null)
      this.c.a(paramBoolean1, paramBoolean2);
  }

  public final void b()
  {
    if ((this.b != null) && (this.d))
      a(this.b.k);
    if (this.e != null)
    {
      this.a.setContentView(this.g);
      this.j = true;
      this.e.removeAllViews();
      this.e = null;
    }
    if (this.f != null)
    {
      this.f.onCustomViewHidden();
      this.f = null;
    }
    this.d = false;
  }

  public final void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.n);
  }

  public final void c()
  {
    this.p = 1;
    this.a.finish();
  }

  public final void d()
  {
    this.p = 0;
  }

  public final boolean e()
  {
    int i1 = 1;
    this.p = 0;
    if (this.l == null);
    while (true)
    {
      return i1;
      if ((this.l.t()) && (this.i.d()));
      while (i1 == 0)
      {
        this.l.a("onbackblocked", Collections.emptyMap());
        return i1;
        i1 = 0;
      }
    }
  }

  public final void f()
  {
  }

  public final void g()
  {
  }

  public final void h()
  {
    if ((this.b != null) && (this.b.l == 4))
    {
      if (this.n)
      {
        this.p = 3;
        this.a.finish();
      }
    }
    else
    {
      if (this.b.d != null)
        this.b.d.v();
      if ((this.l == null) || (this.l.r()))
        break label111;
      com.google.android.gms.ads.internal.util.ad.b(this.l);
    }
    while (true)
    {
      this.i.b();
      return;
      this.n = true;
      break;
      label111: com.google.android.gms.ads.internal.util.c.e("The webview does not exit. Ignoring action.");
    }
  }

  public final void i()
  {
    this.i.a();
    b();
    if (this.b.d != null)
      this.b.d.u();
    if ((this.l != null) && ((!this.a.isFinishing()) || (this.m == null)))
      com.google.android.gms.ads.internal.util.ad.a(this.l);
    n();
  }

  public final void j()
  {
    n();
  }

  public final void k()
  {
    if (this.l != null)
      this.g.removeView(this.l.b());
    n();
  }

  public final void l()
  {
    this.j = true;
  }

  public final void m()
  {
    this.l.d();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.ab
 * JD-Core Version:    0.6.0
 */