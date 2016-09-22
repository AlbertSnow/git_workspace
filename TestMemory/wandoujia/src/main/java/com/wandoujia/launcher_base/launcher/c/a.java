package com.wandoujia.launcher_base.launcher.c;

import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.wandoujia.launcher_base.R.id;
import com.wandoujia.launcher_base.utils.g;

public abstract class a
{
  private static final int a = R.id.launcher_cell;
  private static int b = 0;
  private final int c;
  private int d;
  private Point e;
  private g f;
  private View g;

  public a()
  {
    b = 1 + b;
    this.c = b;
    this.d = -1;
    this.f = new g(1, 1);
  }

  public a(int paramInt)
  {
    this.c = paramInt;
    this.f = new g(1, 1);
  }

  public static a c(View paramView)
  {
    if (paramView != null)
    {
      Object localObject = paramView.getTag(a);
      if ((localObject instanceof a))
        return (a)localObject;
    }
    return null;
  }

  protected abstract View a(View paramView, ViewGroup paramViewGroup);

  protected void a()
  {
  }

  public final void a(int paramInt)
  {
    this.d = paramInt;
  }

  public final void a(Point paramPoint)
  {
    this.e = paramPoint;
  }

  public void a(ViewGroup paramViewGroup)
  {
    paramViewGroup.addView(this.g);
    this.g.setTag(a, this);
  }

  protected void a(b paramb)
  {
  }

  public final void a(g paramg)
  {
    this.f = paramg;
  }

  public final View b(ViewGroup paramViewGroup)
  {
    this.g = a(this.g, paramViewGroup);
    return this.g;
  }

  protected void b()
  {
  }

  public void d()
  {
    this.d = -1;
    if (this.g != null)
    {
      ViewParent localViewParent = this.g.getParent();
      if ((localViewParent instanceof ViewGroup))
        ((ViewGroup)localViewParent).removeView(this.g);
    }
  }

  public final int e()
  {
    return this.c;
  }

  public final Point f()
  {
    return this.e;
  }

  public final g g()
  {
    return this.f;
  }

  public final int h()
  {
    return this.d;
  }

  protected void i()
  {
  }

  public void j()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.c.a
 * JD-Core Version:    0.6.0
 */