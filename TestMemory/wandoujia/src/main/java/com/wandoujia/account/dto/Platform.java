package com.wandoujia.account.dto;

public enum Platform
{
  private final String platform;
  private boolean thirdParty;

  static
  {
    SINA = new Platform("SINA", 1, "sina", true);
    QQ = new Platform("QQ", 2, "qq", true);
    RENREN = new Platform("RENREN", 3, "renren", true);
    DOUBAN = new Platform("DOUBAN", 4, "douban", true);
    GOOGLE = new Platform("GOOGLE", 5, "google", true);
    FACEBOOK = new Platform("FACEBOOK", 6, "facebook", true);
    TWITTER = new Platform("TWITTER", 7, "twitter", true);
    ASUS = new Platform("ASUS", 8, "asus", true);
    WECHAT = new Platform("WECHAT", 9, "wechat", true);
    UNKONWN = new Platform("UNKONWN", 10, "unkonwn", false);
    Platform[] arrayOfPlatform = new Platform[11];
    arrayOfPlatform[0] = WANDOU;
    arrayOfPlatform[1] = SINA;
    arrayOfPlatform[2] = QQ;
    arrayOfPlatform[3] = RENREN;
    arrayOfPlatform[4] = DOUBAN;
    arrayOfPlatform[5] = GOOGLE;
    arrayOfPlatform[6] = FACEBOOK;
    arrayOfPlatform[7] = TWITTER;
    arrayOfPlatform[8] = ASUS;
    arrayOfPlatform[9] = WECHAT;
    arrayOfPlatform[10] = UNKONWN;
    $VALUES = arrayOfPlatform;
  }

  private Platform(String paramString, boolean paramBoolean)
  {
    this.platform = paramString;
    this.thirdParty = paramBoolean;
  }

  @com.fasterxml.jackson.annotation.JsonCreator
  @org.codehaus.jackson.annotate.JsonCreator
  public static Platform forValue(String paramString)
  {
    if (paramString != null)
      for (Platform localPlatform : values())
        if (paramString.equalsIgnoreCase(localPlatform.name()))
          return localPlatform;
    return UNKONWN;
  }

  public final String getPlatform()
  {
    return this.platform;
  }

  public final boolean isThirdParty()
  {
    return this.thirdParty;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.dto.Platform
 * JD-Core Version:    0.6.0
 */