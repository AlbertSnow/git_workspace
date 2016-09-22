package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.client.at;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.client.s;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.client.y;
import com.google.android.gms.ads.internal.mediation.client.e;
import com.google.android.gms.ads.internal.mraid.l;
import com.google.android.gms.ads.internal.purchase.client.p;
import com.google.android.gms.ads.internal.purchase.n;
import com.google.android.gms.ads.internal.reward.client.j;
import com.google.android.gms.ads.internal.state.h;
import com.google.android.gms.ads.internal.state.k;
import com.google.android.gms.ads.internal.util.bh;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import dh;
import ha;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

@com.google.android.gms.ads.internal.report.client.a
public final class bd
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  List A;
  n B;
  public k C = null;
  View D = null;
  public int E = 0;
  boolean F = false;
  boolean G = false;
  HashSet H = null;
  boolean I = true;
  boolean J = true;
  boolean K = false;
  private int L = -1;
  private int M = -1;
  private bh N;
  final String a;
  public String b;
  public final Context c;
  final ha d;
  public final VersionInfoParcel e;
  be f;
  public com.google.android.gms.ads.internal.util.a g;
  public com.google.android.gms.ads.internal.util.an h;
  public AdSizeParcel i;
  public com.google.android.gms.ads.internal.state.a j;
  public com.google.android.gms.ads.internal.state.b k;
  public com.google.android.gms.ads.internal.state.c l;
  s m;
  com.google.android.gms.ads.internal.client.v n;
  com.google.android.gms.ads.internal.client.an o;
  at p;
  com.google.android.gms.ads.internal.purchase.client.d q;
  p r;
  com.google.android.gms.ads.internal.formats.client.v s;
  y t;
  dh u;
  public dh v;
  NativeAdOptionsParcel w;
  VideoOptionsParcel x;
  com.google.android.gms.ads.internal.customrenderedad.client.d y;
  j z;

  public bd(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, VersionInfoParcel paramVersionInfoParcel)
  {
    this(paramContext, paramAdSizeParcel, paramString, paramVersionInfoParcel, null);
  }

  private bd(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, VersionInfoParcel paramVersionInfoParcel, ha paramha)
  {
    m.a(paramContext);
    if (bc.a().h.c() != null)
    {
      List localList = m.b();
      if (paramVersionInfoParcel.c != 0)
        localList.add(Integer.toString(paramVersionInfoParcel.c));
      com.google.android.gms.ads.internal.csi.b localb = bc.a().h.c();
      if ((localList != null) && (!localList.isEmpty()))
        localb.a.put("e", TextUtils.join(",", localList));
    }
    this.a = UUID.randomUUID().toString();
    if ((paramAdSizeParcel.e) || (paramAdSizeParcel.i))
      this.f = null;
    while (true)
    {
      this.i = paramAdSizeParcel;
      this.b = paramString;
      this.c = paramContext;
      this.e = paramVersionInfoParcel;
      this.d = new ha(new w(this));
      this.N = new bh(200L);
      this.v = new dh();
      return;
      this.f = new be(paramContext, this, this);
      this.f.setMinimumWidth(paramAdSizeParcel.g);
      this.f.setMinimumHeight(paramAdSizeParcel.d);
      this.f.setVisibility(4);
    }
  }

  private final void b(boolean paramBoolean)
  {
    boolean bool = true;
    label26: if ((this.f == null) || (this.j == null) || (this.j.b == null))
      break label26;
    do
      return;
    while ((paramBoolean) && (!this.N.a()));
    com.google.android.gms.ads.internal.webview.c localc;
    int i3;
    int i4;
    if (this.j.b.l().a())
    {
      int[] arrayOfInt = new int[2];
      this.f.getLocationOnScreen(arrayOfInt);
      int i1 = q.a().a.b(this.c, arrayOfInt[0]);
      int i2 = q.a().a.b(this.c, arrayOfInt[bool]);
      if ((i1 != this.L) || (i2 != this.M))
      {
        this.L = i1;
        this.M = i2;
        localc = this.j.b.l();
        i3 = this.L;
        i4 = this.M;
        if (paramBoolean)
          break label294;
      }
    }
    while (true)
    {
      localc.l.a(i3, i4);
      if (localc.n != null)
        localc.n.a(i3, i4, bool);
      View localView = this.f.getRootView().findViewById(16908290);
      if (localView == null)
        break;
      Rect localRect1 = new Rect();
      Rect localRect2 = new Rect();
      this.f.getGlobalVisibleRect(localRect1);
      localView.getGlobalVisibleRect(localRect2);
      if (localRect1.top != localRect2.top)
        this.I = false;
      if (localRect1.bottom == localRect2.bottom)
        break;
      this.J = false;
      return;
      label294: bool = false;
    }
  }

  public final void a()
  {
    if ((this.j != null) && (this.j.b != null))
      this.j.b.destroy();
  }

  public final void a(boolean paramBoolean)
  {
    if ((this.E == 0) && (this.j != null) && (this.j.b != null))
      this.j.b.stopLoading();
    if (this.g != null)
      this.g.c();
    if (this.h != null)
      this.h.c();
    if (paramBoolean)
      this.j = null;
  }

  public final void b()
  {
    if ((this.j != null) && (this.j.o != null));
    try
    {
      this.j.o.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.c.e("Could not destroy mediation adapter.");
    }
  }

  public final boolean c()
  {
    return this.E == 0;
  }

  public final boolean d()
  {
    return this.E == 1;
  }

  public final void onGlobalLayout()
  {
    b(false);
  }

  public final void onScrollChanged()
  {
    b(true);
    this.K = true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.bd
 * JD-Core Version:    0.6.0
 */