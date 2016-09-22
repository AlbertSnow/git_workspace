package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.j;
import android.support.v4.view.k;
import android.support.v7.appcompat.R.integer;
import android.support.v7.appcompat.R.layout;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.aa;
import android.support.v7.internal.view.menu.ac;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.v;
import android.support.v7.internal.view.menu.z;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

public final class ActionMenuPresenter extends android.support.v7.internal.view.menu.d
  implements k
{
  final a e = new a(this, 0);
  private View f;
  private boolean g;
  private boolean h;
  private int i;
  private int j;
  private int k;
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  private int p;
  private final SparseBooleanArray q = new SparseBooleanArray();
  private View r;
  private g s;
  private b t;
  private d u;
  private c v;

  public ActionMenuPresenter(Context paramContext)
  {
    super(paramContext, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
  }

  public final z a(ViewGroup paramViewGroup)
  {
    z localz = super.a(paramViewGroup);
    ((ActionMenuView)localz).setPresenter(this);
    return localz;
  }

  public final View a(m paramm, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramm.getActionView();
    if ((localView == null) || (paramm.l()))
      localView = super.a(paramm, paramView, paramViewGroup);
    if (paramm.isActionViewExpanded());
    for (int i1 = 8; ; i1 = 0)
    {
      localView.setVisibility(i1);
      ActionMenuView localActionMenuView = (ActionMenuView)paramViewGroup;
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      if (!localActionMenuView.checkLayoutParams(localLayoutParams))
        localView.setLayoutParams(ActionMenuView.a(localLayoutParams));
      return localView;
    }
  }

  public final void a(int paramInt)
  {
    this.i = paramInt;
    this.m = true;
    this.n = true;
  }

  public final void a(Context paramContext, android.support.v7.internal.view.menu.i parami)
  {
    super.a(paramContext, parami);
    Resources localResources = paramContext.getResources();
    com.sina.weibo.sdk.api.share.i locali = com.sina.weibo.sdk.api.share.i.a(paramContext);
    if (!this.h)
      this.g = locali.b();
    if (!this.n)
      this.i = locali.c();
    if (!this.l)
      this.k = locali.a();
    int i1 = this.i;
    if (this.g)
    {
      if (this.f == null)
      {
        this.f = new e(this, this.a);
        int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f.measure(i2, i2);
      }
      i1 -= this.f.getMeasuredWidth();
    }
    while (true)
    {
      this.j = i1;
      this.p = (int)(56.0F * localResources.getDisplayMetrics().density);
      this.r = null;
      return;
      this.f = null;
    }
  }

  public final void a(android.support.v7.internal.view.menu.i parami, boolean paramBoolean)
  {
    h();
    super.a(parami, paramBoolean);
  }

  public final void a(m paramm, aa paramaa)
  {
    paramaa.a(paramm);
    ActionMenuView localActionMenuView = (ActionMenuView)this.d;
    ActionMenuItemView localActionMenuItemView = (ActionMenuItemView)paramaa;
    localActionMenuItemView.setItemInvoker(localActionMenuView);
    if (this.v == null)
      this.v = new c(this, 0);
    localActionMenuItemView.setPopupCallback(this.v);
  }

  public final void a(ActionMenuView paramActionMenuView)
  {
    this.d = paramActionMenuView;
    paramActionMenuView.a(this.c);
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      super.a(null);
      return;
    }
    this.c.a(false);
  }

  public final boolean a(ac paramac)
  {
    if (!paramac.hasVisibleItems())
      return false;
    for (ac localac = paramac; localac.q() != this.c; localac = (ac)localac.q());
    MenuItem localMenuItem = localac.getItem();
    ViewGroup localViewGroup = (ViewGroup)this.d;
    int i2;
    View localView2;
    if (localViewGroup != null)
    {
      int i1 = localViewGroup.getChildCount();
      i2 = 0;
      if (i2 < i1)
      {
        localView2 = localViewGroup.getChildAt(i2);
        if ((!(localView2 instanceof aa)) || (((aa)localView2).getItemData() != localMenuItem));
      }
    }
    for (View localView1 = localView2; ; localView1 = null)
    {
      if (localView1 != null)
        break label136;
      if (this.f != null)
        break label130;
      return false;
      i2++;
      break;
    }
    label130: localView1 = this.f;
    label136: paramac.getItem().getItemId();
    this.t = new b(this, this.b, paramac);
    this.t.a(localView1);
    this.t.c();
    super.a(paramac);
    return true;
  }

  public final boolean a(m paramm)
  {
    return paramm.h();
  }

  public final boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramViewGroup.getChildAt(paramInt) == this.f)
      return false;
    return super.a(paramViewGroup, paramInt);
  }

  public final void b(boolean paramBoolean)
  {
    int i1 = 1;
    ((View)this.d).getParent();
    super.b(paramBoolean);
    ((View)this.d).requestLayout();
    if (this.c != null)
    {
      ArrayList localArrayList2 = this.c.m();
      int i5 = localArrayList2.size();
      for (int i6 = 0; i6 < i5; i6++)
      {
        j localj = ((m)localArrayList2.get(i6)).a();
        if (localj == null)
          continue;
        localj.a(this);
      }
    }
    ArrayList localArrayList1;
    int i2;
    int i3;
    int i4;
    if (this.c != null)
    {
      localArrayList1 = this.c.n();
      boolean bool = this.g;
      i2 = 0;
      if (bool)
      {
        i2 = 0;
        if (localArrayList1 != null)
        {
          i3 = localArrayList1.size();
          if (i3 != i1)
            break label273;
          if (((m)localArrayList1.get(0)).isActionViewExpanded())
            break label267;
          i4 = i1;
          label162: i2 = i4;
        }
      }
      if (i2 == 0)
        break label289;
      if (this.f == null)
        this.f = new e(this, this.a);
      ViewGroup localViewGroup = (ViewGroup)this.f.getParent();
      if (localViewGroup != this.d)
      {
        if (localViewGroup != null)
          localViewGroup.removeView(this.f);
        ((ActionMenuView)this.d).addView(this.f, ActionMenuView.b());
      }
    }
    while (true)
    {
      ((ActionMenuView)this.d).setOverflowReserved(this.g);
      return;
      localArrayList1 = null;
      break;
      label267: i4 = 0;
      break label162;
      label273: if (i3 > 0);
      while (true)
      {
        i2 = i1;
        break;
        i1 = 0;
      }
      label289: if ((this.f == null) || (this.f.getParent() != this.d))
        continue;
      ((ViewGroup)this.d).removeView(this.f);
    }
  }

  public final boolean b()
  {
    ArrayList localArrayList = this.c.k();
    int i1 = localArrayList.size();
    int i2 = this.k;
    int i3 = this.j;
    int i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
    ViewGroup localViewGroup = (ViewGroup)this.d;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    m localm3;
    if (i8 < i1)
    {
      localm3 = (m)localArrayList.get(i8);
      if (localm3.j())
      {
        i5++;
        label80: if ((!this.o) || (!localm3.isActionViewExpanded()))
          break label807;
      }
    }
    label546: label807: for (int i32 = 0; ; i32 = i2)
    {
      i8++;
      i2 = i32;
      break;
      if (localm3.i())
      {
        i6++;
        break label80;
      }
      i7 = 1;
      break label80;
      if ((this.g) && ((i7 != 0) || (i5 + i6 > i2)))
        i2--;
      int i9 = i2 - i5;
      SparseBooleanArray localSparseBooleanArray = this.q;
      localSparseBooleanArray.clear();
      int i11;
      int i10;
      if (this.m)
      {
        int i30 = i3 / this.p;
        int i31 = i3 % this.p;
        i11 = this.p + i31 / i30;
        i10 = i30;
      }
      while (true)
      {
        int i12 = 0;
        int i13 = 0;
        int i14 = i10;
        m localm1;
        View localView2;
        int i15;
        label295: int i17;
        int i28;
        if (i13 < i1)
        {
          localm1 = (m)localArrayList.get(i13);
          if (localm1.j())
          {
            localView2 = a(localm1, this.r, localViewGroup);
            if (this.r == null)
              this.r = localView2;
            if (this.m)
            {
              i15 = i14 - ActionMenuView.a(localView2, i11, i14, i4, 0);
              i17 = localView2.getMeasuredWidth();
              i28 = i3 - i17;
              if (i12 != 0)
                break label791;
            }
          }
        }
        while (true)
        {
          int i29 = localm1.getGroupId();
          if (i29 != 0)
            localSparseBooleanArray.put(i29, true);
          localm1.d(true);
          int i16 = i28;
          int i18 = i9;
          i13++;
          i3 = i16;
          i9 = i18;
          i12 = i17;
          i14 = i15;
          break;
          localView2.measure(i4, i4);
          i15 = i14;
          break label295;
          int i19;
          boolean bool1;
          boolean bool2;
          label440: View localView1;
          label508: int i26;
          boolean bool3;
          int i20;
          if (localm1.i())
          {
            i19 = localm1.getGroupId();
            bool1 = localSparseBooleanArray.get(i19);
            if (((i9 > 0) || (bool1)) && (i3 > 0) && ((!this.m) || (i14 > 0)))
            {
              bool2 = true;
              if (!bool2)
                break label780;
              localView1 = a(localm1, this.r, localViewGroup);
              if (this.r == null)
                this.r = localView1;
              if (!this.m)
                break label619;
              int i27 = ActionMenuView.a(localView1, i11, i14, i4, 0);
              i14 -= i27;
              if (i27 == 0)
                bool2 = false;
              int i24 = localView1.getMeasuredWidth();
              i3 -= i24;
              if (i12 == 0)
                i12 = i24;
              if (!this.m)
                break label637;
              if (i3 < 0)
                break label631;
              i26 = 1;
              bool3 = bool2 & i26;
              i20 = i14;
            }
          }
          while (true)
          {
            int i21;
            if ((bool3) && (i19 != 0))
            {
              localSparseBooleanArray.put(i19, true);
              i21 = i9;
            }
            while (true)
            {
              if (bool3)
                i21--;
              localm1.d(bool3);
              i17 = i12;
              i16 = i3;
              i18 = i21;
              i15 = i20;
              break;
              bool2 = false;
              break label440;
              label619: localView1.measure(i4, i4);
              break label508;
              label631: i26 = 0;
              break label546;
              label637: if (i3 + i12 > 0);
              for (int i25 = 1; ; i25 = 0)
              {
                bool3 = bool2 & i25;
                i20 = i14;
                break;
              }
              if (bool1)
              {
                localSparseBooleanArray.put(i19, false);
                int i22 = i9;
                int i23 = 0;
                while (true)
                  if (i23 < i13)
                  {
                    m localm2 = (m)localArrayList.get(i23);
                    if (localm2.getGroupId() == i19)
                    {
                      if (localm2.h())
                        i22++;
                      localm2.d(false);
                    }
                    i23++;
                    continue;
                    localm1.d(false);
                    i15 = i14;
                    i16 = i3;
                    i17 = i12;
                    i18 = i9;
                    break;
                    return true;
                  }
                i21 = i22;
                continue;
              }
              i21 = i9;
            }
            bool3 = bool2;
            i20 = i14;
          }
          i17 = i12;
        }
        i10 = 0;
        i11 = 0;
      }
    }
  }

  public final void c()
  {
    if (!this.l)
      this.k = this.b.getResources().getInteger(R.integer.abc_max_action_buttons);
    if (this.c != null)
      this.c.b(true);
  }

  public final void c(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }

  public final void d()
  {
    this.g = true;
    this.h = true;
  }

  public final void e()
  {
    this.k = 2147483647;
    this.l = true;
  }

  public final boolean f()
  {
    if ((this.g) && (!j()) && (this.c != null) && (this.d != null) && (this.u == null) && (!this.c.n().isEmpty()))
    {
      this.u = new d(this, new g(this, this.b, this.c, this.f));
      ((View)this.d).post(this.u);
      super.a(null);
      return true;
    }
    return false;
  }

  public final boolean g()
  {
    if ((this.u != null) && (this.d != null))
    {
      ((View)this.d).removeCallbacks(this.u);
      this.u = null;
      return true;
    }
    g localg = this.s;
    if (localg != null)
    {
      localg.f();
      return true;
    }
    return false;
  }

  public final boolean h()
  {
    return g() | i();
  }

  public final boolean i()
  {
    if (this.t != null)
    {
      this.t.f();
      return true;
    }
    return false;
  }

  public final boolean j()
  {
    return (this.s != null) && (this.s.g());
  }

  public final boolean k()
  {
    return (this.u != null) || (j());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.ActionMenuPresenter
 * JD-Core Version:    0.6.0
 */