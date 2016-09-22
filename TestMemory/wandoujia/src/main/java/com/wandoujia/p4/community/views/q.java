package com.wandoujia.p4.community.views;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.community.activity.CommunityTopicFeedActivity;
import com.wandoujia.p4.community.fragmant.CommunityUserTopicListFragment.TopicType;

final class q
  implements View.OnClickListener
{
  q(CommunityUserInfoBannerView paramCommunityUserInfoBannerView)
  {
  }

  public final void onClick(View paramView)
  {
    CommunityTopicFeedActivity.a(this.a.getContext(), CommunityUserTopicListFragment.TopicType.PUBLISHED);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.q
 * JD-Core Version:    0.6.0
 */