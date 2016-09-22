package com.wandoujia.p4.community.views;

import com.wandoujia.mvc.Action;
import com.wandoujia.p4.community.b.a;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;

final class b
  implements Action
{
  b(CommunityBallotInfoView paramCommunityBallotInfoView, CommunityGroupModel paramCommunityGroupModel)
  {
  }

  public final void execute()
  {
    new a(this.b.getContext(), this.a.getId()).execute();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.b
 * JD-Core Version:    0.6.0
 */