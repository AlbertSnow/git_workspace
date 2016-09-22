package android.support.v7.widget;

import android.view.View;

final class bt extends bs
{
  bt(ce paramce)
  {
    super(paramce, 0);
  }

  public final int a(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return ce.h(paramView) - localLayoutParams.leftMargin;
  }

  public final void a(int paramInt)
  {
    this.a.e(paramInt);
  }

  public final int b(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return ce.j(paramView) + localLayoutParams.rightMargin;
  }

  public final int c()
  {
    return this.a.s();
  }

  public final int c(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return ce.f(paramView) + localLayoutParams.leftMargin + localLayoutParams.rightMargin;
  }

  public final int d()
  {
    return this.a.q() - this.a.u();
  }

  public final int d(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return ce.g(paramView) + localLayoutParams.topMargin + localLayoutParams.bottomMargin;
  }

  public final int e()
  {
    return this.a.q();
  }

  public final int f()
  {
    return this.a.q() - this.a.s() - this.a.u();
  }

  public final int g()
  {
    return this.a.u();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.bt
 * JD-Core Version:    0.6.0
 */