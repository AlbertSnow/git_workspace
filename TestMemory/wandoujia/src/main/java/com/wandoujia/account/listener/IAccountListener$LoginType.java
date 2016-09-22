package com.wandoujia.account.listener;

public enum IAccountListener$LoginType
{
  static
  {
    AUTO_LOGIN = new LoginType("AUTO_LOGIN", 1);
    LoginType[] arrayOfLoginType = new LoginType[2];
    arrayOfLoginType[0] = LOGIN;
    arrayOfLoginType[1] = AUTO_LOGIN;
    $VALUES = arrayOfLoginType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.listener.IAccountListener.LoginType
 * JD-Core Version:    0.6.0
 */