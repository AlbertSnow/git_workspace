package com.wandoujia.p4.pay.paymethod;

import com.android.volley.VolleyError;
import com.android.volley.j;
import com.wandoujia.p4.pay.model.PayCallBack;

class GameCardPay$2
  implements j
{
  public void onErrorResponse(VolleyError paramVolleyError)
  {
    this.val$callBack.onError(1, paramVolleyError.toString());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.paymethod.GameCardPay.2
 * JD-Core Version:    0.6.0
 */