package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class Emoji$Builder extends Message.Builder<Emoji>
{
  public Integer count;
  public String id;
  public Image image;
  public Long timestamp;

  public Emoji$Builder()
  {
  }

  public Emoji$Builder(Emoji paramEmoji)
  {
    super(paramEmoji);
    if (paramEmoji == null)
      return;
    this.id = paramEmoji.id;
    this.image = paramEmoji.image;
    this.timestamp = paramEmoji.timestamp;
    this.count = paramEmoji.count;
  }

  public final Emoji build()
  {
    return new Emoji(this, null);
  }

  public final Builder count(Integer paramInteger)
  {
    this.count = paramInteger;
    return this;
  }

  public final Builder id(String paramString)
  {
    this.id = paramString;
    return this;
  }

  public final Builder image(Image paramImage)
  {
    this.image = paramImage;
    return this;
  }

  public final Builder timestamp(Long paramLong)
  {
    this.timestamp = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Emoji.Builder
 * JD-Core Version:    0.6.0
 */