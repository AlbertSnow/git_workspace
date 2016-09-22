package com.wandoujia.p4.pay.fragment;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.TextView;
import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.model.PayMethod;
import com.wandoujia.p4.pay.storage.LocalStorage;

class PayFragment$5$1
  implements AdapterView.OnItemSelectedListener
{
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = (int)PayFragment.access$200(this.this$1.this$0).getSelectedItemId();
    if (((PayMethod.getByTitle(this.this$1.val$payMethodList[i]).equals(PayMethod.ALIPAY)) || (PayMethod.getByTitle(this.this$1.val$payMethodList[i]).equals(PayMethod.UNIONPAY))) && (paramInt == -1 + PayFragment.access$2100(this.this$1.this$0).length))
    {
      PayFragment.access$400(this.this$1.this$0).setVisibility(8);
      PayFragment.access$500(this.this$1.this$0).setVisibility(0);
      PayFragment.access$500(this.this$1.this$0).setText(PayFragment.access$600(this.this$1.this$0).showMoney(PayFragment.access$300(this.this$1.this$0).getDefaultMoney().longValue()));
    }
  }

  public void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.5.1
 * JD-Core Version:    0.6.0
 */