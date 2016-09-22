package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class DownloadUrl extends Message
{
  public static final Integer DEFAULT_AGGR_WEIGHT = Integer.valueOf(0);
  public static final String DEFAULT_MARKET = "";
  public static final String DEFAULT_REFER_URL = "";
  public static final String DEFAULT_URL = "";

  @ProtoField(tag=1, type=Message.Datatype.INT32)
  public final Integer aggr_weight;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String market;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String refer_url;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String url;

  private DownloadUrl(DownloadUrl.Builder paramBuilder)
  {
    super(paramBuilder);
    this.aggr_weight = paramBuilder.aggr_weight;
    this.market = paramBuilder.market;
    this.refer_url = paramBuilder.refer_url;
    this.url = paramBuilder.url;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    DownloadUrl localDownloadUrl;
    do
    {
      return true;
      if (!(paramObject instanceof DownloadUrl))
        return false;
      localDownloadUrl = (DownloadUrl)paramObject;
    }
    while ((equals(this.aggr_weight, localDownloadUrl.aggr_weight)) && (equals(this.market, localDownloadUrl.market)) && (equals(this.refer_url, localDownloadUrl.refer_url)) && (equals(this.url, localDownloadUrl.url)));
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
      if (this.aggr_weight == null)
        break label116;
      j = this.aggr_weight.hashCode();
      int k = j * 37;
      if (this.market == null)
        break label121;
      m = this.market.hashCode();
      n = 37 * (m + k);
      if (this.refer_url == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.refer_url.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      String str = this.url;
      int i3 = 0;
      if (str != null)
        i3 = this.url.hashCode();
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
 * Qualified Name:     com.wandoujia.api.proto.DownloadUrl
 * JD-Core Version:    0.6.0
 */