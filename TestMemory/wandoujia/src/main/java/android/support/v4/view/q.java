package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;

public final class q
{
  private static t a;

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new s();
      return;
    }
    a = new t();
  }

  public static boolean a(KeyEvent paramKeyEvent)
  {
    return a.b(paramKeyEvent.getMetaState());
  }

  public static boolean b(KeyEvent paramKeyEvent)
  {
    return a.c(paramKeyEvent.getMetaState());
  }

  public static void c(KeyEvent paramKeyEvent)
  {
    a.a(paramKeyEvent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.q
 * JD-Core Version:    0.6.0
 */