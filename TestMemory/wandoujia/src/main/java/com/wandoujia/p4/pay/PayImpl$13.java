package com.wandoujia.p4.pay;

import com.android.volley.k;
import com.wandoujia.p4.pay.model.CallBack;
import com.wandoujia.p4.pay.utils.SLog;
import org.json.JSONException;
import org.json.JSONObject;

class PayImpl$13
  implements k<JSONObject>
{
  public void onResponse(JSONObject paramJSONObject)
  {
    try
    {
      String str = new JSONObject(paramJSONObject.getString("result")).getString("unionPayId");
      SLog.i("tn", str);
      if (this.val$callBack != null)
        this.val$callBack.onSuccess(str);
      return;
    }
    catch (JSONException localJSONException)
    {
      do
        SLog.e("PayImpl", localJSONException);
      while (this.val$callBack == null);
      this.val$callBack.onError(1, localJSONException.toString());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.PayImpl.13
 * JD-Core Version:    0.6.0
 */