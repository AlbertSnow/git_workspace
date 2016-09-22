package com.wandoujia.account.dto;

public enum RegisterSource
{
  private Platform platform;

  static
  {
    SINA = new RegisterSource("SINA", 2, Platform.SINA);
    QQ = new RegisterSource("QQ", 3, Platform.QQ);
    RENREN = new RegisterSource("RENREN", 4, Platform.RENREN);
    ASUS = new RegisterSource("ASUS", 5, Platform.ASUS);
    WECHAT = new RegisterSource("WECHAT", 6, Platform.WECHAT);
    UNKONWN = new RegisterSource("UNKONWN", 7, Platform.UNKONWN);
    RegisterSource[] arrayOfRegisterSource = new RegisterSource[8];
    arrayOfRegisterSource[0] = EMAIL;
    arrayOfRegisterSource[1] = TELEPHONE;
    arrayOfRegisterSource[2] = SINA;
    arrayOfRegisterSource[3] = QQ;
    arrayOfRegisterSource[4] = RENREN;
    arrayOfRegisterSource[5] = ASUS;
    arrayOfRegisterSource[6] = WECHAT;
    arrayOfRegisterSource[7] = UNKONWN;
    $VALUES = arrayOfRegisterSource;
  }

  private RegisterSource(Platform paramPlatform)
  {
    this.platform = paramPlatform;
  }

  @com.fasterxml.jackson.annotation.JsonCreator
  @org.codehaus.jackson.annotate.JsonCreator
  public static RegisterSource forValue(String paramString)
  {
    if (paramString != null)
      for (RegisterSource localRegisterSource : values())
        if (paramString.equalsIgnoreCase(localRegisterSource.name()))
          return localRegisterSource;
    return UNKONWN;
  }

  public final Platform getPlatform()
  {
    return this.platform;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.dto.RegisterSource
 * JD-Core Version:    0.6.0
 */