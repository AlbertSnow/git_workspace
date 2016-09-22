package android.support.v7.internal.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.b.a.a;
import android.support.v4.b.a.b;
import android.view.Menu;
import android.view.MenuItem;

public class f<T>
{
  final T b;

  f(T paramT)
  {
    if (paramT == null)
      throw new IllegalArgumentException("Wrapped Object can not be null.");
    this.b = paramT;
  }

  public static Menu a(Context paramContext, a parama)
  {
    if (Build.VERSION.SDK_INT >= 14)
      return new ab(paramContext, parama);
    throw new UnsupportedOperationException();
  }

  public static MenuItem a(Context paramContext, b paramb)
  {
    if (Build.VERSION.SDK_INT >= 16)
      return new t(paramContext, paramb);
    if (Build.VERSION.SDK_INT >= 14)
      return new o(paramContext, paramb);
    throw new UnsupportedOperationException();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.f
 * JD-Core Version:    0.6.0
 */