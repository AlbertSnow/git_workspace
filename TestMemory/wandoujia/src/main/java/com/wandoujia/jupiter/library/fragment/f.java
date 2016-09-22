package com.wandoujia.jupiter.library.fragment;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.j;
import com.wandoujia.ripple_framework.view.a.h;
import com.wandoujia.rootkit.b;
import de.greenrobot.event.c;
import java.util.Set;

final class f
  implements View.OnClickListener
{
  f(AppInstalledFragment paramAppInstalledFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (b.a().c())
    {
      h localh = new h(AppInstalledFragment.b(this.a).getContext());
      Context localContext = AppInstalledFragment.d(this.a).getContext();
      Object[] arrayOfObject = new Object[1];
      if (AppInstalledFragment.c(this.a) != null);
      for (int i = AppInstalledFragment.c(this.a).size(); ; i = 0)
      {
        arrayOfObject[0] = Integer.valueOf(i);
        localh.a(localContext.getString(2131625535, arrayOfObject));
        localh.a(2131625532, new g());
        localh.b(2131624330, null);
        localh.b();
        return;
      }
    }
    ((c)i.k().a("event_bus")).d(new j(EventBusManager.Type.UNINSTALL_APP, null));
    ((c)i.k().a("event_bus")).d(new j(EventBusManager.Type.MULTI_UNINSTALL, Boolean.valueOf(false)));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.f
 * JD-Core Version:    0.6.0
 */