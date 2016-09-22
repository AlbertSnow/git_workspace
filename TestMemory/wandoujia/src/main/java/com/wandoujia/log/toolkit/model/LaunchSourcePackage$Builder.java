package com.wandoujia.log.toolkit.model;

import com.squareup.wire.Message.Builder;

public final class LaunchSourcePackage$Builder extends Message.Builder<LaunchSourcePackage>
{
  public String launch_keyword;
  public String launch_source;

  public LaunchSourcePackage$Builder()
  {
  }

  public LaunchSourcePackage$Builder(LaunchSourcePackage paramLaunchSourcePackage)
  {
    super(paramLaunchSourcePackage);
    if (paramLaunchSourcePackage == null)
      return;
    this.launch_source = paramLaunchSourcePackage.launch_source;
    this.launch_keyword = paramLaunchSourcePackage.launch_keyword;
  }

  public final LaunchSourcePackage build()
  {
    return new LaunchSourcePackage(this, null);
  }

  public final Builder launch_keyword(String paramString)
  {
    this.launch_keyword = paramString;
    return this;
  }

  public final Builder launch_source(String paramString)
  {
    this.launch_source = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.log.toolkit.model.LaunchSourcePackage.Builder
 * JD-Core Version:    0.6.0
 */