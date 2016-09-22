package com.wandoujia.jupiter.presenter;

import com.wandoujia.api.proto.Entity;
import com.wandoujia.ripple_framework.c.af;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.util.BadgeUtil;

public class bz extends af
{
  public final Object a(int paramInt, Model paramModel)
  {
    switch (paramInt)
    {
    default:
      return super.a(paramInt, paramModel);
    case 2131493641:
      return paramModel.i();
    case 2131493644:
      return paramModel.n();
    case 2131493740:
      return paramModel.q();
    case 2131493642:
      return BadgeUtil.a(paramModel);
    case 2131493643:
    }
    return paramModel.b().action_positive;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.bz
 * JD-Core Version:    0.6.0
 */