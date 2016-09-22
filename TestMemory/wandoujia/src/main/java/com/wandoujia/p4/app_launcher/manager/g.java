package com.wandoujia.p4.app_launcher.manager;

final class g
  implements Runnable
{
  g(ALManager paramALManager)
  {
  }

  public final void run()
  {
    try
    {
      ALManager.c(this.a);
      if ((b.b() != null) && (com.wandoujia.p4.app_launcher.f.b.a()))
        com.wandoujia.p4.app_launcher.f.b.a(false);
      return;
    }
    catch (Throwable localThrowable)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.manager.g
 * JD-Core Version:    0.6.0
 */