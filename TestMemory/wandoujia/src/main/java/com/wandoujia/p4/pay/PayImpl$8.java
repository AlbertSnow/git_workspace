package com.wandoujia.p4.pay;

import com.android.volley.VolleyError;
import com.android.volley.j;
import com.wandoujia.p4.pay.model.CallBack;

class PayImpl$8
  implements j
{
  public void onErrorResponse(VolleyError paramVolleyError)
  {
    this.val$callBack.onError(1, "网络异常，请检查网络。");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.PayImpl.8
 * JD-Core Version:    0.6.0
 */