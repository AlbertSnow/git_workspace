package com.wandoujia.p4.netcheck.controller;

import com.wandoujia.p4.netcheck.model.NetCheckInfo.Common;

final class d
  implements Runnable
{
  d(NetCheckController paramNetCheckController)
  {
  }

  public final void run()
  {
    this.a.a(NetCheckController.NetcheckType.IP);
    NetCheckController.d(this.a).setDns(NetCheckController.e());
    this.a.a(NetCheckController.NetcheckType.DNS);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.controller.d
 * JD-Core Version:    0.6.0
 */