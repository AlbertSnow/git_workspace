package com.wandoujia.account.storage;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.text.TextUtils;
import java.io.IOException;

final class b
  implements AccountManagerCallback<Boolean>
{
  private String a;
  private String b;

  public b(a parama, String paramString1, String paramString2)
  {
    this.b = paramString2;
    this.a = paramString1;
  }

  public final void run(AccountManagerFuture<Boolean> paramAccountManagerFuture)
  {
    if (paramAccountManagerFuture == null);
    while (true)
    {
      return;
      try
      {
        if ((Boolean)paramAccountManagerFuture.getResult() != Boolean.TRUE)
          continue;
        if (this.c.f() != null)
        {
          this.c.a(this.a, this.b);
          return;
        }
        if ((TextUtils.isEmpty(this.a)) || (!TextUtils.isEmpty(this.b)))
          continue;
        a.a(this.c, this.a, this.b);
        return;
      }
      catch (AuthenticatorException localAuthenticatorException)
      {
        return;
      }
      catch (Exception localException)
      {
        return;
      }
      catch (IOException localIOException)
      {
        return;
      }
      catch (OperationCanceledException localOperationCanceledException)
      {
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.storage.b
 * JD-Core Version:    0.6.0
 */