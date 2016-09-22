package com.wandoujia.jupiter;

import com.wandoujia.accessibility.AccessibilityManager;
import com.wandoujia.account.fragment.AccountBaseFragment;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.base.utils.Phoenix2Util;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.paid.a.b;
import com.wandoujia.jupiter.paid.receiver.BatteryBroadcastReceiver;
import com.wandoujia.jupiter.service.l;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.p4.recommand.clean.CleanBroadcastReceiver;
import com.wandoujia.ripple_framework.ReceiverMonitor;

final class e
  implements Runnable
{
  e(JupiterApplication paramJupiterApplication)
  {
  }

  public final void run()
  {
    if (OemUtil.isPaid())
      OemUtil.ensureSntpTimeIsSet();
    AccountBaseFragment.a(com.wandoujia.p4.account.manager.d.a().d());
    v.b().c().a(this.a.getApplicationContext());
    new b();
    JupiterApplication localJupiterApplication = JupiterApplication.d();
    if (Phoenix2Util.isPhoenix2(SystemUtil.getProcessName(localJupiterApplication)))
    {
      BatteryBroadcastReceiver.a(localJupiterApplication);
      CleanBroadcastReceiver.a(localJupiterApplication);
    }
    if (!OemUtil.isOem())
      ((com.wandoujia.nirvana.framework.network.a)com.wandoujia.ripple_framework.i.k().a("api_context")).a().a(new com.wandoujia.jupiter.paid.c.a());
    l.a(GlobalConfig.getAppContext());
    com.wandoujia.ripple_framework.i.k().a("accessibility");
    AccessibilityManager.a(new f());
    JupiterApplication.a(this.a, new com.wandoujia.jupiter.shortcut.a());
    com.wandoujia.jupiter.shortcut.a locala = JupiterApplication.b(this.a);
    ReceiverMonitor.a().a(locala);
    if (Config.c() == 0L)
      Config.b(System.currentTimeMillis());
    android.support.v4.app.d.c(OemUtil.isAllowCreateShortcut());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.e
 * JD-Core Version:    0.6.0
 */