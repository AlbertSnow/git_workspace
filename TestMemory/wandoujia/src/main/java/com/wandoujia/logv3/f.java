package com.wandoujia.logv3;

import android.content.Context;
import com.wandoujia.base.concurrent.CachedThreadPoolExecutorWithCapacity;
import com.wandoujia.logv3.model.packages.CommonPackage;
import com.wandoujia.logv3.model.packages.DevicePackage;
import com.wandoujia.logv3.model.packages.LaunchSourcePackage;
import com.wandoujia.logv3.model.packages.LogReportEvent.Builder;
import java.util.concurrent.Executor;

public class f
{
  private static final String a = f.class.getSimpleName() + "v3";
  private final Context b;
  private final Executor c;
  private final b d;
  private final c e;
  private final LogSender f;
  private CommonPackage g;
  private DevicePackage h;

  f(Context paramContext, b paramb, c paramc, LogSender paramLogSender)
  {
    this.b = paramContext;
    this.c = new CachedThreadPoolExecutorWithCapacity(1, 600000L, "log-reporterv3-thread");
    this.d = paramb;
    this.e = paramc;
    this.f = paramLogSender;
    this.c.execute(new g(this, paramc, paramContext));
  }

  public final DevicePackage a()
  {
    if (this.h == null)
      this.h = this.e.a(this.b);
    return this.h;
  }

  public final void a(LaunchSourcePackage paramLaunchSourcePackage)
  {
    this.c.execute(new h(this, paramLaunchSourcePackage));
  }

  public void onEvent(LogReportEvent.Builder paramBuilder)
  {
    this.c.execute(new j(this, paramBuilder, 0));
  }

  public void onEventSync(LogReportEvent.Builder paramBuilder)
  {
    new j(this, paramBuilder.real_time(Boolean.valueOf(true)), 0).run();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.f
 * JD-Core Version:    0.6.0
 */