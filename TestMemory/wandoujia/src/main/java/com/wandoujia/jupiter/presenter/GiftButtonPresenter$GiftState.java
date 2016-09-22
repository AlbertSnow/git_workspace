package com.wandoujia.jupiter.presenter;

public enum GiftButtonPresenter$GiftState
{
  private int bgResource;
  private boolean enable;
  private int textColor;
  private int textId;

  static
  {
    EXPIRED = new GiftState("EXPIRED", 1, 2131624721, 2131362159, 2131362136, false);
    WAIT_REUSE = new GiftState("WAIT_REUSE", 2, 2131625435, 2130838385, 2131362141, false);
    START_REUSE = new GiftState("START_REUSE", 3, 2131625435, 2130838376, 2131362141, true);
    END_RECEIVE = new GiftState("END_RECEIVE", 4, 2131625306, 2130838378, 2131362131, true);
    GiftState[] arrayOfGiftState = new GiftState[5];
    arrayOfGiftState[0] = START_RECEIVE;
    arrayOfGiftState[1] = EXPIRED;
    arrayOfGiftState[2] = WAIT_REUSE;
    arrayOfGiftState[3] = START_REUSE;
    arrayOfGiftState[4] = END_RECEIVE;
    $VALUES = arrayOfGiftState;
  }

  private GiftButtonPresenter$GiftState(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.textId = paramInt1;
    this.bgResource = paramInt2;
    this.enable = paramBoolean;
    this.textColor = paramInt3;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.GiftButtonPresenter.GiftState
 * JD-Core Version:    0.6.0
 */