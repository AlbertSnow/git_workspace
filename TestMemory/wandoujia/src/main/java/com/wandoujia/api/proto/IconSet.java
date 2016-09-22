package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class IconSet extends Message
{
  public static final String DEFAULT_PX100 = "";
  public static final String DEFAULT_PX24 = "";
  public static final String DEFAULT_PX256 = "";
  public static final String DEFAULT_PX36 = "";
  public static final String DEFAULT_PX48 = "";
  public static final String DEFAULT_PX68 = "";
  public static final String DEFAULT_PX78 = "";

  @ProtoField(tag=6, type=Message.Datatype.STRING)
  public final String px100;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String px24;

  @ProtoField(tag=7, type=Message.Datatype.STRING)
  public final String px256;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String px36;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String px48;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String px68;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String px78;

  private IconSet(IconSet.Builder paramBuilder)
  {
    super(paramBuilder);
    this.px24 = paramBuilder.px24;
    this.px36 = paramBuilder.px36;
    this.px48 = paramBuilder.px48;
    this.px68 = paramBuilder.px68;
    this.px78 = paramBuilder.px78;
    this.px100 = paramBuilder.px100;
    this.px256 = paramBuilder.px256;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    IconSet localIconSet;
    do
    {
      return true;
      if (!(paramObject instanceof IconSet))
        return false;
      localIconSet = (IconSet)paramObject;
    }
    while ((equals(this.px24, localIconSet.px24)) && (equals(this.px36, localIconSet.px36)) && (equals(this.px48, localIconSet.px48)) && (equals(this.px68, localIconSet.px68)) && (equals(this.px78, localIconSet.px78)) && (equals(this.px100, localIconSet.px100)) && (equals(this.px256, localIconSet.px256)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i3;
    label96: int i5;
    label122: int i6;
    if (i == 0)
    {
      if (this.px24 == null)
        break label194;
      j = this.px24.hashCode();
      int k = j * 37;
      if (this.px36 == null)
        break label199;
      m = this.px36.hashCode();
      int n = 37 * (m + k);
      if (this.px48 == null)
        break label205;
      i1 = this.px48.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.px68 == null)
        break label211;
      i3 = this.px68.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.px78 == null)
        break label217;
      i5 = this.px78.hashCode();
      i6 = 37 * (i5 + i4);
      if (this.px100 == null)
        break label223;
    }
    label194: label199: label205: label211: label217: label223: for (int i7 = this.px100.hashCode(); ; i7 = 0)
    {
      int i8 = 37 * (i7 + i6);
      String str = this.px256;
      int i9 = 0;
      if (str != null)
        i9 = this.px256.hashCode();
      i = i8 + i9;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
      i1 = 0;
      break label70;
      i3 = 0;
      break label96;
      i5 = 0;
      break label122;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.IconSet
 * JD-Core Version:    0.6.0
 */