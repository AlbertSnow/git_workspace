package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class NotificationPackage$Builder extends Message.Builder<NotificationPackage>
{
  public String id;
  public UrlPackage landing_page;
  public String style;
  public String title;
  public String type;

  public NotificationPackage$Builder()
  {
  }

  public NotificationPackage$Builder(NotificationPackage paramNotificationPackage)
  {
    super(paramNotificationPackage);
    if (paramNotificationPackage == null)
      return;
    this.title = paramNotificationPackage.title;
    this.id = paramNotificationPackage.id;
    this.type = paramNotificationPackage.type;
    this.style = paramNotificationPackage.style;
    this.landing_page = paramNotificationPackage.landing_page;
  }

  public final NotificationPackage build()
  {
    return new NotificationPackage(this, null);
  }

  public final Builder id(String paramString)
  {
    this.id = paramString;
    return this;
  }

  public final Builder landing_page(UrlPackage paramUrlPackage)
  {
    this.landing_page = paramUrlPackage;
    return this;
  }

  public final Builder style(String paramString)
  {
    this.style = paramString;
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
 * Qualified Name:     com.wandoujia.logv3.model.packages.NotificationPackage.Builder
 * JD-Core Version:    0.6.0
 */