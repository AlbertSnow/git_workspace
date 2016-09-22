package com.wandoujia.p4.fragment;

import android.os.Bundle;

public abstract class NetworkAsyncLoadFragment extends AsyncLoadFragment
{
  private boolean isLoaded;

  protected boolean needToLoadData()
  {
    return true;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }

  public void onDestroy()
  {
    super.onDestroy();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.fragment.NetworkAsyncLoadFragment
 * JD-Core Version:    0.6.0
 */