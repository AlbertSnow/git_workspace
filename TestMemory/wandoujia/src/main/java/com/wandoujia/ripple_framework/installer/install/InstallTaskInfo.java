package com.wandoujia.ripple_framework.installer.install;

public final class InstallTaskInfo
{
  private String a;
  private InstallTaskInfo.EventType b;
  private float c;
  private long d;
  private long e;
  private long f;

  public InstallTaskInfo(String paramString, InstallTaskInfo.EventType paramEventType)
  {
    this.a = paramString;
    this.b = paramEventType;
  }

  public final String a()
  {
    return this.a;
  }

  public final void a(float paramFloat)
  {
    this.c = paramFloat;
  }

  public final void a(long paramLong)
  {
    this.d = paramLong;
  }

  public final InstallTaskInfo.EventType b()
  {
    return this.b;
  }

  public final void b(long paramLong)
  {
    this.e = paramLong;
  }

  public final float c()
  {
    return this.c;
  }

  public final void c(long paramLong)
  {
    this.f = paramLong;
  }

  public final long d()
  {
    return this.d;
  }

  public final long e()
  {
    return this.e;
  }

  public final long f()
  {
    return this.f;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.InstallTaskInfo
 * JD-Core Version:    0.6.0
 */