package android.support.v7.internal.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.b.a.a;
import android.support.v4.view.af;
import android.support.v7.appcompat.R.bool;
import android.util.SparseArray;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class i
  implements a
{
  private static final int[] d = { 1, 4, 5, 3, 2, 0 };
  CharSequence a;
  Drawable b;
  View c;
  private final Context e;
  private final Resources f;
  private boolean g;
  private boolean h;
  private j i;
  private ArrayList<m> j;
  private ArrayList<m> k;
  private boolean l;
  private ArrayList<m> m;
  private ArrayList<m> n;
  private boolean o;
  private int p = 0;
  private boolean q = false;
  private boolean r = false;
  private boolean s = false;
  private ArrayList<m> t = new ArrayList();
  private CopyOnWriteArrayList<WeakReference<x>> u = new CopyOnWriteArrayList();
  private m v;
  private boolean w;

  public i(Context paramContext)
  {
    this.e = paramContext;
    this.f = paramContext.getResources();
    this.j = new ArrayList();
    this.k = new ArrayList();
    this.l = i1;
    this.m = new ArrayList();
    this.n = new ArrayList();
    this.o = i1;
    if ((this.f.getConfiguration().keyboard != i1) && (this.f.getBoolean(R.bool.abc_config_showMenuShortcutsWhenKeyboardPresent)));
    while (true)
    {
      this.h = i1;
      return;
      i1 = 0;
    }
  }

  private static int a(ArrayList<m> paramArrayList, int paramInt)
  {
    for (int i1 = -1 + paramArrayList.size(); i1 >= 0; i1--)
      if (((m)paramArrayList.get(i1)).c() <= paramInt)
        return i1 + 1;
    return 0;
  }

  private m a(int paramInt, KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = this.t;
    localArrayList.clear();
    a(localArrayList, paramInt, paramKeyEvent);
    m localm;
    if (localArrayList.isEmpty())
      localm = null;
    label181: 
    while (true)
    {
      return localm;
      int i1 = paramKeyEvent.getMetaState();
      KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
      paramKeyEvent.getKeyData(localKeyData);
      int i2 = localArrayList.size();
      if (i2 == 1)
        return (m)localArrayList.get(0);
      boolean bool = c();
      int i3 = 0;
      if (i3 >= i2)
        break;
      localm = (m)localArrayList.get(i3);
      if (bool);
      for (int i4 = localm.getAlphabeticShortcut(); ; i4 = localm.getNumericShortcut())
      {
        if (((i4 == localKeyData.meta[0]) && ((i1 & 0x2) == 0)) || ((i4 == localKeyData.meta[2]) && ((i1 & 0x2) != 0)) || ((bool) && (i4 == 8) && (paramInt == 67)))
          break label181;
        i3++;
        break;
      }
    }
    return null;
  }

  private MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int i1 = (0xFFFF0000 & paramInt3) >> 16;
    if ((i1 < 0) || (i1 >= 6))
      throw new IllegalArgumentException("order does not contain a valid category.");
    int i2 = d[i1] << 16 | 0xFFFF & paramInt3;
    m localm = new m(this, paramInt1, paramInt2, paramInt3, i2, paramCharSequence, this.p);
    this.j.add(a(this.j, i2), localm);
    b(true);
    return localm;
  }

  private void a(int paramInt, boolean paramBoolean)
  {
    if ((paramInt < 0) || (paramInt >= this.j.size()));
    do
    {
      return;
      this.j.remove(paramInt);
    }
    while (!paramBoolean);
    b(true);
  }

  private void a(CharSequence paramCharSequence, Drawable paramDrawable, View paramView)
  {
    if (paramView != null)
    {
      this.c = paramView;
      this.a = null;
      this.b = null;
    }
    while (true)
    {
      b(false);
      return;
      if (paramCharSequence != null)
        this.a = paramCharSequence;
      if (paramDrawable != null)
        this.b = paramDrawable;
      this.c = null;
    }
  }

  private void a(List<m> paramList, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = c();
    int i1 = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    if ((!paramKeyEvent.getKeyData(localKeyData)) && (paramInt != 67))
      return;
    int i2 = this.j.size();
    int i3 = 0;
    label49: m localm;
    if (i3 < i2)
    {
      localm = (m)this.j.get(i3);
      if (localm.hasSubMenu())
        ((i)localm.getSubMenu()).a(paramList, paramInt, paramKeyEvent);
      if (!bool)
        break label181;
    }
    label181: for (int i4 = localm.getAlphabeticShortcut(); ; i4 = localm.getNumericShortcut())
    {
      if (((i1 & 0x5) == 0) && (i4 != 0) && ((i4 == localKeyData.meta[0]) || (i4 == localKeyData.meta[2]) || ((bool) && (i4 == 8) && (paramInt == 67))) && (localm.isEnabled()))
        paramList.add(localm);
      i3++;
      break label49;
      break;
    }
  }

  public final i a()
  {
    this.p = 1;
    return this;
  }

  protected final i a(Drawable paramDrawable)
  {
    a(null, paramDrawable, null);
    return this;
  }

  protected final i a(View paramView)
  {
    a(null, null, paramView);
    return this;
  }

  protected final i a(CharSequence paramCharSequence)
  {
    a(paramCharSequence, null, null);
    return this;
  }

  public final void a(Bundle paramBundle)
  {
    int i1 = size();
    int i2 = 0;
    Object localObject2;
    for (Object localObject1 = null; i2 < i1; localObject1 = localObject2)
    {
      MenuItem localMenuItem = getItem(i2);
      View localView = af.a(localMenuItem);
      if ((localView != null) && (localView.getId() != -1))
      {
        if (localObject1 == null)
          localObject1 = new SparseArray();
        localView.saveHierarchyState((SparseArray)localObject1);
        if (af.c(localMenuItem))
          paramBundle.putInt("android:menu:expandedactionview", localMenuItem.getItemId());
      }
      localObject2 = localObject1;
      if (localMenuItem.hasSubMenu())
        ((ac)localMenuItem.getSubMenu()).a(paramBundle);
      i2++;
    }
    if (localObject1 != null)
      paramBundle.putSparseParcelableArray(b(), (SparseArray)localObject1);
  }

  public void a(j paramj)
  {
    this.i = paramj;
  }

  public final void a(x paramx)
  {
    a(paramx, this.e);
  }

  public final void a(x paramx, Context paramContext)
  {
    this.u.add(new WeakReference(paramx));
    paramx.a(paramContext, this);
    this.o = true;
  }

  final void a(MenuItem paramMenuItem)
  {
    int i1 = paramMenuItem.getGroupId();
    int i2 = this.j.size();
    int i3 = 0;
    if (i3 < i2)
    {
      m localm = (m)this.j.get(i3);
      if ((localm.getGroupId() == i1) && (localm.f()) && (localm.isCheckable()))
        if (localm != paramMenuItem)
          break label85;
      label85: for (boolean bool = true; ; bool = false)
      {
        localm.b(bool);
        i3++;
        break;
      }
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (this.s)
      return;
    this.s = true;
    Iterator localIterator = this.u.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      x localx = (x)localWeakReference.get();
      if (localx == null)
      {
        this.u.remove(localWeakReference);
        continue;
      }
      localx.a(this, paramBoolean);
    }
    this.s = false;
  }

  boolean a(i parami, MenuItem paramMenuItem)
  {
    return (this.i != null) && (this.i.a(parami, paramMenuItem));
  }

  public boolean a(m paramm)
  {
    boolean bool1 = this.u.isEmpty();
    boolean bool2 = false;
    if (bool1)
      return bool2;
    g();
    Iterator localIterator = this.u.iterator();
    boolean bool3 = false;
    while (true)
      label32: if (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        x localx = (x)localWeakReference.get();
        if (localx == null)
        {
          this.u.remove(localWeakReference);
          continue;
        }
        bool2 = localx.b(paramm);
        if (!bool2)
          break;
      }
    while (true)
    {
      h();
      if (!bool2)
        break;
      this.v = paramm;
      return bool2;
      bool3 = bool2;
      break label32;
      bool2 = bool3;
    }
  }

  public final boolean a(MenuItem paramMenuItem, x paramx, int paramInt)
  {
    m localm = (m)paramMenuItem;
    boolean bool1;
    if ((localm == null) || (!localm.isEnabled()))
      bool1 = false;
    boolean bool2;
    label92: ac localac;
    boolean bool4;
    while (true)
    {
      return bool1;
      bool2 = localm.b();
      android.support.v4.view.j localj = localm.a();
      if ((localj != null) && (localj.e()));
      for (int i1 = 1; ; i1 = 0)
      {
        if (!localm.l())
          break label92;
        bool1 = bool2 | localm.expandActionView();
        if (!bool1)
          break;
        a(true);
        return bool1;
      }
      if ((!localm.hasSubMenu()) && (i1 == 0))
        break label306;
      a(false);
      if (!localm.hasSubMenu())
        localm.a(new ac(this.e, this, localm));
      localac = (ac)localm.getSubMenu();
      if (i1 != 0)
        localj.a(localac);
      boolean bool3 = this.u.isEmpty();
      bool4 = false;
      if (!bool3)
        break;
      bool1 = bool2 | bool4;
      if (bool1)
        continue;
      a(true);
      return bool1;
    }
    boolean bool5 = false;
    if (paramx != null)
      bool5 = paramx.a(localac);
    Iterator localIterator = this.u.iterator();
    boolean bool6 = bool5;
    label226: x localx;
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      localx = (x)localWeakReference.get();
      if (localx == null)
      {
        this.u.remove(localWeakReference);
        continue;
      }
      if (bool6)
        break label320;
    }
    label306: label320: for (boolean bool7 = localx.a(localac); ; bool7 = bool6)
    {
      bool6 = bool7;
      break label226;
      bool4 = bool6;
      break;
      if ((paramInt & 0x1) == 0)
        a(true);
      return bool2;
    }
  }

  public MenuItem add(int paramInt)
  {
    return a(0, 0, 0, this.f.getString(paramInt));
  }

  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(paramInt1, paramInt2, paramInt3, this.f.getString(paramInt4));
  }

  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }

  public MenuItem add(CharSequence paramCharSequence)
  {
    return a(0, 0, 0, paramCharSequence);
  }

  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    PackageManager localPackageManager = this.e.getPackageManager();
    List localList = localPackageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    int i1;
    int i2;
    label52: ResolveInfo localResolveInfo;
    if (localList != null)
    {
      i1 = localList.size();
      if ((paramInt4 & 0x1) == 0)
        removeGroup(paramInt1);
      i2 = 0;
      if (i2 >= i1)
        break label211;
      localResolveInfo = (ResolveInfo)localList.get(i2);
      if (localResolveInfo.specificIndex >= 0)
        break label198;
    }
    label198: for (Intent localIntent1 = paramIntent; ; localIntent1 = paramArrayOfIntent[localResolveInfo.specificIndex])
    {
      Intent localIntent2 = new Intent(localIntent1);
      localIntent2.setComponent(new ComponentName(localResolveInfo.activityInfo.applicationInfo.packageName, localResolveInfo.activityInfo.name));
      MenuItem localMenuItem = add(paramInt1, paramInt2, paramInt3, localResolveInfo.loadLabel(localPackageManager)).setIcon(localResolveInfo.loadIcon(localPackageManager)).setIntent(localIntent2);
      if ((paramArrayOfMenuItem != null) && (localResolveInfo.specificIndex >= 0))
        paramArrayOfMenuItem[localResolveInfo.specificIndex] = localMenuItem;
      i2++;
      break label52;
      i1 = 0;
      break;
    }
    label211: return i1;
  }

  public SubMenu addSubMenu(int paramInt)
  {
    return addSubMenu(0, 0, 0, this.f.getString(paramInt));
  }

  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return addSubMenu(paramInt1, paramInt2, paramInt3, this.f.getString(paramInt4));
  }

  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    m localm = (m)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    ac localac = new ac(this.e, this, localm);
    localm.a(localac);
    return localac;
  }

  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }

  protected String b()
  {
    return "android:menu:actionviewstates";
  }

  public final void b(Bundle paramBundle)
  {
    if (paramBundle == null);
    MenuItem localMenuItem1;
    do
    {
      int i3;
      do
      {
        return;
        SparseArray localSparseArray = paramBundle.getSparseParcelableArray(b());
        int i1 = size();
        for (int i2 = 0; i2 < i1; i2++)
        {
          MenuItem localMenuItem2 = getItem(i2);
          View localView = af.a(localMenuItem2);
          if ((localView != null) && (localView.getId() != -1))
            localView.restoreHierarchyState(localSparseArray);
          if (!localMenuItem2.hasSubMenu())
            continue;
          ((ac)localMenuItem2.getSubMenu()).b(paramBundle);
        }
        i3 = paramBundle.getInt("android:menu:expandedactionview");
      }
      while (i3 <= 0);
      localMenuItem1 = findItem(i3);
    }
    while (localMenuItem1 == null);
    af.b(localMenuItem1);
  }

  public final void b(x paramx)
  {
    Iterator localIterator = this.u.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      x localx = (x)localWeakReference.get();
      if ((localx != null) && (localx != paramx))
        continue;
      this.u.remove(localWeakReference);
    }
  }

  public final void b(boolean paramBoolean)
  {
    if (!this.q)
    {
      if (paramBoolean)
      {
        this.l = true;
        this.o = true;
      }
      if (!this.u.isEmpty())
      {
        g();
        Iterator localIterator = this.u.iterator();
        while (localIterator.hasNext())
        {
          WeakReference localWeakReference = (WeakReference)localIterator.next();
          x localx = (x)localWeakReference.get();
          if (localx == null)
          {
            this.u.remove(localWeakReference);
            continue;
          }
          localx.b(paramBoolean);
        }
        h();
      }
      return;
    }
    this.r = true;
  }

  public boolean b(m paramm)
  {
    boolean bool1 = this.u.isEmpty();
    boolean bool2 = false;
    if (!bool1)
    {
      m localm = this.v;
      bool2 = false;
      if (localm == paramm);
    }
    else
    {
      return bool2;
    }
    g();
    Iterator localIterator = this.u.iterator();
    boolean bool3 = false;
    while (true)
      label46: if (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        x localx = (x)localWeakReference.get();
        if (localx == null)
        {
          this.u.remove(localWeakReference);
          continue;
        }
        bool2 = localx.c(paramm);
        if (!bool2)
          break;
      }
    while (true)
    {
      h();
      if (!bool2)
        break;
      this.v = null;
      return bool2;
      bool3 = bool2;
      break label46;
      bool2 = bool3;
    }
  }

  public final boolean b(MenuItem paramMenuItem)
  {
    return a(paramMenuItem, null, 0);
  }

  public final void c(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }

  boolean c()
  {
    return this.g;
  }

  public void clear()
  {
    if (this.v != null)
      b(this.v);
    this.j.clear();
    b(true);
  }

  public void clearHeader()
  {
    this.b = null;
    this.a = null;
    this.c = null;
    b(false);
  }

  public void close()
  {
    a(true);
  }

  public boolean d()
  {
    return this.h;
  }

  public final Context e()
  {
    return this.e;
  }

  public final void f()
  {
    if (this.i != null)
      this.i.a(this);
  }

  public MenuItem findItem(int paramInt)
  {
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      Object localObject = (m)this.j.get(i2);
      if (((m)localObject).getItemId() == paramInt);
      do
      {
        return localObject;
        if (!((m)localObject).hasSubMenu())
          break;
        localObject = ((m)localObject).getSubMenu().findItem(paramInt);
      }
      while (localObject != null);
    }
    return (MenuItem)null;
  }

  public final void g()
  {
    if (!this.q)
    {
      this.q = true;
      this.r = false;
    }
  }

  public MenuItem getItem(int paramInt)
  {
    return (MenuItem)this.j.get(paramInt);
  }

  public final void h()
  {
    this.q = false;
    if (this.r)
    {
      this.r = false;
      b(true);
    }
  }

  public boolean hasVisibleItems()
  {
    if (this.w)
      return true;
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++)
      if (((m)this.j.get(i2)).isVisible())
        return true;
    return false;
  }

  final void i()
  {
    this.l = true;
    b(true);
  }

  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return a(paramInt, paramKeyEvent) != null;
  }

  final void j()
  {
    this.o = true;
    b(true);
  }

  public final ArrayList<m> k()
  {
    if (!this.l)
      return this.k;
    this.k.clear();
    int i1 = this.j.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      m localm = (m)this.j.get(i2);
      if (!localm.isVisible())
        continue;
      this.k.add(localm);
    }
    this.l = false;
    this.o = true;
    return this.k;
  }

  public final void l()
  {
    ArrayList localArrayList = k();
    if (!this.o)
      return;
    Iterator localIterator = this.u.iterator();
    boolean bool = false;
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      x localx = (x)localWeakReference.get();
      if (localx == null)
      {
        this.u.remove(localWeakReference);
        continue;
      }
      bool |= localx.b();
    }
    if (bool)
    {
      this.m.clear();
      this.n.clear();
      int i1 = localArrayList.size();
      int i2 = 0;
      if (i2 < i1)
      {
        m localm = (m)localArrayList.get(i2);
        if (localm.h())
          this.m.add(localm);
        while (true)
        {
          i2++;
          break;
          this.n.add(localm);
        }
      }
    }
    else
    {
      this.m.clear();
      this.n.clear();
      this.n.addAll(k());
    }
    this.o = false;
  }

  public final ArrayList<m> m()
  {
    l();
    return this.m;
  }

  public final ArrayList<m> n()
  {
    l();
    return this.n;
  }

  public i o()
  {
    return this;
  }

  public final m p()
  {
    return this.v;
  }

  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return a(findItem(paramInt1), null, paramInt2);
  }

  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    m localm = a(paramInt1, paramKeyEvent);
    boolean bool = false;
    if (localm != null)
      bool = a(localm, null, paramInt2);
    if ((paramInt2 & 0x2) != 0)
      a(true);
    return bool;
  }

  public void removeGroup(int paramInt)
  {
    int i1 = size();
    int i2 = 0;
    if (i2 < i1)
      if (((m)this.j.get(i2)).getGroupId() != paramInt);
    for (int i3 = i2; ; i3 = -1)
    {
      if (i3 < 0)
        return;
      int i4 = this.j.size() - i3;
      int i6;
      for (int i5 = 0; ; i5 = i6)
      {
        i6 = i5 + 1;
        if ((i5 >= i4) || (((m)this.j.get(i3)).getGroupId() != paramInt))
          break;
        a(i3, false);
      }
      i2++;
      break;
    }
    b(true);
  }

  public void removeItem(int paramInt)
  {
    int i1 = size();
    int i2 = 0;
    if (i2 < i1)
      if (((m)this.j.get(i2)).getItemId() != paramInt);
    for (int i3 = i2; ; i3 = -1)
    {
      a(i3, true);
      return;
      i2++;
      break;
    }
  }

  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = this.j.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      m localm = (m)this.j.get(i2);
      if (localm.getGroupId() != paramInt)
        continue;
      localm.a(paramBoolean2);
      localm.setCheckable(paramBoolean1);
    }
  }

  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    int i1 = this.j.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      m localm = (m)this.j.get(i2);
      if (localm.getGroupId() != paramInt)
        continue;
      localm.setEnabled(paramBoolean);
    }
  }

  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    int i1 = this.j.size();
    int i2 = 0;
    int i3 = 0;
    if (i2 < i1)
    {
      m localm = (m)this.j.get(i2);
      if ((localm.getGroupId() != paramInt) || (!localm.c(paramBoolean)))
        break label76;
    }
    label76: for (int i4 = 1; ; i4 = i3)
    {
      i2++;
      i3 = i4;
      break;
      if (i3 != 0)
        b(true);
      return;
    }
  }

  public void setQwertyMode(boolean paramBoolean)
  {
    this.g = paramBoolean;
    b(false);
  }

  public int size()
  {
    return this.j.size();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.i
 * JD-Core Version:    0.6.0
 */