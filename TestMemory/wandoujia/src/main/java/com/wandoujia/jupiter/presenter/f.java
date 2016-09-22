package com.wandoujia.jupiter.presenter;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.j;
import de.greenrobot.event.c;

final class f
  implements DialogInterface.OnClickListener
{
  f(e parame)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ((c)i.k().a("event_bus")).d(new j(EventBusManager.Type.DOWNLOAD_CLEAR_TASKS_ACTION, this.a.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.f
 * JD-Core Version:    0.6.0
 */