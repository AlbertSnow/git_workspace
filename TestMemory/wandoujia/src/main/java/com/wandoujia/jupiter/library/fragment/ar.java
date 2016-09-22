package com.wandoujia.jupiter.library.fragment;

import android.support.v4.view.ck;
import android.view.View;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.j;
import de.greenrobot.event.c;

final class ar
  implements ck
{
  ar(LibFragment paramLibFragment)
  {
  }

  public final void a(int paramInt)
  {
    if (this.a.b == null);
    while (true)
    {
      return;
      if (paramInt == 1)
        this.a.b.setVisibility(0);
      while (paramInt != 2)
      {
        ((c)i.k().a("event_bus")).d(new j(EventBusManager.Type.MULTI_UNINSTALL, Boolean.valueOf(false)));
        return;
        this.a.b.setVisibility(8);
      }
    }
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public final void b(int paramInt)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.ar
 * JD-Core Version:    0.6.0
 */