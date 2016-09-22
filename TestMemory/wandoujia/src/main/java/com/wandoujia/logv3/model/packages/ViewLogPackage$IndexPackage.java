package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class ViewLogPackage$IndexPackage extends Message
{
  public static final Integer DEFAULT_INDEX = Integer.valueOf(0);
  public static final Integer DEFAULT_SUB_INDEX = Integer.valueOf(0);

  @ProtoField(tag=1, type=Message.Datatype.INT32)
  public final Integer index;

  @ProtoField(tag=2, type=Message.Datatype.INT32)
  public final Integer sub_index;

  private ViewLogPackage$IndexPackage(ViewLogPackage.IndexPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.index = paramBuilder.index;
    this.sub_index = paramBuilder.sub_index;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    IndexPackage localIndexPackage;
    do
    {
      return true;
      if (!(paramObject instanceof IndexPackage))
        return false;
      localIndexPackage = (IndexPackage)paramObject;
    }
    while ((equals(this.index, localIndexPackage.index)) && (equals(this.sub_index, localIndexPackage.sub_index)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.index == null)
        break label64;
    label64: for (int j = this.index.hashCode(); ; j = 0)
    {
      int k = j * 37;
      Integer localInteger = this.sub_index;
      int m = 0;
      if (localInteger != null)
        m = this.sub_index.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ViewLogPackage.IndexPackage
 * JD-Core Version:    0.6.0
 */