package com.wandoujia.p4.settings;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.app_launcher.f.b;
import com.wandoujia.ripple_framework.view.a.a;

final class o
  implements View.OnClickListener
{
  o(MainSettingActivity paramMainSettingActivity, a parama)
  {
  }

  public final void onClick(View paramView)
  {
    b.a(true);
    MainSettingActivity.d(this.b);
    this.a.dismiss();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.o
 * JD-Core Version:    0.6.0
 */