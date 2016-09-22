package com.wandoujia.base.models;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class BaseInts$Builder extends Message.Builder<BaseInts>
{
  public List<Integer> val;

  public BaseInts$Builder()
  {
  }

  public BaseInts$Builder(BaseInts paramBaseInts)
  {
    super(paramBaseInts);
    if (paramBaseInts == null)
      return;
    this.val = BaseInts.access$000(paramBaseInts.val);
  }

  public final BaseInts build()
  {
    return new BaseInts(this, null);
  }

  public final Builder val(List<Integer> paramList)
  {
    this.val = paramList;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.BaseInts.Builder
 * JD-Core Version:    0.6.0
 */