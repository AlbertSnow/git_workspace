package com.wandoujia.p4.app;

import android.content.Context;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import com.wandoujia.rootkit.b;

public class a
{
  private static Context a;

  static
  {
    a.class.getSimpleName();
    a = com.wandoujia.p4.a.a();
  }

  public static void a(String paramString)
  {
    b.a();
    if (!b.b())
    {
      AppManager.a().a(paramString, false);
      return;
    }
    if (BadgeUtil.a(a))
    {
      AppManager.a().a(paramString, false);
      return;
    }
    boolean bool = BadgeUtil.b(a);
    AppManager.a().a(paramString, bool);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.a
 * JD-Core Version:    0.6.0
 */