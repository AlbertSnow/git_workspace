package com.nispok.snackbar;

import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.Display;

final class a
{
  private static final b a;

  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new d();
      return;
    }
    if (Build.VERSION.SDK_INT >= 13)
    {
      a = new c();
      return;
    }
    a = new e();
  }

  public static void a(Display paramDisplay, Point paramPoint)
  {
    a.a(paramDisplay, paramPoint);
  }

  public static void b(Display paramDisplay, Point paramPoint)
  {
    a.b(paramDisplay, paramPoint);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nispok.snackbar.a
 * JD-Core Version:    0.6.0
 */