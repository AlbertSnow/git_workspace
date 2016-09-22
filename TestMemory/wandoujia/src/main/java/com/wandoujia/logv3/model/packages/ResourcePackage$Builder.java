package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class ResourcePackage$Builder extends Message.Builder<ResourcePackage>
{
  public String app_uri;
  public Boolean can_download;
  public String identity;
  public String provider_name;
  public String sub_type;
  public ResourcePackage.Type type;

  public ResourcePackage$Builder()
  {
  }

  public ResourcePackage$Builder(ResourcePackage paramResourcePackage)
  {
    super(paramResourcePackage);
    if (paramResourcePackage == null)
      return;
    this.identity = paramResourcePackage.identity;
    this.type = paramResourcePackage.type;
    this.provider_name = paramResourcePackage.provider_name;
    this.app_uri = paramResourcePackage.app_uri;
    this.can_download = paramResourcePackage.can_download;
    this.sub_type = paramResourcePackage.sub_type;
  }

  public final Builder app_uri(String paramString)
  {
    this.app_uri = paramString;
    return this;
  }

  public final ResourcePackage build()
  {
    return new ResourcePackage(this, null);
  }

  public final Builder can_download(Boolean paramBoolean)
  {
    this.can_download = paramBoolean;
    return this;
  }

  public final Builder identity(String paramString)
  {
    this.identity = paramString;
    return this;
  }

  public final Builder provider_name(String paramString)
  {
    this.provider_name = paramString;
    return this;
  }

  public final Builder sub_type(String paramString)
  {
    this.sub_type = paramString;
    return this;
  }

  public final Builder type(ResourcePackage.Type paramType)
  {
    this.type = paramType;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ResourcePackage.Builder
 * JD-Core Version:    0.6.0
 */