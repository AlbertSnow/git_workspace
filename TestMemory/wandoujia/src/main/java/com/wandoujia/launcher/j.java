package com.wandoujia.launcher;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.Window;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.storage.StorageManager;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.game_launcher.lib.R.string;
import com.wandoujia.launcher_base.download.receiver.ReceiverMonitor;
import com.wandoujia.launcher_base.download.receiver.a;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.online_config.c;
import com.wandoujia.online_config.f;
import com.wandoujia.ripple_framework.h;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.udid.UDIDUtil;

public final class j
{
  private com.wandoujia.download2.m a;
  private com.wandoujia.download2.j b = new k();
  private a c = new l(this);
  private f d = new m(this);

  public static void a(Context paramContext)
  {
    String str1 = d();
    if ((!TextUtils.isEmpty(str1)) && (FileUtil.exists(str1)))
    {
      com.wandoujia.launcher_base.utils.d.a(str1, "com.wandoujia.game_launcher");
      return;
    }
    if ((paramContext instanceof Activity));
    for (ViewLogPackage localViewLogPackage = h.j().h().f(((Activity)paramContext).getWindow().getDecorView()); ; localViewLogPackage = null)
    {
      c.a();
      String str2 = c.d();
      String str3 = GlobalConfig.getAppContext().getString(R.string.launcher_app_name);
      c.a();
      String str4 = c.f();
      c.a();
      Model localModel = android.support.v4.app.d.a("com.wandoujia.game_launcher", str2, str3, str4, c.e());
      ((AppTaskManager)i.k().a("app_task")).a(localModel, localViewLogPackage);
      return;
    }
  }

  public static boolean c()
  {
    String str = d();
    if (TextUtils.isEmpty(str))
      return false;
    return FileUtil.exists(str);
  }

  public static String d()
  {
    String str = StorageManager.getInstance().getExternalStorageDirectory();
    if (TextUtils.isEmpty(str))
      return null;
    StringBuilder localStringBuilder = new StringBuilder().append(str).append("/wandoujia/app/game_launcher_");
    c.a();
    return c.e() + ".apk";
  }

  public final void a()
  {
    this.a = new com.wandoujia.download2.m(GlobalConfig.getAppContext(), UDIDUtil.a(GlobalConfig.getAppContext()), this.b, "game_launcher");
    ReceiverMonitor.a().a(this.c);
    c.a().a(this.d);
  }

  public final void b()
  {
    ThreadPool.execute(new n(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.j
 * JD-Core Version:    0.6.0
 */