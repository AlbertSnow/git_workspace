package com.wandoujia.account.b;

import android.os.Handler;
import com.wandoujia.account.dto.AccountError;
import com.wandoujia.account.dto.AccountResponse;

final class l extends Thread
{
  l(j paramj)
  {
  }

  public final void run()
  {
    try
    {
      String str = "https://account.wandoujia.com/v4/api/oauth/sina?access_token=" + a.j(this.a.a).b() + "&source=" + j.a(this.a) + "&app_id=" + a.b(this.a.a).a() + a.a(j.b(this.a));
      AccountResponse localAccountResponse = this.a.a.c(str);
      if ((localAccountResponse.getError() == AccountError.SUCCESS.getError()) && (localAccountResponse.getMember() != null))
      {
        android.support.v4.app.b.a(localAccountResponse.getMember(), a.c(this.a.a));
        a.g(this.a.a).post(new m(this, localAccountResponse));
        return;
      }
      a.g(this.a.a).post(new n(this, localAccountResponse));
      return;
    }
    catch (Exception localException)
    {
      a.g(this.a.a).post(new o(this));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.b.l
 * JD-Core Version:    0.6.0
 */