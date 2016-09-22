package com.wandoujia.base.models;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class BaseDouble extends Message
{
  public static final Double DEFAULT_VAL = Double.valueOf(0.0D);

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.DOUBLE)
  public final Double val;

  private BaseDouble(BaseDouble.Builder paramBuilder)
  {
    super(paramBuilder);
    this.val = paramBuilder.val;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof BaseDouble))
      return false;
    return equals(this.val, ((BaseDouble)paramObject).val);
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
 * Qualified Name:     com.wandoujia.base.models.BaseDouble
 * JD-Core Version:    0.6.0
 */