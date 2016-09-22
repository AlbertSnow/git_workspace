package com.wandoujia.p4.app_launcher.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import android.view.View.OnClickListener;

final class e
  implements DialogInterface.OnCancelListener
{
  e(View.OnClickListener paramOnClickListener, View paramView)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.a != null)
      this.a.onClick(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.c.e
 * JD-Core Version:    0.6.0
 */