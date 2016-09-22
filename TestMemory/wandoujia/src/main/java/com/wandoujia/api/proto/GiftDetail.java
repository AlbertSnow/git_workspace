package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class GiftDetail extends Message
{
  public static final String DEFAULT_CDKEY = "";
  public static final String DEFAULT_CDKEY_ID = "";
  public static final String DEFAULT_DESCRIPTION = "";
  public static final String DEFAULT_DIRECTIONS = "";
  public static final Long DEFAULT_END_DATE_STAMP;
  public static final String DEFAULT_EXCHANGE_DATE_RANGE = "";
  public static final Long DEFAULT_ID;
  public static final Boolean DEFAULT_IS_RECEIVED;
  public static final String DEFAULT_PACKAGE_NAME = "";
  public static final String DEFAULT_PROVIDE_TYPE = "";
  public static final Integer DEFAULT_RECEIVED_COUNT = Integer.valueOf(0);
  public static final Integer DEFAULT_REMNANT_COUNT = Integer.valueOf(0);
  public static final Long DEFAULT_REUSE_START_DATE;
  public static final String DEFAULT_SPECIAL_ACTION = "";
  public static final String DEFAULT_STATUS = "";
  public static final String DEFAULT_TITLE = "";

  @ProtoField(tag=9, type=Message.Datatype.STRING)
  public final String cdkey;

  @ProtoField(tag=12, type=Message.Datatype.STRING)
  public final String cdkey_id;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String description;

  @ProtoField(tag=8, type=Message.Datatype.STRING)
  public final String directions;

  @ProtoField(tag=14, type=Message.Datatype.INT64)
  public final Long end_date_stamp;

  @ProtoField(tag=7, type=Message.Datatype.STRING)
  public final String exchange_date_range;

  @ProtoField(tag=11, type=Message.Datatype.INT64)
  public final Long id;

  @ProtoField(tag=6, type=Message.Datatype.BOOL)
  public final Boolean is_received;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String package_name;

  @ProtoField(tag=13, type=Message.Datatype.STRING)
  public final String provide_type;

  @ProtoField(tag=4, type=Message.Datatype.INT32)
  public final Integer received_count;

  @ProtoField(tag=5, type=Message.Datatype.INT32)
  public final Integer remnant_count;

  @ProtoField(tag=16, type=Message.Datatype.INT64)
  public final Long reuse_start_date;

  @ProtoField(tag=10, type=Message.Datatype.STRING)
  public final String special_action;

  @ProtoField(tag=15, type=Message.Datatype.STRING)
  public final String status;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String title;

  static
  {
    DEFAULT_IS_RECEIVED = Boolean.valueOf(false);
    DEFAULT_ID = Long.valueOf(0L);
    DEFAULT_END_DATE_STAMP = Long.valueOf(0L);
    DEFAULT_REUSE_START_DATE = Long.valueOf(0L);
  }

  private GiftDetail(GiftDetail.Builder paramBuilder)
  {
    super(paramBuilder);
    this.title = paramBuilder.title;
    this.description = paramBuilder.description;
    this.package_name = paramBuilder.package_name;
    this.received_count = paramBuilder.received_count;
    this.remnant_count = paramBuilder.remnant_count;
    this.is_received = paramBuilder.is_received;
    this.exchange_date_range = paramBuilder.exchange_date_range;
    this.directions = paramBuilder.directions;
    this.cdkey = paramBuilder.cdkey;
    this.special_action = paramBuilder.special_action;
    this.id = paramBuilder.id;
    this.cdkey_id = paramBuilder.cdkey_id;
    this.provide_type = paramBuilder.provide_type;
    this.end_date_stamp = paramBuilder.end_date_stamp;
    this.status = paramBuilder.status;
    this.reuse_start_date = paramBuilder.reuse_start_date;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    GiftDetail localGiftDetail;
    do
    {
      return true;
      if (!(paramObject instanceof GiftDetail))
        return false;
      localGiftDetail = (GiftDetail)paramObject;
    }
    while ((equals(this.title, localGiftDetail.title)) && (equals(this.description, localGiftDetail.description)) && (equals(this.package_name, localGiftDetail.package_name)) && (equals(this.received_count, localGiftDetail.received_count)) && (equals(this.remnant_count, localGiftDetail.remnant_count)) && (equals(this.is_received, localGiftDetail.is_received)) && (equals(this.exchange_date_range, localGiftDetail.exchange_date_range)) && (equals(this.directions, localGiftDetail.directions)) && (equals(this.cdkey, localGiftDetail.cdkey)) && (equals(this.special_action, localGiftDetail.special_action)) && (equals(this.id, localGiftDetail.id)) && (equals(this.cdkey_id, localGiftDetail.cdkey_id)) && (equals(this.provide_type, localGiftDetail.provide_type)) && (equals(this.end_date_stamp, localGiftDetail.end_date_stamp)) && (equals(this.status, localGiftDetail.status)) && (equals(this.reuse_start_date, localGiftDetail.reuse_start_date)));
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
    label148: int i9;
    label174: int i11;
    label200: int i13;
    label226: int i15;
    label252: int i17;
    label278: int i19;
    label304: int i21;
    label330: int i23;
    label356: int i24;
    if (i == 0)
    {
      if (this.title == null)
        break label428;
      j = this.title.hashCode();
      int k = j * 37;
      if (this.description == null)
        break label433;
      m = this.description.hashCode();
      int n = 37 * (m + k);
      if (this.package_name == null)
        break label439;
      i1 = this.package_name.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.received_count == null)
        break label445;
      i3 = this.received_count.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.remnant_count == null)
        break label451;
      i5 = this.remnant_count.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.is_received == null)
        break label457;
      i7 = this.is_received.hashCode();
      int i8 = 37 * (i7 + i6);
      if (this.exchange_date_range == null)
        break label463;
      i9 = this.exchange_date_range.hashCode();
      int i10 = 37 * (i9 + i8);
      if (this.directions == null)
        break label469;
      i11 = this.directions.hashCode();
      int i12 = 37 * (i11 + i10);
      if (this.cdkey == null)
        break label475;
      i13 = this.cdkey.hashCode();
      int i14 = 37 * (i13 + i12);
      if (this.special_action == null)
        break label481;
      i15 = this.special_action.hashCode();
      int i16 = 37 * (i15 + i14);
      if (this.id == null)
        break label487;
      i17 = this.id.hashCode();
      int i18 = 37 * (i17 + i16);
      if (this.cdkey_id == null)
        break label493;
      i19 = this.cdkey_id.hashCode();
      int i20 = 37 * (i19 + i18);
      if (this.provide_type == null)
        break label499;
      i21 = this.provide_type.hashCode();
      int i22 = 37 * (i21 + i20);
      if (this.end_date_stamp == null)
        break label505;
      i23 = this.end_date_stamp.hashCode();
      i24 = 37 * (i23 + i22);
      if (this.status == null)
        break label511;
    }
    label428: label433: label439: label445: label451: label457: label463: label469: label475: label481: label487: label493: label499: label505: label511: for (int i25 = this.status.hashCode(); ; i25 = 0)
    {
      int i26 = 37 * (i25 + i24);
      Long localLong = this.reuse_start_date;
      int i27 = 0;
      if (localLong != null)
        i27 = this.reuse_start_date.hashCode();
      i = i26 + i27;
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
      i9 = 0;
      break label174;
      i11 = 0;
      break label200;
      i13 = 0;
      break label226;
      i15 = 0;
      break label252;
      i17 = 0;
      break label278;
      i19 = 0;
      break label304;
      i21 = 0;
      break label330;
      i23 = 0;
      break label356;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.GiftDetail
 * JD-Core Version:    0.6.0
 */