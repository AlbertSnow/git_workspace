package com.wandoujia.p4.pay.fragment;

import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.utils.SLog;

class PayFragment$ShenzhouLooperCallBack
  implements PayCallBack
{
  PayFragment$ShenzhouLooperCallBack(PayFragment paramPayFragment)
  {
  }

  public void onError(int paramInt, String paramString)
  {
    PayFragment.access$2602(true);
    PayFragment.access$2400(this.this$0);
    PayFragment.access$1000(this.this$0, paramString);
  }

  public void onPending(String paramString)
  {
    PayFragment.access$2400(this.this$0);
    this.this$0.getPayCallback().onPending(paramString);
  }

  public void onProcessing()
  {
    SLog.i(PayFragment.access$900(), "onProcessing");
  }

  public void onSuccess()
  {
    PayFragment.access$2400(this.this$0);
    this.this$0.getPayCallback().onSuccess();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.ShenzhouLooperCallBack
 * JD-Core Version:    0.6.0
 */