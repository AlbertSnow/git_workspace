package com.wandoujia.jupiter.update;

import android.content.Intent;
import android.os.Message;
import android.support.v4.app.b;
import android.support.v4.app.d;
import com.wandoujia.base.utils.DateUtil;
import com.wandoujia.update.LocalUpdateService;
import com.wandoujia.update.RemoteUpdateService;
import com.wandoujia.update.protocol.UpdateInfo;
import com.wandoujia.update.toolkit.g;

public class UpdateService extends LocalUpdateService
{
  protected final void a(Message paramMessage)
  {
    int i = 1;
    int j;
    int k;
    if ((paramMessage.what == 4) && (a() == null))
    {
      j = o.a[b().getPriority().ordinal()];
      k = 0;
    }
    switch (j)
    {
    case 1:
    default:
      if (k != 0)
      {
        Intent localIntent1 = d.a(getApplicationContext(), RemoteUpdateService.class, c());
        g.a(getApplicationContext(), localIntent1, b());
        Intent localIntent2 = new Intent(getApplicationContext(), RemoteUpdateService.class);
        localIntent2.setAction("com.wandoujia.update.toolkit.notification");
        startService(localIntent2);
        b.k("notification_show_version", b().getVersion());
        b.a("notification_show_date", System.currentTimeMillis());
      }
      super.a(paramMessage);
      return;
    case 2:
      if (!b.P("notification_show_version").equals(b().getVersion()));
      while (true)
      {
        k = i;
        break;
        i = 0;
      }
    case 3:
    case 4:
    }
    int m;
    if (!b.P("notification_show_version").equals(b().getVersion()))
    {
      m = i;
      label207: if (Math.abs(System.currentTimeMillis() - b.Q("notification_show_date")) < DateUtil.DAY)
        break label241;
    }
    while (true)
    {
      k = m | i;
      break;
      m = 0;
      break label207;
      label241: i = 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.update.UpdateService
 * JD-Core Version:    0.6.0
 */