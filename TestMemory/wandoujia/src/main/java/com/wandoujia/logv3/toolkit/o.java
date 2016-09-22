package com.wandoujia.logv3.toolkit;

import com.wandoujia.logv3.f;
import com.wandoujia.logv3.model.packages.ApplicationCrashEvent.Builder;
import com.wandoujia.logv3.model.packages.EventPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.LogReportEvent.Builder;

final class o
  implements Runnable
{
  private final ApplicationCrashEvent.Builder a;

  private o(l paraml, ApplicationCrashEvent.Builder paramBuilder)
  {
    this.a = paramBuilder;
  }

  public final void run()
  {
    LogReportEvent.Builder localBuilder = new LogReportEvent.Builder();
    EventPackage.Builder localBuilder1 = new EventPackage.Builder();
    localBuilder1.crash_event(this.a.build());
    localBuilder.event_package(localBuilder1.build());
    ExtraPackage.Builder localBuilder2 = new ExtraPackage.Builder();
    localBuilder2.device_package(l.a(this.b).a());
    localBuilder.extra_package(localBuilder2.build());
    l.a(this.b).onEventSync(localBuilder);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.o
 * JD-Core Version:    0.6.0
 */