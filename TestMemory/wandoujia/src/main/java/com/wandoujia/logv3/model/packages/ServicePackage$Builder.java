package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class ServicePackage$Builder extends Message.Builder<ServicePackage>
{
  public String name;

  public ServicePackage$Builder()
  {
  }

  public ServicePackage$Builder(ServicePackage paramServicePackage)
  {
    super(paramServicePackage);
    if (paramServicePackage == null)
      return;
    this.name = paramServicePackage.name;
  }

  public final ServicePackage build()
  {
    return new ServicePackage(this, null);
  }

  public final Builder name(String paramString)
  {
    this.name = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ServicePackage.Builder
 * JD-Core Version:    0.6.0
 */