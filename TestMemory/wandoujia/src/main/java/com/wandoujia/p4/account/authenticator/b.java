package com.wandoujia.p4.account.authenticator;

import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import com.wandoujia.account.storage.i;
import java.io.IOException;

final class b
  implements AccountManagerCallback<Boolean>
{
  b(a parama, Bundle paramBundle, AccountManager paramAccountManager)
  {
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
        if (a.a(this.c).f() != null)
        {
          a.a(this.c, this.a, this.b);
          return;
        }
        a.a(this.a, this.b);
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
 * Qualified Name:     com.wandoujia.p4.account.authenticator.b
 * JD-Core Version:    0.6.0
 */