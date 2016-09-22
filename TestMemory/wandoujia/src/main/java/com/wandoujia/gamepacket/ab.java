package com.wandoujia.gamepacket;

import android.widget.Toast;
import com.wandoujia.base.config.GlobalConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ab
{
  ab(GamePacketInstaller paramGamePacketInstaller, String paramString)
  {
  }

  public final void a(int paramInt)
  {
    GamePacketInstaller.a(this.b, this.a, paramInt);
  }

  public final void a(UnZipManager.UnZipStatus paramUnZipStatus)
  {
    if (paramUnZipStatus == UnZipManager.UnZipStatus.UNZIPPING)
      GamePacketInstaller.a(this.b, this.a, GamePacketInstaller.InstallStatus.INSTALLING);
    do
      return;
    while (paramUnZipStatus != UnZipManager.UnZipStatus.FAILED_INSUFFICIENT_STORAGE);
    Toast.makeText(GlobalConfig.getAppContext(), R.string.unzipping_failed_insufficient_storage, 1).show();
  }

  public final void a(Set<String> paramSet)
  {
    GamePacketInstaller.a(this.b, this.a, GamePacketInstaller.InstallStatus.INSTALL_APK);
    Iterator localIterator = paramSet.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!str.endsWith(".apk"))
        continue;
      GamePacketInstaller.b(this.b).put(this.a, str);
      GamePacketInstaller.a(this.b, this.a, str);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.ab
 * JD-Core Version:    0.6.0
 */