package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class AppTag$Builder extends Message.Builder<AppTag>
{
  public String tag;
  public Integer weight;

  public AppTag$Builder()
  {
  }

  public AppTag$Builder(AppTag paramAppTag)
  {
    super(paramAppTag);
    if (paramAppTag == null)
      return;
    this.tag = paramAppTag.tag;
    this.weight = paramAppTag.weight;
  }

  public final AppTag build()
  {
    return new AppTag(this, null);
  }

  public final Builder tag(String paramString)
  {
    this.tag = paramString;
    return this;
  }

  public final Builder weight(Integer paramInteger)
  {
    this.weight = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.AppTag.Builder
 * JD-Core Version:    0.6.0
 */