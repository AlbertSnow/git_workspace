package com.sina.weibo.sdk.net;

import android.content.Context;

public final class a
{
  private Context a;

  public a(Context paramContext)
  {
    this.a = paramContext;
  }

  public final String a(String paramString1, g paramg, String paramString2)
  {
    return HttpManager.a(this.a, paramString1, paramString2, paramg);
  }

  public final void a(String paramString1, g paramg, String paramString2, f paramf)
  {
    new c(this.a, paramString1, paramg, paramString2, paramf).execute(new Void[1]);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.net.a
 * JD-Core Version:    0.6.0
 */