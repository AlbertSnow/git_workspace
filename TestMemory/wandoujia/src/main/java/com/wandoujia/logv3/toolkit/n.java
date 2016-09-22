package com.wandoujia.logv3.toolkit;

import com.wandoujia.logv3.f;
import com.wandoujia.logv3.model.packages.ApplicationActiveEvent.Builder;
import com.wandoujia.logv3.model.packages.EventPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.LogReportEvent.Builder;

final class n
  implements Runnable
{
  private n(l paraml)
  {
  }

  public final void run()
  {
    try
    {
      LogReportEvent.Builder localBuilder = new LogReportEvent.Builder();
      EventPackage.Builder localBuilder1 = new EventPackage.Builder();
      localBuilder1.active_event(new ApplicationActiveEvent.Builder().build());
      localBuilder.event_package(localBuilder1.build());
      ExtraPackage.Builder localBuilder2 = new ExtraPackage.Builder();
      localBuilder2.device_package(l.a(this.a).a());
      localBuilder.extra_package(localBuilder2.build());
      l.a(this.a, localBuilder.real_time(Boolean.valueOf(true)));
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      ae.a(localRuntimeException);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.n
 * JD-Core Version:    0.6.0
 */