package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
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
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public final class StaggeredGridLayoutManager extends ce
{
  bs a;
  private bs b;
  private int c;
  private ay d;
  private boolean h;
  private boolean i;
  private int j;
  private int k;
  private boolean l;
  private boolean m;
  private StaggeredGridLayoutManager.SavedState n;
  private int o;
  private int p;
  private final Rect q;
  private final df r;
  private final Runnable s;

  private static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0));
    int i1;
    do
    {
      return paramInt1;
      i1 = View.MeasureSpec.getMode(paramInt1);
    }
    while ((i1 != -2147483648) && (i1 != 1073741824));
    return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3, i1);
  }

  private int a(ch paramch, ay paramay, cm paramcm)
  {
    null.set(0, 0, true);
    int i1;
    int i2;
    label42: int i3;
    label45: int i4;
    label66: View localView;
    StaggeredGridLayoutManager.LayoutParams localLayoutParams1;
    int i7;
    int i8;
    label141: int i9;
    label150: label171: label207: int i10;
    int i12;
    label229: int i15;
    int i14;
    label356: int i19;
    if (paramay.d == 1)
    {
      i1 = paramay.f + paramay.a;
      if (!this.i)
        break label613;
      i2 = this.a.d();
      i3 = 0;
      if ((paramay.b < 0) || (paramay.b >= paramcm.e()))
        break label625;
      i4 = 1;
      if ((i4 == 0) || (null.isEmpty()))
        break label830;
      localView = paramch.c(paramay.b);
      paramay.b += paramay.c;
      localLayoutParams1 = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
      i7 = localLayoutParams1.a.d();
      if ((null.d != null) && (i7 < null.d.length))
        break label631;
      i8 = -1;
      if (i8 != -1)
        break label643;
      i9 = 1;
      if (i9 != 0)
      {
        if (paramay.d != 1)
          break label649;
        this.a.c();
        df.a(i7);
        null.d[i7] = null.d;
      }
      localLayoutParams1.e = null;
      if (paramay.d != 1)
        break label660;
      c(localView);
      i10 = localLayoutParams1.width;
      int i11 = this.o;
      if (i10 >= 0)
        break label669;
      i12 = i11;
      int i13 = this.p;
      a(localView, this.q);
      StaggeredGridLayoutManager.LayoutParams localLayoutParams2 = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
      localView.measure(a(i12, localLayoutParams2.leftMargin + this.q.left, localLayoutParams2.rightMargin + this.q.right), a(i13, localLayoutParams2.topMargin + this.q.top, localLayoutParams2.bottomMargin + this.q.bottom));
      if (paramay.d != 1)
        break label681;
      i15 = di.b(i2);
      i14 = i15 + this.a.c(localView);
      if (i9 != 0);
      if (paramay.d != 1)
        break label705;
      di localdi2 = localLayoutParams1.e;
      StaggeredGridLayoutManager.LayoutParams localLayoutParams5 = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
      localLayoutParams5.e = localdi2;
      null.add(localView);
      localdi2.b = -2147483648;
      if (null.size() == 1)
        localdi2.a = -2147483648;
      if ((localLayoutParams5.a.o()) || (localLayoutParams5.a.m()))
        localdi2.c += localdi2.e.a.c(localView);
      label463: int i16 = null.d * this.c + this.b.c();
      int i17 = i16 + this.b.c(localView);
      StaggeredGridLayoutManager.LayoutParams localLayoutParams4 = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
      a(localView, i15 + localLayoutParams4.leftMargin, i16 + localLayoutParams4.topMargin, i14 - localLayoutParams4.rightMargin, i17 - localLayoutParams4.bottomMargin);
      int i18 = this.d.d;
      i19 = null.c;
      if (i18 != -1)
        break label807;
      if (i19 + di.a() <= i1)
        null.set(null.d, false);
    }
    while (true)
    {
      a(paramch, this.d);
      i3 = 1;
      break label45;
      i1 = paramay.e - paramay.a;
      break;
      label613: i2 = this.a.c();
      break label42;
      label625: i4 = 0;
      break label66;
      label631: i8 = null.d[i7];
      break label141;
      label643: i9 = 0;
      break label150;
      label649: this.a.d();
      break label171;
      label660: d(localView);
      break label207;
      label669: i12 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
      break label229;
      label681: i14 = di.a(i2);
      i15 = i14 - this.a.c(localView);
      break label356;
      label705: di localdi1 = localLayoutParams1.e;
      StaggeredGridLayoutManager.LayoutParams localLayoutParams3 = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
      localLayoutParams3.e = localdi1;
      null.add(0, localView);
      localdi1.a = -2147483648;
      if (null.size() == 1)
        localdi1.b = -2147483648;
      if ((!localLayoutParams3.a.o()) && (!localLayoutParams3.a.m()))
        break label463;
      localdi1.c += localdi1.e.a.c(localView);
      break label463;
      label807: if (di.b() - i19 < i1)
        continue;
      null.set(null.d, false);
    }
    label830: if (i3 == 0)
      a(paramch, this.d);
    int i6;
    if (this.d.d == -1)
      i6 = di.a(this.a.c());
    for (int i5 = this.a.c() - i6; i5 > 0; i5 = di.b(this.a.d()) - this.a.d())
      return Math.min(paramay.a, i5);
    return 0;
  }

  private View a(boolean paramBoolean)
  {
    b();
    int i1 = this.a.c();
    int i2 = this.a.d();
    int i3 = p();
    Object localObject1 = null;
    int i4 = 0;
    Object localObject2;
    if (i4 < i3)
    {
      localObject2 = d(i4);
      int i5 = this.a.a((View)localObject2);
      if ((this.a.b((View)localObject2) <= i1) || (i5 >= i2))
        break label108;
      if ((i5 >= i1) || (!paramBoolean))
        return localObject2;
      if (localObject1 != null)
        break label108;
    }
    while (true)
    {
      i4++;
      localObject1 = localObject2;
      break;
      return localObject1;
      label108: localObject2 = localObject1;
    }
  }

  private void a(int paramInt)
  {
    int i1 = 1;
    this.d.d = paramInt;
    ay localay = this.d;
    int i2 = this.i;
    if (paramInt == -1)
    {
      int i3 = i1;
      if (i2 != i3)
        break label48;
    }
    while (true)
    {
      localay.c = i1;
      return;
      int i4 = 0;
      break;
      label48: i1 = -1;
    }
  }

  private void a(int paramInt, cm paramcm)
  {
    this.d.a = 0;
    this.d.b = paramInt;
    boolean bool3;
    int i1;
    int i2;
    if (o())
    {
      int i4 = paramcm.c();
      if (i4 != -1)
      {
        boolean bool2 = this.i;
        if (i4 < paramInt)
        {
          bool3 = true;
          if (bool2 != bool3)
            break label147;
          i1 = this.a.f();
          i2 = 0;
        }
      }
    }
    while (true)
    {
      RecyclerView localRecyclerView = this.f;
      int i3 = 0;
      if (localRecyclerView != null)
      {
        boolean bool1 = RecyclerView.v(this.f);
        i3 = 0;
        if (bool1)
          i3 = 1;
      }
      if (i3 != 0)
      {
        this.d.e = (this.a.c() - i2);
        this.d.f = (i1 + this.a.d());
        return;
        bool3 = false;
        break;
        label147: i2 = this.a.f();
        i1 = 0;
        continue;
      }
      this.d.f = (i1 + this.a.e());
      this.d.e = (-i2);
      return;
      i1 = 0;
      i2 = 0;
    }
  }

  private void a(ch paramch, int paramInt)
  {
    while (true)
    {
      View localView1;
      StaggeredGridLayoutManager.LayoutParams localLayoutParams1;
      if (p() > 0)
      {
        localView1 = d(0);
        if (this.a.b(localView1) <= paramInt)
        {
          localLayoutParams1 = (StaggeredGridLayoutManager.LayoutParams)localView1.getLayoutParams();
          if (null.size() != 1)
            break label43;
        }
      }
      return;
      label43: di localdi = localLayoutParams1.e;
      View localView2 = (View)null.remove(0);
      StaggeredGridLayoutManager.LayoutParams localLayoutParams2 = (StaggeredGridLayoutManager.LayoutParams)localView2.getLayoutParams();
      localLayoutParams2.e = null;
      if (null.size() == 0)
        localdi.b = -2147483648;
      if ((localLayoutParams2.a.o()) || (localLayoutParams2.a.m()))
        localdi.c -= localdi.e.a.c(localView2);
      localdi.a = -2147483648;
      a(localView1, paramch);
    }
  }

  private void a(ch paramch, ay paramay)
  {
    if (paramay.a == 0)
    {
      if (paramay.d == -1)
      {
        b(paramch, paramay.f);
        return;
      }
      a(paramch, paramay.e);
      return;
    }
    if (paramay.d == -1)
    {
      int i3 = paramay.e - di.a(paramay.e);
      if (i3 < 0);
      for (int i4 = paramay.f; ; i4 = paramay.f - Math.min(i3, paramay.a))
      {
        b(paramch, i4);
        return;
      }
    }
    int i1 = di.b(paramay.f) - paramay.f;
    if (i1 < 0);
    for (int i2 = paramay.e; ; i2 = paramay.e + Math.min(i1, paramay.a))
    {
      a(paramch, i2);
      return;
    }
  }

  private void a(ch paramch, cm paramcm, boolean paramBoolean)
  {
    int i1 = di.b(this.a.d());
    int i2 = this.a.d() - i1;
    if (i2 > 0)
    {
      int i3 = i2 - -d(-i2, paramch, paramcm);
      if ((paramBoolean) && (i3 > 0))
        this.a.a(i3);
    }
  }

  private View b(boolean paramBoolean)
  {
    b();
    int i1 = this.a.c();
    int i2 = this.a.d();
    Object localObject1 = null;
    int i3 = -1 + p();
    Object localObject2;
    if (i3 >= 0)
    {
      localObject2 = d(i3);
      int i4 = this.a.a((View)localObject2);
      int i5 = this.a.b((View)localObject2);
      if ((i5 <= i1) || (i4 >= i2))
        break label109;
      if ((i5 <= i2) || (!paramBoolean))
        return localObject2;
      if (localObject1 != null)
        break label109;
    }
    while (true)
    {
      i3--;
      localObject1 = localObject2;
      break;
      return localObject1;
      label109: localObject2 = localObject1;
    }
  }

  private void b()
  {
    if (this.a == null)
    {
      this.a = bs.a(this, 0);
      this.b = bs.a(this, 1);
      this.d = new ay();
    }
  }

  private void b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1;
    int i3;
    int i4;
    label35: int i9;
    label79: StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem1;
    label110: int i8;
    if (this.i)
    {
      i1 = i();
      if (paramInt3 != 3)
        break label296;
      if (paramInt1 >= paramInt2)
        break label281;
      int i11 = paramInt2 + 1;
      i3 = paramInt1;
      i4 = i11;
      if ((null.d != null) && (i3 < null.d.length))
      {
        if (null.e == null)
          break label329;
        if (null.e == null)
          break label317;
        i9 = -1 + null.e.size();
        if (i9 < 0)
          break label317;
        localFullSpanItem1 = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)null.e.get(i9);
        if (localFullSpanItem1.a != i3)
          break label311;
        if (localFullSpanItem1 != null)
          null.e.remove(localFullSpanItem1);
        int i7 = null.e.size();
        i8 = 0;
        label141: if (i8 >= i7)
          break label415;
        if (((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)null.e.get(i8)).a < i3)
          break label323;
      }
    }
    while (true)
    {
      int i6;
      if (i8 != -1)
      {
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem2 = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)null.e.get(i8);
        null.e.remove(i8);
        i6 = localFullSpanItem2.a;
        label211: if (i6 != -1)
          break label335;
        Arrays.fill(null.d, i3, null.d.length, -1);
        label264: switch (paramInt3)
        {
        case 2:
        default:
          label232: if (i4 > i1)
            break;
        case 0:
        case 1:
        case 3:
        }
      }
      while (true)
      {
        return;
        i1 = j();
        break;
        label281: int i10 = paramInt1 + 1;
        i3 = paramInt2;
        i4 = i10;
        break label35;
        label296: int i2 = paramInt1 + paramInt2;
        i3 = paramInt1;
        i4 = i2;
        break label35;
        label311: i9--;
        break label79;
        label317: localFullSpanItem1 = null;
        break label110;
        label323: i8++;
        break label141;
        label329: i6 = -1;
        break label211;
        label335: Arrays.fill(null.d, i3, i6 + 1, -1);
        break label232;
        df.b(paramInt1, paramInt2);
        break label264;
        df.a(paramInt1, paramInt2);
        break label264;
        df.a(paramInt1, 1);
        df.b(paramInt2, 1);
        break label264;
        if (this.i);
        for (int i5 = j(); i3 <= i5; i5 = i())
        {
          n();
          return;
        }
      }
      label415: i8 = -1;
    }
  }

  private void b(ch paramch, int paramInt)
  {
    for (int i1 = -1 + p(); ; i1--)
    {
      View localView1;
      StaggeredGridLayoutManager.LayoutParams localLayoutParams1;
      if (i1 >= 0)
      {
        localView1 = d(i1);
        if (this.a.a(localView1) >= paramInt)
        {
          localLayoutParams1 = (StaggeredGridLayoutManager.LayoutParams)localView1.getLayoutParams();
          if (null.size() != 1)
            break label50;
        }
      }
      return;
      label50: di localdi = localLayoutParams1.e;
      int i2 = null.size();
      View localView2 = (View)null.remove(i2 - 1);
      StaggeredGridLayoutManager.LayoutParams localLayoutParams2 = (StaggeredGridLayoutManager.LayoutParams)localView2.getLayoutParams();
      localLayoutParams2.e = null;
      if ((localLayoutParams2.a.o()) || (localLayoutParams2.a.m()))
        localdi.c -= localdi.e.a.c(localView2);
      if (i2 == 1)
        localdi.a = -2147483648;
      localdi.b = -2147483648;
      a(localView1, paramch);
    }
  }

  private void b(ch paramch, cm paramcm, boolean paramBoolean)
  {
    int i1 = di.a(this.a.c()) - this.a.c();
    if (i1 > 0)
    {
      int i2 = i1 - d(i1, paramch, paramcm);
      if ((paramBoolean) && (i2 > 0))
        this.a.a(-i2);
    }
  }

  private void c()
  {
    boolean bool;
    if (!h())
      bool = this.h;
    while (true)
    {
      this.i = bool;
      return;
      if (!this.h)
      {
        bool = true;
        continue;
      }
      bool = false;
    }
  }

  private int d(int paramInt, ch paramch, cm paramcm)
  {
    b();
    int i1;
    int i2;
    int i4;
    if (paramInt > 0)
    {
      i1 = 1;
      i2 = i();
      a(i2, paramcm);
      a(i1);
      this.d.b = (i2 + this.d.c);
      int i3 = Math.abs(paramInt);
      this.d.a = i3;
      i4 = a(paramch, this.d, paramcm);
      if (i3 >= i4)
        if (paramInt >= 0)
          break label120;
    }
    label120: for (paramInt = -i4; ; paramInt = i4)
    {
      this.a.a(-paramInt);
      this.l = this.i;
      return paramInt;
      i1 = -1;
      i2 = j();
      break;
    }
  }

  private int g(cm paramcm)
  {
    if (p() == 0)
      return 0;
    b();
    return a.a(paramcm, this.a, a(true), b(true), this, false, this.i);
  }

  private int h(int paramInt)
  {
    if (p() == 0)
      if (!this.i);
    while (true)
    {
      return 1;
      return -1;
      if (paramInt < j());
      for (int i1 = 1; i1 != this.i; i1 = 0)
        return -1;
    }
  }

  private int h(cm paramcm)
  {
    if (p() == 0)
      return 0;
    b();
    return a.a(paramcm, this.a, a(true), b(true), this, false);
  }

  private boolean h()
  {
    return bg.h(this.f) == 1;
  }

  private int i()
  {
    int i1 = p();
    if (i1 == 0)
      return 0;
    return e(d(i1 - 1));
  }

  private int i(cm paramcm)
  {
    if (p() == 0)
      return 0;
    b();
    return a.b(paramcm, this.a, a(true), b(true), this, false);
  }

  private int j()
  {
    if (p() == 0)
      return 0;
    return e(d(0));
  }

  public final int a(int paramInt, ch paramch, cm paramcm)
  {
    return d(paramInt, paramch, paramcm);
  }

  public final int a(ch paramch, cm paramcm)
  {
    return 0;
  }

  public final int a(cm paramcm)
  {
    return g(paramcm);
  }

  public final RecyclerView.LayoutParams a()
  {
    return new StaggeredGridLayoutManager.LayoutParams();
  }

  public final RecyclerView.LayoutParams a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new StaggeredGridLayoutManager.LayoutParams(paramContext, paramAttributeSet);
  }

  public final RecyclerView.LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new StaggeredGridLayoutManager.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new StaggeredGridLayoutManager.LayoutParams(paramLayoutParams);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    b(paramInt1, paramInt2, 0);
  }

  public final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof StaggeredGridLayoutManager.SavedState))
    {
      this.n = ((StaggeredGridLayoutManager.SavedState)paramParcelable);
      n();
    }
  }

  public final void a(RecyclerView paramRecyclerView)
  {
    df.a();
    n();
  }

  public final void a(RecyclerView paramRecyclerView, ch paramch)
  {
    Runnable localRunnable = this.s;
    if (this.f != null)
      this.f.removeCallbacks(localRunnable);
  }

  public final void a(ch paramch, cm paramcm, View paramView, f paramf)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (!(localLayoutParams instanceof StaggeredGridLayoutManager.LayoutParams))
    {
      super.a(paramView, paramf);
      return;
    }
    StaggeredGridLayoutManager.LayoutParams localLayoutParams1 = (StaggeredGridLayoutManager.LayoutParams)localLayoutParams;
    if (localLayoutParams1.e == null);
    for (int i1 = -1; ; i1 = localLayoutParams1.e.d)
    {
      paramf.b(n.a(i1, 1, -1, -1, false));
      return;
    }
  }

  public final void a(AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramAccessibilityEvent);
    w localw;
    View localView1;
    View localView2;
    if (p() > 0)
    {
      localw = android.support.v4.view.a.a.a(paramAccessibilityEvent);
      localView1 = a(false);
      localView2 = b(false);
      if ((localView1 != null) && (localView2 != null));
    }
    else
    {
      return;
    }
    int i1 = e(localView1);
    int i2 = e(localView2);
    if (i1 < i2)
    {
      localw.b(i1);
      localw.c(i2);
      return;
    }
    localw.b(i2);
    localw.c(i1);
  }

  public final void a(String paramString)
  {
    if (this.n == null)
      super.a(paramString);
  }

  public final boolean a(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof StaggeredGridLayoutManager.LayoutParams;
  }

  public final int b(int paramInt, ch paramch, cm paramcm)
  {
    return d(paramInt, paramch, paramcm);
  }

  public final int b(ch paramch, cm paramcm)
  {
    return super.b(paramch, paramcm);
  }

  public final int b(cm paramcm)
  {
    return g(paramcm);
  }

  public final void b(int paramInt1, int paramInt2)
  {
    b(paramInt1, paramInt2, 1);
  }

  public final void b(RecyclerView paramRecyclerView)
  {
    de localde = new de(this, paramRecyclerView.getContext());
    localde.b(0);
    a(localde);
  }

  public final int c(cm paramcm)
  {
    return h(paramcm);
  }

  public final void c(int paramInt)
  {
    if ((this.n != null) && (this.n.a != paramInt))
    {
      StaggeredGridLayoutManager.SavedState localSavedState = this.n;
      localSavedState.d = null;
      localSavedState.c = 0;
      localSavedState.a = -1;
      localSavedState.b = -1;
    }
    this.j = paramInt;
    this.k = -2147483648;
    n();
  }

  public final void c(int paramInt1, int paramInt2)
  {
    b(paramInt1, paramInt2, 2);
  }

  public final void c(ch paramch, cm paramcm)
  {
    b();
    df localdf = this.r;
    localdf.a = -1;
    localdf.b = false;
    label229: int i1;
    label247: int i7;
    label273: int i5;
    if (this.n != null)
    {
      if ((this.n.c > 0) && (this.n.c != 0))
      {
        StaggeredGridLayoutManager.SavedState localSavedState = this.n;
        localSavedState.d = null;
        localSavedState.c = 0;
        localSavedState.e = 0;
        localSavedState.f = null;
        localSavedState.g = null;
        this.n.a = this.n.b;
      }
      this.m = this.n.j;
      boolean bool2 = this.n.h;
      a(null);
      if ((this.n != null) && (this.n.h != bool2))
        this.n.h = bool2;
      this.h = bool2;
      n();
      c();
      if (this.n.a != -1)
      {
        this.j = this.n.a;
        localdf.b = this.n.i;
        if (this.n.e > 1)
        {
          null.d = this.n.f;
          null.e = this.n.g;
        }
        if ((!paramcm.a()) && (this.j != -1))
          break label575;
        i1 = 0;
        if (i1 == 0)
        {
          if (!this.l)
            break label973;
          int i6 = paramcm.e();
          i7 = -1 + p();
          if (i7 < 0)
            break label967;
          i5 = e(d(i7));
          if ((i5 < 0) || (i5 >= i6))
            break label961;
          label301: localdf.a = i5;
        }
        if ((this.n == null) && ((localdf.b != this.l) || (h() != this.m)))
          df.a();
        if ((p() > 0) && (this.n != null));
        a(paramch);
        this.c = (this.b.f() / 0);
        View.MeasureSpec.makeMeasureSpec(this.b.f(), 1073741824);
        this.p = View.MeasureSpec.makeMeasureSpec(this.c, 1073741824);
        this.o = View.MeasureSpec.makeMeasureSpec(0, 0);
        a(localdf.a, paramcm);
        if (!localdf.b)
          break label1030;
        a(-1);
        a(paramch, this.d, paramcm);
        a(1);
        this.d.b = (localdf.a + this.d.c);
        a(paramch, this.d, paramcm);
        label481: if (p() > 0)
        {
          if (!this.i)
            break label1084;
          a(paramch, paramcm, true);
          b(paramch, paramcm, false);
        }
      }
    }
    while (true)
    {
      if (!paramcm.a())
      {
        this.j = -1;
        this.k = -2147483648;
      }
      this.l = localdf.b;
      this.m = h();
      this.n = null;
      return;
      localdf.b = this.i;
      break;
      c();
      localdf.b = this.i;
      break label229;
      label575: if ((this.j < 0) || (this.j >= paramcm.e()))
      {
        this.j = -1;
        this.k = -2147483648;
        i1 = 0;
        break label247;
      }
      View localView;
      if ((this.n == null) || (this.n.a == -1) || (this.n.c <= 0))
      {
        localView = b(this.j);
        if (localView != null)
        {
          int i8;
          if (this.i)
          {
            i8 = i();
            label666: localdf.a = i8;
            if (this.k == -2147483648)
              break label742;
            if (!localdf.b)
              break label721;
            this.a.d();
            this.a.b(localView);
          }
          while (true)
          {
            i1 = 1;
            break;
            i8 = j();
            break label666;
            label721: this.a.c();
            this.a.a(localView);
          }
          label742: if (this.a.c(localView) > this.a.f())
            if (localdf.b)
              this.a.d();
        }
      }
      while (true)
      {
        i1 = 1;
        break;
        this.a.c();
        continue;
        if ((this.a.a(localView) - this.a.c() < 0) || (this.a.d() - this.a.b(localView) < 0))
          continue;
        continue;
        localdf.a = this.j;
        if (this.k == -2147483648)
        {
          if (h(localdf.a) == 1);
          for (boolean bool1 = true; ; bool1 = false)
          {
            localdf.b = bool1;
            if (!localdf.b)
              break label901;
            localdf.c.a.d();
            break;
          }
          label901: localdf.c.a.c();
          continue;
        }
        if (localdf.b)
        {
          localdf.c.a.d();
          continue;
        }
        localdf.c.a.c();
        continue;
        localdf.a = this.j;
      }
      label961: i7--;
      break label273;
      label967: i5 = 0;
      break label301;
      label973: int i2 = paramcm.e();
      int i3 = p();
      for (int i4 = 0; ; i4++)
      {
        if (i4 >= i3)
          break label1024;
        i5 = e(d(i4));
        if ((i5 >= 0) && (i5 < i2))
          break;
      }
      label1024: i5 = 0;
      break label301;
      label1030: a(1);
      a(paramch, this.d, paramcm);
      a(-1);
      this.d.b = (localdf.a + this.d.c);
      a(paramch, this.d, paramcm);
      break label481;
      label1084: b(paramch, paramcm, true);
      a(paramch, paramcm, false);
    }
  }

  public final int d(cm paramcm)
  {
    return h(paramcm);
  }

  public final void d(int paramInt1, int paramInt2)
  {
    b(paramInt1, paramInt2, 3);
  }

  public final boolean d()
  {
    return this.n == null;
  }

  public final int e(cm paramcm)
  {
    return i(paramcm);
  }

  public final Parcelable e()
  {
    if (this.n != null)
      return new StaggeredGridLayoutManager.SavedState(this.n);
    StaggeredGridLayoutManager.SavedState localSavedState = new StaggeredGridLayoutManager.SavedState();
    localSavedState.h = this.h;
    localSavedState.i = this.l;
    localSavedState.j = this.m;
    localSavedState.e = 0;
    int i1;
    View localView;
    label97: int i2;
    if (p() > 0)
    {
      b();
      if (this.l)
      {
        i1 = i();
        localSavedState.a = i1;
        if (!this.i)
          break label132;
        localView = b(true);
        if (localView != null)
          break label141;
        i2 = -1;
        label104: localSavedState.b = i2;
        localSavedState.c = 0;
        localSavedState.d = new int[0];
      }
    }
    while (true)
    {
      return localSavedState;
      i1 = j();
      break;
      label132: localView = a(true);
      break label97;
      label141: i2 = e(localView);
      break label104;
      localSavedState.a = -1;
      localSavedState.b = -1;
      localSavedState.c = 0;
    }
  }

  public final void e(int paramInt)
  {
    super.e(paramInt);
  }

  public final int f(cm paramcm)
  {
    return i(paramcm);
  }

  public final void f(int paramInt)
  {
    super.f(paramInt);
  }

  public final boolean f()
  {
    return true;
  }

  public final void g(int paramInt)
  {
    if (paramInt == 0)
      p();
  }

  public final boolean g()
  {
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.StaggeredGridLayoutManager
 * JD-Core Version:    0.6.0
 */