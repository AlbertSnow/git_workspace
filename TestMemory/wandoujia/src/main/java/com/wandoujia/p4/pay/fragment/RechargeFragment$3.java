package com.wandoujia.p4.pay.fragment;

import android.support.v4.app.FragmentActivity;
import com.android.volley.VolleyError;
import com.android.volley.j;

class RechargeFragment$3
  implements j
{
  public void onErrorResponse(VolleyError paramVolleyError)
  {
    if (this.this$0.getActivity() != null)
    {
      String str = this.this$0.getActivity().getString(2131625177);
      RechargeFragment.access$900(this.this$0, str);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.RechargeFragment.3
 * JD-Core Version:    0.6.0
 */