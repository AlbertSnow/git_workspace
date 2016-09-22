package com.wandoujia.gamepacket;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.wandoujia.base.utils.NetworkUtil;

class GamePacketInstaller$1 extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (("android.net.conn.CONNECTIVITY_CHANGE".equals(paramIntent.getAction())) && (NetworkUtil.getNetworkType() == 1))
      GamePacketInstaller.a(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.GamePacketInstaller.1
 * JD-Core Version:    0.6.0
 */