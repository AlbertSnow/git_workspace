package com.wandoujia.online_config;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.rpc.http.client.DataApi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public final class c
{
  private static c a;
  private final List<WeakReference<f>> b = new ArrayList();
  private final Handler c = new Handler(Looper.getMainLooper());

  private c()
  {
    m();
  }

  public static c a()
  {
    monitorenter;
    try
    {
      if (a == null)
        s();
      c localc = a;
      return localc;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private void a(Map<String, String> paramMap)
  {
    while (true)
    {
      Iterator localIterator;
      synchronized (this.b)
      {
        localIterator = this.b.iterator();
        if (!localIterator.hasNext())
          break;
        f localf = (f)((WeakReference)localIterator.next()).get();
        if (localf != null)
          this.c.post(new d(localf, paramMap));
      }
      localIterator.remove();
    }
    monitorexit;
  }

  public static String d()
  {
    String str = ConfigStorage.a("launcher_apk_url");
    if (TextUtils.isEmpty(str))
      str = "http://upload.cdn.wandoujia.com/games/launcher/game_launcher_1.0.20.190.apk";
    return str;
  }

  public static int e()
  {
    String str = ConfigStorage.a("launcher_apk_vc");
    if (TextUtils.isEmpty(str))
      return 190;
    try
    {
      int i = Integer.valueOf(str).intValue();
      return i;
    }
    catch (Exception localException)
    {
    }
    return 190;
  }

  public static String f()
  {
    String str = ConfigStorage.a("launcher_apk_icon");
    if (TextUtils.isEmpty(str))
      str = "http://upload.cdn.wandoujia.com/games/launcher/game_launcher_icon_v2_192_192.png";
    return str;
  }

  public static boolean g()
  {
    String str = ConfigStorage.a("enable_update_apk_gl");
    if (TextUtils.isEmpty(str))
      return false;
    try
    {
      boolean bool = Boolean.valueOf(str).booleanValue();
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean h()
  {
    String str = ConfigStorage.a("enable_guess_apk_gl");
    if (TextUtils.isEmpty(str))
      return false;
    try
    {
      boolean bool = Boolean.valueOf(str).booleanValue();
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static String i()
  {
    String str = ConfigStorage.a("launcher_zero_game_icon");
    if (TextUtils.isEmpty(str))
      str = "";
    return str;
  }

  public static int j()
  {
    String str = ConfigStorage.a("alert_update_gl_interval");
    if (TextUtils.isEmpty(str))
      return 1;
    try
    {
      int i = Integer.valueOf(str).intValue();
      return i;
    }
    catch (Exception localException)
    {
    }
    return 1;
  }

  public static boolean k()
  {
    String str = ConfigStorage.a("enable_update_gl_for_new_user");
    if (TextUtils.isEmpty(str))
      return false;
    try
    {
      boolean bool = Boolean.valueOf(str).booleanValue();
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean l()
  {
    String str = ConfigStorage.a("enable_gl_guide");
    if (TextUtils.isEmpty(str))
      return true;
    try
    {
      boolean bool = Boolean.valueOf(str).booleanValue();
      return bool;
    }
    catch (Exception localException)
    {
    }
    return true;
  }

  public static void m()
  {
    ThreadPool.execute(new e());
  }

  public static long n()
  {
    return ConfigStorage.a("disk_clean_extreme_low_percent", 5L);
  }

  public static long o()
  {
    return ConfigStorage.a("disk_clean_extreme_low_megabytes", 100L);
  }

  public static long p()
  {
    return ConfigStorage.a("disk_clean_low_percent", 20L);
  }

  public static long q()
  {
    return ConfigStorage.a("disk_clean_low_megabytes", 400L);
  }

  public static int r()
  {
    String str = ConfigStorage.a("fast_clean_apk_vc");
    if (TextUtils.isEmpty(str))
      return 206;
    try
    {
      int i = Integer.valueOf(str).intValue();
      return i;
    }
    catch (Exception localException)
    {
    }
    return 206;
  }

  private static void s()
  {
    monitorenter;
    try
    {
      c localc = a;
      if (localc != null);
      while (true)
      {
        return;
        a = new c();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a(f paramf)
  {
    synchronized (this.b)
    {
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
        if (paramf.equals((f)((WeakReference)localIterator.next()).get()))
          return;
      this.b.add(new WeakReference(paramf));
      return;
    }
  }

  public final void b()
  {
    new Thread(new g(this)).start();
  }

  public final OnlineConfigResult c()
  {
    monitorenter;
    while (true)
    {
      String str1;
      OnlineConfigResult localOnlineConfigResult1;
      Map localMap;
      HashMap localHashMap;
      try
      {
        str1 = ConfigStorage.a("cfg_version");
        if (!ConfigStorage.a("wdj_version").equals(String.valueOf(SystemUtil.getVersionCode(GlobalConfig.getAppContext()))))
          break label298;
        if (!TextUtils.isEmpty(str1))
          break label293;
        break label298;
        h localh = new h();
        ((j)localh.getRequestBuilder()).a(str2);
        try
        {
          OnlineConfigResult localOnlineConfigResult3 = (OnlineConfigResult)b.N().execute(localh);
          localOnlineConfigResult1 = localOnlineConfigResult3;
          if (localOnlineConfigResult1 != null)
            continue;
          localOnlineConfigResult2 = null;
          monitorexit;
          return localOnlineConfigResult2;
        }
        catch (ExecutionException localExecutionException)
        {
          localOnlineConfigResult1 = null;
          continue;
          if (localOnlineConfigResult1.getUpdate() == null)
            break label286;
        }
        if (localOnlineConfigResult1.getUpdate().equalsIgnoreCase("no"))
          break label286;
        localMap = localOnlineConfigResult1.toMap();
        localHashMap = new HashMap();
        Iterator localIterator = localMap.entrySet().iterator();
        if (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          String str3 = ConfigStorage.a((String)localEntry.getKey());
          String str4 = (String)localEntry.getValue();
          if (TextUtils.equals(str3, str4))
            continue;
          localHashMap.put(localEntry.getKey(), str4);
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      localMap.put("wdj_version", SystemUtil.getVersionCode(GlobalConfig.getAppContext()));
      ConfigStorage.a(localMap);
      if (!localHashMap.isEmpty())
        a(localHashMap);
      label286: OnlineConfigResult localOnlineConfigResult2 = localOnlineConfigResult1;
      continue;
      label293: String str2 = str1;
      continue;
      label298: str2 = "0";
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.online_config.c
 * JD-Core Version:    0.6.0
 */