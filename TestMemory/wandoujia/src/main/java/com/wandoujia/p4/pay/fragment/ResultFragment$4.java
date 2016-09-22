package com.wandoujia.p4.pay.fragment;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.wandoujia.p4.pay.model.CallBack;
import com.wandoujia.p4.pay.model.OrderResult;
import com.wandoujia.p4.pay.model.PayResults;
import com.wandoujia.p4.pay.utils.SLog;

class ResultFragment$4
  implements CallBack<OrderResult>
{
  public void onError(int paramInt, String paramString)
  {
    SLog.i("result", paramString.toString());
  }

  public void onSuccess(OrderResult paramOrderResult)
  {
    SLog.i("result", paramOrderResult.toString());
    this.this$0.getActivity();
    String str1 = this.this$0.getActivity().getString(2131625739);
    String str2 = this.this$0.getActivity().getString(2131625738);
    if ((paramOrderResult.status.intValue() == 0) || (paramOrderResult.status.intValue() == 1))
    {
      str1 = paramOrderResult.title;
      str2 = paramOrderResult.message;
    }
    ResultFragment.access$500(this.this$0).setVisibility(0);
    ResultFragment.access$600(this.this$0).setVisibility(0);
    ResultFragment.access$000(this.this$0).findViewById(2131494088).setVisibility(0);
    ResultFragment.access$000(this.this$0).findViewById(2131494091).setVisibility(8);
    ResultFragment.access$500(this.this$0).setText(str1);
    ResultFragment.access$500(this.this$0).setCompoundDrawablesWithIntrinsicBounds(ResultFragment.access$700(this.this$0).iconId(), 0, 0, 0);
    ResultFragment.access$600(this.this$0).setText(str2);
    Button localButton = ResultFragment.access$800(this.this$0);
    if (ResultFragment.access$700(this.this$0).withContact());
    for (int i = 0; ; i = 8)
    {
      localButton.setVisibility(i);
      ResultFragment.access$900(this.this$0).setOnClickListener(this.this$0);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.ResultFragment.4
 * JD-Core Version:    0.6.0
 */