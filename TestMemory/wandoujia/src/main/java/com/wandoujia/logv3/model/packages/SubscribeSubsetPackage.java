package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class SubscribeSubsetPackage extends Message
{
  public static final String DEFAULT_ITEMLISTTYPE = "";
  public static final String DEFAULT_SUBSET_CREATETIME = "";
  public static final String DEFAULT_SUBSET_ID = "";
  public static final String DEFAULT_SUBSET_TITLE = "";
  public static final String DEFAULT_SUBSET_TYPE = "";
  public static final String DEFAULT_SUBSET_UPDATETIME = "";

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String itemlistType;

  @ProtoField(tag=7)
  public final SubscribePublisherPackage publisher;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String subset_createTime;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String subset_id;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String subset_title;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String subset_type;

  @ProtoField(tag=6, type=Message.Datatype.STRING)
  public final String subset_updateTime;

  private SubscribeSubsetPackage(SubscribeSubsetPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.itemlistType = paramBuilder.itemlistType;
    this.subset_title = paramBuilder.subset_title;
    this.subset_type = paramBuilder.subset_type;
    this.subset_id = paramBuilder.subset_id;
    this.subset_createTime = paramBuilder.subset_createTime;
    this.subset_updateTime = paramBuilder.subset_updateTime;
    this.publisher = paramBuilder.publisher;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    SubscribeSubsetPackage localSubscribeSubsetPackage;
    do
    {
      return true;
      if (!(paramObject instanceof SubscribeSubsetPackage))
        return false;
      localSubscribeSubsetPackage = (SubscribeSubsetPackage)paramObject;
    }
    while ((equals(this.itemlistType, localSubscribeSubsetPackage.itemlistType)) && (equals(this.subset_title, localSubscribeSubsetPackage.subset_title)) && (equals(this.subset_type, localSubscribeSubsetPackage.subset_type)) && (equals(this.subset_id, localSubscribeSubsetPackage.subset_id)) && (equals(this.subset_createTime, localSubscribeSubsetPackage.subset_createTime)) && (equals(this.subset_updateTime, localSubscribeSubsetPackage.subset_updateTime)) && (equals(this.publisher, localSubscribeSubsetPackage.publisher)));
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
      if (this.itemlistType == null)
        break label194;
      j = this.itemlistType.hashCode();
      int k = j * 37;
      if (this.subset_title == null)
        break label199;
      m = this.subset_title.hashCode();
      int n = 37 * (m + k);
      if (this.subset_type == null)
        break label205;
      i1 = this.subset_type.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.subset_id == null)
        break label211;
      i3 = this.subset_id.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.subset_createTime == null)
        break label217;
      i5 = this.subset_createTime.hashCode();
      i6 = 37 * (i5 + i4);
      if (this.subset_updateTime == null)
        break label223;
    }
    label194: label199: label205: label211: label217: label223: for (int i7 = this.subset_updateTime.hashCode(); ; i7 = 0)
    {
      int i8 = 37 * (i7 + i6);
      SubscribePublisherPackage localSubscribePublisherPackage = this.publisher;
      int i9 = 0;
      if (localSubscribePublisherPackage != null)
        i9 = this.publisher.hashCode();
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
 * Qualified Name:     com.wandoujia.logv3.model.packages.SubscribeSubsetPackage
 * JD-Core Version:    0.6.0
 */