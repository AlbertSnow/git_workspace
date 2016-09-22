package com.wandoujia.p4.app_launcher.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.jupiter.activity.JupiterDialogActivity;

public class CleanPopupActivity extends JupiterDialogActivity
{
  protected Intent createBackIntent()
  {
    return null;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(GlobalConfig.getAppContext().getString(2131624352));
    b(GlobalConfig.getAppContext().getString(2131624346));
    b(getString(2131624345), new b(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.activity.CleanPopupActivity
 * JD-Core Version:    0.6.0
 */