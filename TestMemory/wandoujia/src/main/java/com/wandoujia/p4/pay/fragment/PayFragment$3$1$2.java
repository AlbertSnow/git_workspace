package com.wandoujia.p4.pay.fragment;

import com.android.volley.VolleyError;
import com.android.volley.j;
import com.wandoujia.p4.pay.utils.ActivityUtil;

class PayFragment$3$1$2
  implements j
{
  public void onErrorResponse(VolleyError paramVolleyError)
  {
    if (this.this$2.this$1.this$0.getActivity() != null)
      ActivityUtil.showErrorMessage(this.this$2.this$1.this$0.getActivity(), paramVolleyError);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.3.1.2
 * JD-Core Version:    0.6.0
 */