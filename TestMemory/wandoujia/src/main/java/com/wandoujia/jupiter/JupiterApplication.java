package com.wandoujia.jupiter;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.wandoujia.account.AccountParams.Type;
import com.wandoujia.account.fragment.AccountBaseFragment;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.services.AlarmService;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.activity.DexLoadingActivity;
import com.wandoujia.jupiter.activity.HomeActivity;
import com.wandoujia.jupiter.activity.NoDexLaunchActivity;
import com.wandoujia.jupiter.multidex.MultiDex;
import com.wandoujia.jupiter.search.manage.SearchHistoryManager;
import com.wandoujia.jupiter.service.JupiterAlarmService;
import com.wandoujia.jupiter.update.UpdateService;
import com.wandoujia.jupiter.util.o;
import com.wandoujia.jupiter.util.u;
import com.wandoujia.logv3.model.packages.ClientPackage.Product;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.p4.subscribe.SubscribeRefreshFlagChecker;
import com.wandoujia.p4.utils.ShortcutUtil;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.n;
import com.wandoujia.udid.UDIDUtil;
import com.wandoujia.update.LocalUpdateService.UpdateParams;
import com.wandoujia.update.UpdateApplication;
import com.wandoujia.update.protocol.CheckUpdateProtocol;
import java.util.List;
import java.util.Locale;

public class JupiterApplication extends UpdateApplication<UpdateService>
{
  private static Handler a = new Handler(Looper.getMainLooper());
  private static Context b;
  private static JupiterApplication c;
  private static String e;
  private com.wandoujia.jupiter.notification.notifycard.e d;
  private SearchHistoryManager f;
  private com.wandoujia.jupiter.shortcut.a g;
  private final n h = new b(this);

  public static Handler a()
  {
    return a;
  }

  public static void a(Context paramContext)
  {
    String str = SystemUtil.getVersionName(paramContext);
    if (TextUtils.isEmpty(str))
      return;
    paramContext.getSharedPreferences(str, 4).edit().putString("version_code", e).commit();
  }

  private boolean a(String paramString)
  {
    String str = SystemUtil.getProcessName(this);
    return (!TextUtils.isEmpty(str)) && (str.endsWith(paramString));
  }

  private static boolean b(Context paramContext)
  {
    if (MultiDex.IS_VM_MULTIDEX_CAPABLE)
      return true;
    String str1 = SystemUtil.getVersionName(paramContext);
    if ((TextUtils.isEmpty(str1)) && (TextUtils.isEmpty(e)))
      return false;
    String str2 = paramContext.getSharedPreferences(str1, 4).getString("version_code", "");
    return TextUtils.equals(e, str2);
  }

  public static JupiterApplication d()
  {
    return c;
  }

  public static Context e()
  {
    return b;
  }

