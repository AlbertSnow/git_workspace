package com.wandoujia.update.toolkit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.update.LocalUpdateService;
import com.wandoujia.update.protocol.UpdateInfo;

final class d
  implements DialogInterface.OnClickListener
{
  d(UpdateClient paramUpdateClient)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    g.a(UpdateClient.a(this.a).b().getVersion());
    this.a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.update.toolkit.d
 * JD-Core Version:    0.6.0
 */