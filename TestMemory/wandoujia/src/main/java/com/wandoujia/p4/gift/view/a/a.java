package com.wandoujia.p4.gift.view.a;

import com.wandoujia.mvc.BaseController;
import com.wandoujia.p4.gift.d.c;
import com.wandoujia.p4.gift.http.model.GiftModel;
import com.wandoujia.p4.gift.http.model.GiftModel.GiftViewType;
import com.wandoujia.p4.views.ExtraDescCardView;

public final class a
  implements BaseController<ExtraDescCardView, com.wandoujia.p4.gift.view.model.a>, c
{
  private com.wandoujia.p4.gift.view.model.a a;
  private com.wandoujia.p4.gift.c.a.a b;
  private ExtraDescCardView c;

  public a()
  {
    new com.wandoujia.p4.card.a.a();
    this.b = new com.wandoujia.p4.gift.c.a.a(GiftModel.GiftViewType.GIFT_LIST);
  }

  public final void a(GiftModel paramGiftModel)
  {
    com.wandoujia.p4.card.a.a.a(this.c.getCardView(), this.a.a());
    this.b.a(this.c.getButton(), new com.wandoujia.p4.gift.view.model.a(paramGiftModel, GiftModel.GiftViewType.GIFT_LIST));
    if (com.wandoujia.p4.gift.e.a.a(this.a.b()))
      this.c.setOnClickListener(null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.view.a.a
 * JD-Core Version:    0.6.0
 */