package com.wandoujia.base.models;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class Map$Builder extends Message.Builder<Map>
{
  public List<Pair> val;

  public Map$Builder()
  {
  }

  public Map$Builder(Map paramMap)
  {
    super(paramMap);
    if (paramMap == null)
      return;
    this.val = Map.access$000(paramMap.val);
  }

  public final Map build()
  {
    return new Map(this, null);
  }

  public final Builder val(List<Pair> paramList)
  {
    this.val = paramList;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.Map.Builder
 * JD-Core Version:    0.6.0
 */