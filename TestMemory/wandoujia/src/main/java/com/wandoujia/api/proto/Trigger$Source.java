package com.wandoujia.api.proto;

import com.squareup.wire.ProtoEnum;

public enum Trigger$Source
  implements ProtoEnum
{
  private final int value;

  static
  {
    APP_CHANGE = new Source("APP_CHANGE", 2, 2);
    NOTIFICATION = new Source("NOTIFICATION", 3, 3);
    LOCATION = new Source("LOCATION", 4, 4);
    Source[] arrayOfSource = new Source[5];
    arrayOfSource[0] = SMS;
    arrayOfSource[1] = TIMER;
    arrayOfSource[2] = APP_CHANGE;
    arrayOfSource[3] = NOTIFICATION;
    arrayOfSource[4] = LOCATION;
    $VALUES = arrayOfSource;
  }

  private Trigger$Source(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Trigger.Source
 * JD-Core Version:    0.6.0
 */