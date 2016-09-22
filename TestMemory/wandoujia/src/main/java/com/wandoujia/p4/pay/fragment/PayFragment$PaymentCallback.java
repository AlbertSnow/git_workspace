package com.wandoujia.p4.pay.fragment;

import android.support.v4.app.FragmentActivity;
import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.callback.CallbackWrapper.Status;
import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.model.PayResults;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.LogEvent;
import com.wandoujia.p4.pay.utils.SLog;

class PayFragment$PaymentCallback
  implements PayCallBack
{
  PayFragment$PaymentCallback(PayFragment paramPayFragment)
  {
  }

  public void onError(int paramInt, String paramString)
  {
    PayFragment.access$2400(this.this$0);
    PayImpl.setFinishStatus(CallbackWrapper.Status.FAIL);
    SLog.d(PayFragment.access$900(), "Balance pay failed, " + PayFragment.access$1700(this.this$0).toJSONString());
    FragmentActivity localFragmentActivity = this.this$0.getActivity();
    if (localFragmentActivity != null)
    {
      if (paramInt == 0)
        PayFragment.access$1000(this.this$0, paramString);
    }
    else
      return;
    String str = localFragmentActivity.getString(2131625737);
    ResultFragment.showResult(localFragmentActivity, PayResults.Purchase_Fail.ordinal(), str, paramString, new PayFragment.PaymentCallback.1(this, localFragmentActivity, paramString));
  }

  public void onPending(String paramString)
  {
    PayFragment.access$2400(this.this$0);
    PayFragment.access$2500(this.this$0);
    SLog.d(PayFragment.access$900(), "Balance pay pending, " + paramString + PayFragment.access$1700(this.this$0).toJSONString());
    if (this.this$0.getActivity() != null)
      PayFragment.access$1000(this.this$0, paramString);
  }

  public void onProcessing()
  {
  }

  public void onSuccess()
  {
    PayFragment.access$2400(this.this$0);
    PayFragment.access$2500(this.this$0);
    PayImpl.setFinishStatus(CallbackWrapper.Status.SUCCESS);
    LogEvent.finishPay(PayFragment.access$300(this.this$0).getCurPayMethod(), PayFragment.access$300(this.this$0).getChoseMoney());
    SLog.d(PayFragment.access$900(), "Balance pay success, " + PayFragment.access$1700(this.this$0).toJSONString());
    if (this.this$0.getActivity() != null)
      PayFragment.access$1000(this.this$0, this.this$0.getString(2131625294));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.PaymentCallback
 * JD-Core Version:    0.6.0
 */