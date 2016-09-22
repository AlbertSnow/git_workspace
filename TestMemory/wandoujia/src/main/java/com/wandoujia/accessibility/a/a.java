package com.wandoujia.accessibility.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SharePrefSubmitor;
import java.util.HashSet;
import java.util.Set;

@SuppressLint({"CommitPrefEdits"})
public final class a
{
  private static final String a = GlobalConfig.getPackageName() + ".accessibility";
  private static SharedPreferences b;

  public static int a()
  {
    return m().getInt("KEY_AUTO_INSTALL_SAVE_STEPS", 0);
  }

  public static void a(Set<String> paramSet)
  {
    SharedPreferences.Editor localEditor = m().edit();
    localEditor.putStringSet("KEY_USER_WHITE_LIST", paramSet);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void a(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = m().edit();
    localEditor.putBoolean("KEY_AUTO_INSTALL_BLOCK", paramBoolean);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void b()
  {
    int i = 1 + m().getInt("KEY_AUTO_INSTALL_SAVE_STEPS", 0);
    SharedPreferences.Editor localEditor = m().edit();
    localEditor.putInt("KEY_AUTO_INSTALL_SAVE_STEPS", i);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void b(Set<String> paramSet)
  {
    SharedPreferences.Editor localEditor = m().edit();
    localEditor.putStringSet("KEY_USER_BLACK_LIST", paramSet);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void b(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = m().edit();
    localEditor.putBoolean("KEY_ACCESSIBILITY_CONTACTED", paramBoolean);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void c(Set<String> paramSet)
  {
    SharedPreferences.Editor localEditor = m().edit();
    localEditor.putStringSet("KEY_SYSTEM_WHITE_LIST_FORM_SERVER", paramSet);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void c(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = m().edit();
    localEditor.putBoolean("KEY_AUTO_INSTALL_USER_TURN_OFF", paramBoolean);
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean c()
  {
    return m().getBoolean("KEY_AUTO_INSTALL_BLOCK", false);
  }

  public static void d(Set<String> paramSet)
  {
    SharedPreferences.Editor localEditor = m().edit();
    localEditor.putStringSet("KEY_USER_WHITE_LIST_FORM_SERVER", paramSet);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void d(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = m().edit();
    localEditor.putBoolean("KEY_AUTO_INSTALL_ENABLE", paramBoolean);
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean d()
  {
    return m().getBoolean("KEY_ACCESSIBILITY_CONTACTED", false);
  }

  public static boolean e()
  {
    return m().getBoolean("KEY_AUTO_INSTALL_USER_TURN_OFF", false);
  }

  public static void f()
  {
    SharedPreferences.Editor localEditor = m().edit();
    localEditor.putBoolean("KEY_SHOW_HIBERNATION_ON_BOARD", true);
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean g()
  {
    return m().getBoolean("KEY_SHOW_HIBERNATION_ON_BOARD", false);
  }

  public static boolean h()
  {
    return m().getBoolean("KEY_AUTO_INSTALL_ENABLE", true);
  }

  public static Set<String> i()
  {
    return m().getStringSet("KEY_USER_WHITE_LIST", new HashSet());
  }

  public static Set<String> j()
  {
    return m().getStringSet("KEY_USER_BLACK_LIST", new HashSet());
  }

  public static Set<String> k()
  {
    return m().getStringSet("KEY_SYSTEM_WHITE_LIST_FORM_SERVER", new HashSet());
  }

  public static Set<String> l()
  {
    return m().getStringSet("KEY_USER_WHITE_LIST_FORM_SERVER", new HashSet());
  }

  private static SharedPreferences m()
  {
    monitorenter;
    try
    {
      if (b == null)
      {
        String str = a;
        b = GlobalConfig.getAppContext().getSharedPreferences(str, 2);
      }
      SharedPreferences localSharedPreferences = b;
      return localSharedPreferences;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.a.a
 * JD-Core Version:    0.6.0
 */