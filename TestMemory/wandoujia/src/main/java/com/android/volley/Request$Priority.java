package com.android.volley;

public enum Request$Priority
{
  static
  {
    HIGH = new Priority("HIGH", 2);
    IMMEDIATE = new Priority("IMMEDIATE", 3);
    Priority[] arrayOfPriority = new Priority[4];
    arrayOfPriority[0] = LOW;
    arrayOfPriority[1] = NORMAL;
    arrayOfPriority[2] = HIGH;
    arrayOfPriority[3] = IMMEDIATE;
    $VALUES = arrayOfPriority;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.Request.Priority
 * JD-Core Version:    0.6.0
 */