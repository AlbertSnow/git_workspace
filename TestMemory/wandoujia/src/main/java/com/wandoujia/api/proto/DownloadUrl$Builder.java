package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class DownloadUrl$Builder extends Message.Builder<DownloadUrl>
{
  public Integer aggr_weight;
  public String market;
  public String refer_url;
  public String url;

  public DownloadUrl$Builder()
  {
  }

  public DownloadUrl$Builder(DownloadUrl paramDownloadUrl)
  {
    super(paramDownloadUrl);
    if (paramDownloadUrl == null)
      return;
    this.aggr_weight = paramDownloadUrl.aggr_weight;
    this.market = paramDownloadUrl.market;
    this.refer_url = paramDownloadUrl.refer_url;
    this.url = paramDownloadUrl.url;
  }

  public final Builder aggr_weight(Integer paramInteger)
  {
    this.aggr_weight = paramInteger;
    return this;
  }

  public final DownloadUrl build()
  {
    return new DownloadUrl(this, null);
  }

  public final Builder market(String paramString)
  {
    this.market = paramString;
    return this;
  }

  public final Builder refer_url(String paramString)
  {
    this.refer_url = paramString;
    return this;
  }

  public final Builder url(String paramString)
  {
    this.url = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.DownloadUrl.Builder
 * JD-Core Version:    0.6.0
 */