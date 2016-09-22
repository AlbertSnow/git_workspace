package com.wandoujia.base.models;

import com.squareup.wire.Message.Builder;

public final class BaseFloat$Builder extends Message.Builder<BaseFloat>
{
  public Float val;

  public BaseFloat$Builder()
  {
  }

  public BaseFloat$Builder(BaseFloat paramBaseFloat)
  {
    super(paramBaseFloat);
    if (paramBaseFloat == null)
      return;
    this.val = paramBaseFloat.val;
  }

  public final BaseFloat build()
  {
    checkRequiredFields();
    return new BaseFloat(this, null);
  }

  public final Builder val(Float paramFloat)
  {
    this.val = paramFloat;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.BaseFloat.Builder
 * JD-Core Version:    0.6.0
 */