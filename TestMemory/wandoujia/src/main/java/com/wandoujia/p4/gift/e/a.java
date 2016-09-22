package com.wandoujia.p4.gift.e;

import android.content.Context;
import com.wandoujia.p4.gift.http.model.GiftModel;

public final class a
{
  static
  {
    com.wandoujia.p4.a.a().getString(2131625219);
  }

  public static boolean a(GiftModel paramGiftModel)
  {
    return System.currentTimeMillis() >= paramGiftModel.getEndDateStamp();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.e.a
 * JD-Core Version:    0.6.0
 */