package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class CommonPackage$Builder extends Message.Builder<CommonPackage>
{
  public AccountPackage account_package;
  public ClientPackage client_package;
  public HostPackage host_package;
  public IdPackage id_package;
  public LaunchSourcePackage launch_source_package;
  public NetworkPackage network_package;
  public TimePackage time_package;

  public CommonPackage$Builder()
  {
  }

  public CommonPackage$Builder(CommonPackage paramCommonPackage)
  {
    super(paramCommonPackage);
    if (paramCommonPackage == null)
      return;
    this.id_package = paramCommonPackage.id_package;
    this.client_package = paramCommonPackage.client_package;
    this.time_package = paramCommonPackage.time_package;
    this.network_package = paramCommonPackage.network_package;
    this.account_package = paramCommonPackage.account_package;
    this.launch_source_package = paramCommonPackage.launch_source_package;
    this.host_package = paramCommonPackage.host_package;
  }

  public final Builder account_package(AccountPackage paramAccountPackage)
  {
    this.account_package = paramAccountPackage;
    return this;
  }

  public final CommonPackage build()
  {
    checkRequiredFields();
    return new CommonPackage(this, null);
  }

  public final Builder client_package(ClientPackage paramClientPackage)
  {
    this.client_package = paramClientPackage;
    return this;
  }

  public final Builder host_package(HostPackage paramHostPackage)
  {
    this.host_package = paramHostPackage;
    return this;
  }

  public final Builder id_package(IdPackage paramIdPackage)
  {
    this.id_package = paramIdPackage;
    return this;
  }

  public final Builder launch_source_package(LaunchSourcePackage paramLaunchSourcePackage)
  {
    this.launch_source_package = paramLaunchSourcePackage;
    return this;
  }

  public final Builder network_package(NetworkPackage paramNetworkPackage)
  {
    this.network_package = paramNetworkPackage;
    return this;
  }

  public final Builder time_package(TimePackage paramTimePackage)
  {
    this.time_package = paramTimePackage;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.CommonPackage.Builder
 * JD-Core Version:    0.6.0
 */