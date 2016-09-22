package com.wandoujia.appmanager;

import java.util.Map;

final class ah
{
  ah(AppManager paramAppManager)
  {
  }

  public final void a(String paramString)
  {
    synchronized (AppManager.a(this.a))
    {
      AppManager.a(this.a).put(paramString, AppManager.AppState.WAITING_INSTALL);
      AppManager.a(this.a, new e());
      return;
    }
  }

  public final void a(String paramString, int paramInt)
  {
    synchronized (AppManager.a(this.a))
    {
      AppManager.a(this.a).remove(paramString);
      AppManager.a(this.a, new g(paramString, paramInt));
      return;
    }
  }

  public final void b(String paramString)
  {
    synchronized (AppManager.a(this.a))
    {
      AppManager.a(this.a).remove(paramString);
      AppManager.a(this.a, new f());
      return;
    }
  }

  public final void b(String paramString, int paramInt)
  {
    synchronized (AppManager.a(this.a))
    {
      AppManager.a(this.a).remove(paramString);
      AppManager.a(this.a, new h(paramString, paramInt));
      return;
    }
  }

  public final void c(String paramString)
  {
    synchronized (AppManager.a(this.a))
    {
      AppManager.a(this.a).put(paramString, AppManager.AppState.INSTALLING);
      AppManager.a(this.a, new i());
      return;
    }
  }

  public final void d(String paramString)
  {
    synchronized (AppManager.a(this.a))
    {
      AppManager.a(this.a).put(paramString, AppManager.AppState.UNINSTALLING);
      if (this.a.f(paramString) == null)
        return;
    }
    AppManager.a(this.a, new j());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.ah
 * JD-Core Version:    0.6.0
 */