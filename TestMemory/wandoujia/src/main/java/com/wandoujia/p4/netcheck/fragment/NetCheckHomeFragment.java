package com.wandoujia.p4.netcheck.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.p4.fragment.AsyncLoadFragment;

public class NetCheckHomeFragment extends AsyncLoadFragment
{
  protected int getLayoutResId()
  {
    return 2130903087;
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    CheckBox localCheckBox = (CheckBox)paramView.findViewById(2131493232);
    if (NetworkUtil.isMobileNetworkConnected(paramView.getContext()))
    {
      paramView.findViewById(2131493233).setVisibility(0);
      localCheckBox.setVisibility(0);
    }
    ((Button)paramView.findViewById(2131493231)).setOnClickListener(new h(this, localCheckBox));
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
 * Qualified Name:     com.wandoujia.p4.netcheck.fragment.NetCheckHomeFragment
 * JD-Core Version:    0.6.0
 */