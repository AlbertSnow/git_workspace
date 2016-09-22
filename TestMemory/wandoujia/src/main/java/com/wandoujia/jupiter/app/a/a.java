package com.wandoujia.jupiter.app.a;

import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
  implements e<Model>
{
  public final List<Model> a(List<Model> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext())
    {
      Model localModel1 = (Model)localIterator1.next();
      if (localModel1.g() == TemplateTypeEnum.TemplateType.SECTION_TITLE_LITE)
      {
        if (CollectionUtils.isEmpty(localModel1.B()))
          continue;
        Entity.Builder localBuilder = new Entity.Builder(localModel1.b());
        localBuilder.sub_entity(new ArrayList());
        Model localModel2 = new Model(localBuilder.build());
        localModel2.a(localModel1);
        localArrayList.add(localModel2);
        if (CollectionUtils.isEmpty(localModel1.B()))
          continue;
        Iterator localIterator2 = localModel1.B().iterator();
        while (localIterator2.hasNext())
        {
          Model localModel3 = (Model)localIterator2.next();
          localModel3.O();
          localArrayList.add(localModel3);
        }
        continue;
      }
      localArrayList.add(localModel1);
    }
    return localArrayList;
  }

  public final void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.app.a.a
 * JD-Core Version:    0.6.0
 */