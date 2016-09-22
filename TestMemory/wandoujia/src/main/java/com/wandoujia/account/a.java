package com.wandoujia.account;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.wandoujia.account.dto.Role;
import com.wandoujia.account.storage.AccountStorageType;
import com.wandoujia.account.storage.e;
import com.wandoujia.account.storage.i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a
{
  private static Context a;
  private static SharedPreferences b;
  private static com.wandoujia.account.storage.c c = null;
  private static final ExecutorService d = Executors.newSingleThreadExecutor();
  private static AccountStorageType e;
  private static AtomicBoolean f = new AtomicBoolean(false);
  private static Handler g = new Handler(Looper.getMainLooper());

  public static long A()
  {
    return H().getLong("KEY_WDJ_ACCOUNT_LAST_VERIFIED_TIME", -1L);
  }

  public static void B()
  {
    SharedPreferences.Editor localEditor = H().edit();
    localEditor.putLong("KEY_WDJ_ACCOUNT_LAST_VERIFIED_TIME", System.currentTimeMillis());
    a(localEditor);
  }

  public static boolean C()
  {
    I();
    return H().getBoolean("KEY_WDJ_TRUSTED", false);
  }

  public static void D()
  {
    d("");
    b("");
    a(0L);
    b(0L);
    c(0L);
    e("");
    n("");
    o("");
    a(new HashSet());
    e.f();
  }

  private static com.wandoujia.account.storage.c G()
  {
    monitorenter;
    while (true)
    {
      try
      {
        if (c != null)
          continue;
        if (e != AccountStorageType.SYSTEM)
          continue;
        c = new i(a);
        com.wandoujia.account.storage.d locald = new com.wandoujia.account.storage.d(H());
        if ((!locald.a()) || (c.a()))
          continue;
        String str1 = locald.c();
        String str2 = locald.b();
        c.a(str1, str2);
        locald.f();
        com.wandoujia.account.storage.c localc = c;
        return localc;
        if (e == AccountStorageType.SHARED_PREFERENCE)
        {
          c = new com.wandoujia.account.storage.d(q("com.wandoujia.account.sdk.perference"));
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      if (e == AccountStorageType.SDK)
      {
        c = new e(a);
        continue;
      }
      if (e != AccountStorageType.FIVE)
        continue;
      c = new com.wandoujia.account.storage.a(a);
    }
  }

  private static SharedPreferences H()
  {
    monitorenter;
    try
    {
      if (b == null)
        b = q("com.wandoujia.account");
      SharedPreferences localSharedPreferences = b;
      return localSharedPreferences;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private static void I()
  {
    if (a == null)
      throw new RuntimeException("you must init account!!!");
  }

  private static Set<Role> J()
  {
    String str = H().getString("WDJ_ROLE", "");
    if (TextUtils.isEmpty(str))
      str = G().b("ACCOUNT_STORAGE_KEY_ROLE");
    HashSet localHashSet = new HashSet();
    if (TextUtils.isEmpty(str))
      return localHashSet;
    StringTokenizer localStringTokenizer = new StringTokenizer(str, ",");
    while (localStringTokenizer.hasMoreTokens())
      try
      {
        localHashSet.add(Role.valueOf(localStringTokenizer.nextToken()));
      }
      catch (Exception localException)
      {
      }
    return localHashSet;
  }

  public static Context a()
  {
    return a;
  }

  public static void a(long paramLong)
  {
    SharedPreferences.Editor localEditor = H().edit();
    localEditor.putLong("ACTIVE_SINA", paramLong);
    a(localEditor);
  }

  public static void a(Context paramContext, AccountStorageType paramAccountStorageType)
  {
    a = paramContext.getApplicationContext();
    e = paramAccountStorageType;
  }

  @TargetApi(9)
  private static void a(SharedPreferences.Editor paramEditor)
  {
    if (Build.VERSION.SDK_INT > 9)
    {
      paramEditor.apply();
      return;
    }
    d.execute(new b(paramEditor));
  }

  public static void a(f paramf)
  {
    if (f.get())
    {
      if (Looper.getMainLooper().getThread() == Thread.currentThread())
      {
        t();
        paramf.a();
        return;
      }
      g.post(new c(paramf));
      return;
    }
    new Thread(new d(paramf)).start();
  }

  public static void a(String paramString)
  {
    SharedPreferences.Editor localEditor = H().edit();
    localEditor.putString("WDJ_USERNAME", paramString);
    a(localEditor);
  }

  public static void a(Set<Role> paramSet)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramSet.iterator();
    while (localIterator.hasNext())
    {
      Role localRole = (Role)localIterator.next();
      if (localRole == null)
        continue;
      localStringBuilder.append(localRole.toString());
      localStringBuilder.append(",");
    }
    SharedPreferences.Editor localEditor = H().edit();
    localEditor.putString("WDJ_ROLE", localStringBuilder.toString());
    a(localEditor);
    String str = localStringBuilder.toString();
    G().b("ACCOUNT_STORAGE_KEY_ROLE", str);
  }

  public static void a(boolean paramBoolean)
  {
    if (H() != null)
    {
      SharedPreferences.Editor localEditor = H().edit();
      localEditor.putBoolean("KEY_WDJ_EMAIL_VALIDATED", paramBoolean);
      a(localEditor);
    }
  }

  public static boolean a(Role paramRole)
  {
    Iterator localIterator = J().iterator();
    while (localIterator.hasNext())
      if (((Role)localIterator.next()).equals(paramRole))
        return true;
    return false;
  }

  public static boolean a(String paramString1, String paramString2)
  {
    if (g())
    {
      b(paramString2);
      return G().a(paramString1, paramString2);
    }
    return false;
  }

  public static void b()
  {
    synchronized (f)
    {
      f.set(true);
      f.notifyAll();
      H();
      G();
      return;
    }
  }

  public static void b(long paramLong)
  {
    SharedPreferences.Editor localEditor = H().edit();
    localEditor.putLong("ACTIVE_QQ", paramLong);
    a(localEditor);
  }

  public static void b(String paramString)
  {
    G().a(paramString);
    SharedPreferences.Editor localEditor = H().edit();
    localEditor.putString("WDJ_AUTH", paramString);
    a(localEditor);
  }

  public static void b(boolean paramBoolean)
  {
    if (H() != null)
    {
      SharedPreferences.Editor localEditor = H().edit();
      localEditor.putBoolean("KEY_WDJ_ACCOUNT_COMPLETED", paramBoolean);
      a(localEditor);
    }
  }

  public static String c()
  {
    I();
    String str = H().getString("WDJ_USERNAME", "");
    if (TextUtils.isEmpty(str))
      str = G().c();
    return str;
  }

  public static void c(long paramLong)
  {
    SharedPreferences.Editor localEditor = H().edit();
    localEditor.putLong("ACTIVE_RENREN", paramLong);
    a(localEditor);
  }

  public static void c(String paramString)
  {
    SharedPreferences.Editor localEditor = H().edit();
    localEditor.putString("KEY_WDJ_SECCODE", paramString);
    a(localEditor);
  }

  public static void c(boolean paramBoolean)
  {
    if (H() != null)
    {
      SharedPreferences.Editor localEditor = H().edit();
      localEditor.putBoolean("KEY_WDJ_TEL_VALIDATED", paramBoolean);
      a(localEditor);
    }
  }

  public static long d()
  {
    return H().getLong("ACTIVE_SINA", 0L);
  }

  public static void d(long paramLong)
  {
    SharedPreferences.Editor localEditor = H().edit();
    localEditor.putLong("ACTIVE_WECHAT", paramLong);
    a(localEditor);
  }

  public static void d(String paramString)
  {
    if (H() != null)
    {
      SharedPreferences.Editor localEditor = H().edit();
      localEditor.putString("WDJ_UID", paramString);
      a(localEditor);
    }
  }

  public static void d(boolean paramBoolean)
  {
    if (H() != null)
    {
      SharedPreferences.Editor localEditor = H().edit();
      localEditor.putBoolean("KEY_WDJ_NEED_UPDATE_PASSWORD", paramBoolean);
      a(localEditor);
    }
  }

  public static long e()
  {
    return H().getLong("ACTIVE_QQ", 0L);
  }

  public static void e(String paramString)
  {
    SharedPreferences.Editor localEditor = H().edit();
    localEditor.putString("WDJ_AVATAR", paramString);
    a(localEditor);
  }

  public static void e(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = H().edit();
    localEditor.putBoolean("KEY_WDJ_NEED_UPDATE_PROFILE", paramBoolean);
    a(localEditor);
  }

  public static long f()
  {
    return H().getLong("ACTIVE_RENREN", 0L);
  }

  public static void f(String paramString)
  {
    if (H() != null)
    {
      SharedPreferences.Editor localEditor = H().edit();
      localEditor.putString("WDJ_NICKNAME", paramString);
      a(localEditor);
    }
  }

  public static void f(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = H().edit();
    localEditor.putBoolean("KEY_WDJ_TRUSTED", paramBoolean);
    a(localEditor);
  }

  public static void g(String paramString)
  {
    if (H() != null)
    {
      SharedPreferences.Editor localEditor = H().edit();
      localEditor.putString("KEY_WDJ_EMAIL", paramString);
      a(localEditor);
    }
  }

  public static boolean g()
  {
    return (e != AccountStorageType.SDK) || (!z());
  }

  public static String h()
  {
    return H().getString("KEY_WDJ_SECCODE", "");
  }

  public static void h(String paramString)
  {
    if (H() != null)
    {
      SharedPreferences.Editor localEditor = H().edit();
      localEditor.putString("KEY_WDJ_TELEPHONE", paramString);
      a(localEditor);
    }
  }

  public static String i()
  {
    I();
    String str1;
    if (G() == null)
      str1 = "";
    do
    {
      return str1;
      str1 = H().getString("WDJ_AUTH", "");
      if (!TextUtils.isEmpty(str1))
        continue;
      String str2 = G().b();
      if (!TextUtils.isEmpty(str2))
      {
        b(str2);
        return str2;
      }
      return "";
    }
    while (!str1.equals("unready"));
    return "";
  }

  public static void i(String paramString)
  {
    if (H() != null)
    {
      SharedPreferences.Editor localEditor = H().edit();
      localEditor.putString("KEY_WDJ_SINA_ACCOUNT_NICK", paramString);
      a(localEditor);
    }
  }

  public static String j()
  {
    I();
    return G().c();
  }

  public static void j(String paramString)
  {
    if (H() != null)
    {
      SharedPreferences.Editor localEditor = H().edit();
      localEditor.putString("KEY_WDJ_QQ_ACCOUNT_NICK", paramString);
      a(localEditor);
    }
  }

  public static String k()
  {
    String str = H().getString("WDJ_AVATAR", "");
    if (TextUtils.isEmpty(str))
      str = "https://account.wandoujia.com/avatar.php?uid=" + t();
    return str;
  }

  public static void k(String paramString)
  {
    if (H() != null)
    {
      SharedPreferences.Editor localEditor = H().edit();
      localEditor.putString("KEY_WDJ_RENREN_ACCOUNT_NICK", paramString);
      a(localEditor);
    }
  }

  public static String l()
  {
    I();
    String str = H().getString("WDJ_NICKNAME", "");
    if (TextUtils.isEmpty(str))
      str = G().e();
    if (TextUtils.isEmpty(str))
      str = "";
    return str;
  }

  public static void l(String paramString)
  {
    if (H() != null)
    {
      SharedPreferences.Editor localEditor = H().edit();
      localEditor.putString("KEY_WDJ_WECHAT_ACCOUNT_NICK", paramString);
      a(localEditor);
    }
  }

  public static void m(String paramString)
  {
    if (H() != null)
    {
      SharedPreferences.Editor localEditor = H().edit();
      localEditor.putString("KEY_WDJ_REGISTER_SOURCE", paramString);
      a(localEditor);
    }
  }

  public static boolean m()
  {
    String str = l().trim();
    if (str.length() != 11);
    while (true)
    {
      return false;
      int i = 0;
      if (i >= str.length())
        break;
      if ((i < 3) || (i > 6))
        if (!Character.isDigit(str.charAt(i)))
          continue;
      do
      {
        i++;
        break;
      }
      while (str.charAt(i) == '*');
      return false;
    }
    return true;
  }

  public static void n(String paramString)
  {
    if (H() != null)
    {
      SharedPreferences.Editor localEditor = H().edit();
      localEditor.putString("KEY_WDJ_LAST_SAVED_TELEPHONE", paramString);
      a(localEditor);
    }
  }

  public static boolean n()
  {
    return H().getBoolean("KEY_WDJ_EMAIL_VALIDATED", false);
  }

  public static void o(String paramString)
  {
    if (H() != null)
    {
      SharedPreferences.Editor localEditor = H().edit();
      localEditor.putString("KEY_WDJ_LAST_SAVED_EMAIL", paramString);
      a(localEditor);
    }
  }

  public static boolean o()
  {
    return H().getBoolean("KEY_WDJ_ACCOUNT_COMPLETED", false);
  }

  public static String p(String paramString)
  {
    return H().getString(paramString, "");
  }

  public static boolean p()
  {
    return H().getBoolean("KEY_WDJ_TEL_VALIDATED", false);
  }

  private static SharedPreferences q(String paramString)
  {
    if (a == null)
      I();
    return a.getSharedPreferences(paramString, 0);
  }

  public static String q()
  {
    return H().getString("KEY_WDJ_EMAIL", "");
  }

  public static String r()
  {
    I();
    return H().getString("KEY_WDJ_TELEPHONE", "");
  }

  public static String s()
  {
    return H().getString("KEY_WDJ_REGISTER_SOURCE", "");
  }

  public static String t()
  {
    I();
    Object localObject = H().getString("WDJ_UID", "");
    if (TextUtils.isEmpty((CharSequence)localObject));
    try
    {
      String str = G().d();
      localObject = str;
      if (TextUtils.isEmpty((CharSequence)localObject))
        localObject = "";
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
        localObject = "";
    }
  }

  public static String u()
  {
    return H().getString("KEY_WDJ_LAST_SAVED_TELEPHONE", "");
  }

  public static String v()
  {
    return H().getString("KEY_WDJ_LAST_SAVED_EMAIL", "");
  }

  public static boolean w()
  {
    return H().getBoolean("KEY_WDJ_ACCOUNT_EVER_LOGOUT", false);
  }

  public static void x()
  {
    SharedPreferences.Editor localEditor = H().edit();
    localEditor.putBoolean("KEY_WDJ_ACCOUNT_EVER_LOGOUT", true);
    a(localEditor);
  }

  public static boolean y()
  {
    I();
    return H().getBoolean("KEY_WDJ_NEED_UPDATE_PROFILE", false);
  }

  public static boolean z()
  {
    return !TextUtils.isEmpty(i());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.a
 * JD-Core Version:    0.6.0
 */