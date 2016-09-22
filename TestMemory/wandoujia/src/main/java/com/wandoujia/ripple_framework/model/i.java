package com.wandoujia.ripple_framework.model;

import com.wandoujia.nirvana.framework.network.page.a;
import java.util.ArrayList;
import java.util.List;

public final class i extends a<Model>
{
  private final List<Model> a;
  private final String b;

  public i(Model paramModel, String paramString)
  {
    super(null);
    this.a = new ArrayList(1);
    this.a.add(paramModel);
    this.b = paramString;
  }

  public i(List<Model> paramList, String paramString)
  {
    super(null);
    this.a = paramList;
    this.b = paramString;
  }

  public final String a()
  {
    return this.b;
  }

  public final boolean b()
  {
    return false;
  }

  public final List<Model> c()
  {
    return this.a;
  }

  public final void d()
  {
  }

  public final void e()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.model.i
 * JD-Core Version:    0.6.0
 */