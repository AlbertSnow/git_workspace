package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class Trigger$Builder extends Message.Builder<Trigger>
{
  public List<MapFieldEntry> parameter;
  public Trigger.Source source;

  public Trigger$Builder()
  {
  }

  public Trigger$Builder(Trigger paramTrigger)
  {
    super(paramTrigger);
    if (paramTrigger == null)
      return;
    this.source = paramTrigger.source;
    this.parameter = Trigger.access$000(paramTrigger.parameter);
  }

  public final Trigger build()
  {
    checkRequiredFields();
    return new Trigger(this, null);
  }

  public final Builder parameter(List<MapFieldEntry> paramList)
  {
    this.parameter = checkForNulls(paramList);
    return this;
  }

  public final Builder source(Trigger.Source paramSource)
  {
    this.source = paramSource;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Trigger.Builder
 * JD-Core Version:    0.6.0
 */