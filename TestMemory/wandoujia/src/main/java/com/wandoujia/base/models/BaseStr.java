package com.wandoujia.base.models;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class BaseStr extends Message
{
  public static final String DEFAULT_VAL = "";

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String val;

  private BaseStr(BaseStr.Builder paramBuilder)
  {
    super(paramBuilder);
    this.val = paramBuilder.val;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof BaseStr))
      return false;
    return equals(this.val, ((BaseStr)paramObject).val);
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
 * Qualified Name:     com.wandoujia.base.models.BaseStr
 * JD-Core Version:    0.6.0
 */