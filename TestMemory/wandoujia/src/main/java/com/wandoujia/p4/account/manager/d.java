package com.wandoujia.p4.account.manager;

import android.content.Context;
import android.content.Intent;
import com.wandoujia.account.dto.AccountResponse;
import com.wandoujia.account.dto.DeviceBean;

public final class d
{
  private static d a;
  private Context b = com.wandoujia.p4.a.a();
  private com.wandoujia.account.f.b c;

  private d()
  {
    DeviceBean localDeviceBean = android.support.v4.app.b.s(com.wandoujia.p4.a.a());
    new com.wandoujia.account.listener.c();
    this.c = new com.wandoujia.account.f.b("phoenix2", "", localDeviceBean);
    this.c.a(new c(com.wandoujia.p4.a.a()));
    this.c.a(new com.wandoujia.p4.community.a.a());
  }

  public static d a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new d();
      d locald = a;
      return locald;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a(com.wandoujia.account.listener.a parama)
  {
    this.c.a("verify_account", parama);
  }

  public final void a(String paramString)
  {
    this.c.a(paramString);
  }

  public final void a(String paramString1, String paramString2)
  {
    this.c.c(paramString1, paramString2);
  }

  public final void a(boolean paramBoolean)
  {
    Intent localIntent = new Intent("pheonix.intent.action.LOGOUT_SUCCESS");
    if (paramBoolean)
      localIntent.putExtra("phoenix.intent.extra_ACCOUNT_EXPIRED", true);
    this.b.sendBroadcast(localIntent);
  }

  public final AccountResponse b(String paramString)
  {
    return this.c.f(paramString);
  }

  public final void b()
  {
    this.c.g("verify_account");
  }

  public final void c()
  {
    a(false);
  }

  public final com.wandoujia.account.f.b d()
  {
    return this.c;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.manager.d
 * JD-Core Version:    0.6.0
 */