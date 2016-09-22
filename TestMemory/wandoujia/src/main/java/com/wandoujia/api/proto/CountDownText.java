package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class CountDownText extends Message
{
  public static final List<CountDownPoint> DEFAULT_POINT = Collections.emptyList();

  @ProtoField(label=Message.Label.REPEATED, tag=1)
  public final List<CountDownPoint> point;

  private CountDownText(CountDownText.Builder paramBuilder)
  {
    super(paramBuilder);
    this.point = immutableCopyOf(paramBuilder.point);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof CountDownText))
      return false;
    return equals(this.point, ((CountDownText)paramObject).point);
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i != 0)
      return i;
    if (this.point != null);
    for (int j = this.point.hashCode(); ; j = 1)
    {
      this.hashCode = j;
      return j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.CountDownText
 * JD-Core Version:    0.6.0
 */