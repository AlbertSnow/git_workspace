package com.wandoujia.jupiter.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.accessibility.AccessibilityManager;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppChangedListener;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.jupiter.downloadreminder.NotInstallReminderActivity;
import com.wandoujia.jupiter.homepage.HomePageFragment;
import com.wandoujia.jupiter.homepage.splashwindow.k;
import com.wandoujia.jupiter.j;
import com.wandoujia.jupiter.onboard.OnboardActivity;
import com.wandoujia.jupiter.startpage.manager.LocalFeedManager;
import com.wandoujia.jupiter.update.UpdateNotification;
import com.wandoujia.jupiter.update.a;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.online_config.ConfigStorage;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.TypefaceManager;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.update.protocol.UpdateInfo;
import com.wandoujia.update.toolkit.SelfUpdateResult;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

public class HomeActivity extends BaseActivity
{
  private static boolean e = false;
  private String a;
  private UpdateNotification b;
  private p c;
  private boolean d = false;
  private LocalAppChangedListener f = new e();

  private void a(Intent paramIntent, boolean paramBoolean)
  {
    if ((paramIntent != null) && (paramIntent.getExtras() != null))
      this.a = paramIntent.getExtras().getString("page_intent_uri");
    if ((TextUtils.isEmpty(this.a)) && (paramIntent != null) && (paramIntent.getData() != null))
      this.a = paramIntent.getDataString();
    HomePageFragment localHomePageFragment1;
    boolean bool2;
    boolean bool1;
    label152: HomePageFragment localHomePageFragment3;
    try
    {
      localHomePageFragment1 = (HomePageFragment)getSupportFragmentManager().a("homePage");
      if (localHomePageFragment1 != null)
        break label324;
      HomePageFragment localHomePageFragment2 = new HomePageFragment();
      Bundle localBundle1 = new Bundle();
      if (!TextUtils.isEmpty(this.a))
        localBundle1.putString("page_intent_uri", this.a);
      if (!paramBoolean)
        break label318;
      if (paramIntent == null)
        break label351;
      localBundle2 = paramIntent.getExtras();
      if (localBundle2 == null)
        break label345;
      if (localBundle2.getBoolean("is_back_intent", false))
      {
        bool2 = false;
        if (!bool2)
          break label318;
        bool1 = true;
        localBundle1.putBoolean("CAN_SHOW_SPLASH_WINDOW", bool1);
        localHomePageFragment2.setArguments(localBundle1);
        localHomePageFragment3 = localHomePageFragment2;
        label172: LocalFeedManager localLocalFeedManager = (LocalFeedManager)j.a().a("local_feed");
        getSupportFragmentManager().a().b(16908290, localHomePageFragment3, "homePage").a();
        localLocalFeedManager.d();
        localLocalFeedManager.f();
        if (localLocalFeedManager.b() == 0L)
          localLocalFeedManager.a(System.currentTimeMillis());
        new Handler(Looper.getMainLooper()).postDelayed(new g(this), 1000L);
        i.k().a("type_face");
        TypefaceManager.a();
        return;
      }
    }
    catch (Exception localException)
    {
      Bundle localBundle2;
      while (true)
        localHomePageFragment1 = null;
      str = localBundle2.getString("page_intent_uri");
    }
    label287: if ((TextUtils.isEmpty(str)) && (paramIntent.getData() != null));
    label318: label324: label345: label351: for (String str = paramIntent.getDataString(); ; str = null)
    {
      bool2 = TextUtils.isEmpty(str);
      break;
      bool1 = false;
      break label152;
      if (localHomePageFragment1.isAdded())
        localHomePageFragment1.a(paramIntent);
      localHomePageFragment3 = localHomePageFragment1;
      break label172;
      str = null;
      break label287;
    }
  }

