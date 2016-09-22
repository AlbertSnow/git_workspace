package com.wandoujia.gamepacket;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.api.proto.ExtensionPack;

final class g
  implements DialogInterface.OnClickListener
{
  g(GamePacketInstaller paramGamePacketInstaller, String paramString, ExtensionPack paramExtensionPack, n paramn)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    GamePacketInstaller.a(this.d, this.a, this.b, this.c);
    paramDialogInterface.dismiss();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.g
 * JD-Core Version:    0.6.0
 */