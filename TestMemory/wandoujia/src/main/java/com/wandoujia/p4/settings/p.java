package com.wandoujia.p4.settings;

import android.support.v4.app.d;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.launcher.launcher.utils.b;

final class p
  implements View.OnClickListener
{
  p(MainSettingActivity paramMainSettingActivity, com.wandoujia.ripple_framework.view.a.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    if (!AppManager.a().h("com.wandoujia.game_launcher"))
    {
      d.d(false);
      com.wandoujia.launcher.e.a.a();
    }
    while (true)
    {
      MainSettingActivity.d(this.b);
      this.a.dismiss();
      return;
      b.a(true);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.p
 * JD-Core Version:    0.6.0
 */