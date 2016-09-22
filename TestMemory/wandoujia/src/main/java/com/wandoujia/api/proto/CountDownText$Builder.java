package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class CountDownText$Builder extends Message.Builder<CountDownText>
{
  public List<CountDownPoint> point;

  public CountDownText$Builder()
  {
  }

  public CountDownText$Builder(CountDownText paramCountDownText)
  {
    super(paramCountDownText);
    if (paramCountDownText == null)
      return;
    this.point = CountDownText.access$000(paramCountDownText.point);
  }

  public final CountDownText build()
  {
    return new CountDownText(this, null);
  }

  public final Builder point(List<CountDownPoint> paramList)
  {
    this.point = checkForNulls(paramList);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.CountDownText.Builder
 * JD-Core Version:    0.6.0
 */