package com.wandoujia.p4.pay.fragment;

import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.paymethod.ShenzhouPay;
import com.wandoujia.p4.pay.utils.SLog;

class PayFragment$9
  implements Runnable
{
  public void run()
  {
    int i = 0;
    while (true)
    {
      int j;
      label9: int k;
      if (i < 5)
      {
        j = 1;
        if (PayFragment.access$2600())
          break label65;
        k = 1;
        if ((j & k) == 0)
          break label83;
        new ShenzhouPay().queryStatus(PayFragment.access$600(this.this$0), this.val$order, this.val$callBack);
      }
      try
      {
        Thread.sleep(2000L);
        i++;
        continue;
        j = 0;
        break label9;
        label65: k = 0;
      }
      catch (Exception localException)
      {
        while (true)
          SLog.e(PayFragment.access$900(), localException);
      }
    }
    label83: this.val$callBack.onPending("充值卡支付已经提交，等待运营商通知。");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.9
 * JD-Core Version:    0.6.0
 */