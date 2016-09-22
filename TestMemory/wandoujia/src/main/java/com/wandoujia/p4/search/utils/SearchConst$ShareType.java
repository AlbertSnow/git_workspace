package com.wandoujia.p4.search.utils;

public enum SearchConst$ShareType
{
  private String packageName;

  static
  {
    ShareType[] arrayOfShareType = new ShareType[3];
    arrayOfShareType[0] = SINA_WEIBO;
    arrayOfShareType[1] = WECHAT;
    arrayOfShareType[2] = WECHAT_TIMELINE;
    $VALUES = arrayOfShareType;
  }

  private SearchConst$ShareType(String paramString)
  {
    this.packageName = paramString;
  }

  public final String getPackageName()
  {
    return this.packageName;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.search.utils.SearchConst.ShareType
 * JD-Core Version:    0.6.0
 */