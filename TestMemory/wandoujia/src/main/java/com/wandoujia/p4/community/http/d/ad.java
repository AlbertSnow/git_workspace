package com.wandoujia.p4.community.http.d;

public final class ad extends a
{
  protected final String getUrl()
  {
    if (this.a == null)
      throw new IllegalStateException("Must set group_id");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return String.format("http://group.wandoujia.com/api/v1/groups/%s/members/add", arrayOfObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.ad
 * JD-Core Version:    0.6.0
 */