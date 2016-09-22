package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class CleanResultPackage extends Message
{
  public static final String DEFAULT_CLEAN_ID = "";
  public static final String DEFAULT_CONTENT_ID = "";
  public static final String DEFAULT_PATH = "";
  public static final Integer DEFAULT_READ_DAY;
  public static final Integer DEFAULT_RECOMMEND;
  public static final Long DEFAULT_SIZE = Long.valueOf(0L);
  public static final String DEFAULT_TITLE = "";
  public static final String DEFAULT_TYPE = "";

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String clean_id;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String content_id;

  @ProtoField(tag=8, type=Message.Datatype.STRING)
  public final String path;

  @ProtoField(tag=7, type=Message.Datatype.INT32)
  public final Integer read_day;

  @ProtoField(tag=6, type=Message.Datatype.INT32)
  public final Integer recommend;

  @ProtoField(tag=3, type=Message.Datatype.UINT64)
  public final Long size;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String title;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String type;

  static
  {
    DEFAULT_RECOMMEND = Integer.valueOf(0);
    DEFAULT_READ_DAY = Integer.valueOf(0);
  }

  private CleanResultPackage(CleanResultPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.clean_id = paramBuilder.clean_id;
    this.type = paramBuilder.type;
    this.size = paramBuilder.size;
    this.content_id = paramBuilder.content_id;
    this.title = paramBuilder.title;
    this.recommend = paramBuilder.recommend;
    this.read_day = paramBuilder.read_day;
    this.path = paramBuilder.path;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    CleanResultPackage localCleanResultPackage;
    do
    {
      return true;
      if (!(paramObject instanceof CleanResultPackage))
        return false;
      localCleanResultPackage = (CleanResultPackage)paramObject;
    }
    while ((equals(this.clean_id, localCleanResultPackage.clean_id)) && (equals(this.type, localCleanResultPackage.type)) && (equals(this.size, localCleanResultPackage.size)) && (equals(this.content_id, localCleanResultPackage.content_id)) && (equals(this.title, localCleanResultPackage.title)) && (equals(this.recommend, localCleanResultPackage.recommend)) && (equals(this.read_day, localCleanResultPackage.read_day)) && (equals(this.path, localCleanResultPackage.path)));
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
      if (this.clean_id == null)
        break label220;
      j = this.clean_id.hashCode();
      int k = j * 37;
      if (this.type == null)
        break label225;
      m = this.type.hashCode();
      int n = 37 * (m + k);
      if (this.size == null)
        break label231;
      i1 = this.size.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.content_id == null)
        break label237;
      i3 = this.content_id.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.title == null)
        break label243;
      i5 = this.title.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.recommend == null)
        break label249;
      i7 = this.recommend.hashCode();
      i8 = 37 * (i7 + i6);
      if (this.read_day == null)
        break label255;
    }
    label220: label225: label231: label237: label243: label249: label255: for (int i9 = this.read_day.hashCode(); ; i9 = 0)
    {
      int i10 = 37 * (i9 + i8);
      String str = this.path;
      int i11 = 0;
      if (str != null)
        i11 = this.path.hashCode();
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
 * Qualified Name:     com.wandoujia.logv3.model.packages.CleanResultPackage
 * JD-Core Version:    0.6.0
 */