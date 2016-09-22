package com.wandoujia.p4.community.fragmant;

import com.wandoujia.mvc.Action;
import com.wandoujia.p4.community.b.ap;

final class aj
  implements Action
{
  aj(CommunityTopicDetailFragment paramCommunityTopicDetailFragment)
  {
  }

  public final void execute()
  {
    CommunityTopicDetailFragment.a(this.a, "reply");
    new ap(this.a.getActivity(), CommunityTopicDetailFragment.d(this.a)).execute();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.aj
 * JD-Core Version:    0.6.0
 */