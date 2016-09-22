package com.wandoujia.jupiter.library.presenter;

import android.view.View;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.j;
import com.wandoujia.ripple_framework.view.aw;
import de.greenrobot.event.c;

final class n
  implements aw
{
  public final void a(View paramView, int paramInt, boolean paramBoolean)
  {
    ((c)i.k().a("event_bus")).d(com.wandoujia.jupiter.library.fragment.AppInstalledFragment.SortType.values()[paramInt]);
    ((c)i.k().a("event_bus")).d(new j(EventBusManager.Type.MULTI_UNINSTALL, Boolean.valueOf(false)));
    m.a(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.presenter.n
 * JD-Core Version:    0.6.0
 */