package com.wandoujia.jupiter.fragment;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.ripple_framework.ripple.fragment.FeedDetailFragment;

public class JupiterFeedDetailFragment extends FeedDetailFragment
{
  protected final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    View localView1 = this.toolbarContainer.findViewById(2131493951);
    View localView2 = this.toolbarContainer.findViewById(2131493952);
    if (localView1 != null)
      localView1.setVisibility(8);
    if (localView2 != null)
      localView2.setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.JupiterFeedDetailFragment
 * JD-Core Version:    0.6.0
 */