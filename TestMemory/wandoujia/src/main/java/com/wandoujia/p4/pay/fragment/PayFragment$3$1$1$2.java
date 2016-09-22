package com.wandoujia.p4.pay.fragment;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.FragmentActivity;
import com.wandoujia.p4.pay.model.User;
import com.wandoujia.p4.pay.paymethod.UnicomPay;
import com.wandoujia.p4.pay.storage.LocalStorage;

class PayFragment$3$1$1$2
  implements DialogInterface.OnClickListener
{
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    PayFragment.access$1100(this.this$3.this$2.this$1.this$0).setMessage(this.this$3.this$2.this$1.this$0.getActivity().getString(2131625098));
    PayFragment.access$1100(this.this$3.this$2.this$1.this$0).setCancelable(false);
    PayFragment.access$1100(this.this$3.this$2.this$1.this$0).show();
    new UnicomPay().pay(this.this$3.this$2.this$1.this$0.getActivity(), this.this$3.val$order, PayFragment.access$300(this.this$3.this$2.this$1.this$0).getUser().getUid(), PayFragment.access$1400(this.this$3.this$2.this$1.this$0));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.3.1.1.2
 * JD-Core Version:    0.6.0
 */