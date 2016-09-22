package android.support.v7.internal.view.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class s extends f<MenuItem.OnMenuItemClickListener>
  implements MenuItem.OnMenuItemClickListener
{
  s(o paramo, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    super(paramOnMenuItemClickListener);
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    return ((MenuItem.OnMenuItemClickListener)this.b).onMenuItemClick(this.a.a(paramMenuItem));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.s
 * JD-Core Version:    0.6.0
 */