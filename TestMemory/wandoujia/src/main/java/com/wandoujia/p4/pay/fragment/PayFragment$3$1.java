package com.wandoujia.p4.pay.fragment;

import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.model.PayMethod;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.SLog;

class PayFragment$3$1
  implements Runnable
{
  public void run()
  {
    SLog.d("payMethod", this.val$payMethod.name());
    WandouOrder localWandouOrder = PayFragment.access$300(this.this$1.this$0).getRechargeOrder(this.val$money);
    PayFragment.access$600(this.this$1.this$0).rechargePay(this.val$payMethod.name(), this.val$money, new PayFragment.3.1.1(this, localWandouOrder), new PayFragment.3.1.2(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.3.1
 * JD-Core Version:    0.6.0
 */