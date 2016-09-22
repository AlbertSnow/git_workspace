package com.wandoujia.p4.pay.fragment;

import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.storage.LocalStorage;

class ResultFragment$2$1
  implements PayCallBack
{
  public void onError(int paramInt, String paramString)
  {
    if (paramInt == 0)
      ResultFragment.access$400(this.this$1.this$0, paramString);
  }

  public void onPending(String paramString)
  {
  }

  public void onProcessing()
  {
  }

  public void onSuccess()
  {
    ResultFragment.access$200(this.this$1.this$0).setNeedPassword(false);
    ResultFragment.access$300(this.this$1.this$0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.ResultFragment.2.1
 * JD-Core Version:    0.6.0
 */