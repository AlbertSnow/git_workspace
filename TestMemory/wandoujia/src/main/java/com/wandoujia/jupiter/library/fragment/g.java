package com.wandoujia.jupiter.library.fragment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.j;
import de.greenrobot.event.c;

final class g
  implements DialogInterface.OnClickListener
{
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ((c)i.k().a("event_bus")).d(new j(EventBusManager.Type.UNINSTALL_APP, null));
    ((c)i.k().a("event_bus")).d(new j(EventBusManager.Type.MULTI_UNINSTALL, Boolean.valueOf(false)));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.g
 * JD-Core Version:    0.6.0
 */