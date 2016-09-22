package com.wandoujia.log;

import android.content.Context;
import java.util.Map;

final class c
  implements Runnable
{
  c(LogReporter paramLogReporter, LogConfiguration paramLogConfiguration, Context paramContext)
  {
  }

  public final void run()
  {
    LogReporter.access$000(this.c).putAll(this.a.buildStableCommonParams(this.b));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.log.c
 * JD-Core Version:    0.6.0
 */