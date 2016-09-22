package com.wandoujia.base.models;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class BaseBooleans extends Message
{
  public static final List<Boolean> DEFAULT_VAL = Collections.emptyList();

  @ProtoField(label=Message.Label.REPEATED, tag=1, type=Message.Datatype.BOOL)
  public final List<Boolean> val;

  private BaseBooleans(BaseBooleans.Builder paramBuilder)
  {
    super(paramBuilder);
    this.val = immutableCopyOf(paramBuilder.val);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof BaseBooleans))
      return false;
    return equals(this.val, ((BaseBooleans)paramObject).val);
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i != 0)
      return i;
    if (this.val != null);
    for (int j = this.val.hashCode(); ; j = 1)
    {
      this.hashCode = j;
      return j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.BaseBooleans
 * JD-Core Version:    0.6.0
 */