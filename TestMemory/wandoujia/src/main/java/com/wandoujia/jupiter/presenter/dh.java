package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

final class dh extends c
{
  public final void a()
  {
    super.a();
    e().setEnabled(true);
  }

  protected final void a(Model paramModel)
  {
    if (GiftButtonPresenter.a(paramModel, paramModel.E()) == GiftButtonPresenter.GiftState.EXPIRED)
      e().setEnabled(false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.dh
 * JD-Core Version:    0.6.0
 */