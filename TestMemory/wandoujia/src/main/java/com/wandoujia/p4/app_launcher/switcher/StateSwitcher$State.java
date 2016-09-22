package com.wandoujia.p4.app_launcher.switcher;

public enum StateSwitcher$State
{
  private long value;

  static
  {
    open = new State("open", 1, 1L);
    close = new State("close", 2, 2L);
    State[] arrayOfState = new State[3];
    arrayOfState[0] = wait;
    arrayOfState[1] = open;
    arrayOfState[2] = close;
    $VALUES = arrayOfState;
  }

  private StateSwitcher$State(long paramLong)
  {
    this.value = paramLong;
  }

  public final long getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.switcher.StateSwitcher.State
 * JD-Core Version:    0.6.0
 */