package com.sina.weibo.sdk.a;

import java.io.File;

final class b
  implements Runnable
{
  b(a parama)
  {
  }

  public final void run()
  {
    int i = 0;
    while (true)
    {
      if (i > 0)
        return;
      File localFile = a.a(this.a);
      try
      {
        localFile.delete();
        label20: i++;
      }
      catch (Exception localException)
      {
        break label20;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.a.b
 * JD-Core Version:    0.6.0
 */