package com.wandoujia.p4.pay.httpapi;

import com.android.volley.k;
import com.wandoujia.p4.pay.utils.SLog;
import org.json.JSONException;
import org.json.JSONObject;

class PayHttp$3
  implements k<JSONObject>
{
  public void onResponse(JSONObject paramJSONObject)
  {
    if (this.val$callback != null);
    try
    {
      JSONObject localJSONObject = new JSONObject(paramJSONObject.getString("content"));
      this.val$callback.onResponse(localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      SLog.e("getWithMD5", localJSONException);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.httpapi.PayHttp.3
 * JD-Core Version:    0.6.0
 */