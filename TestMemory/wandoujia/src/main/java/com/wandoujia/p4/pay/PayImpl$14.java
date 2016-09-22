package com.wandoujia.p4.pay;

import com.android.volley.VolleyError;
import com.android.volley.j;
import com.wandoujia.p4.pay.model.CallBack;

class PayImpl$14
  implements j
{
  public void onErrorResponse(VolleyError paramVolleyError)
  {
    if (this.val$callBack != null)
      this.val$callBack.onError(2, paramVolleyError.toString());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.PayImpl.14
 * JD-Core Version:    0.6.0
 */