package com.wandoujia.account.storage;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;

final class h
  implements OnAccountsUpdateListener
{
  private h(e parame)
  {
  }

  public final void onAccountsUpdated(Account[] paramArrayOfAccount)
  {
    if (paramArrayOfAccount == null);
    while (true)
    {
      return;
      int i = paramArrayOfAccount.length;
      for (int j = 0; j < i; j++)
      {
        if (!paramArrayOfAccount[j].type.equals("com.wandoujia"))
          continue;
        e.a(this.a);
        return;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.storage.h
 * JD-Core Version:    0.6.0
 */