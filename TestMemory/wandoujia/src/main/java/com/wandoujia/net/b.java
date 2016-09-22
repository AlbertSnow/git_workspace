package com.wandoujia.net;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedList;

final class b extends Handler
{
  b(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    Object[] arrayOfObject = (Object[])paramMessage.obj;
    HttpTransaction localHttpTransaction1 = a.a(this.a, arrayOfObject[0]);
    long l;
    if (localHttpTransaction1 == null)
      if ((arrayOfObject[0] instanceof af))
        l = ((af)arrayOfObject[0]).d;
    while (true)
    {
      if (a.a(this.a, l) != null)
        new StringBuilder("error msg: ").append(paramMessage.what);
      return;
      if ((arrayOfObject[0] instanceof r))
      {
        l = ((r)arrayOfObject[0]).d;
        continue;
        switch (paramMessage.what)
        {
        default:
          throw new RuntimeException("unknown message: " + paramMessage.what);
        case 1:
          localHttpTransaction1.a.a.a((String)arrayOfObject[1]);
          return;
        case 2:
          localHttpTransaction1.a.a.b((String)arrayOfObject[1]);
          return;
        case 3:
          localHttpTransaction1.a.a.a();
          return;
        case 4:
          localHttpTransaction1.a.a.b();
          localHttpTransaction1.a.a(((Long)arrayOfObject[1]).longValue());
          localHttpTransaction1.a.b(((Long)arrayOfObject[2]).longValue());
          a.a(this.a).a(localHttpTransaction1.d);
          return;
        case 5:
          localHttpTransaction1.a.a(((Long)arrayOfObject[1]).longValue());
          a.a(this.a).b(localHttpTransaction1.d);
          return;
        case 6:
          a.a(this.a).d(localHttpTransaction1.d);
          a.b(this.a).remove(localHttpTransaction1);
          return;
        case 7:
          localHttpTransaction1.a.a.c();
          a.a(this.a).c(localHttpTransaction1.d);
          a.b(this.a).remove(localHttpTransaction1);
          return;
        case 8:
        }
        HttpTransaction localHttpTransaction2 = localHttpTransaction1.g();
        a.b(this.a).remove(localHttpTransaction1);
        a.a(this.a, localHttpTransaction2);
        return;
      }
      l = 0L;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.b
 * JD-Core Version:    0.6.0
 */