package com.wandoujia.p4.pay.fragment;

import android.support.v4.app.FragmentActivity;
import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.callback.CallbackWrapper.Status;
import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.model.PayResults;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.utils.ProgressDialogUtil;
import com.wandoujia.p4.pay.utils.SLog;

class RechargeFragment$PaymentCallback
  implements PayCallBack
{
  RechargeFragment$PaymentCallback(RechargeFragment paramRechargeFragment)
  {
  }

  public void onError(int paramInt, String paramString)
  {
    ProgressDialogUtil.dismiss();
    PayImpl.setFinishStatus(CallbackWrapper.Status.FAIL);
    SLog.d(RechargeFragment.access$1100(), "Balance pay failed, " + RechargeFragment.access$1200(this.this$0).toJSONString());
    FragmentActivity localFragmentActivity = this.this$0.getActivity();
    if (localFragmentActivity != null)
    {
      if (paramInt == 0)
        RechargeFragment.access$900(this.this$0, paramString);
    }
    else
      return;
    ResultFragment.showResult(localFragmentActivity, PayResults.Purchase_Fail.ordinal(), this.this$0.getString(2131625309), paramString, new RechargeFragment.PaymentCallback.1(this, localFragmentActivity, paramString));
  }

  public void onPending(String paramString)
  {
    ProgressDialogUtil.dismiss();
    RechargeFragment.access$1600(this.this$0);
    SLog.d(RechargeFragment.access$1100(), "Balance pay pending, " + paramString + RechargeFragment.access$1200(this.this$0).toJSONString());
    if (this.this$0.getActivity() != null)
      RechargeFragment.access$900(this.this$0, paramString);
  }

  public void onProcessing()
  {
  }

  public void onSuccess()
  {
    ProgressDialogUtil.dismiss();
    RechargeFragment.access$1600(this.this$0);
    PayImpl.setFinishStatus(CallbackWrapper.Status.SUCCESS);
    SLog.d(RechargeFragment.access$1100(), "Balance pay success, " + RechargeFragment.access$1200(this.this$0).toJSONString());
    if (this.this$0.getActivity() != null)
      RechargeFragment.access$900(this.this$0, this.this$0.getString(2131625310));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.RechargeFragment.PaymentCallback
 * JD-Core Version:    0.6.0
 */