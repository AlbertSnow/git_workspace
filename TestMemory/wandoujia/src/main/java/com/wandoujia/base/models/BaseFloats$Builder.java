package com.wandoujia.base.models;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class BaseFloats$Builder extends Message.Builder<BaseFloats>
{
  public List<Float> val;

  public BaseFloats$Builder()
  {
  }

  public BaseFloats$Builder(BaseFloats paramBaseFloats)
  {
    super(paramBaseFloats);
    if (paramBaseFloats == null)
      return;
    this.val = BaseFloats.access$000(paramBaseFloats.val);
  }

  public final BaseFloats build()
  {
    return new BaseFloats(this, null);
  }

  public final Builder val(List<Float> paramList)
  {
    this.val = paramList;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.BaseFloats.Builder
 * JD-Core Version:    0.6.0
 */