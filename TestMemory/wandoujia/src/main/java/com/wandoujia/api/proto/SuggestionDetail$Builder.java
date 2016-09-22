package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class SuggestionDetail$Builder extends Message.Builder<SuggestionDetail>
{
  public Long deadline;
  public List<MapFieldEntry> field;
  public String name;
  public Integer notification_location;
  public Integer notification_style;
  public Double weight;

  public SuggestionDetail$Builder()
  {
  }

  public SuggestionDetail$Builder(SuggestionDetail paramSuggestionDetail)
  {
    super(paramSuggestionDetail);
    if (paramSuggestionDetail == null)
      return;
    this.name = paramSuggestionDetail.name;
    this.field = SuggestionDetail.access$000(paramSuggestionDetail.field);
    this.weight = paramSuggestionDetail.weight;
    this.notification_style = paramSuggestionDetail.notification_style;
    this.deadline = paramSuggestionDetail.deadline;
    this.notification_location = paramSuggestionDetail.notification_location;
  }

  public final SuggestionDetail build()
  {
    return new SuggestionDetail(this, null);
  }

  public final Builder deadline(Long paramLong)
  {
    this.deadline = paramLong;
    return this;
  }

  public final Builder field(List<MapFieldEntry> paramList)
  {
    this.field = checkForNulls(paramList);
    return this;
  }

  public final Builder name(String paramString)
  {
    this.name = paramString;
    return this;
  }

  public final Builder notification_location(Integer paramInteger)
  {
    this.notification_location = paramInteger;
    return this;
  }

  public final Builder notification_style(Integer paramInteger)
  {
    this.notification_style = paramInteger;
    return this;
  }

  public final Builder weight(Double paramDouble)
  {
    this.weight = paramDouble;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.SuggestionDetail.Builder
 * JD-Core Version:    0.6.0
 */