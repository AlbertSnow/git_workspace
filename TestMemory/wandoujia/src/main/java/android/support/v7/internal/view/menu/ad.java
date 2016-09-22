package android.support.v7.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

final class ad extends ab
  implements SubMenu
{
  ad(Context paramContext, c paramc)
  {
    super(paramContext, paramc);
  }

  public final void clearHeader()
  {
    ((c)this.b).clearHeader();
  }

  public final MenuItem getItem()
  {
    return a(((c)this.b).getItem());
  }

  public final SubMenu setHeaderIcon(int paramInt)
  {
    ((c)this.b).setHeaderIcon(paramInt);
    return this;
  }

  public final SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    ((c)this.b).setHeaderIcon(paramDrawable);
    return this;
  }

  public final SubMenu setHeaderTitle(int paramInt)
  {
    ((c)this.b).setHeaderTitle(paramInt);
    return this;
  }

  public final SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    ((c)this.b).setHeaderTitle(paramCharSequence);
    return this;
  }

  public final SubMenu setHeaderView(View paramView)
  {
    ((c)this.b).setHeaderView(paramView);
    return this;
  }

  public final SubMenu setIcon(int paramInt)
  {
    ((c)this.b).setIcon(paramInt);
    return this;
  }

  public final SubMenu setIcon(Drawable paramDrawable)
  {
    ((c)this.b).setIcon(paramDrawable);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ad
 * JD-Core Version:    0.6.0
 */