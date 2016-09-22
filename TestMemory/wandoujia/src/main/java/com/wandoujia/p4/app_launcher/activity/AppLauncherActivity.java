package com.wandoujia.p4.app_launcher.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import android.view.Window;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.launcher_base.activity.LauncherBaseActivity;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.p4.app_launcher.fragment.ALHomeFragment;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;

public class AppLauncherActivity extends LauncherBaseActivity
{
  private void a(Intent paramIntent)
  {
    if (paramIntent == null);
    Bundle localBundle;
    do
    {
      return;
      localBundle = paramIntent.getExtras();
    }
    while ((localBundle == null) || (!TextUtils.equals(localBundle.getString("type"), "show_disk_clean_alert_dialog")));
    com.wandoujia.p4.app_launcher.c.a.a(this, localBundle.getString("value"), new a(this));
    Config.j(0L);
    TaskEvent.Builder localBuilder = new TaskEvent.Builder().action(TaskEvent.Action.PUSH).status(TaskEvent.Status.END).result(TaskEvent.Result.SUCCESS);
    localBuilder.view_log_package(new ViewLogPackage.Builder().module(Logger.Module.NOTIFICATION.name().toLowerCase()).action(ViewLogPackage.Action.REDIRECT).element(ViewLogPackage.Element.NOTIFICATION).name("push_al_no_enough_space").build());
    ExtraPackage.Builder localBuilder1 = new ExtraPackage.Builder();
    i.k().h().a(localBuilder, localBuilder1);
  }

  public void finish()
  {
    super.finish();
    overridePendingTransition(0, 0);
  }

  public void onBackPressed()
  {
    if ((getSupportFragmentManager().a(2131493502) instanceof com.wandoujia.launcher_base.c.a.a))
      return;
    finish();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    overridePendingTransition(0, 0);
    a(getIntent());
    if (SystemUtil.aboveApiLevel(19))
    {
      getWindow().setFlags(67108864, 67108864);
      getWindow().setFlags(134217728, 134217728);
    }
    setContentView(2130903213);
    getSupportFragmentManager().a().b(2131493502, new ALHomeFragment()).a();
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.activity.AppLauncherActivity
 * JD-Core Version:    0.6.0
 */