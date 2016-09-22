package com.wandoujia.p4.configs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Environment;
import android.text.TextUtils;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.online_config.l;
import com.wandoujia.p4.a;
import com.wandoujia.shared_storage.SharedSettings;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@SuppressLint({"CommitPrefEdits"})
public final class Config
{
  private static final String[] a = { "app", "music", "video", "image", "book", "backup", "diagnosis", "export", ".config", ".md5", "data", ".client", "capture", "wandoujia photos", "misc", "mario", "community" };
  private static SharedPreferences b;
  private static SharedPreferences c;
  private static String d = null;
  private static String e = null;

  public static int A()
  {
    return a().getInt("KEY_AUTO_INSTALL_BATCH_UPDATE_DISMISS_COUNT", 0);
  }

  public static boolean B()
  {
    return a().getBoolean("KEY_AUTO_INSTALL_INSTALLER_GUIDE_SHOWN", false);
  }

  public static void C()
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("KEY_AUTO_INSTALL_USER_CLOSED", true);
    localEditor.commit();
  }

  public static boolean D()
  {
    return a().getBoolean("KEY_AUTO_INSTALL_USER_CLOSED", false);
  }

  public static boolean E()
  {
    return a().getBoolean("KEY_GL_INSTALL_HINT", true);
  }

  public static void F()
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("KEY_GL_INSTALL_HINT", false);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void G()
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("KEY_AUTO_INSTALL_DIALOG_HINT", true);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void H()
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("KEY_HAS_REMOVED_DEPRECATED_SHORTCUT", true);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void I()
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("KEY_APP_DEFAULT_SHORTCUT", true);
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean J()
  {
    return a().getBoolean("KEY_APP_DEFAULT_SHORTCUT", false);
  }

  public static boolean K()
  {
    return a().getBoolean("KEY_HAS_REMOVED_DEPRECATED_SHORTCUT", false);
  }

  public static void L()
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("KEY_NEED_DISPLAY_FIVE_ONBOARD", false);
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean M()
  {
    return a().getBoolean("KEY_NEED_DISPLAY_FIVE_ONBOARD", true);
  }

  public static void N()
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("KEY_APP_LAUNCHER_SHORTCUT", true);
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean O()
  {
    return a().getBoolean("KEY_APP_LAUNCHER_SHORTCUT", false);
  }

  public static int P()
  {
    return a().getInt("KEY_LAUNCH_TIMES", 0);
  }

  public static void Q()
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("KEY_ALREADY_SHOW_INTRODUCTION", true);
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean R()
  {
    return ((P() <= 1) || (!a().getBoolean("KEY_ALREADY_SHOW_INTRODUCTION", false))) && (S());
  }

  public static boolean S()
  {
    return (a().getLong("KEY_PLUGIN_LAST_CHECK_TIME", -1L) > 0L) || (a().getLong("first_launch_app_time", 0L) > 0L);
  }

  public static long T()
  {
    return a().getLong("SHORTCUT_CHECK_APP_LAUNCHER", 0L);
  }

  public static long U()
  {
    return a().getLong("KEY_MM_CLEAN_NOTIFY", 0L);
  }

  public static int V()
  {
    return a().getInt("KEY_MM_CLEAN_COUNT", 0);
  }

  public static void W()
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putInt("KEY_MM_CLEAN_COUNT", 0);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void X()
  {
    int i = V();
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putInt("KEY_MM_CLEAN_COUNT", i + 1);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void Y()
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putInt("KEY_LAST_LAUNCH_VERSION_CODE", 12022);
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean Z()
  {
    return 12022 == a().getInt("KEY_LAST_LAUNCH_VERSION_CODE", -1);
  }

  public static SharedPreferences a()
  {
    monitorenter;
    try
    {
      if (b == null)
        b = d("com.wandoujia.phoenix2");
      SharedPreferences localSharedPreferences = b;
      return localSharedPreferences;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  // ERROR //
  private static String a(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 182	java/io/BufferedReader
    //   5: dup
    //   6: new 184	java/io/InputStreamReader
    //   9: dup
    //   10: aload_0
    //   11: invokevirtual 190	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   14: ldc 192
    //   16: invokevirtual 198	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   19: invokespecial 202	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   22: invokespecial 205	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   25: astore_2
    //   26: aload_2
    //   27: invokevirtual 209	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   30: astore 5
    //   32: aload 5
    //   34: invokestatic 215	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   37: ifeq +10 -> 47
    //   40: aload_2
    //   41: invokestatic 221	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   44: ldc 223
    //   46: areturn
    //   47: aload_2
    //   48: invokestatic 221	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   51: aload 5
    //   53: areturn
    //   54: astore 7
    //   56: aload_1
    //   57: invokestatic 221	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   60: ldc 223
    //   62: areturn
    //   63: astore 6
    //   65: aconst_null
    //   66: astore_2
    //   67: aload 6
    //   69: astore 4
    //   71: aload_2
    //   72: invokestatic 221	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   75: aload 4
    //   77: athrow
    //   78: astore 4
    //   80: goto -9 -> 71
    //   83: astore_3
    //   84: aload_2
    //   85: astore_1
    //   86: goto -30 -> 56
    //
    // Exception table:
    //   from	to	target	type
    //   2	26	54	java/lang/Exception
    //   2	26	63	finally
    //   26	40	78	finally
    //   26	40	83	java/lang/Exception
  }

  public static String a(Config.ContentDir paramContentDir)
  {
    String str1 = ao();
    String str2;
    if (!TextUtils.isEmpty(str1))
    {
      str2 = str1 + a[paramContentDir.ordinal()] + "/";
      File localFile = new File(str2);
      if ((localFile.exists()) || (localFile.mkdirs()));
    }
    else
    {
      return null;
    }
    return str2;
  }

  public static String a(String paramString)
  {
    return an().getString(paramString, "");
  }

  public static void a(int paramInt)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putInt("KEY_NOT_INSTALL_NOTIFICATION_SHOWN_TIMES_TOTALLY", paramInt);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void a(long paramLong)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putLong("LAST_CHECK_UPGRADE_TIME", paramLong);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void a(long paramLong, int paramInt)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putInt(String.valueOf(paramLong), paramInt);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void a(l paraml)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putString("KEY_NOT_INSTALL_NOTIFICATION_SHOWN_DAY", paraml.b());
    localEditor.putInt("KEY_NOT_INSTALL_NOTIFICATION_SHOWN_TIMES", paraml.a());
    SharePrefSubmitor.submit(localEditor);
  }

  private static void a(String paramString, Set<String> paramSet)
  {
    if (CollectionUtils.isEmpty(paramSet))
      return;
    SharedPreferences.Editor localEditor = a().edit();
    Object localObject = e(paramString);
    if (localObject == null)
      localObject = new HashSet();
    ((Set)localObject).addAll(paramSet);
    localEditor.putString(paramString, TextUtils.join(";", (Iterable)localObject));
    SharePrefSubmitor.submit(localEditor);
  }

  public static void a(List<Long> paramList)
  {
    Iterator localIterator = paramList.iterator();
    StringBuilder localStringBuilder = new StringBuilder();
    while (localIterator.hasNext())
    {
      localStringBuilder.append(localIterator.next());
      if (!localIterator.hasNext())
        continue;
      localStringBuilder.append(",");
    }
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putString("USER_TICKETS", localStringBuilder.toString());
    SharePrefSubmitor.submit(localEditor);
  }

  public static void a(Set<String> paramSet)
  {
    a("KEY_NOT_INSTALL_APP_NOTIFICATION_SHOWN_LIST", paramSet);
  }

  public static void a(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("KEY_AUTO_INSTALL_INSTALLER_GUIDE_SHOWN", paramBoolean);
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean aa()
  {
    return a().getBoolean("KEY_SHOW_USE_CUSTOM_FONT_TOAST", false);
  }

  public static long ab()
  {
    return a().getLong("KEY_LAST_SHOW_MEMORY_INSUFFICIENT", 0L);
  }

  public static long ac()
  {
    return a().getLong("KEY_LAST_DISK_CLEAN_TIME", 0L);
  }

  public static long ad()
  {
    return a().getLong("KEY_DISK_CLEAN_COUNT", 0L);
  }

  public static long ae()
  {
    return a().getLong("ripple_recommend_notification_timestamp", 0L);
  }

  public static int af()
  {
    return a().getInt("ripple_recommend_notification_count", 0);
  }

  public static List<String> ag()
  {
    String str = a().getString("ripple_support_installed_apps", null);
    if (TextUtils.isEmpty(str))
      return null;
    return new ArrayList(Arrays.asList(str.split("#")));
  }

  public static boolean ah()
  {
    return a().getBoolean("KEY_ENABLE_RECOMMEND_CLEAN_APP", true);
  }

  public static void ai()
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("KEY_ENABLE_RECOMMEND_CLEAN_APP", false);
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean aj()
  {
    return a().getBoolean("KEY_GL_DOWNLOAD_RECOMMENDED", false);
  }

  public static void ak()
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("KEY_GL_DOWNLOAD_RECOMMENDED", true);
    SharePrefSubmitor.submit(localEditor);
  }

  public static long al()
  {
    return a().getLong("KEY_LAST_SPEEDUP_NOTIFICATION_TIME", 0L);
  }

  public static long am()
  {
    return a().getLong("KEY_LAST_UPDATE_SPLASH_AD_TIME", 0L);
  }

  private static SharedPreferences an()
  {
    monitorenter;
    try
    {
      if (c == null)
        c = d("com.wandoujia.phoenix2.config");
      SharedPreferences localSharedPreferences = c;
      return localSharedPreferences;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private static String ao()
  {
    try
    {
      boolean bool = Environment.getExternalStorageState().equals("mounted");
      if (!bool);
      String str;
      File localFile;
      do
      {
        return null;
        str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/wandoujia/";
        localFile = new File(str);
      }
      while ((!localFile.exists()) && (!localFile.mkdirs()));
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static long b()
  {
    return a().getLong("LAST_CHECK_UPGRADE_TIME", 0L);
  }

  public static void b(int paramInt)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putInt("KEY_COMMUNITY_S_IMAGE_SIZE", paramInt);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void b(long paramLong)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putLong("first_5_launch_app_time", paramLong);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void b(l paraml)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putString("KEY_NOT_INSTALL_DIALOG_SHOWN_DAY", paraml.b());
    localEditor.putInt("KEY_NOT_INSTALL_DIALOG_SHOWN_TIMES", paraml.a());
    SharePrefSubmitor.submit(localEditor);
  }

  public static void b(String paramString)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putString("DRAFT_APP_COMMENT_CONTENT", paramString);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void b(List<String> paramList)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putString("ripple_support_installed_apps", TextUtils.join("#", paramList));
    SharePrefSubmitor.submit(localEditor);
  }

  public static void b(Set<String> paramSet)
  {
    a("KEY_APP_HAS_BEEN_UNINSTALLED_LIST", paramSet);
  }

  public static void b(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("KEY_SHOW_USE_CUSTOM_FONT_TOAST", paramBoolean);
    SharePrefSubmitor.submit(localEditor);
  }

  public static long c()
  {
    return a().getLong("first_5_launch_app_time", 0L);
  }

  public static void c(int paramInt)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putInt("KEY_COMMUNITY_M_IMAGE_SIZE", paramInt);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void c(long paramLong)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putLong("KEY_LOCK_SCREEN_NEGATIVE", paramLong);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void c(String paramString)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putString("DRAFT_APP_COMMENT_ENJOY", paramString);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void c(Set<String> paramSet)
  {
    a("KEY_NOT_INSTALL_DIALOG_SHOWN_LIST", paramSet);
  }

  public static int d(long paramLong)
  {
    return a().getInt(String.valueOf(paramLong), 0);
  }

  public static long d()
  {
    return a().getLong("KEY_LOCK_SCREEN_NEGATIVE", 0L);
  }

  @SuppressLint({"WorldWriteableFiles"})
  private static SharedPreferences d(String paramString)
  {
    return a.a().getSharedPreferences(paramString, 2);
  }

  public static void d(int paramInt)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putInt("KEY_AUTO_INSTALL_BATCH_UPDATE_DISMISS_COUNT", paramInt);
    SharePrefSubmitor.submit(localEditor);
  }

  public static int e()
  {
    return a().getInt("KEY_NOT_INSTALL_NOTIFICATION_SHOWN_TIMES_TOTALLY", 0);
  }

  private static Set<String> e(String paramString)
  {
    String str = a().getString(paramString, "");
    if (!TextUtils.isEmpty(str))
      return new HashSet(Arrays.asList(str.split(";")));
    return null;
  }

  public static void e(int paramInt)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putInt("KEY_LAUNCH_TIMES", paramInt);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void e(long paramLong)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putLong("KEY_LAST_LOG_UNINSTALL_TIME", paramLong);
    SharePrefSubmitor.submit(localEditor);
  }

  public static long f()
  {
    return a().getLong("KEY_NOT_INSTALL_DIALOG_IGNORE_TIME", 0L);
  }

  public static void f(int paramInt)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putInt("ripple_recommend_notification_count", paramInt);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void f(long paramLong)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putLong("SHORTCUT_CHECK_APP_LAUNCHER", paramLong);
    SharePrefSubmitor.submit(localEditor);
  }

  public static Set<String> g()
  {
    return e("KEY_NOT_INSTALL_APP_NOTIFICATION_SHOWN_LIST");
  }

  public static void g(long paramLong)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putLong("KEY_MM_CLEAN_NOTIFY", paramLong);
    SharePrefSubmitor.submit(localEditor);
  }

  public static Set<String> h()
  {
    return e("KEY_APP_HAS_BEEN_UNINSTALLED_LIST");
  }

  public static void h(long paramLong)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putLong("KEY_LAST_SHOW_MEMORY_INSUFFICIENT", paramLong);
    SharePrefSubmitor.submit(localEditor);
  }

  public static Set<String> i()
  {
    return e("KEY_NOT_INSTALL_DIALOG_SHOWN_LIST");
  }

  public static void i(long paramLong)
  {
    SharePrefSubmitor.submit(a().edit().putLong("KEY_LAST_DISK_CLEAN_TIME", paramLong));
  }

  public static l j()
  {
    String str = a().getString("KEY_NOT_INSTALL_NOTIFICATION_SHOWN_DAY", "");
    int i = a().getInt("KEY_NOT_INSTALL_NOTIFICATION_SHOWN_TIMES", 0);
    if (TextUtils.isEmpty(str))
      return null;
    return new l(i, str);
  }

  public static void j(long paramLong)
  {
    SharePrefSubmitor.submit(a().edit().putLong("KEY_DISK_CLEAN_COUNT", paramLong));
  }

  public static l k()
  {
    String str = a().getString("KEY_NOT_INSTALL_DIALOG_SHOWN_DAY", "");
    int i = a().getInt("KEY_NOT_INSTALL_DIALOG_SHOWN_TIMES", 0);
    if (TextUtils.isEmpty(str))
      return null;
    return new l(i, str);
  }

  public static void k(long paramLong)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putLong("ripple_recommend_notification_timestamp", paramLong);
    SharePrefSubmitor.submit(localEditor);
  }

  public static String l()
  {
    monitorenter;
    try
    {
      if (TextUtils.isEmpty(d))
      {
        String str2 = SharedSettings.a().a("first_channel", "");
        d = str2;
        if (TextUtils.isEmpty(str2))
        {
          String str3 = a(a.a());
          d = str3;
          e = str3;
          SharedSettings.a().b("first_channel", d);
        }
      }
      String str1 = d;
      return str1;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static void l(long paramLong)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putLong("KEY_LAST_SPEEDUP_NOTIFICATION_TIME", paramLong);
    SharePrefSubmitor.submit(localEditor);
  }

  public static String m()
  {
    monitorenter;
    try
    {
      if (TextUtils.isEmpty(e))
        e = a(a.a());
      String str = e;
      return str;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static void m(long paramLong)
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putLong("KEY_LAST_UPDATE_SPLASH_AD_TIME", paramLong);
    SharePrefSubmitor.submit(localEditor);
  }

  public static List<Long> n()
  {
    String str = a().getString("USER_TICKETS", null);
    ArrayList localArrayList = new ArrayList();
    if (str != null)
    {
      String[] arrayOfString = str.split(",");
      for (int i = 0; i < arrayOfString.length; i++)
        localArrayList.add(Long.valueOf(Long.parseLong(arrayOfString[i])));
    }
    return localArrayList;
  }

  public static long o()
  {
    return a().getLong("KEY_LAST_LOG_UNINSTALL_TIME", 0L);
  }

  public static void p()
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("KEY_HAS_ENTERED_COMMUNITY", true);
    SharePrefSubmitor.submit(localEditor);
  }

  public static void q()
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("KEY_NEED_BIND_DOWNLOAD", false);
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean r()
  {
    return a().getBoolean("KEY_NEED_BIND_DOWNLOAD", true);
  }

  public static int s()
  {
    return a().getInt("KEY_COMMUNITY_S_IMAGE_SIZE", 0);
  }

  public static int t()
  {
    return a().getInt("KEY_COMMUNITY_M_IMAGE_SIZE", 0);
  }

  public static boolean u()
  {
    return a().getBoolean("KEY_AUTO_INSTALL_HINT", false);
  }

  public static void v()
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("KEY_AUTO_INSTALL_HINT", true);
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean w()
  {
    return a().getBoolean("KEY_AUTO_INSTALL_FIRST_INSTALL_FINISHED", false);
  }

  public static void x()
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("KEY_AUTO_INSTALL_FIRST_INSTALL_FINISHED", true);
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean y()
  {
    return a().getBoolean("KEY_AUTO_INSTALL_FIRST_INSTALL_GUIDE_SHOWN", false);
  }

  public static void z()
  {
    SharedPreferences.Editor localEditor = a().edit();
    localEditor.putBoolean("KEY_AUTO_INSTALL_FIRST_INSTALL_GUIDE_SHOWN", true);
    SharePrefSubmitor.submit(localEditor);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.configs.Config
 * JD-Core Version:    0.6.0
 */