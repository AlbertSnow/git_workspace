package com.sina.weibo.sdk.net;

public enum NetStateManager$NetState
{
  static
  {
    NOWAY = new NetState("NOWAY", 2);
    NetState[] arrayOfNetState = new NetState[3];
    arrayOfNetState[0] = Mobile;
    arrayOfNetState[1] = WIFI;
    arrayOfNetState[2] = NOWAY;
    ENUM$VALUES = arrayOfNetState;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.net.NetStateManager.NetState
 * JD-Core Version:    0.6.0
 */