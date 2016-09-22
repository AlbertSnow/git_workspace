package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class ClientConfigResponse$Builder extends Message.Builder<ClientConfigResponse>
{
  public Integer alarm_hour;
  public String alarm_subtitle;
  public String alarm_text;
  public String alarm_title;
  public List<MapFieldEntry> config;

  public ClientConfigResponse$Builder()
  {
  }

  public ClientConfigResponse$Builder(ClientConfigResponse paramClientConfigResponse)
  {
    super(paramClientConfigResponse);
    if (paramClientConfigResponse == null)
      return;
    this.alarm_hour = paramClientConfigResponse.alarm_hour;
    this.alarm_text = paramClientConfigResponse.alarm_text;
    this.alarm_title = paramClientConfigResponse.alarm_title;
    this.alarm_subtitle = paramClientConfigResponse.alarm_subtitle;
    this.config = ClientConfigResponse.access$000(paramClientConfigResponse.config);
  }

  public final Builder alarm_hour(Integer paramInteger)
  {
    this.alarm_hour = paramInteger;
    return this;
  }

  public final Builder alarm_subtitle(String paramString)
  {
    this.alarm_subtitle = paramString;
    return this;
  }

  public final Builder alarm_text(String paramString)
  {
    this.alarm_text = paramString;
    return this;
  }

  public final Builder alarm_title(String paramString)
  {
    this.alarm_title = paramString;
    return this;
  }

  public final ClientConfigResponse build()
  {
    return new ClientConfigResponse(this, null);
  }

  public final Builder config(List<MapFieldEntry> paramList)
  {
    this.config = checkForNulls(paramList);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ClientConfigResponse.Builder
 * JD-Core Version:    0.6.0
 */