package com.wandoujia.accessibility.hibernation.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.wandoujia.ripple_framework.accessibility.R.id;
import com.wandoujia.ripple_framework.accessibility.R.layout;

public class AppAutoInstallSettingPopupDialogActivity extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.auto_install_setting_card);
    findViewById(R.id.action_button).setOnClickListener(new a(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.activity.AppAutoInstallSettingPopupDialogActivity
 * JD-Core Version:    0.6.0
 */