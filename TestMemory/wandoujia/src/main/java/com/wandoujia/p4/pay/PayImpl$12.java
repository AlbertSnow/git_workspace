package com.wandoujia.p4.pay;

import com.android.volley.VolleyError;
import com.android.volley.j;
import com.wandoujia.p4.pay.model.CallBack;
import com.wandoujia.p4.pay.utils.SLog;

class PayImpl$12
  implements j
{
  public void onErrorResponse(VolleyError paramVolleyError)
  {
    SLog.e("PayImpl", paramVolleyError);
    if (this.val$callBack != null)
      this.val$callBack.onError(2, paramVolleyError.toString());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.PayImpl.12
 * JD-Core Version:    0.6.0
 */