package com.wandoujia.p4.community.fragmant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.ripple_framework.fragment.BaseFragment;

public class CommunityBallotCompleteFragment extends BaseFragment
{
  protected boolean initializePageUri(View paramView)
  {
    return false;
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903193, null);
    localView.findViewById(2131493465).setOnClickListener(new d(this));
    setTitle(getString(2131624413));
    return localView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityBallotCompleteFragment
 * JD-Core Version:    0.6.0
 */