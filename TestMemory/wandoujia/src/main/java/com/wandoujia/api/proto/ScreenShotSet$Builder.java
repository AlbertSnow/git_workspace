package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class ScreenShotSet$Builder extends Message.Builder<ScreenShotSet>
{
  public List<String> normal;
  public List<String> small;

  public ScreenShotSet$Builder()
  {
  }

  public ScreenShotSet$Builder(ScreenShotSet paramScreenShotSet)
  {
    super(paramScreenShotSet);
    if (paramScreenShotSet == null)
      return;
    this.normal = ScreenShotSet.access$000(paramScreenShotSet.normal);
    this.small = ScreenShotSet.access$100(paramScreenShotSet.small);
  }

  public final ScreenShotSet build()
  {
    return new ScreenShotSet(this, null);
  }

  public final Builder normal(List<String> paramList)
  {
    this.normal = checkForNulls(paramList);
    return this;
  }

  public final Builder small(List<String> paramList)
  {
    this.small = checkForNulls(paramList);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ScreenShotSet.Builder
 * JD-Core Version:    0.6.0
 */