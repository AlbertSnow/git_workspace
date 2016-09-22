package com.wandoujia.p4.pay.paymethod.alipay;

import android.app.Activity;
import android.content.Intent;
import com.alipay.android.mini.window.sdk.MiniLaucherActivity;

public class NativeAliPay
{
  private static NativeAliPay instance;
  private Activity context;

  private NativeAliPay(Activity paramActivity)
  {
    this.context = paramActivity;
    updateReceiver(paramActivity, null);
  }

  public static NativeAliPay getInstance(Activity paramActivity)
  {
    monitorenter;
    try
    {
      if (instance == null)
        instance = new NativeAliPay(paramActivity);
      while (true)
      {
        NativeAliPay localNativeAliPay = instance;
        return localNativeAliPay;
        instance.setActivity(paramActivity);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private void setActivity(Activity paramActivity)
  {
    Activity localActivity = this.context;
    this.context = paramActivity;
    updateReceiver(paramActivity, localActivity);
  }

  private void updateReceiver(Activity paramActivity1, Activity paramActivity2)
  {
  }

  public void pay(String paramString, int paramInt)
  {
    Intent localIntent = new Intent(this.context.getApplicationContext(), MiniLaucherActivity.class);
    localIntent.putExtra("order_info", paramString);
    this.context.startActivityForResult(localIntent, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.paymethod.alipay.NativeAliPay
 * JD-Core Version:    0.6.0
 */