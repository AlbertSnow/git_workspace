package com.wandoujia.ripple_framework.c;

import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.an;
import java.util.List;

final class bo
  implements an
{
  bo(bn parambn)
  {
  }

  public final int a(int paramInt1, int paramInt2)
  {
    int i = -1;
    Model localModel = this.a.i();
    if ((localModel == null) || (CollectionUtils.isEmpty(localModel.B())))
      return i;
    int j = 0;
    int k = Math.min(paramInt1 + paramInt2, localModel.B().size());
    int m = paramInt1;
    label53: int n;
    if (m < k)
    {
      if ((localModel.B().get(m) == null) || (((Model)localModel.B().get(m)).n() == null))
        break label143;
      n = ((Model)localModel.B().get(m)).n().length();
      if (n <= j)
        break label143;
    }
    for (int i1 = m; ; i1 = i)
    {
      m++;
      i = i1;
      j = n;
      break label53;
      break;
      label143: n = j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.bo
 * JD-Core Version:    0.6.0
 */