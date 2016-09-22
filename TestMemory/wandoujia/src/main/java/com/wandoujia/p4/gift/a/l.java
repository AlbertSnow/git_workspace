package com.wandoujia.p4.gift.a;

import android.app.Activity;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.gift.http.model.GiftModel;
import com.wandoujia.p4.gift.views.GiftDetailPopUpCardView;

public final class l
  implements Action
{
  private final GiftModel a;
  private final Activity b;

  public l(GiftModel paramGiftModel, Activity paramActivity)
  {
    this.a = paramGiftModel;
    this.b = paramActivity;
  }

  public final void execute()
  {
    GiftDetailPopUpCardView.a(this.a, this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.a.l
 * JD-Core Version:    0.6.0
 */