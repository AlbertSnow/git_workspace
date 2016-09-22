package com.wandoujia.p4.app_launcher.b;

import com.wandoujia.p4.app_launcher.manager.ALManager.CellEvent;
import com.wandoujia.p4.app_launcher.manager.k;

final class n
  implements k
{
  n(m paramm)
  {
  }

  public final void onEvent(ALManager.CellEvent paramCellEvent)
  {
    if ((ALManager.CellEvent.CLEAN_SCAN.equals(paramCellEvent)) && (m.a(this.a) != null) && (m.b(this.a) != null))
    {
      o.a(m.a(this.a));
      o.a(m.a(this.a), m.b(this.a));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.n
 * JD-Core Version:    0.6.0
 */