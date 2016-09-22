package com.wandoujia.p4.gift.http.model;

public enum GiftModel$GiftViewType
{
  static
  {
    GIFT_DETAIL_ITEM = new GiftViewType("GIFT_DETAIL_ITEM", 2);
    MY_GIFT = new GiftViewType("MY_GIFT", 3);
    GIFT_RECOMMEND = new GiftViewType("GIFT_RECOMMEND", 4);
    GiftViewType[] arrayOfGiftViewType = new GiftViewType[5];
    arrayOfGiftViewType[0] = GIFT_LIST;
    arrayOfGiftViewType[1] = GIFT_POP_UP;
    arrayOfGiftViewType[2] = GIFT_DETAIL_ITEM;
    arrayOfGiftViewType[3] = MY_GIFT;
    arrayOfGiftViewType[4] = GIFT_RECOMMEND;
    $VALUES = arrayOfGiftViewType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.http.model.GiftModel.GiftViewType
 * JD-Core Version:    0.6.0
 */