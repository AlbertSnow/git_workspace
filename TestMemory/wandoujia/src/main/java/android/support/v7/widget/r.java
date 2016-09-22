package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;

final class r
{
  r(RecyclerView paramRecyclerView)
  {
  }

  public final int a()
  {
    return this.a.getChildCount();
  }

  public final int a(View paramView)
  {
    return this.a.indexOfChild(paramView);
  }

  public final void a(int paramInt)
  {
    View localView = this.a.getChildAt(paramInt);
    if (localView != null)
      RecyclerView.b(this.a, localView);
    this.a.removeViewAt(paramInt);
  }

  public final void a(View paramView, int paramInt)
  {
    this.a.addView(paramView, paramInt);
    RecyclerView.a(this.a, paramView);
  }

  public final void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    co localco = RecyclerView.b(paramView);
    if (localco != null)
    {
      if ((!localco.q()) && (!localco.b()))
        throw new IllegalArgumentException("Called attach on a child which is not detached: " + localco);
      localco.j();
    }
    RecyclerView.a(this.a, paramView, paramInt, paramLayoutParams);
  }

  public final View b(int paramInt)
  {
    return this.a.getChildAt(paramInt);
  }

  public final void b()
  {
    int i = this.a.getChildCount();
    for (int j = 0; j < i; j++)
      RecyclerView.b(this.a, b(j));
    this.a.removeAllViews();
  }

  public final void c(int paramInt)
  {
    View localView = b(paramInt);
    if (localView != null)
    {
      co localco = RecyclerView.b(localView);
      if (localco != null)
      {
        if ((localco.q()) && (!localco.b()))
          throw new IllegalArgumentException("called detach on an already detached child " + localco);
        localco.a(256);
      }
    }
    RecyclerView.a(this.a, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.r
 * JD-Core Version:    0.6.0
 */