package com.wandoujia.p4.pay.activity;

import com.android.volley.k;
import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.ProgressDialogUtil;
import com.wandoujia.p4.pay.utils.SLog;
import org.json.JSONObject;

class PayActivity$2
  implements k<JSONObject>
{
  public void onResponse(JSONObject paramJSONObject)
  {
    SLog.d("On CreateOrder response", paramJSONObject.toString());
    if (PayActivity.access$000(this.this$0).getBalance().longValue() + PayActivity.access$000(this.this$0).getBonusMoney().longValue() < PayActivity.access$000(this.this$0).getOrder().getMoneyInFen().longValue())
    {
      this.val$pay.queryCampaignList(new PayActivity.2.1(this), new PayActivity.2.2(this));
      return;
    }
    WandouOrder localWandouOrder = PayActivity.access$000(this.this$0).getOrder();
    if ((localWandouOrder != null) && (localWandouOrder.getOrderId().longValue() > 0L))
      this.this$0.showPaymentFragment();
    while (true)
    {
      ProgressDialogUtil.dismiss();
      return;
      PayActivity.access$200(this.this$0);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.activity.PayActivity.2
 * JD-Core Version:    0.6.0
 */