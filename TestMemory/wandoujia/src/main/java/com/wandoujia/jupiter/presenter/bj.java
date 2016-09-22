package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.ripple_framework.k;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

final class bj extends h
{
  bj(bi parambi, Model paramModel1, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    boolean bool;
    int i;
    if (!((Boolean)this.a.a(1)).booleanValue())
    {
      bool = true;
      this.a.a(1, Boolean.valueOf(bool));
      bi.a(this.b, this.a, bool);
      Model localModel = this.a;
      List localList = bi.a(this.b).a().c();
      i = 0;
      label66: if (i >= localList.size())
        break label109;
      if (localModel != localList.get(i))
        break label103;
    }
    while (true)
    {
      if (i >= 0)
        break label115;
      return false;
      bool = false;
      break;
      label103: i++;
      break label66;
      label109: i = -1;
    }
    label115: if (bool)
    {
      bi.a(this.b).a().a(i, this.a.B());
      return false;
    }
    int j = this.a.B().size();
    bi.a(this.b).a().a(i - j, j);
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.bj
 * JD-Core Version:    0.6.0
 */