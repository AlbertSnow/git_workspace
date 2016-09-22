package com.wandoujia.jupiter.subscribe.fragment;

import android.widget.TextView;
import com.wandoujia.p4.subscribe.core.h;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.j;
import de.greenrobot.event.c;

final class i
  implements h
{
  i(SubscribeOnBoardFragment paramSubscribeOnBoardFragment)
  {
  }

  public final void a(com.wandoujia.p4.subscribe.core.b paramb)
  {
    if (android.support.v4.app.b.a(this.a.getActivity()))
      ((c)com.wandoujia.ripple_framework.i.k().a("event_bus")).d(new j(EventBusManager.Type.HOMEPAGE_REFRESH, null));
  }

  public final void b(com.wandoujia.p4.subscribe.core.b paramb)
  {
    if ((SubscribeOnBoardFragment.c(this.a) != null) && (android.support.v4.app.b.a(this.a.getActivity())))
      SubscribeOnBoardFragment.c(this.a).setEnabled(true);
  }

  public final void c(com.wandoujia.p4.subscribe.core.b paramb)
  {
  }

  public final void d(com.wandoujia.p4.subscribe.core.b paramb)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.i
 * JD-Core Version:    0.6.0
 */