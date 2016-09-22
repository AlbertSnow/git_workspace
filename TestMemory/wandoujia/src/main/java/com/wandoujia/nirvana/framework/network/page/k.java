package com.wandoujia.nirvana.framework.network.page;

import android.support.v7.app.f;
import com.android.volley.VolleyError;
import com.android.volley.j;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.log.toolkit.LaunchLogger;
import com.wandoujia.nirvana.framework.network.b;
import java.util.Iterator;
import java.util.List;

public final class k
  implements j, com.android.volley.k<P>
{
  P a;
  boolean b = true;
  PageList.PageStatus c = PageList.PageStatus.NOT_READY;
  private b<P> d;
  private boolean e = false;
  private boolean f = false;

  public k(PageList paramPageList)
  {
  }

  final DataLoadListener.Op a()
  {
    if ((this.e) || (this.c == PageList.PageStatus.HIT_CACHE_AND_LOAD_SUCCESS))
      return DataLoadListener.Op.REFRESH;
    return DataLoadListener.Op.ADD;
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    PageList.a(this.g, "Start request start, clear data is " + paramBoolean2 + ", clear cache is " + paramBoolean2);
    if (this.d != null);
    for (int i = 1; i != 0; i = 0)
    {
      PageList.a(this.g, "Start request skip, has on-going request");
      return;
    }
    if ((!paramBoolean1) && (!this.b))
    {
      PageList.a(this.g, "Start request skip, no need load more");
      return;
    }
    this.e = paramBoolean1;
    if (paramBoolean1)
      this.a = null;
    this.d = this.g.a(PageList.a(this.g).a, this, this);
    if (!CollectionUtils.isEmpty(PageList.p()))
    {
      Iterator localIterator = PageList.p().iterator();
      while (localIterator.hasNext())
      {
        f localf = (f)localIterator.next();
        this.d.a(localf);
      }
    }
    if (this.d == null)
    {
      PageList.a(this.g, "Start request skip, the request is null");
      this.b = false;
      return;
    }
    this.c = PageList.PageStatus.ONGOING;
    this.g.a(a());
    if (paramBoolean2)
      this.d.t();
    this.d.u();
    PageList.a(this.g, "Start request success");
  }

  public final void onErrorResponse(VolleyError paramVolleyError)
  {
    DataLoadListener.Op localOp = a();
    this.d = null;
    this.e = false;
    this.f = false;
    if (this.c == PageList.PageStatus.HIT_CACHE_INTERMEDIATE);
    for (this.c = PageList.PageStatus.HIT_CACHE_AND_LOAD_FAILED; ; this.c = PageList.PageStatus.MISS_CACHE_AND_LOAD_FAILED)
    {
      this.g.a(localOp, paramVolleyError);
      PageList.a(this.g, "Finish request, error is " + paramVolleyError);
      return;
    }
  }

  public final void onResponse(P paramP)
  {
    if (paramP == null)
    {
      onErrorResponse(null);
      return;
    }
    if (this.e)
      PageList.b(this.g);
    PageList localPageList;
    StringBuilder localStringBuilder;
    if (this.d != null)
    {
      if (this.f)
      {
        this.c = PageList.PageStatus.HIT_CACHE_AND_LOAD_SUCCESS;
        PageList.b(this.g);
      }
    }
    else
    {
      this.f = true;
      PageList.a(this.g, this, paramP);
      localPageList = this.g;
      localStringBuilder = new StringBuilder("Finish request, current page is ").append(this.c.name()).append(", ");
      if (this.d == null)
        break label179;
    }
    label179: for (String str = this.d.d(); ; str = "last request")
    {
      PageList.a(localPageList, str);
      return;
      if (this.d.e() == null)
      {
        this.c = PageList.PageStatus.MISS_CACHE_AND_LOAD_SUCCESS;
        break;
      }
      if (this.d.e().a())
      {
        this.c = PageList.PageStatus.HIT_CACHE_INTERMEDIATE;
        break;
      }
      this.c = PageList.PageStatus.HIT_CACHE_SUCCESS;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.network.page.k
 * JD-Core Version:    0.6.0
 */