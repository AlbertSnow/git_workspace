package com.wandoujia.nirvana.framework.network.page;

import android.os.Handler;
import android.os.Looper;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class a<T>
{
  private static final Handler a;
  private final List<h<T>> b;
  private final e<T> c;
  private e<T> d;
  private boolean e;

  static
  {
    a.class.getSimpleName();
    a = new Handler(Looper.getMainLooper());
  }

  public a(e<T> parame)
  {
    this.c = parame;
    this.b = new CopyOnWriteArrayList();
    this.e = false;
  }

  public static <T> boolean b(DataLoadListener.Op paramOp, g<T> paramg)
  {
    return (paramOp == DataLoadListener.Op.REFRESH) || ((paramOp == DataLoadListener.Op.ADD) && (paramg.a <= 0));
  }

  public abstract T a(int paramInt);

  public abstract String a();

  protected final List<T> a(DataLoadListener.Op paramOp, List<T> paramList)
  {
    if (this.c != null)
    {
      if (paramOp == DataLoadListener.Op.REFRESH)
        this.c.a();
      paramList = this.c.a(paramList);
    }
    if (this.d != null)
    {
      if (paramOp == DataLoadListener.Op.REFRESH)
        this.d.a();
      paramList = this.d.a(paramList);
    }
    return paramList;
  }

  public void a(int paramInt1, int paramInt2)
  {
    throw new UnsupportedOperationException("Subclass must implement it!");
  }

  public final void a(int paramInt, T paramT)
  {
    if ((paramInt < 0) || (paramInt >= c().size()))
      return;
    Object localObject = a(paramInt);
    if (localObject != paramT)
      c().set(paramInt, paramT);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramT);
    a(DataLoadListener.Op.UPDATE, new g(paramInt, localObject, null, localArrayList));
  }

  public void a(int paramInt, List<T> paramList)
  {
    throw new UnsupportedOperationException("Subclass must implement it!");
  }

  protected final void a(DataLoadListener.Op paramOp)
  {
    a.post(new b(this, paramOp));
  }

  protected final void a(DataLoadListener.Op paramOp, g<T> paramg)
  {
    a.post(new c(this, paramOp, paramg));
  }

  protected final void a(DataLoadListener.Op paramOp, Exception paramException)
  {
    a.post(new d(this, paramOp, paramException));
  }

  public final void a(DataLoadListener paramDataLoadListener)
  {
    this.b.add(new i(paramDataLoadListener));
  }

  public final void a(e<T> parame)
  {
    if ((this.d != null) && (!CollectionUtils.isEmpty(c())))
      throw new IllegalStateException("processor already exist!");
    this.d = parame;
  }

  public void b(int paramInt)
  {
    throw new UnsupportedOperationException("Subclass must implement it!");
  }

  public final void b(DataLoadListener paramDataLoadListener)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      if (localh.a != paramDataLoadListener)
        continue;
      this.b.remove(localh);
    }
  }

  public abstract boolean b();

  public abstract List<T> c();

  protected abstract void d();

  protected abstract void e();

  public final void f()
  {
    a(DataLoadListener.Op.REFRESH, new g(0, 0, null, null, c(), false));
  }

  public final e<T> g()
  {
    return this.d;
  }

  public final e<T> h()
  {
    return this.c;
  }

  public final void i()
  {
    Log.d("DataList", "load more " + this.e, new Object[0]);
    if ((!this.e) && (b()))
      d();
  }

  public final void j()
  {
    Log.d("DataList", "refresh " + this.e, new Object[0]);
    if (!this.e)
      e();
  }

  public final boolean k()
  {
    return this.e;
  }

  public void l()
  {
  }

  public boolean m()
  {
    return CollectionUtils.isEmpty(c());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.network.page.a
 * JD-Core Version:    0.6.0
 */