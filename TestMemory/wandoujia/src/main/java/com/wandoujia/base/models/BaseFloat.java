package com.wandoujia.base.models;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class BaseFloat extends Message
{
  public static final Float DEFAULT_VAL = Float.valueOf(0.0F);

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.FLOAT)
  public final Float val;

  private BaseFloat(BaseFloat.Builder paramBuilder)
  {
    super(paramBuilder);
    this.val = paramBuilder.val;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof BaseFloat))
      return false;
    return equals(this.val, ((BaseFloat)paramObject).val);
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
 * Qualified Name:     com.wandoujia.base.models.BaseFloat
 * JD-Core Version:    0.6.0
 */