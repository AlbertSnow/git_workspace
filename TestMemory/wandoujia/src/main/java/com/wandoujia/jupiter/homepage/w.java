package com.wandoujia.jupiter.homepage;

import com.wandoujia.account.dto.Role;
import com.wandoujia.account.listener.IAccountListener;
import com.wandoujia.account.listener.IAccountListener.LoginType;
import com.wandoujia.base.utils.OemUtil;

final class w
  implements IAccountListener
{
  private w(HomePageFragment paramHomePageFragment)
  {
  }

  public final void a()
  {
    HomePageFragment.r(this.a);
    if (OemUtil.isOemOrPaid());
    do
      return;
    while (!com.wandoujia.account.a.a(Role.ROLE_SUBSCRIBER));
    HomePageFragment.s(this.a);
  }

  public final void a(IAccountListener.LoginType paramLoginType)
  {
    HomePageFragment.r(this.a);
    if (OemUtil.isOemOrPaid());
    do
      return;
    while ((!IAccountListener.LoginType.LOGIN.equals(paramLoginType)) || (!com.wandoujia.account.a.a(Role.ROLE_SUBSCRIBER)));
    HomePageFragment.s(this.a);
  }

  public final void a(boolean paramBoolean)
  {
    HomePageFragment.s(this.a);
    com.wandoujia.jupiter.subscribe.a.a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.w
 * JD-Core Version:    0.6.0
 */