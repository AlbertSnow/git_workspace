package com.wandoujia.push.protocol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StandardPushEntity$Callback
  implements Serializable
{
  private List<StandardPushEntity.Callback.Pair> headers;
  private List<StandardPushEntity.Callback.Pair> parameters;
  private String url;

  public void addHeader(String paramString1, String paramString2)
  {
    if (this.headers == null)
      this.headers = new ArrayList();
    this.headers.add(new StandardPushEntity.Callback.Pair(paramString1, paramString2));
  }

  public void addParameter(String paramString1, String paramString2)
  {
    if (this.parameters == null)
      this.parameters = new ArrayList();
    this.parameters.add(new StandardPushEntity.Callback.Pair(paramString1, paramString2));
  }

  public List<StandardPushEntity.Callback.Pair> getHeaders()
  {
    return this.headers;
  }

  public List<StandardPushEntity.Callback.Pair> getParameters()
  {
    return this.parameters;
  }

  public String getUrl()
  {
    return this.url;
  }

  public void setHeaders(List<StandardPushEntity.Callback.Pair> paramList)
  {
    this.headers = paramList;
  }

  public void setParameters(List<StandardPushEntity.Callback.Pair> paramList)
  {
    this.parameters = paramList;
  }

  public void setUrl(String paramString)
  {
    this.url = paramString;
  }

  public String toString()
  {
    return "[ url is " + this.url + ", headers is " + this.headers + ", parameters is " + this.parameters + "]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push.protocol.StandardPushEntity.Callback
 * JD-Core Version:    0.6.0
 */