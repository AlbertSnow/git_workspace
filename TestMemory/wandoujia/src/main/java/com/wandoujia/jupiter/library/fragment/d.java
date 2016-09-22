package com.wandoujia.jupiter.library.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.j;
import de.greenrobot.event.c;

final class d
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    ((c)i.k().a("event_bus")).d(new j(EventBusManager.Type.MULTI_UNINSTALL, Boolean.valueOf(false)));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.d
 * JD-Core Version:    0.6.0
 */