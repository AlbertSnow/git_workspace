package com.wandoujia.jupiter.notification.notifycard;

import android.content.Context;
import android.content.IntentFilter;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.jupiter.notification.NotificationReceiver;
import com.wandoujia.jupiter.notification.notifycard.generator.INotifyCardGenerator;
import com.wandoujia.p4.app.upgrade.UpgradeNotifyCardGenerator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class e
{
  private static Comparator<INotifyCardGenerator> b = new f();
  private static Context c;
  public final List<INotifyCardGenerator> a = new ArrayList();

  public e()
  {
    this.a.add(UpgradeNotifyCardGenerator.c());
    Collections.sort(this.a, b);
  }

  public static void a(Context paramContext)
  {
    c = paramContext;
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("phoenix.intent.action.UPGRADE_APP");
    localIntentFilter.addAction("phoenix.intent.action.DOWNLOAD_APP");
    localIntentFilter.addAction("phoenix.intent.action.SUBSCRIBE");
    localIntentFilter.addAction("phoenix.intent.action.NAVIGATE_TO_ACTIVITY");
    localIntentFilter.addAction("phoenix.intent.action.GEN_NOTIFY_CARD");
    localIntentFilter.setPriority(2147483647);
    paramContext.registerReceiver(new NotificationReceiver(), localIntentFilter);
    new Thread(new g()).start();
  }

  public final void a()
  {
    ThreadPool.execute(new h(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.notification.notifycard.e
 * JD-Core Version:    0.6.0
 */