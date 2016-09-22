package com.wandoujia.jupiter.library.presenter;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.jupiter.library.activity.LibActivity;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import de.greenrobot.event.c;

final class h
  implements View.OnClickListener
{
  h(g paramg, Model paramModel, View paramView)
  {
  }

  public final void onClick(View paramView)
  {
    if (((paramView.getContext() instanceof LibActivity)) && (!((LibActivity)paramView.getContext()).a()))
    {
      if (this.a.t() != null)
        ((NavigationManager)i.k().a("navigation")).a(paramView.getContext(), this.a, this.c.e());
      return;
    }
    if (this.a.a((int)this.a.e()) != null);
    for (boolean bool1 = ((Boolean)this.a.a((int)this.a.e())).booleanValue(); ; bool1 = false)
    {
      j localj = new j();
      localj.a = this.a.F().package_name;
      if (!bool1);
      for (boolean bool2 = true; ; bool2 = false)
      {
        localj.b = bool2;
        ((c)i.k().a("event_bus")).d(new com.wandoujia.ripple_framework.j(EventBusManager.Type.MULTI_UNINSTALL_SELECT, localj));
        if (!bool1)
          break;
        this.b.setVisibility(8);
        this.a.a((int)this.a.e(), Boolean.valueOf(false));
        return;
      }
      this.b.setVisibility(0);
      this.a.a((int)this.a.e(), Boolean.valueOf(true));
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.presenter.h
 * JD-Core Version:    0.6.0
 */