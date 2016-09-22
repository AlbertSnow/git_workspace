package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class LogReportBatchEvent$Builder extends Message.Builder<LogReportBatchEvent>
{
  public Long discarded_event;
  public List<LogReportEvent> event;

  public LogReportBatchEvent$Builder()
  {
  }

  public LogReportBatchEvent$Builder(LogReportBatchEvent paramLogReportBatchEvent)
  {
    super(paramLogReportBatchEvent);
    if (paramLogReportBatchEvent == null)
      return;
    this.event = LogReportBatchEvent.access$000(paramLogReportBatchEvent.event);
    this.discarded_event = paramLogReportBatchEvent.discarded_event;
  }

  public final LogReportBatchEvent build()
  {
    return new LogReportBatchEvent(this, null);
  }

  public final Builder discarded_event(Long paramLong)
  {
    this.discarded_event = paramLong;
    return this;
  }

  public final Builder event(List<LogReportEvent> paramList)
  {
    this.event = checkForNulls(paramList);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.LogReportBatchEvent.Builder
 * JD-Core Version:    0.6.0
 */