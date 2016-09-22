package com.wandoujia.p4.pay.activity;

import com.android.volley.VolleyError;
import com.android.volley.j;
import com.wandoujia.p4.pay.utils.ActivityUtil;

class PayActivity$3
  implements j
{
  public void onErrorResponse(VolleyError paramVolleyError)
  {
    PayActivity.access$300();
    new StringBuilder("VolleyError: ").append(paramVolleyError.toString());
    ActivityUtil.showErrorMessage(PayActivity.access$100(this.this$0), paramVolleyError);
    PayActivity.access$200(this.this$0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.activity.PayActivity.3
 * JD-Core Version:    0.6.0
 */