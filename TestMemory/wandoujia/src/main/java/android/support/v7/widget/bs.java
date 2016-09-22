package android.support.v7.widget;

import android.view.View;

public abstract class bs
{
  protected final ce a;
  private int b = -2147483648;

  private bs(ce paramce)
  {
    this.a = paramce;
  }

  public static bs a(ce paramce, int paramInt)
  {
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("invalid orientation");
    case 0:
      return new bt(paramce);
    case 1:
    }
    return new bu(paramce);
  }

  public abstract int a(View paramView);

  public final void a()
  {
    this.b = f();
  }

  public abstract void a(int paramInt);

  public final int b()
  {
    if (-2147483648 == this.b)
      return 0;
    return f() - this.b;
  }

  public abstract int b(View paramView);

  public abstract int c();

  public abstract int c(View paramView);

  public abstract int d();

  public abstract int d(View paramView);

  public abstract int e();

  public abstract int f();

  public abstract int g();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.bs
 * JD-Core Version:    0.6.0
 */