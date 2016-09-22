package android.support.v4.widget;

import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;

final class b
{
  private int a;
  private int b;
  private float c;
  private float d;
  private long e = -9223372036854775808L;
  private long f = 0L;
  private int g = 0;
  private long h = -1L;
  private float i;
  private int j;

  private float a(long paramLong)
  {
    if (paramLong < this.e)
      return 0.0F;
    if ((this.h < 0L) || (paramLong < this.h))
      return 0.5F * a.a((float)(paramLong - this.e) / this.a);
    long l = paramLong - this.h;
    return 1.0F - this.i + this.i * a.a((float)l / this.j);
  }

  public static boolean a(Object paramObject, float paramFloat)
  {
    ((EdgeEffect)paramObject).onPull(paramFloat);
    return true;
  }

  public final void a()
  {
    this.a = 500;
  }

  public final void a(float paramFloat1, float paramFloat2)
  {
    this.c = paramFloat1;
    this.d = paramFloat2;
  }

  public final void b()
  {
    this.b = 500;
  }

  public final void c()
  {
    this.e = AnimationUtils.currentAnimationTimeMillis();
    this.h = -1L;
    this.f = this.e;
    this.i = 0.5F;
    this.g = 0;
  }

  public final void d()
  {
    long l = AnimationUtils.currentAnimationTimeMillis();
    this.j = a.a((int)(l - this.e), this.b);
    this.i = a(l);
    this.h = l;
  }

  public final boolean e()
  {
    return (this.h > 0L) && (AnimationUtils.currentAnimationTimeMillis() > this.h + this.j);
  }

  public final void f()
  {
    if (this.f == 0L)
      throw new RuntimeException("Cannot compute scroll delta before calling start()");
    long l1 = AnimationUtils.currentAnimationTimeMillis();
    float f1 = a(l1);
    float f2 = f1 * (-4.0F * f1) + f1 * 4.0F;
    long l2 = l1 - this.f;
    this.f = l1;
    this.g = (int)(f2 * (float)l2 * this.d);
  }

  public final int g()
  {
    return (int)(this.c / Math.abs(this.c));
  }

  public final int h()
  {
    return (int)(this.d / Math.abs(this.d));
  }

  public final int i()
  {
    return this.g;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.b
 * JD-Core Version:    0.6.0
 */