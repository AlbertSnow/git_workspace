package com.wandoujia.account.constants;

public enum AccountParamConstants$FinishType
{
  static
  {
    EMAIL_REGISTER = new FinishType("EMAIL_REGISTER", 3);
    QQ_LOGIN = new FinishType("QQ_LOGIN", 4);
    SINA_LOGIN = new FinishType("SINA_LOGIN", 5);
    RENREN_LOGIN = new FinishType("RENREN_LOGIN", 6);
    WECHAT_LOGIN = new FinishType("WECHAT_LOGIN", 7);
    CANCEL = new FinishType("CANCEL", 8);
    RESET_PASSWORD = new FinishType("RESET_PASSWORD", 9);
    FinishType[] arrayOfFinishType = new FinishType[10];
    arrayOfFinishType[0] = AUTO_LOGIN;
    arrayOfFinishType[1] = LOGIN;
    arrayOfFinishType[2] = TEL_REGISTER;
    arrayOfFinishType[3] = EMAIL_REGISTER;
    arrayOfFinishType[4] = QQ_LOGIN;
    arrayOfFinishType[5] = SINA_LOGIN;
    arrayOfFinishType[6] = RENREN_LOGIN;
    arrayOfFinishType[7] = WECHAT_LOGIN;
    arrayOfFinishType[8] = CANCEL;
    arrayOfFinishType[9] = RESET_PASSWORD;
    $VALUES = arrayOfFinishType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.constants.AccountParamConstants.FinishType
 * JD-Core Version:    0.6.0
 */