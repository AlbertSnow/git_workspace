package com.wandoujia.jupiter.homepage;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.search.activity.SearchQueryHistoryActivity;
import com.wandoujia.jupiter.search.model.SearchTypeForHint;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class k extends h
{
  k(HomePageFragment paramHomePageFragment)
  {
  }

  public final boolean a(View paramView)
  {
    SearchTypeForHint localSearchTypeForHint = HomePageFragment.a(this.a, HomePageFragment.a(this.a).getCurrentItem());
    SearchQueryHistoryActivity.a(JupiterApplication.e(), localSearchTypeForHint);
    a(paramView, Logger.Module.UI, ViewLogPackage.Element.INPUT_BOX, ViewLogPackage.Action.REDIRECT, "wdj://search/history", null);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.k
 * JD-Core Version:    0.6.0
 */