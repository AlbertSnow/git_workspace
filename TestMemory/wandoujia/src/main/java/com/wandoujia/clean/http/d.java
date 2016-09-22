package com.wandoujia.clean.http;

import com.wandoujia.entities.app.AppLiteInfo;
import com.wandoujia.gson.b.a;
import com.wandoujia.gson.c;
import com.wandoujia.gson.j;

public final class d
{
  private static c a;

  static
  {
    c localc = new c();
    j localj = new j();
    localj.a(a.get(AppLiteInfo.class).getType(), new e(localc));
    a = localj.a();
  }

  public static c a()
  {
    return a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.http.d
 * JD-Core Version:    0.6.0
 */