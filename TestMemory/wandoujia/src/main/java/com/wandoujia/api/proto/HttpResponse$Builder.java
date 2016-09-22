package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class HttpResponse$Builder extends Message.Builder<HttpResponse>
{
  public List<Entity> entity;
  public Long favor_head;
  public Long favor_next_head;
  public Boolean has_more;
  public String next_url;
  public Integer pb_version;
  public String pre_url;
  public Long session_id;
  public Integer status;
  public Long timestamp;

  public HttpResponse$Builder()
  {
  }

  public HttpResponse$Builder(HttpResponse paramHttpResponse)
  {
    super(paramHttpResponse);
    if (paramHttpResponse == null)
      return;
    this.next_url = paramHttpResponse.next_url;
    this.pre_url = paramHttpResponse.pre_url;
    this.has_more = paramHttpResponse.has_more;
    this.pb_version = paramHttpResponse.pb_version;
    this.session_id = paramHttpResponse.session_id;
    this.status = paramHttpResponse.status;
    this.entity = HttpResponse.access$000(paramHttpResponse.entity);
    this.favor_head = paramHttpResponse.favor_head;
    this.favor_next_head = paramHttpResponse.favor_next_head;
    this.timestamp = paramHttpResponse.timestamp;
  }

  public final HttpResponse build()
  {
    checkRequiredFields();
    return new HttpResponse(this, null);
  }

  public final Builder entity(List<Entity> paramList)
  {
    this.entity = checkForNulls(paramList);
    return this;
  }

  public final Builder favor_head(Long paramLong)
  {
    this.favor_head = paramLong;
    return this;
  }

  public final Builder favor_next_head(Long paramLong)
  {
    this.favor_next_head = paramLong;
    return this;
  }

  public final Builder has_more(Boolean paramBoolean)
  {
    this.has_more = paramBoolean;
    return this;
  }

  public final Builder next_url(String paramString)
  {
    this.next_url = paramString;
    return this;
  }

  public final Builder pb_version(Integer paramInteger)
  {
    this.pb_version = paramInteger;
    return this;
  }

  public final Builder pre_url(String paramString)
  {
    this.pre_url = paramString;
    return this;
  }

  public final Builder session_id(Long paramLong)
  {
    this.session_id = paramLong;
    return this;
  }

  public final Builder status(Integer paramInteger)
  {
    this.status = paramInteger;
    return this;
  }

  public final Builder timestamp(Long paramLong)
  {
    this.timestamp = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.HttpResponse.Builder
 * JD-Core Version:    0.6.0
 */