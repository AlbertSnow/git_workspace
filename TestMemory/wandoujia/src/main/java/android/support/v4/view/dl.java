package android.support.v4.view;

import android.view.WindowInsets;

final class dl extends dk
{
  private final WindowInsets a;

  dl(WindowInsets paramWindowInsets)
  {
    this.a = paramWindowInsets;
  }

  public final int a()
  {
    return this.a.getSystemWindowInsetLeft();
  }

  public final dk a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return new dl(this.a.replaceSystemWindowInsets(paramInt1, paramInt2, paramInt3, paramInt4));
  }

  public final int b()
  {
    return this.a.getSystemWindowInsetTop();
  }

  public final int c()
  {
    return this.a.getSystemWindowInsetRight();
  }

  public final int d()
  {
    return this.a.getSystemWindowInsetBottom();
  }

  final WindowInsets e()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.dl
 * JD-Core Version:    0.6.0
 */