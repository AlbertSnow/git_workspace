package com.wandoujia.logv3.toolkit;

import android.text.TextUtils;
import com.wandoujia.logv3.model.packages.EventPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.LogReportEvent.Builder;
import com.wandoujia.logv3.model.packages.ShowEvent.Builder;
import com.wandoujia.logv3.model.packages.ShowEvent.Type;
import com.wandoujia.logv3.model.packages.UrlPackage;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;

final class t
  implements Runnable
{
  private final ab a;

  private t(l paraml, ab paramab)
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
      ShowEvent.Builder localBuilder2 = new ShowEvent.Builder();
      ViewLogPackage.Builder localBuilder3 = localad.a;
      if (localBuilder3.url_package != null)
      {
        if (TextUtils.isEmpty(localBuilder3.url_package.url))
          return;
        if ((l.d(this.b) == null) || (l.d(this.b).url_package == null) || (l.d(this.b).url_package.url == null) || (!l.d(this.b).url_package.url.equals(localBuilder3.url_package.url)))
        {
          l.a(this.b, localBuilder3.url_package.url);
          l.c(this.b, new ViewLogPackage.Builder(l.d(this.b)).build());
          l.a(this.b, localBuilder3.build());
          localBuilder2.type(ShowEvent.Type.PAGE).view(localBuilder3.build()).from_page(new ViewLogPackage.Builder(l.g(this.b)).build()).refer_click(new ViewLogPackage.Builder(l.f(this.b)).build()).from_click(new ViewLogPackage.Builder(l.e(this.b)).build());
          localBuilder1.show_event(localBuilder2.build());
          localBuilder.event_package(localBuilder1.build());
          localBuilder.extra_package(localad.b.build());
          l.a(this.b, localBuilder.real_time(Boolean.valueOf(true)));
          l.class.getSimpleName();
          new StringBuilder("[Page Show] ").append(localBuilder3.url_package.url);
          return;
        }
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      ae.a(localRuntimeException);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.t
 * JD-Core Version:    0.6.0
 */