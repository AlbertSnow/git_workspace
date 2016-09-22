package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public abstract class be extends ck
{
  private LinearInterpolator a = new LinearInterpolator();
  private DecelerateInterpolator b = new DecelerateInterpolator();
  private PointF c;
  private final float d;
  private int e = 0;
  private int f = 0;

  public be(Context paramContext)
  {
    this.d = (25.0F / paramContext.getResources().getDisplayMetrics().densityDpi);
  }

  private static int a(int paramInt1, int paramInt2)
  {
    int i = paramInt1 - paramInt2;
    if (paramInt1 * i <= 0)
      i = 0;
    return i;
  }

  private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i;
    switch (paramInt5)
    {
    default:
      throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
    case -1:
      i = paramInt3 - paramInt1;
    case 1:
    case 0:
    }
    do
    {
      do
      {
        return i;
        return paramInt4 - paramInt2;
        i = paramInt3 - paramInt1;
      }
      while (i > 0);
      i = paramInt4 - paramInt2;
    }
    while (i < 0);
    return 0;
  }

  private int d(int paramInt)
  {
    return (int)Math.ceil(Math.abs(paramInt) * this.d);
  }

  public abstract PointF a(int paramInt);

  protected final void a()
  {
    this.f = 0;
    this.e = 0;
    this.c = null;
  }

  protected final void a(int paramInt1, int paramInt2, cl paramcl)
  {
    if (g() == 0)
      c();
    do
    {
      return;
      this.e = a(this.e, paramInt1);
      this.f = a(this.f, paramInt2);
    }
    while ((this.e != 0) || (this.f != 0));
    PointF localPointF = a(f());
    if ((localPointF == null) || ((localPointF.x == 0.0F) && (localPointF.y == 0.0F)))
    {
      int i = f();
      c();
      c(i);
      return;
    }
    double d1 = Math.sqrt(localPointF.x * localPointF.x + localPointF.y * localPointF.y);
    localPointF.x = (float)(localPointF.x / d1);
    localPointF.y = (float)(localPointF.y / d1);
    this.c = localPointF;
    this.e = (int)(10000.0F * localPointF.x);
    this.f = (int)(10000.0F * localPointF.y);
    int j = d(10000);
    paramcl.a((int)(1.2F * this.e), (int)(1.2F * this.f), (int)(1.2F * j), this.a);
  }

  protected final void a(View paramView, cl paramcl)
  {
    int i = 1;
    int j;
    ce localce1;
    int k;
    label41: label62: ce localce2;
    int m;
    if ((this.c == null) || (this.c.x == 0.0F))
    {
      j = 0;
      localce1 = b();
      if (localce1.f())
        break label160;
      k = 0;
      if ((this.c != null) && (this.c.y != 0.0F))
        break label215;
      i = 0;
      localce2 = b();
      boolean bool = localce2.g();
      m = 0;
      if (bool)
        break label232;
    }
    while (true)
    {
      int n = (int)Math.ceil(d((int)Math.sqrt(k * k + m * m)) / 0.3356D);
      if (n > 0)
        paramcl.a(-k, -m, n, this.b);
      return;
      if (this.c.x > 0.0F)
      {
        j = i;
        break;
      }
      j = -1;
      break;
      label160: RecyclerView.LayoutParams localLayoutParams1 = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      k = a(ce.h(paramView) - localLayoutParams1.leftMargin, ce.j(paramView) + localLayoutParams1.rightMargin, localce1.s(), localce1.q() - localce1.u(), j);
      break label41;
      label215: if (this.c.y > 0.0F)
        break label62;
      i = -1;
      break label62;
      label232: RecyclerView.LayoutParams localLayoutParams2 = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      m = a(ce.i(paramView) - localLayoutParams2.topMargin, ce.k(paramView) + localLayoutParams2.bottomMargin, localce2.t(), localce2.r() - localce2.v(), i);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.be
 * JD-Core Version:    0.6.0
 */