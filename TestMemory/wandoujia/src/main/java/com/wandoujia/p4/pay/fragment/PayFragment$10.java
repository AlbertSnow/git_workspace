package com.wandoujia.p4.pay.fragment;

import android.support.v4.app.FragmentActivity;
import com.wandoujia.p4.pay.model.CallBack;
import com.wandoujia.p4.pay.model.OrderResult;
import com.wandoujia.p4.pay.model.PayResults;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.SLog;

class PayFragment$10
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
    SLog.i("getNeedPassword", PayFragment.access$300(this.this$0).getNeedPassword());
    SLog.i("show result", PayFragment.access$300(this.this$0).getChoseMoney() + ">=" + PayFragment.access$300(this.this$0).getNeedRechargeMoney());
    if ((PayFragment.access$300(this.this$0).getNeedRechargeMoney().longValue() == 0L) || (PayFragment.access$300(this.this$0).getChoseMoney().longValue() >= PayFragment.access$300(this.this$0).getNeedRechargeMoney().longValue()))
    {
      PayFragment.access$300(this.this$0).setFinish(true);
      ResultFragment.showResult(this.this$0.getActivity(), PayResults.Purchase_Success.ordinal(), paramOrderResult.title, paramOrderResult.message, new PayFragment.10.1(this, localFragmentActivity));
      return;
    }
    PayFragment.access$300(this.this$0).setFinish(true);
    ResultFragment.showResult(this.this$0.getActivity(), PayResults.Purchase_Success.ordinal(), paramOrderResult.title, paramOrderResult.message, new PayFragment.10.2(this, localFragmentActivity));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.10
 * JD-Core Version:    0.6.0
 */