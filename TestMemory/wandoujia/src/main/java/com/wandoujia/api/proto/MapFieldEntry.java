package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class MapFieldEntry extends Message
{
  public static final String DEFAULT_KEY = "";
  public static final String DEFAULT_VALUE = "";

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.STRING)
  public final String key;

  @ProtoField(label=Message.Label.REQUIRED, tag=2, type=Message.Datatype.STRING)
  public final String value;

  private MapFieldEntry(MapFieldEntry.Builder paramBuilder)
  {
    super(paramBuilder);
    this.key = paramBuilder.key;
    this.value = paramBuilder.value;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    MapFieldEntry localMapFieldEntry;
    do
    {
      return true;
      if (!(paramObject instanceof MapFieldEntry))
        return false;
      localMapFieldEntry = (MapFieldEntry)paramObject;
    }
    while ((equals(this.key, localMapFieldEntry.key)) && (equals(this.value, localMapFieldEntry.value)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.key == null)
        break label64;
    label64: for (int j = this.key.hashCode(); ; j = 0)
    {
      int k = j * 37;
      String str = this.value;
      int m = 0;
      if (str != null)
        m = this.value.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.MapFieldEntry
 * JD-Core Version:    0.6.0
 */