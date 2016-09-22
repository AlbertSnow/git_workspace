package com.wandoujia.ripple_framework.view;

import android.view.View;
import com.nineoldandroids.view.ViewPropertyAnimator;

public class bl extends bk
{
  private ViewPropertyAnimator b;
  private boolean c = true;
  private int d;

  public bl(View paramView)
  {
    super(paramView);
  }

  public void a(int paramInt)
  {
    if (paramInt <= 0)
    {
      b(true);
      return;
    }
    a(true);
  }

  public void a(int paramInt1, int paramInt2)
  {
    bj.a("On Scroll start at " + paramInt1 + ", status is " + toString());
    if (paramInt1 <= 0)
    {
      b(false);
      return;
    }
    if (((this.d >= 0) && (paramInt2 >= 0)) || ((this.d < 0) && (paramInt2 < 0)))
    {
      this.d = (paramInt2 + this.d);
      if (this.d <= 0)
        break label125;
      b(false);
    }
    while (true)
    {
      bj.a("On Scroll end at " + paramInt1 + ", status is " + toString());
      return;
      this.d = paramInt2;
      break;
      label125: if (this.d >= 0)
        continue;
      a(false);
    }
  }

  protected final void a(boolean paramBoolean)
  {
    if (this.c)
      return;
    if (this.b != null)
      this.b.cancel();
    this.a.setVisibility(0);
    ViewPropertyAnimator localViewPropertyAnimator = ViewPropertyAnimator.animate(this.a).translationY(0.0F);
    long l;
    if (paramBoolean)
      l = 0L;
    while (true)
    {
      this.b = localViewPropertyAnimator.setDuration(l).setListener(new bm(this));
      this.c = true;
      this.d = 0;
      return;
      l = 120L;
    }
  }

  public final void b(boolean paramBoolean)
  {
    if (!this.c)
      return;
    if (this.b != null)
      this.b.cancel();
    if (paramBoolean)
      this.a.setVisibility(8);
    while (true)
    {
      this.c = false;
      this.d = 0;
      return;
      this.b = ViewPropertyAnimator.animate(this.a).translationY(0 - this.a.getHeight()).setDuration(120L).setListener(new bn(this));
    }
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Integer.valueOf(0);
    arrayOfObject[1] = Integer.valueOf(this.d);
    arrayOfObject[2] = Integer.valueOf(0);
    arrayOfObject[3] = Integer.valueOf(0);
    arrayOfObject[4] = Boolean.valueOf(this.c);
    return String.format("Toolbar status (y, ly, dy, dy) is (%d, %d, %d, %d), %b", arrayOfObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.bl
 * JD-Core Version:    0.6.0
 */