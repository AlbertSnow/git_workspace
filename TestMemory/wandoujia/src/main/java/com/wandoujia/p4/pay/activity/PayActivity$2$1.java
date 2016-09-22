package com.wandoujia.p4.pay.activity;

import com.android.volley.k;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.ProgressDialogUtil;
import org.json.JSONObject;

class PayActivity$2$1
  implements k<JSONObject>
{
  public void onResponse(JSONObject paramJSONObject)
  {
    WandouOrder localWandouOrder = PayActivity.access$000(this.this$1.this$0).getOrder();
    if ((localWandouOrder != null) && (localWandouOrder.getOrderId().longValue() > 0L))
      this.this$1.this$0.showPaymentFragment();
    while (true)
    {
      ProgressDialogUtil.dismiss();
      return;
      PayActivity.access$200(this.this$1.this$0);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.activity.PayActivity.2.1
 * JD-Core Version:    0.6.0
 */