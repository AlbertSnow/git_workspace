package com.wandoujia.jupiter.morph;

import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.Preferences;
import com.wandoujia.base.utils.Preferences.CustomEditor;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.base.utils.Singleton;
import java.util.HashMap;
import java.util.Map;

public final class g
{
  private static Preferences a;
  private static Map<String, String> b = new HashMap();

  private static Preferences a()
  {
    if (a == null)
      monitorenter;
    try
    {
      if (a == null)
        a = Preferences.getById(GlobalConfig.getAppContext(), "morph_xml_cache");
      return a;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static String a(String paramString)
  {
    String str;
    if (b.containsKey(paramString))
      str = (String)b.get(paramString);
    do
    {
      return str;
      str = a().getString(paramString, "");
    }
    while (TextUtils.isEmpty(str));
    b.put(paramString, str);
    return str;
  }

  public static void a(String paramString1, String paramString2)
  {
    if (!b.containsKey(paramString1))
    {
      b.put(paramString1, paramString2);
      SharePrefSubmitor.submit(a().edit().putString(paramString1, paramString2));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.morph.g
 * JD-Core Version:    0.6.0
 */