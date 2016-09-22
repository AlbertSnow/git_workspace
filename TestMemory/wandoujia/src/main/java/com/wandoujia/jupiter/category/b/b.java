package com.wandoujia.jupiter.category.b;

import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.List;

public final class b
  implements e<Model>
{
  private a a = new a();

  public final List<Model> a(List<Model> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramList != null) && (paramList.size() >= 2))
    {
      Model localModel1 = (Model)paramList.get(0);
      Model localModel2 = (Model)paramList.get(1);
      localModel1.a(this.a.a(localModel1.B()));
      localModel2.a(this.a.a(localModel2.B()));
      localArrayList.add(localModel1);
      localArrayList.add(localModel2);
    }
    return localArrayList;
  }

  public final void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.category.b.b
 * JD-Core Version:    0.6.0
 */