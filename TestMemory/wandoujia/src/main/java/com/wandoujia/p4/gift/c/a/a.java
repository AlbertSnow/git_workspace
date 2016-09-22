package com.wandoujia.p4.gift.c.a;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.wandoujia.mvc.BaseController;
import com.wandoujia.p4.button.views.StatefulButton;
import com.wandoujia.p4.gift.a.b;
import com.wandoujia.p4.gift.a.c;
import com.wandoujia.p4.gift.a.l;
import com.wandoujia.p4.gift.http.model.GiftModel;
import com.wandoujia.p4.gift.http.model.GiftModel.GiftViewType;

public final class a
  implements BaseController<com.wandoujia.p4.button.views.a, com.wandoujia.p4.gift.view.model.a>
{
  private GiftModel.GiftViewType a;

  public a(GiftModel.GiftViewType paramGiftViewType)
  {
    this.a = paramGiftViewType;
  }

  public final void a(com.wandoujia.p4.button.views.a parama, com.wandoujia.p4.gift.view.model.a parama1)
  {
    if (this.a == GiftModel.GiftViewType.GIFT_LIST)
      if (!parama1.b().isReceived())
      {
        com.wandoujia.p4.button.a.a locala7 = new com.wandoujia.p4.button.a.a(2130772010, 2131624870, new b(parama1.b(), parama.getView().getContext()));
        parama.a().setState(locala7);
      }
    do
    {
      return;
      com.wandoujia.p4.button.a.a locala8 = new com.wandoujia.p4.button.a.a(2130772010, 2131625698, new b(parama1.b(), parama.getView().getContext()));
      parama.a().setState(locala8);
      return;
      if (this.a == GiftModel.GiftViewType.GIFT_POP_UP)
      {
        com.wandoujia.p4.button.a.a locala1 = new com.wandoujia.p4.button.a.a(2130772010, 2131624870, new c(parama1.b(), (Activity)parama.getView().getContext()));
        parama.a().setState(locala1);
        return;
      }
      if (this.a == GiftModel.GiftViewType.GIFT_DETAIL_ITEM)
      {
        if (!parama1.b().isReceived())
        {
          com.wandoujia.p4.button.a.a locala5 = new com.wandoujia.p4.button.a.a(2130772010, 2131624870, new l(parama1.b(), (Activity)parama.getView().getContext()));
          parama.a().setState(locala5);
          return;
        }
        com.wandoujia.p4.button.a.a locala6 = new com.wandoujia.p4.button.a.a(2130772010, 2131625698, new l(parama1.b(), (Activity)parama.getView().getContext()));
        parama.a().setState(locala6);
        return;
      }
      if (this.a != GiftModel.GiftViewType.MY_GIFT)
        continue;
      if (!com.wandoujia.p4.gift.e.a.a(parama1.b()))
      {
        com.wandoujia.p4.button.a.a locala3 = new com.wandoujia.p4.button.a.a(2130772010, 2131625698, new b(parama1.b(), parama.getView().getContext()));
        parama.a().setState(locala3);
        return;
      }
      com.wandoujia.p4.button.a.a locala4 = new com.wandoujia.p4.button.a.a(2130772010, 2131624874, new b(parama1.b(), parama.getView().getContext()));
      parama.a().setState(locala4);
      parama.a().setTextColor(parama.a().getResources().getColor(2131361881));
      parama.a().setEnabled(false);
      return;
    }
    while (this.a != GiftModel.GiftViewType.GIFT_RECOMMEND);
    com.wandoujia.p4.button.a.a locala2 = new com.wandoujia.p4.button.a.a(2130772011, 2131624870, new b(parama1.b(), parama.getView().getContext()));
    parama.a().setState(locala2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.c.a.a
 * JD-Core Version:    0.6.0
 */