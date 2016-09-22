package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class Color extends Message
{
  public static final Integer DEFAULT_NORMAL = Integer.valueOf(0);
  public static final Integer DEFAULT_PRESSED = Integer.valueOf(0);

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.INT32)
  public final Integer normal;

  @ProtoField(tag=2, type=Message.Datatype.INT32)
  public final Integer pressed;

  private Color(Color.Builder paramBuilder)
  {
    super(paramBuilder);
    this.normal = paramBuilder.normal;
    this.pressed = paramBuilder.pressed;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Color localColor;
    do
    {
      return true;
      if (!(paramObject instanceof Color))
        return false;
      localColor = (Color)paramObject;
    }
    while ((equals(this.normal, localColor.normal)) && (equals(this.pressed, localColor.pressed)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.normal == null)
        break label64;
    label64: for (int j = this.normal.hashCode(); ; j = 0)
    {
      int k = j * 37;
      Integer localInteger = this.pressed;
      int m = 0;
      if (localInteger != null)
        m = this.pressed.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Color
 * JD-Core Version:    0.6.0
 */