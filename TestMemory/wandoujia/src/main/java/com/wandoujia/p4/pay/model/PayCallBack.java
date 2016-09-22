package com.wandoujia.p4.pay.model;

public abstract interface PayCallBack
{
  public static final String ERROR_MESSAGE_NETWORK_ERROR = "网络异常, 请稍后重试。";
  public static final int TYPE_EXCEPTION = 1;
  public static final int TYPE_TOAST;

  public abstract void onError(int paramInt, String paramString);

  public abstract void onPending(String paramString);

  public abstract void onProcessing();

  public abstract void onSuccess();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.PayCallBack
 * JD-Core Version:    0.6.0
 */