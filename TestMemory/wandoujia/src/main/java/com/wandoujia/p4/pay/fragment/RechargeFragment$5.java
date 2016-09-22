package com.wandoujia.p4.pay.fragment;

import com.android.volley.k;
import com.wandoujia.p4.pay.model.PayMethod;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.ProgressDialogUtil;
import com.wandoujia.p4.pay.utils.SLog;
import org.json.JSONObject;

class RechargeFragment$5
  implements k<JSONObject>
{
  public void onResponse(JSONObject paramJSONObject)
  {
    SLog.d("On CreateOrder response", paramJSONObject.toString());
    ProgressDialogUtil.dismiss();
    RechargeFragment.access$1202(this.this$0, RechargeFragment.access$1300(this.this$0).getOrder());
    if ((RechargeFragment.access$1200(this.this$0) != null) && (RechargeFragment.access$1200(this.this$0).getOrderId().longValue() > 0L))
    {
      RechargeFragment.access$1300(this.this$0).setChoseMoney(Long.valueOf(this.val$money));
      RechargeFragment.access$1400(this.this$0, this.val$payMethod, RechargeFragment.access$1200(this.this$0));
      return;
    }
    RechargeFragment.access$1500(this.this$0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.RechargeFragment.5
 * JD-Core Version:    0.6.0
 */