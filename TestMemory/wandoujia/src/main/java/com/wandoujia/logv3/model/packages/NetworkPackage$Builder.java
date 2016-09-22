package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class NetworkPackage$Builder extends Message.Builder<NetworkPackage>
{
  public String isp;
  public String remote_ip;
  public String ssid;
  public NetworkPackage.Subtype sub_type;
  public NetworkPackage.Type type;

  public NetworkPackage$Builder()
  {
  }

  public NetworkPackage$Builder(NetworkPackage paramNetworkPackage)
  {
    super(paramNetworkPackage);
    if (paramNetworkPackage == null)
      return;
    this.type = paramNetworkPackage.type;
    this.sub_type = paramNetworkPackage.sub_type;
    this.isp = paramNetworkPackage.isp;
    this.remote_ip = paramNetworkPackage.remote_ip;
    this.ssid = paramNetworkPackage.ssid;
  }

  public final NetworkPackage build()
  {
    return new NetworkPackage(this, null);
  }

  public final Builder isp(String paramString)
  {
    this.isp = paramString;
    return this;
  }

  public final Builder remote_ip(String paramString)
  {
    this.remote_ip = paramString;
    return this;
  }

  public final Builder ssid(String paramString)
  {
    this.ssid = paramString;
    return this;
  }

  public final Builder sub_type(NetworkPackage.Subtype paramSubtype)
  {
    this.sub_type = paramSubtype;
    return this;
  }

  public final Builder type(NetworkPackage.Type paramType)
  {
    this.type = paramType;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.NetworkPackage.Builder
 * JD-Core Version:    0.6.0
 */