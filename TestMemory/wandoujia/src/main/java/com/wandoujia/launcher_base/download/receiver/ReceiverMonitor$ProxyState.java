package com.wandoujia.launcher_base.download.receiver;

public enum ReceiverMonitor$ProxyState
{
  static
  {
    OFF = new ProxyState("OFF", 1);
    ProxyState[] arrayOfProxyState = new ProxyState[2];
    arrayOfProxyState[0] = ON;
    arrayOfProxyState[1] = OFF;
    $VALUES = arrayOfProxyState;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.download.receiver.ReceiverMonitor.ProxyState
 * JD-Core Version:    0.6.0
 */