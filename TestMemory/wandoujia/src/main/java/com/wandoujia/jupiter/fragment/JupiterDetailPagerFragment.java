package com.wandoujia.jupiter.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.wandoujia.ripple_framework.ripple.fragment.DetailPagerFragment;

public class JupiterDetailPagerFragment extends DetailPagerFragment
{
  public final Fragment a(int paramInt)
  {
    switch (ac.a[((com.wandoujia.ripple_framework.model.Model)this.c.b().get(paramInt)).f().ordinal()])
    {
    default:
    case 1:
    }
    for (JupiterFeedDetailFragment localJupiterFeedDetailFragment = null; ; localJupiterFeedDetailFragment = new JupiterFeedDetailFragment())
    {
      Bundle localBundle = localJupiterFeedDetailFragment.getArguments();
      if (localBundle == null)
      {
        localBundle = new Bundle();
        localJupiterFeedDetailFragment.setArguments(localBundle);
      }
      localBundle.putInt("position", paramInt);
      return localJupiterFeedDetailFragment;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.JupiterDetailPagerFragment
 * JD-Core Version:    0.6.0
 */