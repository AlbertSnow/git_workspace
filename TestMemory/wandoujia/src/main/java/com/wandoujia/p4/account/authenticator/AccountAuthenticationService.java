package com.wandoujia.p4.account.authenticator;

import android.accounts.AbstractAccountAuthenticator;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AccountAuthenticationService extends Service
{
  private AbstractAccountAuthenticator a;

  public IBinder onBind(Intent paramIntent)
  {
    return this.a.getIBinder();
  }

  public void onCreate()
  {
    super.onCreate();
    this.a = new a(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.authenticator.AccountAuthenticationService
 * JD-Core Version:    0.6.0
 */