package com.wandoujia.p4.settings;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.ripple_framework.Config;
import com.wandoujia.ripple_framework.i;

public class NotifySettingActivity extends a
{
  protected final int a()
  {
    if ((Config.e()) || (OemUtil.isOemOrPaid()))
      return 2131099655;
    return 2131099654;
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    if (paramString.equals("setting_enable_push"))
    {
      b("notification_recommend", paramBoolean);
      SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(i.k().g()).edit();
      localEditor.putBoolean("setting_enable_push", paramBoolean);
      SharePrefSubmitor.submit(localEditor);
    }
    do
    {
      return;
      if (paramString.equals("setting_enable_battery_notify"))
      {
        b("notification_battery", paramBoolean);
        return;
      }
      if (!paramString.equals("setting_enable_clean_notify"))
        continue;
      b("notification_clean", paramBoolean);
      return;
    }
    while (!paramString.equals("setting_alert_update"));
    b("notification_update", paramBoolean);
  }

  protected final SettingActivityHelper.SettingActivityLabel b()
  {
    return SettingActivityHelper.SettingActivityLabel.NOTIFY;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.NotifySettingActivity
 * JD-Core Version:    0.6.0
 */