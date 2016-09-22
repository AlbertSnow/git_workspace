package com.wandoujia.p4.pay.paymethod;

import com.android.volley.k;
import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.utils.SLog;
import org.json.JSONObject;

class BalancePay$1
  implements k<JSONObject>
{
  public void onResponse(JSONObject paramJSONObject)
  {
    SLog.d(BalancePay.access$000(), paramJSONObject.toString());
    String str1 = paramJSONObject.optString("resultStatus");
    String str2 = paramJSONObject.optString("message");
    if ("SUCCESS".equals(str1))
    {
      this.val$callBack.onSuccess();
      return;
    }
    this.val$callBack.onError(0, str2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.paymethod.BalancePay.1
 * JD-Core Version:    0.6.0
 */