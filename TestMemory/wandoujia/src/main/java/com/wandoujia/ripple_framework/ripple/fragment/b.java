package com.wandoujia.ripple_framework.ripple.fragment;

import android.support.v4.view.ck;
import com.wandoujia.ripple_framework.adapter.c;
import com.wandoujia.ripple_framework.fragment.BaseFragment;

final class b
  implements ck
{
  b(DetailPagerFragment paramDetailPagerFragment)
  {
  }

  public final void a(int paramInt)
  {
    BaseFragment localBaseFragment = (BaseFragment)this.a.a.e(paramInt);
    if (localBaseFragment != null)
      localBaseFragment.renderSystemBar(true);
    this.a.b(paramInt);
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public final void b(int paramInt)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.fragment.b
 * JD-Core Version:    0.6.0
 */