package com.wandoujia.p4.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public final class SettingActivityHelper
{
  public static String a = "selection_preference_key";

  public static void a(Context paramContext, SettingActivityHelper.SettingActivityLabel paramSettingActivityLabel)
  {
    Intent localIntent = new Intent(paramContext, SettingActivityHelper.SettingActivityLabel.access$000(paramSettingActivityLabel));
    if (!TextUtils.isEmpty(null))
      localIntent.putExtra(a, null);
    if ((paramContext instanceof Activity))
    {
      paramContext.startActivity(localIntent);
      return;
    }
    localIntent.setFlags(268435456);
    paramContext.startActivity(localIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.SettingActivityHelper
 * JD-Core Version:    0.6.0
 */