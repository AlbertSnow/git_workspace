package com.wandoujia.gamepacket;

import android.content.Context;
import com.wandoujia.api.proto.DownloadUrl;
import com.wandoujia.api.proto.ExtensionPack;
import com.wandoujia.base.utils.NetworkUtil;
import java.util.Map;

final class j
  implements Runnable
{
  j(GamePacketInstaller paramGamePacketInstaller, n paramn, DownloadUrl paramDownloadUrl, ExtensionPack paramExtensionPack, String paramString)
  {
  }

  public final void run()
  {
    if (this.a != null)
    {
      if (this.b != null)
      {
        this.a.a(this.c, this.b);
        GamePacketInstaller.a(this.e, this.d, GamePacketInstaller.InstallStatus.DOWNLOADING);
        GamePacketInstaller.c(this.e).remove(this.d);
      }
    }
    else
      return;
    if (!NetworkUtil.isNetworkConnected())
      this.a.a(GamePacketInstaller.d(this.e).getString(R.string.game_packet_network_wait));
    while (true)
    {
      GamePacketInstaller.a(this.e, this.d, GamePacketInstaller.InstallStatus.FAILED);
      return;
      GamePacketInstaller.c(this.e).remove(this.d);
      this.a.a(GamePacketInstaller.d(this.e).getString(R.string.game_packet_not_available));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.j
 * JD-Core Version:    0.6.0
 */