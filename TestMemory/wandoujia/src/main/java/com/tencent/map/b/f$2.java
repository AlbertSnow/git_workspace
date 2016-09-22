package com.tencent.map.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class f$2 extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramIntent.getBooleanExtra("noConnectivity", false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.map.b.f.2
 * JD-Core Version:    0.6.0
 */