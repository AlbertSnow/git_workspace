package com.wandoujia.p4.pay.fragment;

import android.support.v4.app.FragmentActivity;
import com.wandoujia.p4.pay.callback.CallbackWrapper;
import com.wandoujia.p4.pay.callback.CallbackWrapper.Status;
import com.wandoujia.p4.pay.callback.CallbackWrapper.Type;
import com.wandoujia.p4.pay.model.WandouOrder;

class PayFragment$10$1
  implements ResultFragment.OnFinishListener
{
  public void onFinish()
  {
    CallbackWrapper.invoke(this.val$activity, -1, CallbackWrapper.Type.PAY, CallbackWrapper.Status.SUCCESS, "Balance Pay success!", PayFragment.access$1700(this.this$1.this$0).toJSONString());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.10.1
 * JD-Core Version:    0.6.0
 */