package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class Color$Builder extends Message.Builder<Color>
{
  public Integer normal;
  public Integer pressed;

  public Color$Builder()
  {
  }

  public Color$Builder(Color paramColor)
  {
    super(paramColor);
    if (paramColor == null)
      return;
    this.normal = paramColor.normal;
    this.pressed = paramColor.pressed;
  }

  public final Color build()
  {
    checkRequiredFields();
    return new Color(this, null);
  }

  public final Builder normal(Integer paramInteger)
  {
    this.normal = paramInteger;
    return this;
  }

  public final Builder pressed(Integer paramInteger)
  {
    this.pressed = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Color.Builder
 * JD-Core Version:    0.6.0
 */