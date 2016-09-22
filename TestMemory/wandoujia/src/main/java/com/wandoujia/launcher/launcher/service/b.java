package com.wandoujia.launcher.launcher.service;

import android.content.Intent;

final class b
  implements Runnable
{
  b(a parama, boolean paramBoolean)
  {
  }

  public final void run()
  {
    if (this.a)
      this.b.a.sendBroadcast(new Intent("launcher.intent.action.SHORTCUT_CREATED"));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.service.b
 * JD-Core Version:    0.6.0
 */