package com.sina.weibo.sdk.api.share;

import com.sina.weibo.sdk.api.CmdObject;
import com.sina.weibo.sdk.g;

public class h
{
  static
  {
    h.class.getName();
  }

  public static boolean a(g paramg, com.sina.weibo.sdk.api.h paramh)
  {
    if ((paramg == null) || (!paramg.c()));
    do
    {
      return false;
      new StringBuilder("WeiboMultiMessage WeiboInfo package : ").append(paramg.a());
      new StringBuilder("WeiboMultiMessage WeiboInfo supportApi : ").append(paramg.b());
    }
    while (paramg.b() < 10351);
    if ((paramg.b() < 10352) && (paramh.c != null) && ((paramh.c instanceof CmdObject)))
      paramh.c = null;
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.api.share.h
 * JD-Core Version:    0.6.0
 */