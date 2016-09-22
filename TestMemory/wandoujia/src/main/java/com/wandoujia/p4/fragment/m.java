package com.wandoujia.p4.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.view.ck;

final class m
  implements ck
{
  m(TabHostFragment paramTabHostFragment)
  {
  }

  public final void a(int paramInt)
  {
    if (TabHostFragment.b(this.a) != paramInt)
    {
      Fragment localFragment = this.a.b(TabHostFragment.b(this.a));
      if ((localFragment instanceof NetworkListAsyncloadFragment))
        ((NetworkListAsyncloadFragment)localFragment).h();
      TabHostFragment.a(this.a, paramInt);
      this.a.b(TabHostFragment.b(this.a));
    }
    if (TabHostFragment.a(this.a) != null)
      TabHostFragment.a(this.a).a(paramInt);
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if (TabHostFragment.a(this.a) != null)
      TabHostFragment.a(this.a).a(paramInt1, paramFloat, paramInt2);
  }

  public final void b(int paramInt)
  {
    if (TabHostFragment.a(this.a) != null)
      TabHostFragment.a(this.a).b(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.fragment.m
 * JD-Core Version:    0.6.0
 */