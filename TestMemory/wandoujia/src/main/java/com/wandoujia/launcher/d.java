package com.wandoujia.launcher;

import android.content.Context;
import android.content.IntentFilter;
import com.wandoujia.account.storage.AccountStorageType;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.game_launcher.receivers.GameLauncherReceiver;
import com.wandoujia.image.b;
import com.wandoujia.image.view.AsyncImageView;

public final class d
{
  private static b a;
  private com.wandoujia.launcher.b.a b;
  private j c;
  private GameLauncherReceiver d = new GameLauncherReceiver();

  public static b b()
  {
    monitorenter;
    try
    {
      if (a == null)
      {
        g localg = new g();
        a = new b(GlobalConfig.getAppContext(), localg);
      }
      b localb = a;
      return localb;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a()
  {
    IntentFilter localIntentFilter1 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    GlobalConfig.getAppContext().registerReceiver(this.d, localIntentFilter1);
    IntentFilter localIntentFilter2 = new IntentFilter("android.intent.action.MEDIA_MOUNTED");
    localIntentFilter2.addDataScheme("file");
    GlobalConfig.getAppContext().registerReceiver(this.d, localIntentFilter2);
    IntentFilter localIntentFilter3 = new IntentFilter();
    localIntentFilter3.addAction("android.intent.action.PACKAGE_REMOVED");
    localIntentFilter3.addAction("android.intent.action.PACKAGE_ADDED");
    localIntentFilter3.addDataScheme("package");
    GlobalConfig.getAppContext().registerReceiver(this.d, localIntentFilter3);
    com.wandoujia.account.a.a(GlobalConfig.getAppContext(), AccountStorageType.SYSTEM);
    this.b = new com.wandoujia.launcher.b.a(GlobalConfig.getAppContext());
    AppManager.a().a(this.b);
    AsyncImageView.setImageManagerHolder(new h());
    this.c = new j();
    this.c.a();
    try
    {
      this.c.b();
      label161: ThreadPool.execute(new e());
      new f();
      com.wandoujia.launcher_base.b.a.g();
      new i(0).execute(new Void[0]);
      return;
    }
    catch (Throwable localThrowable)
    {
      break label161;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.d
 * JD-Core Version:    0.6.0
 */