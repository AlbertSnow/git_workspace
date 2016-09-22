package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class FavorLog extends Message
{
  public static final Long DEFAULT_COMMIT_VERSION;
  public static final Boolean DEFAULT_FAVOR;
  public static final Long DEFAULT_FEED_ID = Long.valueOf(0L);
  public static final Long DEFAULT_TIMESTAMP;

  @ProtoField(label=Message.Label.REQUIRED, tag=3, type=Message.Datatype.INT64)
  public final Long commit_version;

  @ProtoField(label=Message.Label.REQUIRED, tag=2, type=Message.Datatype.BOOL)
  public final Boolean favor;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.SFIXED64)
  public final Long feed_id;

  @ProtoField(tag=4, type=Message.Datatype.INT64)
  public final Long timestamp;

  static
  {
    DEFAULT_FAVOR = Boolean.valueOf(false);
    DEFAULT_COMMIT_VERSION = Long.valueOf(0L);
    DEFAULT_TIMESTAMP = Long.valueOf(0L);
  }

  private FavorLog(FavorLog.Builder paramBuilder)
  {
    super(paramBuilder);
    this.feed_id = paramBuilder.feed_id;
    this.favor = paramBuilder.favor;
    this.commit_version = paramBuilder.commit_version;
    this.timestamp = paramBuilder.timestamp;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    FavorLog localFavorLog;
    do
    {
      return true;
      if (!(paramObject instanceof FavorLog))
        return false;
      localFavorLog = (FavorLog)paramObject;
    }
    while ((equals(this.feed_id, localFavorLog.feed_id)) && (equals(this.favor, localFavorLog.favor)) && (equals(this.commit_version, localFavorLog.commit_version)) && (equals(this.timestamp, localFavorLog.timestamp)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int n;
    if (i == 0)
    {
      if (this.feed_id == null)
        break label116;
      j = this.feed_id.hashCode();
      int k = j * 37;
      if (this.favor == null)
        break label121;
      m = this.favor.hashCode();
      n = 37 * (m + k);
      if (this.commit_version == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.commit_version.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      Long localLong = this.timestamp;
      int i3 = 0;
      if (localLong != null)
        i3 = this.timestamp.hashCode();
      i = i2 + i3;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.FavorLog
 * JD-Core Version:    0.6.0
 */