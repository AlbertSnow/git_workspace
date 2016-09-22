package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class OnboardResponse$Builder extends Message.Builder<OnboardResponse>
{
  public Boolean onboard_status;

  public OnboardResponse$Builder()
  {
  }

  public OnboardResponse$Builder(OnboardResponse paramOnboardResponse)
  {
    super(paramOnboardResponse);
    if (paramOnboardResponse == null)
      return;
    this.onboard_status = paramOnboardResponse.onboard_status;
  }

  public final OnboardResponse build()
  {
    checkRequiredFields();
    return new OnboardResponse(this, null);
  }

  public final Builder onboard_status(Boolean paramBoolean)
  {
    this.onboard_status = paramBoolean;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.OnboardResponse.Builder
 * JD-Core Version:    0.6.0
 */