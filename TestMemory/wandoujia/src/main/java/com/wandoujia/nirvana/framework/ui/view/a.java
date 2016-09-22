package com.wandoujia.nirvana.framework.ui.view;

import android.support.v4.view.ck;

final class a
  implements ck
{
  a(CommonViewPager paramCommonViewPager)
  {
  }

  public final void a(int paramInt)
  {
    if (CommonViewPager.a(this.a) != null)
      CommonViewPager.a(this.a).a(paramInt);
    CommonViewPager.b(this.a);
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if (CommonViewPager.a(this.a) != null)
      CommonViewPager.a(this.a).a(paramInt1, paramFloat, paramInt2);
  }

  public final void b(int paramInt)
  {
    if (CommonViewPager.a(this.a) != null)
      CommonViewPager.a(this.a).b(paramInt);
    if (paramInt == 0)
      CommonViewPager.b(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.ui.view.a
 * JD-Core Version:    0.6.0
 */