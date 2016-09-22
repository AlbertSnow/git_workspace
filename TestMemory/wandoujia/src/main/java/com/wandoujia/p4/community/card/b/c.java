package com.wandoujia.p4.community.card.b;

import com.wandoujia.p4.card.models.CardViewModel;
import com.wandoujia.p4.card.models.a;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;

public final class c
  implements a<CommunityGroupModel>
{
  private final CommunityGroupModel a;

  public c(CommunityGroupModel paramCommunityGroupModel)
  {
    this.a = paramCommunityGroupModel;
  }

  public final CardViewModel a()
  {
    return new d(this.a);
  }

  public final CommunityGroupModel b()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.b.c
 * JD-Core Version:    0.6.0
 */