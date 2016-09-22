package com.wandoujia.image;

import java.util.concurrent.FutureTask;

final class m extends s
{
  private final String e;
  private FutureTask f;

  m(b paramb, String paramString, u paramu)
  {
    super(paramu, 0, 0);
    this.e = paramString;
  }

  final void a()
  {
    this.f = new FutureTask(new n(this));
    b.h(this.a).a(this.f);
  }

  final void b()
  {
    if (this.f != null)
    {
      this.f.cancel(true);
      b.h(this.a).b(this.f);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.m
 * JD-Core Version:    0.6.0
 */