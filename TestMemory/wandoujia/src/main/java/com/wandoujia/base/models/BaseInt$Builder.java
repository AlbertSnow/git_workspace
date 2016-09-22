package com.wandoujia.base.models;

import com.squareup.wire.Message.Builder;

public final class BaseInt$Builder extends Message.Builder<BaseInt>
{
  public Integer val;

  public BaseInt$Builder()
  {
  }

  public BaseInt$Builder(BaseInt paramBaseInt)
  {
    super(paramBaseInt);
    if (paramBaseInt == null)
      return;
    this.val = paramBaseInt.val;
  }

  public final BaseInt build()
  {
    checkRequiredFields();
    return new BaseInt(this, null);
  }

  public final Builder val(Integer paramInteger)
  {
    this.val = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.BaseInt.Builder
 * JD-Core Version:    0.6.0
 */