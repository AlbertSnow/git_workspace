package com.wandoujia.p4.views;

 enum ScrollDownLayout$InnerStatus
{
  static
  {
    CLOSED = new InnerStatus("CLOSED", 2);
    MOVING = new InnerStatus("MOVING", 3);
    SCROLLING = new InnerStatus("SCROLLING", 4);
    InnerStatus[] arrayOfInnerStatus = new InnerStatus[5];
    arrayOfInnerStatus[0] = INITIAL;
    arrayOfInnerStatus[1] = OPENED;
    arrayOfInnerStatus[2] = CLOSED;
    arrayOfInnerStatus[3] = MOVING;
    arrayOfInnerStatus[4] = SCROLLING;
    $VALUES = arrayOfInnerStatus;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.ScrollDownLayout.InnerStatus
 * JD-Core Version:    0.6.0
 */