package com.wandoujia.push2;

import com.wandoujia.push2.protocol.Message;

final class h
  implements Runnable
{
  h(g paramg, l paraml, Message paramMessage)
  {
  }

  public final void run()
  {
    if (this.a.a(this.b.getBody()))
    {
      g.a(this.c).a(this.b.getId());
      return;
    }
    g.a(this.c).a(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.h
 * JD-Core Version:    0.6.0
 */