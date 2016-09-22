package com.wandoujia.plugin.qr;

 enum CaptureActivityHandler$State
{
  static
  {
    DONE = new State("DONE", 2);
    State[] arrayOfState = new State[3];
    arrayOfState[0] = PREVIEW;
    arrayOfState[1] = SUCCESS;
    arrayOfState[2] = DONE;
    $VALUES = arrayOfState;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.plugin.qr.CaptureActivityHandler.State
 * JD-Core Version:    0.6.0
 */