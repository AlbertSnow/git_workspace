package com.wandoujia.launcher_base.a.b;

import com.wandoujia.entities.app.AppLiteInfo;
import com.wandoujia.gson.c;
import com.wandoujia.gson.j;

public final class a
{
  private static c a;

  static
  {
    c localc = new c();
    j localj = new j();
    localj.a(com.wandoujia.gson.b.a.get(AppLiteInfo.class).getType(), new b(localc));
    a = localj.a();
  }

  public static c a()
  {
    return a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.a.b.a
 * JD-Core Version:    0.6.0
 */