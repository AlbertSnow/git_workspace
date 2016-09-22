package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class ApplicationStartEvent extends Message
{
  public static final String DEFAULT_ACTION = "";
  public static final String DEFAULT_ACTIVITY = "";
  public static final String DEFAULT_DATA = "";
  public static final ApplicationStartEvent.Reason DEFAULT_REASON = ApplicationStartEvent.Reason.NEW;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String action;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String activity;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String data;

  @ProtoField(tag=4, type=Message.Datatype.ENUM)
  public final ApplicationStartEvent.Reason reason;

  private ApplicationStartEvent(ApplicationStartEvent.Builder paramBuilder)
  {
    super(paramBuilder);
    this.action = paramBuilder.action;
    this.activity = paramBuilder.activity;
    this.data = paramBuilder.data;
    this.reason = paramBuilder.reason;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ApplicationStartEvent localApplicationStartEvent;
    do
    {
      return true;
      if (!(paramObject instanceof ApplicationStartEvent))
        return false;
      localApplicationStartEvent = (ApplicationStartEvent)paramObject;
    }
    while ((equals(this.action, localApplicationStartEvent.action)) && (equals(this.activity, localApplicationStartEvent.activity)) && (equals(this.data, localApplicationStartEvent.data)) && (equals(this.reason, localApplicationStartEvent.reason)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int n;
    if (i == 0)
    {
      if (this.action == null)
        break label116;
      j = this.action.hashCode();
      int k = j * 37;
      if (this.activity == null)
        break label121;
      m = this.activity.hashCode();
      n = 37 * (m + k);
      if (this.data == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.data.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      ApplicationStartEvent.Reason localReason = this.reason;
      int i3 = 0;
      if (localReason != null)
        i3 = this.reason.hashCode();
      i = i2 + i3;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ApplicationStartEvent
 * JD-Core Version:    0.6.0
 */