package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ClientConfigResponse extends Message
{
  public static final Integer DEFAULT_ALARM_HOUR = Integer.valueOf(0);
  public static final String DEFAULT_ALARM_SUBTITLE = "";
  public static final String DEFAULT_ALARM_TEXT = "";
  public static final String DEFAULT_ALARM_TITLE = "";
  public static final List<MapFieldEntry> DEFAULT_CONFIG = Collections.emptyList();

  @ProtoField(tag=1, type=Message.Datatype.INT32)
  public final Integer alarm_hour;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String alarm_subtitle;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String alarm_text;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String alarm_title;

  @ProtoField(label=Message.Label.REPEATED, tag=5)
  public final List<MapFieldEntry> config;

  private ClientConfigResponse(ClientConfigResponse.Builder paramBuilder)
  {
    super(paramBuilder);
    this.alarm_hour = paramBuilder.alarm_hour;
    this.alarm_text = paramBuilder.alarm_text;
    this.alarm_title = paramBuilder.alarm_title;
    this.alarm_subtitle = paramBuilder.alarm_subtitle;
    this.config = immutableCopyOf(paramBuilder.config);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ClientConfigResponse localClientConfigResponse;
    do
    {
      return true;
      if (!(paramObject instanceof ClientConfigResponse))
        return false;
      localClientConfigResponse = (ClientConfigResponse)paramObject;
    }
    while ((equals(this.alarm_hour, localClientConfigResponse.alarm_hour)) && (equals(this.alarm_text, localClientConfigResponse.alarm_text)) && (equals(this.alarm_title, localClientConfigResponse.alarm_title)) && (equals(this.alarm_subtitle, localClientConfigResponse.alarm_subtitle)) && (equals(this.config, localClientConfigResponse.config)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i4;
    if (i == 0)
    {
      if (this.alarm_hour == null)
        break label144;
      j = this.alarm_hour.hashCode();
      int k = j * 37;
      if (this.alarm_text == null)
        break label149;
      m = this.alarm_text.hashCode();
      int n = 37 * (m + k);
      if (this.alarm_title == null)
        break label155;
      i1 = this.alarm_title.hashCode();
      int i2 = 37 * (i1 + n);
      String str = this.alarm_subtitle;
      int i3 = 0;
      if (str != null)
        i3 = this.alarm_subtitle.hashCode();
      i4 = 37 * (i2 + i3);
      if (this.config == null)
        break label161;
    }
    label144: label149: label155: label161: for (int i5 = this.config.hashCode(); ; i5 = 1)
    {
      i = i5 + i4;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
      i1 = 0;
      break label70;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ClientConfigResponse
 * JD-Core Version:    0.6.0
 */