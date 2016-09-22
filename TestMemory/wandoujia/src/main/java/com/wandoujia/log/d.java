package com.wandoujia.log;

final class d
  implements Runnable
{
  private final LogEventModel a;

  private d(LogReporter paramLogReporter, LogEventModel paramLogEventModel)
  {
    this.a = paramLogEventModel;
  }

  public final void run()
  {
    LogReporter.access$200(this.b, this.a.b);
    LogReporter.access$300(this.b).a(this.a);
    if (this.a.d == LogEventModel.Priority.REAL_TIME);
    for (boolean bool = true; ; bool = false)
    {
      LogReporter.access$400(this.b).triggerSend(bool);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.log.d
 * JD-Core Version:    0.6.0
 */