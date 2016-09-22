package com.wandoujia.p4.subscribe.core;

import android.content.Context;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.AccountParams.Page;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.mvc.BaseModel;
import com.wandoujia.p4.account.manager.AccountUtil;
import com.wandoujia.p4.subscribe.SubscribeConstants.Source;
import com.wandoujia.p4.utils.c;
import java.util.concurrent.CountDownLatch;

public class b
  implements BaseModel
{
  private transient SubscribeConstants.Source source;

  protected boolean doSubscribe()
  {
    return false;
  }

  protected boolean doUnsubscribe()
  {
    return false;
  }

  protected Context getContext()
  {
    return JupiterApplication.e();
  }

  public String getId()
  {
    return null;
  }

  public SubscribeConstants.Source getSource()
  {
    return this.source;
  }

  public String getType()
  {
    return "SUBSCRIBE";
  }

  public boolean hasSubscribed()
  {
    return false;
  }

  protected void promptSubscribeResult(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      if (paramBoolean2)
      {
        c.a(getContext(), 2131625462, p.b);
        return;
      }
      c.a(getContext(), 2131625461, p.b);
      return;
    }
    if (paramBoolean2)
    {
      c.a(getContext(), 2131625539, p.b);
      return;
    }
    c.a(getContext(), 2131625537, p.b);
  }

  public void setSource(SubscribeConstants.Source paramSource)
  {
    this.source = paramSource;
  }

  public void setSubscribeStatus(boolean paramBoolean)
  {
  }

  public boolean subscribe()
  {
    CountDownLatch localCountDownLatch;
    if (!com.wandoujia.account.a.z())
    {
      localCountDownLatch = new CountDownLatch(1);
      AccountParams localAccountParams = new AccountParams("subscribe", 0);
      localAccountParams.a(AccountParams.Page.LOG_IN);
      AccountUtil.a(JupiterApplication.e(), localAccountParams, new a(localCountDownLatch));
    }
    try
    {
      localCountDownLatch.await();
      label52: int i;
      if ((com.wandoujia.account.a.z()) && (doSubscribe()))
      {
        i = 1;
        if (i == 0)
          break label93;
        setSubscribeStatus(true);
        promptSubscribeResult(true, true);
      }
      label93: 
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
    catch (InterruptedException localInterruptedException)
    {
      break label52;
    }
  }

  public boolean unsubscribe()
  {
    boolean bool = doUnsubscribe();
    if (bool)
    {
      setSubscribeStatus(false);
      promptSubscribeResult(false, true);
      return bool;
    }
    promptSubscribeResult(false, false);
    return bool;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.core.b
 * JD-Core Version:    0.6.0
 */