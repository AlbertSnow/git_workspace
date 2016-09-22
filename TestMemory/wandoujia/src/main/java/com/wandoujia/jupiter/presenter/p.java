package com.wandoujia.jupiter.presenter;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.ripple_framework.i;

final class p
  implements View.OnClickListener
{
  p(o paramo)
  {
  }

  public final void onClick(View paramView)
  {
    ((NavigationManager)i.k().a("navigation")).a(this.a.f(), new Action.Builder().intent("wdj://detail/app/history_info").build());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.p
 * JD-Core Version:    0.6.0
 */