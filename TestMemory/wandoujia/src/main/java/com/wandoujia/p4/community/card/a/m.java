package com.wandoujia.p4.community.card.a;

import com.wandoujia.mvc.BaseController;
import com.wandoujia.p4.community.card.b.n;
import com.wandoujia.p4.community.card.view.CommunityTopicFeedCardView;
import com.wandoujia.p4.community.fragmant.CommunityUserTopicListFragment.TopicType;

public final class m
  implements BaseController<CommunityTopicFeedCardView, n>
{
  private CommunityUserTopicListFragment.TopicType a;

  public m(CommunityUserTopicListFragment.TopicType paramTopicType)
  {
    this.a = paramTopicType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.a.m
 * JD-Core Version:    0.6.0
 */