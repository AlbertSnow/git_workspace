package com.wandoujia.base.models;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class BaseDoubles$Builder extends Message.Builder<BaseDoubles>
{
  public List<Double> val;

  public BaseDoubles$Builder()
  {
  }

  public BaseDoubles$Builder(BaseDoubles paramBaseDoubles)
  {
    super(paramBaseDoubles);
    if (paramBaseDoubles == null)
      return;
    this.val = BaseDoubles.access$000(paramBaseDoubles.val);
  }

  public final BaseDoubles build()
  {
    return new BaseDoubles(this, null);
  }

  public final Builder val(List<Double> paramList)
  {
    this.val = paramList;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.BaseDoubles.Builder
 * JD-Core Version:    0.6.0
 */