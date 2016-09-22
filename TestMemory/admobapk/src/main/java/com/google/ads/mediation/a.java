package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.bj;
import com.google.android.gms.ads.internal.client.bm;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.m;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import me;
import mf;
import mg;
import mh;
import mi;
import mk;
import mm;

@com.google.android.gms.ads.internal.report.client.a
public abstract class a
  implements d, h, com.google.android.gms.ads.mediation.v2.b, com.google.android.gms.ads.reward.mediation.a
{
  mm a;
  com.google.android.gms.ads.reward.mediation.b b;
  private mk c;
  private mm d;
  private me e;
  private Context f;
  private com.google.android.gms.ads.reward.b g = new b(this);

  private mg a(Context paramContext, com.google.android.gms.ads.mediation.a parama, Bundle paramBundle1, Bundle paramBundle2)
  {
    int i = 1;
    mh localmh = new mh();
    Date localDate = parama.a();
    if (localDate != null)
      localmh.a.g = localDate;
    int j = parama.b();
    if (j != 0)
      localmh.a.h = j;
    Set localSet = parama.c();
    if (localSet != null)
    {
      Iterator localIterator = localSet.iterator();
      while (localIterator.hasNext())
      {
        String str3 = (String)localIterator.next();
        localmh.a.a.add(str3);
      }
    }
    Location localLocation = parama.d();
    if (localLocation != null)
      localmh.a.i = localLocation;
    if (parama.e())
    {
      String str2 = q.a().a.a(paramContext);
      localmh.a.a(str2);
    }
    int k;
    bj localbj2;
    if (parama.f() != -1)
    {
      if (parama.f() != i)
        break label315;
      k = i;
      localbj2 = localmh.a;
      if (k == 0)
        break label321;
    }
    while (true)
    {
      localbj2.j = i;
      boolean bool = parama.g();
      localmh.a.k = bool;
      Bundle localBundle = a(paramBundle1, paramBundle2);
      localmh.a.b.putBundle(AdMobAdapter.class.getName(), localBundle);
      if ((AdMobAdapter.class.equals(AdMobAdapter.class)) && (localBundle.getBoolean("_emulatorLiveAds")))
      {
        bj localbj1 = localmh.a;
        String str1 = mg.a;
        localbj1.d.remove(str1);
      }
      return new mg(localmh);
      label315: k = 0;
      break;
      label321: i = 0;
    }
  }

  public abstract Bundle a(Bundle paramBundle1, Bundle paramBundle2);

  public String a(Bundle paramBundle)
  {
    return paramBundle.getString("pubid");
  }

  public final void a()
  {
    if (this.c != null)
    {
      this.c.d();
      this.c = null;
    }
    if (this.d != null)
      this.d = null;
    if (this.e != null)
      this.e = null;
    if (this.a != null)
      this.a = null;
  }

  public final void a(Context paramContext, com.google.android.gms.ads.mediation.e parame, Bundle paramBundle1, mi parammi, com.google.android.gms.ads.mediation.a parama, Bundle paramBundle2)
  {
    this.c = new mk(paramContext);
    this.c.a(new mi(parammi.i, parammi.j));
    this.c.a(a(paramBundle1));
    this.c.a(new e(this, parame));
    this.c.a(a(paramContext, parama, paramBundle2, paramBundle1));
  }

  public final void a(Context paramContext, com.google.android.gms.ads.mediation.g paramg, Bundle paramBundle1, com.google.android.gms.ads.mediation.a parama, Bundle paramBundle2)
  {
    this.d = new mm(paramContext);
    this.d.a(a(paramBundle1));
    mm localmm = this.d;
    f localf = new f(this, paramg);
    localmm.a.a(localf);
    localmm.a.a((com.google.android.gms.ads.internal.client.a)localf);
    this.d.a(a(paramContext, parama, paramBundle2, paramBundle1));
  }

  public final void a(Context paramContext, i parami, Bundle paramBundle1, m paramm, Bundle paramBundle2)
  {
    g localg = new g(this, parami);
    mf localmf = new mf(paramContext, paramBundle1.getString("pubid")).a(localg);
    com.google.android.gms.ads.formats.c localc = paramm.h();
    if (localc != null)
      localmf.a(localc);
    if (paramm.i())
      localmf.a(localg);
    if (paramm.j())
      localmf.a(localg);
    this.e = localmf.a();
    this.e.a(a(paramContext, paramm, paramBundle2, paramBundle1).b);
  }

  public final void a(Context paramContext, com.google.android.gms.ads.reward.mediation.b paramb)
  {
    this.f = paramContext.getApplicationContext();
    this.b = paramb;
    this.b.a(this);
  }

  public final void a(com.google.android.gms.ads.mediation.a parama, Bundle paramBundle1, Bundle paramBundle2)
  {
    if ((this.f == null) || (this.b == null))
    {
      com.google.android.gms.ads.internal.util.client.e.c("AdMobAdapter.loadAd called before initialize.");
      return;
    }
    this.a = new mm(this.f);
    this.a.a.h = true;
    this.a.a(a(paramBundle1));
    mm localmm = this.a;
    com.google.android.gms.ads.reward.b localb = this.g;
    localmm.a.a(localb);
    this.a.a(a(this.f, parama, paramBundle2, paramBundle1));
  }

  public final void b()
  {
    if (this.c != null)
      this.c.b();
  }

  public final void c()
  {
    if (this.c != null)
      this.c.a();
  }

  public final View d()
  {
    return this.c;
  }

  public final void e()
  {
    this.d.a.a();
  }

  public final Bundle f()
  {
    com.google.android.gms.ads.mediation.c localc = new com.google.android.gms.ads.mediation.c();
    localc.a = 1;
    Bundle localBundle = new Bundle();
    localBundle.putInt("capabilities", localc.a);
    return localBundle;
  }

  public final void g()
  {
    this.a.a.a();
  }

  public final boolean h()
  {
    return this.b != null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.a
 * JD-Core Version:    0.6.0
 */