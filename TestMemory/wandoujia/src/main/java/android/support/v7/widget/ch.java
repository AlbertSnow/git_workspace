package android.support.v7.widget;

import android.support.v4.c.a;
import android.support.v4.view.bg;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityManager;
import de.greenrobot.event.util.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ch
{
  final ArrayList<co> a = new ArrayList();
  final ArrayList<co> b = new ArrayList();
  private ArrayList<co> c = null;
  private final List<co> d = Collections.unmodifiableList(this.a);
  private int e = 2;
  private cg f;
  private b g;

  public ch(RecyclerView paramRecyclerView)
  {
  }

  private void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    for (int i = -1 + paramViewGroup.getChildCount(); i >= 0; i--)
    {
      View localView = paramViewGroup.getChildAt(i);
      if (!(localView instanceof ViewGroup))
        continue;
      a((ViewGroup)localView, true);
    }
    if (!paramBoolean)
      return;
    if (paramViewGroup.getVisibility() == 4)
    {
      paramViewGroup.setVisibility(0);
      paramViewGroup.setVisibility(4);
      return;
    }
    int j = paramViewGroup.getVisibility();
    paramViewGroup.setVisibility(4);
    paramViewGroup.setVisibility(j);
  }

  private void c(co paramco)
  {
    bg.a(paramco.a, null);
    if (RecyclerView.u(this.h) != null)
      RecyclerView.u(this.h);
    if (RecyclerView.g(this.h) != null)
      RecyclerView.g(this.h).a(paramco);
    this.h.e.a(paramco);
    paramco.h = null;
    d().a(paramco);
  }

  private void c(View paramView)
  {
    if ((RecyclerView.s(this.h) != null) && (RecyclerView.s(this.h).isEnabled()))
    {
      if (bg.e(paramView) == 0)
        bg.c(paramView, 1);
      if (!bg.b(paramView))
        bg.a(paramView, RecyclerView.t(this.h).c);
    }
  }

  private co e(int paramInt)
  {
    int i;
    if (this.c != null)
    {
      i = this.c.size();
      if (i != 0);
    }
    else
    {
      return null;
    }
    for (int j = 0; j < i; j++)
    {
      co localco = (co)this.c.get(j);
      if ((localco.h()) || (localco.d() != paramInt))
        continue;
      localco.a(32);
      return localco;
    }
    RecyclerView.g(this.h);
    return null;
  }

  private co f(int paramInt)
  {
    int i = 0;
    int j = this.a.size();
    for (int k = 0; k < j; k++)
    {
      co localco3 = (co)this.a.get(k);
      if ((localco3.h()) || (localco3.d() != paramInt) || (localco3.k()) || ((!cm.e(this.h.e)) && (localco3.o())))
        continue;
      localco3.a(32);
      return localco3;
    }
    p localp = this.h.c;
    int m = localp.c.size();
    int n = 0;
    View localView;
    label167: int i1;
    if (n < m)
    {
      localView = (View)localp.c.get(n);
      co localco2 = RecyclerView.b(localView);
      if ((localco2.d() == paramInt) && (!localco2.k()))
      {
        if (localView != null)
          this.h.d.c(this.h.a(localView));
        i1 = this.b.size();
      }
    }
    while (true)
    {
      if (i >= i1)
        break label266;
      co localco1 = (co)this.b.get(i);
      if ((!localco1.k()) && (localco1.d() == paramInt))
      {
        this.b.remove(i);
        return localco1;
        n++;
        break;
        localView = null;
        break label167;
      }
      i++;
    }
    label266: return null;
  }

  public final void a()
  {
    this.a.clear();
    c();
  }

  public final void a(int paramInt)
  {
    this.e = paramInt;
    for (int i = -1 + this.b.size(); (i >= 0) && (this.b.size() > paramInt); i--)
      d(i);
  }

  final void a(cg paramcg)
  {
    if (this.f != null)
      this.f.c();
    this.f = paramcg;
    if (paramcg != null)
    {
      cg localcg = this.f;
      this.h.getAdapter();
      localcg.b();
    }
  }

  final void a(co paramco)
  {
    boolean bool1 = true;
    if ((paramco.f()) || (paramco.a.getParent() != null))
    {
      StringBuilder localStringBuilder = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:").append(paramco.f()).append(" isAttached:");
      if (paramco.a.getParent() != null);
      while (true)
      {
        throw new IllegalArgumentException(bool1);
        bool1 = false;
      }
    }
    if (paramco.q())
      throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + paramco);
    if (paramco.b())
      throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
    boolean bool2 = co.a(paramco);
    if ((RecyclerView.g(this.h) != null) && (bool2))
      RecyclerView.g(this.h);
    boolean bool5;
    boolean bool4;
    boolean bool3;
    if (paramco.s())
      if ((!paramco.k()) && (!paramco.o()) && (!paramco.m()))
      {
        int i = this.b.size();
        if ((i == this.e) && (i > 0))
          d(0);
        if (i < this.e)
        {
          this.b.add(paramco);
          bool5 = bool1;
          if (!bool5)
          {
            c(paramco);
            bool4 = bool1;
            bool3 = bool5;
          }
        }
      }
    while (true)
    {
      this.h.e.a(paramco);
      if ((!bool3) && (!bool4) && (bool2))
        paramco.h = null;
      return;
      bool3 = bool5;
      bool4 = false;
      continue;
      bool5 = false;
      break;
      bool3 = false;
      bool4 = false;
    }
  }

  public final void a(View paramView)
  {
    co localco = RecyclerView.b(paramView);
    if (localco.q())
      this.h.removeDetachedView(paramView, false);
    if (localco.f())
      localco.g();
    while (true)
    {
      a(localco);
      return;
      if (!localco.h())
        continue;
      localco.i();
    }
  }

  public final void a(View paramView, int paramInt)
  {
    boolean bool = true;
    co localco = RecyclerView.b(paramView);
    if (localco == null)
      throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
    int i = this.h.b.a(paramInt);
    if ((i < 0) || (i >= RecyclerView.g(this.h).a()))
      throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + paramInt + "(offset:" + i + ").state:" + this.h.e.e());
    localco.h = this.h;
    RecyclerView.g(this.h).b(localco, i);
    c(paramView);
    if (this.h.e.a())
      localco.e = paramInt;
    ViewGroup.LayoutParams localLayoutParams = localco.a.getLayoutParams();
    RecyclerView.LayoutParams localLayoutParams1;
    if (localLayoutParams == null)
    {
      localLayoutParams1 = (RecyclerView.LayoutParams)this.h.generateDefaultLayoutParams();
      localco.a.setLayoutParams(localLayoutParams1);
      localLayoutParams1.c = bool;
      localLayoutParams1.a = localco;
      if (localco.a.getParent() != null)
        break label276;
    }
    while (true)
    {
      localLayoutParams1.d = bool;
      return;
      if (!this.h.checkLayoutParams(localLayoutParams))
      {
        localLayoutParams1 = (RecyclerView.LayoutParams)this.h.generateLayoutParams(localLayoutParams);
        localco.a.setLayoutParams(localLayoutParams1);
        break;
      }
      localLayoutParams1 = (RecyclerView.LayoutParams)localLayoutParams;
      break;
      label276: bool = false;
    }
  }

  final void a(b paramb)
  {
    this.g = paramb;
  }

  public final int b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.h.e.e()))
      throw new IndexOutOfBoundsException("invalid position " + paramInt + ". State item count is " + this.h.e.e());
    if (!this.h.e.a())
      return paramInt;
    return this.h.b.a(paramInt);
  }

  public final List<co> b()
  {
    return this.d;
  }

  final void b(co paramco)
  {
    if ((!paramco.m()) || (!RecyclerView.i(this.h)) || (this.c == null))
      this.a.remove(paramco);
    while (true)
    {
      co.b(paramco);
      paramco.i();
      return;
      this.c.remove(paramco);
    }
  }

  final void b(View paramView)
  {
    co localco = RecyclerView.b(paramView);
    localco.a(this);
    if ((!localco.m()) || (!RecyclerView.i(this.h)))
    {
      if ((localco.k()) && (!localco.o()))
      {
        RecyclerView.g(this.h);
        throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
      }
      this.a.add(localco);
      return;
    }
    if (this.c == null)
      this.c = new ArrayList();
    this.c.add(localco);
  }

  public final View c(int paramInt)
  {
    boolean bool = true;
    if ((paramInt < 0) || (paramInt >= this.h.e.e()))
      throw new IndexOutOfBoundsException("Invalid item position " + paramInt + "(" + paramInt + "). Item count:" + this.h.e.e());
    int i3;
    int i;
    Object localObject1;
    if (this.h.e.a())
    {
      co localco3 = e(paramInt);
      if (localco3 != null)
      {
        i3 = bool;
        i = i3;
        localObject1 = localco3;
      }
    }
    while (true)
    {
      int i2;
      label255: int j;
      if (localObject1 == null)
      {
        localObject1 = f(paramInt);
        if (localObject1 != null)
          if (!((co)localObject1).o())
          {
            if ((((co)localObject1).b < 0) || (((co)localObject1).b >= RecyclerView.g(this.h).a()))
            {
              throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + localObject1);
              i3 = 0;
              break;
            }
            if ((!this.h.e.a()) && (RecyclerView.g(this.h).a(((co)localObject1).b) != ((co)localObject1).d))
            {
              i2 = 0;
              if (i2 != 0)
                break label386;
              ((co)localObject1).a(4);
              if (!((co)localObject1).f())
                break label372;
              this.h.removeDetachedView(((co)localObject1).a, false);
              ((co)localObject1).g();
              a((co)localObject1);
              localObject1 = null;
              j = i;
            }
          }
      }
      while (true)
      {
        label372: Object localObject2;
        if (localObject1 == null)
        {
          int n = this.h.b.a(paramInt);
          if ((n < 0) || (n >= RecyclerView.g(this.h).a()))
          {
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + paramInt + "(offset:" + n + ").state:" + this.h.e.e());
            RecyclerView.g(this.h);
            i2 = bool;
            break;
            if (!((co)localObject1).h())
              break label255;
            ((co)localObject1).i();
            break label255;
            label386: j = bool;
            continue;
          }
          int i1 = RecyclerView.g(this.h).a(n);
          RecyclerView.g(this.h);
          if ((localObject1 == null) && (this.g != null))
          {
            View localView = this.g.b();
            if (localView != null)
            {
              localObject1 = this.h.a(localView);
              if (localObject1 == null)
                throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
              if (((co)localObject1).b())
                throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
            }
          }
          if (localObject1 == null)
          {
            co localco2 = d().b(i1);
            if (localco2 != null)
            {
              localco2.r();
              if ((RecyclerView.g()) && ((localco2.a instanceof ViewGroup)))
                a((ViewGroup)localco2.a, false);
            }
            localObject1 = localco2;
          }
          if (localObject1 == null)
          {
            by localby = RecyclerView.g(this.h);
            RecyclerView localRecyclerView = this.h;
            a.a("RV CreateView");
            co localco1 = localby.a(localRecyclerView, i1);
            localco1.d = i1;
            localObject2 = localco1;
            a.a();
          }
        }
        while (true)
        {
          int m;
          if ((this.h.e.a()) && (((co)localObject2).n()))
          {
            ((co)localObject2).e = paramInt;
            m = 0;
          }
          while (true)
          {
            ViewGroup.LayoutParams localLayoutParams = ((co)localObject2).a.getLayoutParams();
            RecyclerView.LayoutParams localLayoutParams1;
            if (localLayoutParams == null)
            {
              localLayoutParams1 = (RecyclerView.LayoutParams)this.h.generateDefaultLayoutParams();
              ((co)localObject2).a.setLayoutParams(localLayoutParams1);
              label657: localLayoutParams1.a = ((co)localObject2);
              if ((j == 0) || (m == 0))
                break label829;
            }
            while (true)
            {
              localLayoutParams1.d = bool;
              return ((co)localObject2).a;
              if ((((co)localObject2).n()) && (!((co)localObject2).l()) && (!((co)localObject2).k()))
                break label834;
              int k = this.h.b.a(paramInt);
              ((co)localObject2).h = this.h;
              RecyclerView.g(this.h).b((co)localObject2, k);
              c(((co)localObject2).a);
              if (this.h.e.a())
                ((co)localObject2).e = paramInt;
              m = bool;
              break;
              if (!this.h.checkLayoutParams(localLayoutParams))
              {
                localLayoutParams1 = (RecyclerView.LayoutParams)this.h.generateLayoutParams(localLayoutParams);
                ((co)localObject2).a.setLayoutParams(localLayoutParams1);
                break label657;
              }
              localLayoutParams1 = (RecyclerView.LayoutParams)localLayoutParams;
              break label657;
              label829: bool = false;
            }
            label834: m = 0;
          }
          localObject2 = localObject1;
        }
        j = i;
      }
      localObject1 = null;
      i = 0;
    }
  }

  final void c()
  {
    for (int i = -1 + this.b.size(); i >= 0; i--)
      d(i);
    this.b.clear();
  }

  final cg d()
  {
    if (this.f == null)
      this.f = new cg();
    return this.f;
  }

  final void d(int paramInt)
  {
    c((co)this.b.get(paramInt));
    this.b.remove(paramInt);
  }

  final void e()
  {
    int i = 0;
    int j = this.b.size();
    for (int k = 0; k < j; k++)
      ((co)this.b.get(k)).a();
    int m = this.a.size();
    for (int n = 0; n < m; n++)
      ((co)this.a.get(n)).a();
    if (this.c != null)
    {
      int i1 = this.c.size();
      while (i < i1)
      {
        ((co)this.c.get(i)).a();
        i++;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.ch
 * JD-Core Version:    0.6.0
 */