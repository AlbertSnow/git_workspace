package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class ApplicationActiveEvent extends Message
{
  public static final String DEFAULT_ACTIVE = "";

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String active;

  private ApplicationActiveEvent(ApplicationActiveEvent.Builder paramBuilder)
  {
    super(paramBuilder);
    this.active = paramBuilder.active;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof ApplicationActiveEvent))
      return false;
    return equals(this.active, ((ApplicationActiveEvent)paramObject).active);
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i != 0)
      return i;
    if (this.active != null);
    for (int j = this.active.hashCode(); ; j = 0)
    {
      this.hashCode = j;
      return j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ApplicationActiveEvent
 * JD-Core Version:    0.6.0
 */