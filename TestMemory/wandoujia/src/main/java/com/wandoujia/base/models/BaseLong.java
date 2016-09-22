package com.wandoujia.base.models;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class BaseLong extends Message
{
  public static final Long DEFAULT_VAL = Long.valueOf(0L);

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.INT64)
  public final Long val;

  private BaseLong(BaseLong.Builder paramBuilder)
  {
    super(paramBuilder);
    this.val = paramBuilder.val;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof BaseLong))
      return false;
    return equals(this.val, ((BaseLong)paramObject).val);
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i != 0)
      return i;
    if (this.val != null);
    for (int j = this.val.hashCode(); ; j = 0)
    {
      this.hashCode = j;
      return j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.BaseLong
 * JD-Core Version:    0.6.0
 */