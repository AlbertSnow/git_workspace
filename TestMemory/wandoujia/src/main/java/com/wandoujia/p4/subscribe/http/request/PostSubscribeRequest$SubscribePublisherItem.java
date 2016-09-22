package com.wandoujia.p4.subscribe.http.request;

import com.wandoujia.p4.subscribe.core.SubscribePublisherType;
import java.io.Serializable;

public class PostSubscribeRequest$SubscribePublisherItem
  implements Serializable
{
  private static final long serialVersionUID = 5459130947141447726L;
  String id;
  SubscribePublisherType type;

  public PostSubscribeRequest$SubscribePublisherItem(SubscribePublisherType paramSubscribePublisherType, String paramString)
  {
    this.type = paramSubscribePublisherType;
    this.id = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.http.request.PostSubscribeRequest.SubscribePublisherItem
 * JD-Core Version:    0.6.0
 */