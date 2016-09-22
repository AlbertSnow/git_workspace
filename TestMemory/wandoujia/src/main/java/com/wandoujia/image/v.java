package com.wandoujia.image;

import java.util.concurrent.FutureTask;

final class v extends s
{
  private final String e;
  private FutureTask f;

  v(b paramb, String paramString, int paramInt1, int paramInt2, u paramu)
  {
    super(paramu, paramInt1, paramInt2);
    this.e = paramString;
  }

  final void a()
  {
    this.f = new FutureTask(new w(this));
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
 * Qualified Name:     com.wandoujia.image.v
 * JD-Core Version:    0.6.0
 */