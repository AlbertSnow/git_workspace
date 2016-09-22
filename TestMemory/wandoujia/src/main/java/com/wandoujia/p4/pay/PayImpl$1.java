package com.wandoujia.p4.pay;

import com.android.volley.k;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.LogEvent;
import com.wandoujia.p4.pay.utils.SLog;
import org.json.JSONException;
import org.json.JSONObject;

class PayImpl$1
  implements k<JSONObject>
{
  public void onResponse(JSONObject paramJSONObject)
  {
    try
    {
      localJSONObject1 = new JSONObject(paramJSONObject.getString("result"));
    }
    catch (JSONException localJSONException2)
    {
      try
      {
        JSONObject localJSONObject1;
        SLog.d("content", localJSONObject1.toString());
        JSONObject localJSONObject2 = localJSONObject1.getJSONObject("order");
        WandouOrder localWandouOrder = PayImpl.access$000(this.this$0).getOrder();
        localWandouOrder.setOrderId(Long.valueOf(localJSONObject2.getLong("orderId")));
        PayImpl.access$000(this.this$0).setOrder(localWandouOrder);
        JSONObject localJSONObject3 = localJSONObject1.getJSONObject("account");
        PayImpl.access$000(this.this$0).setBalance(Long.valueOf(localJSONObject3.getLong("balance")));
        PayImpl.access$000(this.this$0).setBonusMoney(Long.valueOf(localJSONObject1.getLong("bonusMoney")));
        PayImpl.access$000(this.this$0).setPayMethodList(localJSONObject1.getString("payMethod"));
        PayImpl.access$000(this.this$0).setOrderIdPrefix(localJSONObject1.getString("alipayOrderIdPrefix"));
        while (true)
        {
          label149: LogEvent.createOrder();
          if (this.val$callback != null)
            this.val$callback.onResponse(localJSONObject1);
          return;
          localJSONException2 = localJSONException2;
          localJSONObject1 = paramJSONObject;
        }
      }
      catch (JSONException localJSONException1)
      {
        break label149;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.PayImpl.1
 * JD-Core Version:    0.6.0
 */