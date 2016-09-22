package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.b;
import android.support.v4.view.ak;
import android.support.v4.view.j;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public final class a
  implements b
{
  private CharSequence a;
  private CharSequence b;
  private Intent c;
  private char d;
  private char e;
  private Drawable f;
  private Context g;
  private int h = 16;

  public a(Context paramContext, CharSequence paramCharSequence)
  {
    this.g = paramContext;
    this.a = paramCharSequence;
  }

  public final b a(ak paramak)
  {
    return this;
  }

  public final b a(j paramj)
  {
    throw new UnsupportedOperationException();
  }

  public final j a()
  {
    return null;
  }

  public final boolean collapseActionView()
  {
    return false;
  }

  public final boolean expandActionView()
  {
    return false;
  }

  public final ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException();
  }

  public final View getActionView()
  {
    return null;
  }

  public final char getAlphabeticShortcut()
  {
    return this.e;
  }

  public final int getGroupId()
  {
    return 0;
  }

  public final Drawable getIcon()
  {
    return this.f;
  }

  public final Intent getIntent()
  {
    return this.c;
  }

  public final int getItemId()
  {
    return 16908332;
  }

  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return null;
  }

  public final char getNumericShortcut()
  {
    return this.d;
  }

  public final int getOrder()
  {
    return 0;
  }

  public final SubMenu getSubMenu()
  {
    return null;
  }

  public final CharSequence getTitle()
  {
    return this.a;
  }

  public final CharSequence getTitleCondensed()
  {
    if (this.b != null)
      return this.b;
    return this.a;
  }

  public final boolean hasSubMenu()
  {
    return false;
  }

  public final boolean isActionViewExpanded()
  {
    return false;
  }

  public final boolean isCheckable()
  {
    return (0x1 & this.h) != 0;
  }

  public final boolean isChecked()
  {
    return (0x2 & this.h) != 0;
  }

  public final boolean isEnabled()
  {
    return (0x10 & this.h) != 0;
  }

  public final boolean isVisible()
  {
    return (0x8 & this.h) == 0;
  }

  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException();
  }

  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    this.e = paramChar;
    return this;
  }

  public final MenuItem setCheckable(boolean paramBoolean)
  {
    int i = 0xFFFFFFFE & this.h;
    if (paramBoolean);
    for (int j = 1; ; j = 0)
    {
      this.h = (j | i);
      return this;
    }
  }

  public final MenuItem setChecked(boolean paramBoolean)
  {
    int i = 0xFFFFFFFD & this.h;
    if (paramBoolean);
    for (int j = 2; ; j = 0)
    {
      this.h = (j | i);
      return this;
    }
  }

  public final MenuItem setEnabled(boolean paramBoolean)
  {
    int i = 0xFFFFFFEF & this.h;
    if (paramBoolean);
    for (int j = 16; ; j = 0)
    {
      this.h = (j | i);
      return this;
    }
  }

  public final MenuItem setIcon(int paramInt)
  {
    this.f = android.support.v4.content.a.a(this.g, paramInt);
    return this;
  }

  public final MenuItem setIcon(Drawable paramDrawable)
  {
    this.f = paramDrawable;
    return this;
  }

  public final MenuItem setIntent(Intent paramIntent)
  {
    this.c = paramIntent;
    return this;
  }

  public final MenuItem setNumericShortcut(char paramChar)
  {
    this.d = paramChar;
    return this;
  }

  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    throw new UnsupportedOperationException();
  }

  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    return this;
  }

  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.d = paramChar1;
    this.e = paramChar2;
    return this;
  }

  public final void setShowAsAction(int paramInt)
  {
  }

  public final MenuItem setTitle(int paramInt)
  {
    this.a = this.g.getResources().getString(paramInt);
    return this;
  }

  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.a = paramCharSequence;
    return this;
  }

  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.b = paramCharSequence;
    return this;
  }

  public final MenuItem setVisible(boolean paramBoolean)
  {
    int i = 0x8 & this.h;
    if (paramBoolean);
    for (int j = 0; ; j = 8)
    {
      this.h = (j | i);
      return this;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.a
 * JD-Core Version:    0.6.0
 */