package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class PublisherBundleDetail extends Message
{
  public static final String DEFAULT_COVER = "";
  public static final Long DEFAULT_CREATEDTIME;
  public static final Boolean DEFAULT_DEFAULTSELECTED;
  public static final String DEFAULT_DESCRIPTION = "";
  public static final String DEFAULT_ID = "";
  public static final Integer DEFAULT_RANK = Integer.valueOf(0);
  public static final String DEFAULT_TITLE = "";

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String cover;

  @ProtoField(tag=7, type=Message.Datatype.INT64)
  public final Long createdTime;

  @ProtoField(tag=6, type=Message.Datatype.BOOL)
  public final Boolean defaultSelected;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String description;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String id;

  @ProtoField(tag=5, type=Message.Datatype.INT32)
  public final Integer rank;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String title;

  static
  {
    DEFAULT_DEFAULTSELECTED = Boolean.valueOf(false);
    DEFAULT_CREATEDTIME = Long.valueOf(0L);
  }

  private PublisherBundleDetail(PublisherBundleDetail.Builder paramBuilder)
  {
    super(paramBuilder);
    this.id = paramBuilder.id;
    this.title = paramBuilder.title;
    this.description = paramBuilder.description;
    this.cover = paramBuilder.cover;
    this.rank = paramBuilder.rank;
    this.defaultSelected = paramBuilder.defaultSelected;
    this.createdTime = paramBuilder.createdTime;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    PublisherBundleDetail localPublisherBundleDetail;
    do
    {
      return true;
      if (!(paramObject instanceof PublisherBundleDetail))
        return false;
      localPublisherBundleDetail = (PublisherBundleDetail)paramObject;
    }
    while ((equals(this.id, localPublisherBundleDetail.id)) && (equals(this.title, localPublisherBundleDetail.title)) && (equals(this.description, localPublisherBundleDetail.description)) && (equals(this.cover, localPublisherBundleDetail.cover)) && (equals(this.rank, localPublisherBundleDetail.rank)) && (equals(this.defaultSelected, localPublisherBundleDetail.defaultSelected)) && (equals(this.createdTime, localPublisherBundleDetail.createdTime)));
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
      if (this.id == null)
        break label194;
      j = this.id.hashCode();
      int k = j * 37;
      if (this.title == null)
        break label199;
      m = this.title.hashCode();
      int n = 37 * (m + k);
      if (this.description == null)
        break label205;
      i1 = this.description.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.cover == null)
        break label211;
      i3 = this.cover.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.rank == null)
        break label217;
      i5 = this.rank.hashCode();
      i6 = 37 * (i5 + i4);
      if (this.defaultSelected == null)
        break label223;
    }
    label194: label199: label205: label211: label217: label223: for (int i7 = this.defaultSelected.hashCode(); ; i7 = 0)
    {
      int i8 = 37 * (i7 + i6);
      Long localLong = this.createdTime;
      int i9 = 0;
      if (localLong != null)
        i9 = this.createdTime.hashCode();
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
 * Qualified Name:     com.wandoujia.api.proto.PublisherBundleDetail
 * JD-Core Version:    0.6.0
 */