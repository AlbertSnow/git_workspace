package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class ServerHostPackage$Builder extends Message.Builder<ServerHostPackage>
{
  public String host_ip;
  public String host_name;

  public ServerHostPackage$Builder()
  {
  }

  public ServerHostPackage$Builder(ServerHostPackage paramServerHostPackage)
  {
    super(paramServerHostPackage);
    if (paramServerHostPackage == null)
      return;
    this.host_ip = paramServerHostPackage.host_ip;
    this.host_name = paramServerHostPackage.host_name;
  }

  public final ServerHostPackage build()
  {
    return new ServerHostPackage(this, null);
  }

  public final Builder host_ip(String paramString)
  {
    this.host_ip = paramString;
    return this;
  }

  public final Builder host_name(String paramString)
  {
    this.host_name = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ServerHostPackage.Builder
 * JD-Core Version:    0.6.0
 */