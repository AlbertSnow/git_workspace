package com.wandoujia.p4.button.views;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.views.NirvanaListPopupWindow;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import java.util.List;

final class f
  implements AdapterView.OnItemClickListener
{
  f(SubActionButton paramSubActionButton)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    i locali = (i)SubActionButton.b(this.a).get(paramInt);
    if (locali.b != null)
    {
      com.wandoujia.ripple_framework.i.k().h().a(paramView, Logger.Module.UI, ViewLogPackage.Element.SUB_ACTION, ViewLogPackage.Action.REDIRECT, locali.a, null).c(paramView);
      locali.b.execute();
    }
    SubActionButton.a(this.a).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.button.views.f
 * JD-Core Version:    0.6.0
 */