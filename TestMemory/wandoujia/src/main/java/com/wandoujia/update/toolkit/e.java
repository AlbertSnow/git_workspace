package com.wandoujia.update.toolkit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.update.LocalUpdateService;

final class e
  implements DialogInterface.OnClickListener
{
  e(UpdateClient paramUpdateClient)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    UpdateClient.a(this.a, UpdateClient.Step.DOWNLOAD_AND_INSTALL);
    UpdateClient.a(this.a).e();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.update.toolkit.e
 * JD-Core Version:    0.6.0
 */