package com.wandoujia.jupiter.media.controller;

import android.media.AudioManager;
import android.os.Looper;
import android.support.v4.app.b;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.nineoldandroids.animation.ValueAnimator;
import com.wandoujia.jupiter.media.view.VideoPlayView;

public class h extends a
{
  private float l;
  private float m;
  private int n;
  private boolean o;
  private boolean p;
  private View q;
  private View r;
  private View s;
  private boolean t;
  private q u;
  private AudioManager v;

  public h(VideoPlayView paramVideoPlayView)
  {
    super(paramVideoPlayView);
    super.h();
    this.i.setMax(b.x(this.j) / 3);
    this.r = paramVideoPlayView.findViewById(2131494000);
    this.q = paramVideoPlayView.findViewById(2131494007);
    this.s = paramVideoPlayView.findViewById(2131492951);
    this.u = new q(this, Looper.getMainLooper());
    new i(this);
    this.c.setOnClickListener(new j(this));
    paramVideoPlayView.setOnClickListener(new k(this));
    paramVideoPlayView.setOnTouchListener(new l(this));
  }

  private void l()
  {
    this.u.removeCallbacksAndMessages(null);
    this.u.sendEmptyMessageDelayed(0, 3000L);
  }

  public final void a()
  {
    this.b.a();
    h();
  }

  public final void a(u paramu)
  {
    super.a(paramu);
    j();
  }

  public final void c()
  {
    super.c();
    this.c.setVisibility(4);
    ((ImageView)this.c).setImageResource(2130838624);
  }

  public final void d()
  {
    super.d();
    this.c.setVisibility(0);
    ((ImageView)this.c).setImageResource(2130838624);
  }

  public final void e()
  {
    super.e();
    this.c.setVisibility(0);
    ((ImageView)this.c).setImageResource(2130838633);
  }

  public final void h()
  {
    l();
    if (this.t);
    do
      return;
    while (this.k);
    this.k = true;
    this.t = true;
    this.r.setVisibility(0);
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    localValueAnimator.setDuration(200L);
    this.r.setVisibility(0);
    this.q.setVisibility(0);
    this.s.setVisibility(0);
    localValueAnimator.addUpdateListener(new m(this));
    localValueAnimator.addListener(new n(this));
    localValueAnimator.start();
  }

  public final void i()
  {
    if (this.t);
    do
      return;
    while (!this.k);
    this.k = false;
    this.t = true;
    this.u.removeCallbacksAndMessages(null);
    this.r.setVisibility(0);
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    localValueAnimator.setDuration(200L);
    localValueAnimator.addUpdateListener(new o(this));
    localValueAnimator.addListener(new p(this));
    localValueAnimator.start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.controller.h
 * JD-Core Version:    0.6.0
 */