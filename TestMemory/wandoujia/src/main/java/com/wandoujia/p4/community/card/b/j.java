package com.wandoujia.p4.community.card.b;

import com.wandoujia.p4.card.models.CardViewModel;
import com.wandoujia.p4.card.models.a;
import com.wandoujia.p4.community.http.model.CommunityReplyModel;

public final class j
  implements a<CommunityReplyModel>
{
  private final CommunityReplyModel a;

  public j(CommunityReplyModel paramCommunityReplyModel)
  {
    this.a = paramCommunityReplyModel;
  }

  public final CardViewModel a()
  {
    return new k(this.a);
  }

  public final CommunityReplyModel b()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.b.j
 * JD-Core Version:    0.6.0
 */