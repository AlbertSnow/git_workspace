package com.wandoujia.p4.pay.model;

public abstract interface CallBack<T>
{
  public static final int TYPE_EXCEPTION = 1;
  public static final int TYPE_NEWWORK = 2;
  public static final int TYPE_TOAST;

  public abstract void onError(int paramInt, String paramString);

  public abstract void onSuccess(T paramT);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.CallBack
 * JD-Core Version:    0.6.0
 */