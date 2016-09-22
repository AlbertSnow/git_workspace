package com.wandoujia.push2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.wandoujia.base.log.Log;

class PushService$2 extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Bundle localBundle = getResultExtras(true);
    boolean bool = localBundle.getBoolean("push_center", false);
    if (!bool)
    {
      g.a().a(true);
      PushService.a(this.a, localBundle.getLong("last_push_id", 0L));
      PushService.c(this.a);
    }
    Log.d(PushService.a(), "has push server: " + bool, new Object[0]);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.PushService.2
 * JD-Core Version:    0.6.0
 */