package com.wandoujia.p4.app_launcher.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.p4.app_launcher.g.b;
import java.util.Iterator;
import java.util.List;

public final class j extends com.wandoujia.launcher_base.launcher.c.a
{
  private b a;
  private com.wandoujia.p4.app.upgrade.k b;

  private void b(int paramInt)
  {
    if (this.a != null)
      this.a.a().setText(String.valueOf(paramInt));
  }

  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    int i;
    if (paramView == null)
    {
      b localb = b.a(paramViewGroup);
      paramView = localb.getView();
      paramView.setOnClickListener(new k());
      this.a = localb;
      if (this.b == null)
      {
        this.b = new l(this);
        com.wandoujia.p4.app.upgrade.a.a(this.b);
      }
      Iterator localIterator = AppManager.a().i().iterator();
      i = 0;
      if (localIterator.hasNext())
        if (((LocalAppInfo)localIterator.next()).isUpgradeIgnored())
          break label119;
    }
    label119: for (int j = i + 1; ; j = i)
    {
      i = j;
      break;
      b(i);
      return paramView;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.j
 * JD-Core Version:    0.6.0
 */