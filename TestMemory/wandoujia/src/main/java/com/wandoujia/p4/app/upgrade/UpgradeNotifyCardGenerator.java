package com.wandoujia.p4.app.upgrade;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.support.v4.app.aw;
import android.text.TextUtils;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.appmanager.LocalAppInfo.UpgradeInfo;
import com.wandoujia.base.concurrent.CachedThreadPoolExecutorWithCapacity;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.gson.JsonParseException;
import com.wandoujia.gson.c;
import com.wandoujia.jupiter.notification.notifycard.d;
import com.wandoujia.jupiter.notification.notifycard.generator.INotifyCardGenerator;
import com.wandoujia.jupiter.notification.notifycard.generator.INotifyCardGenerator.NotifyPriority;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import com.wandoujia.ripple_framework.util.UpgradeUtils;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;

public final class UpgradeNotifyCardGenerator
  implements INotifyCardGenerator
{
  private static final Comparator<LocalAppInfo> a = new l();
  private static UpgradeNotifyCardGenerator c;
  private final Executor b;

  private UpgradeNotifyCardGenerator()
  {
    new m(this);
    this.b = new CachedThreadPoolExecutorWithCapacity(1, 60000L);
  }

  private static PendingIntent a(HashMap<String, String> paramHashMap)
  {
    Intent localIntent1;
    try
    {
      Intent localIntent2 = Intent.parseUri("wdj://me/upgrade_apps", 1);
      localIntent1 = localIntent2;
      if (localIntent1 == null)
        return null;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      while (true)
        localIntent1 = null;
      localIntent1.putExtra("launch_from", "notification_app");
      localIntent1.putExtra("launch_keyword", "normal_app_upgrade");
      localIntent1.addFlags(268435456);
      localIntent1.putExtra("log_params", paramHashMap);
    }
    return PendingIntent.getActivity(com.wandoujia.p4.a.a(), 0, localIntent1, 134217728);
  }

  private static String a(String paramString, Map<String, String> paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      paramString = paramString.replace((CharSequence)localEntry.getKey(), (CharSequence)localEntry.getValue());
    }
    return paramString;
  }

  private static String a(List<LocalAppInfo> paramList1, List<LocalAppInfo> paramList2)
  {
    Resources localResources = com.wandoujia.p4.a.a().getResources();
    long l = UpgradeUtils.a(paramList1, paramList2);
    if (l <= 0L)
      return "";
    return localResources.getString(2131625579, new Object[] { TextUtil.formatSizeInfo(l) });
  }

  private static PendingIntent b(HashMap<String, String> paramHashMap)
  {
    Intent localIntent1;
    try
    {
      Intent localIntent2 = Intent.parseUri("wdj://me/upgrade_apps", 1);
      localIntent1 = localIntent2;
      if (localIntent1 == null)
        return null;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      while (true)
        localIntent1 = null;
      localIntent1.addFlags(268435456);
      localIntent1.putExtra("log_params", paramHashMap);
    }
    return PendingIntent.getActivity(com.wandoujia.p4.a.a(), 0, localIntent1, 134217728);
  }

  private static List<LocalAppInfo> b(List<LocalAppInfo> paramList)
  {
    if (paramList.isEmpty())
      return Collections.emptyList();
    if (paramList.size() == 1)
      return new ArrayList(paramList);
    Collections.sort(paramList, a);
    ArrayList localArrayList = new ArrayList();
    int i = Math.min(paramList.size(), 2);
    for (int j = 0; (j < i) && (((LocalAppInfo)paramList.get(j)).getUpgradeInfo().getDownloadCount() >= 8000000); j++)
      localArrayList.add(paramList.get(j));
    if (localArrayList.isEmpty())
      localArrayList.add(paramList.get(0));
    return localArrayList;
  }

  private static void b(int paramInt)
  {
    SharedPreferences.Editor localEditor = Config.a().edit();
    localEditor.putInt("upgrade_show_same_notification_count", paramInt);
    SharePrefSubmitor.submit(localEditor);
  }

  private static PendingIntent c(HashMap<String, String> paramHashMap)
  {
    Intent localIntent = new Intent("phoenix.intent.action.UPGRADE_ALL");
    localIntent.putExtra("log_params", paramHashMap);
    return PendingIntent.getBroadcast(com.wandoujia.p4.a.a(), 0, localIntent, 134217728);
  }

  public static UpgradeNotifyCardGenerator c()
  {
    monitorenter;
    try
    {
      if (c == null)
        c = new UpgradeNotifyCardGenerator();
      UpgradeNotifyCardGenerator localUpgradeNotifyCardGenerator = c;
      return localUpgradeNotifyCardGenerator;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private static String c(List<LocalAppInfo> paramList)
  {
    if (paramList.isEmpty())
      return "";
    Resources localResources = com.wandoujia.p4.a.a().getResources();
    if (paramList.size() == 1)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = paramList.get(0);
      return localResources.getString(2131625569, arrayOfObject2);
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      localArrayList.add(((LocalAppInfo)localIterator.next()).getTitle());
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = TextUtils.join("、", localArrayList);
    return localResources.getString(2131625569, arrayOfObject1);
  }

  private static PendingIntent d(HashMap<String, String> paramHashMap)
  {
    Intent localIntent1;
    try
    {
      Intent localIntent2 = Intent.parseUri("wdj://me/upgrade_apps", 1);
      localIntent1 = localIntent2;
      if (localIntent1 == null)
        return null;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      while (true)
        localIntent1 = null;
      localIntent1.putExtra("launch_from", "notification_app");
      localIntent1.putExtra("launch_keyword", "normal_app_upgrade");
      localIntent1.addFlags(268435456);
      localIntent1.putExtra("log_params", paramHashMap);
    }
    return PendingIntent.getActivity(com.wandoujia.p4.a.a(), 0, localIntent1, 134217728);
  }

  private static PendingIntent e(HashMap<String, String> paramHashMap)
  {
    Intent localIntent = new Intent("phoenix.intent.action.UPGRADE_NOTIFICATION_DELETED");
    localIntent.putExtra("log_params", paramHashMap);
    return PendingIntent.getBroadcast(com.wandoujia.p4.a.a(), 0, localIntent, 134217728);
  }

  private static long i()
  {
    return Config.a().getLong("upgrade_last_show_notification_time", 0L);
  }

  private static List<UpgradeNotificationConfig> j()
  {
    String str = Config.a("upgrade_notification_text_config");
    if (!TextUtils.isEmpty(str))
    {
      c localc = new c();
      try
      {
        List localList = (List)localc.a(str, new p().getType());
        if (localList != null)
        {
          boolean bool = localList.isEmpty();
          if (!bool)
            return localList;
        }
      }
      catch (JsonParseException localJsonParseException)
      {
      }
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new UpgradeNotifyCardGenerator.DefaultUpgradeNotificationConfig());
    return localArrayList;
  }

  public final INotifyCardGenerator.NotifyPriority a()
  {
    return INotifyCardGenerator.NotifyPriority.HIGH;
  }

  public final d b()
  {
    if (!BadgeUtil.d(com.wandoujia.p4.a.a()))
      return null;
    AppManager.a();
    float f = AppManager.m();
    long l = System.currentTimeMillis();
    if (((float)l - f * 86400000.0F < (float)i()) || (l - a.a() < 86400000L))
      return null;
    a.b(false, false);
    List localList1 = UpgradeUtils.a();
    if (a.b() > i())
      b(0);
    int i = 1 + Config.a().getInt("upgrade_show_same_notification_count", 0);
    if (i > 3)
      return null;
    if (localList1.isEmpty())
      return null;
    List localList2 = UpgradeUtils.b(localList1);
    if (localList2.isEmpty())
      return null;
    ArrayList localArrayList1 = new ArrayList();
    if (localArrayList1.size() == localList2.size());
    List localList3;
    List localList4;
    for (int j = 1; ; j = 0)
    {
      localList3 = b(localList2);
      localList4 = j();
      if (!localList4.isEmpty())
        break;
      return null;
    }
    UpgradeNotificationConfig localUpgradeNotificationConfig = (UpgradeNotificationConfig)localList4.get(Math.min(-1 + localList4.size(), i - 1));
    if (localUpgradeNotificationConfig == null)
      return null;
    HashMap localHashMap1 = new HashMap();
    localHashMap1.put("app_num", String.valueOf(localList2.size()));
    localHashMap1.put("show_count", String.valueOf(i));
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = localList3.iterator();
    while (localIterator.hasNext())
      localArrayList2.add(((LocalAppInfo)localIterator.next()).getPackageName());
    localHashMap1.put("pkg_list", TextUtils.join(",", localArrayList2));
    localHashMap1.put("notification_show_time", com.wandoujia.p4.utils.a.a(new Date(System.currentTimeMillis()), "yyyyMMddHHmm"));
    Notification localNotification;
    if (localList2.size() == 1)
    {
      localHashMap1.put("notification_type", UpgradeNotifyCardGenerator.NotificationType.ONE_APP.toString());
      LocalAppInfo localLocalAppInfo = (LocalAppInfo)localList2.get(0);
      NotificationTextConfig localNotificationTextConfig3 = localUpgradeNotificationConfig.oneAppText;
      String str5 = localNotificationTextConfig3.title.replace("{appName}", localLocalAppInfo.getTitle());
      String str6 = localNotificationTextConfig3.message.replace("{appName}", localLocalAppInfo.getTitle());
      PendingIntent localPendingIntent9 = a(localHashMap1);
      PendingIntent localPendingIntent10 = c(localHashMap1);
      PendingIntent localPendingIntent11 = d(localHashMap1);
      PendingIntent localPendingIntent12 = e(localHashMap1);
      aw localaw3 = new aw(com.wandoujia.p4.a.a());
      localaw3.a().c(str5).a(2130838699).a(System.currentTimeMillis()).a(str5).b(str6).a(localPendingIntent9).a(localNotificationTextConfig3.leftButton, localPendingIntent10).a(localNotificationTextConfig3.rightButton, localPendingIntent11).b(localPendingIntent12);
      localNotification = localaw3.b();
    }
    while (true)
    {
      SharedPreferences.Editor localEditor = Config.a().edit();
      localEditor.putBoolean("upgrade_todo_card_handled", false);
      SharePrefSubmitor.submit(localEditor);
      d locald = new d();
      locald.b();
      locald.a(localNotification);
      locald.a(new n(this, localHashMap1));
      b(i);
      return locald;
      if (j == 0)
      {
        localHashMap1.put("notification_type", UpgradeNotifyCardGenerator.NotificationType.MULTI_APP.toString());
        NotificationTextConfig localNotificationTextConfig2 = localUpgradeNotificationConfig.multiAppText;
        HashMap localHashMap3 = new HashMap();
        localHashMap3.put("{appList}", c(localList2));
        localHashMap3.put("{appNum}", String.valueOf(localList2.size()));
        localHashMap3.put("{savedTraffic}", a(localList2, localArrayList1));
        String str3 = a(localNotificationTextConfig2.title, localHashMap3);
        String str4 = a(localNotificationTextConfig2.message, localHashMap3);
        PendingIntent localPendingIntent5 = a(localHashMap1);
        PendingIntent localPendingIntent6 = c(localHashMap1);
        PendingIntent localPendingIntent7 = d(localHashMap1);
        PendingIntent localPendingIntent8 = e(localHashMap1);
        aw localaw2 = new aw(com.wandoujia.p4.a.a());
        localaw2.a().c(str3).a(2130838699).a(System.currentTimeMillis()).a(str3).b(str4).a(localPendingIntent5).a(localNotificationTextConfig2.leftButton, localPendingIntent6).a(localNotificationTextConfig2.rightButton, localPendingIntent7).b(localPendingIntent8);
        localNotification = localaw2.b();
        continue;
      }
      localHashMap1.put("notification_type", UpgradeNotifyCardGenerator.NotificationType.PRE_DOWNLOADED.toString());
      NotificationTextConfig localNotificationTextConfig1 = localUpgradeNotificationConfig.preDownloadText;
      HashMap localHashMap2 = new HashMap();
      localHashMap2.put("{appList}", c(localList2));
      localHashMap2.put("{appNum}", String.valueOf(localList2.size()));
      localHashMap2.put("{savedTraffic}", a(localList2, localArrayList1));
      String str1 = a(localNotificationTextConfig1.title, localHashMap2);
      String str2 = a(localNotificationTextConfig1.message, localHashMap2);
      PendingIntent localPendingIntent1 = a(localHashMap1);
      PendingIntent localPendingIntent2 = c(localHashMap1);
      PendingIntent localPendingIntent3 = d(localHashMap1);
      PendingIntent localPendingIntent4 = e(localHashMap1);
      aw localaw1 = new aw(com.wandoujia.p4.a.a());
      localaw1.a().c(str1).a(2130838699).a(System.currentTimeMillis()).a(str1).b(str2).a(localPendingIntent1).a(localNotificationTextConfig1.leftButton, localPendingIntent2).a(localNotificationTextConfig1.rightButton, localPendingIntent3).b(localPendingIntent4);
      localNotification = localaw1.b();
    }
  }

  public final void d()
  {
    this.b.execute(new o(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.upgrade.UpgradeNotifyCardGenerator
 * JD-Core Version:    0.6.0
 */