package com.unionpay.mobile.tsm.connect;

import android.os.IInterface;

public abstract interface IRemoteApdu extends IInterface
{
  public abstract void closeChannel(int paramInt);

  public abstract void init();

  public abstract void registerCallback(IInitCallback paramIInitCallback);

  public abstract String writeApdu(String paramString, int paramInt);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mobile.tsm.connect.IRemoteApdu
 * JD-Core Version:    0.6.0
 */