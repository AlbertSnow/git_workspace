package com.wandoujia.logv3.toolkit;

import android.os.Handler;
import android.os.HandlerThread;
import com.wandoujia.logv3.f;
import com.wandoujia.logv3.model.packages.ApplicationCrashEvent.Builder;
import com.wandoujia.logv3.model.packages.ApplicationStartEvent;
import com.wandoujia.logv3.model.packages.ConsumptionEvent.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.LaunchSourcePackage;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage;

public class l
{
  private final f a;
  private final Handler b;
  private final ac c;
  private ViewLogPackage d;
  private ViewLogPackage e;
  private ViewLogPackage f;
  private ViewLogPackage g;

  l(f paramf)
  {
    this.a = paramf;
    this.c = new ac();
    HandlerThread localHandlerThread = new HandlerThread("ui-log-v3-handler");
    localHandlerThread.start();
    this.b = new Handler(localHandlerThread.getLooper());
  }

  final void a()
  {
    this.b.post(new n(this, 0));
  }

  final void a(ApplicationCrashEvent.Builder paramBuilder)
  {
    new o(this, paramBuilder.view(this.g), 0).run();
  }

  final void a(ConsumptionEvent.Builder paramBuilder, ExtraPackage.Builder paramBuilder1)
  {
    this.b.post(new r(this, paramBuilder.view(this.g).from_page(this.f), paramBuilder1, 0));
  }

  final void a(LaunchSourcePackage paramLaunchSourcePackage, ApplicationStartEvent paramApplicationStartEvent)
  {
    this.b.post(new s(this, paramLaunchSourcePackage, paramApplicationStartEvent, 0));
  }

  final void a(TaskEvent.Builder paramBuilder, ExtraPackage.Builder paramBuilder1)
  {
    this.b.post(new u(this, paramBuilder, paramBuilder1, 0));
  }

  final void a(ab paramab)
  {
    this.b.post(new t(this, paramab, 0));
  }

  final void b()
  {
    this.b.post(new m(this));
  }

  final void b(ab paramab)
  {
    this.b.post(new p(this, paramab, 0));
  }

  final void c(ab paramab)
  {
    this.b.post(new q(this, paramab, 0));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.l
 * JD-Core Version:    0.6.0
 */