package android.support.v7.internal.view;

import android.content.Context;
import android.support.v4.e.l;
import android.support.v7.internal.view.menu.f;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public final class d
  implements android.support.v7.b.b
{
  private ActionMode.Callback a;
  private Context b;
  private ArrayList<c> c;
  private l<Menu, Menu> d;

  public d(Context paramContext, ActionMode.Callback paramCallback)
  {
    this.b = paramContext;
    this.a = paramCallback;
    this.c = new ArrayList();
    this.d = new l();
  }

  private Menu a(Menu paramMenu)
  {
    Menu localMenu = (Menu)this.d.get(paramMenu);
    if (localMenu == null)
    {
      localMenu = f.a(this.b, (android.support.v4.b.a.a)paramMenu);
      this.d.put(paramMenu, localMenu);
    }
    return localMenu;
  }

  private ActionMode b(android.support.v7.b.a parama)
  {
    int i = this.c.size();
    for (int j = 0; j < i; j++)
    {
      c localc2 = (c)this.c.get(j);
      if ((localc2 != null) && (localc2.a == parama))
        return localc2;
    }
    c localc1 = new c(this.b, parama);
    this.c.add(localc1);
    return localc1;
  }

  public final void a(android.support.v7.b.a parama)
  {
    this.a.onDestroyActionMode(b(parama));
  }

  public final void a(c paramc)
  {
    this.c.add(paramc);
  }

  public final boolean a(android.support.v7.b.a parama, Menu paramMenu)
  {
    return this.a.onCreateActionMode(b(parama), a(paramMenu));
  }

  public final boolean a(android.support.v7.b.a parama, MenuItem paramMenuItem)
  {
    return this.a.onActionItemClicked(b(parama), f.a(this.b, (android.support.v4.b.a.b)paramMenuItem));
  }

  public final boolean b(android.support.v7.b.a parama, Menu paramMenu)
  {
    return this.a.onPrepareActionMode(b(parama), a(paramMenu));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.d
 * JD-Core Version:    0.6.0
 */