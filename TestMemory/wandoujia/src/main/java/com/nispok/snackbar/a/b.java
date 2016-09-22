package com.nispok.snackbar.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;

public final class b
  implements View.OnTouchListener
{
  private int a;
  private int b;
  private int c;
  private long d;
  private View e;
  private d f;
  private int g = 1;
  private float h;
  private float i;
  private boolean j;
  private int k;
  private VelocityTracker l;
  private float m;

  public b(View paramView, d paramd)
  {
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramView.getContext());
    this.a = localViewConfiguration.getScaledTouchSlop();
    this.b = (16 * localViewConfiguration.getScaledMinimumFlingVelocity());
    this.c = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.d = paramView.getContext().getResources().getInteger(17694720);
    this.e = paramView;
    this.f = paramd;
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    paramMotionEvent.offsetLocation(this.m, 0.0F);
    if (this.g < 2)
      this.g = this.e.getWidth();
    float f3;
    float f4;
    float f5;
    float f6;
    boolean bool2;
    switch (paramMotionEvent.getActionMasked())
    {
    default:
    case 0:
    case 1:
      do
      {
        return false;
        this.h = paramMotionEvent.getRawX();
        this.i = paramMotionEvent.getRawY();
        this.f.a(bool1);
        this.l = VelocityTracker.obtain();
        this.l.addMovement(paramMotionEvent);
        return false;
      }
      while (this.l == null);
      this.f.a(false);
      f3 = paramMotionEvent.getRawX() - this.h;
      this.l.addMovement(paramMotionEvent);
      this.l.computeCurrentVelocity(1000);
      f4 = this.l.getXVelocity();
      f5 = Math.abs(f4);
      f6 = Math.abs(this.l.getYVelocity());
      if ((Math.abs(f3) > this.g / 2) && (this.j))
      {
        if (f3 <= 0.0F)
          break;
        bool2 = bool1;
      }
    case 3:
    case 2:
    }
    while (true)
    {
      float f7;
      if (bool1)
      {
        ViewPropertyAnimator localViewPropertyAnimator = this.e.animate();
        if (bool2)
        {
          f7 = this.g;
          label241: localViewPropertyAnimator.translationX(f7).alpha(0.0F).setDuration(this.d).setListener(new c(this));
        }
      }
      while (true)
      {
        if (this.l != null)
        {
          this.l.recycle();
          this.l = null;
        }
        this.m = 0.0F;
        this.h = 0.0F;
        this.i = 0.0F;
        this.j = false;
        return false;
        bool2 = false;
        break;
        if ((this.b > f5) || (f5 > this.c) || (f6 >= f5) || (f6 >= f5) || (!this.j))
          break label776;
        boolean bool3;
        label373: boolean bool4;
        label383: boolean bool5;
        if (f4 < 0.0F)
        {
          bool3 = bool1;
          if (f3 >= 0.0F)
            break label424;
          bool4 = bool1;
          if (bool3 != bool4)
            break label430;
          bool5 = bool1;
          label393: if (this.l.getXVelocity() <= 0.0F)
            break label436;
        }
        while (true)
        {
          boolean bool6 = bool1;
          bool1 = bool5;
          bool2 = bool6;
          break;
          bool3 = false;
          break label373;
          label424: bool4 = false;
          break label383;
          label430: bool5 = false;
          break label393;
          label436: bool1 = false;
        }
        f7 = -this.g;
        break label241;
        if (!this.j)
          continue;
        this.e.animate().translationX(0.0F).alpha(1.0F).setDuration(this.d).setListener(null);
      }
      if (this.l == null)
        break;
      this.e.animate().translationX(0.0F).alpha(1.0F).setDuration(this.d).setListener(null);
      this.l.recycle();
      this.l = null;
      this.m = 0.0F;
      this.h = 0.0F;
      this.i = 0.0F;
      this.j = false;
      return false;
      if (this.l == null)
        break;
      this.l.addMovement(paramMotionEvent);
      float f1 = paramMotionEvent.getRawX() - this.h;
      float f2 = paramMotionEvent.getRawY() - this.i;
      if ((Math.abs(f1) > this.a) && (Math.abs(f2) < Math.abs(f1) / 2.0F))
      {
        this.j = bool1;
        if (f1 <= 0.0F)
          break label766;
      }
      label766: for (int n = this.a; ; n = -this.a)
      {
        this.k = n;
        if (this.e.getParent() != null)
          this.e.getParent().requestDisallowInterceptTouchEvent(bool1);
        MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
        localMotionEvent.setAction(0x3 | paramMotionEvent.getActionIndex() << 8);
        this.e.onTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
        if (!this.j)
          break;
        this.m = f1;
        this.e.setTranslationX(f1 - this.k);
        this.e.setAlpha(Math.max(0.0F, Math.min(1.0F, 1.0F - 2.0F * Math.abs(f1) / this.g)));
        return bool1;
      }
      label776: bool2 = false;
      bool1 = false;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nispok.snackbar.a.b
 * JD-Core Version:    0.6.0
 */