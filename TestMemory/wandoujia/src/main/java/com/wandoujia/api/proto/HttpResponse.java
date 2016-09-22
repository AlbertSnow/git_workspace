package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class HttpResponse extends Message
{
  public static final List<Entity> DEFAULT_ENTITY;
  public static final Long DEFAULT_FAVOR_HEAD;
  public static final Long DEFAULT_FAVOR_NEXT_HEAD;
  public static final Boolean DEFAULT_HAS_MORE = Boolean.valueOf(false);
  public static final String DEFAULT_NEXT_URL = "";
  public static final Integer DEFAULT_PB_VERSION = Integer.valueOf(0);
  public static final String DEFAULT_PRE_URL = "";
  public static final Long DEFAULT_SESSION_ID = Long.valueOf(0L);
  public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
  public static final Long DEFAULT_TIMESTAMP;

  @ProtoField(label=Message.Label.REPEATED, tag=7)
  public final List<Entity> entity;

  @ProtoField(tag=8, type=Message.Datatype.INT64)
  public final Long favor_head;

  @ProtoField(tag=9, type=Message.Datatype.INT64)
  public final Long favor_next_head;

  @ProtoField(tag=3, type=Message.Datatype.BOOL)
  public final Boolean has_more;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String next_url;

  @ProtoField(label=Message.Label.REQUIRED, tag=4, type=Message.Datatype.INT32)
  public final Integer pb_version;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String pre_url;

  @ProtoField(label=Message.Label.REQUIRED, tag=5, type=Message.Datatype.FIXED64)
  public final Long session_id;

  @ProtoField(label=Message.Label.REQUIRED, tag=6, type=Message.Datatype.INT32)
  public final Integer status;

  @ProtoField(tag=10, type=Message.Datatype.INT64)
  public final Long timestamp;

  static
  {
    DEFAULT_ENTITY = Collections.emptyList();
    DEFAULT_FAVOR_HEAD = Long.valueOf(0L);
    DEFAULT_FAVOR_NEXT_HEAD = Long.valueOf(0L);
    DEFAULT_TIMESTAMP = Long.valueOf(0L);
  }

  private HttpResponse(HttpResponse.Builder paramBuilder)
  {
    super(paramBuilder);
    this.next_url = paramBuilder.next_url;
    this.pre_url = paramBuilder.pre_url;
    this.has_more = paramBuilder.has_more;
    this.pb_version = paramBuilder.pb_version;
    this.session_id = paramBuilder.session_id;
    this.status = paramBuilder.status;
    this.entity = immutableCopyOf(paramBuilder.entity);
    this.favor_head = paramBuilder.favor_head;
    this.favor_next_head = paramBuilder.favor_next_head;
    this.timestamp = paramBuilder.timestamp;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    HttpResponse localHttpResponse;
    do
    {
      return true;
      if (!(paramObject instanceof HttpResponse))
        return false;
      localHttpResponse = (HttpResponse)paramObject;
    }
    while ((equals(this.next_url, localHttpResponse.next_url)) && (equals(this.pre_url, localHttpResponse.pre_url)) && (equals(this.has_more, localHttpResponse.has_more)) && (equals(this.pb_version, localHttpResponse.pb_version)) && (equals(this.session_id, localHttpResponse.session_id)) && (equals(this.status, localHttpResponse.status)) && (equals(this.entity, localHttpResponse.entity)) && (equals(this.favor_head, localHttpResponse.favor_head)) && (equals(this.favor_next_head, localHttpResponse.favor_next_head)) && (equals(this.timestamp, localHttpResponse.timestamp)));
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
    label176: int i11;
    label202: int i12;
    if (i == 0)
    {
      if (this.next_url == null)
        break label274;
      j = this.next_url.hashCode();
      int k = j * 37;
      if (this.pre_url == null)
        break label279;
      m = this.pre_url.hashCode();
      int n = 37 * (m + k);
      if (this.has_more == null)
        break label285;
      i1 = this.has_more.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.pb_version == null)
        break label291;
      i3 = this.pb_version.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.session_id == null)
        break label297;
      i5 = this.session_id.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.status == null)
        break label303;
      i7 = this.status.hashCode();
      int i8 = 37 * (i7 + i6);
      if (this.entity == null)
        break label309;
      i9 = this.entity.hashCode();
      int i10 = 37 * (i9 + i8);
      if (this.favor_head == null)
        break label315;
      i11 = this.favor_head.hashCode();
      i12 = 37 * (i11 + i10);
      if (this.favor_next_head == null)
        break label321;
    }
    label274: label279: label285: label291: label297: label303: label309: label315: label321: for (int i13 = this.favor_next_head.hashCode(); ; i13 = 0)
    {
      int i14 = 37 * (i13 + i12);
      Long localLong = this.timestamp;
      int i15 = 0;
      if (localLong != null)
        i15 = this.timestamp.hashCode();
      i = i14 + i15;
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
      i9 = 1;
      break label176;
      i11 = 0;
      break label202;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.HttpResponse
 * JD-Core Version:    0.6.0
 */