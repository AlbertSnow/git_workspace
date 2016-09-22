package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class Tag extends Message
{
  public static final Integer DEFAULT_TAG_ID = Integer.valueOf(0);
  public static final String DEFAULT_TAG_NAME = "";
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);

  @ProtoField(tag=6)
  public final Action action;

  @ProtoField(tag=5)
  public final Color color;

  @ProtoField(tag=4)
  public final Image icon;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.INT32)
  public final Integer tag_id;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String tag_name;

  @ProtoField(tag=2, type=Message.Datatype.INT32)
  public final Integer type;

  private Tag(Tag.Builder paramBuilder)
  {
    super(paramBuilder);
    this.tag_id = paramBuilder.tag_id;
    this.type = paramBuilder.type;
    this.tag_name = paramBuilder.tag_name;
    this.icon = paramBuilder.icon;
    this.color = paramBuilder.color;
    this.action = paramBuilder.action;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Tag localTag;
    do
    {
      return true;
      if (!(paramObject instanceof Tag))
        return false;
      localTag = (Tag)paramObject;
    }
    while ((equals(this.tag_id, localTag.tag_id)) && (equals(this.type, localTag.type)) && (equals(this.tag_name, localTag.tag_name)) && (equals(this.icon, localTag.icon)) && (equals(this.color, localTag.color)) && (equals(this.action, localTag.action)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i3;
    label96: int i4;
    if (i == 0)
    {
      if (this.tag_id == null)
        break label168;
      j = this.tag_id.hashCode();
      int k = j * 37;
      if (this.type == null)
        break label173;
      m = this.type.hashCode();
      int n = 37 * (m + k);
      if (this.tag_name == null)
        break label179;
      i1 = this.tag_name.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.icon == null)
        break label185;
      i3 = this.icon.hashCode();
      i4 = 37 * (i3 + i2);
      if (this.color == null)
        break label191;
    }
    label168: label173: label179: label185: label191: for (int i5 = this.color.hashCode(); ; i5 = 0)
    {
      int i6 = 37 * (i5 + i4);
      Action localAction = this.action;
      int i7 = 0;
      if (localAction != null)
        i7 = this.action.hashCode();
      i = i6 + i7;
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
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Tag
 * JD-Core Version:    0.6.0
 */