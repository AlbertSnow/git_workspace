package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class TopicPackage$Builder extends Message.Builder<TopicPackage>
{
  public String id;

  public TopicPackage$Builder()
  {
  }

  public TopicPackage$Builder(TopicPackage paramTopicPackage)
  {
    super(paramTopicPackage);
    if (paramTopicPackage == null)
      return;
    this.id = paramTopicPackage.id;
  }

  public final TopicPackage build()
  {
    return new TopicPackage(this, null);
  }

  public final Builder id(String paramString)
  {
    this.id = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.TopicPackage.Builder
 * JD-Core Version:    0.6.0
 */