package com.unipay.unipay_sdk;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.unipay.log.c;

class IIlIlIllIIllIIlI extends BroadcastReceiver
{
  IIlIlIllIIllIIlI(UniPay paramUniPay)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("com.unipay.get_phone"))
    {
      if (UniPay.e(this.a) != null)
        UniPay.e(this.a).cancel();
      if (getResultCode() == -1)
        new Thread(this.a.a).start();
    }
    do
    {
      return;
      c.a(UniPay.a(this.a), "614", "短信上行失败", "true");
      UniPay.f(this.a).cancel();
      ((Activity)UniPay.a(this.a)).runOnUiThread(new a(this));
      return;
      if (!paramIntent.getAction().equals("com.unipay.vac_action"))
        continue;
      if (UniPay.e(this.a) != null)
        UniPay.e(this.a).cancel();
      if (getResultCode() == -1)
        UniPay.h(this.a);
      while (true)
      {
        try
        {
          UniPay.a(this.a).unregisterReceiver(UniPay.i(this.a));
          return;
        }
        catch (Exception localException2)
        {
          return;
        }
        c.a(UniPay.a(this.a), "603", "支付失败", "true");
        UniPay.a(this.a, "支付失败");
      }
    }
    while (!paramIntent.getAction().equals("com.unipay.sms_action"));
    if (UniPay.e(this.a) != null)
      UniPay.e(this.a).cancel();
    if (getResultCode() == -1)
    {
      c.a(UniPay.a(this.a), "601", "支付成功", "true");
      UniPay.b(this.a, "支付成功");
    }
    while (true)
    {
      try
      {
        UniPay.a(this.a).unregisterReceiver(UniPay.i(this.a));
        return;
      }
      catch (Exception localException1)
      {
        return;
      }
      c.a(UniPay.a(this.a), "603", "支付失败", "true");
      UniPay.a(this.a, "支付失败");
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.unipay_sdk.IIlIlIllIIllIIlI
 * JD-Core Version:    0.6.0
 */