package com.wandoujia.p4.pay.paymethod;

import com.android.volley.k;
import com.wandoujia.p4.pay.model.PayCallBack;
import org.json.JSONObject;

class ShenzhouPay$1
  implements k<JSONObject>
{
  public void onResponse(JSONObject paramJSONObject)
  {
    String str = paramJSONObject.toString();
    if (str.contains("PROCESSING"))
    {
      this.val$callBack.onProcessing();
      return;
    }
    if (str.contains("SUCCESS"))
    {
      this.val$callBack.onSuccess();
      return;
    }
    this.val$callBack.onError(0, paramJSONObject.optString("message"));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.paymethod.ShenzhouPay.1
 * JD-Core Version:    0.6.0
 */