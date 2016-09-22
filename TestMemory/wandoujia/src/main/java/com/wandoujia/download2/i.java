package com.wandoujia.download2;

import android.os.SystemClock;
import com.wandoujia.net.TrackInfo;
import com.wandoujia.net.a;
import com.wandoujia.net.h;
import java.util.List;

abstract class i
{
  protected final String a;
  protected final a b;
  protected final DownloadInfo2 c;
  protected long d;
  protected long e;
  protected final l f = new l();
  protected long g = -1L;

  i(DownloadRequestParam paramDownloadRequestParam, String paramString, a parama)
  {
    this.a = paramString;
    this.b = parama;
    this.c = new DownloadInfo2(paramDownloadRequestParam);
  }

  abstract void a();

  abstract void b();

  abstract void c();

  abstract void d();

  abstract void e();

  abstract void f();

  abstract void g();

  List<TrackInfo> h()
  {
    return this.b.a(this.g).l();
  }

  final long j()
  {
    return SystemClock.uptimeMillis() - this.e;
  }

  final long k()
  {
    if (this.c.d == -1L)
      return this.c.e;
    return this.c.d - this.d;
  }

  final DownloadInfo2 l()
  {
    return this.c;
  }

  final long m()
  {
    return this.g;
  }

  final String n()
  {
    return this.c.a.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.i
 * JD-Core Version:    0.6.0
 */