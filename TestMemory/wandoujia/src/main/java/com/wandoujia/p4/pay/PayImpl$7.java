package com.wandoujia.p4.pay;

import com.android.volley.k;
import com.wandoujia.p4.pay.model.CallBack;
import com.wandoujia.p4.pay.model.PayChannel;
import com.wandoujia.p4.pay.storage.LocalStorage;
import org.json.JSONObject;

class PayImpl$7
  implements k<JSONObject>
{
  public void onResponse(JSONObject paramJSONObject)
  {
    if ((paramJSONObject != null) && ("SUCCESS".equals(paramJSONObject.optString("resultStatus"))))
    {
      PayChannel.load(paramJSONObject.optString("result"));
      PayImpl.access$000(this.this$0).setPayMethodList(PayChannel.methodList);
      this.val$callBack.onSuccess(paramJSONObject.toString());
      return;
    }
    this.val$callBack.onError(1, paramJSONObject.optString("message"));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.PayImpl.7
 * JD-Core Version:    0.6.0
 */