package com.wandoujia.jupiter.library.fragment;

import android.support.v7.widget.cc;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class GiftLibFragment extends ListFragment
{
  protected final cc b()
  {
    return new aq(this, this.a);
  }

  public void onDestroyView()
  {
    ((BaseActivity)getActivity()).removeList(this.k);
    super.onDestroyView();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.GiftLibFragment
 * JD-Core Version:    0.6.0
 */