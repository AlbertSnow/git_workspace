package com.wandoujia.plugin.qr;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;

public final class f
  implements DialogInterface.OnCancelListener, DialogInterface.OnClickListener, Runnable
{
  private final Activity a;

  public f(Activity paramActivity)
  {
    this.a = paramActivity;
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    run();
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    run();
  }

  public final void run()
  {
    this.a.finish();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.plugin.qr.f
 * JD-Core Version:    0.6.0
 */