package com.wandoujia.accessibility;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.text.TextUtils;
import android.text.TextUtils.SimpleStringSplitter;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.IntentUtils;
import com.wandoujia.base.utils.SystemUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AccessibilityManager extends BroadcastReceiver
{
  private static final String a = GlobalConfig.getPackageName() + "/com.wandoujia.accessibility.AccessibilityDispatcher";
  private static final List<j> b = new ArrayList();

  public AccessibilityManager()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.wandoujia.accessibility.state.change");
    GlobalConfig.getAppContext().registerReceiver(this, localIntentFilter);
    b();
  }

  private static String a(String paramString)
  {
    try
    {
      String str = URLEncoder.encode(paramString, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return paramString;
  }

  public static void a(j paramj)
  {
    synchronized (b)
    {
      if (!b.contains(paramj))
        b.add(paramj);
      return;
    }
  }

  public static void a(com.wandoujia.nirvana.framework.network.a parama)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("deviceModel", a(Build.MODEL));
    localHashMap.put("deviceBrand", a(Build.BRAND));
    localHashMap.put("opt_fields", "isBlocked");
    com.wandoujia.nirvana.framework.network.e locale = new com.wandoujia.nirvana.framework.network.e("http://api.wandoujia.com/v3/autoInstall", localHashMap, parama, new c(), new d(), new e());
    locale.a("Accept", "application/json");
    parama.a().a(locale);
  }

  public static boolean a()
  {
    Context localContext = GlobalConfig.getAppContext();
    TextUtils.SimpleStringSplitter localSimpleStringSplitter = new TextUtils.SimpleStringSplitter(':');
    boolean bool1 = b(localContext);
    int i = 0;
    if (bool1)
    {
      String str = Settings.Secure.getString(localContext.getContentResolver(), "enabled_accessibility_services");
      i = 0;
      if (str != null)
      {
        localSimpleStringSplitter.setString(str);
        while (true)
        {
          boolean bool2 = localSimpleStringSplitter.hasNext();
          i = 0;
          if (!bool2)
            break;
          if (!localSimpleStringSplitter.next().equalsIgnoreCase(a))
            continue;
          i = 1;
        }
      }
    }
    return i;
  }

  public static boolean a(Context paramContext)
  {
    Intent localIntent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
    if (!(paramContext instanceof Activity))
      localIntent.addFlags(268435456);
    if (!SystemUtil.isGLD728())
    {
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("component_name", new ComponentName(GlobalConfig.getAppContext(), "com.wandoujia.accessibility.AccessibilityDispatcher"));
      localIntent.putExtra(":settings:show_fragment_args", localBundle);
      localIntent.putExtra(":settings:show_fragment", "com.android.settings.accessibility.ToggleAccessibilityServicePreferenceFragment");
    }
    if (IntentUtils.canHandleIntent(paramContext, localIntent))
    {
      paramContext.startActivity(localIntent);
      return true;
    }
    localIntent.setAction("android.settings.SETTINGS");
    if (IntentUtils.canHandleIntent(paramContext, localIntent))
    {
      paramContext.startActivity(localIntent);
      return true;
    }
    return false;
  }

  private void b()
  {
    de.greenrobot.event.c localc = (de.greenrobot.event.c)com.wandoujia.ripple_framework.i.k().a("event_bus");
    if (!localc.b(this))
      localc.a(this);
  }

  public static void b(j paramj)
  {
    synchronized (b)
    {
      if (b.contains(paramj))
        b.remove(paramj);
      return;
    }
  }

  public static void b(com.wandoujia.nirvana.framework.network.a parama)
  {
    com.wandoujia.nirvana.framework.network.e locale = new com.wandoujia.nirvana.framework.network.e("http://apis.wandoujia.com/five/v2/al/speedup/whitelist", new HashMap(), parama, new f(), new g(), new h());
    locale.a("Accept", "application/json");
    parama.a().a(locale);
  }

  private static boolean b(Context paramContext)
  {
    try
    {
      int k = Settings.Secure.getInt(paramContext.getContentResolver(), "accessibility_enabled");
      i = k;
      int j = 0;
      if (i != 0)
        j = 1;
      return j;
    }
    catch (Settings.SettingNotFoundException localSettingNotFoundException)
    {
      while (true)
        int i = 0;
    }
  }

  public void onEvent(com.wandoujia.ripple_framework.installer.install.a parama)
  {
    if (parama != null);
    try
    {
      a.a(parama.a());
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str1 = paramIntent.getAction();
    if (TextUtils.isEmpty(str1));
    while (true)
    {
      return;
      if (!str1.equals("com.wandoujia.accessibility.state.change"))
        continue;
      String str2 = paramIntent.getStringExtra("extra_service_state");
      try
      {
        if (AccessibilityManager.ServiceState.valueOf(str2) == AccessibilityManager.ServiceState.BIND)
        {
          Iterator localIterator2 = b.iterator();
          while (localIterator2.hasNext())
            ((j)localIterator2.next()).a();
          b();
          return;
        }
        Iterator localIterator1 = b.iterator();
        while (localIterator1.hasNext())
          localIterator1.next();
        de.greenrobot.event.c localc = (de.greenrobot.event.c)com.wandoujia.ripple_framework.i.k().a("event_bus");
        if (!localc.b(this))
          continue;
        localc.c(this);
        return;
      }
      catch (Exception localException)
      {
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.AccessibilityManager
 * JD-Core Version:    0.6.0
 */