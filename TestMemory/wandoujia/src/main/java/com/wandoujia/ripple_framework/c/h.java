package com.wandoujia.ripple_framework.c;

import android.view.ViewGroup;
import com.wandoujia.jupiter.presenter.ag;
import com.wandoujia.jupiter.presenter.ep;
import com.wandoujia.jupiter.presenter.eu;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.ripple.b.f;
import com.wandoujia.ripple_framework.view.ToolbarMenuThemeBinder.Theme;

public class h
{
  public static com.wandoujia.nirvana.framework.ui.a a(ViewGroup paramViewGroup)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup).a(R.id.icon, new af()).a(R.id.icon, new ak()).a(R.id.title, new af()).a(R.id.summary, new ad(0)).a(R.id.author, new u(0)).a(new ak());
  }

  public static com.wandoujia.nirvana.framework.ui.a a(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(R.id.title, new af()).a(R.id.description, new ax()).a(R.id.sub_title, new eu()).a(R.id.badge, new af()).a(R.id.action_button, new com.wandoujia.jupiter.presenter.b()).a(R.id.icon, new af()).a(new e()).a(new a());
  }

  public static com.wandoujia.nirvana.framework.ui.a b(ViewGroup paramViewGroup)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    com.wandoujia.nirvana.framework.ui.a locala = new com.wandoujia.nirvana.framework.ui.a(paramViewGroup).a(R.id.text, new ac(0)).a(R.id.text, new ak());
    int i = R.id.text;
    com.wandoujia.ripple_framework.i.k().a("presenter");
    return locala.a(i, new ak());
  }

  public static com.wandoujia.nirvana.framework.ui.a b(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).a(new d());
  }

  public static com.wandoujia.nirvana.framework.ui.a c(ViewGroup paramViewGroup)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup).a(R.id.image, new ag());
  }

  public static com.wandoujia.nirvana.framework.ui.a c(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).a(R.id.symbol, new af()).a(new ay());
  }

  public static com.wandoujia.nirvana.framework.ui.a d(ViewGroup paramViewGroup)
  {
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup).a(R.id.image, new bi());
  }

  public static com.wandoujia.nirvana.framework.ui.a d(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).a(new br()).a(R.id.symbol, new af());
  }

  public static com.wandoujia.nirvana.framework.ui.a e(ViewGroup paramViewGroup)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup).a(new ak());
  }

  public static com.wandoujia.nirvana.framework.ui.a e(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(new av());
  }

  public static com.wandoujia.nirvana.framework.ui.a f(ViewGroup paramViewGroup)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    return h(paramViewGroup).a(R.id.error_report, new x()).a(new com.wandoujia.jupiter.presenter.h());
  }

  public static com.wandoujia.nirvana.framework.ui.a f(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    return a(paramViewGroup, paramk).a(R.id.cover, new ah()).a(R.id.button_install1, new com.wandoujia.jupiter.presenter.b()).a(new as()).a(R.id.verified_icon, new ca()).b(R.id.sub_title, new ai()).b(R.id.badge, new ar());
  }

  public static com.wandoujia.nirvana.framework.ui.a g(ViewGroup paramViewGroup)
  {
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup).a(new i());
  }

  public static com.wandoujia.nirvana.framework.ui.a g(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return w(paramViewGroup, paramk).a(R.id.action_more, new bg(Logger.Module.UI, ViewLogPackage.Element.CARD)).a(R.id.cover, new ah()).a(R.id.container, new bn()).a(R.id.container, new bl()).a(new bp(0));
  }

  public static com.wandoujia.nirvana.framework.ui.a h(ViewGroup paramViewGroup)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    com.wandoujia.nirvana.framework.ui.a locala = new com.wandoujia.nirvana.framework.ui.a(paramViewGroup);
    int i = R.id.icon;
    com.wandoujia.nirvana.framework.ui.b[] arrayOfb = new com.wandoujia.nirvana.framework.ui.b[2];
    arrayOfb[0] = new af();
    arrayOfb[1] = new l();
    return locala.a(i, new com.wandoujia.nirvana.framework.ui.c(arrayOfb)).a(R.id.close, new v()).a(R.id.open_app, new com.wandoujia.ripple_framework.ripple.b.l()).a(new ep()).a(new com.wandoujia.jupiter.presenter.bn()).a(new ae(ToolbarMenuThemeBinder.Theme.BLACK));
  }

  public static com.wandoujia.nirvana.framework.ui.a h(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).b(R.id.sub_title, new bq());
  }

  public static com.wandoujia.nirvana.framework.ui.a i(ViewGroup paramViewGroup)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup).a(R.id.icon, new af()).a(R.id.icon, new ak()).a(R.id.title, new af()).a(R.id.summary, new o()).a(R.id.footer_container, new ak()).a(R.id.main_button, new com.wandoujia.jupiter.presenter.b()).a(R.id.follow, new com.wandoujia.jupiter.presenter.br()).a(R.id.copyright, new z()).a(new n());
  }

  public static com.wandoujia.nirvana.framework.ui.a i(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return a(paramViewGroup, paramk).b(R.id.sub_title, new bz()).a(new aw());
  }

  public static com.wandoujia.nirvana.framework.ui.a j(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return w(paramViewGroup, paramk).a(R.id.container, new bl()).a(R.id.cover, new ah()).a(new bp());
  }

  public static com.wandoujia.nirvana.framework.ui.a k(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(R.id.icon, new af()).a(R.id.title, new af()).a(R.id.sub_title, new r()).a(new p()).a(R.id.action_button, new b());
  }

  public static com.wandoujia.nirvana.framework.ui.a l(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(R.id.icon, new t()).a(R.id.title, new af()).a(R.id.sub_title, new af()).a(new s()).a(new az());
  }

  public static com.wandoujia.nirvana.framework.ui.a m(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(new f()).a(new com.wandoujia.ripple_framework.ripple.b.k()).a(new com.wandoujia.jupiter.presenter.bn()).a(new e()).a(new g()).a(new ae(ToolbarMenuThemeBinder.Theme.WHITE));
  }

  public static com.wandoujia.nirvana.framework.ui.a n(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(R.id.root, new f()).a(new com.wandoujia.ripple_framework.ripple.b.k()).a(R.id.root, new e()).a(new g()).a(new com.wandoujia.ripple_framework.c.a.c()).a(R.id.root, new ak());
  }

  public static com.wandoujia.nirvana.framework.ui.a o(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(R.id.snippet, new af()).a(new com.wandoujia.ripple_framework.ripple.b.k()).a(new com.wandoujia.jupiter.presenter.bn()).a(new ep()).a(R.id.root, new e()).a(new g()).a(new ae(ToolbarMenuThemeBinder.Theme.DARK));
  }

  public static com.wandoujia.nirvana.framework.ui.a p(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(R.id.summary, new af()).a(R.id.description, new af()).a(R.id.sub_title, new af()).a(R.id.icon, new af()).a(new g());
  }

  public static com.wandoujia.nirvana.framework.ui.a q(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(new com.wandoujia.ripple_framework.ripple.b.k()).a(new com.wandoujia.jupiter.presenter.bn()).a(new ae(ToolbarMenuThemeBinder.Theme.DARK)).a(new g()).a(R.id.root, new e());
  }

  public static com.wandoujia.nirvana.framework.ui.a r(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(new com.wandoujia.ripple_framework.ripple.b.e()).a(new com.wandoujia.ripple_framework.ripple.b.k()).a(new com.wandoujia.ripple_framework.c.a.c()).a(new g()).a(R.id.root, new e()).a(R.id.root, new ak());
  }

  public static com.wandoujia.nirvana.framework.ui.a s(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(new com.wandoujia.ripple_framework.c.a.e()).a(new com.wandoujia.ripple_framework.ripple.b.k()).a(R.id.cover, new bi()).a(new ae(ToolbarMenuThemeBinder.Theme.DARK)).a(new com.wandoujia.jupiter.presenter.bn()).a(R.id.root, new e()).a(new g());
  }

  public static com.wandoujia.nirvana.framework.ui.a t(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(new com.wandoujia.ripple_framework.ripple.b.h()).a(new com.wandoujia.ripple_framework.ripple.b.k()).a(R.id.cover, new com.wandoujia.ripple_framework.c.a.b()).a(new ae(ToolbarMenuThemeBinder.Theme.DARK)).a(new com.wandoujia.jupiter.presenter.bn()).a(R.id.root, new e()).a(new g());
  }

  public static com.wandoujia.nirvana.framework.ui.a u(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(R.id.root, new com.wandoujia.ripple_framework.ripple.b.d()).a(new com.wandoujia.ripple_framework.ripple.b.k()).a(R.id.cover_container, new com.wandoujia.ripple_framework.c.a.a()).a(R.id.root, new e()).a(R.id.root, new ak()).a(new com.wandoujia.ripple_framework.c.a.c()).a(new g());
  }

  public static com.wandoujia.nirvana.framework.ui.a v(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(R.id.description, new af()).a(new k());
  }

  private static com.wandoujia.nirvana.framework.ui.a w(ViewGroup paramViewGroup, com.wandoujia.ripple_framework.k paramk)
  {
    com.wandoujia.ripple_framework.i.k().a("presenter");
    return new com.wandoujia.nirvana.framework.ui.a(paramViewGroup, paramk).a(R.id.title, new af()).a(R.id.description, new ax()).a(R.id.sub_title, new eu()).a(R.id.badge, new af()).a(R.id.action_button, new com.wandoujia.jupiter.presenter.b()).a(R.id.icon, new af()).a(new e()).a(new a());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.h
 * JD-Core Version:    0.6.0
 */