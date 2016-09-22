package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class TrailerBean extends Message
{
  public static final String DEFAULT_COVER_URL = "";
  public static final String DEFAULT_DESCRIPTION = "";
  public static final Integer DEFAULT_DURATION;
  public static final Boolean DEFAULT_IS_PORTRAIT;
  public static final Integer DEFAULT_TRAILER_ID = Integer.valueOf(0);
  public static final String DEFAULT_TRAILER_NAME = "";
  public static final String DEFAULT_TRAILER_URL = "";

  @ProtoField(tag=7, type=Message.Datatype.STRING)
  public final String cover_url;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String description;

  @ProtoField(tag=4, type=Message.Datatype.INT32)
  public final Integer duration;

  @ProtoField(tag=5, type=Message.Datatype.BOOL)
  public final Boolean is_portrait;

  @ProtoField(tag=1, type=Message.Datatype.INT32)
  public final Integer trailer_id;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String trailer_name;

  @ProtoField(tag=8, type=Message.Datatype.STRING)
  public final String trailer_url;

  static
  {
    DEFAULT_DURATION = Integer.valueOf(0);
    DEFAULT_IS_PORTRAIT = Boolean.valueOf(false);
  }

  private TrailerBean(TrailerBean.Builder paramBuilder)
  {
    super(paramBuilder);
    this.trailer_id = paramBuilder.trailer_id;
    this.trailer_name = paramBuilder.trailer_name;
    this.description = paramBuilder.description;
    this.duration = paramBuilder.duration;
    this.is_portrait = paramBuilder.is_portrait;
    this.cover_url = paramBuilder.cover_url;
    this.trailer_url = paramBuilder.trailer_url;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    TrailerBean localTrailerBean;
    do
    {
      return true;
      if (!(paramObject instanceof TrailerBean))
        return false;
      localTrailerBean = (TrailerBean)paramObject;
    }
    while ((equals(this.trailer_id, localTrailerBean.trailer_id)) && (equals(this.trailer_name, localTrailerBean.trailer_name)) && (equals(this.description, localTrailerBean.description)) && (equals(this.duration, localTrailerBean.duration)) && (equals(this.is_portrait, localTrailerBean.is_portrait)) && (equals(this.cover_url, localTrailerBean.cover_url)) && (equals(this.trailer_url, localTrailerBean.trailer_url)));
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
      if (this.trailer_id == null)
        break label194;
      j = this.trailer_id.hashCode();
      int k = j * 37;
      if (this.trailer_name == null)
        break label199;
      m = this.trailer_name.hashCode();
      int n = 37 * (m + k);
      if (this.description == null)
        break label205;
      i1 = this.description.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.duration == null)
        break label211;
      i3 = this.duration.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.is_portrait == null)
        break label217;
      i5 = this.is_portrait.hashCode();
      i6 = 37 * (i5 + i4);
      if (this.cover_url == null)
        break label223;
    }
    label194: label199: label205: label211: label217: label223: for (int i7 = this.cover_url.hashCode(); ; i7 = 0)
    {
      int i8 = 37 * (i7 + i6);
      String str = this.trailer_url;
      int i9 = 0;
      if (str != null)
        i9 = this.trailer_url.hashCode();
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
 * Qualified Name:     com.wandoujia.api.proto.TrailerBean
 * JD-Core Version:    0.6.0
 */