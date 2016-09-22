package com.wandoujia.p4.community.fragmant;

import android.content.Context;
import com.wandoujia.entities.app.TabCategory;
import com.wandoujia.p4.a;

 enum CommunityHomePageTabFragment$HomePageTab
  implements TabCategory
{
  private final boolean needLogin;
  private String tabId;
  private String tabTitle;

  static
  {
    EXPLORE = new HomePageTab("EXPLORE", 1, "group_explore", a.a().getString(2131624462), false);
    MINE = new HomePageTab("MINE", 2, "my_group", a.a().getString(2131624464), false);
    MESSAGE = new HomePageTab("MESSAGE", 3, "message", a.a().getString(2131624479), true);
    HomePageTab[] arrayOfHomePageTab = new HomePageTab[4];
    arrayOfHomePageTab[0] = FEED;
    arrayOfHomePageTab[1] = EXPLORE;
    arrayOfHomePageTab[2] = MINE;
    arrayOfHomePageTab[3] = MESSAGE;
    $VALUES = arrayOfHomePageTab;
  }

  private CommunityHomePageTabFragment$HomePageTab(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.tabId = paramString1;
    this.tabTitle = paramString2;
    this.needLogin = paramBoolean;
  }

  public final String getTabId()
  {
    return this.tabId;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityHomePageTabFragment.HomePageTab
 * JD-Core Version:    0.6.0
 */