package com.wandoujia.p4.connection.a;

import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.ripple_framework.ReceiverMonitor.AppActionType;
import com.wandoujia.shared_storage.SharedSettings;
import java.util.Iterator;
import java.util.List;

final class d
  implements Runnable
{
  d(List paramList, ReceiverMonitor.AppActionType paramAppActionType)
  {
  }

  public final void run()
  {
    if (this.a != null)
    {
      GlobalConfig.getAppContext();
      if (SharedSettings.a().a("setting_wifi_auto_connect"))
        break label23;
    }
    while (true)
    {
      return;
      label23: Iterator localIterator = this.a.iterator();
      do
        if (!localIterator.hasNext())
          break;
      while (!"com.wandoujia.phoenix2.usbproxy".equals((String)localIterator.next()));
      for (int i = 1; (i != 0) && ((this.b == ReceiverMonitor.AppActionType.ADDED) || (this.b == ReceiverMonitor.AppActionType.CHANGED) || (this.b == ReceiverMonitor.AppActionType.REPLACED)); i = 0)
      {
        a.g();
        return;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.connection.a.d
 * JD-Core Version:    0.6.0
 */