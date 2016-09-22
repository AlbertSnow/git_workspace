package com.wandoujia.p4.community.card.b;

import com.wandoujia.p4.card.models.CardViewModel;
import com.wandoujia.p4.community.http.model.CommunityCampaignModel;

public final class a
  implements com.wandoujia.p4.card.models.a<CommunityCampaignModel>
{
  private final String a;
  private final CommunityCampaignModel b;

  public a(String paramString, CommunityCampaignModel paramCommunityCampaignModel)
  {
    this.a = paramString;
    this.b = paramCommunityCampaignModel;
  }

  public final CardViewModel a()
  {
    return new b(this.b, this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.b.a
 * JD-Core Version:    0.6.0
 */