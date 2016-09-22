package com.wandoujia.jupiter.d;

import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Iterator;
import java.util.List;

final class d
  implements e<Model>
{
  public final List<Model> a(List<Model> paramList)
  {
    if (!CollectionUtils.isEmpty(paramList))
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        Model localModel = (Model)localIterator.next();
        if (localModel.g() != TemplateTypeEnum.TemplateType.GRAND_CONTAINER)
          continue;
        if ((CollectionUtils.isEmpty(localModel.B())) || (((Model)localModel.B().get(0)).F() == null))
          break;
        localModel.a(a.a(localModel.B(), 1));
      }
    }
    return paramList;
  }

  public final void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.d.d
 * JD-Core Version:    0.6.0
 */