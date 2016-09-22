package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class OnboardResponse extends Message
{
  public static final Boolean DEFAULT_ONBOARD_STATUS = Boolean.valueOf(false);

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.BOOL)
  public final Boolean onboard_status;

  private OnboardResponse(OnboardResponse.Builder paramBuilder)
  {
    super(paramBuilder);
    this.onboard_status = paramBuilder.onboard_status;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof OnboardResponse))
      return false;
    return equals(this.onboard_status, ((OnboardResponse)paramObject).onboard_status);
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i != 0)
      return i;
    if (this.onboard_status != null);
    for (int j = this.onboard_status.hashCode(); ; j = 0)
    {
      this.hashCode = j;
      return j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.OnboardResponse
 * JD-Core Version:    0.6.0
 */