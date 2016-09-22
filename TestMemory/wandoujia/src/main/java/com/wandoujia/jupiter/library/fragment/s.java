package com.wandoujia.jupiter.library.fragment;

import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.jupiter.q;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Iterator;
import java.util.List;

final class s
  implements Runnable
{
  s(r paramr, Model paramModel)
  {
  }

  public final void run()
  {
    Iterator localIterator = this.b.a.iterator();
    Model localModel2;
    do
    {
      if (!localIterator.hasNext())
        break;
      localModel2 = (Model)localIterator.next();
    }
    while ((localModel2.F().package_name == null) || (!localModel2.F().package_name.equals(this.a.F().package_name)));
    for (int i = this.b.a.indexOf(localModel2); ; i = -1)
    {
      if (i > 0)
      {
        Model localModel1 = (Model)this.b.a.remove(i);
        localModel1.a(2131492879, Boolean.valueOf(true));
        this.b.a.add(0, localModel1);
        this.b.a.add(1, this.a);
        ((q)AppUpgradeFragment.c(this.b.b)).a(this.b.a);
      }
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.s
 * JD-Core Version:    0.6.0
 */