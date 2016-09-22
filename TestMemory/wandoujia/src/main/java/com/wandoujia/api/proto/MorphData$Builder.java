package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class MorphData$Builder extends Message.Builder<MorphData>
{
  public Action action;
  public String key;
  public MorphDataProperty property;
  public String value;

  public MorphData$Builder()
  {
  }

  public MorphData$Builder(MorphData paramMorphData)
  {
    super(paramMorphData);
    if (paramMorphData == null)
      return;
    this.key = paramMorphData.key;
    this.value = paramMorphData.value;
    this.action = paramMorphData.action;
    this.property = paramMorphData.property;
  }

  public final Builder action(Action paramAction)
  {
    this.action = paramAction;
    return this;
  }

  public final MorphData build()
  {
    return new MorphData(this, null);
  }

  public final Builder key(String paramString)
  {
    this.key = paramString;
    return this;
  }

  public final Builder property(MorphDataProperty paramMorphDataProperty)
  {
    this.property = paramMorphDataProperty;
    return this;
  }

  public final Builder value(String paramString)
  {
    this.value = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.MorphData.Builder
 * JD-Core Version:    0.6.0
 */