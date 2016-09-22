package com.wandoujia.log.toolkit.model;

import com.squareup.wire.Message.Builder;

public final class LaunchPackage$Builder extends Message.Builder<LaunchPackage>
{
  public String action;
  public String activity;
  public String data;
  public String reason;
  public LaunchSourcePackage sourcePackage;

  public LaunchPackage$Builder()
  {
  }

  public LaunchPackage$Builder(LaunchPackage paramLaunchPackage)
  {
    super(paramLaunchPackage);
    if (paramLaunchPackage == null)
      return;
    this.sourcePackage = paramLaunchPackage.sourcePackage;
    this.action = paramLaunchPackage.action;
    this.activity = paramLaunchPackage.activity;
    this.data = paramLaunchPackage.data;
    this.reason = paramLaunchPackage.reason;
  }

  public final Builder action(String paramString)
  {
    this.action = paramString;
    return this;
  }

  public final Builder activity(String paramString)
  {
    this.activity = paramString;
    return this;
  }

  public final LaunchPackage build()
  {
    return new LaunchPackage(this, null);
  }

  public final Builder data(String paramString)
  {
    this.data = paramString;
    return this;
  }

  public final Builder reason(String paramString)
  {
    this.reason = paramString;
    return this;
  }

  public final Builder sourcePackage(LaunchSourcePackage paramLaunchSourcePackage)
  {
    this.sourcePackage = paramLaunchSourcePackage;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.log.toolkit.model.LaunchPackage.Builder
 * JD-Core Version:    0.6.0
 */