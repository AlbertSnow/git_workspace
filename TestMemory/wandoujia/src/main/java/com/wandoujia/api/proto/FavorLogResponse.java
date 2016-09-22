package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class FavorLogResponse extends Message
{
  public static final Long DEFAULT_HEAD;
  public static final Long DEFAULT_NEXT_HEAD;
  public static final Boolean DEFAULT_NOTHING_COMMIT;
  public static final Integer DEFAULT_PB_VERSION = Integer.valueOf(0);
  public static final Integer DEFAULT_STATUS;

  @ProtoField(label=Message.Label.REQUIRED, tag=2, type=Message.Datatype.INT64)
  public final Long head;

  @ProtoField(label=Message.Label.REQUIRED, tag=3, type=Message.Datatype.INT64)
  public final Long next_head;

  @ProtoField(label=Message.Label.REQUIRED, tag=5, type=Message.Datatype.BOOL)
  public final Boolean nothing_commit;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.INT32)
  public final Integer pb_version;

  @ProtoField(label=Message.Label.REQUIRED, tag=4, type=Message.Datatype.INT32)
  public final Integer status;

  static
  {
    DEFAULT_HEAD = Long.valueOf(0L);
    DEFAULT_NEXT_HEAD = Long.valueOf(0L);
    DEFAULT_STATUS = Integer.valueOf(0);
    DEFAULT_NOTHING_COMMIT = Boolean.valueOf(false);
  }

  private FavorLogResponse(FavorLogResponse.Builder paramBuilder)
  {
    super(paramBuilder);
    this.pb_version = paramBuilder.pb_version;
    this.head = paramBuilder.head;
    this.next_head = paramBuilder.next_head;
    this.status = paramBuilder.status;
    this.nothing_commit = paramBuilder.nothing_commit;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    FavorLogResponse localFavorLogResponse;
    do
    {
      return true;
      if (!(paramObject instanceof FavorLogResponse))
        return false;
      localFavorLogResponse = (FavorLogResponse)paramObject;
    }
    while ((equals(this.pb_version, localFavorLogResponse.pb_version)) && (equals(this.head, localFavorLogResponse.head)) && (equals(this.next_head, localFavorLogResponse.next_head)) && (equals(this.status, localFavorLogResponse.status)) && (equals(this.nothing_commit, localFavorLogResponse.nothing_commit)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i2;
    if (i == 0)
    {
      if (this.pb_version == null)
        break label142;
      j = this.pb_version.hashCode();
      int k = j * 37;
      if (this.head == null)
        break label147;
      m = this.head.hashCode();
      int n = 37 * (m + k);
      if (this.next_head == null)
        break label153;
      i1 = this.next_head.hashCode();
      i2 = 37 * (i1 + n);
      if (this.status == null)
        break label159;
    }
    label142: label147: label153: label159: for (int i3 = this.status.hashCode(); ; i3 = 0)
    {
      int i4 = 37 * (i3 + i2);
      Boolean localBoolean = this.nothing_commit;
      int i5 = 0;
      if (localBoolean != null)
        i5 = this.nothing_commit.hashCode();
      i = i4 + i5;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
      i1 = 0;
      break label70;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.FavorLogResponse
 * JD-Core Version:    0.6.0
 */