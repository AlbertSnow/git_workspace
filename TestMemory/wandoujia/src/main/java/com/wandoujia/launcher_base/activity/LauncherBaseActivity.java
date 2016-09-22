package com.wandoujia.launcher_base.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.wandoujia.logv3.toolkit.v;

public class LauncherBaseActivity extends FragmentActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    v.b().a(this, getIntent(), paramBundle);
  }

  protected void onDestroy()
  {
    super.onDestroy();
    v.b().a(this);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    v.b().a(this, getIntent());
  }

  protected void onRestart()
  {
    super.onRestart();
    v.b().b(this, getIntent());
  }

  protected void onUserLeaveHint()
  {
    super.onUserLeaveHint();
    v.b().b(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.activity.LauncherBaseActivity
 * JD-Core Version:    0.6.0
 */