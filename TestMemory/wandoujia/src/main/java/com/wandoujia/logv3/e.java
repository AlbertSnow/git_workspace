package com.wandoujia.logv3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.LogTrackPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.toolkit.v;

final class e
{
  private static e d;
  private SharedPreferences a;
  private b b;
  private boolean c = false;

  private e(Context paramContext, b paramb)
  {
    this.b = paramb;
    String str = paramContext.getApplicationInfo().packageName;
    this.a = paramContext.getSharedPreferences("LogMonitor_" + str, 0);
    if (this.a == null)
      return;
    this.c = true;
  }

  static e a()
  {
    return d;
  }

  static void a(Context paramContext, b paramb)
  {
    d = new e(paramContext, paramb);
  }

  final void a(long paramLong)
  {
    if (!this.c);
    do
    {
      return;
      this.a.edit().putLong("send_completed", paramLong + this.a.getLong("send_completed", 0L)).commit();
    }
    while (System.currentTimeMillis() % 1000L != 0L);
    LogTrackPackage.Builder localBuilder = new LogTrackPackage.Builder();
    localBuilder.prepare(Long.valueOf(this.a.getLong("prepare_send", 0L))).database(Long.valueOf(this.b.a())).completed(Long.valueOf(this.a.getLong("send_completed", 0L))).discard(Long.valueOf(this.a.getLong("discard", 0L)));
    TaskEvent.Builder localBuilder1 = new TaskEvent.Builder();
    localBuilder1.action(TaskEvent.Action.LOG_TRACK).result(TaskEvent.Result.SUCCESS).status(TaskEvent.Status.END);
    v.b().a(localBuilder1, new ExtraPackage.Builder().log_track_package(localBuilder.build()));
  }

  final void b()
  {
    if (!this.c)
      return;
    this.a.edit().putLong("prepare_send", 1L + this.a.getLong("prepare_send", 0L)).commit();
  }

  final void b(long paramLong)
  {
    if (!this.c)
      return;
    this.a.edit().putLong("discard", paramLong + this.a.getLong("discard", 0L)).commit();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.e
 * JD-Core Version:    0.6.0
 */