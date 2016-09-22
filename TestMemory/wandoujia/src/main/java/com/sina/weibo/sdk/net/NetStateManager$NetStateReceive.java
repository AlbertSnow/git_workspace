package com.sina.weibo.sdk.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

public class NetStateManager$NetStateReceive extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    NetStateManager.a(paramContext);
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramIntent.getAction()))
    {
      WifiManager localWifiManager = (WifiManager)paramContext.getSystemService("wifi");
      WifiInfo localWifiInfo = localWifiManager.getConnectionInfo();
      if ((!localWifiManager.isWifiEnabled()) || (-1 == localWifiInfo.getNetworkId()))
        NetStateManager.a = NetStateManager.NetState.Mobile;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.net.NetStateManager.NetStateReceive
 * JD-Core Version:    0.6.0
 */