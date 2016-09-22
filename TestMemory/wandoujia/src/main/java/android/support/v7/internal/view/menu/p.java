package android.support.v7.internal.view.menu;

import android.support.v4.view.j;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

class p extends j
{
  final ActionProvider a;

  public p(o paramo, ActionProvider paramActionProvider)
  {
    this.a = paramActionProvider;
  }

  public final View a()
  {
    return this.a.onCreateActionView();
  }

  public final void a(SubMenu paramSubMenu)
  {
    this.a.onPrepareSubMenu(this.b.a(paramSubMenu));
  }

  public final boolean d()
  {
    return this.a.onPerformDefaultAction();
  }

  public final boolean e()
  {
    return this.a.hasSubMenu();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.p
 * JD-Core Version:    0.6.0
 */