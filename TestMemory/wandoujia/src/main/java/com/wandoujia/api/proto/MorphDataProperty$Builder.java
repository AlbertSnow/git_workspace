package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class MorphDataProperty$Builder extends Message.Builder<MorphDataProperty>
{
  public Integer height;
  public Boolean is_visible;
  public Integer width;

  public MorphDataProperty$Builder()
  {
  }

  public MorphDataProperty$Builder(MorphDataProperty paramMorphDataProperty)
  {
    super(paramMorphDataProperty);
    if (paramMorphDataProperty == null)
      return;
    this.is_visible = paramMorphDataProperty.is_visible;
    this.width = paramMorphDataProperty.width;
    this.height = paramMorphDataProperty.height;
  }

  public final MorphDataProperty build()
  {
    return new MorphDataProperty(this, null);
  }

  public final Builder height(Integer paramInteger)
  {
    this.height = paramInteger;
    return this;
  }

  public final Builder is_visible(Boolean paramBoolean)
  {
    this.is_visible = paramBoolean;
    return this;
  }

  public final Builder width(Integer paramInteger)
  {
    this.width = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.MorphDataProperty.Builder
 * JD-Core Version:    0.6.0
 */