package com.wandoujia.p4.app_launcher.manager;

import com.wandoujia.p4.app_launcher.model.ALSuggestion;
import java.lang.ref.WeakReference;
import java.util.List;

final class j
  implements Runnable
{
  j(ALManager paramALManager, ALSuggestion paramALSuggestion, List paramList)
  {
  }

  public final void run()
  {
    if (ALManager.d(this.c) != null)
    {
      l locall = (l)ALManager.d(this.c).get();
      if (locall != null)
        locall.a(this.a, this.b);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.manager.j
 * JD-Core Version:    0.6.0
 */