package com.wandoujia.p4.settings;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.utils.ShortcutUtil;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.view.a.a;

final class n
  implements View.OnClickListener
{
  n(MainSettingActivity paramMainSettingActivity, a parama)
  {
  }

  public final void onClick(View paramView)
  {
    ShortcutUtil.a(i.k().g(), false);
    MainSettingActivity.d(this.b);
    this.a.dismiss();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.n
 * JD-Core Version:    0.6.0
 */