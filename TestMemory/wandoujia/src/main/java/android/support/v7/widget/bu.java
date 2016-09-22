package android.support.v7.widget;

import android.view.View;

final class bu extends bs
{
  bu(ce paramce)
  {
    super(paramce, 0);
  }

  public final int a(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return ce.i(paramView) - localLayoutParams.topMargin;
  }

  public final void a(int paramInt)
  {
    this.a.f(paramInt);
  }

  public final int b(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return ce.k(paramView) + localLayoutParams.bottomMargin;
  }

  public final int c()
  {
    return this.a.t();
  }

  public final int c(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return ce.g(paramView) + localLayoutParams.topMargin + localLayoutParams.bottomMargin;
  }

  public final int d()
  {
    return this.a.r() - this.a.v();
  }

  public final int d(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return ce.f(paramView) + localLayoutParams.leftMargin + localLayoutParams.rightMargin;
  }

  public final int e()
  {
    return this.a.r();
  }

  public final int f()
  {
    return this.a.r() - this.a.t() - this.a.v();
  }

  public final int g()
  {
    return this.a.v();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.bu
 * JD-Core Version:    0.6.0
 */