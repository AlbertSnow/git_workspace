package com.wandoujia.p4.app_launcher.manager;

import android.support.v4.app.d;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.Preferences;
import com.wandoujia.base.utils.Preferences.CustomEditor;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.base.utils.Singleton;
import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.p4.app_launcher.model.ALSuggestion;
import com.wandoujia.p4.http.c.a;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b
{
  private static Preferences a;
  private static ALSuggestion b;
  private static List<Entity> c;
  private final String d;
  private final String e;
  private final boolean f;
  private long g;
  private final Map<String, String> h;

  public b(String paramString1, String paramString2, boolean paramBoolean, long paramLong, Map<String, String> paramMap)
  {
    d.i(paramString1);
    d.i(paramString2);
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramBoolean;
    this.g = paramLong;
    if (paramMap != null)
    {
      this.h = new HashMap(paramMap);
      return;
    }
    this.h = Collections.emptyMap();
  }

  public static Preferences a()
  {
    if (a == null)
      monitorenter;
    try
    {
      if (a == null)
        a = Preferences.getById(GlobalConfig.getAppContext(), "pref_app_launcher");
      return a;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static void a(ALSuggestion paramALSuggestion)
  {
    b = paramALSuggestion;
    SharePrefSubmitor.submit(a().edit().putObject("key_suggestion", paramALSuggestion));
  }

  public static void a(List<Entity> paramList)
  {
    c = paramList;
    String str = a.a().a(paramList);
    SharePrefSubmitor.submit(a().edit().putString("key_install_entity", str));
  }

  public static ALSuggestion b()
  {
    if (b == null)
      b = (ALSuggestion)a().getObject("key_suggestion", ALSuggestion.class, null);
    return b;
  }

  public static List<Entity> c()
  {
    String str;
    Type localType;
    if (c == null)
    {
      str = a().getString("key_install_entity", "");
      localType = new c().getType();
    }
    try
    {
      c = (List)a.a().a(str, localType);
      label42: return c;
    }
    catch (Throwable localThrowable)
    {
      break label42;
    }
    catch (JsonSyntaxException localJsonSyntaxException)
    {
      break label42;
    }
  }

  public final void a(long paramLong)
  {
    this.g = paramLong;
  }

  public final String d()
  {
    return this.d;
  }

  public final String e()
  {
    return this.e;
  }

  public final boolean f()
  {
    return this.f;
  }

  public final long g()
  {
    return this.g;
  }

  public final Map<String, String> h()
  {
    return this.h;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.manager.b
 * JD-Core Version:    0.6.0
 */