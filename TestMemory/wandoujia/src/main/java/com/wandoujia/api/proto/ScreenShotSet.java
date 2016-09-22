package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ScreenShotSet extends Message
{
  public static final List<String> DEFAULT_NORMAL = Collections.emptyList();
  public static final List<String> DEFAULT_SMALL = Collections.emptyList();

  @ProtoField(label=Message.Label.REPEATED, tag=1, type=Message.Datatype.STRING)
  public final List<String> normal;

  @ProtoField(label=Message.Label.REPEATED, tag=2, type=Message.Datatype.STRING)
  public final List<String> small;

  private ScreenShotSet(ScreenShotSet.Builder paramBuilder)
  {
    super(paramBuilder);
    this.normal = immutableCopyOf(paramBuilder.normal);
    this.small = immutableCopyOf(paramBuilder.small);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ScreenShotSet localScreenShotSet;
    do
    {
      return true;
      if (!(paramObject instanceof ScreenShotSet))
        return false;
      localScreenShotSet = (ScreenShotSet)paramObject;
    }
    while ((equals(this.normal, localScreenShotSet.normal)) && (equals(this.small, localScreenShotSet.small)));
    return false;
  }

  public final int hashCode()
  {
    int i = 1;
    int j = this.hashCode;
    if (j == 0)
      if (this.normal == null)
        break label63;
    label63: for (int k = this.normal.hashCode(); ; k = i)
    {
      int m = k * 37;
      if (this.small != null)
        i = this.small.hashCode();
      j = m + i;
      this.hashCode = j;
      return j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ScreenShotSet
 * JD-Core Version:    0.6.0
 */