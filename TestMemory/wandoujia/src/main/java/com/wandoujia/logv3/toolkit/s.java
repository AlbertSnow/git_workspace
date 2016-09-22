package com.wandoujia.logv3.toolkit;

import com.wandoujia.logv3.f;
import com.wandoujia.logv3.model.packages.ApplicationStartEvent;
import com.wandoujia.logv3.model.packages.ApplicationStartEvent.Reason;
import com.wandoujia.logv3.model.packages.EventPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.LaunchSourcePackage;
import com.wandoujia.logv3.model.packages.LogReportEvent.Builder;

final class s
  implements Runnable
{
  private final LaunchSourcePackage a;
  private final ApplicationStartEvent b;

  private s(l paraml, LaunchSourcePackage paramLaunchSourcePackage, ApplicationStartEvent paramApplicationStartEvent)
  {
    this.a = paramLaunchSourcePackage;
    this.b = paramApplicationStartEvent;
  }

  public final void run()
  {
    try
    {
      if (this.b.reason == ApplicationStartEvent.Reason.NEW)
      {
        l.b(this.c, null);
        l.b(this.c);
        l.c(this.c, null);
        l.a(this.c, null);
      }
      if (this.b.reason != ApplicationStartEvent.Reason.RESTART)
        l.a(this.c).a(this.a);
      LogReportEvent.Builder localBuilder = new LogReportEvent.Builder();
      EventPackage.Builder localBuilder1 = new EventPackage.Builder();
      localBuilder1.start_event(this.b);
      localBuilder.event_package(localBuilder1.build());
      localBuilder.extra_package(new ExtraPackage.Builder().build());
      l.a(this.c, localBuilder.real_time(Boolean.valueOf(true)));
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      ae.a(localRuntimeException);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.s
 * JD-Core Version:    0.6.0
 */