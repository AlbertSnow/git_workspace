package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class MorphData extends Message
{
  public static final String DEFAULT_KEY = "";
  public static final String DEFAULT_VALUE = "";

  @ProtoField(tag=3)
  public final Action action;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String key;

  @ProtoField(tag=4)
  public final MorphDataProperty property;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String value;

  private MorphData(MorphData.Builder paramBuilder)
  {
    super(paramBuilder);
    this.key = paramBuilder.key;
    this.value = paramBuilder.value;
    this.action = paramBuilder.action;
    this.property = paramBuilder.property;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    MorphData localMorphData;
    do
    {
      return true;
      if (!(paramObject instanceof MorphData))
        return false;
      localMorphData = (MorphData)paramObject;
    }
    while ((equals(this.key, localMorphData.key)) && (equals(this.value, localMorphData.value)) && (equals(this.action, localMorphData.action)) && (equals(this.property, localMorphData.property)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int n;
    if (i == 0)
    {
      if (this.key == null)
        break label116;
      j = this.key.hashCode();
      int k = j * 37;
      if (this.value == null)
        break label121;
      m = this.value.hashCode();
      n = 37 * (m + k);
      if (this.action == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.action.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      MorphDataProperty localMorphDataProperty = this.property;
      int i3 = 0;
      if (localMorphDataProperty != null)
        i3 = this.property.hashCode();
      i = i2 + i3;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.MorphData
 * JD-Core Version:    0.6.0
 */