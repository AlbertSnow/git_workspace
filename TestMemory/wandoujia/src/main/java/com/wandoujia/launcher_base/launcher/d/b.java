package com.wandoujia.launcher_base.launcher.d;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.wandoujia.logv3.model.packages.ContentPackage.Type;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;

final class b
  implements View.OnClickListener
{
  b(a parama, PopupWindow paramPopupWindow)
  {
  }

  public final void onClick(View paramView)
  {
    if (!TextUtils.isEmpty(a.a(this.b)))
    {
      if (a.b(this.b) != -1)
        android.support.v4.app.b.b(paramView, a.b(this.b));
      android.support.v4.app.b.a(paramView, a.c(this.b), a.d(this.b), ContentPackage.Type.APP);
      android.support.v4.app.b.a(paramView, a.a(this.b), ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.UNINSTALL, "uninstall_app");
    }
    new com.wandoujia.launcher_base.app.a.a(paramView.getContext(), a.c(this.b), a.d(this.b)).execute();
    this.a.dismiss();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.d.b
 * JD-Core Version:    0.6.0
 */