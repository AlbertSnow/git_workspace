package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class TriggerRequest extends Message
{
  public static final Integer DEFAULT_PB_VERSION = Integer.valueOf(0);

  @ProtoField(tag=2)
  public final UserContext context;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.INT32)
  public final Integer pb_version;

  @ProtoField(tag=3)
  public final Trigger trigger;

  private TriggerRequest(TriggerRequest.Builder paramBuilder)
  {
    super(paramBuilder);
    this.pb_version = paramBuilder.pb_version;
    this.context = paramBuilder.context;
    this.trigger = paramBuilder.trigger;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    TriggerRequest localTriggerRequest;
    do
    {
      return true;
      if (!(paramObject instanceof TriggerRequest))
        return false;
      localTriggerRequest = (TriggerRequest)paramObject;
    }
    while ((equals(this.pb_version, localTriggerRequest.pb_version)) && (equals(this.context, localTriggerRequest.context)) && (equals(this.trigger, localTriggerRequest.trigger)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.pb_version == null)
        break label90;
      j = this.pb_version.hashCode();
      k = j * 37;
      if (this.context == null)
        break label95;
    }
    label90: label95: for (int m = this.context.hashCode(); ; m = 0)
    {
      int n = 37 * (m + k);
      Trigger localTrigger = this.trigger;
      int i1 = 0;
      if (localTrigger != null)
        i1 = this.trigger.hashCode();
      i = n + i1;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.TriggerRequest
 * JD-Core Version:    0.6.0
 */