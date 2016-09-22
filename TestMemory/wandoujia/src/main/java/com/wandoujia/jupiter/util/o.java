package com.wandoujia.jupiter.util;

import com.wandoujia.base.log.Log;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.TimingPackage.Builder;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class o
{
  private static o b;
  private List<p> a = new ArrayList();
  private long c = 0L;
  private long d = 0L;

  public static o a()
  {
    if (b == null)
      b = new o();
    return b;
  }

  public final void a(String paramString)
  {
    this.a.add(new p(paramString, System.currentTimeMillis() - this.c));
  }

  public final void b()
  {
    long l = System.currentTimeMillis();
    this.d = l;
    this.c = l;
    this.a.clear();
  }

  public final void c()
  {
    long l1 = System.currentTimeMillis();
    long l2 = l1 - this.d;
    if (l2 > 600000L)
      return;
    this.a.add(new p("LaunchTimer_total", l2));
    TaskEvent.Builder localBuilder1 = new TaskEvent.Builder().status(TaskEvent.Status.END).action(TaskEvent.Action.LAUNCH).result(TaskEvent.Result.SUCCESS);
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      p localp = (p)localIterator.next();
      localStringBuilder.append(localp.a).append(": ").append(String.valueOf(localp.b)).append("\n");
    }
    Log.d("LaunchTimer_detail", localStringBuilder.toString(), new Object[0]);
    TaskEvent.Builder localBuilder2 = localBuilder1.result_info(localStringBuilder.toString());
    ExtraPackage.Builder localBuilder = new ExtraPackage.Builder().timing_package(new TimingPackage.Builder().start(Long.valueOf(this.d)).end(Long.valueOf(l1)).duration(Long.valueOf(l2)).build());
    if (Config.Z())
      localBuilder2.identity(Integer.valueOf(1));
    while (true)
    {
      i.k().h().a(localBuilder2, localBuilder);
      return;
      localBuilder2.identity(Integer.valueOf(0));
      Config.Y();
    }
  }

  public final void d()
  {
    this.c = System.currentTimeMillis();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.o
 * JD-Core Version:    0.6.0
 */