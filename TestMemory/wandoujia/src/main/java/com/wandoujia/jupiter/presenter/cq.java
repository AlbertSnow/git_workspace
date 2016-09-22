package com.wandoujia.jupiter.presenter;

import android.app.Activity;
import android.view.View;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.p4.gift.a.c;
import com.wandoujia.p4.gift.http.model.GiftModel;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class cq extends h
{
  cq(cp paramcp, Model paramModel)
  {
  }

  public final boolean a(View paramView)
  {
    new c(this.a, new GiftModel(this.a.b().detail.gift_detail), (Activity)this.b.e().getContext()).execute();
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.cq
 * JD-Core Version:    0.6.0
 */