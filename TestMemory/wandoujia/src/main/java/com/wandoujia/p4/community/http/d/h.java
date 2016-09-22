package com.wandoujia.p4.community.http.d;

import android.text.TextUtils;

public final class h extends com.wandoujia.p4.http.request.h
{
  private String a;

  public h(String paramString)
  {
    this.a = paramString;
    setAttachDefaultCookie(true);
  }

  protected final String getUrl()
  {
    if (TextUtils.isEmpty(this.a))
      throw new IllegalArgumentException("Please set group id first");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return String.format("http://group.wandoujia.com/api/v1//groups/%s", arrayOfObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.h
 * JD-Core Version:    0.6.0
 */