package com.sina.weibo.sdk.a;

import android.text.TextUtils;
import com.sina.weibo.sdk.exception.WeiboException;
import java.util.concurrent.locks.ReentrantLock;

final class c
  implements Runnable
{
  c(a parama)
  {
  }

  public final void run()
  {
    if (!a.b(this.a).tryLock())
      return;
    if (!TextUtils.isEmpty(this.a.a()))
    {
      a.b(this.a).unlock();
      return;
    }
    int i = 0;
    while (true)
    {
      if (i >= 3);
      while (true)
      {
        a.b(this.a).unlock();
        return;
        try
        {
          String str = a.c(this.a);
          d.a(str);
          a.a(this.a, str);
        }
        catch (WeiboException localWeiboException)
        {
          new StringBuilder("AidTaskInit WeiboException Msg : ").append(localWeiboException.getMessage());
          i++;
        }
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.a.c
 * JD-Core Version:    0.6.0
 */