package android.support.v7.app;

import android.support.v4.view.bg;
import android.support.v7.b.a;
import android.support.v7.b.b;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;

final class w
  implements b
{
  private b a;

  public w(AppCompatDelegateImplV7 paramAppCompatDelegateImplV7, b paramb)
  {
    this.a = paramb;
  }

  public final void a(a parama)
  {
    this.a.a(parama);
    if (this.b.k != null)
    {
      this.b.b.getDecorView().removeCallbacks(this.b.l);
      this.b.k.dismiss();
    }
    while (true)
    {
      if (this.b.j != null)
        this.b.j.removeAllViews();
      this.b.i = null;
      return;
      if (this.b.j == null)
        continue;
      this.b.j.setVisibility(8);
      if (this.b.j.getParent() == null)
        continue;
      bg.w((View)this.b.j.getParent());
    }
  }

  public final boolean a(a parama, Menu paramMenu)
  {
    return this.a.a(parama, paramMenu);
  }

  public final boolean a(a parama, MenuItem paramMenuItem)
  {
    return this.a.a(parama, paramMenuItem);
  }

  public final boolean b(a parama, Menu paramMenu)
  {
    return this.a.b(parama, paramMenu);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.w
 * JD-Core Version:    0.6.0
 */