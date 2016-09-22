package android.support.v7.internal.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.b;
import android.support.v4.view.j;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

@TargetApi(14)
public class o extends e<b>
  implements MenuItem
{
  private Method c;

  o(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }

  p a(ActionProvider paramActionProvider)
  {
    return new p(this, paramActionProvider);
  }

  public final void b()
  {
    try
    {
      if (this.c == null)
      {
        Class localClass = ((b)this.b).getClass();
        Class[] arrayOfClass = new Class[1];
        arrayOfClass[0] = Boolean.TYPE;
        this.c = localClass.getDeclaredMethod("setExclusiveCheckable", arrayOfClass);
      }
      Method localMethod = this.c;
      Object localObject = this.b;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(true);
      localMethod.invoke(localObject, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public boolean collapseActionView()
  {
    return ((b)this.b).collapseActionView();
  }

  public boolean expandActionView()
  {
    return ((b)this.b).expandActionView();
  }

  public ActionProvider getActionProvider()
  {
    j localj = ((b)this.b).a();
    if ((localj instanceof p))
      return ((p)localj).a;
    return null;
  }

  public View getActionView()
  {
    View localView = ((b)this.b).getActionView();
    if ((localView instanceof q))
      localView = (View)((q)localView).a;
    return localView;
  }

  public char getAlphabeticShortcut()
  {
    return ((b)this.b).getAlphabeticShortcut();
  }

  public int getGroupId()
  {
    return ((b)this.b).getGroupId();
  }

  public Drawable getIcon()
  {
    return ((b)this.b).getIcon();
  }

  public Intent getIntent()
  {
    return ((b)this.b).getIntent();
  }

  public int getItemId()
  {
    return ((b)this.b).getItemId();
  }

  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return ((b)this.b).getMenuInfo();
  }

  public char getNumericShortcut()
  {
    return ((b)this.b).getNumericShortcut();
  }

  public int getOrder()
  {
    return ((b)this.b).getOrder();
  }

  public SubMenu getSubMenu()
  {
    return a(((b)this.b).getSubMenu());
  }

  public CharSequence getTitle()
  {
    return ((b)this.b).getTitle();
  }

  public CharSequence getTitleCondensed()
  {
    return ((b)this.b).getTitleCondensed();
  }

  public boolean hasSubMenu()
  {
    return ((b)this.b).hasSubMenu();
  }

  public boolean isActionViewExpanded()
  {
    return ((b)this.b).isActionViewExpanded();
  }

  public boolean isCheckable()
  {
    return ((b)this.b).isCheckable();
  }

  public boolean isChecked()
  {
    return ((b)this.b).isChecked();
  }

  public boolean isEnabled()
  {
    return ((b)this.b).isEnabled();
  }

  public boolean isVisible()
  {
    return ((b)this.b).isVisible();
  }

  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    b localb = (b)this.b;
    if (paramActionProvider != null);
    for (p localp = a(paramActionProvider); ; localp = null)
    {
      localb.a(localp);
      return this;
    }
  }

  public MenuItem setActionView(int paramInt)
  {
    ((b)this.b).setActionView(paramInt);
    View localView = ((b)this.b).getActionView();
    if ((localView instanceof CollapsibleActionView))
      ((b)this.b).setActionView(new q(localView));
    return this;
  }

  public MenuItem setActionView(View paramView)
  {
    if ((paramView instanceof CollapsibleActionView))
      paramView = new q(paramView);
    ((b)this.b).setActionView(paramView);
    return this;
  }

  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    ((b)this.b).setAlphabeticShortcut(paramChar);
    return this;
  }

  public MenuItem setCheckable(boolean paramBoolean)
  {
    ((b)this.b).setCheckable(paramBoolean);
    return this;
  }

  public MenuItem setChecked(boolean paramBoolean)
  {
    ((b)this.b).setChecked(paramBoolean);
    return this;
  }

  public MenuItem setEnabled(boolean paramBoolean)
  {
    ((b)this.b).setEnabled(paramBoolean);
    return this;
  }

  public MenuItem setIcon(int paramInt)
  {
    ((b)this.b).setIcon(paramInt);
    return this;
  }

  public MenuItem setIcon(Drawable paramDrawable)
  {
    ((b)this.b).setIcon(paramDrawable);
    return this;
  }

  public MenuItem setIntent(Intent paramIntent)
  {
    ((b)this.b).setIntent(paramIntent);
    return this;
  }

  public MenuItem setNumericShortcut(char paramChar)
  {
    ((b)this.b).setNumericShortcut(paramChar);
    return this;
  }

  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    b localb = (b)this.b;
    if (paramOnActionExpandListener != null);
    for (r localr = new r(this, paramOnActionExpandListener); ; localr = null)
    {
      localb.a(localr);
      return this;
    }
  }

  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    b localb = (b)this.b;
    if (paramOnMenuItemClickListener != null);
    for (s locals = new s(this, paramOnMenuItemClickListener); ; locals = null)
    {
      localb.setOnMenuItemClickListener(locals);
      return this;
    }
  }

  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    ((b)this.b).setShortcut(paramChar1, paramChar2);
    return this;
  }

  public void setShowAsAction(int paramInt)
  {
    ((b)this.b).setShowAsAction(paramInt);
  }

  public MenuItem setShowAsActionFlags(int paramInt)
  {
    ((b)this.b).setShowAsActionFlags(paramInt);
    return this;
  }

  public MenuItem setTitle(int paramInt)
  {
    ((b)this.b).setTitle(paramInt);
    return this;
  }

  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    ((b)this.b).setTitle(paramCharSequence);
    return this;
  }

  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    ((b)this.b).setTitleCondensed(paramCharSequence);
    return this;
  }

  public MenuItem setVisible(boolean paramBoolean)
  {
    return ((b)this.b).setVisible(paramBoolean);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.o
 * JD-Core Version:    0.6.0
 */