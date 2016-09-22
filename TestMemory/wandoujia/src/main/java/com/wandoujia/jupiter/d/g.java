package com.wandoujia.jupiter.d;

import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.List;

final class g
  implements e<Model>
{
  public final List<Model> a(List<Model> paramList)
  {
    if (CollectionUtils.isEmpty(paramList))
      return paramList;
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    int j = -1;
    int k = 0;
    Model localModel;
    if (i < paramList.size())
    {
      localModel = (Model)paramList.get(i);
      if ((j != -1) || (paramList.size() <= i + 1) || (!((Model)paramList.get(i + 1)).T()))
        break label258;
    }
    label258: for (int m = i; ; m = j)
    {
      if ((localModel.F() == null) || (!a.a(localModel.F().package_name)) || (!localModel.T()))
      {
        if (localModel.T())
          k++;
        if ((!localModel.T()) || (k <= 4))
          localArrayList.add(localModel);
      }
      int n = k;
      i++;
      k = n;
      j = m;
      break;
      if ((k == 0) && (j >= 0))
      {
        localArrayList.remove(j);
        if (localArrayList.size() > j)
          localArrayList.remove(j);
      }
      while (true)
      {
        return localArrayList;
        if ((k > 4) || (k <= 0) || (j < 0) || (localArrayList.size() <= 1 + (j + k)))
          continue;
        localArrayList.remove(1 + (j + k));
      }
    }
  }

  public final void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.d.g
 * JD-Core Version:    0.6.0
 */