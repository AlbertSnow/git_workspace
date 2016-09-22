package com.wandoujia.logv3.toolkit;

import com.wandoujia.logv3.model.packages.ConsumptionEvent.Builder;
import com.wandoujia.logv3.model.packages.EventPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.LogReportEvent.Builder;

final class r
  implements Runnable
{
  private final ConsumptionEvent.Builder a;
  private final ExtraPackage.Builder b;

  private r(l paraml, ConsumptionEvent.Builder paramBuilder, ExtraPackage.Builder paramBuilder1)
  {
    this.a = paramBuilder;
    this.b = paramBuilder1;
  }

  public final void run()
  {
    try
    {
      LogReportEvent.Builder localBuilder = new LogReportEvent.Builder();
      EventPackage.Builder localBuilder1 = new EventPackage.Builder();
      localBuilder1.consumption_event(this.a.build());
      localBuilder.event_package(localBuilder1.build());
      localBuilder.extra_package(this.b.build());
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
 * Qualified Name:     com.wandoujia.logv3.toolkit.r
 * JD-Core Version:    0.6.0
 */