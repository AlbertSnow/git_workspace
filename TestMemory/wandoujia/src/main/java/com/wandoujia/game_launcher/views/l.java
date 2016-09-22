package com.wandoujia.game_launcher.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

public final class l extends Drawable
  implements Animatable
{
  private static final Interpolator b = new LinearInterpolator();
  private static final Interpolator c = new p(0);
  private static final Interpolator d = new r(0);
  boolean a;
  private final int[] e = { -16777216 };
  private final q f;
  private float g;
  private Resources h;
  private View i;
  private Animation j;
  private float k;
  private double l;
  private double m;
  private final Drawable.Callback n;

  static
  {
    new AccelerateDecelerateInterpolator();
  }

  public l(Context paramContext, View paramView)
  {
    new ArrayList();
    this.n = new o(this);
    this.i = paramView;
    this.h = paramContext.getResources();
    this.f = new q(this.n);
    this.f.a(this.e);
    q localq1 = this.f;
    float f1 = this.h.getDisplayMetrics().density;
    this.l = (40.0D * f1);
    this.m = (40.0D * f1);
    localq1.a(2.5F * f1);
    localq1.a(8.75D * f1);
    localq1.a();
    localq1.a(10.0F * f1, f1 * 5.0F);
    localq1.a((int)this.l, (int)this.m);
    q localq2 = this.f;
    m localm = new m(this, localq2);
    localm.setRepeatCount(-1);
    localm.setRepeatMode(1);
    localm.setInterpolator(b);
    localm.setAnimationListener(new n(this, localq2));
    this.j = localm;
  }

  public final void a()
  {
    this.f.a(true);
  }

  final void a(float paramFloat)
  {
    this.g = paramFloat;
    invalidateSelf();
  }

  public final void a(int paramInt)
  {
    this.f.a(paramInt);
  }

  public final void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    int i1 = paramCanvas.save();
    paramCanvas.rotate(this.g, localRect.exactCenterX(), localRect.exactCenterY());
    this.f.a(paramCanvas, localRect);
    paramCanvas.restoreToCount(i1);
  }

  public final int getAlpha()
  {
    return this.f.c();
  }

  public final int getIntrinsicHeight()
  {
    return (int)this.m;
  }

  public final int getIntrinsicWidth()
  {
    return (int)this.l;
  }

  public final int getOpacity()
  {
    return -3;
  }

  public final boolean isRunning()
  {
    return (this.i.getAnimation() != null) && (!this.j.hasEnded()) && (this.j.hasStarted());
  }

  public final void setAlpha(int paramInt)
  {
    this.f.b(paramInt);
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.f.a(paramColorFilter);
  }

  public final void start()
  {
    this.j.reset();
    this.f.k();
    if (this.f.h() != this.f.e())
    {
      this.a = true;
      this.j.setDuration(666L);
      this.i.startAnimation(this.j);
      return;
    }
    this.f.a();
    this.f.l();
    this.j.setDuration(1333L);
    this.i.startAnimation(this.j);
  }

  public final void stop()
  {
    this.j.cancel();
    this.i.clearAnimation();
    a(0.0F);
    this.f.a(false);
    this.f.a();
    this.f.l();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.l
 * JD-Core Version:    0.6.0
 */