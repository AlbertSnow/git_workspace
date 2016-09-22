package com.wandoujia.accessibility.hibernation.fragment;

import android.support.v4.app.d;
import android.support.v4.view.ViewPager;
import android.support.v4.view.at;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.ripple_framework.accessibility.R.id;
import com.wandoujia.ripple_framework.accessibility.R.layout;

final class m extends at
{
  private m(OnBoardFragment paramOnBoardFragment)
  {
  }

  public final int a()
  {
    return OnBoardFragment.b(this.a).length;
  }

  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    View localView = d.a(paramViewGroup, R.layout.view_hibernation_onboard_tip);
    ((TextView)localView.findViewById(R.id.title)).setText(OnBoardFragment.b(this.a)[paramInt]);
    ((TextView)localView.findViewById(R.id.content)).setText(OnBoardFragment.f(this.a)[paramInt]);
    OnBoardFragment.d(this.a).addView(localView);
    return localView;
  }

  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    if ((paramObject instanceof View))
      paramViewGroup.removeView((View)paramObject);
  }

  public final boolean a(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.fragment.m
 * JD-Core Version:    0.6.0
 */