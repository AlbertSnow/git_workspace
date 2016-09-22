package com.wandoujia.p4.pay;

import com.android.volley.k;
import com.wandoujia.p4.pay.model.RechargePaySet;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.SLog;
import org.json.JSONException;
import org.json.JSONObject;

class PayImpl$3
  implements k<JSONObject>
{
  public void onResponse(JSONObject paramJSONObject)
  {
    try
    {
      SLog.i("onRes", paramJSONObject.toString());
      JSONObject localJSONObject = new JSONObject(paramJSONObject.getString("result"));
      SLog.i("result", localJSONObject.toString());
      RechargePaySet localRechargePaySet = new RechargePaySet();
      localRechargePaySet.needPassword = Boolean.valueOf(localJSONObject.getBoolean("needPassword"));
      localRechargePaySet.rechargeInfo = localJSONObject.optString("chargeInfo");
      localRechargePaySet.rechargeOrderId = Long.valueOf(localJSONObject.getLong("chargeOrderId"));
      PayImpl.access$000(this.this$0).setLinkOrderId(localRechargePaySet.rechargeOrderId);
      PayImpl.access$000(this.this$0).getOrder().setRechargeInfo(localRechargePaySet.rechargeInfo);
      if (localRechargePaySet.needPassword.booleanValue())
        PayImpl.access$000(this.this$0).setNeedPassword(true);
      PayImpl.access$000(this.this$0).setOrder(PayImpl.access$000(this.this$0).getOrder());
      if (this.val$callback != null)
        this.val$callback.onResponse(localRechargePaySet);
      return;
    }
    catch (JSONException localJSONException)
    {
      SLog.e("getWithMD5", localJSONException);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.PayImpl.3
 * JD-Core Version:    0.6.0
 */