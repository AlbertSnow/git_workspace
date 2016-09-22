package com.wandoujia.p4.gift.http.c;

import com.wandoujia.account.a;
import com.wandoujia.p4.http.request.h;

public final class b extends h
{
  private String a = "http://adslist.wandoujia.com/gift/query.json";

  protected final String getUrl()
  {
    return this.a + "?uid=" + a.t() + "&wdj_auth=" + a.i();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.http.c.b
 * JD-Core Version:    0.6.0
 */