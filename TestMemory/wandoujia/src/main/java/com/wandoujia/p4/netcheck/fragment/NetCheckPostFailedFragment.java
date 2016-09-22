package com.wandoujia.p4.netcheck.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.wandoujia.p4.fragment.AsyncLoadFragment;
import com.wandoujia.p4.netcheck.controller.NetCheckController;

public class NetCheckPostFailedFragment extends AsyncLoadFragment
{
  private NetCheckController a;

  public final void a(NetCheckController paramNetCheckController)
  {
    this.a = paramNetCheckController;
  }

  protected int getLayoutResId()
  {
    return 2130903089;
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    ((Button)paramView.findViewById(2131493235)).setOnClickListener(new i(this));
    ((Button)paramView.findViewById(2131493236)).setOnClickListener(new j(this));
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
 * Qualified Name:     com.wandoujia.p4.netcheck.fragment.NetCheckPostFailedFragment
 * JD-Core Version:    0.6.0
 */