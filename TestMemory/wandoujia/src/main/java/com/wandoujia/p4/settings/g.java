package com.wandoujia.p4.settings;

import android.content.Intent;
import com.wandoujia.accessibility.AccessibilityManager;

final class g
  implements com.wandoujia.accessibility.j
{
  g(MainSettingActivity paramMainSettingActivity)
  {
  }

  public final void a()
  {
    com.wandoujia.jupiter.j.a().a("accessibility");
    AccessibilityManager.b(this);
    Intent localIntent = new Intent(this.a, MainSettingActivity.class);
    localIntent.addFlags(67108864);
    this.a.startActivity(localIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.g
 * JD-Core Version:    0.6.0
 */