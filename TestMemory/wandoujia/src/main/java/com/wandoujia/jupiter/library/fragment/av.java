package com.wandoujia.jupiter.library.fragment;

import com.wandoujia.account.listener.IAccountListener;
import com.wandoujia.account.listener.IAccountListener.LoginType;

final class av
  implements IAccountListener
{
  private av(LibFragment paramLibFragment)
  {
  }

  public final void a()
  {
    LibFragment.c(this.a);
  }

  public final void a(IAccountListener.LoginType paramLoginType)
  {
    if (IAccountListener.LoginType.LOGIN.equals(paramLoginType))
      LibFragment.c(this.a);
  }

  public final void a(boolean paramBoolean)
  {
    LibFragment.c(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.av
 * JD-Core Version:    0.6.0
 */