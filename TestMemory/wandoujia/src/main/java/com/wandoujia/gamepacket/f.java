package com.wandoujia.gamepacket;

import java.util.Iterator;
import java.util.List;

final class f
  implements Runnable
{
  f(GamePacketInstaller paramGamePacketInstaller, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    Iterator localIterator = GamePacketInstaller.f(this.c).iterator();
    while (localIterator.hasNext())
      ((m)localIterator.next()).a(this.a, this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.f
 * JD-Core Version:    0.6.0
 */