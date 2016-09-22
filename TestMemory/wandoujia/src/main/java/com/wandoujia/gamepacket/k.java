package com.wandoujia.gamepacket;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class k
  implements Runnable
{
  k(GamePacketInstaller paramGamePacketInstaller, String paramString, GamePacketInstaller.InstallStatus paramInstallStatus)
  {
  }

  public final void run()
  {
    GamePacketInstaller.e(this.c).put(this.a, this.b);
    Iterator localIterator = GamePacketInstaller.f(this.c).iterator();
    while (localIterator.hasNext())
      ((m)localIterator.next()).a(this.a, this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.k
 * JD-Core Version:    0.6.0
 */