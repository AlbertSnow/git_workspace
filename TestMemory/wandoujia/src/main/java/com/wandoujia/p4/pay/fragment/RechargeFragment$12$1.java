package com.wandoujia.p4.pay.fragment;

import com.wandoujia.p4.pay.model.CallBack;
import com.wandoujia.p4.pay.model.User;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.paymethod.UnicomPay;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.SLog;
import org.json.JSONObject;

class RechargeFragment$12$1
  implements CallBack<JSONObject>
{
  public void onError(int paramInt, String paramString)
  {
    SLog.e(RechargeFragment.access$1100(), paramString);
    if ((paramInt == 2) && (this.this$1.this$0.getActivity() != null))
      RechargeFragment.access$900(this.this$1.this$0, this.this$1.this$0.getString(2131625177));
  }

  public void onSuccess(JSONObject paramJSONObject)
  {
    this.this$1.val$order.setRechargeInfo(paramJSONObject.toString());
    new UnicomPay().pay(this.this$1.this$0.getActivity(), this.this$1.val$order, RechargeFragment.access$1300(this.this$1.this$0).getUser().getUid(), RechargeFragment.access$1700(this.this$1.this$0));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.RechargeFragment.12.1
 * JD-Core Version:    0.6.0
 */