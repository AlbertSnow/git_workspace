package com.wandoujia.p4.community.views;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.community.activity.CommunityTopicFeedActivity;
import com.wandoujia.p4.community.fragmant.CommunityUserTopicListFragment.TopicType;

final class r
  implements View.OnClickListener
{
  r(CommunityUserInfoBannerView paramCommunityUserInfoBannerView)
  {
  }

  public final void onClick(View paramView)
  {
    CommunityTopicFeedActivity.a(this.a.getContext(), CommunityUserTopicListFragment.TopicType.REPLIED);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.r
 * JD-Core Version:    0.6.0
 */