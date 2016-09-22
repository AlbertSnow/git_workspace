package com.wandoujia.gamepacket;

import java.util.Iterator;
import java.util.List;

final class l
  implements Runnable
{
  l(GamePacketInstaller paramGamePacketInstaller, String paramString, int paramInt)
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
 * Qualified Name:     com.wandoujia.gamepacket.l
 * JD-Core Version:    0.6.0
 */