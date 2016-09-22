package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class UrlPackage$Builder extends Message.Builder<UrlPackage>
{
  public String normalized_url;
  public String url;
  public UrlPackage.Vertical vertical;

  public UrlPackage$Builder()
  {
  }

  public UrlPackage$Builder(UrlPackage paramUrlPackage)
  {
    super(paramUrlPackage);
    if (paramUrlPackage == null)
      return;
    this.url = paramUrlPackage.url;
    this.normalized_url = paramUrlPackage.normalized_url;
    this.vertical = paramUrlPackage.vertical;
  }

  public final UrlPackage build()
  {
    return new UrlPackage(this, null);
  }

  public final Builder normalized_url(String paramString)
  {
    this.normalized_url = paramString;
    return this;
  }

  public final Builder url(String paramString)
  {
    this.url = paramString;
    return this;
  }

  public final Builder vertical(UrlPackage.Vertical paramVertical)
  {
    this.vertical = paramVertical;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.UrlPackage.Builder
 * JD-Core Version:    0.6.0
 */