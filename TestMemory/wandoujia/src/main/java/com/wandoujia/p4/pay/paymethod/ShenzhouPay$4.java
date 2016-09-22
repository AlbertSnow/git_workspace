package com.wandoujia.p4.pay.paymethod;

import com.android.volley.VolleyError;
import com.android.volley.j;
import com.wandoujia.p4.pay.model.PayCallBack;
import com.wandoujia.p4.pay.utils.SLog;

class ShenzhouPay$4
  implements j
{
  public void onErrorResponse(VolleyError paramVolleyError)
  {
    SLog.e("shenzhou", paramVolleyError);
    this.val$callBack.onError(0, "网络异常，请检查网络。");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.paymethod.ShenzhouPay.4
 * JD-Core Version:    0.6.0
 */