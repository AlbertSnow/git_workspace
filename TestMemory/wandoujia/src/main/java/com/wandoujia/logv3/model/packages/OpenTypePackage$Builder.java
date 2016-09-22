package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class OpenTypePackage$Builder extends Message.Builder<OpenTypePackage>
{
  public OpenTypePackage.Mode mode;
  public String open_provider_package_name;
  public OpenTypePackage.OpenType type;

  public OpenTypePackage$Builder()
  {
  }

  public OpenTypePackage$Builder(OpenTypePackage paramOpenTypePackage)
  {
    super(paramOpenTypePackage);
    if (paramOpenTypePackage == null)
      return;
    this.type = paramOpenTypePackage.type;
    this.mode = paramOpenTypePackage.mode;
    this.open_provider_package_name = paramOpenTypePackage.open_provider_package_name;
  }

  public final OpenTypePackage build()
  {
    return new OpenTypePackage(this, null);
  }

  public final Builder mode(OpenTypePackage.Mode paramMode)
  {
    this.mode = paramMode;
    return this;
  }

  public final Builder open_provider_package_name(String paramString)
  {
    this.open_provider_package_name = paramString;
    return this;
  }

  public final Builder type(OpenTypePackage.OpenType paramOpenType)
  {
    this.type = paramOpenType;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.OpenTypePackage.Builder
 * JD-Core Version:    0.6.0
 */