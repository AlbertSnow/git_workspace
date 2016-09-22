package com.wandoujia.base.models;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class BaseBooleans$Builder extends Message.Builder<BaseBooleans>
{
  public List<Boolean> val;

  public BaseBooleans$Builder()
  {
  }

  public BaseBooleans$Builder(BaseBooleans paramBaseBooleans)
  {
    super(paramBaseBooleans);
    if (paramBaseBooleans == null)
      return;
    this.val = BaseBooleans.access$000(paramBaseBooleans.val);
  }

  public final BaseBooleans build()
  {
    return new BaseBooleans(this, null);
  }

  public final Builder val(List<Boolean> paramList)
  {
    this.val = paramList;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.BaseBooleans.Builder
 * JD-Core Version:    0.6.0
 */