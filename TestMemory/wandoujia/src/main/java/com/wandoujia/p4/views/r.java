package com.wandoujia.p4.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.f;
import android.view.View;
import com.wandoujia.ripple_framework.view.slidingtab.e;

public final class r extends e
{
  public r(String paramString, CharSequence paramCharSequence)
  {
    super(paramString, paramCharSequence);
  }

  public final View a(Context paramContext, int paramInt, ViewPager paramViewPager, f paramf)
  {
    View localView = super.a(paramContext, paramInt, paramViewPager, paramf);
    localView.setOnClickListener(new s(paramViewPager, paramInt));
    return localView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.r
 * JD-Core Version:    0.6.0
 */