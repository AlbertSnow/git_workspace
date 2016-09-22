package com.wandoujia.p4.pay;

import com.android.volley.k;
import com.wandoujia.p4.pay.model.CallBack;
import org.json.JSONObject;

class PayImpl$5
  implements k<JSONObject>
{
  public void onResponse(JSONObject paramJSONObject)
  {
    this.val$callBack.onSuccess(paramJSONObject.toString());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.PayImpl.5
 * JD-Core Version:    0.6.0
 */