package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class PreloadInfo extends Message
{
  public static final Boolean DEFAULT_PRELOAD = Boolean.valueOf(false);
  public static final String DEFAULT_PRELOAD_URL = "";

  @ProtoField(tag=1, type=Message.Datatype.BOOL)
  public final Boolean preload;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String preload_url;

  private PreloadInfo(PreloadInfo.Builder paramBuilder)
  {
    super(paramBuilder);
    this.preload = paramBuilder.preload;
    this.preload_url = paramBuilder.preload_url;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    PreloadInfo localPreloadInfo;
    do
    {
      return true;
      if (!(paramObject instanceof PreloadInfo))
        return false;
      localPreloadInfo = (PreloadInfo)paramObject;
    }
    while ((equals(this.preload, localPreloadInfo.preload)) && (equals(this.preload_url, localPreloadInfo.preload_url)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.preload == null)
        break label64;
    label64: for (int j = this.preload.hashCode(); ; j = 0)
    {
      int k = j * 37;
      String str = this.preload_url;
      int m = 0;
      if (str != null)
        m = this.preload_url.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.PreloadInfo
 * JD-Core Version:    0.6.0
 */