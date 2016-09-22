package com.wandoujia.p4.gift.view.model;

import com.wandoujia.mvc.BaseModel;
import com.wandoujia.p4.card.models.CardViewModel;
import com.wandoujia.p4.gift.http.model.GiftModel;
import com.wandoujia.p4.gift.http.model.GiftModel.GiftViewType;

public final class a
  implements BaseModel
{
  private GiftModel a;
  private GiftModel.GiftViewType b;

  public a(GiftModel paramGiftModel, GiftModel.GiftViewType paramGiftViewType)
  {
    this.a = paramGiftModel;
    this.b = paramGiftViewType;
  }

  public final CardViewModel a()
  {
    return new GiftCardViewModelImpl(this.a, this.b);
  }

  public final GiftModel b()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.view.model.a
 * JD-Core Version:    0.6.0
 */