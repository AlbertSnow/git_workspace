package com.wandoujia.jupiter.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.gson.c;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.udid.UDIDUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class u
{
  private static final String[] a = { "com.android.browser", "com.android.chrome" };

  public static void a(Context paramContext)
  {
    String str = b(paramContext);
    if (!TextUtils.isEmpty(str))
    {
      Calendar localCalendar = Calendar.getInstance();
      int i = localCalendar.get(6);
      localCalendar.setTimeInMillis(Config.o());
      int j = localCalendar.get(6);
      if ((Config.o() == 0L) || (i != j))
        Config.e(System.currentTimeMillis());
      ThreadPool.execute(new v(paramContext, str));
    }
  }

  private static String b()
  {
    StringBuilder localStringBuilder = new StringBuilder(8192);
    Context localContext = com.wandoujia.p4.a.a();
    localStringBuilder.append("\\&ud=").append(UDIDUtil.a(localContext)).append("\\&vn=").append(SystemUtil.getVersionName(localContext)).append("\\&vc=").append(SystemUtil.getVersionCode(localContext)).append("\\&ch=").append(Config.l()).append("\\&uid=").append(com.wandoujia.account.a.t());
    String str = Config.a("uninstall_app_record");
    if (!TextUtils.isEmpty(str))
    {
      try
      {
        Iterator localIterator = ((List)new c().a(str, ArrayList.class)).iterator();
        while (localIterator.hasNext())
        {
          List localList = (List)localIterator.next();
          localStringBuilder.append("\\&").append((String)localList.get(0)).append("=").append(AppManager.a().h((String)localList.get(1)));
        }
      }
      catch (Exception localException)
      {
      }
    }
    else
    {
      boolean bool1 = AppManager.a().h("com.qihoo.appstore");
      boolean bool2 = AppManager.a().h("com.hiapk.marketpho");
      boolean bool3 = AppManager.a().h("com.baidu.appsearch");
      boolean bool4 = AppManager.a().h("com.dragon.android.pandaspace");
      localStringBuilder.append("\\&as=").append(bool1).append("\\&ma=").append(bool2).append("\\&ba=").append(bool3).append("\\&pa=").append(bool4);
    }
    localStringBuilder.append("\\&sdk=").append(String.valueOf(SystemUtil.getSdkVersionInt()));
    try
    {
      localStringBuilder.append("\\&md=").append(URLEncoder.encode(Build.MODEL, "UTF-8"));
      localStringBuilder.append("\\&rom=").append(URLEncoder.encode(Build.DISPLAY, "UTF-8"));
      localStringBuilder.append("\\&brand=").append(URLEncoder.encode(Build.BRAND, "UTF-8"));
      label336: return localStringBuilder.toString();
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      break label336;
    }
  }

  private static String b(Context paramContext)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse("http://www.wandoujia.com"));
    PackageManager localPackageManager = paramContext.getPackageManager();
    HashMap localHashMap = new HashMap();
    try
    {
      List localList2 = localPackageManager.queryIntentActivities(localIntent, 65536);
      localList1 = localList2;
      if ((localList1 != null) && (!localList1.isEmpty()))
      {
        Iterator localIterator = localList1.iterator();
        while (localIterator.hasNext())
        {
          ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
          if ((localResolveInfo.activityInfo == null) || (TextUtils.isEmpty(localResolveInfo.activityInfo.packageName)) || (TextUtils.isEmpty(localResolveInfo.activityInfo.name)))
            continue;
          localHashMap.put(localResolveInfo.activityInfo.packageName, localResolveInfo.activityInfo.packageName + "/" + localResolveInfo.activityInfo.name);
        }
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
        List localList1 = null;
      if (!localHashMap.isEmpty())
      {
        String[] arrayOfString = a;
        for (int i = 0; i < 2; i++)
        {
          String str = arrayOfString[i];
          if (localHashMap.containsKey(str))
            return (String)localHashMap.get(str);
        }
        return (String)localHashMap.values().iterator().next();
      }
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.u
 * JD-Core Version:    0.6.0
 */