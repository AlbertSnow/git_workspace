package com.wandoujia.update.toolkit;

import android.content.Intent;
import android.os.Message;
import android.support.v4.app.d;
import com.wandoujia.update.LocalUpdateService;
import com.wandoujia.update.RemoteUpdateService;

public class UpdateService extends LocalUpdateService
{
  protected final void a(Message paramMessage)
  {
    if ((paramMessage.what == 4) && (a() == null))
    {
      Intent localIntent = d.a(getApplicationContext(), RemoteUpdateService.class, c());
      g.a(getApplicationContext(), localIntent, b(), false);
    }
    super.a(paramMessage);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.update.toolkit.UpdateService
 * JD-Core Version:    0.6.0
 */