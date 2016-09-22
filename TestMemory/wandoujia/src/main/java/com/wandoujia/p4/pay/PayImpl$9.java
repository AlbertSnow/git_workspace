package com.wandoujia.p4.pay;

import com.android.volley.k;
import com.wandoujia.p4.pay.model.CallBack;
import com.wandoujia.p4.pay.model.OrderResult;
import com.wandoujia.p4.pay.utils.SLog;
import org.json.JSONException;
import org.json.JSONObject;

class PayImpl$9
  implements k<JSONObject>
{
  public void onResponse(JSONObject paramJSONObject)
  {
    OrderResult localOrderResult = new OrderResult();
    try
    {
      JSONObject localJSONObject = new JSONObject(paramJSONObject.getString("result"));
      localOrderResult.status = Integer.valueOf(localJSONObject.getInt("status"));
      localOrderResult.message = localJSONObject.optString("message");
      localOrderResult.title = localJSONObject.optString("title");
      this.val$callBack.onSuccess(localOrderResult);
      return;
    }
    catch (JSONException localJSONException)
    {
      SLog.e("PayImpl", localJSONException);
      this.val$callBack.onError(1, localJSONException.toString());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.PayImpl.9
 * JD-Core Version:    0.6.0
 */