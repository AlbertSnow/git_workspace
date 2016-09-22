package com.wandoujia.plugin.qr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class InactivityTimer$PowerStatusReceiver extends BroadcastReceiver
{
  private InactivityTimer$PowerStatusReceiver(InactivityTimer paramInactivityTimer)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (("android.intent.action.BATTERY_CHANGED".equals(paramIntent.getAction())) && (paramIntent.getIntExtra("plugged", -1) > 0))
      InactivityTimer.a(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.plugin.qr.InactivityTimer.PowerStatusReceiver
 * JD-Core Version:    0.6.0
 */