package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class MorphDataProperty extends Message
{
  public static final Integer DEFAULT_HEIGHT;
  public static final Boolean DEFAULT_IS_VISIBLE = Boolean.valueOf(false);
  public static final Integer DEFAULT_WIDTH = Integer.valueOf(0);

  @ProtoField(tag=3, type=Message.Datatype.INT32)
  public final Integer height;

  @ProtoField(tag=1, type=Message.Datatype.BOOL)
  public final Boolean is_visible;

  @ProtoField(tag=2, type=Message.Datatype.INT32)
  public final Integer width;

  static
  {
    DEFAULT_HEIGHT = Integer.valueOf(0);
  }

  private MorphDataProperty(MorphDataProperty.Builder paramBuilder)
  {
    super(paramBuilder);
    this.is_visible = paramBuilder.is_visible;
    this.width = paramBuilder.width;
    this.height = paramBuilder.height;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    MorphDataProperty localMorphDataProperty;
    do
    {
      return true;
      if (!(paramObject instanceof MorphDataProperty))
        return false;
      localMorphDataProperty = (MorphDataProperty)paramObject;
    }
    while ((equals(this.is_visible, localMorphDataProperty.is_visible)) && (equals(this.width, localMorphDataProperty.width)) && (equals(this.height, localMorphDataProperty.height)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.is_visible == null)
        break label90;
      j = this.is_visible.hashCode();
      k = j * 37;
      if (this.width == null)
        break label95;
    }
    label90: label95: for (int m = this.width.hashCode(); ; m = 0)
    {
      int n = 37 * (m + k);
      Integer localInteger = this.height;
      int i1 = 0;
      if (localInteger != null)
        i1 = this.height.hashCode();
      i = n + i1;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.MorphDataProperty
 * JD-Core Version:    0.6.0
 */