package com.wandoujia.ripple_framework.ripple.fragment;

import android.view.View;
import com.wandoujia.ripple_framework.R.id;

final class h
  implements Runnable
{
  h(FeedDetailFragment paramFeedDetailFragment)
  {
  }

  public final void run()
  {
    if (!this.a.isAdded())
      return;
    this.a.getView().findViewById(R.id.stub_background).setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.fragment.h
 * JD-Core Version:    0.6.0
 */