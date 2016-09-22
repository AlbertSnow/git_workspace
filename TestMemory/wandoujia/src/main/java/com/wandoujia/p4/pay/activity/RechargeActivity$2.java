package com.wandoujia.p4.pay.activity;

import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.wandoujia.p4.pay.model.CallBack;
import com.wandoujia.p4.pay.utils.ProgressDialogUtil;
import com.wandoujia.p4.pay.utils.SLog;

class RechargeActivity$2
  implements CallBack<String>
{
  public void onError(int paramInt, String paramString)
  {
    ProgressDialogUtil.dismiss();
    SLog.w(RechargeActivity.access$200(), "Recharge in P4 failed, " + paramInt + " : " + paramString);
    Toast.makeText(RechargeActivity.access$100(this.this$0), paramString, 0).show();
    RechargeActivity.access$100(this.this$0).finish();
  }

  public void onSuccess(String paramString)
  {
    ProgressDialogUtil.dismiss();
    this.this$0.showRechargeFragment();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.activity.RechargeActivity.2
 * JD-Core Version:    0.6.0
 */