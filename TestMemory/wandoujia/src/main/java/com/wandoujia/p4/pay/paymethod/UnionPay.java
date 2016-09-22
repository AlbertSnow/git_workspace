package com.wandoujia.p4.pay.paymethod;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.unionpay.uppay.PayActivityEx;
import com.wandoujia.p4.pay.model.PayCallBack;

public class UnionPay
{
  public void onResult(Intent paramIntent, PayCallBack paramPayCallBack)
  {
    if ((paramIntent != null) && (paramIntent.getExtras() != null))
    {
      String str = paramIntent.getExtras().getString("pay_result");
      if ((str != null) && (str.equalsIgnoreCase("success")))
        paramPayCallBack.onSuccess();
    }
    else
    {
      return;
    }
    paramPayCallBack.onError(0, "支付失败");
  }

  public void pay(Activity paramActivity, String paramString, int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("reqOriginalId", 2);
    localBundle.putString("ex_mode", "00");
    localBundle.putString("tn", paramString);
    localBundle.putString("extra", null);
    Intent localIntent = new Intent();
    localIntent.putExtras(localBundle);
    localIntent.setClass(paramActivity, PayActivityEx.class);
    paramActivity.startActivityForResult(localIntent, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.paymethod.UnionPay
 * JD-Core Version:    0.6.0
 */