package com.wandoujia.p4.gift.http.model;

import java.io.Serializable;
import java.util.List;

public class GiftInfo
  implements Serializable
{
  List<GiftInfo.GiftDetail> gifts;
  String pn;

  public List<GiftInfo.GiftDetail> getGifts()
  {
    return this.gifts;
  }

  public String getPn()
  {
    return this.pn;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.http.model.GiftInfo
 * JD-Core Version:    0.6.0
 */