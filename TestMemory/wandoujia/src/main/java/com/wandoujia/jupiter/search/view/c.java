package com.wandoujia.jupiter.search.view;

import android.os.Handler;
import android.os.Message;

final class c extends Handler
{
  c(a parama, String[] paramArrayOfString)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 0:
    }
    while (true)
    {
      super.handleMessage(paramMessage);
      return;
      if ((this.a == null) || (a.b(this.c) >= this.a.length))
        continue;
      this.c.a(this.a[a.b(this.c)], this.b);
      a.c(this.c);
      a.a(this.c, a.b(this.c) % this.a.length);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.view.c
 * JD-Core Version:    0.6.0
 */