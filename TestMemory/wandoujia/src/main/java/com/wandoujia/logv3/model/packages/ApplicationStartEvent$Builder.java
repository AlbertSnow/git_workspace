package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class ApplicationStartEvent$Builder extends Message.Builder<ApplicationStartEvent>
{
  public String action;
  public String activity;
  public String data;
  public ApplicationStartEvent.Reason reason;

  public ApplicationStartEvent$Builder()
  {
  }

  public ApplicationStartEvent$Builder(ApplicationStartEvent paramApplicationStartEvent)
  {
    super(paramApplicationStartEvent);
    if (paramApplicationStartEvent == null)
      return;
    this.action = paramApplicationStartEvent.action;
    this.activity = paramApplicationStartEvent.activity;
    this.data = paramApplicationStartEvent.data;
    this.reason = paramApplicationStartEvent.reason;
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

  public final ApplicationStartEvent build()
  {
    return new ApplicationStartEvent(this, null);
  }

  public final Builder data(String paramString)
  {
    this.data = paramString;
    return this;
  }

  public final Builder reason(ApplicationStartEvent.Reason paramReason)
  {
    this.reason = paramReason;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ApplicationStartEvent.Builder
 * JD-Core Version:    0.6.0
 */