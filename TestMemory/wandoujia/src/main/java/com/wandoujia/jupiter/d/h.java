package com.wandoujia.jupiter.d;

import android.text.TextUtils;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.p4.utils.k;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Iterator;
import java.util.List;

final class h
  implements e<Model>
{
  private static final int a = k.a();

  public final List<Model> a(List<Model> paramList)
  {
    if (!CollectionUtils.isEmpty(paramList))
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        Model localModel = (Model)localIterator.next();
        switch (b.a[localModel.g().ordinal()])
        {
        default:
          break;
        case 1:
        case 2:
          if ((CollectionUtils.isEmpty(localModel.B())) || (((Model)localModel.B().get(0)).F() == null))
            continue;
          int i = Math.min(localModel.B().size() / a, localModel.U());
          if (i == 0)
            i = 1;
          localModel.a(a.a(localModel.B(), i * a));
          break;
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
          if ((CollectionUtils.isEmpty(localModel.B())) || (((Model)localModel.B().get(0)).F() == null) || (!TextUtils.isEmpty(((Model)localModel.B().get(0)).b().symbol)))
            continue;
          localModel.a(a.a(localModel.B(), 2147483647));
        }
      }
    }
    return paramList;
  }

  public final void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.d.h
 * JD-Core Version:    0.6.0
 */