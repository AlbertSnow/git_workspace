package android.support.v7.internal.view.menu;

import android.support.v4.view.ak;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

final class r extends f<MenuItem.OnActionExpandListener>
  implements ak
{
  r(o paramo, MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    super(paramOnActionExpandListener);
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    return ((MenuItem.OnActionExpandListener)this.b).onMenuItemActionExpand(this.a.a(paramMenuItem));
  }

  public final boolean b(MenuItem paramMenuItem)
  {
    return ((MenuItem.OnActionExpandListener)this.b).onMenuItemActionCollapse(this.a.a(paramMenuItem));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.r
 * JD-Core Version:    0.6.0
 */