package com.wandoujia.p4.pay.fragment;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.wandoujia.p4.pay.adapter.PaymentRecordsAdapter;
import com.wandoujia.p4.pay.utils.SLog;
import com.wandoujia.p4.pay.widget.ListViewSpinner;

class FeedbackFragment$2
  implements AdapterView.OnItemClickListener
{
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.this$0.currentFeeddbackContent = this.this$0.getOrderFeedbackContent(FeedbackFragment.access$200(this.this$0).getItem(paramInt));
    FeedbackFragment.access$300(this.this$0).setText(this.this$0.currentFeedbackBasicInfo);
    SLog.i(FeedbackFragment.access$400(), "FeedbackTitle: " + this.this$0.currentFeedbackBasicInfo + "; Feedback Content: " + this.this$0.currentFeeddbackContent);
    FeedbackFragment.access$300(this.this$0).disMiss();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.FeedbackFragment.2
 * JD-Core Version:    0.6.0
 */