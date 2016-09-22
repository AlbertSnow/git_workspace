package com.wandoujia.p4.pay.fragment;

import android.text.TextUtils;
import com.wandoujia.p4.pay.adapter.PaymentRecordsAdapter;
import com.wandoujia.p4.pay.loader.Fetcher.FetchCallback;
import com.wandoujia.p4.pay.model.RecordItemInfo;
import java.util.List;

class FeedbackFragment$3
  implements Fetcher.FetchCallback
{
  public String doFetch(int paramInt1, int paramInt2)
  {
    return this.this$0.loadRecords(this.this$0.getActivity(), 2, paramInt1, paramInt2);
  }

  public int onFetched(String paramString, int paramInt1, int paramInt2)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      FeedbackFragment.access$502(this.this$0, RecordItemInfo.getRecordList(2, paramString));
      if (FeedbackFragment.access$500(this.this$0) != null)
        return FeedbackFragment.access$500(this.this$0).size();
    }
    return 0;
  }

  public void onPostFetch(String paramString, int paramInt1, int paramInt2)
  {
    PaymentRecordsAdapter localPaymentRecordsAdapter = FeedbackFragment.access$200(this.this$0);
    List localList = FeedbackFragment.access$500(this.this$0);
    if (paramInt1 == 0);
    for (boolean bool = true; ; bool = false)
    {
      localPaymentRecordsAdapter.update(localList, bool);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.FeedbackFragment.3
 * JD-Core Version:    0.6.0
 */