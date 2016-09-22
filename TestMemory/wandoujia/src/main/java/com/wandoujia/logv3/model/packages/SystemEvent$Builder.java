package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class SystemEvent$Builder extends Message.Builder<SystemEvent>
{
  public String debug;
  public ExtraPackage extra_package;

  public SystemEvent$Builder()
  {
  }

  public SystemEvent$Builder(SystemEvent paramSystemEvent)
  {
    super(paramSystemEvent);
    if (paramSystemEvent == null)
      return;
    this.debug = paramSystemEvent.debug;
    this.extra_package = paramSystemEvent.extra_package;
  }

  public final SystemEvent build()
  {
    return new SystemEvent(this, null);
  }

  public final Builder debug(String paramString)
  {
    this.debug = paramString;
    return this;
  }

  public final Builder extra_package(ExtraPackage paramExtraPackage)
  {
    this.extra_package = paramExtraPackage;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.SystemEvent.Builder
 * JD-Core Version:    0.6.0
 */