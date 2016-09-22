package com.sina.weibo.sdk.net;

import android.content.Context;
import android.os.AsyncTask;
import com.sina.weibo.sdk.exception.WeiboException;

final class c extends AsyncTask<Void, Void, b<String>>
{
  private final Context a;
  private final String b;
  private final g c;
  private final String d;
  private final f e;

  public c(Context paramContext, String paramString1, g paramg, String paramString2, f paramf)
  {
    this.a = paramContext;
    this.b = paramString1;
    this.c = paramg;
    this.d = paramString2;
    this.e = paramf;
  }

  private b<String> a()
  {
    try
    {
      b localb = new b(HttpManager.a(this.a, this.b, this.d, this.c));
      return localb;
    }
    catch (WeiboException localWeiboException)
    {
    }
    return new b(localWeiboException);
  }

  protected final void onPreExecute()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.net.c
 * JD-Core Version:    0.6.0
 */