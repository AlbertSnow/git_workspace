package com.wandoujia.p4.pay.fragment;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.wandoujia.p4.pay.loader.Fetcher;

class FeedbackFragment$1
  implements AbsListView.OnScrollListener
{
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 + paramInt1 != paramInt3) || (paramInt3 == FeedbackFragment.access$000(this.this$0)))
      return;
    FeedbackFragment.access$002(this.this$0, paramInt3);
    FeedbackFragment.access$100(this.this$0).fetchMore();
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.FeedbackFragment.1
 * JD-Core Version:    0.6.0
 */