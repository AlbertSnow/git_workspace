package com.wandoujia.jupiter.d;

import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Iterator;
import java.util.List;

final class e
  implements com.wandoujia.nirvana.framework.network.page.e<Model>
{
  public final List<Model> a(List<Model> paramList)
  {
    if (CollectionUtils.isEmpty(paramList))
      paramList = null;
    while (true)
    {
      return paramList;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
        ((Model)localIterator.next()).a(TemplateTypeEnum.TemplateType.NOT_SUPPORT);
    }
  }

  public final void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.d.e
 * JD-Core Version:    0.6.0
 */