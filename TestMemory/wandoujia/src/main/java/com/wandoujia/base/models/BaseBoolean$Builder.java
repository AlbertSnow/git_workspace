package com.wandoujia.base.models;

import com.squareup.wire.Message.Builder;

public final class BaseBoolean$Builder extends Message.Builder<BaseBoolean>
{
  public Boolean val;

  public BaseBoolean$Builder()
  {
  }

  public BaseBoolean$Builder(BaseBoolean paramBaseBoolean)
  {
    super(paramBaseBoolean);
    if (paramBaseBoolean == null)
      return;
    this.val = paramBaseBoolean.val;
  }

  public final BaseBoolean build()
  {
    checkRequiredFields();
    return new BaseBoolean(this, null);
  }

  public final Builder val(Boolean paramBoolean)
  {
    this.val = paramBoolean;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.BaseBoolean.Builder
 * JD-Core Version:    0.6.0
 */