package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class LogReportBatchEvent extends Message
{
  public static final Long DEFAULT_DISCARDED_EVENT;
  public static final List<LogReportEvent> DEFAULT_EVENT = Collections.emptyList();

  @ProtoField(tag=2, type=Message.Datatype.INT64)
  public final Long discarded_event;

  @ProtoField(label=Message.Label.REPEATED, tag=1)
  public final List<LogReportEvent> event;

  static
  {
    DEFAULT_DISCARDED_EVENT = Long.valueOf(0L);
  }

  private LogReportBatchEvent(LogReportBatchEvent.Builder paramBuilder)
  {
    super(paramBuilder);
    this.event = immutableCopyOf(paramBuilder.event);
    this.discarded_event = paramBuilder.discarded_event;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    LogReportBatchEvent localLogReportBatchEvent;
    do
    {
      return true;
      if (!(paramObject instanceof LogReportBatchEvent))
        return false;
      localLogReportBatchEvent = (LogReportBatchEvent)paramObject;
    }
    while ((equals(this.event, localLogReportBatchEvent.event)) && (equals(this.discarded_event, localLogReportBatchEvent.discarded_event)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.event == null)
        break label59;
      j = this.event.hashCode();
      k = j * 37;
      if (this.discarded_event == null)
        break label64;
    }
    label59: label64: for (int m = this.discarded_event.hashCode(); ; m = 0)
    {
      i = m + k;
      this.hashCode = i;
      return i;
      j = 1;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.LogReportBatchEvent
 * JD-Core Version:    0.6.0
 */