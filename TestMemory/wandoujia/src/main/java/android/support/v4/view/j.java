package android.support.v4.view;

import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class j
{
  private k a;
  private l b;

  public abstract View a();

  public View a(MenuItem paramMenuItem)
  {
    return a();
  }

  public final void a(k paramk)
  {
    this.a = paramk;
  }

  public void a(l paraml)
  {
    if ((this.b != null) && (paraml != null))
      new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ").append(getClass().getSimpleName()).append(" instance while it is still in use somewhere else?");
    this.b = paraml;
  }

  public void a(SubMenu paramSubMenu)
  {
  }

  public final void a(boolean paramBoolean)
  {
    if (this.a != null)
      this.a.a(paramBoolean);
  }

  public boolean b()
  {
    return false;
  }

  public boolean c()
  {
    return true;
  }

  public boolean d()
  {
    return false;
  }

  public boolean e()
  {
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.j
 * JD-Core Version:    0.6.0
 */