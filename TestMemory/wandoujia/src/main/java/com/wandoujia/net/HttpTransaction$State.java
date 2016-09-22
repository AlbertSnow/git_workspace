package com.wandoujia.net;

 enum HttpTransaction$State
{
  static
  {
    READ_BODY = new State("READ_BODY", 1);
    State[] arrayOfState = new State[2];
    arrayOfState[0] = READ_HEADER;
    arrayOfState[1] = READ_BODY;
    $VALUES = arrayOfState;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.HttpTransaction.State
 * JD-Core Version:    0.6.0
 */