package com.wandoujia.base.models;

import com.squareup.wire.Message.Builder;

public final class Pair$Builder extends Message.Builder<Pair>
{
  public String key;
  public String value;

  public Pair$Builder()
  {
  }

  public Pair$Builder(Pair paramPair)
  {
    super(paramPair);
    if (paramPair == null)
      return;
    this.key = paramPair.key;
    this.value = paramPair.value;
  }

  public final Pair build()
  {
    checkRequiredFields();
    return new Pair(this, null);
  }

  public final Builder key(String paramString)
  {
    this.key = paramString;
    return this;
  }

  public final Builder value(String paramString)
  {
    this.value = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.Pair.Builder
 * JD-Core Version:    0.6.0
 */