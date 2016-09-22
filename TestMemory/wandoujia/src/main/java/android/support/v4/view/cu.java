package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class cu
{
  private static dd c;
  private WeakReference<View> a;
  private int b = -1;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      c = new dc();
      return;
    }
    if (i >= 19)
    {
      c = new db();
      return;
    }
    if (i >= 18)
    {
      c = new cz();
      return;
    }
    if (i >= 16)
    {
      c = new da();
      return;
    }
    if (i >= 14)
    {
      c = new cx();
      return;
    }
    c = new cv();
  }

  cu(View paramView)
  {
    this.a = new WeakReference(paramView);
  }

  public final cu a()
  {
    View localView = (View)this.a.get();
    if (localView != null)
      c.a(localView);
    return this;
  }

  public final cu a(float paramFloat)
  {
    View localView = (View)this.a.get();
    if (localView != null)
      c.a(this, localView, paramFloat);
    return this;
  }

  public final cu a(long paramLong)
  {
    View localView = (View)this.a.get();
    if (localView != null)
      c.a(localView, paramLong);
    return this;
  }

  public final cu a(dh paramdh)
  {
    View localView = (View)this.a.get();
    if (localView != null)
      c.a(this, localView, paramdh);
    return this;
  }

  public final cu a(dj paramdj)
  {
    View localView = (View)this.a.get();
    if (localView != null)
      c.a(localView, paramdj);
    return this;
  }

  public final cu a(Interpolator paramInterpolator)
  {
    View localView = (View)this.a.get();
    if (localView != null)
      c.a(localView, paramInterpolator);
    return this;
  }

  public final cu b()
  {
    View localView = (View)this.a.get();
    if (localView != null)
      c.a(this, localView);
    return this;
  }

  public final cu b(float paramFloat)
  {
    View localView = (View)this.a.get();
    if (localView != null)
      c.b(this, localView, paramFloat);
    return this;
  }

  public final cu c(float paramFloat)
  {
    View localView = (View)this.a.get();
    if (localView != null)
      c.c(this, localView, paramFloat);
    return this;
  }

  public final void c()
  {
    View localView = (View)this.a.get();
    if (localView != null)
      c.b(this, localView);
  }

  public final cu d(float paramFloat)
  {
    View localView = (View)this.a.get();
    if (localView != null)
      c.d(this, localView, paramFloat);
    return this;
  }

  public final void d()
  {
    View localView = (View)this.a.get();
    if (localView != null)
      c.b(localView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.cu
 * JD-Core Version:    0.6.0
 */