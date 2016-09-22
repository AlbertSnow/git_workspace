package com.wandoujia.net;

import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import com.wandoujia.net.a.a;

public final class AsyncHttpRequest
{
  private final Uri a;
  private final AsyncHttpRequest.Method b;
  private final t c;
  private a d;

  public AsyncHttpRequest(Uri paramUri)
  {
    this(paramUri, AsyncHttpRequest.Method.GET);
  }

  public AsyncHttpRequest(Uri paramUri, AsyncHttpRequest.Method paramMethod)
  {
    this.a = paramUri;
    this.b = paramMethod;
    this.c = new t();
    this.c.a("Accept", "*/*");
    this.c.a("Accept-Language", "en-US,en;q=0.8,zh-CN;q=0.6,zh;q=0.4,ja;q=0.2");
    this.c.a("Connection", "keep-alive");
    this.c.a("User-Agent", "Mozilla/5.0 (Linux; Android " + Build.VERSION.RELEASE + "; " + Build.MODEL + ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/41.0.2272.96 Mobile Safari/535.19");
  }

  public final Uri a()
  {
    return this.a;
  }

  public final void a(a parama)
  {
    this.d = parama;
  }

  public final void a(String paramString)
  {
    a("Cookie", paramString);
  }

  public final void a(String paramString1, String paramString2)
  {
    this.c.a(paramString1, paramString2);
  }

  public final AsyncHttpRequest.Method b()
  {
    return this.b;
  }

  public final void b(String paramString)
  {
    a("Referer", paramString);
  }

  public final t c()
  {
    return this.c;
  }

  public final a d()
  {
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.AsyncHttpRequest
 * JD-Core Version:    0.6.0
 */