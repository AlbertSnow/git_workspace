package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class ApplicationCrashEvent$Builder extends Message.Builder<ApplicationCrashEvent>
{
  public String activity;
  public String detail;
  public Boolean is_launch;
  public ApplicationCrashEvent.Type type;
  public ViewLogPackage view;

  public ApplicationCrashEvent$Builder()
  {
  }

  public ApplicationCrashEvent$Builder(ApplicationCrashEvent paramApplicationCrashEvent)
  {
    super(paramApplicationCrashEvent);
    if (paramApplicationCrashEvent == null)
      return;
    this.type = paramApplicationCrashEvent.type;
    this.detail = paramApplicationCrashEvent.detail;
    this.view = paramApplicationCrashEvent.view;
    this.is_launch = paramApplicationCrashEvent.is_launch;
    this.activity = paramApplicationCrashEvent.activity;
  }

  public final Builder activity(String paramString)
  {
    this.activity = paramString;
    return this;
  }

  public final ApplicationCrashEvent build()
  {
    return new ApplicationCrashEvent(this, null);
  }

  public final Builder detail(String paramString)
  {
    this.detail = paramString;
    return this;
  }

  public final Builder is_launch(Boolean paramBoolean)
  {
    this.is_launch = paramBoolean;
    return this;
  }

  public final Builder type(ApplicationCrashEvent.Type paramType)
  {
    this.type = paramType;
    return this;
  }

  public final Builder view(ViewLogPackage paramViewLogPackage)
  {
    this.view = paramViewLogPackage;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ApplicationCrashEvent.Builder
 * JD-Core Version:    0.6.0
 */