package com.wandoujia.account.g;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.wandoujia.account.dto.AccountResponse;

public class a
{
  protected final com.wandoujia.account.listener.a a;
  protected boolean b = true;
  protected String c;
  protected com.wandoujia.account.f.b d;
  private Handler e = new Handler(Looper.getMainLooper());

  public a(String paramString, com.wandoujia.account.listener.a parama, com.wandoujia.account.f.b paramb)
  {
    this.a = parama;
    this.c = paramString;
    this.d = paramb;
  }

  protected final void a(AccountResponse paramAccountResponse)
  {
    if (this.a == null)
      return;
    this.e.post(new b(this, paramAccountResponse));
  }

  public final boolean a()
  {
    if (this.d == null)
      return false;
    Context localContext = android.support.v4.app.b.A();
    if (localContext != null)
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)localContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if ((localNetworkInfo == null) || (!localNetworkInfo.isConnected()));
    }
    for (int i = 1; i == 0; i = 0)
      return false;
    return true;
  }

  protected final void b()
  {
    if (this.a != null)
      this.e.post(new c(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.a
 * JD-Core Version:    0.6.0
 */