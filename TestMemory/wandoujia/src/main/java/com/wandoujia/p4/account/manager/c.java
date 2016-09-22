package com.wandoujia.p4.account.manager;

import android.content.Context;
import android.content.Intent;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.wandoujia.account.listener.IAccountListener;
import com.wandoujia.account.listener.IAccountListener.LoginType;
import com.wandoujia.p4.a;

public final class c
  implements IAccountListener
{
  private final Context a;

  public c(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
  }

  public final void a()
  {
    this.a.sendBroadcast(new Intent("pheonix.intent.action.REGISTER_SUCCESS"));
  }

  public final void a(IAccountListener.LoginType paramLoginType)
  {
    Intent localIntent = new Intent("pheonix.intent.action.LOGIN_SUCCESS");
    localIntent.putExtra("pheonix.intent.action.ACCOUNT_LOGIN_TYPE", paramLoginType);
    this.a.sendBroadcast(localIntent);
  }

  public final void a(boolean paramBoolean)
  {
    d.a().a(paramBoolean);
    try
    {
      CookieSyncManager.createInstance(a.a());
      CookieManager.getInstance().removeAllCookie();
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.manager.c
 * JD-Core Version:    0.6.0
 */