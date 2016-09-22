package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class NotificationEvent$Builder extends Message.Builder<NotificationEvent>
{
  public NotificationEvent.Action action;
  public ExtraPackage extra_package;
  public UrlPackage landing_page;
  public String title;
  public String type;

  public NotificationEvent$Builder()
  {
  }

  public NotificationEvent$Builder(NotificationEvent paramNotificationEvent)
  {
    super(paramNotificationEvent);
    if (paramNotificationEvent == null)
      return;
    this.action = paramNotificationEvent.action;
    this.title = paramNotificationEvent.title;
    this.type = paramNotificationEvent.type;
    this.landing_page = paramNotificationEvent.landing_page;
    this.extra_package = paramNotificationEvent.extra_package;
  }

  public final Builder action(NotificationEvent.Action paramAction)
  {
    this.action = paramAction;
    return this;
  }

  public final NotificationEvent build()
  {
    return new NotificationEvent(this, null);
  }

  public final Builder extra_package(ExtraPackage paramExtraPackage)
  {
    this.extra_package = paramExtraPackage;
    return this;
  }

  public final Builder landing_page(UrlPackage paramUrlPackage)
  {
    this.landing_page = paramUrlPackage;
    return this;
  }

  public final Builder title(String paramString)
  {
    this.title = paramString;
    return this;
  }

  public final Builder type(String paramString)
  {
    this.type = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.NotificationEvent.Builder
 * JD-Core Version:    0.6.0
 */