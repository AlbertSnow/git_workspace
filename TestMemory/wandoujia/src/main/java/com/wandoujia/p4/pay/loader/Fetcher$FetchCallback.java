package com.wandoujia.p4.pay.loader;

public abstract interface Fetcher$FetchCallback
{
  public abstract String doFetch(int paramInt1, int paramInt2);

  public abstract int onFetched(String paramString, int paramInt1, int paramInt2);

  public abstract void onPostFetch(String paramString, int paramInt1, int paramInt2);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.loader.Fetcher.FetchCallback
 * JD-Core Version:    0.6.0
 */