package com.wandoujia.p4.netcheck.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.wandoujia.p4.fragment.AsyncLoadFragment;

public class NetCheckFailedFragment extends AsyncLoadFragment
{
  protected int getLayoutResId()
  {
    return 2130903083;
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    ((Button)paramView.findViewById(2131493208)).setOnClickListener(new f(this));
  }

  protected void onPrepareLoading()
  {
  }

  protected void onStartLoading()
  {
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    setTitle(getString(2131625172));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.fragment.NetCheckFailedFragment
 * JD-Core Version:    0.6.0
 */