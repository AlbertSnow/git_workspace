package com.google.zxing.pdf417.decoder;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.b;
import com.google.zxing.f;

final class c
{
  private b a;
  private f b;
  private f c;
  private f d;
  private f e;
  private int f;
  private int g;
  private int h;
  private int i;

  c(b paramb, f paramf1, f paramf2, f paramf3, f paramf4)
  {
    if (((paramf1 == null) && (paramf3 == null)) || ((paramf2 == null) && (paramf4 == null)) || ((paramf1 != null) && (paramf2 == null)) || ((paramf3 != null) && (paramf4 == null)))
      throw NotFoundException.getNotFoundInstance();
    a(paramb, paramf1, paramf2, paramf3, paramf4);
  }

  c(c paramc)
  {
    a(paramc.a, paramc.b, paramc.c, paramc.d, paramc.e);
  }

  static c a(c paramc1, c paramc2)
  {
    if (paramc1 == null)
      return paramc2;
    if (paramc2 == null)
      return paramc1;
    return new c(paramc1.a, paramc1.b, paramc1.c, paramc2.d, paramc2.e);
  }

  private void a(b paramb, f paramf1, f paramf2, f paramf3, f paramf4)
  {
    this.a = paramb;
    this.b = paramf1;
    this.c = paramf2;
    this.d = paramf3;
    this.e = paramf4;
    i();
  }

  private void i()
  {
    if (this.b == null)
    {
      this.b = new f(0.0F, this.d.b());
      this.c = new f(0.0F, this.e.b());
    }
    while (true)
    {
      this.f = (int)Math.min(this.b.a(), this.c.a());
      this.g = (int)Math.max(this.d.a(), this.e.a());
      this.h = (int)Math.min(this.b.b(), this.d.b());
      this.i = (int)Math.max(this.c.b(), this.e.b());
      return;
      if (this.d != null)
        continue;
      this.d = new f(-1 + this.a.e(), this.b.b());
      this.e = new f(-1 + this.a.e(), this.c.b());
    }
  }

  final int a()
  {
    return this.f;
  }

  final c a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    f localf1 = this.b;
    f localf2 = this.c;
    Object localObject1 = this.d;
    Object localObject2 = this.e;
    f localf6;
    f localf3;
    if (paramInt1 > 0)
      if (paramBoolean)
      {
        localf6 = this.b;
        int k = (int)localf6.b() - paramInt1;
        if (k < 0)
          k = 0;
        localf3 = new f(localf6.a(), k);
        if (!paramBoolean)
          break label178;
      }
    while (true)
    {
      label77: f localf5;
      label91: f localf4;
      if (paramInt2 > 0)
        if (paramBoolean)
        {
          localf5 = this.c;
          int j = paramInt2 + (int)localf5.b();
          if (j >= this.a.f())
            j = -1 + this.a.f();
          localf4 = new f(localf5.a(), j);
          if (!paramBoolean)
            break label198;
        }
      while (true)
      {
        i();
        return new c(this.a, localf3, localf4, (f)localObject1, (f)localObject2);
        localf6 = this.d;
        break;
        label178: localObject1 = localf3;
        localf3 = localf1;
        break label77;
        localf5 = this.e;
        break label91;
        label198: localObject2 = localf4;
        localf4 = localf2;
        continue;
        localf4 = localf2;
      }
      localf3 = localf1;
    }
  }

  final int b()
  {
    return this.g;
  }

  final int c()
  {
    return this.h;
  }

  final int d()
  {
    return this.i;
  }

  final f e()
  {
    return this.b;
  }

  final f f()
  {
    return this.d;
  }

  final f g()
  {
    return this.c;
  }

  final f h()
  {
    return this.e;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.c
 * JD-Core Version:    0.6.0
 */