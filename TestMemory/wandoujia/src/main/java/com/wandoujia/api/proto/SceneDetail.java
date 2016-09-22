package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class SceneDetail extends Message
{
  public static final String DEFAULT_ENTRY_ICON = "";
  public static final String DEFAULT_ENTRY_ICON_PRESSED = "";
  public static final String DEFAULT_GROUP_NAME = "";
  public static final String DEFAULT_NAME = "";
  public static final Long DEFAULT_NEXT_UPDATE;
  public static final Boolean DEFAULT_VALID = Boolean.valueOf(false);
  public static final Double DEFAULT_WEIGHT;

  @ProtoField(tag=6, type=Message.Datatype.STRING)
  public final String entry_icon;

  @ProtoField(tag=7, type=Message.Datatype.STRING)
  public final String entry_icon_pressed;

  @ProtoField(tag=8, type=Message.Datatype.STRING)
  public final String group_name;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String name;

  @ProtoField(tag=3, type=Message.Datatype.INT64)
  public final Long next_update;

  @ProtoField(tag=5)
  public final CountDownText plot_description;

  @ProtoField(label=Message.Label.REQUIRED, tag=2, type=Message.Datatype.BOOL)
  public final Boolean valid;

  @ProtoField(tag=4, type=Message.Datatype.DOUBLE)
  public final Double weight;

  static
  {
    DEFAULT_NEXT_UPDATE = Long.valueOf(0L);
    DEFAULT_WEIGHT = Double.valueOf(0.0D);
  }

  private SceneDetail(SceneDetail.Builder paramBuilder)
  {
    super(paramBuilder);
    this.name = paramBuilder.name;
    this.valid = paramBuilder.valid;
    this.next_update = paramBuilder.next_update;
    this.weight = paramBuilder.weight;
    this.plot_description = paramBuilder.plot_description;
    this.entry_icon = paramBuilder.entry_icon;
    this.entry_icon_pressed = paramBuilder.entry_icon_pressed;
    this.group_name = paramBuilder.group_name;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    SceneDetail localSceneDetail;
    do
    {
      return true;
      if (!(paramObject instanceof SceneDetail))
        return false;
      localSceneDetail = (SceneDetail)paramObject;
    }
    while ((equals(this.name, localSceneDetail.name)) && (equals(this.valid, localSceneDetail.valid)) && (equals(this.next_update, localSceneDetail.next_update)) && (equals(this.weight, localSceneDetail.weight)) && (equals(this.plot_description, localSceneDetail.plot_description)) && (equals(this.entry_icon, localSceneDetail.entry_icon)) && (equals(this.entry_icon_pressed, localSceneDetail.entry_icon_pressed)) && (equals(this.group_name, localSceneDetail.group_name)));
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
    label122: int i7;
    label148: int i8;
    if (i == 0)
    {
      if (this.name == null)
        break label220;
      j = this.name.hashCode();
      int k = j * 37;
      if (this.valid == null)
        break label225;
      m = this.valid.hashCode();
      int n = 37 * (m + k);
      if (this.next_update == null)
        break label231;
      i1 = this.next_update.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.weight == null)
        break label237;
      i3 = this.weight.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.plot_description == null)
        break label243;
      i5 = this.plot_description.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.entry_icon == null)
        break label249;
      i7 = this.entry_icon.hashCode();
      i8 = 37 * (i7 + i6);
      if (this.entry_icon_pressed == null)
        break label255;
    }
    label220: label225: label231: label237: label243: label249: label255: for (int i9 = this.entry_icon_pressed.hashCode(); ; i9 = 0)
    {
      int i10 = 37 * (i9 + i8);
      String str = this.group_name;
      int i11 = 0;
      if (str != null)
        i11 = this.group_name.hashCode();
      i = i10 + i11;
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
      i7 = 0;
      break label148;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.SceneDetail
 * JD-Core Version:    0.6.0
 */