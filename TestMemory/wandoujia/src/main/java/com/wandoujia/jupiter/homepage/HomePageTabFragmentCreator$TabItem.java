package com.wandoujia.jupiter.homepage;

import android.support.v4.app.Fragment;
import com.wandoujia.jupiter.category.fragment.CategoryOverallFragment;
import com.wandoujia.jupiter.fragment.FilterInstalledHomeFragment;
import com.wandoujia.jupiter.fragment.StartPageFragment;
import com.wandoujia.jupiter.fragment.WebViewFragment;
import com.wandoujia.jupiter.search.model.SearchTypeForHint;
import com.wandoujia.jupiter.subscribe.fragment.SubscribeOnBoardFragment;
import com.wandoujia.jupiter.subscribe.fragment.SubscribeTimeLineFragment;

 enum HomePageTabFragmentCreator$TabItem
{
  private Class<? extends Fragment> fragment;
  private String name;
  private SearchTypeForHint searchTypeForHint;
  private String url;

  static
  {
    APP = new TabItem("APP", 2, "wdj://apps/explore", FilterInstalledHomeFragment.class, "http://apis.wandoujia.com/apps/v1/list/choices?format=proto", SearchTypeForHint.APP);
    GAME = new TabItem("GAME", 3, "wdj://games/explore", HomeScrollFragment.class, "http://apis.wandoujia.com/games/v1/list/choices?format=proto", SearchTypeForHint.GAME);
    FOLLOW_ONBOARD = new TabItem("FOLLOW_ONBOARD", 4, "wdj://follow/onboard", SubscribeOnBoardFragment.class, "http://apis.wandoujia.com/five/v1/follow/onboard?format=proto", SearchTypeForHint.ALL);
    FOLLOW_TIMELINE = new TabItem("FOLLOW_TIMELINE", 5, "wdj://follow", SubscribeTimeLineFragment.class, "http://apis.wandoujia.com/five/v1/follow/%s?format=proto", SearchTypeForHint.ALL);
    WEB_VIEW = new TabItem("WEB_VIEW", 6, "wdj://web", WebViewFragment.class, "", SearchTypeForHint.ALL);
    NUX = new TabItem("NUX", 7, "wdj://essential", FilterInstalledHomeFragment.class, "http://apis.wandoujia.com/five/v1/nux/essentials?max=50", SearchTypeForHint.ALL);
    TabItem[] arrayOfTabItem = new TabItem[8];
    arrayOfTabItem[0] = COMMON_CATEGORY;
    arrayOfTabItem[1] = START_PAGE;
    arrayOfTabItem[2] = APP;
    arrayOfTabItem[3] = GAME;
    arrayOfTabItem[4] = FOLLOW_ONBOARD;
    arrayOfTabItem[5] = FOLLOW_TIMELINE;
    arrayOfTabItem[6] = WEB_VIEW;
    arrayOfTabItem[7] = NUX;
    $VALUES = arrayOfTabItem;
  }

  private HomePageTabFragmentCreator$TabItem(String paramString1, Class<? extends Fragment> paramClass, String paramString2, SearchTypeForHint paramSearchTypeForHint)
  {
    this.name = paramString1;
    this.fragment = paramClass;
    this.url = paramString2;
    this.searchTypeForHint = paramSearchTypeForHint;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.HomePageTabFragmentCreator.TabItem
 * JD-Core Version:    0.6.0
 */