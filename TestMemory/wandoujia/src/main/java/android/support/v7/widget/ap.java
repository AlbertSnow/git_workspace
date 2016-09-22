package android.support.v7.widget;

import android.util.Printer;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class ap
{
  public final boolean a;
  public int b = -2147483648;
  private int c = -2147483648;
  private au<av, ar> d;
  private boolean e = false;
  private au<as, at> f;
  private boolean g = false;
  private au<as, at> h;
  private boolean i = false;
  private int[] j;
  private boolean k = false;
  private int[] l;
  private boolean m = false;
  private ao[] n;
  private boolean o = false;
  private int[] p;
  private boolean q = false;
  private boolean r;
  private boolean s = false;
  private int[] t;
  private boolean u = true;
  private at v = new at(0);
  private at w = new at(-100000);

  static
  {
    if (!GridLayout.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      x = bool;
      return;
    }
  }

  private ap(GridLayout paramGridLayout, boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  private void a(int paramInt, float paramFloat)
  {
    Arrays.fill(this.t, 0);
    int i1 = this.y.getChildCount();
    int i2 = 0;
    float f1 = paramFloat;
    int i3 = paramInt;
    GridLayout.LayoutParams localLayoutParams;
    av localav;
    label73: int i6;
    float f2;
    if (i2 < i1)
    {
      View localView = this.y.getChildAt(i2);
      if (localView.getVisibility() == 8)
        break label153;
      localLayoutParams = GridLayout.a(localView);
      if (this.a)
      {
        localav = localLayoutParams.b;
        float f3 = localav.e;
        if (f3 == 0.0F)
          break label153;
        int i5 = Math.round(f3 * i3 / f1);
        this.t[i2] = i5;
        i6 = i3 - i5;
        f2 = f1 - f3;
      }
    }
    for (int i4 = i6; ; i4 = i3)
    {
      i2++;
      i3 = i4;
      f1 = f2;
      break;
      localav = localLayoutParams.a;
      break label73;
      return;
      label153: f2 = f1;
    }
  }

  private void a(int paramInt1, int paramInt2)
  {
    this.v.a = paramInt1;
    this.w.a = (-paramInt2);
    this.q = false;
  }

  private void a(au<as, at> paramau, boolean paramBoolean)
  {
    int i1 = 0;
    at[] arrayOfat = (at[])paramau.b;
    for (int i2 = 0; i2 < arrayOfat.length; i2++)
      arrayOfat[i2].a = -2147483648;
    ar[] arrayOfar = (ar[])b().b;
    if (i1 < arrayOfar.length)
    {
      int i3 = arrayOfar[i1].a(paramBoolean);
      at localat = (at)paramau.a(i1);
      int i4 = localat.a;
      if (paramBoolean);
      while (true)
      {
        localat.a = Math.max(i4, i3);
        i1++;
        break;
        i3 = -i3;
      }
    }
  }

  private static void a(List<ao> paramList, as paramas, at paramat)
  {
    a(paramList, paramas, paramat, true);
  }

  private static void a(List<ao> paramList, as paramas, at paramat, boolean paramBoolean)
  {
    if (paramas.a() == 0)
      return;
    if (paramBoolean)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
        if (((ao)localIterator.next()).a.equals(paramas))
          return;
    }
    paramList.add(new ao(paramas, paramat));
  }

  private static void a(List<ao> paramList, au<as, at> paramau)
  {
    for (int i1 = 0; i1 < ((as[])paramau.a).length; i1++)
      a(paramList, ((as[])paramau.a)[i1], ((at[])paramau.b)[i1], false);
  }

  private boolean a(int[] paramArrayOfInt)
  {
    return a(l(), paramArrayOfInt, true);
  }

  private static boolean a(int[] paramArrayOfInt, ao paramao)
  {
    if (!paramao.c);
    int i2;
    int i3;
    do
    {
      return false;
      as localas = paramao.a;
      int i1 = localas.a;
      i2 = localas.b;
      i3 = paramao.b.a + paramArrayOfInt[i1];
    }
    while (i3 <= paramArrayOfInt[i2]);
    paramArrayOfInt[i2] = i3;
    return true;
  }

  private boolean a(ao[] paramArrayOfao, int[] paramArrayOfInt, boolean paramBoolean)
  {
    int i1 = 0;
    String str;
    if (this.a)
      str = "horizontal";
    int i2;
    Object localObject;
    int i3;
    int i4;
    while (true)
    {
      i2 = 1 + a();
      localObject = null;
      i3 = 0;
      if (i3 >= paramArrayOfao.length)
        break label386;
      Arrays.fill(paramArrayOfInt, 0);
      i4 = 0;
      if (i4 < i2)
      {
        int i9 = paramArrayOfao.length;
        int i10 = 0;
        boolean bool = false;
        while (true)
          if (i10 < i9)
          {
            bool |= a(paramArrayOfInt, paramArrayOfao[i10]);
            i10++;
            continue;
            str = "vertical";
            break;
          }
        if (bool)
          break;
        if (localObject != null)
        {
          ArrayList localArrayList1 = new ArrayList();
          ArrayList localArrayList2 = new ArrayList();
          while (i1 < paramArrayOfao.length)
          {
            ao localao2 = paramArrayOfao[i1];
            if (localObject[i1] != 0)
              localArrayList1.add(localao2);
            if (!localao2.c)
              localArrayList2.add(localao2);
            i1++;
          }
          this.y.a.println(str + " constraints: " + b(localArrayList1) + " are inconsistent; permanently removing: " + b(localArrayList2) + ". ");
        }
        i1 = 1;
      }
    }
    do
    {
      return i1;
      i4++;
      break;
      i1 = 0;
    }
    while (!paramBoolean);
    boolean[] arrayOfBoolean = new boolean[paramArrayOfao.length];
    for (int i5 = 0; i5 < i2; i5++)
    {
      int i7 = paramArrayOfao.length;
      for (int i8 = 0; i8 < i7; i8++)
        arrayOfBoolean[i8] |= a(paramArrayOfInt, paramArrayOfao[i8]);
    }
    if (i3 == 0)
      localObject = arrayOfBoolean;
    for (int i6 = 0; ; i6++)
    {
      if (i6 < paramArrayOfao.length)
      {
        if (arrayOfBoolean[i6] == 0)
          continue;
        ao localao1 = paramArrayOfao[i6];
        if (localao1.a.a < localao1.a.b)
          continue;
        localao1.c = false;
      }
      i3++;
      break;
    }
    label386: return true;
  }

  private ao[] a(List<ao> paramList)
  {
    aq localaq = new aq(this, (ao[])paramList.toArray(new ao[paramList.size()]));
    int i1 = 0;
    int i2 = localaq.c.length;
    while (i1 < i2)
    {
      localaq.a(i1);
      i1++;
    }
    if ((!aq.d) && (localaq.b != -1))
      throw new AssertionError();
    return localaq.a;
  }

  private int b(int paramInt1, int paramInt2)
  {
    a(paramInt1, paramInt2);
    return e()[a()];
  }

  private au<as, at> b(boolean paramBoolean)
  {
    GridLayout.Assoc localAssoc = GridLayout.Assoc.of(as.class, at.class);
    av[] arrayOfav = (av[])b().a;
    int i1 = arrayOfav.length;
    int i2 = 0;
    if (i2 < i1)
    {
      if (paramBoolean);
      as localas1;
      for (as localas2 = arrayOfav[i2].c; ; localas2 = new as(localas1.b, localas1.a))
      {
        localAssoc.put(localas2, new at());
        i2++;
        break;
        localas1 = arrayOfav[i2].c;
      }
    }
    return localAssoc.pack();
  }

  private String b(List<ao> paramList)
  {
    String str1;
    StringBuilder localStringBuilder2;
    label33: label63: int i2;
    int i3;
    int i4;
    if (this.a)
    {
      str1 = "x";
      StringBuilder localStringBuilder1 = new StringBuilder();
      Iterator localIterator = paramList.iterator();
      localStringBuilder2 = localStringBuilder1;
      int i1 = 1;
      if (!localIterator.hasNext())
        break label229;
      ao localao = (ao)localIterator.next();
      if (i1 == 0)
        break label165;
      i1 = 0;
      i2 = localao.a.a;
      i3 = localao.a.b;
      i4 = localao.b.a;
      if (i2 >= i3)
        break label178;
    }
    label165: label178: for (String str2 = str1 + i3 + "-" + str1 + i2 + ">=" + i4; ; str2 = str1 + i2 + "-" + str1 + i3 + "<=" + -i4)
    {
      localStringBuilder2.append(str2);
      break label33;
      str1 = "y";
      break;
      localStringBuilder2 = localStringBuilder2.append(", ");
      break label63;
    }
    label229: return localStringBuilder2.toString();
  }

  private void c(boolean paramBoolean)
  {
    int[] arrayOfInt;
    int i2;
    label20: View localView;
    GridLayout.LayoutParams localLayoutParams;
    av localav;
    label68: as localas;
    if (paramBoolean)
    {
      arrayOfInt = this.j;
      int i1 = this.y.getChildCount();
      i2 = 0;
      if (i2 >= i1)
        return;
      localView = this.y.getChildAt(i2);
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = GridLayout.a(localView);
        if (!this.a)
          break label125;
        localav = localLayoutParams.b;
        localas = localav.c;
        if (!paramBoolean)
          break label135;
      }
    }
    label135: for (int i3 = localas.a; ; i3 = localas.b)
    {
      arrayOfInt[i3] = Math.max(arrayOfInt[i3], this.y.a(localView, this.a, paramBoolean));
      i2++;
      break label20;
      arrayOfInt = this.l;
      break;
      label125: localav = localLayoutParams.a;
      break label68;
    }
  }

  private int h()
  {
    int i3;
    if (this.c == -2147483648)
    {
      int i1 = this.y.getChildCount();
      int i2 = 0;
      i3 = -1;
      if (i2 < i1)
      {
        GridLayout.LayoutParams localLayoutParams = GridLayout.a(this.y.getChildAt(i2));
        if (this.a);
        for (av localav = localLayoutParams.b; ; localav = localLayoutParams.a)
        {
          as localas = localav.c;
          i3 = Math.max(Math.max(Math.max(i3, localas.a), localas.b), localas.a());
          i2++;
          break;
        }
      }
      if (i3 != -1)
        break label126;
    }
    label126: for (int i4 = -2147483648; ; i4 = i3)
    {
      this.c = Math.max(0, i4);
      return this.c;
    }
  }

  private au<as, at> i()
  {
    if (this.f == null)
      this.f = b(true);
    if (!this.g)
    {
      a(this.f, true);
      this.g = true;
    }
    return this.f;
  }

  private au<as, at> j()
  {
    if (this.h == null)
      this.h = b(false);
    if (!this.i)
    {
      a(this.h, false);
      this.i = true;
    }
    return this.h;
  }

  private void k()
  {
    i();
    j();
  }

  private ao[] l()
  {
    if (this.n == null)
    {
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      a(localArrayList1, i());
      a(localArrayList2, j());
      if (this.u)
        for (int i2 = 0; i2 < a(); i2++)
          a(localArrayList1, new as(i2, i2 + 1), new at(0));
      int i1 = a();
      a(localArrayList1, new as(0, i1), this.v, false);
      a(localArrayList2, new as(i1, 0), this.w, false);
      this.n = ((ao[])GridLayout.a(a(localArrayList1), a(localArrayList2)));
    }
    if (!this.o)
    {
      k();
      this.o = true;
    }
    return this.n;
  }

  private int[] m()
  {
    if (this.t == null)
      this.t = new int[this.y.getChildCount()];
    return this.t;
  }

  public final int a()
  {
    return Math.max(this.b, h());
  }

  public final void a(int paramInt)
  {
    StringBuilder localStringBuilder;
    if ((paramInt != -2147483648) && (paramInt < h()))
    {
      localStringBuilder = new StringBuilder();
      if (!this.a)
        break label56;
    }
    label56: for (String str = "column"; ; str = "row")
    {
      GridLayout.a(str + "Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child");
      this.b = paramInt;
      return;
    }
  }

  public final void a(boolean paramBoolean)
  {
    this.u = paramBoolean;
    f();
  }

  final ao[][] a(ao[] paramArrayOfao)
  {
    int i1 = 0;
    int i2 = 1 + a();
    ao[][] arrayOfao; = new ao[i2][];
    int[] arrayOfInt = new int[i2];
    int i3 = paramArrayOfao.length;
    for (int i4 = 0; i4 < i3; i4++)
    {
      int i9 = paramArrayOfao[i4].a.a;
      arrayOfInt[i9] = (1 + arrayOfInt[i9]);
    }
    for (int i5 = 0; i5 < arrayOfInt.length; i5++)
      arrayOfao;[i5] = new ao[arrayOfInt[i5]];
    Arrays.fill(arrayOfInt, 0);
    int i6 = paramArrayOfao.length;
    while (i1 < i6)
    {
      ao localao = paramArrayOfao[i1];
      int i7 = localao.a.a;
      [Landroid.support.v7.widget.ao localao; = arrayOfao;[i7];
      int i8 = arrayOfInt[i7];
      arrayOfInt[i7] = (i8 + 1);
      localao;[i8] = localao;
      i1++;
    }
    return arrayOfao;;
  }

  public final int b(int paramInt)
  {
    int i1 = View.MeasureSpec.getMode(paramInt);
    int i2 = View.MeasureSpec.getSize(paramInt);
    int i3;
    switch (i1)
    {
    default:
      boolean bool = x;
      i3 = 0;
      if (bool)
        break;
      throw new AssertionError();
    case 0:
      i3 = b(0, 100000);
      return i3;
    case 1073741824:
      return b(i2, i2);
    case -2147483648:
    }
    return b(0, i2);
  }

  public final au<av, ar> b()
  {
    if (this.d == null)
    {
      GridLayout.Assoc localAssoc = GridLayout.Assoc.of(av.class, ar.class);
      int i7 = this.y.getChildCount();
      int i8 = 0;
      if (i8 < i7)
      {
        GridLayout.LayoutParams localLayoutParams2 = GridLayout.a(this.y.getChildAt(i8));
        if (this.a);
        for (av localav2 = localLayoutParams2.b; ; localav2 = localLayoutParams2.a)
        {
          localAssoc.put(localav2, localav2.a(this.a).b());
          i8++;
          break;
        }
      }
      this.d = localAssoc.pack();
    }
    if (!this.e)
    {
      ar[] arrayOfar = (ar[])this.d.b;
      for (int i1 = 0; i1 < arrayOfar.length; i1++)
        arrayOfar[i1].a();
      int i2 = this.y.getChildCount();
      int i3 = 0;
      if (i3 < i2)
      {
        View localView = this.y.getChildAt(i3);
        GridLayout.LayoutParams localLayoutParams1 = GridLayout.a(localView);
        av localav1;
        label194: int i4;
        if (this.a)
        {
          localav1 = localLayoutParams1.b;
          i4 = this.y.a(localView, this.a);
          if (localav1.e != 0.0F)
            break label271;
        }
        label271: for (int i5 = 0; ; i5 = m()[i3])
        {
          int i6 = i4 + i5;
          ((ar)this.d.a(i3)).a(this.y, localView, localav1, this, i6);
          i3++;
          break;
          localav1 = localLayoutParams1.a;
          break label194;
        }
      }
      this.e = true;
    }
    return this.d;
  }

  public final void c(int paramInt)
  {
    a(paramInt, paramInt);
    e();
  }

  public final int[] c()
  {
    if (this.j == null)
      this.j = new int[1 + a()];
    if (!this.k)
    {
      c(true);
      this.k = true;
    }
    return this.j;
  }

  public final int[] d()
  {
    if (this.l == null)
      this.l = new int[1 + a()];
    if (!this.m)
    {
      c(false);
      this.m = true;
    }
    return this.l;
  }

  public final int[] e()
  {
    float f1 = 0.0F;
    int i1 = 0;
    if (this.p == null)
      this.p = new int[1 + a()];
    int[] arrayOfInt;
    label103: label116: int i2;
    label187: label193: label199: int i4;
    label250: GridLayout.LayoutParams localLayoutParams1;
    av localav1;
    label299: float f2;
    if (!this.q)
    {
      arrayOfInt = this.p;
      int i12;
      GridLayout.LayoutParams localLayoutParams2;
      av localav2;
      boolean bool2;
      if (!this.s)
      {
        int i11 = this.y.getChildCount();
        i12 = 0;
        if (i12 >= i11)
          break label193;
        View localView2 = this.y.getChildAt(i12);
        if (localView2.getVisibility() == 8)
          break label187;
        localLayoutParams2 = GridLayout.a(localView2);
        if (this.a)
        {
          localav2 = localLayoutParams2.b;
          if (localav2.e == 0.0F)
            break label187;
          bool2 = true;
          this.r = bool2;
          this.s = true;
        }
      }
      else
      {
        if (this.r)
          break label199;
        a(arrayOfInt);
      }
      do
      {
        if (this.u)
          break label434;
        int i8 = arrayOfInt[0];
        int i9 = arrayOfInt.length;
        while (i1 < i9)
        {
          arrayOfInt[i1] -= i8;
          i1++;
        }
        localav2 = localLayoutParams2.a;
        break label103;
        i12++;
        break;
        bool2 = false;
        break label116;
        Arrays.fill(m(), 0);
        a(arrayOfInt);
        i2 = 1 + this.v.a * this.y.getChildCount();
      }
      while (i2 < 2);
      int i3 = this.y.getChildCount();
      i4 = 0;
      if (i4 < i3)
      {
        View localView1 = this.y.getChildAt(i4);
        if (localView1.getVisibility() == 8)
          break label444;
        localLayoutParams1 = GridLayout.a(localView1);
        if (this.a)
        {
          localav1 = localLayoutParams1.b;
          f2 = f1 + localav1.e;
        }
      }
    }
    while (true)
    {
      i4++;
      f1 = f2;
      break label250;
      localav1 = localLayoutParams1.a;
      break label299;
      int i5 = -1;
      int i6 = 0;
      int i7 = i2;
      boolean bool1 = true;
      while (i6 < i7)
      {
        int i10 = (i6 + i7) / 2;
        g();
        a(i10, f1);
        bool1 = a(l(), arrayOfInt, false);
        if (bool1)
        {
          i6 = i10 + 1;
          i5 = i10;
          continue;
        }
        i7 = i10;
      }
      if ((i5 <= 0) || (bool1))
        break;
      g();
      a(i5, f1);
      a(arrayOfInt);
      break;
      label434: this.q = true;
      return this.p;
      label444: f2 = f1;
    }
  }

  public final void f()
  {
    this.c = -2147483648;
    this.d = null;
    this.f = null;
    this.h = null;
    this.j = null;
    this.l = null;
    this.n = null;
    this.p = null;
    this.t = null;
    this.s = false;
    g();
  }

  public final void g()
  {
    this.e = false;
    this.g = false;
    this.i = false;
    this.k = false;
    this.m = false;
    this.o = false;
    this.q = false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.ap
 * JD-Core Version:    0.6.0
 */