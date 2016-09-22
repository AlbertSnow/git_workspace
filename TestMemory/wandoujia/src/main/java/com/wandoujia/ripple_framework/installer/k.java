package com.wandoujia.ripple_framework.installer;

import android.support.v4.app.d;
import android.widget.Toast;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.base.utils.Preferences;
import com.wandoujia.base.utils.Preferences.CustomEditor;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.app.activity.DownloadInjectorDialogActivity;
import com.wandoujia.launcher.e.a;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.online_config.ConfigStorage;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;

public final class k
{
  private l a;

  public k()
  {
    ((de.greenrobot.event.c)i.k().a("event_bus")).a(this);
  }

  public final void a(Model paramModel, l paraml)
  {
    this.a = paraml;
    if (!NetworkUtil.isNetworkConnected())
    {
      paraml.a(AppTaskManager.Status.PAUSE, paramModel);
      if ((paramModel.F() != null) && (!CollectionUtils.isEmpty(paramModel.F().apk)));
    }
    label54: label127: int j;
    label212: label217: label224: 
    do
    {
      return;
      Toast.makeText(JupiterApplication.e(), 2131624656, 1).show();
      int i;
      if ((paramModel != null) && (paramModel.F() != null) && (OemUtil.isAllowCreateShortcut()))
      {
        if (!"GAME".equalsIgnoreCase(paramModel.F().app_type))
          break label212;
        com.wandoujia.online_config.c.a();
        if ((!ConfigStorage.a("enable_download_recommend_gl", true)) || (Config.aj()) || (AppManager.a().h("com.wandoujia.game_launcher")) || (a.c(GlobalConfig.getAppContext())))
          break label212;
        i = 1;
        if (i == 0)
          break label224;
        if (AppManager.a().h("com.wandoujia.game_launcher"))
          break label217;
        d.d(false);
        a.a();
      }
      while (true)
      {
        Config.ak();
        android.support.v4.app.b.a(TaskEvent.Status.END, TaskEvent.Result.SUCCESS, TaskEvent.Action.OPEN, android.support.v4.app.b.a("game_download", ViewLogPackage.Element.PAGE, ViewLogPackage.Action.DOWNLOAD, "create_shortcut_icon"), "");
        return;
        if (NetworkUtil.isWifiConnected(JupiterApplication.e()))
        {
          paraml.a(AppTaskManager.Status.CREATED, paramModel);
          break label54;
        }
        DownloadInjectorDialogActivity.a(JupiterApplication.e(), paramModel);
        break label54;
        break;
        i = 0;
        break label127;
        com.wandoujia.launcher.launcher.utils.b.a(true);
      }
      boolean bool1 = "APP".equalsIgnoreCase(paramModel.F().app_type);
      j = 0;
      if (!bool1)
        continue;
      boolean bool2 = com.wandoujia.p4.app_launcher.manager.b.a().getBoolean("key_first_download_create_icon", false);
      j = 0;
      if (bool2)
        continue;
      j = 1;
    }
    while (j == 0);
    SharePrefSubmitor.submit(com.wandoujia.p4.app_launcher.manager.b.a().edit().putBoolean("key_first_download_create_icon", true));
    com.wandoujia.p4.app_launcher.f.b.a(true);
  }

  public final void onEvent(com.wandoujia.jupiter.b.a.b paramb)
  {
    if (paramb == null)
      return;
    this.a.a(paramb.b, paramb.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.k
 * JD-Core Version:    0.6.0
 */