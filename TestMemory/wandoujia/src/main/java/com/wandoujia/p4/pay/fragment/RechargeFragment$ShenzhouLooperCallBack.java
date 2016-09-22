package com.wandoujia.p4.pay.fragment;

import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.utils.ProgressDialogUtil;
import com.wandoujia.p4.pay.utils.SLog;

class RechargeFragment$ShenzhouLooperCallBack
  implements PayCallBack
{
  RechargeFragment$ShenzhouLooperCallBack(RechargeFragment paramRechargeFragment)
  {
  }

  public void onError(int paramInt, String paramString)
  {
    RechargeFragment.access$1002(true);
    ProgressDialogUtil.dismiss();
    RechargeFragment.access$900(this.this$0, paramString);
  }

  public void onPending(String paramString)
  {
    ProgressDialogUtil.dismiss();
    RechargeFragment.access$1700(this.this$0).onPending(paramString);
  }

  public void onProcessing()
  {
    SLog.i(RechargeFragment.access$1100(), "onProcessing");
  }

  public void onSuccess()
  {
    ProgressDialogUtil.dismiss();
    RechargeFragment.access$1700(this.this$0).onSuccess();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.RechargeFragment.ShenzhouLooperCallBack
 * JD-Core Version:    0.6.0
 */