package com.wandoujia.p4.community.http.d;

import android.text.TextUtils;
import com.wandoujia.p4.http.request.h;

public final class q extends h
{
  private String a;

  public q(String paramString)
  {
    this.a = paramString;
    setAttachDefaultCookie(true);
  }

  protected final String getUrl()
  {
    if (TextUtils.isEmpty(this.a))
      throw new IllegalArgumentException("can't set topicId to null");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return String.format("http://group.wandoujia.com/api/v1//topics/%s", arrayOfObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.q
 * JD-Core Version:    0.6.0
 */