package com.wandoujia.jupiter.homepage;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.cf;

final class z extends cf
{
  z(HomeScrollFragment paramHomeScrollFragment)
  {
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt)
  {
    if (HomeScrollFragment.a(this.a) != null)
      HomeScrollFragment.a(this.a).a(paramInt);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    HomeScrollFragment.a(this.a, paramInt2 + HomeScrollFragment.b(this.a));
    if (HomeScrollFragment.a(this.a) != null)
      HomeScrollFragment.a(this.a).a(paramInt1, paramInt2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.z
 * JD-Core Version:    0.6.0
 */