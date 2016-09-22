package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class TriggerRequest$Builder extends Message.Builder<TriggerRequest>
{
  public UserContext context;
  public Integer pb_version;
  public Trigger trigger;

  public TriggerRequest$Builder()
  {
  }

  public TriggerRequest$Builder(TriggerRequest paramTriggerRequest)
  {
    super(paramTriggerRequest);
    if (paramTriggerRequest == null)
      return;
    this.pb_version = paramTriggerRequest.pb_version;
    this.context = paramTriggerRequest.context;
    this.trigger = paramTriggerRequest.trigger;
  }

  public final TriggerRequest build()
  {
    checkRequiredFields();
    return new TriggerRequest(this, null);
  }

  public final Builder context(UserContext paramUserContext)
  {
    this.context = paramUserContext;
    return this;
  }

  public final Builder pb_version(Integer paramInteger)
  {
    this.pb_version = paramInteger;
    return this;
  }

  public final Builder trigger(Trigger paramTrigger)
  {
    this.trigger = paramTrigger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.TriggerRequest.Builder
 * JD-Core Version:    0.6.0
 */