package android.support.v4.view;

import android.os.Build.VERSION;
import android.support.v4.b.a.b;
import android.view.MenuItem;
import android.view.View;

public final class af
{
  private static aj a;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 14)
    {
      a = new ai();
      return;
    }
    if (i >= 11)
    {
      a = new ah();
      return;
    }
    a = new ag();
  }

  public static MenuItem a(MenuItem paramMenuItem, j paramj)
  {
    if ((paramMenuItem instanceof b))
      paramMenuItem = ((b)paramMenuItem).a(paramj);
    return paramMenuItem;
  }

  public static MenuItem a(MenuItem paramMenuItem, View paramView)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).setActionView(paramView);
    return a.a(paramMenuItem, paramView);
  }

  public static View a(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).getActionView();
    return a.a(paramMenuItem);
  }

  public static void a(MenuItem paramMenuItem, int paramInt)
  {
    if ((paramMenuItem instanceof b))
    {
      ((b)paramMenuItem).setShowAsAction(paramInt);
      return;
    }
    a.a(paramMenuItem, paramInt);
  }

  public static MenuItem b(MenuItem paramMenuItem, int paramInt)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).setActionView(paramInt);
    return a.b(paramMenuItem, paramInt);
  }

  public static boolean b(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).expandActionView();
    return a.b(paramMenuItem);
  }

  public static boolean c(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).isActionViewExpanded();
    return a.c(paramMenuItem);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.af
 * JD-Core Version:    0.6.0
 */