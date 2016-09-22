package com.wandoujia.p4.pay.fragment;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.model.PayMethod;
import com.wandoujia.p4.pay.model.RechargeMoney;
import com.wandoujia.p4.pay.model.WandouOrder;
import com.wandoujia.p4.pay.paymethod.BalancePay;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.LogEvent;
import com.wandoujia.p4.pay.utils.SLog;
import java.util.List;

class PayFragment$3
  implements View.OnClickListener
{
  public void onClick(View paramView)
  {
    PayMethod localPayMethod = PayMethod.getByTitle(PayFragment.access$200(this.this$0).getSelectedItem());
    if (localPayMethod != null)
    {
      Long localLong2 = Long.valueOf(1L);
      List localList = PayFragment.access$300(this.this$0).getRechargeMoneyList(localPayMethod);
      if (PayFragment.access$400(this.this$0).getVisibility() == 0)
      {
        RechargeMoney localRechargeMoney = (RechargeMoney)localList.get(PayFragment.access$400(this.this$0).getSelectedItemPosition());
        SLog.d("rechargePay", localRechargeMoney.toString());
        localLong2 = localRechargeMoney.money;
      }
      Long localLong3;
      Long localLong4;
      PayFragment.3.1 local1;
      while (true)
      {
        localLong3 = Long.valueOf(localLong2.longValue());
        localLong4 = Long.valueOf(PayFragment.access$300(this.this$0).getOrder().getMoneyInFen().longValue() - PayFragment.access$300(this.this$0).getBalance().longValue() - PayFragment.access$300(this.this$0).getBonusMoney().longValue());
        PayFragment.access$300(this.this$0).setNeedRechargeMoney(localLong4);
        PayFragment.access$300(this.this$0).setChoseMoney(localLong3);
        p.a(this.this$0.getActivity(), "即将支付人民币 " + PayFragment.access$600(this.this$0).showMoney(localLong3.longValue()) + " 元", p.b).a();
        local1 = new PayFragment.3.1(this, localPayMethod, localLong3);
        if (localLong3.longValue() != 0L)
          break label337;
        PayFragment.access$1000(this.this$0, "请输入正确的金额");
        return;
        if (PayFragment.access$500(this.this$0).getVisibility() != 0)
          continue;
        if (TextUtils.isEmpty(PayFragment.access$500(this.this$0).getText().toString()))
          break;
        localLong2 = Long.valueOf(100L * Long.valueOf(PayFragment.access$500(this.this$0).getText().toString()).longValue());
      }
      label337: if (localLong3.longValue() < localLong4.longValue())
      {
        PayFragment.access$1600(this.this$0, new PayFragment.3.2(this, local1));
        return;
      }
      local1.run();
      return;
    }
    if (PayFragment.access$300(this.this$0).getBonusMoney().longValue() > PayFragment.access$300(this.this$0).getOrder().getMoneyInFen().longValue());
    for (Long localLong1 = PayFragment.access$300(this.this$0).getOrder().getMoneyInFen(); ; localLong1 = PayFragment.access$300(this.this$0).getBonusMoney())
    {
      LogEvent.doPay("BALANCEPAY", PayFragment.access$300(this.this$0).getOrder().getMoneyInFen());
      new BalancePay().pay(PayFragment.access$600(this.this$0), PayFragment.access$1700(this.this$0), PayFragment.access$1800(this.this$0).getText().toString(), localLong1, PayFragment.access$1400(this.this$0));
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.3
 * JD-Core Version:    0.6.0
 */