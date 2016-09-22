package com.wandoujia.p4.app_launcher.clean.notification;

import android.content.Context;
import android.widget.Toast;
import com.wandoujia.base.config.GlobalConfig;

final class c
  implements Runnable
{
  c(long paramLong1, long paramLong2, int paramInt)
  {
  }

  public final void run()
  {
    Context localContext = GlobalConfig.getAppContext();
    String str = GlobalConfig.getAppContext().getString(2131624350);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = String.valueOf(this.a - this.b);
    arrayOfObject[1] = String.valueOf(this.c);
    Toast.makeText(localContext, String.format(str, arrayOfObject), 0).show();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.clean.notification.c
 * JD-Core Version:    0.6.0
 */