package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.k;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

final class eg extends h
{
  eg(ef paramef, Model paramModel1, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    Model localModel = this.a;
    List localList = this.b.j().a().c();
    int i = 0;
    if (i < localList.size())
      if (localModel == localList.get(i))
        label45: if (i >= 0)
          break label64;
    label64: 
    do
    {
      return false;
      i++;
      break;
      i = -1;
      break label45;
    }
    while (CollectionUtils.isEmpty(this.a.B()));
    this.b.j().a().b(i);
    this.b.j().a().a(i, this.a.B());
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.eg
 * JD-Core Version:    0.6.0
 */