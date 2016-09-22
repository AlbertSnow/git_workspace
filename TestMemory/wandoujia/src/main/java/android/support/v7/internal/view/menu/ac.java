package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class ac extends i
  implements SubMenu
{
  private i d;
  private m e;

  public ac(Context paramContext, i parami, m paramm)
  {
    super(paramContext);
    this.d = parami;
    this.e = paramm;
  }

  public final void a(j paramj)
  {
    this.d.a(paramj);
  }

  final boolean a(i parami, MenuItem paramMenuItem)
  {
    return (super.a(parami, paramMenuItem)) || (this.d.a(parami, paramMenuItem));
  }

  public final boolean a(m paramm)
  {
    return this.d.a(paramm);
  }

  public final String b()
  {
    if (this.e != null);
    for (int i = this.e.getItemId(); i == 0; i = 0)
      return null;
    return super.b() + ":" + i;
  }

  public final boolean b(m paramm)
  {
    return this.d.b(paramm);
  }

  public final boolean c()
  {
    return this.d.c();
  }

  public final boolean d()
  {
    return this.d.d();
  }

  public final MenuItem getItem()
  {
    return this.e;
  }

  public final i o()
  {
    return this.d;
  }

  public final Menu q()
  {
    return this.d;
  }

  public final SubMenu setHeaderIcon(int paramInt)
  {
    super.a(a.a(e(), paramInt));
    return this;
  }

  public final SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    super.a(paramDrawable);
    return this;
  }

  public final SubMenu setHeaderTitle(int paramInt)
  {
    super.a(e().getResources().getString(paramInt));
    return this;
  }

  public final SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    super.a(paramCharSequence);
    return this;
  }

  public final SubMenu setHeaderView(View paramView)
  {
    super.a(paramView);
    return this;
  }

  public final SubMenu setIcon(int paramInt)
  {
    this.e.setIcon(paramInt);
    return this;
  }

  public final SubMenu setIcon(Drawable paramDrawable)
  {
    this.e.setIcon(paramDrawable);
    return this;
  }

  public final void setQwertyMode(boolean paramBoolean)
  {
    this.d.setQwertyMode(paramBoolean);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ac
 * JD-Core Version:    0.6.0
 */