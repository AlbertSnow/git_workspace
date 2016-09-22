package com.wandoujia.logv3.toolkit;

import com.wandoujia.logv3.model.packages.ClickEvent.Builder;
import com.wandoujia.logv3.model.packages.EventPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.LogReportEvent.Builder;
import com.wandoujia.logv3.model.packages.UrlPackage;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;

final class q
  implements Runnable
{
  private final ab a;

  private q(l paraml, ab paramab)
  {
    this.a = paramab;
  }

  public final void run()
  {
    try
    {
      ad localad = l.c(this.b).a(this.a);
      LogReportEvent.Builder localBuilder = new LogReportEvent.Builder();
      EventPackage.Builder localBuilder1 = new EventPackage.Builder();
      ClickEvent.Builder localBuilder2 = new ClickEvent.Builder();
      ViewLogPackage.Builder localBuilder3 = localad.a;
      l.a(this.b, localBuilder3.url_package.url);
      localBuilder2.click(localBuilder3.build()).refer_click(new ViewLogPackage.Builder(l.f(this.b)).build()).from_click(new ViewLogPackage.Builder(l.e(this.b)).build());
      l.b(this.b, localBuilder3.build());
      localBuilder1.click_event(localBuilder2.build());
      localBuilder.event_package(localBuilder1.build());
      localBuilder.extra_package(localad.b.build());
      l.a(this.b, localBuilder.real_time(Boolean.valueOf(true)));
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      ae.a(localRuntimeException);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.q
 * JD-Core Version:    0.6.0
 */