package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class TodayDetail extends Message
{
  public static final Long DEFAULT_GENERATE_TIME = Long.valueOf(0L);
  public static final Boolean DEFAULT_NEED_PREFETCH;
  public static final Long DEFAULT_NEXT_TIME = Long.valueOf(0L);
  public static final Long DEFAULT_NOTIFY_TIME = Long.valueOf(0L);
  public static final String DEFAULT_TITLE = "";
  public static final Integer DEFAULT_UPDATE_COUNT = Integer.valueOf(0);
  public static final Integer DEFAULT_UPDATE_PROVIDER_COUNT;

  @ProtoField(tag=1, type=Message.Datatype.INT64)
  public final Long generate_time;

  @ProtoField(tag=6, type=Message.Datatype.BOOL)
  public final Boolean need_prefetch;

  @ProtoField(deprecated=true, tag=2, type=Message.Datatype.INT64)
  @Deprecated
  public final Long next_time;

  @ProtoField(deprecated=true, tag=3, type=Message.Datatype.INT64)
  @Deprecated
  public final Long notify_time;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String title;

  @ProtoField(tag=4, type=Message.Datatype.INT32)
  public final Integer update_count;

  @ProtoField(tag=7, type=Message.Datatype.INT32)
  public final Integer update_provider_count;

  static
  {
    DEFAULT_NEED_PREFETCH = Boolean.valueOf(false);
    DEFAULT_UPDATE_PROVIDER_COUNT = Integer.valueOf(0);
  }

  private TodayDetail(TodayDetail.Builder paramBuilder)
  {
    super(paramBuilder);
    this.generate_time = paramBuilder.generate_time;
    this.next_time = paramBuilder.next_time;
    this.notify_time = paramBuilder.notify_time;
    this.update_count = paramBuilder.update_count;
    this.title = paramBuilder.title;
    this.need_prefetch = paramBuilder.need_prefetch;
    this.update_provider_count = paramBuilder.update_provider_count;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    TodayDetail localTodayDetail;
    do
    {
      return true;
      if (!(paramObject instanceof TodayDetail))
        return false;
      localTodayDetail = (TodayDetail)paramObject;
    }
    while ((equals(this.generate_time, localTodayDetail.generate_time)) && (equals(this.next_time, localTodayDetail.next_time)) && (equals(this.notify_time, localTodayDetail.notify_time)) && (equals(this.update_count, localTodayDetail.update_count)) && (equals(this.title, localTodayDetail.title)) && (equals(this.need_prefetch, localTodayDetail.need_prefetch)) && (equals(this.update_provider_count, localTodayDetail.update_provider_count)));
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
      if (this.generate_time == null)
        break label194;
      j = this.generate_time.hashCode();
      int k = j * 37;
      if (this.next_time == null)
        break label199;
      m = this.next_time.hashCode();
      int n = 37 * (m + k);
      if (this.notify_time == null)
        break label205;
      i1 = this.notify_time.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.update_count == null)
        break label211;
      i3 = this.update_count.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.title == null)
        break label217;
      i5 = this.title.hashCode();
      i6 = 37 * (i5 + i4);
      if (this.need_prefetch == null)
        break label223;
    }
    label194: label199: label205: label211: label217: label223: for (int i7 = this.need_prefetch.hashCode(); ; i7 = 0)
    {
      int i8 = 37 * (i7 + i6);
      Integer localInteger = this.update_provider_count;
      int i9 = 0;
      if (localInteger != null)
        i9 = this.update_provider_count.hashCode();
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
 * Qualified Name:     com.wandoujia.api.proto.TodayDetail
 * JD-Core Version:    0.6.0
 */