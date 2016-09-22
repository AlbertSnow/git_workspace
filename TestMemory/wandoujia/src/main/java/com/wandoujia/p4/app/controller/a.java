package com.wandoujia.p4.app.controller;

import com.wandoujia.base.utils.ThreadPool;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a
{
  private static a a = new a();
  private final Map<String, AppCommenter> b = new ConcurrentHashMap();

  public static a a()
  {
    return a;
  }

  public static void a(c paramc)
  {
    ThreadPool.execute(new b(paramc));
  }

  public final void a(AppCommenter paramAppCommenter)
  {
    paramAppCommenter.b();
    this.b.put(paramAppCommenter.a(), paramAppCommenter);
  }

  public final void a(String paramString1, String paramString2)
  {
    AppCommenter localAppCommenter = (AppCommenter)this.b.get(paramString1);
    if (localAppCommenter != null)
      localAppCommenter.c(paramString2).b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.controller.a
 * JD-Core Version:    0.6.0
 */