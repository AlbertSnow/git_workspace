package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum FlingEvent$FlingDirection
  implements ProtoEnum
{
  private final int value;

  static
  {
    DOWN = new FlingDirection("DOWN", 1, 1);
    LEFT = new FlingDirection("LEFT", 2, 2);
    RIGHT = new FlingDirection("RIGHT", 3, 3);
    FlingDirection[] arrayOfFlingDirection = new FlingDirection[4];
    arrayOfFlingDirection[0] = UP;
    arrayOfFlingDirection[1] = DOWN;
    arrayOfFlingDirection[2] = LEFT;
    arrayOfFlingDirection[3] = RIGHT;
    $VALUES = arrayOfFlingDirection;
  }

  private FlingEvent$FlingDirection(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.FlingEvent.FlingDirection
 * JD-Core Version:    0.6.0
 */