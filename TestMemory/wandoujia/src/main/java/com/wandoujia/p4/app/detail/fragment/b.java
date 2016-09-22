package com.wandoujia.p4.app.detail.fragment;

import android.os.Handler;
import com.wandoujia.p4.a;
import com.wandoujia.p4.app.controller.AppCommenter.Enjoy;
import com.wandoujia.p4.app.controller.h;
import com.wandoujia.p4.configs.Config;

final class b
  implements h
{
  b(AppCommentsFragment paramAppCommentsFragment)
  {
  }

  public final void a()
  {
    Config.b(null);
    Config.c(null);
    a.d().post(new c(this));
  }

  public final void a(String paramString, AppCommenter.Enjoy paramEnjoy)
  {
    Config.b(paramString);
    if (paramEnjoy == null);
    for (String str = AppCommenter.Enjoy.UNKNOWN.name(); ; str = paramEnjoy.name())
    {
      Config.c(str);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.fragment.b
 * JD-Core Version:    0.6.0
 */