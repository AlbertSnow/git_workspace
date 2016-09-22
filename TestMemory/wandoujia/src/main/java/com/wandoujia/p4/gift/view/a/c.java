package com.wandoujia.p4.gift.view.a;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.mvc.BaseController;
import com.wandoujia.p4.button.views.StatefulButton;
import com.wandoujia.p4.gift.http.model.GiftModel;
import com.wandoujia.p4.gift.http.model.GiftModel.GiftViewType;
import com.wandoujia.p4.gift.view.model.GiftCardViewModelImpl.GiftType;
import com.wandoujia.p4.gift.views.GiftDetailPopUpCardView;

public final class c
  implements BaseController<GiftDetailPopUpCardView, com.wandoujia.p4.gift.view.model.a>, com.wandoujia.p4.gift.d.c
{
  private com.wandoujia.p4.gift.view.model.a a;
  private com.wandoujia.p4.gift.c.a.a b;
  private GiftDetailPopUpCardView c;

  public c()
  {
    new com.wandoujia.p4.card.a.a();
    this.b = new com.wandoujia.p4.gift.c.a.a(GiftModel.GiftViewType.GIFT_POP_UP);
  }

  public final void a(GiftModel paramGiftModel)
  {
    com.wandoujia.p4.card.a.a.a(this.c.getCardView(), this.a.a());
    this.b.a(this.c.getButton(), new com.wandoujia.p4.gift.view.model.a(paramGiftModel, GiftModel.GiftViewType.GIFT_POP_UP));
  }

  public final void a(GiftDetailPopUpCardView paramGiftDetailPopUpCardView, com.wandoujia.p4.gift.view.model.a parama)
  {
    if (this.a == parama);
    do
    {
      do
        return;
      while ((parama == null) || (parama.b() == null));
      this.a = parama;
      this.c = paramGiftDetailPopUpCardView;
      com.wandoujia.p4.card.a.a.a(paramGiftDetailPopUpCardView.getCardView(), parama.a());
      this.b.a(paramGiftDetailPopUpCardView.getButton(), parama);
      if (parama.b().isReceived())
        paramGiftDetailPopUpCardView.getButton().a().setVisibility(8);
      if (!GiftCardViewModelImpl.GiftType.CDKEY.getGiftType().equals(parama.b().getProvideType()))
        paramGiftDetailPopUpCardView.getCardView().b().setVisibility(8);
      paramGiftDetailPopUpCardView.getExchangeDateTextView().setText(parama.b().getExchangeDateRange());
      paramGiftDetailPopUpCardView.getGiftUsageTextView().setText(parama.b().getDirections());
    }
    while ((!parama.b().isReceived()) || (TextUtils.isEmpty(parama.b().getCdkey())));
    paramGiftDetailPopUpCardView.getGiftKeyContainer().setVisibility(0);
    paramGiftDetailPopUpCardView.getGiftKeyTextView().setText(parama.b().getCdkey());
    paramGiftDetailPopUpCardView.getOpenGiftKeyButton().setState(new com.wandoujia.p4.button.a.a(2130772010, 2131624861, new com.wandoujia.p4.gift.a.a((Activity)paramGiftDetailPopUpCardView.getContext(), parama.b())));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.view.a.c
 * JD-Core Version:    0.6.0
 */