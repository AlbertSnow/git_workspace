package android.support.v7.internal.view.menu;

import android.support.v4.view.l;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

final class u extends p
  implements ActionProvider.VisibilityListener
{
  private l b;

  public u(t paramt, ActionProvider paramActionProvider)
  {
    super(paramt, paramActionProvider);
  }

  public final View a(MenuItem paramMenuItem)
  {
    return this.a.onCreateActionView(paramMenuItem);
  }

  public final void a(l paraml)
  {
    this.b = paraml;
    ActionProvider localActionProvider = this.a;
    if (paraml != null);
    while (true)
    {
      localActionProvider.setVisibilityListener(this);
      return;
      this = null;
    }
  }

  public final boolean b()
  {
    return this.a.overridesItemVisibility();
  }

  public final boolean c()
  {
    return this.a.isVisible();
  }

  public final void onActionProviderVisibilityChanged(boolean paramBoolean)
  {
    if (this.b != null)
      this.b.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.u
 * JD-Core Version:    0.6.0
 */