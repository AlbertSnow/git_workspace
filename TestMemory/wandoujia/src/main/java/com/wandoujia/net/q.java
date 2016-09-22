package com.wandoujia.net;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

final class q
{
  private List<TrackInfo> a = new ArrayList();
  private TrackInfo b;
  private long c;

  private long e()
  {
    long l1 = SystemClock.uptimeMillis();
    long l2 = l1 - this.c;
    this.c = l1;
    return l2;
  }

  public final void a()
  {
    this.b.connectDuration = e();
  }

  public final void a(String paramString)
  {
    this.b = new TrackInfo();
    this.a.add(this.b);
    this.c = SystemClock.uptimeMillis();
    this.b.url = paramString;
  }

  public final void b()
  {
    this.b.headerReceiveDuration = e();
  }

  public final void b(String paramString)
  {
    this.b.ip = paramString;
    this.b.ipResolveDuration = e();
  }

  public final void c()
  {
    this.b.bodyReceiveDuration = e();
  }

  public final List<TrackInfo> d()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.q
 * JD-Core Version:    0.6.0
 */