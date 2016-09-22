package com.wandoujia.jupiter.activity;

import android.app.Activity;
import android.os.Bundle;
import com.wandoujia.jupiter.view.AutoInstallCardView;

public class AppAutoInstallHintDialogActivity extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903163);
    AutoInstallCardView localAutoInstallCardView = (AutoInstallCardView)findViewById(2131493411);
    localAutoInstallCardView.setIsFromCard(false);
    localAutoInstallCardView.setListener(new a(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.AppAutoInstallHintDialogActivity
 * JD-Core Version:    0.6.0
 */