package com.wandoujia.p4.pay.activity;

import android.support.v4.app.FragmentActivity;
import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.callback.CallbackWrapper;
import com.wandoujia.p4.pay.callback.CallbackWrapper.Status;
import com.wandoujia.p4.pay.callback.CallbackWrapper.Type;
import com.wandoujia.p4.pay.fragment.QuitDialogFragment.OnQuitCallback;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.storage.LocalStorage;

class PayActivity$1
  implements QuitDialogFragment.OnQuitCallback
{
  public boolean onCancelled()
  {
    return false;
  }

  public boolean onConfirmed()
  {
    String str = PayActivity.access$000(this.this$0).getOrder().toJSONString();
    FragmentActivity localFragmentActivity = PayActivity.access$100(this.this$0);
    PayActivity.access$100(this.this$0);
    CallbackWrapper.invoke(localFragmentActivity, -1, CallbackWrapper.Type.PAY, PayImpl.getFinishStatus(), PayImpl.getFinishStatus().name() + str, str);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.activity.PayActivity.1
 * JD-Core Version:    0.6.0
 */