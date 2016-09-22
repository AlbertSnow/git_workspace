package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.a.f;
import android.support.v4.view.a.n;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager
{
  private static int h = View.MeasureSpec.makeMeasureSpec(0, 0);
  private boolean i = false;
  private int j = -1;
  private int[] k;
  private View[] l;
  private SparseIntArray m = new SparseIntArray();
  private SparseIntArray n = new SparseIntArray();
  private ax o = new aw();
  private Rect p = new Rect();

  public GridLayoutManager(int paramInt)
  {
    if (paramInt != this.j)
    {
      this.i = true;
      if (paramInt <= 0)
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + paramInt);
      this.j = paramInt;
      this.o.a.clear();
    }
  }

  private int a(ch paramch, cm paramcm, int paramInt)
  {
    if (!paramcm.a())
      return this.o.b(paramInt, this.j);
    int i1 = paramch.b(paramInt);
    if (i1 == -1)
      return 0;
    return this.o.b(i1, this.j);
  }

  private void a(ch paramch, cm paramcm, int paramInt, boolean paramBoolean)
  {
    int i2;
    int i1;
    int i3;
    int i5;
    int i4;
    label45: GridLayoutManager.LayoutParams localLayoutParams;
    if (paramBoolean)
    {
      i2 = 1;
      i1 = 0;
      if ((this.a != 1) || (!i()))
        break label154;
      int i6 = -1 + this.j;
      i3 = -1;
      i5 = i6;
      i4 = i1;
      if (i4 == paramInt)
        return;
      View localView = this.l[i4];
      localLayoutParams = (GridLayoutManager.LayoutParams)localView.getLayoutParams();
      GridLayoutManager.LayoutParams.a(localLayoutParams, b(paramch, paramcm, e(localView)));
      if ((i3 != -1) || (GridLayoutManager.LayoutParams.b(localLayoutParams) <= 1))
        break label167;
      GridLayoutManager.LayoutParams.b(localLayoutParams, i5 - (-1 + GridLayoutManager.LayoutParams.b(localLayoutParams)));
    }
    while (true)
    {
      i5 += i3 * GridLayoutManager.LayoutParams.b(localLayoutParams);
      i4 += i2;
      break label45;
      i1 = paramInt - 1;
      i2 = -1;
      paramInt = -1;
      break;
      label154: i3 = 1;
      i4 = i1;
      i5 = 0;
      break label45;
      label167: GridLayoutManager.LayoutParams.b(localLayoutParams, i5);
    }
  }

  private void a(View paramView, int paramInt1, int paramInt2)
  {
    a(paramView, this.p);
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    paramView.measure(b(paramInt1, localLayoutParams.leftMargin + this.p.left, localLayoutParams.rightMargin + this.p.right), b(paramInt2, localLayoutParams.topMargin + this.p.top, localLayoutParams.bottomMargin + this.p.bottom));
  }

  private static int b(int paramInt1, int paramInt2, int paramInt3)
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

  private int b(ch paramch, cm paramcm, int paramInt)
  {
    int i1;
    if (!paramcm.a())
      i1 = this.o.a(paramInt);
    do
    {
      return i1;
      i1 = this.m.get(paramInt, -1);
    }
    while (i1 != -1);
    int i2 = paramch.b(paramInt);
    if (i2 == -1)
      return 1;
    return this.o.a(i2);
  }

  private static int h(int paramInt)
  {
    if (paramInt < 0)
      return h;
    return View.MeasureSpec.makeMeasureSpec(paramInt, 1073741824);
  }

  public final int a(ch paramch, cm paramcm)
  {
    if (this.a == 0)
      return this.j;
    if (paramcm.e() <= 0)
      return 0;
    return a(paramch, paramcm, -1 + paramcm.e());
  }

  public final RecyclerView.LayoutParams a()
  {
    return new GridLayoutManager.LayoutParams();
  }

  public final RecyclerView.LayoutParams a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new GridLayoutManager.LayoutParams(paramContext, paramAttributeSet);
  }

  public final RecyclerView.LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new GridLayoutManager.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new GridLayoutManager.LayoutParams(paramLayoutParams);
  }

  final View a(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = null;
    j();
    int i1 = this.b.c();
    int i2 = this.b.d();
    int i3;
    Object localObject2;
    label36: Object localObject3;
    Object localObject4;
    if (paramInt2 > paramInt1)
    {
      i3 = 1;
      localObject2 = null;
      if (paramInt1 == paramInt2)
        break label174;
      localObject3 = d(paramInt1);
      int i4 = e((View)localObject3);
      if ((i4 < 0) || (i4 >= paramInt3) || (this.o.a(i4, this.j) != 0))
        break label189;
      if (!((RecyclerView.LayoutParams)((View)localObject3).getLayoutParams()).a.o())
        break label130;
      if (localObject2 != null)
        break label189;
      localObject4 = localObject1;
    }
    while (true)
    {
      paramInt1 += i3;
      localObject1 = localObject4;
      localObject2 = localObject3;
      break label36;
      i3 = -1;
      break;
      label130: if ((this.b.a((View)localObject3) >= i2) || (this.b.b((View)localObject3) < i1))
      {
        if (localObject1 != null)
          break label189;
        localObject4 = localObject3;
        localObject3 = localObject2;
        continue;
        label174: if (localObject1 != null)
          localObject3 = localObject1;
      }
      else
      {
        return localObject3;
      }
      return localObject2;
      label189: localObject4 = localObject1;
      localObject3 = localObject2;
    }
  }

  public final void a(int paramInt1, int paramInt2)
  {
    this.o.a.clear();
  }

  public final void a(RecyclerView paramRecyclerView)
  {
    this.o.a.clear();
  }

  public final void a(ax paramax)
  {
    this.o = paramax;
  }

  final void a(ch paramch, cm paramcm, bc parambc, bb parambb)
  {
    boolean bool;
    int i1;
    int i2;
    int i23;
    int i24;
    if (parambc.e == 1)
    {
      bool = true;
      i1 = this.j;
      i2 = 0;
      if (!bool)
      {
        i23 = parambc.d;
        if (paramcm.a())
          break label173;
        i24 = this.o.a(i23, this.j);
        label53: i1 = i24 + b(paramch, paramcm, parambc.d);
      }
    }
    while (true)
    {
      if ((i2 >= this.j) || (!parambc.a(paramcm)) || (i1 <= 0))
        break label268;
      int i21 = parambc.d;
      int i22 = b(paramch, paramcm, i21);
      if (i22 > this.j)
      {
        throw new IllegalArgumentException("Item at position " + i21 + " requires " + i22 + " spans but GridLayoutManager has only " + this.j + " spans.");
        bool = false;
        break;
        label173: i24 = this.n.get(i23, -1);
        if (i24 != -1)
          break label53;
        int i25 = paramch.b(i23);
        if (i25 == -1)
        {
          i24 = 0;
          break label53;
        }
        i24 = this.o.a(i25, this.j);
        break label53;
      }
      i1 -= i22;
      if (i1 < 0)
        break label268;
      View localView4 = parambc.a(paramch);
      if (localView4 == null)
        break label268;
      this.l[i2] = localView4;
      i2++;
    }
    label268: if (i2 == 0)
    {
      parambb.b = true;
      return;
    }
    int i3 = 0;
    a(paramch, paramcm, i2, bool);
    int i4 = 0;
    View localView3;
    label330: GridLayoutManager.LayoutParams localLayoutParams3;
    int i19;
    label398: int i20;
    if (i4 < i2)
    {
      localView3 = this.l[i4];
      if (parambc.j == null)
        if (bool)
        {
          c(localView3);
          localLayoutParams3 = (GridLayoutManager.LayoutParams)localView3.getLayoutParams();
          i19 = View.MeasureSpec.makeMeasureSpec(this.k[(GridLayoutManager.LayoutParams.a(localLayoutParams3) + GridLayoutManager.LayoutParams.b(localLayoutParams3))] - this.k[GridLayoutManager.LayoutParams.a(localLayoutParams3)], 1073741824);
          if (this.a != 1)
            break label458;
          a(localView3, i19, h(localLayoutParams3.height));
          i20 = this.b.c(localView3);
          if (i20 <= i3)
            break label936;
        }
    }
    while (true)
    {
      i4++;
      i3 = i20;
      break;
      d(localView3);
      break label330;
      if (bool)
      {
        a(localView3);
        break label330;
      }
      b(localView3);
      break label330;
      label458: a(localView3, h(localLayoutParams3.width), i19);
      break label398;
      int i5 = h(i3);
      int i6 = 0;
      if (i6 < i2)
      {
        View localView2 = this.l[i6];
        int i18;
        if (this.b.c(localView2) != i3)
        {
          GridLayoutManager.LayoutParams localLayoutParams2 = (GridLayoutManager.LayoutParams)localView2.getLayoutParams();
          i18 = View.MeasureSpec.makeMeasureSpec(this.k[(GridLayoutManager.LayoutParams.a(localLayoutParams2) + GridLayoutManager.LayoutParams.b(localLayoutParams2))] - this.k[GridLayoutManager.LayoutParams.a(localLayoutParams2)], 1073741824);
          if (this.a != 1)
            break label585;
          a(localView2, i18, i5);
        }
        while (true)
        {
          i6++;
          break;
          label585: a(localView2, i5, i18);
        }
      }
      parambb.a = i3;
      int i7 = 0;
      int i9;
      int i10;
      int i8;
      int i11;
      int i12;
      int i13;
      int i14;
      int i15;
      label659: View localView1;
      GridLayoutManager.LayoutParams localLayoutParams1;
      if (this.a == 1)
        if (parambc.f == -1)
        {
          i9 = parambc.b;
          i10 = i9 - i3;
          i8 = 0;
          i11 = 0;
          i12 = i8;
          i13 = i10;
          i14 = i9;
          i15 = i7;
          if (i11 >= i2)
            break label927;
          localView1 = this.l[i11];
          localLayoutParams1 = (GridLayoutManager.LayoutParams)localView1.getLayoutParams();
          if (this.a != 1)
            break label893;
          i15 = s() + this.k[GridLayoutManager.LayoutParams.a(localLayoutParams1)];
          i12 = i15 + this.b.d(localView1);
        }
      while (true)
      {
        a(localView1, i15 + localLayoutParams1.leftMargin, i13 + localLayoutParams1.topMargin, i12 - localLayoutParams1.rightMargin, i14 - localLayoutParams1.bottomMargin);
        if ((localLayoutParams1.a.o()) || (localLayoutParams1.a.m()))
          parambb.c = true;
        parambb.d |= localView1.isFocusable();
        i11++;
        break label659;
        int i17 = parambc.b;
        i9 = i17 + i3;
        i10 = i17;
        i7 = 0;
        i8 = 0;
        break;
        if (parambc.f == -1)
        {
          int i16 = parambc.b;
          i7 = i16 - i3;
          i8 = i16;
          i9 = 0;
          i10 = 0;
          break;
        }
        i7 = parambc.b;
        i8 = i3 + i7;
        i9 = 0;
        i10 = 0;
        break;
        label893: i13 = t() + this.k[GridLayoutManager.LayoutParams.a(localLayoutParams1)];
        i14 = i13 + this.b.d(localView1);
      }
      label927: Arrays.fill(this.l, null);
      return;
      label936: i20 = i3;
    }
  }

  public final void a(ch paramch, cm paramcm, View paramView, f paramf)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (!(localLayoutParams instanceof GridLayoutManager.LayoutParams))
    {
      super.a(paramView, paramf);
      return;
    }
    GridLayoutManager.LayoutParams localLayoutParams1 = (GridLayoutManager.LayoutParams)localLayoutParams;
    int i1 = a(paramch, paramcm, localLayoutParams1.a.d());
    if (this.a == 0)
    {
      int i7 = localLayoutParams1.a();
      int i8 = localLayoutParams1.b();
      if ((this.j > 1) && (localLayoutParams1.b() == this.j));
      for (boolean bool2 = true; ; bool2 = false)
      {
        paramf.b(n.a(i7, i8, i1, 1, bool2));
        return;
      }
    }
    int i2 = localLayoutParams1.a();
    int i3 = localLayoutParams1.b();
    int i4 = this.j;
    boolean bool1 = false;
    if (i4 > 1)
    {
      int i5 = localLayoutParams1.b();
      int i6 = this.j;
      bool1 = false;
      if (i5 == i6)
        bool1 = true;
    }
    paramf.b(n.a(i1, 1, i2, i3, bool1));
  }

  final void a(cm paramcm, ba paramba)
  {
    int i1 = 0;
    super.a(paramcm, paramba);
    int i2;
    int i3;
    int i5;
    int i6;
    label113: int i8;
    int i10;
    if (this.a == 1)
    {
      i2 = q() - u() - s();
      if ((this.k == null) || (this.k.length != 1 + this.j) || (this.k[(-1 + this.k.length)] != i2))
        this.k = new int[1 + this.j];
      this.k[0] = 0;
      i3 = i2 / this.j;
      int i4 = i2 % this.j;
      i5 = 1;
      i6 = 0;
      if (i5 > this.j)
        break label203;
      i8 = i6 + i4;
      if ((i8 <= 0) || (this.j - i8 >= i4))
        break label307;
      i10 = i3 + 1;
      i6 = i8 - this.j;
    }
    for (int i9 = i10; ; i9 = i3)
    {
      i1 += i9;
      this.k[i5] = i1;
      i5++;
      break label113;
      i2 = r() - v() - t();
      break;
      label203: if ((paramcm.e() > 0) && (!paramcm.a()))
        for (int i7 = this.o.a(paramba.a, this.j); (i7 > 0) && (paramba.a > 0); i7 = this.o.a(paramba.a, this.j))
          paramba.a = (-1 + paramba.a);
      if ((this.l == null) || (this.l.length != this.j))
        this.l = new View[this.j];
      return;
      label307: i6 = i8;
    }
  }

  public final boolean a(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof GridLayoutManager.LayoutParams;
  }

  public final int b(ch paramch, cm paramcm)
  {
    if (this.a == 1)
      return this.j;
    if (paramcm.e() <= 0)
      return 0;
    return a(paramch, paramcm, -1 + paramcm.e());
  }

  public final ax b()
  {
    return this.o;
  }

  public final void b(int paramInt1, int paramInt2)
  {
    this.o.a.clear();
  }

  public final int c()
  {
    return this.j;
  }

  public final void c(int paramInt1, int paramInt2)
  {
    this.o.a.clear();
  }

  public final void c(ch paramch, cm paramcm)
  {
    if (paramcm.a())
    {
      int i1 = p();
      for (int i2 = 0; i2 < i1; i2++)
      {
        GridLayoutManager.LayoutParams localLayoutParams = (GridLayoutManager.LayoutParams)d(i2).getLayoutParams();
        int i3 = localLayoutParams.a.d();
        this.m.put(i3, localLayoutParams.b());
        this.n.put(i3, localLayoutParams.a());
      }
    }
    super.c(paramch, paramcm);
    this.m.clear();
    this.n.clear();
    if (!paramcm.a())
      this.i = false;
  }

  public final void d(int paramInt1, int paramInt2)
  {
    this.o.a.clear();
  }

  public final boolean d()
  {
    return (this.d == null) && (!this.i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.GridLayoutManager
 * JD-Core Version:    0.6.0
 */