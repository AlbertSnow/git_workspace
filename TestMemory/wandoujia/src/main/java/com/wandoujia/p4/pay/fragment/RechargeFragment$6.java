package com.wandoujia.p4.pay.fragment;

import com.android.volley.VolleyError;
import com.android.volley.j;
import com.wandoujia.p4.pay.utils.ActivityUtil;
import com.wandoujia.p4.pay.utils.ProgressDialogUtil;

class RechargeFragment$6
  implements j
{
  public void onErrorResponse(VolleyError paramVolleyError)
  {
    ProgressDialogUtil.dismiss();
    RechargeFragment.access$1100();
    new StringBuilder("VolleyError: ").append(paramVolleyError.toString());
    if (this.this$0.getActivity() != null)
      ActivityUtil.showErrorMessage(this.this$0.getActivity(), paramVolleyError);
    RechargeFragment.access$1500(this.this$0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.RechargeFragment.6
 * JD-Core Version:    0.6.0
 */