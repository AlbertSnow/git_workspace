package com.wandoujia.p4.app_launcher.b;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.wandoujia.base.utils.MemoryUtil;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.p4.app_launcher.clean.widget.CleanWidget;
import com.wandoujia.p4.app_launcher.clean.widget.a;

final class r
  implements View.OnClickListener
{
  r(o paramo, long paramLong, CleanWidget paramCleanWidget)
  {
  }

  public final void onClick(View paramView)
  {
    long l = 100L * this.a / MemoryUtil.getTotalMemory();
    String str = paramView.getContext().getResources().getString(2131624349);
    v localv = v.b().a(paramView, "app_launcher");
    ViewLogPackage.Element localElement = ViewLogPackage.Element.BUTTON;
    ViewLogPackage.Action localAction = ViewLogPackage.Action.REDIRECT;
    localv.a(paramView, localElement, localAction, str, Long.valueOf(l)).d(paramView);
    o.b(this.c).a(3);
    this.b.getStatusText().setText(2131624344);
    o.b(this.c, this.b);
    this.b.setEnabled(false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.r
 * JD-Core Version:    0.6.0
 */