package com.unionpay.mobile.tsm.connect;

import android.os.IInterface;

public abstract interface IInitCallback extends IInterface
{
  public abstract void initFailed();

  public abstract void initSucceed();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mobile.tsm.connect.IInitCallback
 * JD-Core Version:    0.6.0
 */