package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.a.a;
import android.support.v4.view.a.f;
import android.support.v4.view.a.n;
import android.support.v4.view.a.w;
import android.support.v4.view.bg;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

public abstract class ce
{
  p e;
  RecyclerView f;
  ck g;

  public static int a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = 1073741824;
    int j = Math.max(0, paramInt1 - paramInt2);
    if (paramBoolean)
      if (paramInt3 < 0);
    while (true)
    {
      return View.MeasureSpec.makeMeasureSpec(paramInt3, i);
      i = 0;
      paramInt3 = 0;
      continue;
      if (paramInt3 >= 0)
        continue;
      if (paramInt3 == -1)
      {
        paramInt3 = j;
        continue;
      }
      if (paramInt3 == -2)
      {
        i = -2147483648;
        paramInt3 = j;
        continue;
      }
      i = 0;
      paramInt3 = 0;
    }
  }

  private void a(int paramInt)
  {
    if (d(paramInt) != null)
      this.e.a(paramInt);
  }

  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b;
    paramView.layout(paramInt1 + localRect.left, paramInt2 + localRect.top, paramInt3 - localRect.right, paramInt4 - localRect.bottom);
  }

  private void a(View paramView, int paramInt, boolean paramBoolean)
  {
    co localco1 = RecyclerView.b(paramView);
    RecyclerView.LayoutParams localLayoutParams1;
    if ((paramBoolean) || (localco1.o()))
    {
      this.f.e.b(paramView);
      localLayoutParams1 = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      if ((!localco1.h()) && (!localco1.f()))
        break label126;
      if (!localco1.f())
        break label118;
      localco1.g();
      label67: this.e.a(paramView, paramInt, paramView.getLayoutParams(), false);
    }
    while (true)
    {
      if (localLayoutParams1.d)
      {
        localco1.a.invalidate();
        localLayoutParams1.d = false;
      }
      return;
      this.f.e.a(paramView);
      break;
      label118: localco1.i();
      break label67;
      label126: if (paramView.getParent() == this.f)
      {
        p localp = this.e;
        int i = localp.a.a(paramView);
        int j;
        if (i == -1)
          j = -1;
        while (true)
        {
          if (paramInt == -1)
            paramInt = this.e.a();
          if (j != -1)
            break;
          throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f.indexOfChild(paramView));
          if (localp.b.b(i))
          {
            j = -1;
            continue;
          }
          j = i - localp.b.d(i);
        }
        if (j == paramInt)
          continue;
        ce localce = RecyclerView.e(this.f);
        View localView = localce.d(j);
        if (localView == null)
          throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j);
        localce.h(j);
        RecyclerView.LayoutParams localLayoutParams2 = (RecyclerView.LayoutParams)localView.getLayoutParams();
        co localco2 = RecyclerView.b(localView);
        if (localco2.o())
          localce.f.e.b(localView);
        while (true)
        {
          localce.e.a(localView, paramInt, localLayoutParams2, localco2.o());
          break;
          localce.f.e.a(localView);
        }
      }
      this.e.a(paramView, paramInt, false);
      localLayoutParams1.c = true;
      if ((this.g == null) || (!this.g.e()))
        continue;
      this.g.a(paramView);
    }
  }

  public static int e(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).a.d();
  }

  public static int f(View paramView)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b;
    return paramView.getMeasuredWidth() + localRect.left + localRect.right;
  }

  public static int g(View paramView)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b;
    return paramView.getMeasuredHeight() + localRect.top + localRect.bottom;
  }

  public static int h(View paramView)
  {
    return paramView.getLeft() - n(paramView);
  }

  private void h(int paramInt)
  {
    d(paramInt);
    this.e.d(paramInt);
  }

  public static int i(View paramView)
  {
    return paramView.getTop() - l(paramView);
  }

  public static int j(View paramView)
  {
    return paramView.getRight() + o(paramView);
  }

  public static int k(View paramView)
  {
    return paramView.getBottom() + m(paramView);
  }

  public static int l(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b.top;
  }

  public static int m(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b.bottom;
  }

  public static int n(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b.left;
  }

  public static int o(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b.right;
  }

  public int a(int paramInt, ch paramch, cm paramcm)
  {
    return 0;
  }

  public int a(ch paramch, cm paramcm)
  {
    if ((this.f == null) || (RecyclerView.g(this.f) == null));
    do
      return 1;
    while (!g());
    return RecyclerView.g(this.f).a();
  }

  public int a(cm paramcm)
  {
    return 0;
  }

  public abstract RecyclerView.LayoutParams a();

  public RecyclerView.LayoutParams a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new RecyclerView.LayoutParams(paramContext, paramAttributeSet);
  }

  public RecyclerView.LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof RecyclerView.LayoutParams))
      return new RecyclerView.LayoutParams((RecyclerView.LayoutParams)paramLayoutParams);
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new RecyclerView.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new RecyclerView.LayoutParams(paramLayoutParams);
  }

  public void a(int paramInt1, int paramInt2)
  {
  }

  public final void a(int paramInt, ch paramch)
  {
    View localView = d(paramInt);
    a(paramInt);
    paramch.a(localView);
  }

  public void a(Parcelable paramParcelable)
  {
  }

  public void a(RecyclerView paramRecyclerView)
  {
  }

  public void a(RecyclerView paramRecyclerView, ch paramch)
  {
  }

  public final void a(ch paramch)
  {
    int i = -1 + p();
    if (i >= 0)
    {
      View localView = d(i);
      co localco = RecyclerView.b(localView);
      if (!localco.b())
      {
        if ((!localco.k()) || (localco.o()) || (localco.m()))
          break label80;
        RecyclerView.g(this.f);
        a(i);
        paramch.a(localco);
      }
      while (true)
      {
        i--;
        break;
        label80: h(i);
        paramch.b(localView);
      }
    }
  }

  public void a(ch paramch, cm paramcm, int paramInt1, int paramInt2)
  {
    RecyclerView.b(this.f, paramInt1, paramInt2);
  }

  public void a(ch paramch, cm paramcm, View paramView, f paramf)
  {
    int i;
    if (g())
    {
      i = e(paramView);
      if (!f())
        break label48;
    }
    label48: for (int j = e(paramView); ; j = 0)
    {
      paramf.b(n.a(i, 1, j, 1, false));
      return;
      i = 0;
      break;
    }
  }

  public final void a(ck paramck)
  {
    if ((this.g != null) && (paramck != this.g) && (this.g.e()))
      this.g.c();
    this.g = paramck;
    this.g.a(this.f, this);
  }

  public final void a(View paramView)
  {
    a(paramView, -1, true);
  }

  public final void a(View paramView, Rect paramRect)
  {
    if (this.f == null)
    {
      paramRect.set(0, 0, 0, 0);
      return;
    }
    paramRect.set(this.f.e(paramView));
  }

  final void a(View paramView, f paramf)
  {
    co localco = RecyclerView.b(paramView);
    if ((localco != null) && (!localco.o()))
      a(this.f.a, this.f.e, paramView, paramf);
  }

  public final void a(View paramView, ch paramch)
  {
    p localp = this.e;
    int i = localp.a.a(paramView);
    if (i >= 0)
    {
      if (localp.b.c(i))
        localp.c.remove(paramView);
      localp.a.a(i);
    }
    paramch.a(paramView);
  }

  public void a(AccessibilityEvent paramAccessibilityEvent)
  {
    int i = 1;
    w localw = a.a(paramAccessibilityEvent);
    if (this.f == null)
      return;
    if ((bg.b(this.f, i)) || (bg.b(this.f, -1)) || (bg.a(this.f, -1)) || (bg.a(this.f, i)));
    while (true)
    {
      localw.a(i);
      if (RecyclerView.g(this.f) == null)
        break;
      localw.a(RecyclerView.g(this.f).a());
      return;
      int j = 0;
    }
  }

  public void a(String paramString)
  {
    if (this.f != null)
      this.f.a(paramString);
  }

  public boolean a(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams != null;
  }

  public int b(int paramInt, ch paramch, cm paramcm)
  {
    return 0;
  }

  public int b(ch paramch, cm paramcm)
  {
    if ((this.f == null) || (RecyclerView.g(this.f) == null));
    do
      return 1;
    while (!f());
    return RecyclerView.g(this.f).a();
  }

  public int b(cm paramcm)
  {
    return 0;
  }

  public View b(int paramInt)
  {
    int i = p();
    for (int j = 0; j < i; j++)
    {
      View localView = d(j);
      co localco = RecyclerView.b(localView);
      if ((localco != null) && (localco.d() == paramInt) && (!localco.b()) && ((this.f.e.a()) || (!localco.o())))
        return localView;
    }
    return null;
  }

  public void b(int paramInt1, int paramInt2)
  {
  }

  public void b(RecyclerView paramRecyclerView)
  {
  }

  final void b(ch paramch)
  {
    int i = paramch.a.size();
    for (int j = i - 1; j >= 0; j--)
    {
      View localView = ((co)paramch.a.get(j)).a;
      co localco1 = RecyclerView.b(localView);
      if (localco1.b())
        continue;
      if (localco1.q())
        this.f.removeDetachedView(localView, false);
      co localco2 = RecyclerView.b(localView);
      co.b(localco2);
      localco2.i();
      paramch.a(localco2);
    }
    paramch.a.clear();
    if (i > 0)
      this.f.invalidate();
  }

  public final void b(View paramView)
  {
    a(paramView, 0, true);
  }

  public int c(cm paramcm)
  {
    return 0;
  }

  public View c(int paramInt, ch paramch, cm paramcm)
  {
    return null;
  }

  public void c(int paramInt)
  {
  }

  public void c(int paramInt1, int paramInt2)
  {
  }

  final void c(RecyclerView paramRecyclerView)
  {
    if (paramRecyclerView == null)
    {
      this.f = null;
      this.e = null;
      return;
    }
    this.f = paramRecyclerView;
    this.e = paramRecyclerView.c;
  }

  public void c(ch paramch, cm paramcm)
  {
  }

  public final void c(View paramView)
  {
    a(paramView, -1, false);
  }

  public int d(cm paramcm)
  {
    return 0;
  }

  public final View d(int paramInt)
  {
    if (this.e != null)
      return this.e.b(paramInt);
    return null;
  }

  public void d(int paramInt1, int paramInt2)
  {
  }

  public final void d(View paramView)
  {
    a(paramView, 0, false);
  }

  public boolean d()
  {
    return false;
  }

  public int e(cm paramcm)
  {
    return 0;
  }

  public Parcelable e()
  {
    return null;
  }

  public void e(int paramInt)
  {
    if (this.f != null)
    {
      RecyclerView localRecyclerView = this.f;
      int i = localRecyclerView.c.a();
      for (int j = 0; j < i; j++)
        localRecyclerView.c.b(j).offsetLeftAndRight(paramInt);
    }
  }

  public int f(cm paramcm)
  {
    return 0;
  }

  public void f(int paramInt)
  {
    if (this.f != null)
    {
      RecyclerView localRecyclerView = this.f;
      int i = localRecyclerView.c.a();
      for (int j = 0; j < i; j++)
        localRecyclerView.c.b(j).offsetTopAndBottom(paramInt);
    }
  }

  public final void f(int paramInt1, int paramInt2)
  {
    RecyclerView.c(this.f, paramInt1, paramInt2);
  }

  public boolean f()
  {
    return false;
  }

  public void g(int paramInt)
  {
  }

  public boolean g()
  {
    return false;
  }

  public final void n()
  {
    if (this.f != null)
      this.f.requestLayout();
  }

  public final boolean o()
  {
    return (this.g != null) && (this.g.e());
  }

  public final int p()
  {
    if (this.e != null)
      return this.e.a();
    return 0;
  }

  public final int q()
  {
    if (this.f != null)
      return this.f.getWidth();
    return 0;
  }

  public final int r()
  {
    if (this.f != null)
      return this.f.getHeight();
    return 0;
  }

  public final int s()
  {
    if (this.f != null)
      return this.f.getPaddingLeft();
    return 0;
  }

  public final int t()
  {
    if (this.f != null)
      return this.f.getPaddingTop();
    return 0;
  }

  public final int u()
  {
    if (this.f != null)
      return this.f.getPaddingRight();
    return 0;
  }

  public final int v()
  {
    if (this.f != null)
      return this.f.getPaddingBottom();
    return 0;
  }

  public final int w()
  {
    if (this.f != null);
    for (by localby = this.f.getAdapter(); localby != null; localby = null)
      return localby.a();
    return 0;
  }

  final void x()
  {
    if (this.g != null)
      this.g.c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.ce
 * JD-Core Version:    0.6.0
 */