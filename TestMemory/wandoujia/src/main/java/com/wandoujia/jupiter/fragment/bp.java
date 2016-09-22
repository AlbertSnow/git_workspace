package com.wandoujia.jupiter.fragment;

import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.startpage.c.d;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

final class bp
  implements d
{
  bp(StartPageFragment paramStartPageFragment)
  {
  }

  public final void a(List<Model> paramList)
  {
    if ((!CollectionUtils.isEmpty(paramList)) && (this.a.m() != null))
    {
      StartPageFragment.a(this.a).a(0, paramList);
      this.a.g().b();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.bp
 * JD-Core Version:    0.6.0
 */