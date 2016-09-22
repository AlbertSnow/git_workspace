package com.wandoujia.p4.pay.fragment;

import android.app.ProgressDialog;
import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.utils.SLog;

class PayFragment$3$1$1$1
  implements PayCallBack
{
  public void onError(int paramInt, String paramString)
  {
    PayFragment.access$1000(this.this$3.this$2.this$1.this$0, paramString);
  }

  public void onPending(String paramString)
  {
  }

  public void onProcessing()
  {
  }

  public void onSuccess()
  {
    PayFragment.access$1000(this.this$3.this$2.this$1.this$0, "正在支付");
    SLog.i(PayFragment.access$900(), "startSheznouLoop");
    PayFragment.access$1100(this.this$3.this$2.this$1.this$0).setMessage("正在连接运营商服务器，请稍候");
    PayFragment.access$1100(this.this$3.this$2.this$1.this$0).setCancelable(false);
    PayFragment.access$1100(this.this$3.this$2.this$1.this$0).show();
    PayFragment.access$1300(this.this$3.this$2.this$1.this$0, this.val$order, PayFragment.access$1200(this.this$3.this$2.this$1.this$0));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.3.1.1.1
 * JD-Core Version:    0.6.0
 */