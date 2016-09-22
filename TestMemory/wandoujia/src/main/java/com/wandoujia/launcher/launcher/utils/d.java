package com.wandoujia.launcher.launcher.utils;

import android.content.Context;
import android.content.Intent;

final class d
  implements Runnable
{
  d(c paramc, Context paramContext)
  {
  }

  public final void run()
  {
    try
    {
      Intent localIntent = new Intent("launcher.intent.action.CREATE_SHORTCUT");
      localIntent.putExtra("launcher.intent.extra.CREATE_ALWARYS", this.b.a);
      this.a.startService(localIntent);
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.utils.d
 * JD-Core Version:    0.6.0
 */