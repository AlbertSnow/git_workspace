package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class PreloadInfo$Builder extends Message.Builder<PreloadInfo>
{
  public Boolean preload;
  public String preload_url;

  public PreloadInfo$Builder()
  {
  }

  public PreloadInfo$Builder(PreloadInfo paramPreloadInfo)
  {
    super(paramPreloadInfo);
    if (paramPreloadInfo == null)
      return;
    this.preload = paramPreloadInfo.preload;
    this.preload_url = paramPreloadInfo.preload_url;
  }

  public final PreloadInfo build()
  {
    return new PreloadInfo(this, null);
  }

  public final Builder preload(Boolean paramBoolean)
  {
    this.preload = paramBoolean;
    return this;
  }

  public final Builder preload_url(String paramString)
  {
    this.preload_url = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.PreloadInfo.Builder
 * JD-Core Version:    0.6.0
 */