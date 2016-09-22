package com.wandoujia.p4.account.authenticator;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AccountSyncService extends Service
{
  private c a = null;

  public IBinder onBind(Intent paramIntent)
  {
    if (this.a == null)
      this.a = new c(getApplicationContext());
    return this.a.getSyncAdapterBinder();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.authenticator.AccountSyncService
 * JD-Core Version:    0.6.0
 */