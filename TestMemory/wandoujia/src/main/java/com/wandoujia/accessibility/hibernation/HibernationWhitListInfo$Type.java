package com.wandoujia.accessibility.hibernation;

 enum HibernationWhitListInfo$Type
{
  static
  {
    SYSTEM = new Type("SYSTEM", 1);
    Type[] arrayOfType = new Type[2];
    arrayOfType[0] = USER;
    arrayOfType[1] = SYSTEM;
    $VALUES = arrayOfType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.HibernationWhitListInfo.Type
 * JD-Core Version:    0.6.0
 */