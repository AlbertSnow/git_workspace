package com.wandoujia.jupiter.d;

import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

final class f
  implements e<Model>
{
  private int a;

  public f(int paramInt)
  {
    this.a = paramInt;
  }

  public final List<Model> a(List<Model> paramList)
  {
    if (!CollectionUtils.isEmpty(paramList))
      return a.b(paramList, this.a);
    return null;
  }

  public final void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.d.f
 * JD-Core Version:    0.6.0
 */