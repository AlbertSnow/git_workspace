package com.wandoujia.jupiter.anim;

public enum ChangeAnimType
{
  static
  {
    FLIP_LEFT = new ChangeAnimType("FLIP_LEFT", 1);
    NORMAL = new ChangeAnimType("NORMAL", 2);
    ChangeAnimType[] arrayOfChangeAnimType = new ChangeAnimType[3];
    arrayOfChangeAnimType[0] = FLIP_RIGHT;
    arrayOfChangeAnimType[1] = FLIP_LEFT;
    arrayOfChangeAnimType[2] = NORMAL;
    $VALUES = arrayOfChangeAnimType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.anim.ChangeAnimType
 * JD-Core Version:    0.6.0
 */