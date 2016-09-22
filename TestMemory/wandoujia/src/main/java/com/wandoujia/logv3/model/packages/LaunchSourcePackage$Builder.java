package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class LaunchSourcePackage$Builder extends Message.Builder<LaunchSourcePackage>
{
  public String keyword;
  public LaunchSourcePackage.Source source;

  public LaunchSourcePackage$Builder()
  {
  }

  public LaunchSourcePackage$Builder(LaunchSourcePackage paramLaunchSourcePackage)
  {
    super(paramLaunchSourcePackage);
    if (paramLaunchSourcePackage == null)
      return;
    this.source = paramLaunchSourcePackage.source;
    this.keyword = paramLaunchSourcePackage.keyword;
  }

  public final LaunchSourcePackage build()
  {
    return new LaunchSourcePackage(this, null);
  }

  public final Builder keyword(String paramString)
  {
    this.keyword = paramString;
    return this;
  }

  public final Builder source(LaunchSourcePackage.Source paramSource)
  {
    this.source = paramSource;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.LaunchSourcePackage.Builder
 * JD-Core Version:    0.6.0
 */