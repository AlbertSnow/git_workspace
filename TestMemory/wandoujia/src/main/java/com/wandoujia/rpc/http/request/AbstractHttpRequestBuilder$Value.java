package com.wandoujia.rpc.http.request;

import java.io.Serializable;

public final class AbstractHttpRequestBuilder$Value
  implements Serializable
{
  private static final long serialVersionUID = -2274761554167685968L;
  public final boolean isCacheableParam;
  public final String value;

  public AbstractHttpRequestBuilder$Value(boolean paramBoolean, String paramString)
  {
    this.isCacheableParam = paramBoolean;
    this.value = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Value
 * JD-Core Version:    0.6.0
 */