package com.wandoujia.p4.community.fragmant;

import com.wandoujia.p4.community.b.w;
import com.wandoujia.p4.community.http.model.CommunityTopicLikedUsersInfo;
import com.wandoujia.p4.community.views.CommunityTopicDetailBannerView;

final class af
  implements w
{
  af(CommunityTopicDetailFragment paramCommunityTopicDetailFragment)
  {
  }

  public final void a(CommunityTopicLikedUsersInfo paramCommunityTopicLikedUsersInfo)
  {
    if (CommunityTopicDetailFragment.a(this.a) != null)
      CommunityTopicDetailFragment.a(this.a).setLikedUser(paramCommunityTopicLikedUsersInfo);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.af
 * JD-Core Version:    0.6.0
 */