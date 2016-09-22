package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class FlingEvent extends Message
{
  public static final FlingEvent.FlingDirection DEFAULT_FLING_DIRECTION = FlingEvent.FlingDirection.UP;

  @ProtoField(tag=3)
  public final ExtraPackage extra_package;

  @ProtoField(tag=2, type=Message.Datatype.ENUM)
  public final FlingEvent.FlingDirection fling_direction;

  @ProtoField(tag=1)
  public final ViewLogPackage view_log_package;

  private FlingEvent(FlingEvent.Builder paramBuilder)
  {
    super(paramBuilder);
    this.view_log_package = paramBuilder.view_log_package;
    this.fling_direction = paramBuilder.fling_direction;
    this.extra_package = paramBuilder.extra_package;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    FlingEvent localFlingEvent;
    do
    {
      return true;
      if (!(paramObject instanceof FlingEvent))
        return false;
      localFlingEvent = (FlingEvent)paramObject;
    }
    while ((equals(this.view_log_package, localFlingEvent.view_log_package)) && (equals(this.fling_direction, localFlingEvent.fling_direction)) && (equals(this.extra_package, localFlingEvent.extra_package)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.view_log_package == null)
        break label90;
      j = this.view_log_package.hashCode();
      k = j * 37;
      if (this.fling_direction == null)
        break label95;
    }
    label90: label95: for (int m = this.fling_direction.hashCode(); ; m = 0)
    {
      int n = 37 * (m + k);
      ExtraPackage localExtraPackage = this.extra_package;
      int i1 = 0;
      if (localExtraPackage != null)
        i1 = this.extra_package.hashCode();
      i = n + i1;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.FlingEvent
 * JD-Core Version:    0.6.0
 */