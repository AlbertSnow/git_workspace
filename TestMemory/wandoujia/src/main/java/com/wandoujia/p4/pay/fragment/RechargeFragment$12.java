package com.wandoujia.p4.pay.fragment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.utils.ProgressDialogUtil;

class RechargeFragment$12
  implements DialogInterface.OnClickListener
{
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    ProgressDialogUtil.show(this.this$0.getActivity(), "", this.this$0.getString(2131625098));
    RechargeFragment.access$700(this.this$0).getUnicomPayInfo(new RechargeFragment.12.1(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.RechargeFragment.12
 * JD-Core Version:    0.6.0
 */