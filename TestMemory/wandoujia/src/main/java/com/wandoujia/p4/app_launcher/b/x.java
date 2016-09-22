package com.wandoujia.p4.app_launcher.b;

import android.content.Context;
import android.content.Intent;
import com.wandoujia.p4.app.activity.AppAutoInstallSettingPopupDialogActivity;

final class x
  implements Runnable
{
  x(Context paramContext)
  {
  }

  public final void run()
  {
    Intent localIntent = new Intent(this.a, AppAutoInstallSettingPopupDialogActivity.class);
    localIntent.addFlags(32768);
    localIntent.addFlags(268435456);
    this.a.startActivity(localIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.x
 * JD-Core Version:    0.6.0
 */