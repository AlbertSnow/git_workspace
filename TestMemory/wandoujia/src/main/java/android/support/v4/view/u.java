package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.LayoutInflater;

public final class u
{
  private static v a;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new x();
      return;
    }
    if (i >= 11)
    {
      a = new w();
      return;
    }
    a = new v();
  }

  public static void a(LayoutInflater paramLayoutInflater, aa paramaa)
  {
    a.a(paramLayoutInflater, paramaa);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.u
 * JD-Core Version:    0.6.0
 */