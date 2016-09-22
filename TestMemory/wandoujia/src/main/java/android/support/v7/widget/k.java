package android.support.v7.widget;

import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.view.MenuItem;

final class k
  implements j
{
  private k(ActionMenuView paramActionMenuView)
  {
  }

  public final void a(i parami)
  {
    if (ActionMenuView.b(this.a) != null)
      ActionMenuView.b(this.a).a(parami);
  }

  public final boolean a(i parami, MenuItem paramMenuItem)
  {
    return (ActionMenuView.a(this.a) != null) && (ActionMenuView.a(this.a).a(paramMenuItem));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.k
 * JD-Core Version:    0.6.0
 */