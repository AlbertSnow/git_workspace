package com.alipay.wandoujia;

import android.support.v4.app.b;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

public final class d
{
  private Stack a = new Stack();
  private ArrayList b = new ArrayList();
  private f c;

  public d(f paramf)
  {
    this.c = paramf;
  }

  private void b(ae paramae)
  {
    Iterator localIterator = this.b.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return;
      ((bh)localIterator.next()).a(this, paramae);
    }
  }

  private ai h()
  {
    ai localai = (ai)this.a.pop();
    localai.i();
    return localai;
  }

  private void i()
  {
    if (!this.a.isEmpty())
      this.c.b((ae)this.a.peek());
  }

  private void j()
  {
    if (!this.a.isEmpty())
    {
      ai localai = (ai)this.a.peek();
      this.c.a(localai);
      b(localai);
    }
  }

  public final ae a()
  {
    if (!this.a.isEmpty())
      return (ae)this.a.peek();
    return null;
  }

  public final void a(ae paramae)
  {
    if (paramae == null);
    do
    {
      return;
      this.c.a(paramae);
    }
    while (!(paramae instanceof ai));
    ai localai = (ai)paramae;
    this.a.push(localai);
    b(localai);
  }

  public final void a(bh parambh)
  {
    if (parambh != null)
      this.b.add(parambh);
  }

  public final boolean b()
  {
    if (c())
      return true;
    Object localObject1;
    if (!this.a.isEmpty())
    {
      boolean bool1 = ((ai)this.a.peek()).b().e();
      localObject1 = null;
      if (!bool1);
    }
    else
    {
      return true;
    }
    while (true)
    {
      Object localObject2;
      localObject1 = localObject2;
      try
      {
        h();
        if (!this.a.isEmpty())
          localObject2 = (ai)this.a.peek();
        while (true)
        {
          try
          {
            if (!((ai)localObject2).e())
              break;
            boolean bool2 = ((ai)localObject2).g();
            if (bool2)
              break;
            j();
            if (localObject2 != null)
              break label117;
            return true;
            return true;
          }
          catch (EmptyStackException localEmptyStackException2)
          {
          }
          b.b(localEmptyStackException2);
        }
        label117: return false;
      }
      catch (EmptyStackException localEmptyStackException1)
      {
        while (true)
        {
          localObject2 = localObject1;
          Object localObject3 = localEmptyStackException1;
        }
      }
    }
  }

  public final boolean c()
  {
    boolean bool;
    do
    {
      if (this.a.isEmpty())
        return true;
      bool = ((ai)this.a.peek()).e();
      if (bool)
        continue;
      h();
    }
    while (!bool);
    i();
    return this.a.isEmpty();
  }

  public final boolean d()
  {
    Object localObject1 = null;
    try
    {
      while (true)
      {
        if (this.a.isEmpty())
          return true;
        ai localai1 = h();
        if (localObject1 == null)
          localObject1 = localai1;
        if (this.a.isEmpty())
          break;
        ai localai2 = (ai)this.a.peek();
        if (!localObject1.e())
          break label108;
        boolean bool = localai2.e();
        if (!bool)
          continue;
        localObject2 = localObject1;
        if (!localObject2.e())
          break label101;
        j();
        return this.a.isEmpty();
      }
      return true;
    }
    catch (EmptyStackException localEmptyStackException)
    {
      while (true)
      {
        Object localObject2 = localObject1;
        b.b(localEmptyStackException);
        continue;
        label101: i();
        continue;
        label108: localObject2 = localObject1;
      }
    }
  }

  public final void e()
  {
    this.a.clear();
    this.c.b();
  }

  protected final void f()
  {
    this.a.clear();
    this.c.c();
  }

  protected final ai g()
  {
    if (!this.a.isEmpty());
    for (int i = -1 + this.a.size(); ; i--)
    {
      ai localai;
      if (i < 0)
        localai = null;
      do
      {
        return localai;
        localai = (ai)this.a.get(i);
      }
      while ((localai.f() == 4) || (localai.f() == 9));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.d
 * JD-Core Version:    0.6.0
 */