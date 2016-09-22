package com.wandoujia.net;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import javax.net.ssl.SSLEngine;

public final class a
{
  private static ae f;
  private final g a;
  private final Handler b;
  private final LinkedList<HttpTransaction> c;
  private long d;
  private com.wandoujia.net.b.b e;

  public a(Context paramContext, g paramg)
  {
    this.a = paramg;
    this.b = new b(this, Looper.myLooper());
    this.c = new LinkedList();
    ac.a().a(new c(this, paramContext));
  }

  private long a(HttpTransaction paramHttpTransaction)
  {
    this.c.add(paramHttpTransaction);
    ac.a().a(new d(paramHttpTransaction));
    return paramHttpTransaction.h();
  }

  public static void a(SSLEngine paramSSLEngine, String paramString, int paramInt)
  {
    if (f == null)
      f = new ae(paramSSLEngine.getClass());
    ae localae = f;
    if (localae.d != null);
    try
    {
      localae.a.set(paramSSLEngine, paramString);
      localae.b.set(paramSSLEngine, Integer.valueOf(paramInt));
      Object localObject = localae.c.get(paramSSLEngine);
      localae.d.set(localObject, Boolean.valueOf(true));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private long b()
  {
    long l = 1L + this.d;
    this.d = l;
    if (l == 0L)
      this.d = (1L + this.d);
    return this.d;
  }

  public static String b(String paramString)
  {
    return paramString + ".wdt";
  }

  private HttpTransaction c(long paramLong)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      HttpTransaction localHttpTransaction = (HttpTransaction)localIterator.next();
      if (localHttpTransaction.h() == paramLong)
        return localHttpTransaction;
    }
    return null;
  }

  public final long a(AsyncHttpRequest paramAsyncHttpRequest)
  {
    return a(new af(this, b(), paramAsyncHttpRequest));
  }

  public final long a(AsyncHttpRequest paramAsyncHttpRequest, File paramFile)
  {
    return a(new r(this, b(), paramAsyncHttpRequest, paramFile));
  }

  final com.wandoujia.net.b.b a()
  {
    return this.e;
  }

  public final h a(long paramLong)
  {
    HttpTransaction localHttpTransaction = c(paramLong);
    if (localHttpTransaction != null)
      return localHttpTransaction.i();
    return null;
  }

  final void a(int paramInt, Object[] paramArrayOfObject)
  {
    this.b.sendMessage(Message.obtain(this.b, paramInt, paramArrayOfObject));
  }

  final void a(long paramLong, Object[] paramArrayOfObject)
  {
    this.b.sendMessageDelayed(Message.obtain(this.b, 8, paramArrayOfObject), paramLong);
  }

  public final void a(String paramString)
  {
    ac.a().a(new e(this, paramString));
  }

  public final void b(long paramLong)
  {
    HttpTransaction localHttpTransaction = c(paramLong);
    if (localHttpTransaction != null)
    {
      this.c.remove(localHttpTransaction);
      ac.a().a(new f(localHttpTransaction));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.a
 * JD-Core Version:    0.6.0
 */