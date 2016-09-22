package com.wandoujia.jupiter.media.controller;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.jupiter.media.view.VideoPlayView;
import com.wandoujia.ripple_framework.view.LoadingView;
import com.wandoujia.ripple_framework.view.a.h;

public class a
  implements r
{
  protected u a;
  protected VideoPlayView b;
  protected View c;
  protected View d;
  protected TextView e;
  protected TextView f;
  protected ImageView g;
  protected View h;
  protected ProgressBar i;
  protected Context j;
  protected boolean k;
  private ProgressBar l;
  private ImageView m;
  private View n;
  private TextView o;
  private TextView p;
  private LoadingView q;
  private View r;
  private boolean s;
  private long t;
  private boolean u;
  private long v = 0L;
  private Handler w = new e(this);

  public a(VideoPlayView paramVideoPlayView)
  {
    this.b = paramVideoPlayView;
    this.b.setMediaController(this);
    this.j = this.b.getContext();
    this.l = ((ProgressBar)paramVideoPlayView.findViewById(2131493132));
    this.m = ((ImageView)paramVideoPlayView.findViewById(2131493999));
    this.n = paramVideoPlayView.findViewById(2131494008);
    this.o = ((TextView)paramVideoPlayView.findViewById(2131493974));
    this.p = ((TextView)paramVideoPlayView.findViewById(2131493428));
    this.c = paramVideoPlayView.findViewById(2131493964);
    this.r = paramVideoPlayView.findViewById(2131493669);
    this.q = ((LoadingView)paramVideoPlayView.findViewById(2131493564));
    this.d = paramVideoPlayView.findViewById(2131494001);
    this.e = ((TextView)paramVideoPlayView.findViewById(2131494003));
    this.f = ((TextView)paramVideoPlayView.findViewById(2131494004));
    this.g = ((ImageView)paramVideoPlayView.findViewById(2131494002));
    this.i = ((ProgressBar)paramVideoPlayView.findViewById(2131494006));
    this.h = paramVideoPlayView.findViewById(2131494005);
    this.q.e();
    this.q.b();
    this.l.setMax(1000);
  }

  private void l()
  {
    this.s = true;
    if (this.m != null)
      this.m.setImageResource(2130838598);
    if (this.a != null)
      this.a.a(true);
  }

  public void a()
  {
    this.b.a();
    this.l.setVisibility(8);
    if (this.n != null)
      this.n.setVisibility(8);
  }

  public void a(u paramu)
  {
    this.a = paramu;
    if (this.a.g())
      l();
    while (true)
    {
      if (this.m != null)
        this.m.setOnClickListener(new d(this));
      return;
      j();
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
      if (!NetworkUtil.isNetworkConnected(this.j))
        Toast.makeText(this.b.getContext(), 2131625631, 0).show();
    do
    {
      return;
      if (NetworkUtil.isWifiConnected(this.j))
      {
        this.b.h();
        return;
      }
      new h(this.b.getContext()).a(2131624575).b(2131624553).b(2131624552, new c(this)).a(2131624330, new b()).b();
      return;
    }
    while (!NetworkUtil.isWifiConnected(this.j));
    this.b.h();
  }

  public final void b()
  {
    this.b.i();
  }

  public void c()
  {
    this.q.a();
  }

  public void d()
  {
    this.q.b();
    this.r.setVisibility(8);
    this.w.sendEmptyMessage(1);
  }

  public void e()
  {
    this.r.setVisibility(0);
    this.q.b();
    this.w.removeMessages(1);
  }

  public void f()
  {
    this.b.i();
    this.b.a(0);
    this.b.c();
    this.l.setProgress(1000);
    this.l.setSecondaryProgress(1000);
  }

  public final boolean g()
  {
    return this.k;
  }

  public void h()
  {
    if (!this.k)
    {
      this.l.setVisibility(0);
      k();
      this.k = true;
    }
  }

  public void i()
  {
    if (this.k)
    {
      this.l.setVisibility(8);
      if (this.n != null)
        this.n.setVisibility(8);
      this.k = false;
    }
  }

  public final void j()
  {
    this.s = false;
    if (this.m != null)
      this.m.setImageResource(2130838597);
    if (this.a != null)
      this.a.a(false);
  }

  protected final int k()
  {
    if (this.a == null);
    int i1;
    int i2;
    long l1;
    do
    {
      return 0;
      i1 = this.a.d();
      i2 = this.a.c();
      l1 = this.t;
      this.t = i2;
    }
    while (this.t <= 0L);
    if (l1 != i2)
    {
      if ((i2 / 3600000 == 0) && (this.o != null))
      {
        this.u = false;
        this.o.setText(TextUtil.stringForTimeInMinutes(i2));
      }
    }
    else
    {
      if ((!this.u) || (this.p == null))
        break label244;
      this.p.setText(TextUtil.stringForTime(i1));
    }
    while (true)
    {
      int i3 = i1 * 1000 / i2;
      int i4 = 1000 * this.a.f() / 100;
      if (this.l != null)
      {
        this.l.setProgress(i3);
        this.l.setSecondaryProgress(i4);
      }
      if ((i3 > 100) && (i4 < i3) && (System.currentTimeMillis() - this.v > 15000L))
      {
        this.v = System.currentTimeMillis();
        Toast.makeText(this.j, 2131625614, 0).show();
      }
      return i1;
      if (this.o == null)
        break;
      this.u = true;
      this.o.setText(TextUtil.stringForTime(i2));
      break;
      label244: if (this.p == null)
        continue;
      this.p.setText(TextUtil.stringForTimeInMinutes(i1));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.controller.a
 * JD-Core Version:    0.6.0
 */