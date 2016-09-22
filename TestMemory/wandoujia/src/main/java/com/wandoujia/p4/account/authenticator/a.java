package com.wandoujia.p4.account.authenticator;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.wandoujia.account.storage.i;
import com.wandoujia.base.log.Log;
import com.wandoujia.p4.account.activity.AccountProfileActivity;

public final class a extends AbstractAccountAuthenticator
{
  private final Context a;
  private final i b;

  public a(Context paramContext)
  {
    super(paramContext);
    this.a = paramContext;
    this.b = new i(paramContext);
  }

  private Bundle a(AccountAuthenticatorResponse paramAccountAuthenticatorResponse)
  {
    Intent localIntent = new Intent(this.a, AccountProfileActivity.class);
    localIntent.putExtra("accountAuthenticatorResponse", paramAccountAuthenticatorResponse);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("intent", localIntent);
    paramAccountAuthenticatorResponse.onResult(localBundle);
    return localBundle;
  }

  private static Bundle a(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("errorMessage", paramString);
    paramAccountAuthenticatorResponse.onError(0, paramString);
    return localBundle;
  }

  private void a(Bundle paramBundle)
  {
    if (com.wandoujia.account.a.z());
    String str1;
    String str2;
    do
    {
      do
        return;
      while (paramBundle == null);
      str1 = paramBundle.getString("WDJ_AUTH");
      str2 = paramBundle.getString("WDJ_ACCOUNT_USERNAME");
    }
    while (TextUtils.isEmpty(str1));
    com.wandoujia.p4.account.manager.d.a().a(str1);
    if (str2.equals(this.b.c()))
    {
      this.b.a(str2, str1);
      return;
    }
    AccountManager localAccountManager = AccountManager.get(this.a);
    if (this.b.f() == null)
    {
      c(paramBundle, localAccountManager);
      return;
    }
    b(paramBundle, localAccountManager);
  }

  private Bundle b(AccountAuthenticatorResponse paramAccountAuthenticatorResponse)
  {
    Intent localIntent = new Intent(this.a, d.a);
    localIntent.putExtra("accountAuthenticatorResponse", paramAccountAuthenticatorResponse);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("intent", localIntent);
    paramAccountAuthenticatorResponse.onResult(localBundle);
    return localBundle;
  }

  private void b(Bundle paramBundle, AccountManager paramAccountManager)
  {
    paramAccountManager.removeAccount(this.b.f(), new b(this, paramBundle, paramAccountManager), null);
  }

  private static void c(Bundle paramBundle, AccountManager paramAccountManager)
  {
    String str1 = paramBundle.getString("WDJ_AUTH");
    String str2 = paramBundle.getString("WDJ_ACCOUNT_USERNAME");
    String str3 = paramBundle.getString("WDJ_ACCOUNT_NICKNAME");
    String str4 = paramBundle.getString("WDJ_ACCOUNT_REGISTER_SOURCE");
    String str5 = paramBundle.getString("WDJ_ACCOUNT_UID");
    boolean bool1 = paramBundle.getBoolean("WDJ_ACCOUNT_COMPLETED");
    String str6 = paramBundle.getString("WDJ_ACCOUNT_AVATAR");
    String str7 = paramBundle.getString("WDJ_ACCOUNT_TELEPHONE");
    String str8 = paramBundle.getString("WDJ_ACCOUNT_EMAIL");
    boolean bool2 = paramBundle.getBoolean("WDJ_ACCOUNT_EMAIL_VALIDATED");
    boolean bool3 = paramBundle.getBoolean("WDJ_ACCOUNT_TELEPHONE_VALIDATED");
    Account localAccount = new Account(str3, "com.wandoujia");
    Bundle localBundle = new Bundle();
    localBundle.putString("WDJ_ACCOUNT_USERNAME", str2);
    localBundle.putString("WDJ_ACCOUNT_REGISTER_SOURCE", str4);
    localBundle.putBoolean("WDJ_ACCOUNT_COMPLETED", bool1);
    if (!TextUtils.isEmpty(str5))
    {
      localBundle.putString("WDJ_ACCOUNT_UID", str5);
      com.wandoujia.account.a.d(str5);
    }
    paramAccountManager.addAccountExplicitly(localAccount, str1, localBundle);
    com.wandoujia.account.a.f(str3);
    com.wandoujia.account.a.a(str2);
    com.wandoujia.account.a.m(str4);
    com.wandoujia.account.a.b(str1);
    com.wandoujia.account.a.b(bool1);
    com.wandoujia.account.a.e(str6);
    com.wandoujia.account.a.c(bool3);
    com.wandoujia.account.a.a(bool2);
    com.wandoujia.account.a.g(str8);
    com.wandoujia.account.a.h(str7);
    com.wandoujia.p4.account.manager.d.a().b();
  }

