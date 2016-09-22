package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class AppTag extends Message
{
  public static final String DEFAULT_TAG = "";
  public static final Integer DEFAULT_WEIGHT = Integer.valueOf(0);

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String tag;

  @ProtoField(tag=2, type=Message.Datatype.INT32)
  public final Integer weight;

  private AppTag(AppTag.Builder paramBuilder)
  {
    super(paramBuilder);
    this.tag = paramBuilder.tag;
    this.weight = paramBuilder.weight;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    AppTag localAppTag;
    do
    {
      return true;
      if (!(paramObject instanceof AppTag))
        return false;
      localAppTag = (AppTag)paramObject;
    }
    while ((equals(this.tag, localAppTag.tag)) && (equals(this.weight, localAppTag.weight)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.tag == null)
        break label64;
    label64: for (int j = this.tag.hashCode(); ; j = 0)
    {
      int k = j * 37;
      Integer localInteger = this.weight;
      int m = 0;
      if (localInteger != null)
        m = this.weight.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.AppTag
 * JD-Core Version:    0.6.0
 */