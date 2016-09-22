package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class bx
{
  private static ca a;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new cc();
      return;
    }
    if (i >= 18)
    {
      a = new cb();
      return;
    }
    if (i >= 14)
    {
      a = new bz();
      return;
    }
    if (i >= 11)
    {
      a = new by();
      return;
    }
    a = new ca();
  }

  public static void a(ViewGroup paramViewGroup)
  {
    a.a(paramViewGroup);
  }

  public static int b(ViewGroup paramViewGroup)
  {
    return a.b(paramViewGroup);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.bx
 * JD-Core Version:    0.6.0
 */