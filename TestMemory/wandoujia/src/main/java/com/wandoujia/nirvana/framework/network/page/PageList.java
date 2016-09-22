package com.wandoujia.nirvana.framework.network.page;

import android.annotation.TargetApi;
import com.android.volley.j;
import com.wandoujia.nirvana.framework.network.b;
import java.util.ArrayList;
import java.util.List;

public abstract class PageList<P, T> extends a<T>
{
  protected List<T> a = new ArrayList();
  private final List<PageList<P, T>.k> b = new ArrayList();
  private PageList<P, T>.k c = new k(this);
  private final List<T> d = new ArrayList();

  protected PageList(e<T> parame)
  {
    super(parame);
  }

  private void a(String paramString)
  {
    PageList.class.getSimpleName();
    new StringBuilder().append(paramString).append(", has items ").append(this.d.size()).append(", has pages ").append(this.b.size()).append(", next page status is ").append(this.c.c.name());
  }

  @TargetApi(3)
  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.c.a(paramBoolean1, paramBoolean2);
  }

  private void q()
  {
    this.b.clear();
    this.d.clear();
    this.a.clear();
    if (h() != null)
      h().a();
    if (g() != null)
      g().a();
  }

  protected abstract b<P> a(P paramP, com.android.volley.k<P> paramk, j paramj);

  public final T a(int paramInt)
  {
    return this.a.get(paramInt);
  }

  protected abstract boolean a(P paramP);

  protected abstract List<T> b(P paramP);

  public boolean b()
  {
    return this.c.b;
  }

  public final List<T> c()
  {
    return this.a;
  }

  public final void d()
  {
    a(false, false);
  }

  public final void e()
  {
    a(true, true);
  }

  public final int n()
  {
    return this.a.size();
  }

  public final void o()
  {
    this.d.clear();
    this.a.clear();
    this.b.clear();
    this.c = new k(this);
    f();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.network.page.PageList
 * JD-Core Version:    0.6.0
 */