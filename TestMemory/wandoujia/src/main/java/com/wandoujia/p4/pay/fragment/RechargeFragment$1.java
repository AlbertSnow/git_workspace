package com.wandoujia.p4.pay.fragment;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.pay.model.PayChannel;
import com.wandoujia.p4.pay.model.PayChannel.RechargeItem;
import com.wandoujia.p4.pay.model.PayMethod;
import com.wandoujia.p4.pay.utils.SLog;
import java.util.List;

class RechargeFragment$1
  implements AdapterView.OnItemSelectedListener
{
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = 0;
    RechargeFragment.access$002(this.this$0, this.val$payMethodList[paramInt]);
    SLog.i("onItemSelected", paramInt + ":" + RechargeFragment.access$000(this.this$0));
    List localList = PayChannel.getRechargeMoneyList(RechargeFragment.access$000(this.this$0));
    if (localList == null)
    {
      if (this.this$0.getActivity() != null)
      {
        p.a(this.this$0.getActivity(), "网络请求失败，请重试。", p.b).a();
        this.this$0.getActivity().finish();
      }
      return;
    }
    String[] arrayOfString1;
    if (PayMethod.getByTitle(this.val$payMethodList[paramInt]).equals(PayMethod.SHENZHOUPAY))
    {
      RechargeFragment.access$100(this.this$0).setVisibility(0);
      PayMethod localPayMethod = PayMethod.getByTitle(this.val$payMethodList[paramInt]);
      RechargeFragment.access$200(this.this$0).setText(localPayMethod.describe());
      SLog.i("onItemSelected", localList.size());
      if ((!PayMethod.getByTitle(this.val$payMethodList[paramInt]).equals(PayMethod.ALIPAY)) && (!PayMethod.getByTitle(this.val$payMethodList[paramInt]).equals(PayMethod.UNIONPAY)))
        break label358;
      arrayOfString1 = new String[1 + localList.size()];
      arrayOfString1[localList.size()] = "手动输入";
    }
    int j;
    label358: String[] arrayOfString2;
    for (Object localObject = arrayOfString1; ; localObject = arrayOfString2)
    {
      j = 0;
      while (i < localList.size())
      {
        localObject[i] = ((PayChannel.RechargeItem)localList.get(i)).title;
        if (((PayChannel.RechargeItem)localList.get(i)).check)
        {
          RechargeFragment.access$502(this.this$0, Long.valueOf(((PayChannel.RechargeItem)localList.get(i)).money));
          j = i;
        }
        i++;
      }
      RechargeFragment.access$100(this.this$0).setVisibility(8);
      break;
      arrayOfString2 = new String[localList.size()];
      RechargeFragment.access$300(this.this$0).setVisibility(0);
      RechargeFragment.access$400(this.this$0).setVisibility(8);
    }
    ArrayAdapter localArrayAdapter = new ArrayAdapter(this.this$0.getActivity(), 2130903608, localObject);
    localArrayAdapter.setDropDownViewResource(17367049);
    RechargeFragment.access$300(this.this$0).setAdapter(localArrayAdapter);
    RechargeFragment.access$300(this.this$0).setSelection(j);
    RechargeFragment.access$300(this.this$0).setOnItemSelectedListener(new RechargeFragment.1.1(this, localObject));
  }

  public void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.RechargeFragment.1
 * JD-Core Version:    0.6.0
 */