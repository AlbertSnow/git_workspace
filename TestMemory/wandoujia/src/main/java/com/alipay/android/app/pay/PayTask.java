package com.alipay.android.app.pay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.support.v4.app.b;
import com.alipay.android.app.MspService;

public final class PayTask extends AsyncTask
{
  private Activity a;
  private PayTask.OnPayListener b;
  private Object c = new Object();
  private IAlixPay d = null;
  private boolean e = false;
  private IAlixPayCallback f = new e(this);
  private ServiceConnection g = new f(this);

  public PayTask(Activity paramActivity, PayTask.OnPayListener paramOnPayListener)
  {
    this.a = paramActivity;
    this.b = paramOnPayListener;
  }

  private d a(String[] paramArrayOfString)
  {
    Object localObject1 = null;
    String str1 = paramArrayOfString[0];
    if (this.e)
      return null;
    this.e = true;
    Context localContext = this.a.getApplicationContext();
    if (this.d == null)
      localContext.bindService(new Intent(localContext, MspService.class), this.g, 1);
    try
    {
      synchronized (this.c)
      {
        if (this.d == null)
          this.c.wait();
        IAlixPayCallback localIAlixPayCallback = this.f;
        localObject1 = null;
        if (localIAlixPayCallback != null)
          this.d.registerCallback(this.f);
        boolean bool = str1.startsWith("http");
        localObject1 = null;
        if (bool)
        {
          localObject1 = this.d.payWithURL(str1);
          b.d();
          if (this.f != null)
            this.d.unregisterCallback(this.f);
          localContext.unbindService(this.g);
          return new d((String)localObject1);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        b.b(localException);
        localContext.unbindService(this.g);
        continue;
        String str2 = this.d.pay(str1);
        localObject1 = str2;
      }
    }
    finally
    {
      localContext.unbindService(this.g);
    }
    throw localObject2;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.pay.PayTask
 * JD-Core Version:    0.6.0
 */