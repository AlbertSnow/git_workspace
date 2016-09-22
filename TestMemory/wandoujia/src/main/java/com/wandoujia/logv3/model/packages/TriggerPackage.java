package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class TriggerPackage extends Message
{
  public static final String DEFAULT_SOURCE = "";
  public static final String DEFAULT_TYPE = "";

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String source;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String type;

  private TriggerPackage(TriggerPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.type = paramBuilder.type;
    this.source = paramBuilder.source;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    TriggerPackage localTriggerPackage;
    do
    {
      return true;
      if (!(paramObject instanceof TriggerPackage))
        return false;
      localTriggerPackage = (TriggerPackage)paramObject;
    }
    while ((equals(this.type, localTriggerPackage.type)) && (equals(this.source, localTriggerPackage.source)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.type == null)
        break label64;
    label64: for (int j = this.type.hashCode(); ; j = 0)
    {
      int k = j * 37;
      String str = this.source;
      int m = 0;
      if (str != null)
        m = this.source.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.TriggerPackage
 * JD-Core Version:    0.6.0
 */