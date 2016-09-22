package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class PublisherDetail$Builder extends Message.Builder<PublisherDetail>
{
  public String avatar;
  public PublisherCategory category;
  public String circleAvatar;
  public Long createTime;
  public Boolean defaultSelected;
  public String description;
  public Integer feedCount;
  public String fullDescription;
  public String id;
  public String nick;
  public RelatedApp relatedApp;
  public Boolean subscribed;
  public Integer subscribedCount;
  public List<String> tags;
  public String type;
  public String uid;

  public PublisherDetail$Builder()
  {
  }

  public PublisherDetail$Builder(PublisherDetail paramPublisherDetail)
  {
    super(paramPublisherDetail);
    if (paramPublisherDetail == null)
      return;
    this.subscribed = paramPublisherDetail.subscribed;
    this.type = paramPublisherDetail.type;
    this.id = paramPublisherDetail.id;
    this.uid = paramPublisherDetail.uid;
    this.nick = paramPublisherDetail.nick;
    this.avatar = paramPublisherDetail.avatar;
    this.circleAvatar = paramPublisherDetail.circleAvatar;
    this.description = paramPublisherDetail.description;
    this.fullDescription = paramPublisherDetail.fullDescription;
    this.subscribedCount = paramPublisherDetail.subscribedCount;
    this.feedCount = paramPublisherDetail.feedCount;
    this.defaultSelected = paramPublisherDetail.defaultSelected;
    this.createTime = paramPublisherDetail.createTime;
    this.category = paramPublisherDetail.category;
    this.relatedApp = paramPublisherDetail.relatedApp;
    this.tags = PublisherDetail.access$000(paramPublisherDetail.tags);
  }

  public final Builder avatar(String paramString)
  {
    this.avatar = paramString;
    return this;
  }

  public final PublisherDetail build()
  {
    return new PublisherDetail(this, null);
  }

  public final Builder category(PublisherCategory paramPublisherCategory)
  {
    this.category = paramPublisherCategory;
    return this;
  }

  public final Builder circleAvatar(String paramString)
  {
    this.circleAvatar = paramString;
    return this;
  }

  public final Builder createTime(Long paramLong)
  {
    this.createTime = paramLong;
    return this;
  }

  public final Builder defaultSelected(Boolean paramBoolean)
  {
    this.defaultSelected = paramBoolean;
    return this;
  }

  public final Builder description(String paramString)
  {
    this.description = paramString;
    return this;
  }

  public final Builder feedCount(Integer paramInteger)
  {
    this.feedCount = paramInteger;
    return this;
  }

  public final Builder fullDescription(String paramString)
  {
    this.fullDescription = paramString;
    return this;
  }

  public final Builder id(String paramString)
  {
    this.id = paramString;
    return this;
  }

  public final Builder nick(String paramString)
  {
    this.nick = paramString;
    return this;
  }

  public final Builder relatedApp(RelatedApp paramRelatedApp)
  {
    this.relatedApp = paramRelatedApp;
    return this;
  }

  public final Builder subscribed(Boolean paramBoolean)
  {
    this.subscribed = paramBoolean;
    return this;
  }

  public final Builder subscribedCount(Integer paramInteger)
  {
    this.subscribedCount = paramInteger;
    return this;
  }

  public final Builder tags(List<String> paramList)
  {
    this.tags = checkForNulls(paramList);
    return this;
  }

  public final Builder type(String paramString)
  {
    this.type = paramString;
    return this;
  }

  public final Builder uid(String paramString)
  {
    this.uid = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.PublisherDetail.Builder
 * JD-Core Version:    0.6.0
 */