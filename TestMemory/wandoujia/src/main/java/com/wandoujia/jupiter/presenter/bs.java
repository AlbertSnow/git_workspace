package com.wandoujia.jupiter.presenter;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.api.proto.GiftDetail;

final class bs
  implements View.OnClickListener
{
  bs(GiftButtonPresenter paramGiftButtonPresenter)
  {
  }

  public final void onClick(View paramView)
  {
    if ((GiftButtonPresenter.a(this.a).is_received != null) && (GiftButtonPresenter.a(this.a).is_received.booleanValue()) && (GiftButtonPresenter.b(this.a)) && (GiftButtonPresenter.c(this.a) != GiftButtonPresenter.GiftState.EXPIRED))
    {
      GiftButtonPresenter.d(this.a);
      return;
    }
    switch (bt.a[GiftButtonPresenter.c(this.a).ordinal()])
    {
    default:
      return;
    case 1:
      GiftButtonPresenter.e(this.a);
      return;
    case 2:
    }
    GiftButtonPresenter.f(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.bs
 * JD-Core Version:    0.6.0
 */