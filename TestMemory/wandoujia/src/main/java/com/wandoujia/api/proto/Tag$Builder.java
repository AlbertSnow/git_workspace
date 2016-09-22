package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class Tag$Builder extends Message.Builder<Tag>
{
  public Action action;
  public Color color;
  public Image icon;
  public Integer tag_id;
  public String tag_name;
  public Integer type;

  public Tag$Builder()
  {
  }

  public Tag$Builder(Tag paramTag)
  {
    super(paramTag);
    if (paramTag == null)
      return;
    this.tag_id = paramTag.tag_id;
    this.type = paramTag.type;
    this.tag_name = paramTag.tag_name;
    this.icon = paramTag.icon;
    this.color = paramTag.color;
    this.action = paramTag.action;
  }

  public final Builder action(Action paramAction)
  {
    this.action = paramAction;
    return this;
  }

  public final Tag build()
  {
    checkRequiredFields();
    return new Tag(this, null);
  }

  public final Builder color(Color paramColor)
  {
    this.color = paramColor;
    return this;
  }

  public final Builder icon(Image paramImage)
  {
    this.icon = paramImage;
    return this;
  }

  public final Builder tag_id(Integer paramInteger)
  {
    this.tag_id = paramInteger;
    return this;
  }

  public final Builder tag_name(String paramString)
  {
    this.tag_name = paramString;
    return this;
  }

  public final Builder type(Integer paramInteger)
  {
    this.type = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Tag.Builder
 * JD-Core Version:    0.6.0
 */