package com.wandoujia.p4.pay.fragment;

import android.support.v4.app.FragmentActivity;
import com.wandoujia.p4.pay.model.CallBack;
import com.wandoujia.p4.pay.model.OrderResult;
import com.wandoujia.p4.pay.model.PayResults;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.SLog;

class RechargeFragment$7
  implements CallBack<OrderResult>
{
  public void onError(int paramInt, String paramString)
  {
    SLog.i("result", paramString.toString());
  }

  public void onSuccess(OrderResult paramOrderResult)
  {
    SLog.i("result", paramOrderResult.toString());
    FragmentActivity localFragmentActivity = this.this$0.getActivity();
    if (!RechargeFragment.access$1300(this.this$0).getNeedPassword())
    {
      RechargeFragment.access$1300(this.this$0).setFinish(true);
      ResultFragment.showResult(this.this$0.getActivity(), PayResults.Purchase_Success.ordinal(), paramOrderResult.title, paramOrderResult.message, new RechargeFragment.7.1(this, localFragmentActivity));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.RechargeFragment.7
 * JD-Core Version:    0.6.0
 */