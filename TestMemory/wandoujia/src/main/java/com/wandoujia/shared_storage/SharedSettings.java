package com.wandoujia.shared_storage;

import java.lang.reflect.Type;

public final class SharedSettings extends e<SharedSettings.SettingLine>
{
  private static SharedSettings a;

  public static SharedSettings a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new SharedSettings();
      SharedSettings localSharedSettings = a;
      return localSharedSettings;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final String a(String paramString1, String paramString2)
  {
    SharedSettings.SettingLine localSettingLine = (SharedSettings.SettingLine)f(paramString1);
    try
    {
      if (localSettingLine.getValue() != null)
      {
        String str = localSettingLine.getValue();
        paramString2 = str;
      }
      return paramString2;
    }
    catch (Exception localException)
    {
    }
    return paramString2;
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    a(new SharedSettings.SettingLine(paramString, String.valueOf(paramBoolean)));
  }

  public final boolean a(String paramString)
  {
    SharedSettings.SettingLine localSettingLine = (SharedSettings.SettingLine)f(paramString);
    try
    {
      boolean bool = Boolean.parseBoolean(localSettingLine.getValue());
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public final String b()
  {
    return "shared_settings";
  }

  public final void b(String paramString1, String paramString2)
  {
    a(new SharedSettings.SettingLine(paramString1, paramString2));
  }

  protected final Type c()
  {
    return new m().getType();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.shared_storage.SharedSettings
 * JD-Core Version:    0.6.0
 */