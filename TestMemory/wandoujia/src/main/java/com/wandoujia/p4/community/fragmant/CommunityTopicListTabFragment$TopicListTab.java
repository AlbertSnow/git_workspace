package com.wandoujia.p4.community.fragmant;

import android.content.Context;
import com.wandoujia.p4.a;
import com.wandoujia.p4.fragment.k;
import com.wandoujia.p4.views.r;

 enum CommunityTopicListTabFragment$TopicListTab
{
  private final k delegate;

  static
  {
    FEATURED = new TopicListTab("FEATURED", 1, new k(new r("feature", a.a().getString(2131624540)), CommunityTopicListFragment.class, null));
    TopicListTab[] arrayOfTopicListTab = new TopicListTab[2];
    arrayOfTopicListTab[0] = NORMAL;
    arrayOfTopicListTab[1] = FEATURED;
    $VALUES = arrayOfTopicListTab;
  }

  private CommunityTopicListTabFragment$TopicListTab(k paramk)
  {
    this.delegate = paramk;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityTopicListTabFragment.TopicListTab
 * JD-Core Version:    0.6.0
 */