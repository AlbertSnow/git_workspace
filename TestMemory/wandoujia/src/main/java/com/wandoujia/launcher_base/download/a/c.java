package com.wandoujia.launcher_base.download.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.i;

final class c
  implements DialogInterface.OnClickListener
{
  c(b paramb)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ((DownloadManager)i.k().a("download")).b(b.a(this.a));
    b.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.download.a.c
 * JD-Core Version:    0.6.0
 */