  protected void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
    if (a("com.wandoujia.phoenix2"))
      o.a().b();
    for (int i = 1; ; i = 0)
    {
      c = this;
      e = String.valueOf(SystemUtil.getVersionCode(paramContext));
      if (a(":nodex"))
        return;
      List localList = ((ActivityManager)getSystemService("activity")).getRunningTasks(1);
      boolean bool1;
      label70: int j;
      long l1;
      long l2;
      if (CollectionUtils.isEmpty(localList))
      {
        bool1 = false;
        j = 0;
        if (bool1)
        {
          if (b(paramContext))
            break label258;
          Intent localIntent1 = new Intent(paramContext, NoDexLaunchActivity.class);
          localIntent1.addFlags(268435456);
          paramContext.startActivity(localIntent1);
          l1 = 15000L;
          if (Build.VERSION.SDK_INT < 12)
            l1 = 30000L;
          l2 = System.currentTimeMillis();
          label134: boolean bool2 = b(paramContext);
          j = 0;
          if (bool2);
        }
      }
      while (true)
      {
        try
        {
          long l3 = System.currentTimeMillis();
          boolean bool3 = l3 - l2 < l1;
          j = 0;
          if (bool3)
            continue;
          MultiDex.install(this);
          a(this);
          if (j == 0)
            break;
          a.post(new c(this));
          return;
          ComponentName localComponentName = ((ActivityManager.RunningTaskInfo)localList.get(0)).topActivity;
          if (localComponentName != null)
            continue;
          bool1 = false;
          break label70;
          bool1 = localComponentName.getClassName().equals(HomeActivity.class.getName());
          break label70;
          Thread.sleep(200L);
        }
        catch (InterruptedException localInterruptedException)
        {
        }
        break label134;
        label258: j = 0;
        if (i == 0)
          continue;
        boolean bool4 = MultiDex.IS_VM_MULTIDEX_CAPABLE;
        j = 0;
        if (bool4)
          continue;
        Intent localIntent2 = new Intent(paramContext, DexLoadingActivity.class);
        localIntent2.addFlags(268435456);
        paramContext.startActivity(localIntent2);
        j = 1;
      }
    }
  }

  protected final LocalUpdateService.UpdateParams b()
  {
    CheckUpdateProtocol localCheckUpdateProtocol = new CheckUpdateProtocol();
    Context localContext = getApplicationContext();
    localCheckUpdateProtocol.packageName = localContext.getPackageName();
    localCheckUpdateProtocol.versionName = SystemUtil.getVersionName(localContext);
    localCheckUpdateProtocol.versionCode = SystemUtil.getVersionCode(localContext);
    localCheckUpdateProtocol.source = GlobalConfig.getLastChannel();
    localCheckUpdateProtocol.udid = UDIDUtil.a(localContext);
    Locale localLocale = Locale.getDefault();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = localLocale.getLanguage();
    arrayOfObject[1] = localLocale.getCountry();
    localCheckUpdateProtocol.language = String.format("%s-%s", arrayOfObject);
    localCheckUpdateProtocol.rom = Build.MODEL;
    localCheckUpdateProtocol.romVersion = Build.VERSION.RELEASE;
    LocalUpdateService.UpdateParams localUpdateParams = new LocalUpdateService.UpdateParams();
    localUpdateParams.checkUpdateProtocol = localCheckUpdateProtocol;
    localUpdateParams.checkUpdateProtocol.appName = "jupiter";
    localUpdateParams.checkUpdateProtocol.isOem = false;
    localUpdateParams.notificationIcon = 2130838699;
    return localUpdateParams;
  }

  public final LocalUpdateService.UpdateParams c()
  {
    return b();
  }

  public final SearchHistoryManager f()
  {
    return this.f;
  }

  public final com.wandoujia.jupiter.notification.notifycard.e g()
  {
    return this.d;
  }

  public void onCreate()
  {
    if (a(":nodex"));
    g localg;
    do
    {
      return;
      super.onCreate();
      localg = new g(this);
      b = getApplicationContext();
      GlobalConfig.setDebug(false);
      GlobalConfig.setAppContext(b);
      GlobalConfig.setAppRootDir(android.support.v4.app.b.k(b, localg.m()));
      GlobalConfig.setPackageName("com.wandoujia.phoenix2");
      com.wandoujia.accessibility.a.a("com.wandoujia.accessibility.contentprovider");
      OemUtil.setIsOem(false);
      OemUtil.setIsPaid(false);
      OemUtil.setShowFeedbackEntry(true);
      OemUtil.setCanCreateShortCut(true);
      OemUtil.setCanShowComputerConnection(true);
      OemUtil.setCanShowAutoInstall(true);
      OemUtil.setEnableAlertUpdate(true);
      OemUtil.setShowRootInstall(false);
      OemUtil.setDeleteApkAfterInstall(true);
      OemUtil.setEnablePushNotification(true);
      OemUtil.setEnableBatteryNotification(true);
      OemUtil.setEnableCleanNotification(true);
      OemUtil.setAutoCheckAppUpgrade(true);
      if (OemUtil.isPaid())
        OemUtil.setSntpOutTimeDays(30L);
      if (!a("com.wandoujia.phoenix2"))
        continue;
      o.a().d();
      o.a().a("LeakCanary");
      android.support.v4.app.b.a(this, AccountParams.Type.FIVE);
      new h();
      j.a().a(this, localg);
      o.a().d();
      com.wandoujia.p4.a.c();
      o.a().a("initMainProcess");
      com.wandoujia.p4.app.upgrade.a.a(b);
      this.d = new com.wandoujia.jupiter.notification.notifycard.e();
      com.wandoujia.jupiter.notification.notifycard.e.a(b);
      this.f = new SearchHistoryManager();
      ShortcutUtil.a(this);
      SubscribeRefreshFlagChecker.a(this).a();
      o.a().d();
      AlarmService.scheduleAlarm(this, "APPLICATION_START", JupiterAlarmService.class);
      o.a().a("AlarmService");
      if (SystemUtil.aboveApiLevel(14))
        a.postDelayed(new d(this), 5000L);
      com.wandoujia.push2.k localk = new com.wandoujia.push2.k(UDIDUtil.a(this), "normal");
      com.wandoujia.push2.g.a().a(this, localk, new com.wandoujia.jupiter.notification.a.b());
      com.wandoujia.push2.g.a().a(new com.wandoujia.jupiter.notification.a.a(), Integer.valueOf(1));
      u.a(this);
      com.wandoujia.jupiter.homepage.splashwindow.k.i();
      a.postDelayed(new e(this), 1000L);
      com.wandoujia.jupiter.morph.c.a(this);
      o.a().c();
      return;
    }
    while (!a("com.wandoujia.phoenix2:accessibility"));
    android.support.v4.app.b.a(this, AccountParams.Type.FIVE);
    AccountBaseFragment.a(com.wandoujia.p4.account.manager.d.a().d());
    ClientPackage.Product localProduct = localg.i();
    String str1 = localg.j();
    String str2 = localg.f();
    localg.l();
    v.a(this, new com.wandoujia.accessibility.b(localProduct, str1, str2, Config.l(), Config.m()));
  }

  public void onLowMemory()
  {
    super.onLowMemory();
    if (a("com.wandoujia.phoenix2"))
      ((com.wandoujia.image.b)i.k().a("image")).c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.JupiterApplication
 * JD-Core Version:    0.6.0
 */