package com.wandoujia.jupiter.library.presenter;

import android.view.View;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.j;
import com.wandoujia.ripple_framework.model.Model;

public final class g extends com.wandoujia.ripple_framework.c.c
{
  public final void a()
  {
    super.a();
    ((de.greenrobot.event.c)com.wandoujia.ripple_framework.i.k().a("event_bus")).c(this);
  }

  protected final void a(Model paramModel)
  {
    ((de.greenrobot.event.c)com.wandoujia.ripple_framework.i.k().a("event_bus")).a(this);
    View localView = h().b(2131493669).a();
    if (paramModel.a((int)paramModel.e()) != null);
    for (boolean bool = ((Boolean)paramModel.a((int)paramModel.e())).booleanValue(); ; bool = false)
    {
      if (bool)
        localView.setVisibility(0);
      while (true)
      {
        e().setOnClickListener(new h(this, paramModel, localView));
        e().setOnLongClickListener(new i(localView, paramModel));
        return;
        localView.setVisibility(8);
      }
    }
  }

  public final void onEventMainThread(j paramj)
  {
    if ((paramj.a == EventBusManager.Type.MULTI_UNINSTALL) && ((paramj.b instanceof Boolean)) && (!((Boolean)paramj.b).booleanValue()))
      h().b(2131493669).f(8);
    do
      return;
    while ((paramj.a != EventBusManager.Type.UNINSTALL_ALL) || (!(paramj.b instanceof Boolean)));
    if (((Boolean)paramj.b).booleanValue())
    {
      h().b(2131493669).f(0);
      return;
    }
    h().b(2131493669).f(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.presenter.g
 * JD-Core Version:    0.6.0
 */