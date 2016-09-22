package com.wandoujia.accessibility.hibernation.fragment;

import android.support.v4.view.ck;
import android.widget.Button;
import com.wandoujia.accessibility.hibernation.view.PageDotIndicator;
import com.wandoujia.ripple_framework.accessibility.R.string;

final class k
  implements ck
{
  k(OnBoardFragment paramOnBoardFragment)
  {
  }

  public final void a(int paramInt)
  {
    OnBoardFragment.a(this.a).setCurrentPage(paramInt);
    if (paramInt < -1 + OnBoardFragment.b(this.a).length)
    {
      OnBoardFragment.c(this.a).setText(R.string.hibernating_next);
      return;
    }
    OnBoardFragment.c(this.a).setText(R.string.hibernation_start);
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public final void b(int paramInt)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.fragment.k
 * JD-Core Version:    0.6.0
 */