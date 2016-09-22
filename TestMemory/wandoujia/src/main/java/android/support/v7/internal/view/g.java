package android.support.v7.internal.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.af;
import android.support.v4.view.j;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.o;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

final class g
{
  private Menu a;
  private int b;
  private int c;
  private int d;
  private int e;
  private boolean f;
  private boolean g;
  private boolean h;
  private int i;
  private int j;
  private CharSequence k;
  private CharSequence l;
  private int m;
  private char n;
  private char o;
  private int p;
  private boolean q;
  private boolean r;
  private boolean s;
  private int t;
  private int u;
  private String v;
  private String w;
  private String x;
  private j y;

  public g(e parame, Menu paramMenu)
  {
    this.a = paramMenu;
    a();
  }

  private static char a(String paramString)
  {
    if (paramString == null)
      return '\000';
    return paramString.charAt(0);
  }

  private <T> T a(String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      Object localObject = e.a(this.z).getClassLoader().loadClass(paramString).getConstructor(paramArrayOfClass).newInstance(paramArrayOfObject);
      return localObject;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  private void a(MenuItem paramMenuItem)
  {
    boolean bool1 = true;
    MenuItem localMenuItem = paramMenuItem.setChecked(this.q).setVisible(this.r).setEnabled(this.s);
    boolean bool2;
    if (this.p > 0)
      bool2 = bool1;
    while (true)
    {
      localMenuItem.setCheckable(bool2).setTitleCondensed(this.l).setIcon(this.m).setAlphabeticShortcut(this.n).setNumericShortcut(this.o);
      if (this.t >= 0)
        af.a(paramMenuItem, this.t);
      if (this.x == null)
        break;
      if (e.a(this.z).isRestricted())
      {
        throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
        bool2 = false;
        continue;
      }
      paramMenuItem.setOnMenuItemClickListener(new f(e.c(this.z), this.x));
    }
    if (this.p >= 2)
    {
      if ((paramMenuItem instanceof m))
        ((m)paramMenuItem).a(bool1);
    }
    else
    {
      if (this.v == null)
        break label272;
      af.a(paramMenuItem, (View)a(this.v, e.b(), e.d(this.z)));
    }
    while (true)
    {
      if ((this.u > 0) && (!bool1))
        af.b(paramMenuItem, this.u);
      if (this.y != null)
        af.a(paramMenuItem, this.y);
      return;
      if (!(paramMenuItem instanceof o))
        break;
      ((o)paramMenuItem).b();
      break;
      label272: bool1 = false;
    }
  }

  public final void a()
  {
    this.b = 0;
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.f = true;
    this.g = true;
  }

  public final void a(AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = e.a(this.z).obtainStyledAttributes(paramAttributeSet, R.styleable.MenuGroup);
    this.b = localTypedArray.getResourceId(R.styleable.MenuGroup_android_id, 0);
    this.c = localTypedArray.getInt(R.styleable.MenuGroup_android_menuCategory, 0);
    this.d = localTypedArray.getInt(R.styleable.MenuGroup_android_orderInCategory, 0);
    this.e = localTypedArray.getInt(R.styleable.MenuGroup_android_checkableBehavior, 0);
    this.f = localTypedArray.getBoolean(R.styleable.MenuGroup_android_visible, true);
    this.g = localTypedArray.getBoolean(R.styleable.MenuGroup_android_enabled, true);
    localTypedArray.recycle();
  }

  public final void b()
  {
    this.h = true;
    a(this.a.add(this.b, this.i, this.j, this.k));
  }

  public final void b(AttributeSet paramAttributeSet)
  {
    int i1 = 1;
    TypedArray localTypedArray = e.a(this.z).obtainStyledAttributes(paramAttributeSet, R.styleable.MenuItem);
    this.i = localTypedArray.getResourceId(R.styleable.MenuItem_android_id, 0);
    int i2 = localTypedArray.getInt(R.styleable.MenuItem_android_menuCategory, this.c);
    int i3 = localTypedArray.getInt(R.styleable.MenuItem_android_orderInCategory, this.d);
    this.j = (i2 & 0xFFFF0000 | i3 & 0xFFFF);
    this.k = localTypedArray.getText(R.styleable.MenuItem_android_title);
    this.l = localTypedArray.getText(R.styleable.MenuItem_android_titleCondensed);
    this.m = localTypedArray.getResourceId(R.styleable.MenuItem_android_icon, 0);
    this.n = a(localTypedArray.getString(R.styleable.MenuItem_android_alphabeticShortcut));
    this.o = a(localTypedArray.getString(R.styleable.MenuItem_android_numericShortcut));
    int i4;
    if (localTypedArray.hasValue(R.styleable.MenuItem_android_checkable))
      if (localTypedArray.getBoolean(R.styleable.MenuItem_android_checkable, false))
      {
        i4 = i1;
        this.p = i4;
        label164: this.q = localTypedArray.getBoolean(R.styleable.MenuItem_android_checked, false);
        this.r = localTypedArray.getBoolean(R.styleable.MenuItem_android_visible, this.f);
        this.s = localTypedArray.getBoolean(R.styleable.MenuItem_android_enabled, this.g);
        this.t = localTypedArray.getInt(R.styleable.MenuItem_showAsAction, -1);
        this.x = localTypedArray.getString(R.styleable.MenuItem_android_onClick);
        this.u = localTypedArray.getResourceId(R.styleable.MenuItem_actionLayout, 0);
        this.v = localTypedArray.getString(R.styleable.MenuItem_actionViewClass);
        this.w = localTypedArray.getString(R.styleable.MenuItem_actionProviderClass);
        if (this.w == null)
          break label340;
        label270: if ((i1 == 0) || (this.u != 0) || (this.v != null))
          break label345;
      }
    label340: label345: for (this.y = ((j)a(this.w, e.a(), e.b(this.z))); ; this.y = null)
    {
      localTypedArray.recycle();
      this.h = false;
      return;
      i4 = 0;
      break;
      this.p = this.e;
      break label164;
      i1 = 0;
      break label270;
    }
  }

  public final SubMenu c()
  {
    this.h = true;
    SubMenu localSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
    a(localSubMenu.getItem());
    return localSubMenu;
  }

  public final boolean d()
  {
    return this.h;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.g
 * JD-Core Version:    0.6.0
 */