package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.a.w;
import android.support.v4.view.bg;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager extends ce
{
  int a;
  bs b;
  boolean c = false;
  LinearLayoutManager.SavedState d = null;
  private bc h;
  private boolean i = true;
  private int j = -1;
  private int k = -2147483648;
  private ba l = new ba(this);

  public LinearLayoutManager()
  {
    this(1);
  }

  public LinearLayoutManager(int paramInt)
  {
    a(paramInt);
    a(null);
  }

  private int a(int paramInt, ch paramch, cm paramcm, boolean paramBoolean)
  {
    int m = this.b.d() - paramInt;
    if (m > 0)
    {
      int n = -d(-m, paramch, paramcm);
      int i1 = paramInt + n;
      if (paramBoolean)
      {
        int i2 = this.b.d() - i1;
        if (i2 > 0)
        {
          this.b.a(i2);
          n += i2;
        }
      }
      return n;
    }
    return 0;
  }

  private int a(ch paramch, bc parambc, cm paramcm, boolean paramBoolean)
  {
    int m = parambc.c;
    if (parambc.g != -2147483648)
    {
      if (parambc.c < 0)
        parambc.g += parambc.c;
      a(paramch, parambc);
    }
    int n = parambc.c + parambc.h;
    bb localbb = new bb();
    do
    {
      if ((n <= 0) || (!parambc.a(paramcm)))
        break;
      localbb.a = 0;
      localbb.b = false;
      localbb.c = false;
      localbb.d = false;
      a(paramch, paramcm, parambc, localbb);
      if (localbb.b)
        break;
      parambc.b += localbb.a * parambc.f;
      if ((!localbb.c) || (this.h.j != null) || (!paramcm.a()))
      {
        parambc.c -= localbb.a;
        n -= localbb.a;
      }
      if (parambc.g == -2147483648)
        continue;
      parambc.g += localbb.a;
      if (parambc.c < 0)
        parambc.g += parambc.c;
      a(paramch, parambc);
    }
    while ((!paramBoolean) || (!localbb.d));
    return m - parambc.c;
  }

  private View a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    j();
    int m = this.b.c();
    int n = this.b.d();
    int i1;
    if (paramInt2 > paramInt1)
      i1 = 1;
    Object localObject1;
    Object localObject2;
    while (true)
    {
      localObject1 = null;
      if (paramInt1 == paramInt2)
        break;
      localObject2 = d(paramInt1);
      int i2 = this.b.a((View)localObject2);
      int i3 = this.b.b((View)localObject2);
      if ((i2 >= n) || (i3 <= m))
        break label133;
      if ((!paramBoolean1) || ((i2 >= m) && (i3 <= n)))
      {
        return localObject2;
        i1 = -1;
        continue;
      }
      if ((!paramBoolean2) || (localObject1 != null))
        break label133;
    }
    while (true)
    {
      paramInt1 += i1;
      localObject1 = localObject2;
      break;
      return localObject1;
      label133: localObject2 = localObject1;
    }
  }

  private View a(boolean paramBoolean)
  {
    if (this.c)
      return a(-1 + p(), -1, paramBoolean, true);
    return a(0, p(), paramBoolean, true);
  }

  private void a(int paramInt1, int paramInt2, boolean paramBoolean, cm paramcm)
  {
    int m = -1;
    int n = 1;
    this.h.h = g(paramcm);
    this.h.f = paramInt1;
    int i1;
    if (paramInt1 == n)
    {
      bc localbc4 = this.h;
      localbc4.h += this.b.g();
      View localView2 = y();
      bc localbc5 = this.h;
      if (this.c);
      while (true)
      {
        localbc5.e = m;
        this.h.d = (e(localView2) + this.h.e);
        this.h.b = this.b.b(localView2);
        i1 = this.b.b(localView2) - this.b.d();
        this.h.c = paramInt2;
        if (paramBoolean)
        {
          bc localbc3 = this.h;
          localbc3.c -= i1;
        }
        this.h.g = i1;
        return;
        m = n;
      }
    }
    View localView1 = c();
    bc localbc1 = this.h;
    localbc1.h += this.b.c();
    bc localbc2 = this.h;
    if (this.c);
    while (true)
    {
      localbc2.e = n;
      this.h.d = (e(localView1) + this.h.e);
      this.h.b = this.b.a(localView1);
      i1 = -this.b.a(localView1) + this.b.c();
      break;
      n = m;
    }
  }

  private void a(ba paramba)
  {
    g(paramba.a, paramba.b);
  }

  private void a(ch paramch, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2);
    while (true)
    {
      return;
      if (paramInt2 > paramInt1)
      {
        for (int m = paramInt2 - 1; m >= paramInt1; m--)
          a(m, paramch);
        continue;
      }
      while (paramInt1 > paramInt2)
      {
        a(paramInt1, paramch);
        paramInt1--;
      }
    }
  }

  private void a(ch paramch, bc parambc)
  {
    if (!parambc.a);
    while (true)
    {
      return;
      if (parambc.f == -1)
      {
        int i3 = parambc.g;
        int i4 = p();
        if (i3 < 0)
          continue;
        int i5 = this.b.e() - i3;
        if (this.c)
        {
          for (int i7 = 0; i7 < i4; i7++)
          {
            View localView4 = d(i7);
            if (this.b.a(localView4) >= i5)
              continue;
            a(paramch, 0, i7);
            return;
          }
          continue;
        }
        for (int i6 = i4 - 1; i6 >= 0; i6--)
        {
          View localView3 = d(i6);
          if (this.b.a(localView3) >= i5)
            continue;
          a(paramch, i4 - 1, i6);
          return;
        }
        continue;
      }
      int m = parambc.g;
      if (m < 0)
        continue;
      int n = p();
      if (this.c)
      {
        for (int i2 = n - 1; i2 >= 0; i2--)
        {
          View localView2 = d(i2);
          if (this.b.b(localView2) <= m)
            continue;
          a(paramch, n - 1, i2);
          return;
        }
        continue;
      }
      for (int i1 = 0; i1 < n; i1++)
      {
        View localView1 = d(i1);
        if (this.b.b(localView1) <= m)
          continue;
        a(paramch, 0, i1);
        return;
      }
    }
  }

  private int b(int paramInt, ch paramch, cm paramcm, boolean paramBoolean)
  {
    int m = paramInt - this.b.c();
    if (m > 0)
    {
      int n = -d(m, paramch, paramcm);
      int i1 = paramInt + n;
      if (paramBoolean)
      {
        int i2 = i1 - this.b.c();
        if (i2 > 0)
        {
          this.b.a(-i2);
          n -= i2;
        }
      }
      return n;
    }
    return 0;
  }

  private View b(boolean paramBoolean)
  {
    if (this.c)
      return a(0, p(), paramBoolean, true);
    return a(-1 + p(), -1, paramBoolean, true);
  }

  private void b()
  {
    int m = 1;
    if ((this.a == m) || (!i()))
      m = 0;
    this.c = m;
  }

  private void b(ba paramba)
  {
    h(paramba.a, paramba.b);
  }

  private View c()
  {
    if (this.c);
    for (int m = -1 + p(); ; m = 0)
      return d(m);
  }

  private int d(int paramInt, ch paramch, cm paramcm)
  {
    if ((p() == 0) || (paramInt == 0))
      return 0;
    this.h.a = true;
    j();
    if (paramInt > 0);
    int n;
    int i1;
    for (int m = 1; ; m = -1)
    {
      n = Math.abs(paramInt);
      a(m, n, true, paramcm);
      i1 = this.h.g + a(paramch, this.h, paramcm, false);
      if (i1 >= 0)
        break;
      return 0;
    }
    if (n > i1)
      paramInt = m * i1;
    this.b.a(-paramInt);
    this.h.i = paramInt;
    return paramInt;
  }

  private int g(cm paramcm)
  {
    if (paramcm.d())
      return this.b.f();
    return 0;
  }

  private void g(int paramInt1, int paramInt2)
  {
    this.h.c = (this.b.d() - paramInt2);
    bc localbc = this.h;
    if (this.c);
    for (int m = -1; ; m = 1)
    {
      localbc.e = m;
      this.h.d = paramInt1;
      this.h.f = 1;
      this.h.b = paramInt2;
      this.h.g = -2147483648;
      return;
    }
  }

  private int h(cm paramcm)
  {
    boolean bool1 = true;
    if (p() == 0)
      return 0;
    j();
    bs localbs = this.b;
    boolean bool2;
    View localView;
    if (!this.i)
    {
      bool2 = bool1;
      localView = a(bool2);
      if (this.i)
        break label73;
    }
    while (true)
    {
      return a.a(paramcm, localbs, localView, b(bool1), this, this.i, this.c);
      bool2 = false;
      break;
      label73: bool1 = false;
    }
  }

  private View h(int paramInt)
  {
    return a(0, p(), paramInt);
  }

  private void h(int paramInt1, int paramInt2)
  {
    this.h.c = (paramInt2 - this.b.c());
    this.h.d = paramInt1;
    bc localbc = this.h;
    if (this.c);
    for (int m = 1; ; m = -1)
    {
      localbc.e = m;
      this.h.f = -1;
      this.h.b = paramInt2;
      this.h.g = -2147483648;
      return;
    }
  }

  private int i(cm paramcm)
  {
    boolean bool1 = true;
    if (p() == 0)
      return 0;
    j();
    bs localbs = this.b;
    boolean bool2;
    View localView;
    if (!this.i)
    {
      bool2 = bool1;
      localView = a(bool2);
      if (this.i)
        break label69;
    }
    while (true)
    {
      return a.a(paramcm, localbs, localView, b(bool1), this, this.i);
      bool2 = false;
      break;
      label69: bool1 = false;
    }
  }

  private View i(int paramInt)
  {
    return a(-1 + p(), -1, paramInt);
  }

  private int j(cm paramcm)
  {
    boolean bool1 = true;
    if (p() == 0)
      return 0;
    j();
    bs localbs = this.b;
    boolean bool2;
    View localView;
    if (!this.i)
    {
      bool2 = bool1;
      localView = a(bool2);
      if (this.i)
        break label69;
    }
    while (true)
    {
      return a.b(paramcm, localbs, localView, b(bool1), this, this.i);
      bool2 = false;
      break;
      label69: bool1 = false;
    }
  }

  private View k(cm paramcm)
  {
    if (this.c)
      return h(paramcm.e());
    return i(paramcm.e());
  }

  private View l(cm paramcm)
  {
    if (this.c)
      return i(paramcm.e());
    return h(paramcm.e());
  }

  private View y()
  {
    if (this.c);
    for (int m = 0; ; m = -1 + p())
      return d(m);
  }

  public final int a(int paramInt, ch paramch, cm paramcm)
  {
    if (this.a == 1)
      return 0;
    return d(paramInt, paramch, paramcm);
  }

  public final int a(cm paramcm)
  {
    return h(paramcm);
  }

  public RecyclerView.LayoutParams a()
  {
    return new RecyclerView.LayoutParams();
  }

  View a(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = null;
    j();
    int m = this.b.c();
    int n = this.b.d();
    int i1;
    Object localObject2;
    label36: Object localObject3;
    Object localObject4;
    if (paramInt2 > paramInt1)
    {
      i1 = 1;
      localObject2 = null;
      if (paramInt1 == paramInt2)
        break label158;
      localObject3 = d(paramInt1);
      int i2 = e((View)localObject3);
      if ((i2 < 0) || (i2 >= paramInt3))
        break label173;
      if (!((RecyclerView.LayoutParams)((View)localObject3).getLayoutParams()).a.o())
        break label114;
      if (localObject2 != null)
        break label173;
      localObject4 = localObject1;
    }
    while (true)
    {
      paramInt1 += i1;
      localObject1 = localObject4;
      localObject2 = localObject3;
      break label36;
      i1 = -1;
      break;
      label114: if ((this.b.a((View)localObject3) >= n) || (this.b.b((View)localObject3) < m))
      {
        if (localObject1 != null)
          break label173;
        localObject4 = localObject3;
        localObject3 = localObject2;
        continue;
        if (localObject1 != null)
          localObject3 = localObject1;
      }
      else
      {
        return localObject3;
      }
      label158: return localObject2;
      label173: localObject4 = localObject1;
      localObject3 = localObject2;
    }
  }

  public void a(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1))
      throw new IllegalArgumentException("invalid orientation:" + paramInt);
    a(null);
    if (paramInt == this.a)
      return;
    this.a = paramInt;
    this.b = null;
    n();
  }

  public final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof LinearLayoutManager.SavedState))
    {
      this.d = ((LinearLayoutManager.SavedState)paramParcelable);
      n();
    }
  }

  public final void a(RecyclerView paramRecyclerView, ch paramch)
  {
    super.a(paramRecyclerView, paramch);
  }

  void a(ch paramch, cm paramcm, bc parambc, bb parambb)
  {
    View localView = parambc.a(paramch);
    if (localView == null)
    {
      parambb.b = true;
      return;
    }
    RecyclerView.LayoutParams localLayoutParams1 = (RecyclerView.LayoutParams)localView.getLayoutParams();
    int i7;
    int i6;
    label263: int i2;
    int i4;
    int i5;
    int i3;
    if (parambc.j == null)
    {
      boolean bool3 = this.c;
      int i11 = parambc.f;
      boolean bool4 = false;
      if (i11 == -1)
        bool4 = true;
      if (bool3 == bool4)
      {
        c(localView);
        RecyclerView.LayoutParams localLayoutParams2 = (RecyclerView.LayoutParams)localView.getLayoutParams();
        Rect localRect = this.f.e(localView);
        int n = 0 + (localRect.left + localRect.right);
        int i1 = 0 + (localRect.top + localRect.bottom);
        localView.measure(ce.a(q(), n + (s() + u() + localLayoutParams2.leftMargin + localLayoutParams2.rightMargin), localLayoutParams2.width, f()), ce.a(r(), i1 + (t() + v() + localLayoutParams2.topMargin + localLayoutParams2.bottomMargin), localLayoutParams2.height, g()));
        parambb.a = this.b.c(localView);
        if (this.a != 1)
          break label495;
        if (!i())
          break label435;
        i7 = q() - u();
        i6 = i7 - this.b.d(localView);
        if (parambc.f != -1)
          break label458;
        int i10 = parambc.b;
        i2 = parambc.b - parambb.a;
        i4 = i6;
        i5 = i7;
        i3 = i10;
      }
    }
    while (true)
    {
      a(localView, i4 + localLayoutParams1.leftMargin, i2 + localLayoutParams1.topMargin, i5 - localLayoutParams1.rightMargin, i3 - localLayoutParams1.bottomMargin);
      if ((localLayoutParams1.a.o()) || (localLayoutParams1.a.m()))
        parambb.c = true;
      parambb.d = localView.isFocusable();
      return;
      d(localView);
      break;
      boolean bool1 = this.c;
      int m = parambc.f;
      boolean bool2 = false;
      if (m == -1)
        bool2 = true;
      if (bool1 == bool2)
      {
        a(localView);
        break;
      }
      b(localView);
      break;
      label435: i6 = s();
      i7 = i6 + this.b.d(localView);
      break label263;
      label458: int i8 = parambc.b;
      int i9 = parambc.b + parambb.a;
      i2 = i8;
      i4 = i6;
      i5 = i7;
      i3 = i9;
      continue;
      label495: i2 = t();
      i3 = i2 + this.b.d(localView);
      if (parambc.f == -1)
      {
        i5 = parambc.b;
        i4 = parambc.b - parambb.a;
        continue;
      }
      i4 = parambc.b;
      i5 = parambc.b + parambb.a;
    }
  }

  void a(cm paramcm, ba paramba)
  {
  }

  public final void a(AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramAccessibilityEvent);
    if (p() > 0)
    {
      w localw = android.support.v4.view.a.a.a(paramAccessibilityEvent);
      localw.b(k());
      localw.c(l());
    }
  }

  public final void a(String paramString)
  {
    if (this.d == null)
      super.a(paramString);
  }

  public final int b(int paramInt, ch paramch, cm paramcm)
  {
    if (this.a == 0)
      return 0;
    return d(paramInt, paramch, paramcm);
  }

  public int b(cm paramcm)
  {
    return h(paramcm);
  }

  public final View b(int paramInt)
  {
    int m = p();
    View localView;
    if (m == 0)
      localView = null;
    do
    {
      return localView;
      int n = paramInt - e(d(0));
      if ((n < 0) || (n >= m))
        break;
      localView = d(n);
    }
    while (e(localView) == paramInt);
    return super.b(paramInt);
  }

  public final void b(RecyclerView paramRecyclerView)
  {
    az localaz = new az(this, paramRecyclerView.getContext());
    localaz.b(0);
    a(localaz);
  }

  public final int c(cm paramcm)
  {
    return i(paramcm);
  }

  public final View c(int paramInt, ch paramch, cm paramcm)
  {
    b();
    if (p() == 0);
    int m;
    label76: View localView1;
    while (true)
    {
      return null;
      switch (paramInt)
      {
      default:
        m = -2147483648;
        if (m == -2147483648)
          continue;
        j();
        if (m == -1)
        {
          localView1 = l(paramcm);
          label100: if (localView1 == null)
            continue;
          j();
          a(m, (int)(0.33F * this.b.f()), false, paramcm);
          this.h.g = -2147483648;
          this.h.a = false;
          a(paramch, this.h, paramcm, true);
          if (m != -1)
            break label293;
        }
      case 1:
      case 2:
      case 33:
      case 130:
      case 17:
      case 66:
      }
    }
    label293: for (View localView2 = c(); (localView2 != localView1) && (localView2.isFocusable()); localView2 = y())
    {
      return localView2;
      m = -1;
      break label76;
      m = 1;
      break label76;
      if (this.a == 1)
      {
        m = -1;
        break label76;
      }
      m = -2147483648;
      break label76;
      if (this.a == 1)
      {
        m = 1;
        break label76;
      }
      m = -2147483648;
      break label76;
      if (this.a == 0)
      {
        m = -1;
        break label76;
      }
      m = -2147483648;
      break label76;
      if (this.a == 0)
      {
        m = 1;
        break label76;
      }
      m = -2147483648;
      break label76;
      localView1 = k(paramcm);
      break label100;
    }
  }

  public final void c(int paramInt)
  {
    this.j = paramInt;
    this.k = -2147483648;
    if (this.d != null)
      this.d.a = -1;
    n();
  }

  public void c(ch paramch, cm paramcm)
  {
    if ((this.d != null) && (this.d.a()))
      this.j = this.d.a;
    j();
    this.h.a = false;
    b();
    ba localba1 = this.l;
    localba1.a = -1;
    localba1.b = -2147483648;
    localba1.c = false;
    this.l.c = (false ^ this.c);
    ba localba2 = this.l;
    int m;
    Object localObject;
    label124: int i41;
    label179: int i42;
    label209: int i38;
    label212: int n;
    int i1;
    label248: int i2;
    int i3;
    View localView1;
    int i37;
    label342: label354: int i31;
    int i33;
    if ((paramcm.a()) || (this.j == -1))
    {
      m = 0;
      if (m == 0)
      {
        if (p() == 0)
          break label1647;
        if (this.f != null)
          break label1151;
        localObject = null;
        if (localObject == null)
          break label1502;
        RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)((View)localObject).getLayoutParams();
        if ((localLayoutParams.a.o()) || (localLayoutParams.a.d() < 0) || (localLayoutParams.a.d() >= paramcm.e()))
          break label1190;
        i41 = 1;
        if (i41 == 0)
          break label1502;
        i42 = localba2.d.b.b();
        if (i42 < 0)
          break label1196;
        localba2.a((View)localObject);
        i38 = 1;
        if (i38 == 0)
        {
          localba2.a();
          localba2.a = 0;
        }
      }
      n = g(paramcm);
      if (this.h.i < 0)
        break label1653;
      i1 = 0;
      i2 = i1 + this.b.c();
      i3 = n + this.b.g();
      if ((paramcm.a()) && (this.j != -1) && (this.k != -2147483648))
      {
        localView1 = b(this.j);
        if (localView1 != null)
        {
          if (!this.c)
            break label1663;
          i37 = this.b.d() - this.b.b(localView1) - this.k;
          if (i37 <= 0)
            break label1694;
          i2 += i37;
        }
      }
      a(paramcm, this.l);
      a(paramch);
      if (!this.l.c)
        break label1704;
      b(this.l);
      this.h.h = i2;
      a(paramch, this.h, paramcm, false);
      i31 = this.h.b;
      int i32 = this.h.d;
      if (this.h.c > 0)
        i3 += this.h.c;
      a(this.l);
      this.h.h = i3;
      bc localbc2 = this.h;
      localbc2.d += this.h.e;
      a(paramch, this.h, paramcm, false);
      i33 = this.h.b;
      if (this.h.c <= 0)
        break label2273;
      int i35 = this.h.c;
      h(i32, i31);
      this.h.h = i35;
      a(paramch, this.h, paramcm, false);
    }
    label574: label1089: label1502: label2273: for (int i34 = this.h.b; ; i34 = i31)
    {
      int i6 = i34;
      int i4 = i33;
      int i8;
      int i9;
      if (p() > 0)
        if ((false ^ this.c))
        {
          int i25 = a(i4, paramch, paramcm, true);
          int i26 = i6 + i25;
          int i27 = i4 + i25;
          int i28 = b(i26, paramch, paramcm, false);
          int i29 = i26 + i28;
          int i30 = i27 + i28;
          i8 = i29;
          i9 = i30;
        }
      while (true)
      {
        if ((!paramcm.b()) || (p() == 0) || (paramcm.a()) || (!d()))
        {
          if (!paramcm.a())
          {
            this.j = -1;
            this.k = -2147483648;
            this.b.a();
          }
          this.d = null;
          return;
          if ((this.j < 0) || (this.j >= paramcm.e()))
          {
            this.j = -1;
            this.k = -2147483648;
            m = 0;
            break;
          }
          localba2.a = this.j;
          if ((this.d != null) && (this.d.a()))
          {
            localba2.c = this.d.c;
            if (localba2.c);
            for (localba2.b = (this.b.d() - this.d.b); ; localba2.b = (this.b.c() + this.d.b))
            {
              m = 1;
              break;
            }
          }
          View localView4;
          if (this.k == -2147483648)
          {
            localView4 = b(this.j);
            if (localView4 != null)
              if (this.b.c(localView4) > this.b.f())
                localba2.a();
          }
          while (true)
          {
            m = 1;
            break;
            if (this.b.a(localView4) - this.b.c() < 0)
            {
              localba2.b = this.b.c();
              localba2.c = false;
              continue;
            }
            if (this.b.d() - this.b.b(localView4) < 0)
            {
              localba2.b = this.b.d();
              localba2.c = true;
              continue;
            }
            if (localba2.c);
            for (int i55 = this.b.b(localView4) + this.b.b(); ; i55 = this.b.a(localView4))
            {
              localba2.b = i55;
              m = 1;
              break;
            }
            int i54;
            if (p() > 0)
            {
              int i53 = e(d(0));
              if (this.j >= i53)
                break label1083;
              i54 = 1;
              if (i54 != this.c)
                break label1089;
            }
            for (boolean bool = true; ; bool = false)
            {
              localba2.c = bool;
              localba2.a();
              break;
              i54 = 0;
              break label1056;
            }
            localba2.c = this.c;
            if (this.c)
            {
              localba2.b = (this.b.d() - this.k);
              continue;
            }
            localba2.b = (this.b.c() + this.k);
          }
          label1151: View localView2 = this.f.getFocusedChild();
          if ((localView2 == null) || (this.e.b(localView2)))
          {
            localObject = null;
            break label124;
          }
          localObject = localView2;
          break label124;
          i41 = 0;
          break label179;
          localba2.a = e((View)localObject);
          if (localba2.c)
          {
            int i48 = localba2.d.b.d() - i42 - localba2.d.b.b((View)localObject);
            localba2.b = (localba2.d.b.d() - i48);
            if (i48 <= 0)
              break label209;
            int i49 = localba2.d.b.c((View)localObject);
            int i50 = localba2.b - i49;
            int i51 = localba2.d.b.c();
            int i52 = i50 - (i51 + Math.min(localba2.d.b.a((View)localObject) - i51, 0));
            if (i52 >= 0)
              break label209;
            localba2.b += Math.min(i48, -i52);
            break label209;
          }
          int i43 = localba2.d.b.a((View)localObject);
          int i44 = i43 - localba2.d.b.c();
          localba2.b = i43;
          if (i44 <= 0)
            break label209;
          int i45 = i43 + localba2.d.b.c((View)localObject);
          int i46 = localba2.d.b.d() - i42 - localba2.d.b.b((View)localObject);
          int i47 = localba2.d.b.d() - Math.min(0, i46) - i45;
          if (i47 >= 0)
            break label209;
          localba2.b -= Math.min(i44, -i47);
          break label209;
          View localView3;
          label1517: int i39;
          if (localba2.c)
          {
            localView3 = k(paramcm);
            if (localView3 == null)
              break label1647;
            localba2.a(localView3);
            if ((!paramcm.a()) && (d()))
            {
              if ((this.b.a(localView3) < this.b.d()) && (this.b.b(localView3) >= this.b.c()))
                break label1629;
              i39 = 1;
              if (i39 != 0)
                if (!localba2.c)
                  break label1635;
            }
          }
          label1635: for (int i40 = this.b.d(); ; i40 = this.b.c())
          {
            localba2.b = i40;
            i38 = 1;
            break;
            localView3 = l(paramcm);
            break label1517;
            i39 = 0;
            break label1584;
          }
          label1647: i38 = 0;
          break label212;
          label1653: i1 = n;
          n = 0;
          break label248;
          label1663: int i36 = this.b.a(localView1) - this.b.c();
          i37 = this.k - i36;
          break label342;
          i3 -= i37;
          break label354;
          a(this.l);
          this.h.h = i3;
          a(paramch, this.h, paramcm, false);
          i4 = this.h.b;
          int i5 = this.h.d;
          if (this.h.c > 0)
            i2 += this.h.c;
          b(this.l);
          this.h.h = i2;
          bc localbc1 = this.h;
          localbc1.d += this.h.e;
          a(paramch, this.h, paramcm, false);
          i6 = this.h.b;
          if (this.h.c <= 0)
            break label574;
          int i7 = this.h.c;
          g(i5, i4);
          this.h.h = i7;
          a(paramch, this.h, paramcm, false);
          i4 = this.h.b;
          break label574;
          int i19 = b(i6, paramch, paramcm, true);
          int i20 = i6 + i19;
          int i21 = i4 + i19;
          int i22 = a(i21, paramch, paramcm, false);
          int i23 = i20 + i22;
          int i24 = i21 + i22;
          i8 = i23;
          i9 = i24;
          continue;
        }
        int i10 = 0;
        int i11 = 0;
        List localList = paramch.b();
        int i12 = localList.size();
        int i13 = e(d(0));
        int i14 = 0;
        co localco;
        int i17;
        label2032: int i18;
        label2044: int i16;
        int i15;
        if (i14 < i12)
        {
          localco = (co)localList.get(i14);
          if (localco.o())
            break label2251;
          if (localco.d() < i13)
          {
            i17 = 1;
            if (i17 == this.c)
              break label2091;
            i18 = -1;
            if (i18 != -1)
              break label2097;
            i16 = i10 + this.b.c(localco.a);
            i15 = i11;
          }
        }
        while (true)
        {
          i14++;
          i10 = i16;
          i11 = i15;
          break label1990;
          i17 = 0;
          break label2032;
          i18 = 1;
          break label2044;
          i15 = i11 + this.b.c(localco.a);
          i16 = i10;
          continue;
          this.h.j = localList;
          if (i10 > 0)
          {
            h(e(c()), i8);
            this.h.h = i10;
            this.h.c = 0;
            this.h.a(null);
            a(paramch, this.h, paramcm, false);
          }
          if (i11 > 0)
          {
            g(e(y()), i9);
            this.h.h = i11;
            this.h.c = 0;
            this.h.a(null);
            a(paramch, this.h, paramcm, false);
          }
          this.h.j = null;
          break;
          i15 = i11;
          i16 = i10;
        }
        i8 = i6;
        i9 = i4;
      }
    }
  }

  public int d(cm paramcm)
  {
    return i(paramcm);
  }

  public boolean d()
  {
    return this.d == null;
  }

  public final int e(cm paramcm)
  {
    return j(paramcm);
  }

  public final Parcelable e()
  {
    if (this.d != null)
      return new LinearLayoutManager.SavedState(this.d);
    LinearLayoutManager.SavedState localSavedState = new LinearLayoutManager.SavedState();
    if (p() > 0)
    {
      j();
      boolean bool = false ^ this.c;
      localSavedState.c = bool;
      if (bool)
      {
        View localView2 = y();
        localSavedState.b = (this.b.d() - this.b.b(localView2));
        localSavedState.a = e(localView2);
        return localSavedState;
      }
      View localView1 = c();
      localSavedState.a = e(localView1);
      localSavedState.b = (this.b.a(localView1) - this.b.c());
      return localSavedState;
    }
    localSavedState.a = -1;
    return localSavedState;
  }

  public final void e(int paramInt1, int paramInt2)
  {
    this.j = paramInt1;
    this.k = paramInt2;
    if (this.d != null)
      this.d.a = -1;
    n();
  }

  public int f(cm paramcm)
  {
    return j(paramcm);
  }

  public final boolean f()
  {
    return this.a == 0;
  }

  public final boolean g()
  {
    return this.a == 1;
  }

  public final int h()
  {
    return this.a;
  }

  protected final boolean i()
  {
    return bg.h(this.f) == 1;
  }

  final void j()
  {
    if (this.h == null)
      this.h = new bc();
    if (this.b == null)
      this.b = bs.a(this, this.a);
  }

  public final int k()
  {
    View localView = a(0, p(), false, true);
    if (localView == null)
      return -1;
    return e(localView);
  }

  public final int l()
  {
    View localView = a(-1 + p(), -1, false, true);
    if (localView == null)
      return -1;
    return e(localView);
  }

  public final int m()
  {
    View localView = a(-1 + p(), -1, true, false);
    if (localView == null)
      return -1;
    return e(localView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.LinearLayoutManager
 * JD-Core Version:    0.6.0
 */