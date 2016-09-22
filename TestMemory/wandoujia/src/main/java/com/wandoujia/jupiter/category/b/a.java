package com.wandoujia.jupiter.category.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.List<Lcom.wandoujia.ripple_framework.model.Model;>;

public final class a
  implements e<Model>
{
  public final List<Model> a(List<Model> paramList)
  {
    ArrayList localArrayList1 = new ArrayList();
    Iterator localIterator = paramList.iterator();
    label49: label325: 
    while (localIterator.hasNext())
    {
      Model localModel1 = (Model)localIterator.next();
      int i;
      Object localObject;
      if (!TextUtils.isEmpty(localModel1.n()))
      {
        i = 1;
        if (i != 0)
        {
          localArrayList1.add(localModel1);
          localModel1.a(0, Boolean.valueOf(true));
        }
        if (localModel1.f() != ContentTypeEnum.ContentType.CONTAINER)
          continue;
        localObject = localModel1.B();
        if ((!CollectionUtils.isEmpty((Collection)localObject)) && (((List)localObject).size() > 2147483647))
          break label161;
      }
      while (true)
      {
        if (CollectionUtils.isEmpty((Collection)localObject))
          break label325;
        if (i == 0)
          ((Model)((List)localObject).get(0)).a(0, Boolean.valueOf(true));
        localArrayList1.addAll((Collection)localObject);
        break;
        i = 0;
        break label49;
        int j = ((List)localObject).size() - 2147483647;
        Resources localResources = i.k().g().getResources();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(j);
        String str = localResources.getString(2131624720, arrayOfObject);
        Model localModel2 = new Model(new Entity.Builder().type(Integer.valueOf(ContentTypeEnum.ContentType.APP.getValue())).template_type(TemplateTypeEnum.TemplateType.LIST_ITEM_EXPEND).title(str).build());
        localModel2.a(1, Boolean.valueOf(false));
        localModel2.a(2, str);
        localModel2.a(((List)localObject).subList(2147483647, ((List)localObject).size()));
        ArrayList localArrayList2 = new ArrayList(((List)localObject).subList(0, 2147483647));
        localArrayList2.add(localModel2);
        localObject = localArrayList2;
      }
    }
    label161: return (List<Model>)localArrayList1;
  }

  public final void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.category.b.a
 * JD-Core Version:    0.6.0
 */