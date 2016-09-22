package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class bs
{
  private static bw a;

  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new bv();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new bu();
      return;
    }
    if (Build.VERSION.SDK_INT >= 8)
    {
      a = new bt();
      return;
    }
    a = new bw();
  }

  public static int a(ViewConfiguration paramViewConfiguration)
  {
    return a.a(paramViewConfiguration);
  }

  public static boolean b(ViewConfiguration paramViewConfiguration)
  {
    return a.b(paramViewConfiguration);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.bs
 * JD-Core Version:    0.6.0
 */