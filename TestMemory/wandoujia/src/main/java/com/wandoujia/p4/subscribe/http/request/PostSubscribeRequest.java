package com.wandoujia.p4.subscribe.http.request;

import com.wandoujia.p4.http.c.a;
import com.wandoujia.p4.subscribe.core.SubscribePublisherType;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Method;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;

public final class PostSubscribeRequest extends c
{
  private final List<PostSubscribeRequest.SubscribePublisherItem> a = new ArrayList();
  private final boolean b;

  public PostSubscribeRequest(boolean paramBoolean, String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString[j];
      this.a.add(new PostSubscribeRequest.SubscribePublisherItem(SubscribePublisherType.ACCOUNT, str));
    }
    this.b = paramBoolean;
    setMethod(AbstractHttpRequestBuilder.Method.POST);
    enableParamsInUrl();
  }

  protected final HttpEntity genEntity(AbstractHttpRequestBuilder.Params paramParams)
  {
    return new StringEntity(a.a().a(this.a, new b().getType()), "UTF-8");
  }

  protected final String getUrl()
  {
    if (this.b)
      return "http://subscribe.wandoujia.com/api/v2/subscriber/subscribe";
    return "http://subscribe.wandoujia.com/api/v2/subscriber/unsubscribe";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.http.request.PostSubscribeRequest
 * JD-Core Version:    0.6.0
 */