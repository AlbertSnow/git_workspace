package com.wandoujia.nirvana.framework.ui.recycler;

import android.view.ViewGroup;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.logv3.toolkit.cardshow.n;
import com.wandoujia.nirvana.framework.ui.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class i<T> extends n<j>
{
  protected final Set<j> a = new HashSet();
  protected List<T> b;

  private void c(j paramj)
  {
    super.a(paramj);
    if ((paramj != null) && (paramj.i != null))
      paramj.i.a();
    do
      return;
    while (!GlobalConfig.isDebug());
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramj == null);
    for (String str = "holder"; ; str = "holder.presenter")
      throw new NullPointerException(str + " is null");
  }

  public int a()
  {
    if (this.b == null)
      return 0;
    return this.b.size();
  }

  public void a(j paramj)
  {
    super.b(paramj);
  }

  public void a(j paramj, int paramInt)
  {
    super.a(paramj, paramInt);
    this.a.add(paramj);
    Object localObject = this.b.get(paramInt);
    paramj.i.a(localObject);
  }

  public final boolean a(int paramInt, T paramT)
  {
    if (paramT == null);
    do
    {
      return false;
      if (this.b != null)
        continue;
      this.b = new ArrayList();
    }
    while ((paramInt < 0) || (paramInt > this.b.size()));
    this.b.add(paramInt, paramT);
    d(f(paramInt));
    return false;
  }

  public final boolean a(int paramInt, List<T> paramList)
  {
    if (CollectionUtils.isEmpty(paramList));
    do
    {
      return false;
      if (this.b != null)
        continue;
      this.b = new ArrayList();
    }
    while ((paramInt < 0) || (paramInt > this.b.size()));
    this.b.addAll(paramInt, paramList);
    b(f(paramInt), paramList.size());
    return true;
  }

  public final boolean a(T paramT)
  {
    if (this.b != null)
    {
      int i = this.b.indexOf(paramT);
      if ((i >= 0) && (i < this.b.size()))
      {
        this.b.remove(i);
        e(f(i));
        return true;
      }
    }
    return false;
  }

  public boolean a(List<T> paramList)
  {
    this.b = new ArrayList(paramList);
    b();
    return true;
  }

  protected abstract a b(ViewGroup paramViewGroup, int paramInt);

  public void b(j paramj)
  {
    super.c(paramj);
  }

  public final boolean b(int paramInt, T paramT)
  {
    if ((this.b != null) && (paramInt >= 0) && (paramInt < this.b.size()))
    {
      if (this.b.get(paramInt) != paramT)
        this.b.set(paramInt, paramT);
      c(f(paramInt));
      return true;
    }
    return false;
  }

  public final boolean b(int paramInt, List<T> paramList)
  {
    List localList = this.b;
    int i = 0;
    if (localList != null)
    {
      i = 0;
      if (paramInt >= 0)
      {
        int j = paramInt + paramList.size();
        int k = this.b.size();
        i = 0;
        if (j < k)
        {
          while (i < paramList.size())
          {
            if (this.b.get(paramInt + i) != paramList.get(i))
              this.b.set(paramInt + i, paramList.get(i));
            i++;
          }
          a(f(paramInt), paramList.size());
          i = 1;
        }
      }
    }
    return i;
  }

  public final boolean d(int paramInt1, int paramInt2)
  {
    List localList1 = this.b;
    int i = 0;
    if (localList1 != null)
    {
      i = 0;
      if (paramInt1 >= 0)
      {
        int j = paramInt1 + paramInt2;
        int k = this.b.size();
        i = 0;
        if (j <= k)
        {
          List localList2 = this.b.subList(0, paramInt1);
          List localList3 = this.b.subList(paramInt1 + paramInt2, this.b.size());
          this.b = new ArrayList(localList2);
          this.b.addAll(localList3);
          c(paramInt1, paramInt2);
          i = 1;
        }
      }
    }
    return i;
  }

  public void e()
  {
    new StringBuilder("Destroy view holders ").append(this).append(", size is ").append(this.a.size());
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      c((j)localIterator.next());
    this.a.clear();
  }

  protected int f(int paramInt)
  {
    return paramInt;
  }

  public final List<T> f()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.ui.recycler.i
 * JD-Core Version:    0.6.0
 */