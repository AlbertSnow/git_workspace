package com.wandoujia.p4.http.d;

import com.wandoujia.rpc.http.provider.CookieProvider;

public final class a
  implements CookieProvider
{
  public final String getDefaultCookie()
  {
    return "wdj_auth=" + com.wandoujia.account.a.i();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.d.a
 * JD-Core Version:    0.6.0
 */