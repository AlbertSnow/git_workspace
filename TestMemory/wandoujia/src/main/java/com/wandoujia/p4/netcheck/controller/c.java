package com.wandoujia.p4.netcheck.controller;

import com.wandoujia.p4.netcheck.model.Configs.Publics;
import com.wandoujia.p4.netcheck.model.Configs.TestDomain;
import com.wandoujia.p4.netcheck.model.NetCheckInfo;

final class c
  implements Runnable
{
  c(NetCheckController paramNetCheckController, Configs.Publics paramPublics, Configs.TestDomain paramTestDomain)
  {
  }

  public final void run()
  {
    NetCheckController.b(this.c).setPublics(NetCheckController.a(this.a));
    NetCheckController.b(this.c).setTcp(NetCheckController.a(this.b));
    this.c.a(NetCheckController.NetcheckType.TCP);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.controller.c
 * JD-Core Version:    0.6.0
 */