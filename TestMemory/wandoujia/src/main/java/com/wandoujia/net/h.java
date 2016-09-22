package com.wandoujia.net;

import java.nio.charset.Charset;
import java.util.List;

public final class h
{
  q a = new q();
  private t b = new t();
  private String c;
  private String d;
  private int e;
  private HttpException f;
  private long g;
  private long h = -1L;

  public final int a()
  {
    return this.e;
  }

  public final void a(int paramInt)
  {
    this.e = paramInt;
  }

  final void a(long paramLong)
  {
    this.g = paramLong;
  }

  final void a(HttpException paramHttpException)
  {
    this.f = paramHttpException;
  }

  public final void a(String paramString)
  {
    this.c = paramString;
  }

  public final String b()
  {
    return this.c;
  }

  final void b(long paramLong)
  {
    this.h = paramLong;
  }

  final void b(String paramString)
  {
    this.d = paramString;
  }

  public final boolean c()
  {
    return "chunked".equalsIgnoreCase(this.b.a("Transfer-Encoding"));
  }

  public final String d()
  {
    Multimap localMultimap = Multimap.parseSemicolonDelimited(this.b.a("Content-Type"));
    if (localMultimap != null)
    {
      String str = localMultimap.getString("charset");
      if ((str != null) && (Charset.isSupported(str)))
        return str;
    }
    return null;
  }

  final long e()
  {
    try
    {
      long l = Long.parseLong(this.b.a("Content-Length"));
      return l;
    }
    catch (Exception localException)
    {
    }
    return -1L;
  }

  public final t f()
  {
    return this.b;
  }

  public final String g()
  {
    return this.d;
  }

  public final HttpException h()
  {
    return this.f;
  }

  public final long i()
  {
    return this.g;
  }

  public final long j()
  {
    return this.h;
  }

  final void k()
  {
    this.c = null;
    this.e = 0;
    this.b = new t();
  }

  public final List<TrackInfo> l()
  {
    return this.a.d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.h
 * JD-Core Version:    0.6.0
 */