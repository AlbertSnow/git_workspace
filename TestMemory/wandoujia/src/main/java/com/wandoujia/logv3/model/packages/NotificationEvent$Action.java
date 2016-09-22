package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum NotificationEvent$Action
  implements ProtoEnum
{
  private final int value;

  static
  {
    CLICK = new Action("CLICK", 1, 1);
    DISMISS = new Action("DISMISS", 2, 2);
    EXPAND = new Action("EXPAND", 3, 3);
    Action[] arrayOfAction = new Action[4];
    arrayOfAction[0] = SHOW;
    arrayOfAction[1] = CLICK;
    arrayOfAction[2] = DISMISS;
    arrayOfAction[3] = EXPAND;
    $VALUES = arrayOfAction;
  }

  private NotificationEvent$Action(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.NotificationEvent.Action
 * JD-Core Version:    0.6.0
 */