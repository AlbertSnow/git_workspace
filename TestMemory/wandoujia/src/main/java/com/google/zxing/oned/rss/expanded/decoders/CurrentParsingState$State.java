package com.google.zxing.oned.rss.expanded.decoders;

 enum CurrentParsingState$State
{
  static
  {
    ALPHA = new State("ALPHA", 1);
    ISO_IEC_646 = new State("ISO_IEC_646", 2);
    State[] arrayOfState = new State[3];
    arrayOfState[0] = NUMERIC;
    arrayOfState[1] = ALPHA;
    arrayOfState[2] = ISO_IEC_646;
    $VALUES = arrayOfState;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState.State
 * JD-Core Version:    0.6.0
 */