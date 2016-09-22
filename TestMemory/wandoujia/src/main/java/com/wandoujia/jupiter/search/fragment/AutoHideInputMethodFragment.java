package com.wandoujia.jupiter.search.fragment;

import android.os.Bundle;
import android.view.View;
import com.wandoujia.base.utils.KeyboardUtils;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;

public class AutoHideInputMethodFragment extends ListFragment
{
  protected static void a(View paramView)
  {
    KeyboardUtils.hideSoftInput(paramView);
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.g.setOnTouchListener(new a());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.fragment.AutoHideInputMethodFragment
 * JD-Core Version:    0.6.0
 */