package com.wandoujia.p4.community.http.d;

import com.wandoujia.p4.http.request.h;

public final class u extends h
{
  private String a;

  public u()
  {
    setAttachDefaultCookie(true);
  }

  public final u a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  protected final String getUrl()
  {
    if (this.a == null)
      throw new IllegalStateException("must set a uid");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return String.format("http://group.wandoujia.com/api/v1/users/%s/stats", arrayOfObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.u
 * JD-Core Version:    0.6.0
 */