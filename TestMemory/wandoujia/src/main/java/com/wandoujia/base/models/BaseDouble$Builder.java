package com.wandoujia.base.models;

import com.squareup.wire.Message.Builder;

public final class BaseDouble$Builder extends Message.Builder<BaseDouble>
{
  public Double val;

  public BaseDouble$Builder()
  {
  }

  public BaseDouble$Builder(BaseDouble paramBaseDouble)
  {
    super(paramBaseDouble);
    if (paramBaseDouble == null)
      return;
    this.val = paramBaseDouble.val;
  }

  public final BaseDouble build()
  {
    checkRequiredFields();
    return new BaseDouble(this, null);
  }

  public final Builder val(Double paramDouble)
  {
    this.val = paramDouble;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.BaseDouble.Builder
 * JD-Core Version:    0.6.0
 */