package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

public final class ab
{
  private static ac a;

  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new ae();
      return;
    }
    a = new ad();
  }

  public static int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return a.a(paramMarginLayoutParams);
  }

  public static int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return a.b(paramMarginLayoutParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.ab
 * JD-Core Version:    0.6.0
 */