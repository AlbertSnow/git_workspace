package android.support.v4.app;

import android.os.Build.VERSION;

public final class au
{
  private static final ay a;

  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new ba();
      return;
    }
    if (Build.VERSION.SDK_INT >= 20)
    {
      a = new az();
      return;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new bf();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new be();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new bd();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new bc();
      return;
    }
    if (Build.VERSION.SDK_INT >= 9)
    {
      a = new bb();
      return;
    }
    a = new ay();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.au
 * JD-Core Version:    0.6.0
 */