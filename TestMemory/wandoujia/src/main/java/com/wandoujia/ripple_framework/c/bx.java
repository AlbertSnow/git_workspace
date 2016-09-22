package com.wandoujia.ripple_framework.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.ripple_framework.Config;

final class bx
  implements DialogInterface.OnClickListener
{
  bx(bs parambs, CheckBox paramCheckBox)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.a.isChecked())
      Config.g();
    AppManager.a().b(bs.a(this.b), true);
    bs.d(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.bx
 * JD-Core Version:    0.6.0
 */