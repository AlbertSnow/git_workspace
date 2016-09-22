package com.wandoujia.p4.pay.paymethod;

import android.content.Context;
import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.utils.SLog;
import org.json.JSONException;
import org.json.JSONObject;

public class TelecomPay
{
  private boolean sendSMS(Context paramContext, String paramString1, String paramString2)
  {
    return false;
  }

  public void pay(Context paramContext, WandouOrder paramWandouOrder, PayCallBack paramPayCallBack)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramWandouOrder.getRehargeInfo());
      if (sendSMS(paramContext, localJSONObject.getString("accessNo"), localJSONObject.getString("sms")))
      {
        paramPayCallBack.onSuccess();
        return;
      }
      paramPayCallBack.onError(0, "支付失败，请稍后再试。");
      return;
    }
    catch (JSONException localJSONException)
    {
      SLog.e("Telecom", localJSONException);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.paymethod.TelecomPay
 * JD-Core Version:    0.6.0
 */