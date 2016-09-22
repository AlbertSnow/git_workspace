package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class LogTrackPackage extends Message
{
  public static final Long DEFAULT_COMPLETED;
  public static final Long DEFAULT_DATABASE;
  public static final Long DEFAULT_DISCARD;
  public static final Long DEFAULT_PREPARE = Long.valueOf(0L);

  @ProtoField(tag=3, type=Message.Datatype.INT64)
  public final Long completed;

  @ProtoField(tag=2, type=Message.Datatype.INT64)
  public final Long database;

  @ProtoField(tag=4, type=Message.Datatype.INT64)
  public final Long discard;

  @ProtoField(tag=1, type=Message.Datatype.INT64)
  public final Long prepare;

  static
  {
    DEFAULT_DATABASE = Long.valueOf(0L);
    DEFAULT_COMPLETED = Long.valueOf(0L);
    DEFAULT_DISCARD = Long.valueOf(0L);
  }

  private LogTrackPackage(LogTrackPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.prepare = paramBuilder.prepare;
    this.database = paramBuilder.database;
    this.completed = paramBuilder.completed;
    this.discard = paramBuilder.discard;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    LogTrackPackage localLogTrackPackage;
    do
    {
      return true;
      if (!(paramObject instanceof LogTrackPackage))
        return false;
      localLogTrackPackage = (LogTrackPackage)paramObject;
    }
    while ((equals(this.prepare, localLogTrackPackage.prepare)) && (equals(this.database, localLogTrackPackage.database)) && (equals(this.completed, localLogTrackPackage.completed)) && (equals(this.discard, localLogTrackPackage.discard)));
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
      if (this.prepare == null)
        break label116;
      j = this.prepare.hashCode();
      int k = j * 37;
      if (this.database == null)
        break label121;
      m = this.database.hashCode();
      n = 37 * (m + k);
      if (this.completed == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.completed.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      Long localLong = this.discard;
      int i3 = 0;
      if (localLong != null)
        i3 = this.discard.hashCode();
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
 * Qualified Name:     com.wandoujia.logv3.model.packages.LogTrackPackage
 * JD-Core Version:    0.6.0
 */