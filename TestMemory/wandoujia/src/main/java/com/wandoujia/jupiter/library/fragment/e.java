package com.wandoujia.jupiter.library.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.j;
import de.greenrobot.event.c;

final class e
  implements View.OnClickListener
{
  e(AppInstalledFragment paramAppInstalledFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (((TextView)paramView).getText().equals(this.a.getString(2131625009)))
    {
      ((c)i.k().a("event_bus")).d(new j(EventBusManager.Type.UNINSTALL_ALL, Boolean.valueOf(true)));
      return;
    }
    ((c)i.k().a("event_bus")).d(new j(EventBusManager.Type.UNINSTALL_ALL, Boolean.valueOf(false)));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.e
 * JD-Core Version:    0.6.0
 */