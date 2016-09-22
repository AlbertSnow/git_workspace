package com.wandoujia.account.storage;

import android.accounts.AccountManager;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.wandoujia.account.a;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e
  implements c
{
  private static SharedPreferences b;
  private static Context c;
  private static AtomicBoolean e = new AtomicBoolean(false);
  private AccountManager a;
  private final h d = new h(this, 0);
  private long f = System.currentTimeMillis();
  private Handler g;
  private HandlerThread h;

  public e(Context paramContext)
  {
    if (this.h == null)
    {
      this.h = new HandlerThread("handler");
      this.h.start();
      this.g = new Handler(this.h.getLooper());
    }
    if (!e.get())
    {
      this.a = AccountManager.get(paramContext.getApplicationContext());
      c = paramContext.getApplicationContext();
      j();
      this.a.addOnAccountsUpdatedListener(this.d, null, true);
      i();
    }
  }

  private static SharedPreferences c(String paramString)
  {
    return c.getSharedPreferences(paramString, 0);
  }

  @TargetApi(9)
  private void c(String paramString1, String paramString2)
  {
    String str = a.l();
    Bundle localBundle = new Bundle();
    localBundle.putString("WDJ_ACCOUNT_USERNAME", paramString1);
    localBundle.putString("WDJ_ACCOUNT_NICKNAME", str);
    localBundle.putString("WDJ_ACCOUNT_REGISTER_SOURCE", a.s());
    localBundle.putString("WDJ_AUTH", paramString2);
    localBundle.putString("WDJ_ACCOUNT_OPERATION", "WDJ_ACCOUNT_SAVE_ACCOUNT");
    localBundle.putString("WDJ_ACCOUNT_UID", a.t());
    localBundle.putBoolean("WDJ_ACCOUNT_COMPLETED", a.o());
    localBundle.putString("WDJ_ACCOUNT_AVATAR", a.k());
    localBundle.putString("WDJ_ACCOUNT_TELEPHONE", a.r());
    localBundle.putString("WDJ_ACCOUNT_EMAIL", a.q());
    localBundle.putBoolean("WDJ_ACCOUNT_TELEPHONE_VALIDATED", a.p());
    localBundle.putBoolean("WDJ_ACCOUNT_EMAIL_VALIDATED", a.n());
    try
    {
      this.a.addAccount("com.wandoujia", "wandoujia_auth_token", null, localBundle, null, null, null);
      label144: SharedPreferences.Editor localEditor = j().edit();
      localEditor.putString("WDJ_ACCOUNT_NICKNAME", str);
      localEditor.putString("WDJ_ACCOUNT_REGISTER_SOURCE", a.s());
      localEditor.putString("WDJ_AUTH", paramString2);
      localEditor.putString("WDJ_ACCOUNT_USERNAME", a.c());
      localEditor.putString("WDJ_ACCOUNT_TELEPHONE", a.r());
      localEditor.putString("WDJ_ACCOUNT_EMAIL", a.q());
      localEditor.putString("WDJ_ACCOUNT_UID", a.t());
      localEditor.putBoolean("WDJ_ACCOUNT_COMPLETED", a.o());
      localEditor.putBoolean("WDJ_ACCOUNT_EMAIL_VALIDATED", a.n());
      localEditor.putBoolean("WDJ_ACCOUNT_TELEPHONE_VALIDATED", a.p());
      if (Build.VERSION.SDK_INT > 9)
      {
        localEditor.apply();
        return;
      }
      localEditor.commit();
      return;
    }
    catch (Exception localException)
    {
      break label144;
    }
    catch (ClassCastException localClassCastException)
    {
      break label144;
    }
  }

  public static void f()
  {
    if (c == null)
      return;
    SharedPreferences.Editor localEditor = j().edit();
    localEditor.putString("WDJ_AUTH", "");
    localEditor.putString("WDJ_ACCOUNT_UID", "");
    if (Build.VERSION.SDK_INT > 9)
    {
      localEditor.apply();
      return;
    }
    localEditor.commit();
  }

  private static void h()
  {
    synchronized (e)
    {
      boolean bool = e.get();
      if (bool);
    }
    try
    {
      e.wait(2000L);
      label26: monitorexit;
      return;
      localObject = finally;
      monitorexit;
      throw localObject;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label26;
    }
  }

  private void i()
  {
    synchronized (e)
    {
      e.set(false);
      Bundle localBundle = new Bundle();
      localBundle.putString("WDJ_ACCOUNT_OPERATION", "WDJ_ACCOUNT_GET_ACCOUNT");
      this.a.addAccount("com.wandoujia", "wandoujia_auth_token", null, localBundle, null, new f(this, 0), this.g);
      return;
    }
  }

  private static SharedPreferences j()
  {
    monitorenter;
    try
    {
      if (b == null)
        b = c("com.wandoujia.account.sdk");
      SharedPreferences localSharedPreferences = b;
      return localSharedPreferences;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final boolean a()
  {
    return TextUtils.isEmpty(a.i());
  }

  public final boolean a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
      c(a.c(), paramString);
    while (true)
    {
      return true;
      f();
    }
  }

  public final boolean a(String paramString1, String paramString2)
  {
    if (!a.z())
    {
      c(paramString1, paramString2);
      return true;
    }
    return false;
  }

  public final String b()
  {
    h();
    return c("com.wandoujia.account.sdk").getString("WDJ_AUTH", "");
  }

  public final String b(String paramString)
  {
    return "";
  }

  public final boolean b(String paramString1, String paramString2)
  {
    return true;
  }

  public final String c()
  {
    h();
    return c("com.wandoujia.account.sdk").getString("WDJ_ACCOUNT_USERNAME", "");
  }

  public final String d()
  {
    h();
    return c("com.wandoujia.account.sdk").getString("WDJ_ACCOUNT_UID", "");
  }

  public final String e()
  {
    h();
    return c("com.wandoujia.account.sdk").getString("WDJ_ACCOUNT_NICKNAME", null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.storage.e
 * JD-Core Version:    0.6.0
 */