package com.wandoujia.gamepacket;

import com.wandoujia.api.proto.ExtensionPack;

final class i
  implements Runnable
{
  i(GamePacketInstaller paramGamePacketInstaller, String paramString, ExtensionPack paramExtensionPack, n paramn)
  {
  }

  public final void run()
  {
    GamePacketInstaller.a(this.d, this.a, GamePacketInstaller.InstallStatus.PENDING);
    GamePacketInstaller.b(this.d, this.a, this.b, this.c);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.i
 * JD-Core Version:    0.6.0
 */