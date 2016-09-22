package com.sina.weibo.sdk;

import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.concurrent.CountDownLatch;

final class c
  implements Runnable
{
  c(b paramb, String paramString)
  {
  }

  public final void run()
  {
    Pair localPair = b.b(b.a(this.a), this.b);
    try
    {
      b.c(this.a).await();
      String str1;
      String str2;
      if ((b.d(this.a) != null) && (b.d(this.a).a()))
      {
        str1 = e.a(b.d(this.a));
        str2 = e.b(b.d(this.a));
        if ((localPair == null) || (localPair.second == null) || (((Integer)localPair.first).intValue() < e.c(b.d(this.a))))
          break label136;
        b.a(b.a(this.a), str2, ((File)localPair.second).getAbsolutePath());
      }
      while (true)
      {
        return;
        label136: if ((!android.support.v4.app.b.f(b.a(this.a))) || (TextUtils.isEmpty(str1)))
          continue;
        b.b(b.a(this.a), str2, str1);
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      return;
    }
    finally
    {
      b.b(this.a);
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.c
 * JD-Core Version:    0.6.0
 */