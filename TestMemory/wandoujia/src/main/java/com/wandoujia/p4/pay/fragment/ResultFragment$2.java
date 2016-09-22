package com.wandoujia.p4.pay.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.wandoujia.p4.pay.paymethod.BalancePay;
import com.wandoujia.p4.pay.storage.LocalStorage;

class ResultFragment$2
  implements View.OnClickListener
{
  public void onClick(View paramView)
  {
    String str = ((TextView)ResultFragment.access$000(this.this$0).findViewById(2131494093)).getText().toString();
    new BalancePay().pay(ResultFragment.access$100(this.this$0), ResultFragment.access$200(this.this$0).getOrder(), str, Long.valueOf(0L), new ResultFragment.2.1(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.ResultFragment.2
 * JD-Core Version:    0.6.0
 */