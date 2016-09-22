package com.wandoujia.p4.views;

import android.support.v4.view.ck;

final class e
  implements ck
{
  e(CommonViewPager paramCommonViewPager)
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
 * Qualified Name:     com.wandoujia.p4.views.e
 * JD-Core Version:    0.6.0
 */