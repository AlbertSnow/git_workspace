package com.wandoujia.p4.netcheck.controller;

import com.wandoujia.p4.netcheck.model.NetCheckInfo;
import java.util.Iterator;
import java.util.List;

final class a
  implements Runnable
{
  a(NetCheckController paramNetCheckController, List paramList)
  {
  }

  public final void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      List localList = (List)localIterator.next();
      NetCheckController.a(this.b).add(NetCheckController.c((String)localList.get(0)));
    }
    NetCheckController.b(this.b).setDownload(NetCheckController.a(this.b));
    if (NetCheckController.a(this.b).size() == this.a.size())
    {
      this.b.a(NetCheckController.NetcheckType.DOWN);
      return;
    }
    this.b.a(NetCheckController.NetcheckType.FAILED);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.controller.a
 * JD-Core Version:    0.6.0
 */