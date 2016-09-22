package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class ApplicationActiveEvent$Builder extends Message.Builder<ApplicationActiveEvent>
{
  public String active;

  public ApplicationActiveEvent$Builder()
  {
  }

  public ApplicationActiveEvent$Builder(ApplicationActiveEvent paramApplicationActiveEvent)
  {
    super(paramApplicationActiveEvent);
    if (paramApplicationActiveEvent == null)
      return;
    this.active = paramApplicationActiveEvent.active;
  }

  public final Builder active(String paramString)
  {
    this.active = paramString;
    return this;
  }

  public final ApplicationActiveEvent build()
  {
    return new ApplicationActiveEvent(this, null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ApplicationActiveEvent.Builder
 * JD-Core Version:    0.6.0
 */