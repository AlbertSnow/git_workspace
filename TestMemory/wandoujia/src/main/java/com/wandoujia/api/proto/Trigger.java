package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Trigger extends Message
{
  public static final List<MapFieldEntry> DEFAULT_PARAMETER;
  public static final Trigger.Source DEFAULT_SOURCE = Trigger.Source.SMS;

  @ProtoField(label=Message.Label.REPEATED, tag=2)
  public final List<MapFieldEntry> parameter;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.ENUM)
  public final Trigger.Source source;

  static
  {
    DEFAULT_PARAMETER = Collections.emptyList();
  }

  private Trigger(Trigger.Builder paramBuilder)
  {
    super(paramBuilder);
    this.source = paramBuilder.source;
    this.parameter = immutableCopyOf(paramBuilder.parameter);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Trigger localTrigger;
    do
    {
      return true;
      if (!(paramObject instanceof Trigger))
        return false;
      localTrigger = (Trigger)paramObject;
    }
    while ((equals(this.source, localTrigger.source)) && (equals(this.parameter, localTrigger.parameter)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.source == null)
        break label59;
      j = this.source.hashCode();
      k = j * 37;
      if (this.parameter == null)
        break label64;
    }
    label59: label64: for (int m = this.parameter.hashCode(); ; m = 1)
    {
      i = m + k;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Trigger
 * JD-Core Version:    0.6.0
 */