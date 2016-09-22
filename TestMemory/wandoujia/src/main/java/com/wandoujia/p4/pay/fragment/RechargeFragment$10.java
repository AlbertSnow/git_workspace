package com.wandoujia.p4.pay.fragment;

import com.wandoujia.p4.pay.model.CallBack;
import com.wandoujia.p4.pay.paymethod.UnionPay;
import com.wandoujia.p4.pay.utils.SLog;

class RechargeFragment$10
  implements CallBack<String>
{
  public void onError(int paramInt, String paramString)
  {
    SLog.e(RechargeFragment.access$1100(), paramString);
    if ((paramInt == 2) && (this.this$0.getActivity() != null))
      RechargeFragment.access$900(this.this$0, this.this$0.getString(2131625177));
  }

  public void onSuccess(String paramString)
  {
    SLog.d("tn", paramString);
    new UnionPay().pay(this.this$0.getActivity(), paramString, 200);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.RechargeFragment.10
 * JD-Core Version:    0.6.0
 */