package com.wandoujia.logv3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.logv3.model.packages.LogReportEvent;
import com.wandoujia.logv3.model.packages.LogReportEvent.Builder;

final class j
  implements Runnable
{
  private final LogReportEvent.Builder a;

  private j(f paramf, LogReportEvent.Builder paramBuilder)
  {
    this.a = paramBuilder;
  }

  public final void run()
  {
    this.a.common_package(f.c(this.b).a(f.d(this.b), f.b(this.b)));
    long l = f.d(this.b).getSharedPreferences("log_modulev3", 0).getLong("last_send_id", 0L);
    this.a.local_increment_id(Long.valueOf(l));
    this.a.proto_version("1.1.1");
    SharedPreferences.Editor localEditor = f.d(this.b).getSharedPreferences("log_modulev3", 0).edit();
    localEditor.putLong("last_send_id", l + 1L);
    SharePrefSubmitor.submit(localEditor);
    LogReportEvent localLogReportEvent = this.a.build();
    if (GlobalConfig.isDebug())
    {
      f.b();
      localLogReportEvent.toString();
    }
    f.a(this.b).a(localLogReportEvent);
    f.e(this.b).a(this.a.real_time.booleanValue());
    if (f.c(this.b).k() != null)
      f.c(this.b).k().onEvent(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.j
 * JD-Core Version:    0.6.0
 */