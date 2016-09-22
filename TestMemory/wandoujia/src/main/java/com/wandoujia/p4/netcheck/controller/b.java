package com.wandoujia.p4.netcheck.controller;

import com.wandoujia.p4.netcheck.model.NetCheckInfo;
import java.util.List;

final class b
  implements Runnable
{
  b(NetCheckController paramNetCheckController, String paramString, List paramList)
  {
  }

  public final void run()
  {
    NetCheckController.c(this.c).add(NetCheckController.d(this.a));
    if (NetCheckController.c(this.c).size() == this.b.size())
    {
      NetCheckController.b(this.c).setPing(NetCheckController.c(this.c));
      this.c.a(NetCheckController.NetcheckType.PING);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.controller.b
 * JD-Core Version:    0.6.0
 */