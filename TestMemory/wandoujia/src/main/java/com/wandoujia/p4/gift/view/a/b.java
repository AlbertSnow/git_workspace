package com.wandoujia.p4.gift.view.a;

import com.wandoujia.mvc.BaseController;
import com.wandoujia.p4.card.views.ContentCardView;
import com.wandoujia.p4.gift.d.c;
import com.wandoujia.p4.gift.http.model.GiftModel;
import com.wandoujia.p4.gift.http.model.GiftModel.GiftViewType;

public final class b
  implements BaseController<ContentCardView, com.wandoujia.p4.gift.view.model.a>, c
{
  private com.wandoujia.p4.gift.c.a.a a;
  private com.wandoujia.p4.gift.view.model.a b;
  private ContentCardView c;
  private GiftModel.GiftViewType d;

  public b(GiftModel.GiftViewType paramGiftViewType)
  {
    new com.wandoujia.p4.card.a.a();
    this.a = new com.wandoujia.p4.gift.c.a.a(paramGiftViewType);
    this.d = paramGiftViewType;
  }

  public final void a(ContentCardView paramContentCardView, com.wandoujia.p4.gift.view.model.a parama)
  {
    if (paramContentCardView == null);
    do
      return;
    while (this.b == parama);
    this.b = parama;
    this.c = paramContentCardView;
    com.wandoujia.p4.card.a.a.a(paramContentCardView.getCardView(), parama.a());
    this.a.a(paramContentCardView.getButton(), parama);
    com.wandoujia.p4.gift.d.a.a().a(parama.b().getId(), this);
  }

  public final void a(GiftModel paramGiftModel)
  {
    com.wandoujia.p4.card.a.a.a(this.c.getCardView(), this.b.a());
    this.a.a(this.c.getButton(), new com.wandoujia.p4.gift.view.model.a(paramGiftModel, this.d));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.view.a.b
 * JD-Core Version:    0.6.0
 */