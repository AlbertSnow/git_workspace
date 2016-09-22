package com.wandoujia.base.models;

import com.squareup.wire.Message.Builder;

public final class BaseLong$Builder extends Message.Builder<BaseLong>
{
  public Long val;

  public BaseLong$Builder()
  {
  }

  public BaseLong$Builder(BaseLong paramBaseLong)
  {
    super(paramBaseLong);
    if (paramBaseLong == null)
      return;
    this.val = paramBaseLong.val;
  }

  public final BaseLong build()
  {
    checkRequiredFields();
    return new BaseLong(this, null);
  }

  public final Builder val(Long paramLong)
  {
    this.val = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.BaseLong.Builder
 * JD-Core Version:    0.6.0
 */