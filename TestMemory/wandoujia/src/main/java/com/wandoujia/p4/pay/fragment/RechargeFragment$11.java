package com.wandoujia.p4.pay.fragment;

import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.utils.ProgressDialogUtil;
import com.wandoujia.p4.pay.utils.SLog;

class RechargeFragment$11
  implements PayCallBack
{
  public void onError(int paramInt, String paramString)
  {
    RechargeFragment.access$900(this.this$0, paramString);
  }

  public void onPending(String paramString)
  {
  }

  public void onProcessing()
  {
  }

  public void onSuccess()
  {
    RechargeFragment.access$900(this.this$0, "正在支付");
    SLog.i(RechargeFragment.access$1100(), "startSheznouLoop");
    ProgressDialogUtil.show(this.this$0.getActivity(), "", "正在连接运营商服务器，请稍候");
    RechargeFragment.access$1900(this.this$0, this.val$order, RechargeFragment.access$1800(this.this$0));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.RechargeFragment.11
 * JD-Core Version:    0.6.0
 */