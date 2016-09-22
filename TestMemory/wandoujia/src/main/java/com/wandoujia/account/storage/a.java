package com.wandoujia.account.storage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

public final class a
  implements c
{
  private final AccountManager a;

  public a(Context paramContext)
  {
    this.a = AccountManager.get(paramContext);
  }

  private void a(Account paramAccount, String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    try
    {
      this.a.removeAccount(paramAccount, null, null);
      try
      {
        label18: AccountManager localAccountManager = this.a;
        if (TextUtils.isEmpty(paramString))
          paramString = null;
        localAccountManager.setPassword(paramAccount, paramString);
        return;
      }
      catch (SecurityException localSecurityException1)
      {
        return;
      }
    }
    catch (SecurityException localSecurityException2)
    {
      break label18;
    }
  }

  private String c(String paramString1, String paramString2)
  {
    if (!c(paramString1))
      throw new AccountStorageException(AccountStorageException.ExceptionType.ACCOUNT_NOT_EXISTED);
    Account localAccount = new Account(paramString1, "com.wandoujia");
    return this.a.getUserData(localAccount, paramString2);
  }

  private boolean c(String paramString)
  {
    try
    {
      Account[] arrayOfAccount = this.a.getAccountsByType("com.wandoujia");
      if (arrayOfAccount == null);
      label69: 
      while (true)
      {
        return false;
        int i = arrayOfAccount.length;
        for (int j = 0; ; j++)
        {
          if (j >= i)
            break label69;
          Account localAccount = arrayOfAccount[j];
          if (!TextUtils.equals(localAccount.name, paramString))
            continue;
          if (TextUtils.isEmpty(this.a.getPassword(localAccount)))
            break;
          return true;
        }
      }
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    return false;
  }

  private void d(String paramString1, String paramString2)
  {
    String str1 = com.wandoujia.account.a.l();
    String str2 = com.wandoujia.account.a.t();
    Bundle localBundle = new Bundle();
    localBundle.putString("WDJ_ACCOUNT_USERNAME", paramString1);
    localBundle.putString("WDJ_ACCOUNT_REGISTER_SOURCE", com.wandoujia.account.a.s());
    localBundle.putBoolean("WDJ_ACCOUNT_COMPLETED", com.wandoujia.account.a.o());
    localBundle.putString("WDJ_ACCOUNT_UID", str2);
    Account localAccount;
    if (!TextUtils.isEmpty(str1))
      localAccount = new Account(str1, "com.wandoujia");
    try
    {
      while (true)
      {
        this.a.addAccountExplicitly(localAccount, paramString2, localBundle);
        do
          return;
        while (TextUtils.isEmpty(paramString1));
        localAccount = new Account(paramString1, "com.wandoujia");
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      return;
    }
    catch (SecurityException localSecurityException)
    {
    }
  }

  private boolean g()
  {
    int i = 1;
    try
    {
      Account[] arrayOfAccount = this.a.getAccountsByType("com.wandoujia");
      if (arrayOfAccount.length != 0)
      {
        int j = arrayOfAccount.length;
        if (j != i);
      }
      else
      {
        i = 0;
      }
      return i;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public final boolean a()
  {
    try
    {
      Account[] arrayOfAccount = this.a.getAccountsByType("com.wandoujia");
      if (arrayOfAccount == null);
      while (true)
      {
        return false;
        int i = arrayOfAccount.length;
        for (int j = 0; j < i; j++)
        {
          Account localAccount = arrayOfAccount[j];
          if (!TextUtils.isEmpty(this.a.getPassword(localAccount)))
            return true;
        }
      }
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    return false;
  }

  public final boolean a(String paramString)
  {
    Account localAccount = f();
    new StringBuilder("Update default account auth for ").append(localAccount).append(", auth is ").append(paramString);
    if (localAccount == null)
      return false;
    a(localAccount, paramString);
    return true;
  }

  public final boolean a(String paramString1, String paramString2)
  {
    Account localAccount = f();
    if (localAccount == null)
      d(paramString1, paramString2);
    while (true)
    {
      new StringBuilder("Replace account from ").append(localAccount).append(" into ").append(paramString1).append(", ").append(paramString2);
      return true;
      if (TextUtils.equals(this.a.getUserData(localAccount, "WDJ_ACCOUNT_USERNAME"), paramString1))
      {
        if (!g())
        {
          a(localAccount, paramString2);
          continue;
        }
        this.a.removeAccount(localAccount, new b(this, paramString1, paramString2), null);
        continue;
      }
      this.a.removeAccount(localAccount, new b(this, paramString1, paramString2), null);
    }
  }

  public final String b()
  {
    Account localAccount = f();
    if (localAccount == null)
      return "";
    return this.a.getPassword(localAccount);
  }

  public final String b(String paramString)
  {
    Account localAccount = f();
    if (localAccount == null)
      return null;
    return this.a.getUserData(localAccount, paramString);
  }

  public final boolean b(String paramString1, String paramString2)
  {
    Account localAccount = f();
    if (localAccount == null)
      return false;
    this.a.setUserData(localAccount, paramString1, paramString2);
    return true;
  }

  public final String c()
  {
    Account localAccount = f();
    if (localAccount == null)
      return null;
    try
    {
      String str = c(localAccount.name, "WDJ_ACCOUNT_USERNAME");
      return str;
    }
    catch (AccountStorageException localAccountStorageException)
    {
    }
    return null;
  }

  public final String d()
  {
    Account localAccount = f();
    if (localAccount == null)
      return "";
    try
    {
      String str = c(localAccount.name, "WDJ_ACCOUNT_UID");
      return str;
    }
    catch (AccountStorageException localAccountStorageException)
    {
    }
    return "";
  }

  public final String e()
  {
    Account localAccount = f();
    if (localAccount == null)
      return null;
    return localAccount.name;
  }

  public final Account f()
  {
    try
    {
      Account[] arrayOfAccount = this.a.getAccountsByType("com.wandoujia");
      if (arrayOfAccount.length == 0)
        return null;
      Account localAccount = arrayOfAccount[0];
      return localAccount;
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.storage.a
 * JD-Core Version:    0.6.0
 */