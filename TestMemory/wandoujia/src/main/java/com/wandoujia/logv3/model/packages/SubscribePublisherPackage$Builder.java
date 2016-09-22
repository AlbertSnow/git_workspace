package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class SubscribePublisherPackage$Builder extends Message.Builder<SubscribePublisherPackage>
{
  public Boolean publisher_defaultSelected;
  public String publisher_id;
  public String publisher_nick;
  public Boolean publisher_subscribed;
  public String publisher_subscribedCount;
  public String publisher_type;

  public SubscribePublisherPackage$Builder()
  {
  }

  public SubscribePublisherPackage$Builder(SubscribePublisherPackage paramSubscribePublisherPackage)
  {
    super(paramSubscribePublisherPackage);
    if (paramSubscribePublisherPackage == null)
      return;
    this.publisher_type = paramSubscribePublisherPackage.publisher_type;
    this.publisher_id = paramSubscribePublisherPackage.publisher_id;
    this.publisher_nick = paramSubscribePublisherPackage.publisher_nick;
    this.publisher_subscribedCount = paramSubscribePublisherPackage.publisher_subscribedCount;
    this.publisher_subscribed = paramSubscribePublisherPackage.publisher_subscribed;
    this.publisher_defaultSelected = paramSubscribePublisherPackage.publisher_defaultSelected;
  }

  public final SubscribePublisherPackage build()
  {
    return new SubscribePublisherPackage(this, null);
  }

  public final Builder publisher_defaultSelected(Boolean paramBoolean)
  {
    this.publisher_defaultSelected = paramBoolean;
    return this;
  }

  public final Builder publisher_id(String paramString)
  {
    this.publisher_id = paramString;
    return this;
  }

  public final Builder publisher_nick(String paramString)
  {
    this.publisher_nick = paramString;
    return this;
  }

  public final Builder publisher_subscribed(Boolean paramBoolean)
  {
    this.publisher_subscribed = paramBoolean;
    return this;
  }

  public final Builder publisher_subscribedCount(String paramString)
  {
    this.publisher_subscribedCount = paramString;
    return this;
  }

  public final Builder publisher_type(String paramString)
  {
    this.publisher_type = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.SubscribePublisherPackage.Builder
 * JD-Core Version:    0.6.0
 */