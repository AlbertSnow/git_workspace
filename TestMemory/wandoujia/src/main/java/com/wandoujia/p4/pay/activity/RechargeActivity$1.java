package com.wandoujia.p4.pay.activity;

import android.support.v4.app.FragmentActivity;
import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.callback.CallbackWrapper;
import com.wandoujia.p4.pay.callback.CallbackWrapper.Status;
import com.wandoujia.p4.pay.callback.CallbackWrapper.Type;
import com.wandoujia.p4.pay.fragment.QuitDialogFragment.OnQuitCallback;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.storage.LocalStorage;

class RechargeActivity$1
  implements QuitDialogFragment.OnQuitCallback
{
  public boolean onCancelled()
  {
    return false;
  }

  public boolean onConfirmed()
  {
    WandouOrder localWandouOrder = RechargeActivity.access$000(this.this$0).getOrder();
    if (localWandouOrder == null);
    for (String str = "No order created."; ; str = localWandouOrder.toJSONString())
    {
      FragmentActivity localFragmentActivity = RechargeActivity.access$100(this.this$0);
      RechargeActivity.access$100(this.this$0);
      CallbackWrapper.invoke(localFragmentActivity, -1, CallbackWrapper.Type.RECHARGE, PayImpl.getFinishStatus(), PayImpl.getFinishStatus().name() + str, str);
      return true;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.activity.RechargeActivity.1
 * JD-Core Version:    0.6.0
 */