package com.wandoujia.launcher.launcher.activity;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.wandoujia.launcher.p;
import de.greenrobot.event.c;

final class h
  implements DialogInterface.OnCancelListener
{
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    c.a().d(new p("show_bottom_label"));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.activity.h
 * JD-Core Version:    0.6.0
 */