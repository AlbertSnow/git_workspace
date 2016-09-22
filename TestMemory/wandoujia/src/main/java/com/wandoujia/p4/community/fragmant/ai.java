package com.wandoujia.p4.community.fragmant;

import com.wandoujia.mvc.Action;
import com.wandoujia.p4.community.b.ac;

final class ai
  implements Action
{
  ai(CommunityTopicDetailFragment paramCommunityTopicDetailFragment)
  {
  }

  public final void execute()
  {
    CommunityTopicDetailFragment.a(this.a, "like");
    new ac(this.a.getActivity(), CommunityTopicDetailFragment.d(this.a)).execute();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.ai
 * JD-Core Version:    0.6.0
 */