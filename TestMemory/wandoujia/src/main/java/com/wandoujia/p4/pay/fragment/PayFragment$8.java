package com.wandoujia.p4.pay.fragment;

import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.pay.utils.SLog;

class PayFragment$8
  implements Runnable
{
  public void run()
  {
    try
    {
      if (this.this$0.getActivity() != null)
        p.a(this.this$0.getActivity(), this.val$message, p.b).a();
      return;
    }
    catch (Exception localException)
    {
      SLog.i(PayFragment.access$900(), "Error in toast, Might UI thread be not available. " + this.val$message);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.8
 * JD-Core Version:    0.6.0
 */