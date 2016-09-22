package com.wandoujia.jupiter.presenter;

import android.view.ViewGroup;
import com.wandoujia.api.proto.HttpResponse;
import com.wandoujia.jupiter.library.presenter.g;
import com.wandoujia.jupiter.library.presenter.q;
import com.wandoujia.jupiter.library.presenter.s;
import com.wandoujia.jupiter.library.presenter.t;
import com.wandoujia.jupiter.search.b.h;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.c.af;
import com.wandoujia.ripple_framework.c.ah;
import com.wandoujia.ripple_framework.c.ai;
import com.wandoujia.ripple_framework.c.ax;
import com.wandoujia.ripple_framework.c.ay;
import com.wandoujia.ripple_framework.c.bl;
import com.wandoujia.ripple_framework.c.bp;
import com.wandoujia.ripple_framework.c.bs;
import com.wandoujia.ripple_framework.c.e;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;

public final class aa
  implements com.android.volley.k<HttpResponse>
{
  aa(z paramz, Model paramModel, int paramInt)
  {
  }

  public static com.wandoujia.nirvana.framework.ui.a a(ViewGroup paramViewGroup)
  {
    return a(paramViewGroup, null).a(2131492903, new dl()).a(2131493666, new dk()).a(2131492998, new dc()).a(2131493519, new co());
  }

  public static com.wandoujia.nirvana.framework.ui.a a(ViewGroup paramViewGroup, dr paramdr)
  {
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, null).a(2131492998, new af()).a(2131492903, new dp()).a(2131492903, new af()).a(2131493666, new do(paramdr)).a(new dm(paramdr)).a(new com.wandoujia.ripple_framework.c.a());
  }

  public static com.wandoujia.nirvana.framework.ui.a a(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(2131492998, new af()).a(2131493413, new ax()).a(2131492972, new eu()).a(2131492876, new af()).a(2131492866, new cf()).a(2131492866, new b()).a(2131492903, new af()).a(new e()).a(new com.wandoujia.ripple_framework.c.a());
  }

  public static boolean a(Model paramModel, dr paramdr, boolean paramBoolean)
  {
    if (paramModel == null)
      return false;
    if (paramModel.a(2131493666) == null)
    {
      if ((paramdr == null) || (paramdr.a(paramModel) == null))
      {
        paramModel.a(2131493666, Boolean.valueOf(paramBoolean));
        return paramBoolean;
      }
      boolean bool = paramdr.a(paramModel).booleanValue();
      paramModel.a(2131493666, Boolean.valueOf(bool));
      return bool;
    }
    return ((Boolean)paramModel.a(2131493666)).booleanValue();
  }

  public static com.wandoujia.nirvana.framework.ui.a b(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).a(2131492974, new af()).a(new ay()).a(new ca()).a(2131493742, new com.wandoujia.jupiter.library.presenter.c());
  }

  public static com.wandoujia.nirvana.framework.ui.a c(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).a(2131492903, new cm());
  }

  public static com.wandoujia.nirvana.framework.ui.a d(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).b(2131492972, new ai()).a(2131492973, new af()).a(2131492866, new cp()).a(2131493008, new ez()).b(2131492903, new ds()).a(2131492903, new dq()).a(new ad()).a(new z());
  }

  public static com.wandoujia.nirvana.framework.ui.a e(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(2131492998, new ListPresenterFactory.11()).a(new e());
  }

  public static com.wandoujia.nirvana.framework.ui.a f(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    com.wandoujia.nirvana.framework.ui.a locala = a(paramViewGroup, paramk).a(2131493174, new bl()).b(2131493413, new ct()).a(2131493646, new cs());
    com.wandoujia.nirvana.framework.ui.b[] arrayOfb = new com.wandoujia.nirvana.framework.ui.b[2];
    arrayOfb[0] = new ee();
    arrayOfb[1] = new cr(Logger.Module.SEARCH, ViewLogPackage.Element.CARD);
    return locala.a(new com.wandoujia.nirvana.framework.ui.c(arrayOfb)).a(new ca()).a(new ay());
  }

  public static com.wandoujia.nirvana.framework.ui.a g(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return h(paramViewGroup, paramk).a(new cu(Logger.Module.SEARCH, ViewLogPackage.Element.CARD));
  }

  public static com.wandoujia.nirvana.framework.ui.a h(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).a(2131492889, new ah('\000')).a(2131492973, new af()).a(new en());
  }

  public static com.wandoujia.nirvana.framework.ui.a i(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).a(2131492889, new ah()).a(new cv(Logger.Module.SEARCH, ViewLogPackage.Element.CARD));
  }

  public static com.wandoujia.nirvana.framework.ui.a j(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).b(2131492903, new db()).a(2131492998, new af()).a(2131492972, new da()).a(2131493658, new com.wandoujia.jupiter.library.presenter.k()).a(new g()).b(2131492866, new cw()).a(new ay());
  }

  public static com.wandoujia.nirvana.framework.ui.a k(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).a(new ca()).b(2131492903, new dd()).a(2131492972, new t()).a(2131493658, new s()).a(2131493707, new q()).a(2131492945, new com.wandoujia.ripple_framework.c.be(2131492972)).a(new com.wandoujia.ripple_framework.c.bg(Logger.Module.APPS, ViewLogPackage.Element.CARD));
  }

  public static com.wandoujia.nirvana.framework.ui.a l(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).a(new de());
  }

  public static com.wandoujia.nirvana.framework.ui.a m(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).a(2131493495, new df());
  }

  public static com.wandoujia.nirvana.framework.ui.a n(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).a(new bp(0));
  }

  public static com.wandoujia.nirvana.framework.ui.a o(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).a(new h());
  }

  public static com.wandoujia.nirvana.framework.ui.a p(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).b(2131492903, new ba()).b(2131492972, new bg()).a(2131492866, new ap()).a(2131492885, new aw()).a(2131492885, new av()).a(2131492945, new be()).a(new bb());
  }

  public static com.wandoujia.nirvana.framework.ui.a q(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(2131493644, new bz()).a(2131493740, new bz()).a(2131493642, new bz()).a(2131493643, new b()).a(2131493641, new dg()).a(2131493645, new bl()).a(2131493645, new ce()).a(new com.wandoujia.ripple_framework.c.bg(Logger.Module.APPS, ViewLogPackage.Element.CARD)).a(new bw());
  }

  public static com.wandoujia.nirvana.framework.ui.a r(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).a(new com.wandoujia.ripple_framework.c.ap()).b(2131492866, new GiftButtonPresenter()).a(new dh());
  }

  public static com.wandoujia.nirvana.framework.ui.a s(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(new e()).a(new dw()).a(new dx()).a(new dv()).a(new k(0));
  }

  public static com.wandoujia.nirvana.framework.ui.a t(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return s(paramViewGroup, paramk).a(2131493650, new bk(paramViewGroup.getContext())).a(2131492866, new bs()).a(new di());
  }

  public static com.wandoujia.nirvana.framework.ui.a u(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return s(paramViewGroup, paramk).a(new dj()).a(2131493650, new bk(paramViewGroup.getContext())).a(2131492866, new bs());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.aa
 * JD-Core Version:    0.6.0
 */