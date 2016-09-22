package com.wandoujia.jupiter.toolbar;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.ripple_framework.i;

final class a
  implements MenuItem.OnMenuItemClickListener
{
  a(JupiterToolbar paramJupiterToolbar)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    ((NavigationManager)i.k().a("navigation")).a(this.a.getContext(), new Action.Builder().intent("wdj://me/downloads").build());
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.toolbar.a
 * JD-Core Version:    0.6.0
 */