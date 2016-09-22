package com.wandoujia.p4.pay.fragment;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import com.wandoujia.p4.pay.model.PayMethod;
import com.wandoujia.p4.pay.model.RechargeMoney;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.SLog;
import java.util.List;

class PayFragment$5
  implements AdapterView.OnItemSelectedListener
{
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    SLog.i("onItemSelected", paramInt + ":" + this.val$payMethodList[paramInt]);
    List localList = PayFragment.access$300(this.this$0).getRechargeMoneyList(PayMethod.getByTitle(this.val$payMethodList[paramInt]));
    if (PayMethod.getByTitle(this.val$payMethodList[paramInt]).equals(PayMethod.SHENZHOUPAY))
    {
      PayFragment.access$1900(this.this$0).setVisibility(0);
      PayMethod localPayMethod = PayMethod.getByTitle(this.val$payMethodList[paramInt]);
      PayFragment.access$2000(this.this$0).setText(localPayMethod.describe());
      SLog.i("onItemSelected", localList.size());
      PayFragment.access$300(this.this$0).setCurPayMethod(PayMethod.getByTitle(this.val$payMethodList[paramInt]).name());
      if ((!PayMethod.getByTitle(this.val$payMethodList[paramInt]).equals(PayMethod.ALIPAY)) && (!PayMethod.getByTitle(this.val$payMethodList[paramInt]).equals(PayMethod.UNIONPAY)))
        break label343;
      PayFragment.access$2102(this.this$0, new String[1 + localList.size()]);
      PayFragment.access$2100(this.this$0)[localList.size()] = "手动输入";
    }
    int j;
    while (true)
    {
      int i = 0;
      j = 0;
      while (i < localList.size())
      {
        PayFragment.access$2100(this.this$0)[i] = ((RechargeMoney)localList.get(i)).title;
        if (((RechargeMoney)localList.get(i)).check.booleanValue())
        {
          PayFragment.access$300(this.this$0).setDefaultMoney(((RechargeMoney)localList.get(i)).money);
          j = i;
        }
        i++;
      }
      PayFragment.access$1900(this.this$0).setVisibility(8);
      break;
      label343: PayFragment.access$2102(this.this$0, new String[localList.size()]);
      PayFragment.access$400(this.this$0).setVisibility(0);
      PayFragment.access$500(this.this$0).setVisibility(8);
    }
    PayFragment.access$2202(this.this$0, new ArrayAdapter(this.this$0.getActivity(), 2130903608, PayFragment.access$2100(this.this$0)));
    PayFragment.access$2200(this.this$0).setDropDownViewResource(17367049);
    PayFragment.access$400(this.this$0).setAdapter(PayFragment.access$2200(this.this$0));
    PayFragment.access$400(this.this$0).setSelection(j);
    PayFragment.access$400(this.this$0).setOnItemSelectedListener(new PayFragment.5.1(this));
  }

  public void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.5
 * JD-Core Version:    0.6.0
 */