package android.support.v7.widget;

import java.util.ArrayList;

final class n
{
  n(RecyclerView paramRecyclerView)
  {
  }

  private void c(o paramo)
  {
    switch (paramo.a)
    {
    default:
      return;
    case 0:
      RecyclerView.e(this.a).a(paramo.b, paramo.c);
      return;
    case 1:
      RecyclerView.e(this.a).b(paramo.b, paramo.c);
      return;
    case 2:
      RecyclerView.e(this.a).c(paramo.b, paramo.c);
      return;
    case 3:
    }
    RecyclerView.e(this.a).d(paramo.b, paramo.c);
  }

  public final co a(int paramInt)
  {
    RecyclerView localRecyclerView = this.a;
    int i = localRecyclerView.c.a.a();
    int j = 0;
    co localco;
    if (j < i)
    {
      localco = RecyclerView.b(localRecyclerView.c.c(j));
      if ((localco != null) && (!localco.o()) && (localco.b == paramInt))
        label61: if (localco != null)
          break label80;
    }
    label80: 
    do
    {
      return null;
      j++;
      break;
      localco = null;
      break label61;
    }
    while (this.a.c.b(localco.a));
    return localco;
  }

  public final void a(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2, true);
    this.a.f = true;
    cm.a(this.a.e, paramInt2);
  }

  public final void a(o paramo)
  {
    c(paramo);
  }

  public final void b(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2, false);
    this.a.f = true;
  }

  public final void b(o paramo)
  {
    c(paramo);
  }

  public final void c(int paramInt1, int paramInt2)
  {
    this.a.c(paramInt1, paramInt2);
    this.a.g = true;
  }

  public final void d(int paramInt1, int paramInt2)
  {
    RecyclerView localRecyclerView = this.a;
    int i = localRecyclerView.c.a.a();
    for (int j = 0; j < i; j++)
    {
      co localco2 = RecyclerView.b(localRecyclerView.c.c(j));
      if ((localco2 == null) || (localco2.b()) || (localco2.b < paramInt1))
        continue;
      localco2.a(paramInt2, false);
      cm.a(localRecyclerView.e, true);
    }
    ch localch = localRecyclerView.a;
    int k = localch.b.size();
    for (int m = 0; m < k; m++)
    {
      co localco1 = (co)localch.b.get(m);
      if ((localco1 == null) || (localco1.d() < paramInt1))
        continue;
      localco1.a(paramInt2, true);
    }
    localRecyclerView.requestLayout();
    this.a.f = true;
  }

  public final void e(int paramInt1, int paramInt2)
  {
    int i = -1;
    RecyclerView localRecyclerView = this.a;
    int j = localRecyclerView.c.a.a();
    int k;
    int m;
    int n;
    int i1;
    label38: co localco2;
    if (paramInt1 < paramInt2)
    {
      k = i;
      m = paramInt2;
      n = paramInt1;
      i1 = 0;
      if (i1 >= j)
        break label142;
      localco2 = RecyclerView.b(localRecyclerView.c.c(i1));
      if ((localco2 != null) && (localco2.b >= n) && (localco2.b <= m))
      {
        if (localco2.b != paramInt1)
          break label131;
        localco2.a(paramInt2 - paramInt1, false);
      }
    }
    while (true)
    {
      cm.a(localRecyclerView.e, true);
      i1++;
      break label38;
      k = 1;
      m = paramInt1;
      n = paramInt2;
      break;
      label131: localco2.a(k, false);
    }
    label142: ch localch = localRecyclerView.a;
    int i2;
    int i3;
    int i5;
    label173: co localco1;
    if (paramInt1 < paramInt2)
    {
      i2 = paramInt2;
      i3 = paramInt1;
      int i4 = localch.b.size();
      i5 = 0;
      if (i5 >= i4)
        break label265;
      localco1 = (co)localch.b.get(i5);
      if ((localco1 != null) && (localco1.b >= i3) && (localco1.b <= i2))
      {
        if (localco1.b != paramInt1)
          break label255;
        localco1.a(paramInt2 - paramInt1, false);
      }
    }
    while (true)
    {
      i5++;
      break label173;
      i = 1;
      i2 = paramInt1;
      i3 = paramInt2;
      break;
      label255: localco1.a(i, false);
    }
    label265: localRecyclerView.requestLayout();
    this.a.f = true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.n
 * JD-Core Version:    0.6.0
 */