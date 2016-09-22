package com.wandoujia.p4.app_launcher.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.launcher_base.view.stateful.view.DoubleIcon;
import com.wandoujia.p4.app_launcher.model.b;

public final class g extends com.wandoujia.launcher_base.launcher.c.a
{
  private b a;
  private com.wandoujia.p4.app_launcher.g.a b;

  public g(b paramb)
  {
    this.a = paramb;
  }

  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      this.b = com.wandoujia.p4.app_launcher.g.a.a(paramViewGroup);
      com.wandoujia.p4.app_launcher.g.a locala = this.b;
      b localb = this.a;
      if (locala.b() != null)
        locala.b().setText(localb.b());
      if (locala.a() != null)
      {
        locala.a().a(localb.d(), 0);
        locala.a().setIconSmallByPackage$505cff1c(localb.f());
      }
      if ((locala.getView() != null) && (localb.c() != null))
        locala.getView().setOnClickListener(new h(localb));
      paramView = this.b.getView();
    }
    return paramView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.g
 * JD-Core Version:    0.6.0
 */