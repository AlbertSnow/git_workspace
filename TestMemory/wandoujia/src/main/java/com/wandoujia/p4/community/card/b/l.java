package com.wandoujia.p4.community.card.b;

import com.wandoujia.p4.card.models.CardViewModel;
import com.wandoujia.p4.card.models.a;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;

public final class l
  implements a<CommunityTopicModel>
{
  private final CommunityTopicModel a;

  public l(CommunityTopicModel paramCommunityTopicModel)
  {
    this.a = paramCommunityTopicModel;
  }

  public final CardViewModel a()
  {
    return new m(this.a);
  }

  public final CommunityTopicModel b()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.b.l
 * JD-Core Version:    0.6.0
 */