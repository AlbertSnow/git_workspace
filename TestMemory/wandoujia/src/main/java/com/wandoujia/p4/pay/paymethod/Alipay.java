package com.wandoujia.p4.pay.paymethod;

import android.app.Activity;
import android.content.Intent;
import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.paymethod.alipay.AlipayUtil;
import com.wandoujia.p4.pay.paymethod.alipay.NativeAliPay;
import com.wandoujia.p4.pay.utils.SLog;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Alipay
{
  public void onResult(Intent paramIntent, PayCallBack paramPayCallBack)
  {
    String str2;
    if ((paramIntent != null) && (paramIntent.getExtras() != null))
    {
      paramIntent.getAction();
      String str1 = paramIntent.getStringExtra("resultStatus");
      str2 = paramIntent.getStringExtra("memo");
      paramIntent.getStringExtra("result");
      if ("9000".equals(str1))
        paramPayCallBack.onSuccess();
    }
    else
    {
      return;
    }
    paramPayCallBack.onError(0, str2);
  }

  public void pay(Activity paramActivity, WandouOrder paramWandouOrder, int paramInt)
  {
    String str1 = AlipayUtil.getOrderInfo(paramWandouOrder.getName(), paramWandouOrder.getDesc(), paramWandouOrder.getShowMoney(), paramWandouOrder.getRehargeInfo(), PayImpl.ALIPAY_FAST_CALLBACK_URL);
    Object localObject = AlipayUtil.sign(AlipayUtil.getSignType(), str1);
    try
    {
      String str3 = URLEncoder.encode((String)localObject, "UTF-8");
      localObject = str3;
      label47: String str2 = str1 + "&sign=\"" + (String)localObject + "\"&" + AlipayUtil.getSignType();
      SLog.w("alipay", str2);
      NativeAliPay.getInstance(paramActivity).pay(str2, paramInt);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      break label47;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.paymethod.Alipay
 * JD-Core Version:    0.6.0
 */