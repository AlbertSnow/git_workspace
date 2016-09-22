package com.wandoujia.p4.app_launcher.f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.Preferences;
import com.wandoujia.base.utils.Preferences.CustomEditor;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.p4.app_launcher.manager.d;
import com.wandoujia.p4.app_launcher.model.ALAppInfo;
import com.wandoujia.p4.app_launcher.model.ALSuggestion;
import com.wandoujia.p4.app_launcher.model.ALSuggestion.FunctionInfo;
import com.wandoujia.p4.app_launcher.model.ALSuggestion.Icons;
import com.wandoujia.p4.http.c.a;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b
{
  private static String a;

  static
  {
    b.class.getSimpleName();
  }

  public static void a(boolean paramBoolean)
  {
    d.a(new c(paramBoolean));
  }

  public static boolean a()
  {
    String str1 = f();
    String str2 = com.wandoujia.p4.app_launcher.manager.b.a().getString("key_icon_app_hash", "");
    return (TextUtils.isEmpty(str2)) || (!str2.equals(str1));
  }

  public static boolean a(String paramString)
  {
    return (!TextUtils.isEmpty(paramString)) && (paramString.equals("com.tencent.mm"));
  }

  public static Drawable b()
  {
    if (Looper.myLooper() == Looper.getMainLooper())
      throw new IllegalStateException("Must not run on UI thread!");
    Resources localResources = GlobalConfig.getAppContext().getResources();
    try
    {
      localObject = new BitmapDrawable(localResources, new URL(a).openConnection().getInputStream());
      if (localObject == null)
        localObject = localResources.getDrawable(2130837710);
      return localObject;
    }
    catch (IOException localIOException)
    {
      while (true)
        Object localObject = null;
    }
  }

  private static void e()
  {
    String str = f();
    SharePrefSubmitor.submit(com.wandoujia.p4.app_launcher.manager.b.a().edit().putString("key_icon_app_hash", str));
  }

  private static String f()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = g().iterator();
    while (localIterator.hasNext())
      localStringBuilder.append((String)localIterator.next());
    return a.a().a(localStringBuilder.toString());
  }

  private static List<String> g()
  {
    ArrayList localArrayList = new ArrayList();
    ALSuggestion localALSuggestion = com.wandoujia.p4.app_launcher.manager.b.b();
    if (localALSuggestion != null)
    {
      if (!CollectionUtils.isEmpty(localALSuggestion.intentElemList))
      {
        Iterator localIterator2 = localALSuggestion.intentElemList.iterator();
        while (localIterator2.hasNext())
        {
          ALSuggestion.FunctionInfo localFunctionInfo = (ALSuggestion.FunctionInfo)localIterator2.next();
          if (!a(localFunctionInfo.packageName))
            continue;
          localArrayList.add(localFunctionInfo.packageName);
          a = localFunctionInfo.icons.px256;
        }
      }
      if (!CollectionUtils.isEmpty(localALSuggestion.appsElemList))
      {
        Iterator localIterator1 = localALSuggestion.appsElemList.iterator();
        do
        {
          ALAppInfo localALAppInfo;
          do
          {
            if (!localIterator1.hasNext())
              break;
            localALAppInfo = (ALAppInfo)localIterator1.next();
          }
          while (a(localALAppInfo.packageName));
          localArrayList.add(localALAppInfo.packageName);
        }
        while (localArrayList.size() < 4);
      }
    }
    return localArrayList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.f.b
 * JD-Core Version:    0.6.0
 */