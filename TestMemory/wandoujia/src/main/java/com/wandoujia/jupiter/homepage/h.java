package com.wandoujia.jupiter.homepage;

import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import com.wandoujia.api.proto.Action;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.homepage.a.a;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.model.g;
import java.util.List;

final class h extends com.sina.weibo.sdk.api.share.i
{
  h(HomePageFragment paramHomePageFragment)
  {
  }

  public final void a(int paramInt)
  {
    if ((!CollectionUtils.isEmpty(HomePageFragment.d(this.a).c())) && (!CollectionUtils.isEmpty(HomePageFragment.z(this.a))) && (paramInt < HomePageFragment.z(this.a).size()))
    {
      if (HomePageFragment.j(this.a) != null)
        HomePageFragment.j(this.a).a_();
      if (HomePageFragment.c(this.a) != null)
        break label78;
    }
    label78: String str;
    do
    {
      return;
      HomePageFragment.a(this.a, (a)HomePageFragment.c(this.a).e(paramInt));
      if (HomePageFragment.j(this.a) == null)
      {
        HomePageFragment.a(this.a).post(new i(this, paramInt));
        return;
      }
      HomePageFragment.j(this.a).a(HomePageFragment.A(this.a));
      HomePageFragment.a(this.a, true);
      int i = HomePageFragment.j(this.a).b_();
      if (i < -HomePageFragment.x(this.a))
        HomePageFragment.j(this.a).c_().post(new j(this, i));
      str = this.a.a(paramInt).t().intent;
    }
    while (TextUtils.isEmpty(str));
    HomePageFragment.a(this.a, str);
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    super.a(paramInt1, paramFloat, paramInt2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.h
 * JD-Core Version:    0.6.0
 */