package com.wandoujia.p4.app_launcher.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.launcher_base.view.stateful.view.DoubleIcon;

public final class a extends com.wandoujia.launcher_base.launcher.c.a
{
  private com.wandoujia.p4.app_launcher.model.a a;
  private com.wandoujia.p4.app_launcher.g.a b;

  public a(com.wandoujia.p4.app_launcher.model.a parama)
  {
    this.a = parama;
  }

  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      this.b = com.wandoujia.p4.app_launcher.g.a.a(paramViewGroup);
      com.wandoujia.p4.app_launcher.g.a locala = this.b;
      com.wandoujia.p4.app_launcher.model.a locala1 = this.a;
      if (locala.b() != null)
        locala.b().setText(locala1.b());
      if (locala.a() != null)
        locala.a().b(locala1.d(), 0);
      if (locala.getView() != null)
      {
        if (locala1.c() != null)
          locala.getView().setOnClickListener(new b(locala1));
        locala.getView().setOnLongClickListener(new c(locala1, locala));
      }
      paramView = this.b.getView();
    }
    return paramView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.a
 * JD-Core Version:    0.6.0
 */