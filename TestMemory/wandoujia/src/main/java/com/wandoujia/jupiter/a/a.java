package com.wandoujia.jupiter.a;

import android.text.TextUtils;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.Image;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
  implements e<Model>
{
  private static List<Model> a(Model paramModel, TemplateTypeEnum.TemplateType paramTemplateType)
  {
    ArrayList localArrayList = new ArrayList();
    if ((!CollectionUtils.isEmpty(paramModel.w())) && (!TextUtils.isEmpty(((Image)paramModel.w().get(0)).url)))
    {
      localArrayList.add(paramModel);
      return localArrayList;
    }
    Model localModel1 = new Model(new Entity.Builder().type(paramModel.b().type).template_type(paramTemplateType).title(paramModel.n()).action(paramModel.t()).content_type(paramModel.f()).sub_title(paramModel.o()).build());
    localModel1.a(paramModel);
    localArrayList.add(localModel1);
    if (!CollectionUtils.isEmpty(paramModel.B()))
    {
      Iterator localIterator = paramModel.B().iterator();
      while (localIterator.hasNext())
      {
        Model localModel2 = (Model)localIterator.next();
        localModel2.O();
        localModel2.a(paramModel);
        localArrayList.add(localModel2);
      }
    }
    return localArrayList;
  }

  public List<Model> a(List<Model> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Model localModel = (Model)localIterator.next();
      switch (b.a[localModel.g().ordinal()])
      {
      default:
        localArrayList.add(localModel);
        break;
      case 1:
        localArrayList.addAll(a(localModel, TemplateTypeEnum.TemplateType.GROUP));
      }
    }
    return localArrayList;
  }

  public void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.a.a
 * JD-Core Version:    0.6.0
 */