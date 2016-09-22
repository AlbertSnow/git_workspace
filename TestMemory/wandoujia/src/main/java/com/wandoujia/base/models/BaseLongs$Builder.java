package com.wandoujia.base.models;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class BaseLongs$Builder extends Message.Builder<BaseLongs>
{
  public List<Long> val;

  public BaseLongs$Builder()
  {
  }

  public BaseLongs$Builder(BaseLongs paramBaseLongs)
  {
    super(paramBaseLongs);
    if (paramBaseLongs == null)
      return;
    this.val = BaseLongs.access$000(paramBaseLongs.val);
  }

  public final BaseLongs build()
  {
    return new BaseLongs(this, null);
  }

  public final Builder val(List<Long> paramList)
  {
    this.val = paramList;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.BaseLongs.Builder
 * JD-Core Version:    0.6.0
 */