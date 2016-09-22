package com.wandoujia.launcher.d.b;

import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Method;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import java.util.Iterator;
import java.util.Set;

public final class a extends com.wandoujia.launcher_base.a.c.a
{
  private String a;

  public a()
  {
    setMethod(AbstractHttpRequestBuilder.Method.GET);
  }

  public final a a(Set<String> paramSet)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{,");
    Iterator localIterator = paramSet.iterator();
    while (localIterator.hasNext())
    {
      localStringBuilder.append((String)localIterator.next());
      localStringBuilder.append(",");
    }
    localStringBuilder.append("}");
    this.a = localStringBuilder.toString();
    return this;
  }

  protected final String getUrl()
  {
    return "http://apps.wandoujia.com/api/v1/appMetas";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    paramParams.put("from", "phoenix");
    paramParams.put("opt_fields", "title,packageName,appType,icons.px256");
    paramParams.put("pns", this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.d.b.a
 * JD-Core Version:    0.6.0
 */