package com.wandoujia.jupiter.c;

import android.os.Handler;
import android.os.Looper;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.AccountParams.Page;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.p4.account.manager.AccountUtil;
import java.util.concurrent.CountDownLatch;

public abstract class a extends com.wandoujia.p4.subscribe.core.b
{
  private boolean a()
  {
    CountDownLatch localCountDownLatch = new CountDownLatch(1);
    boolean[] arrayOfBoolean = new boolean[1];
    new Handler(Looper.getMainLooper()).post(new b(this, arrayOfBoolean, localCountDownLatch));
    try
    {
      localCountDownLatch.await();
      int i = arrayOfBoolean[0];
      return i;
    }
    catch (InterruptedException localInterruptedException)
    {
    }
    return false;
  }

  private boolean b()
  {
    if (com.wandoujia.account.a.z())
      return true;
    if (a())
    {
      CountDownLatch localCountDownLatch = new CountDownLatch(1);
      boolean[] arrayOfBoolean = new boolean[1];
      AccountParams localAccountParams = new AccountParams("favorite_subscribe", 0);
      localAccountParams.a(AccountParams.Page.LOG_IN);
      AccountUtil.a(JupiterApplication.e(), localAccountParams, new f(arrayOfBoolean, localCountDownLatch));
      try
      {
        localCountDownLatch.await();
        int i = arrayOfBoolean[0];
        return i;
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    }
    return false;
  }

  protected abstract boolean doSubscribe();

  protected abstract boolean doUnsubscribe();

  public String getType()
  {
    return "FAVORITE";
  }

  public boolean subscribe()
  {
    int i;
    if ((b()) && (com.wandoujia.account.a.z()) && (doSubscribe()))
    {
      i = 1;
      if (i == 0)
        break label44;
      setSubscribeStatus(true);
      promptSubscribeResult(true, true);
    }
    label44: 
    do
    {
      return i;
      i = 0;
      break;
    }
    while (!com.wandoujia.account.a.z());
    promptSubscribeResult(true, false);
    return i;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.c.a
 * JD-Core Version:    0.6.0
 */