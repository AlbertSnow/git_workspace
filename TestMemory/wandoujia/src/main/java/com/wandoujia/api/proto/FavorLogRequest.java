package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FavorLogRequest extends Message
{
  public static final List<FavorLog> DEFAULT_LOG;
  public static final Integer DEFAULT_PB_VERSION = Integer.valueOf(0);

  @ProtoField(label=Message.Label.REPEATED, tag=2)
  public final List<FavorLog> log;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.INT32)
  public final Integer pb_version;

  static
  {
    DEFAULT_LOG = Collections.emptyList();
  }

  private FavorLogRequest(FavorLogRequest.Builder paramBuilder)
  {
    super(paramBuilder);
    this.pb_version = paramBuilder.pb_version;
    this.log = immutableCopyOf(paramBuilder.log);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    FavorLogRequest localFavorLogRequest;
    do
    {
      return true;
      if (!(paramObject instanceof FavorLogRequest))
        return false;
      localFavorLogRequest = (FavorLogRequest)paramObject;
    }
    while ((equals(this.pb_version, localFavorLogRequest.pb_version)) && (equals(this.log, localFavorLogRequest.log)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.pb_version == null)
        break label59;
      j = this.pb_version.hashCode();
      k = j * 37;
      if (this.log == null)
        break label64;
    }
    label59: label64: for (int m = this.log.hashCode(); ; m = 1)
    {
      i = m + k;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.FavorLogRequest
 * JD-Core Version:    0.6.0
 */