  public void onBackPressed()
  {
    if (k.l())
    {
      Model localModel = k.k();
      if (localModel != null)
        i.k().h().a(Logger.Module.SPLASH, ViewLogPackage.Action.REDIRECT, "back", Long.valueOf(1L), localModel.a());
    }
    List localList;
    if ((this.b == null) || (!this.b.b()))
    {
      localList = ((DownloadManager)i.k().a("download")).d();
      if (CollectionUtils.isEmpty(localList))
        super.onBackPressed();
    }
    else
    {
      return;
    }
    if (this.d)
    {
      super.onBackPressed();
      return;
    }
    int i = localList.size();
    long l = System.currentTimeMillis() - Config.f();
    com.wandoujia.online_config.c.a();
    com.wandoujia.online_config.l locall;
    int j;
    if (l >= ConfigStorage.a("jupiter_dialog_not_install_ignore_internal", 86400000))
    {
      com.wandoujia.online_config.c.a();
      if (i >= ConfigStorage.a("jupiter_dialog_not_install_promote_count", 3))
      {
        locall = Config.k();
        if (locall == null)
        {
          j = 1;
          if ((j == 0) || (!NotInstallReminderActivity.a(this, localList)))
            break label261;
        }
      }
    }
    label261: for (int k = 1; ; k = 0)
    {
      if (k != 0)
        break label267;
      super.onBackPressed();
      return;
      String str = String.valueOf(Calendar.getInstance().get(6));
      if (str.equals(locall.b()))
      {
        if (str.equals(locall.b()))
        {
          int m = locall.a();
          com.wandoujia.online_config.c.a();
          if (m >= ConfigStorage.a("jupiter_dialog_not_install_count_one_day", 3));
        }
      }
      else
      {
        j = 1;
        break;
      }
      j = 0;
      break;
    }
    label267: this.d = true;
  }

  protected void onCreate(Bundle paramBundle)
  {
    NoDexLaunchActivity.a(this);
    DexLoadingActivity.a(this);
    this.d = false;
    boolean bool1 = OnboardActivity.a(this, getIntent());
    super.onCreate(paramBundle);
    Intent localIntent1 = getIntent();
    String str;
    int i;
    if ((localIntent1 != null) && ("android.intent.action.MAIN".equals(localIntent1.getAction())))
    {
      ComponentName localComponentName = localIntent1.getComponent();
      if (localComponentName != null)
      {
        str = localComponentName.getClassName();
        if ("com.wandoujia.jupiter.activity.HomeActivity".equals(str))
        {
          if (isTaskRoot())
            break label149;
          finish();
          i = 1;
        }
      }
    }
    while (i != 0)
    {
      return;
      if ((localIntent1.getCategories() != null) && (localIntent1.getCategories().contains("android.intent.category.LAUNCHER")) && (getLocalClassName().equals(str)) && (!isTaskRoot()))
      {
        finish();
        i = 1;
        continue;
      }
      label149: i = 0;
    }
    Intent localIntent2 = getIntent();
    boolean bool2 = false;
    if (!bool1)
    {
      boolean bool3 = e;
      bool2 = false;
      if (!bool3)
        bool2 = true;
    }
    a(localIntent2, bool2);
    e = true;
    int j = Config.P();
    if (j <= 1)
      Config.e(j + 1);
    if (!"release".equals("dogfood"))
      "release".equals("dfjira");
    new Handler(Looper.getMainLooper()).postDelayed(new f(this), 1000L);
    ((AppManager)i.k().a("app")).a(this.f);
    ((de.greenrobot.event.c)i.k().a("event_bus")).a(this);
    new a().a();
  }

  protected void onDestroy()
  {
    super.onDestroy();
    ((de.greenrobot.event.c)i.k().a("event_bus")).c(this);
  }

  public void onEventMainThread(com.wandoujia.ripple_framework.installer.install.l paraml)
  {
    if ((paraml.a) && (PreferenceManager.getDefaultSharedPreferences(this).getBoolean("setting_root_install", false)))
      return;
    new Handler(Looper.getMainLooper()).postDelayed(new h(this), 500L);
  }

  public void onEventMainThread(SelfUpdateResult paramSelfUpdateResult)
  {
    if (!paramSelfUpdateResult.updateInfo.hasNewVersion())
      Log.d(HomeActivity.class.getName(), "no update info", new Object[0]);
    do
      return;
    while (((OemUtil.isPaid()) && (!OemUtil.isSntpTimeOut())) || (this.b != null));
    this.b = new UpdateNotification(this, paramSelfUpdateResult);
    this.b.a();
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent, false);
  }

  protected void onResume()
  {
    super.onResume();
    if ((AccessibilityManager.a()) && (this.c != null))
    {
      this.c.b();
      this.c = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.HomeActivity
 * JD-Core Version:    0.6.0
 */