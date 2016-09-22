package com.wandoujia.p4.app_launcher.b;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.p4.app_launcher.clean.widget.CircleProgressBar;
import com.wandoujia.p4.app_launcher.clean.widget.CleanWidget;
import com.wandoujia.ripple_framework.i;
import de.greenrobot.event.c;

public final class z extends com.wandoujia.launcher_base.launcher.c.a
{
  private CleanWidget a;

  protected final View a(View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    if (paramView != null)
    {
      paramView.getTag(2131492878);
      localObject = paramView;
    }
    while (true)
    {
      if ((localObject instanceof CleanWidget))
      {
        this.a = ((CleanWidget)localObject);
        CleanWidget localCleanWidget = (CleanWidget)localObject;
        localCleanWidget.getStatusText().setText(2131625470);
        localCleanWidget.getCircleProgressBar().setProgress(0);
        localCleanWidget.setOnClickListener(new ab());
        View localView = localCleanWidget.getView();
        v localv = v.b().a(localView, "app_launcher");
        ViewLogPackage.Element localElement = ViewLogPackage.Element.BUTTON;
        ViewLogPackage.Action localAction = ViewLogPackage.Action.REDIRECT;
        localv.a(localView, localElement, localAction, "ONEKEY_CLEAN", Long.valueOf(0L)).d(localView);
      }
      return localObject;
      localObject = CleanWidget.a(paramViewGroup);
      ((View)localObject).setTag(2131492878, new aa(0));
    }
  }

  public final void a(ViewGroup paramViewGroup)
  {
    super.a(paramViewGroup);
    c localc = (c)i.k().a("event_bus");
    if (!localc.b(this))
      localc.a(this);
  }

  public final void d()
  {
    super.d();
    c localc = (c)i.k().a("event_bus");
    if (localc.b(this))
      localc.c(this);
  }

  public final void onEventMainThread(com.wandoujia.p4.app_launcher.d.a parama)
  {
    int i = parama.a();
    if (i == 0)
    {
      this.a.getCircleProgressBar().setSecondColor(this.a.getResources().getColor(2131361895));
      this.a.getProgressImg().setImageResource(2130838342);
    }
    do
    {
      return;
      if (i != 1)
        continue;
      this.a.getCircleProgressBar().setSecondColor(this.a.getResources().getColor(2131361897));
      this.a.getProgressImg().setImageResource(2130838343);
      return;
    }
    while (i != 2);
    this.a.getCircleProgressBar().setSecondColor(this.a.getResources().getColor(2131361892));
    this.a.getProgressImg().setImageResource(2130838341);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.z
 * JD-Core Version:    0.6.0
 */