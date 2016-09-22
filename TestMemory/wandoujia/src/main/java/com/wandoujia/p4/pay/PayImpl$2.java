package com.wandoujia.p4.pay;

import com.android.volley.k;
import org.json.JSONObject;

class PayImpl$2
  implements k<JSONObject>
{
  public void onResponse(JSONObject paramJSONObject)
  {
    if (this.val$callback != null)
      this.val$callback.onResponse(paramJSONObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.PayImpl.2
 * JD-Core Version:    0.6.0
 */