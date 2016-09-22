package com.wandoujia.jupiter.startpage.c;

import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.base.utils.AsyncTaskUtils;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
  implements e<Model>
{
  private d a;

  public a(d paramd)
  {
    this.a = paramd;
  }

  public final List<Model> a(List<Model> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Model localModel = (Model)localIterator.next();
      if (localModel.f() != ContentTypeEnum.ContentType.SELF_UPDATE)
        continue;
      localArrayList.add(localModel);
      localIterator.remove();
    }
    if (!CollectionUtils.isEmpty(localArrayList))
      AsyncTaskUtils.runAsyncTask(new b(this), new List[] { localArrayList });
    return paramList;
  }

  public final void a()
  {
    this.a = null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.startpage.c.a
 * JD-Core Version:    0.6.0
 */