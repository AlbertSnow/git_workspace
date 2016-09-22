package com.wandoujia.account.constants;

public enum AccountParamConstants$FragmentType
{
  static
  {
    FORGET_PASSWORD = new FragmentType("FORGET_PASSWORD", 2);
    USER_LEGAL = new FragmentType("USER_LEGAL", 3);
    FragmentType[] arrayOfFragmentType = new FragmentType[4];
    arrayOfFragmentType[0] = LOGIN;
    arrayOfFragmentType[1] = REGISTER;
    arrayOfFragmentType[2] = FORGET_PASSWORD;
    arrayOfFragmentType[3] = USER_LEGAL;
    $VALUES = arrayOfFragmentType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.constants.AccountParamConstants.FragmentType
 * JD-Core Version:    0.6.0
 */