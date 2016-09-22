package com.wandoujia.launcher_base.launcher.c;

import android.graphics.Point;
import com.wandoujia.launcher_base.utils.g;
import java.util.ArrayList;
import java.util.List;

public final class b
{
  private int a;
  private boolean b;
  private List<a> c = new ArrayList();
  private List<c> d = new ArrayList();

  public b(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  private void a(a parama, Point paramPoint)
  {
    g localg = parama.g();
    for (int i = paramPoint.y; i < paramPoint.y + localg.b(); i++)
      for (int j = paramPoint.x; j < paramPoint.x + localg.a(); j++)
      {
        int k = parama.e();
        c localc = c(i);
        if (localc == null)
          continue;
        localc.a(j, k);
      }
  }

  private c c(int paramInt)
  {
    for (int i = this.d.size(); i <= paramInt; i++)
      this.d.add(new c());
    return (c)this.d.get(paramInt);
  }

  public final void a(int paramInt)
  {
    this.a = paramInt;
    for (int i = 0; i < this.c.size(); i++)
      ((a)this.c.get(i)).a(paramInt);
  }

  public final boolean a()
  {
    return this.b;
  }

  public final boolean a(a parama)
  {
    Point localPoint;
    if ((parama == null) || (parama.g() == null))
      localPoint = null;
    while (true)
    {
      int i = 0;
      if (localPoint != null)
      {
        if ((parama.e() == -2) && (localPoint.x == 0))
          localPoint = null;
        if (localPoint != null)
          a(parama, localPoint);
        parama.a(localPoint);
        parama.a(this.a);
        this.c.add(parama);
        i = 1;
      }
      return i;
      parama.a(this);
      g localg = parama.g();
      if (localg != null)
      {
        int j = c();
        if (this.b)
          j += 4;
        label194: label200: for (int k = 0; ; k++)
        {
          if (k > j - localg.b())
            break label206;
          for (int m = 0; ; m++)
          {
            if (m > 4 - localg.a())
              break label200;
            c localc = c(k);
            if (localc != null);
            for (int n = localc.a(m); ; n = -1)
            {
              if (n == -2)
                break label200;
              if (n != -1)
                break label194;
              localPoint = new Point(m, k);
              break;
            }
          }
        }
      }
      label206: localPoint = null;
    }
  }

  public final int b()
  {
    return this.c.size();
  }

  public final a b(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.c.size()))
      return (a)this.c.get(paramInt);
    return null;
  }

  public final int c()
  {
    return Math.max(this.d.size(), 4);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.c.b
 * JD-Core Version:    0.6.0
 */