package com.wandoujia.p4.community.http.d;

import android.text.TextUtils;

public final class ac extends a
{
  protected final String getUrl()
  {
    if (TextUtils.isEmpty(this.a))
      throw new IllegalStateException("must set id");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return String.format("http://group.wandoujia.com/api/v1/groups/%s/ballot", arrayOfObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.ac
 * JD-Core Version:    0.6.0
 */