package com.wandoujia.p4.community.card.b;

import com.wandoujia.p4.card.models.CardViewModel;
import com.wandoujia.p4.card.models.a;
import com.wandoujia.p4.community.http.model.CommunityRankingModel;

public final class h
  implements a<CommunityRankingModel>
{
  private CommunityRankingModel a;

  public h(CommunityRankingModel paramCommunityRankingModel)
  {
    this.a = paramCommunityRankingModel;
  }

  public final CardViewModel a()
  {
    return new i(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.b.h
 * JD-Core Version:    0.6.0
 */