package com.wandoujia.p4.gift.view.a;

import com.wandoujia.mvc.BaseController;
import com.wandoujia.p4.gift.http.model.GiftModel.GiftViewType;
import com.wandoujia.p4.gift.views.MyGiftCardView;

public final class d
  implements BaseController<MyGiftCardView, com.wandoujia.p4.gift.view.model.a>
{
  private com.wandoujia.p4.gift.c.a.a a;
  private com.wandoujia.p4.gift.view.model.a b;

  public d()
  {
    new com.wandoujia.p4.card.a.a();
    this.a = new com.wandoujia.p4.gift.c.a.a(GiftModel.GiftViewType.MY_GIFT);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.view.a.d
 * JD-Core Version:    0.6.0
 */