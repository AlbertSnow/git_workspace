package com.wandoujia.launcher_base.app.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.appmanager.AppManager;

final class b
  implements DialogInterface.OnClickListener
{
  b(a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    com.wandoujia.launcher_base.utils.a.a(a.a(this.a), "general");
    AppManager.a().b(a.a(this.a), true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.app.a.b
 * JD-Core Version:    0.6.0
 */