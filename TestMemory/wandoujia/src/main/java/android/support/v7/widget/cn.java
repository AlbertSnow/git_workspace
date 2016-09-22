package android.support.v7.widget;

import android.support.v4.c.a;
import android.support.v4.view.bg;
import android.support.v4.widget.ao;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

final class cn
  implements Runnable
{
  private int a;
  private int b;
  private ao c;
  private Interpolator d = RecyclerView.f();
  private boolean e = false;
  private boolean f = false;

  public cn(RecyclerView paramRecyclerView)
  {
    this.c = ao.a(paramRecyclerView.getContext(), RecyclerView.f());
  }

  final void a()
  {
    if (this.e)
    {
      this.f = true;
      return;
    }
    this.g.removeCallbacks(this);
    bg.a(this.g, this);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    RecyclerView.b(this.g, 2);
    this.b = 0;
    this.a = 0;
    this.c.a(paramInt1, paramInt2, -2147483648, 2147483647);
    a();
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    a(paramInt1, paramInt2, paramInt3, RecyclerView.f());
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
  {
    if (this.d != paramInterpolator)
    {
      this.d = paramInterpolator;
      this.c = ao.a(this.g.getContext(), paramInterpolator);
    }
    RecyclerView.b(this.g, 2);
    this.b = 0;
    this.a = 0;
    this.c.a(0, 0, paramInt1, paramInt2, paramInt3);
    a();
  }

  public final void b()
  {
    this.g.removeCallbacks(this);
    this.c.h();
  }

  public final void b(int paramInt1, int paramInt2)
  {
    int i = Math.abs(paramInt1);
    int j = Math.abs(paramInt2);
    int k;
    int m;
    int n;
    if (i > j)
    {
      k = 1;
      m = (int)Math.sqrt(0.0D);
      n = (int)Math.sqrt(paramInt1 * paramInt1 + paramInt2 * paramInt2);
      if (k == 0)
        break label147;
    }
    int i4;
    label147: for (int i1 = this.g.getWidth(); ; i1 = this.g.getHeight())
    {
      int i2 = i1 / 2;
      float f1 = Math.min(1.0F, 1.0F * n / i1);
      float f2 = i2 + i2 * (float)Math.sin((float)(0.47123891676382D * (f1 - 0.5F)));
      if (m <= 0)
        break label159;
      i4 = 4 * Math.round(1000.0F * Math.abs(f2 / m));
      a(paramInt1, paramInt2, Math.min(i4, 2000));
      return;
      k = 0;
      break;
    }
    label159: if (k != 0);
    for (int i3 = i; ; i3 = j)
    {
      i4 = (int)(300.0F * (1.0F + i3 / i1));
      break;
    }
  }

  public final void run()
  {
    this.f = false;
    this.e = true;
    RecyclerView.f(this.g);
    ao localao = this.c;
    ck localck = RecyclerView.e(this.g).g;
    int i;
    int j;
    int k;
    int m;
    int n;
    int i2;
    int i3;
    int i12;
    int i4;
    int i5;
    int i6;
    int i11;
    if (localao.g())
    {
      i = localao.b();
      j = localao.c();
      k = i - this.a;
      m = j - this.b;
      this.a = i;
      this.b = j;
      by localby = RecyclerView.g(this.g);
      n = 0;
      int i1 = 0;
      i2 = 0;
      i3 = 0;
      if (localby != null)
      {
        this.g.b();
        RecyclerView.h(this.g);
        a.a("RV Scroll");
        i2 = 0;
        i3 = 0;
        if (k != 0)
        {
          i3 = RecyclerView.e(this.g).a(k, this.g.a, this.g.e);
          i2 = k - i3;
        }
        n = 0;
        i1 = 0;
        if (m != 0)
        {
          i1 = RecyclerView.e(this.g).b(m, this.g.a, this.g.e);
          n = m - i1;
        }
        a.a();
        if (RecyclerView.i(this.g))
        {
          int i13 = this.g.c.a();
          for (int i14 = 0; i14 < i13; i14++)
          {
            View localView1 = this.g.c.b(i14);
            co localco = this.g.a(localView1);
            if ((localco == null) || (localco.g == null))
              continue;
            View localView2 = localco.g.a;
            int i15 = localView1.getLeft();
            int i16 = localView1.getTop();
            if ((i15 == localView2.getLeft()) && (i16 == localView2.getTop()))
              continue;
            localView2.layout(i15, i16, i15 + localView2.getWidth(), i16 + localView2.getHeight());
          }
        }
        if ((localck != null) && (!localck.d()) && (localck.e()))
        {
          i12 = this.g.e.e();
          if (i12 != 0)
            break label756;
          localck.c();
        }
        RecyclerView.j(this.g);
        this.g.a(false);
      }
      i4 = i2;
      i5 = i1;
      if (!RecyclerView.k(this.g).isEmpty())
        this.g.invalidate();
      if (bg.a(this.g) != 2)
        RecyclerView.a(this.g, k, m);
      if ((i4 != 0) || (n != 0))
      {
        i6 = (int)localao.f();
        if (i4 == i)
          break label850;
        if (i4 >= 0)
          break label790;
        i11 = -i6;
      }
    }
    label501: for (int i7 = i11; ; i7 = 0)
    {
      if (n != j)
        if (n < 0)
          i6 = -i6;
      while (true)
      {
        if (bg.a(this.g) != 2)
          this.g.b(i7, i6);
        if (((i7 != 0) || (i4 == i) || (localao.d() == 0)) && ((i6 != 0) || (n == j) || (localao.e() == 0)))
          localao.h();
        if ((i3 != 0) || (i5 != 0))
          this.g.d(i3, i5);
        if (!RecyclerView.l(this.g))
          this.g.invalidate();
        int i8;
        int i9;
        int i10;
        if ((m != 0) && (RecyclerView.e(this.g).g()) && (i5 == m))
        {
          i8 = 1;
          if ((k == 0) || (!RecyclerView.e(this.g).f()) || (i3 != k))
            break label825;
          i9 = 1;
          if (((k != 0) || (m != 0)) && (i9 == 0) && (i8 == 0))
            break label831;
          i10 = 1;
          if ((!localao.a()) && (i10 != 0))
            break label837;
          RecyclerView.b(this.g, 0);
        }
        while (true)
        {
          if ((localck != null) && (localck.d()))
            ck.a(localck, 0, 0);
          this.e = false;
          if (this.f)
            a();
          return;
          if (localck.f() >= i12)
            localck.b(i12 - 1);
          ck.a(localck, k - i2, m - n);
          break;
          if (i4 > 0)
          {
            i11 = i6;
            break label501;
          }
          i11 = 0;
          break label501;
          if (n > 0)
            break label522;
          i6 = 0;
          break label522;
          i8 = 0;
          break label651;
          i9 = 0;
          break label679;
          i10 = 0;
          break label702;
          a();
        }
        i6 = 0;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.cn
 * JD-Core Version:    0.6.0
 */