package com.wandoujia.p4.app.upgrade;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppChangedListener;
import com.wandoujia.appmanager.LocalAppInfo.UpgradeInfo;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.ReceiverMonitor;
import com.wandoujia.ripple_framework.n;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  private static final List<WeakReference<k>> a = new LinkedList();
  private static final ArrayList<j> b = new ArrayList();
  private static final n c = new b();
  private static final LocalAppChangedListener d = new c();
  private static Context e;
  private static int f = 0;

  public static long a()
  {
    return Config.a().getLong("last_show_important_upgrade_notification_time", 0L);
  }

  public static HashMap<String, String> a(Intent paramIntent)
  {
    Serializable localSerializable = paramIntent.getSerializableExtra("log_params");
    if ((localSerializable instanceof HashMap));
    while (true)
    {
      try
      {
        localHashMap = (HashMap)localSerializable;
        if (localHashMap != null)
          continue;
        localHashMap = new HashMap();
        return localHashMap;
      }
      catch (ClassCastException localClassCastException)
      {
      }
      HashMap localHashMap = null;
    }
  }

  public static void a(Context paramContext)
  {
    e = paramContext.getApplicationContext();
    ReceiverMonitor.a().a(c);
    AppManager.a().a(d);
    b(NetworkUtil.isWifiConnected(paramContext));
  }

  public static void a(j paramj)
  {
    synchronized (b)
    {
      b.add(paramj);
      return;
    }
  }

  public static void a(k paramk)
  {
    synchronized (a)
    {
      Iterator localIterator = a.iterator();
      while (localIterator.hasNext())
      {
        k localk = (k)((WeakReference)localIterator.next()).get();
        if ((localk != null) && (localk.equals(paramk)))
          return;
      }
      a.add(new WeakReference(paramk));
      return;
    }
  }

  public static void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    ThreadPool.execute(new g(paramBoolean1, paramBoolean2));
  }

  public static boolean a(LocalAppInfo.UpgradeInfo paramUpgradeInfo1, LocalAppInfo.UpgradeInfo paramUpgradeInfo2)
  {
    if ((paramUpgradeInfo1 == null) && (paramUpgradeInfo2 == null));
    do
    {
      return false;
      if ((paramUpgradeInfo1 == null) || (paramUpgradeInfo2 == null))
        return true;
    }
    while ((paramUpgradeInfo1.getVersionCode() == paramUpgradeInfo2.getVersionCode()) && (TextUtils.equals(paramUpgradeInfo1.getFullMD5(), paramUpgradeInfo2.getFullMD5())) && (paramUpgradeInfo1.isImportantUpdate() == paramUpgradeInfo2.isImportantUpdate()));
    return true;
  }

  public static long b()
  {
    return Config.a().getLong("last_upgrade_info_updated_time", 0L);
  }

  private static void b(int paramInt)
  {
    SharedPreferences.Editor localEditor = Config.a().edit();
    localEditor.putInt("show_notification_times_one_day", paramInt);
    SharePrefSubmitor.submit(localEditor);
  }

  private static void b(boolean paramBoolean)
  {
    ThreadPool.execute(new d(paramBoolean));
  }

  public static boolean b(j paramj)
  {
    synchronized (b)
    {
      boolean bool = b.remove(paramj);
      return bool;
    }
  }

  public static boolean b(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool2;
    boolean bool1;
    if ((NetworkUtil.isNetworkConnected(e)) && ((!paramBoolean1) || (NetworkUtil.isWifiConnected(e))) && ((System.currentTimeMillis() - Config.b() > 20000L) || (paramBoolean2)))
    {
      bool2 = AppManager.a().l();
      if (!bool2)
        break label120;
      Config.a(System.currentTimeMillis());
      bool1 = bool2;
    }
    while (true)
    {
      synchronized (b)
      {
        Iterator localIterator = b.iterator();
        if (!localIterator.hasNext())
          break label116;
        ((j)localIterator.next()).a();
      }
      bool1 = false;
      continue;
      label116: monitorexit;
      return bool1;
      label120: bool1 = bool2;
    }
  }

  private static int h()
  {
    return Config.a().getInt("show_notification_times_one_day", 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.upgrade.a
 * JD-Core Version:    0.6.0
 */