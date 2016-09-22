package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.h;

final class q extends h
{
  public final boolean a(View paramView)
  {
    ((NavigationManager)i.k().a("navigation")).a(paramView.getContext(), new Action.Builder().intent("wdj://detail/app/expand_info").build());
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.q
 * JD-Core Version:    0.6.0
 */