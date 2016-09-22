package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class FlingEvent$Builder extends Message.Builder<FlingEvent>
{
  public ExtraPackage extra_package;
  public FlingEvent.FlingDirection fling_direction;
  public ViewLogPackage view_log_package;

  public FlingEvent$Builder()
  {
  }

  public FlingEvent$Builder(FlingEvent paramFlingEvent)
  {
    super(paramFlingEvent);
    if (paramFlingEvent == null)
      return;
    this.view_log_package = paramFlingEvent.view_log_package;
    this.fling_direction = paramFlingEvent.fling_direction;
    this.extra_package = paramFlingEvent.extra_package;
  }

  public final FlingEvent build()
  {
    return new FlingEvent(this, null);
  }

  public final Builder extra_package(ExtraPackage paramExtraPackage)
  {
    this.extra_package = paramExtraPackage;
    return this;
  }

  public final Builder fling_direction(FlingEvent.FlingDirection paramFlingDirection)
  {
    this.fling_direction = paramFlingDirection;
    return this;
  }

  public final Builder view_log_package(ViewLogPackage paramViewLogPackage)
  {
    this.view_log_package = paramViewLogPackage;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.FlingEvent.Builder
 * JD-Core Version:    0.6.0
 */