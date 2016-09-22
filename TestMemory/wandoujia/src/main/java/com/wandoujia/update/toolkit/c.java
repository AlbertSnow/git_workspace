package com.wandoujia.update.toolkit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.wandoujia.update.LocalUpdateService;
import com.wandoujia.update.protocol.UpdateInfo;

final class c
  implements DialogInterface.OnCancelListener
{
  c(UpdateClient paramUpdateClient)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    g.a(UpdateClient.a(this.a).b().getVersion());
    this.a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.update.toolkit.c
 * JD-Core Version:    0.6.0
 */