  public final Bundle addAccount(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString1, String paramString2, String[] paramArrayOfString, Bundle paramBundle)
  {
    Log.d("AccountAuthenticator", "Add account, type is " + paramString1 + ", token is " + paramString2 + ", features is " + paramArrayOfString + ", options is " + paramBundle, new Object[0]);
    if (!"com.wandoujia".equals(paramString1))
      return a(paramAccountAuthenticatorResponse, "Unknown account type");
    if (com.wandoujia.account.a.z())
    {
      if (paramBundle != null)
      {
        String str = paramBundle.getString("WDJ_ACCOUNT_OPERATION");
        if (!TextUtils.isEmpty(str))
        {
          if (str.equals("WDJ_ACCOUNT_GET_ACCOUNT"))
          {
            Bundle localBundle = new Bundle();
            localBundle.putString("WDJ_AUTH", com.wandoujia.account.a.i());
            localBundle.putString("WDJ_ACCOUNT_NICKNAME", com.wandoujia.account.a.l());
            localBundle.putString("WDJ_ACCOUNT_REGISTER_SOURCE", com.wandoujia.account.a.s());
            localBundle.putBoolean("WDJ_ACCOUNT_COMPLETED", com.wandoujia.account.a.o());
            localBundle.putString("WDJ_ACCOUNT_USERNAME", com.wandoujia.account.a.c());
            localBundle.putString("WDJ_ACCOUNT_UID", com.wandoujia.account.a.t());
            localBundle.putString("WDJ_ACCOUNT_EMAIL", com.wandoujia.account.a.q());
            localBundle.putString("WDJ_ACCOUNT_TELEPHONE", com.wandoujia.account.a.r());
            localBundle.putBoolean("WDJ_ACCOUNT_TELEPHONE_VALIDATED", com.wandoujia.account.a.p());
            localBundle.putBoolean("WDJ_ACCOUNT_EMAIL_VALIDATED", com.wandoujia.account.a.n());
            localBundle.putString("WDJ_ACCOUNT_AVATAR", com.wandoujia.account.a.k());
            return localBundle;
          }
          if (str.equals("WDJ_ACCOUNT_SAVE_ACCOUNT"))
            a(paramBundle);
          while (true)
          {
            return a(paramAccountAuthenticatorResponse, "account sdk");
            if (!str.equals("WDJ_ACCOUNT_LOGOUT_ACCOUNT"))
              continue;
            com.wandoujia.account.a.D();
            com.wandoujia.p4.account.manager.d.a().c();
          }
        }
        return a(paramAccountAuthenticatorResponse);
      }
      return a(paramAccountAuthenticatorResponse);
    }
    if (paramBundle != null)
    {
      if (!TextUtils.isEmpty(paramBundle.getString("WDJ_AUTH")))
      {
        a(paramBundle);
        return a(paramAccountAuthenticatorResponse, "account sdk");
      }
      return b(paramAccountAuthenticatorResponse);
    }
    return b(paramAccountAuthenticatorResponse);
  }

  public final Bundle confirmCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, Bundle paramBundle)
  {
    Log.d("AccountAuthenticator", "Confirm account, account is " + paramAccount + ", options is " + paramBundle, new Object[0]);
    return a(paramAccountAuthenticatorResponse, "unimplement");
  }

  public final Bundle editProperties(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString)
  {
    Log.d("AccountAuthenticator", "Edit account, type is " + paramString, new Object[0]);
    return a(paramAccountAuthenticatorResponse, "unimplement");
  }

  public final Bundle getAuthToken(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle)
  {
    Log.d("AccountAuthenticator", "Get auth, account is " + paramAccount + ", token is " + paramString + ", options is " + paramBundle, new Object[0]);
    return a(paramAccountAuthenticatorResponse, "unimplement");
  }

  public final String getAuthTokenLabel(String paramString)
  {
    return null;
  }

  public final Bundle hasFeatures(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String[] paramArrayOfString)
  {
    return a(paramAccountAuthenticatorResponse, "unimplement");
  }

  public final Bundle updateCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle)
  {
    Log.d("AccountAuthenticator", "Update account, account is " + paramAccount + ", token is " + paramString + ", options is " + paramBundle, new Object[0]);
    return a(paramAccountAuthenticatorResponse, "unimplement");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.authenticator.a
 * JD-Core Version:    0.6.0
 */