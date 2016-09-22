package com.wandoujia.jupiter.library.presenter;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.model.Model;
import de.greenrobot.event.c;

final class i
  implements View.OnLongClickListener
{
  i(View paramView, Model paramModel)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    this.a.setVisibility(0);
    this.b.a((int)this.b.e(), Boolean.valueOf(true));
    j localj = new j();
    localj.a = this.b.F().package_name;
    localj.b = true;
    ((c)com.wandoujia.ripple_framework.i.k().a("event_bus")).d(new com.wandoujia.ripple_framework.j(EventBusManager.Type.MULTI_UNINSTALL_SELECT, localj));
    ((c)com.wandoujia.ripple_framework.i.k().a("event_bus")).d(new com.wandoujia.ripple_framework.j(EventBusManager.Type.MULTI_UNINSTALL, Boolean.valueOf(true)));
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.presenter.i
 * JD-Core Version:    0.6.0
 */