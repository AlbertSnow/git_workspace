package com.wandoujia.p4.app.detail.b;

import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class d extends AbstractHttpRequestBuilder
{
  private int a;
  private int b;
  private String c;

  public final void a(int paramInt)
  {
    this.a = paramInt;
  }

  public final void a(String paramString)
  {
    this.c = paramString;
  }

  public final void b(int paramInt)
  {
    this.b = paramInt;
  }

  protected final String getUrl()
  {
    return "http://comment.wandoujia.com/comment/comment!getCommentSummary.action";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    paramParams.put("target", this.c);
    paramParams.put("pageNum", String.valueOf(this.a / this.b));
    paramParams.put("pageSize", String.valueOf(this.b));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.b.d
 * JD-Core Version:    0.6.0
 */