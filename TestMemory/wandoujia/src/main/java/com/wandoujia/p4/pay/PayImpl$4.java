package com.wandoujia.p4.pay;

import com.android.volley.k;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.SLog;
import org.json.JSONException;
import org.json.JSONObject;

class PayImpl$4
  implements k<JSONObject>
{
  public void onResponse(JSONObject paramJSONObject)
  {
    try
    {
      PayImpl.access$000(this.this$0).setRechargeMoneyListResult(paramJSONObject.getString("result"));
      this.val$callback.onResponse(paramJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      SLog.e("queryCampaignList", localJSONException);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.PayImpl.4
 * JD-Core Version:    0.6.0
 */