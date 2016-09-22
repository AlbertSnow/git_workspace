package com.wandoujia.base.models;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class BaseStrs$Builder extends Message.Builder<BaseStrs>
{
  public List<String> val;

  public BaseStrs$Builder()
  {
  }

  public BaseStrs$Builder(BaseStrs paramBaseStrs)
  {
    super(paramBaseStrs);
    if (paramBaseStrs == null)
      return;
    this.val = BaseStrs.access$000(paramBaseStrs.val);
  }

  public final BaseStrs build()
  {
    return new BaseStrs(this, null);
  }

  public final Builder val(List<String> paramList)
  {
    this.val = paramList;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.BaseStrs.Builder
 * JD-Core Version:    0.6.0
 */