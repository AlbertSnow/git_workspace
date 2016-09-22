package com.wandoujia.jupiter;

import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.g;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.List;

public final class q extends com.wandoujia.nirvana.framework.network.page.a<Model>
{
  private final String a;
  private final List<Model> b;

  public q(String paramString, List<Model> paramList)
  {
    super(new com.wandoujia.jupiter.a.a());
    this.a = paramString;
    this.b = new ArrayList();
    if (paramList != null)
      this.b.addAll(a(DataLoadListener.Op.REFRESH, paramList));
  }

  public final String a()
  {
    return this.a;
  }

  public final void a(List<Model> paramList)
  {
    this.b.clear();
    this.b.addAll(a(DataLoadListener.Op.REFRESH, paramList));
    a(DataLoadListener.Op.REFRESH, new g(-1, null, null, paramList));
  }

  public final boolean b()
  {
    return false;
  }

  public final List<Model> c()
  {
    return this.b;
  }

  protected final void d()
  {
  }

  protected final void e()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.q
 * JD-Core Version:    0.6.0
 */