package android.support.v4.view;

import android.os.Build.VERSION;

public final class m
{
  private static n a;

  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new p();
      return;
    }
    a = new o();
  }

  public static int a(int paramInt1, int paramInt2)
  {
    return a.a(paramInt1, paramInt2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.m
 * JD-Core Version:    0.6.0
 */