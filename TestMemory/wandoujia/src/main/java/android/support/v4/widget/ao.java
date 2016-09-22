package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;

public final class ao
{
  Object a;
  ap b;

  private ao(int paramInt, Context paramContext, Interpolator paramInterpolator)
  {
    if (paramInt >= 14)
      this.b = new as();
    while (true)
    {
      this.a = this.b.a(paramContext, paramInterpolator);
      return;
      if (paramInt >= 9)
      {
        this.b = new ar();
        continue;
      }
      this.b = new aq();
    }
  }

  ao(Context paramContext, Interpolator paramInterpolator)
  {
    this(Build.VERSION.SDK_INT, paramContext, paramInterpolator);
  }

  public static ao a(Context paramContext)
  {
    return a(paramContext, null);
  }

  public static ao a(Context paramContext, Interpolator paramInterpolator)
  {
    return new ao(paramContext, paramInterpolator);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.b.a(this.a, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.b.a(this.a, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }

  public final boolean a()
  {
    return this.b.a(this.a);
  }

  public final int b()
  {
    return this.b.b(this.a);
  }

  public final int c()
  {
    return this.b.c(this.a);
  }

  public final int d()
  {
    return this.b.g(this.a);
  }

  public final int e()
  {
    return this.b.h(this.a);
  }

  public final float f()
  {
    return this.b.d(this.a);
  }

  public final boolean g()
  {
    return this.b.e(this.a);
  }

  public final void h()
  {
    this.b.f(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.ao
 * JD-Core Version:    0.6.0
 */