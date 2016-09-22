package com.wandoujia.ripple_framework.video;

 enum ViewFocusManager$STATE
{
  private int priority;

  static
  {
    PART = new STATE("PART", 2, 2);
    INVISIBLE = new STATE("INVISIBLE", 3, 3);
    STATE[] arrayOfSTATE = new STATE[4];
    arrayOfSTATE[0] = CLICK;
    arrayOfSTATE[1] = VISIBLE;
    arrayOfSTATE[2] = PART;
    arrayOfSTATE[3] = INVISIBLE;
    $VALUES = arrayOfSTATE;
  }

  private ViewFocusManager$STATE(int paramInt)
  {
    this.priority = paramInt;
  }

  final boolean priority(STATE paramSTATE)
  {
    return this.priority < paramSTATE.priority;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.video.ViewFocusManager.STATE
 * JD-Core Version:    0.6.0
 */