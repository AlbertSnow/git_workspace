package com.wandoujia.p4.app_launcher.clean;

import android.os.CountDownTimer;

public final class a extends CountDownTimer
{
  private final int a;
  private final long b;
  private b c;

  public a(long paramLong, int paramInt)
  {
    super(paramLong, 20L);
    this.b = paramLong;
    this.a = paramInt;
  }

  public final void a(b paramb)
  {
    this.c = paramb;
  }

  public final void onFinish()
  {
    if (this.c != null)
      this.c.a();
  }

  public final void onTick(long paramLong)
  {
    int i = 0 + (int)((float)(this.b - paramLong) / (float)this.b * (0 + this.a));
    if (this.c != null)
      this.c.a(i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.clean.a
 * JD-Core Version:    0.6.0
 */