package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.view.View;

public final class w
{
  private static final z a;
  private final Object b;

  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new aa();
      return;
    }
    if (Build.VERSION.SDK_INT >= 15)
    {
      a = new y();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new x();
      return;
    }
    a = new z();
  }

  public w(Object paramObject)
  {
    this.b = paramObject;
  }

  public static w a()
  {
    return new w(a.a());
  }

  public final void a(int paramInt)
  {
    a.b(this.b, paramInt);
  }

  public final void a(View paramView)
  {
    a.a(this.b, paramView);
  }

  public final void a(boolean paramBoolean)
  {
    a.a(this.b, paramBoolean);
  }

  public final void b(int paramInt)
  {
    a.a(this.b, paramInt);
  }

  public final void c(int paramInt)
  {
    a.e(this.b, paramInt);
  }

  public final void d(int paramInt)
  {
    a.c(this.b, paramInt);
  }

  public final void e(int paramInt)
  {
    a.d(this.b, paramInt);
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    w localw;
    do
      while (true)
      {
        return true;
        if (paramObject == null)
          return false;
        if (getClass() != paramObject.getClass())
          return false;
        localw = (w)paramObject;
        if (this.b != null)
          break;
        if (localw.b != null)
          return false;
      }
    while (this.b.equals(localw.b));
    return false;
  }

  public final void f(int paramInt)
  {
    a.f(this.b, paramInt);
  }

  public final void g(int paramInt)
  {
    a.g(this.b, paramInt);
  }

  public final int hashCode()
  {
    if (this.b == null)
      return 0;
    return this.b.hashCode();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.a.w
 * JD-Core Version:    0.6.0
 */