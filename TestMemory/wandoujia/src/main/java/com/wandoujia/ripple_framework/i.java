package com.wandoujia.ripple_framework;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.wandoujia.base.utils.MemoryUtil;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class i extends h
{
  private static i b;
  private Map<String, Object> a = new HashMap();
  private Boolean c;

  public i()
  {
    b = this;
  }

  public static i k()
  {
    return b;
  }

  public <T> T a(String paramString)
  {
    return this.a.get(paramString);
  }

  public String a()
  {
    return null;
  }

  public String b()
  {
    return null;
  }

  public String c()
  {
    return new File(null).getParent();
  }

  public Class<?> d()
  {
    return null;
  }

  public String e()
  {
    return PreferenceManager.getDefaultSharedPreferences(null).getString("KEY_COLOR_THEME", null);
  }

  public boolean f()
  {
    if (this.c == null)
      if (MemoryUtil.getAvailMemory(null) <= 64L)
        break label36;
    label36: for (boolean bool = true; ; bool = false)
    {
      this.c = Boolean.valueOf(bool);
      return this.c.booleanValue();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.i
 * JD-Core Version:    0.6.0
 */