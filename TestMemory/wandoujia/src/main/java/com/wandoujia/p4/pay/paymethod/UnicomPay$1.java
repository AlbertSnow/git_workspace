package com.wandoujia.p4.pay.paymethod;

import android.os.Handler;
import android.os.Message;
import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.utils.SLog;

class UnicomPay$1 extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    String str = "msg.arg1:" + paramMessage.arg1 + ";msg.arg2:" + paramMessage.arg2 + ";msg.obj:" + paramMessage.obj.toString();
    SLog.i("LianTong", str);
    switch (paramMessage.arg1)
    {
    default:
      return;
    case 2:
      UnicomPay.access$000(this.this$0).onError(1, paramMessage.obj.toString());
      return;
    case 3:
      UnicomPay.access$000(this.this$0).onError(1, str);
      return;
    case 1:
    }
    UnicomPay.access$000(this.this$0).onSuccess();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.paymethod.UnicomPay.1
 * JD-Core Version:    0.6.0
 */