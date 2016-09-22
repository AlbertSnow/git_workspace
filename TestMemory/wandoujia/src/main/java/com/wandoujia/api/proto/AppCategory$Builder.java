package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class AppCategory$Builder extends Message.Builder<AppCategory>
{
  public String alias;
  public Integer level;
  public String name;
  public String type;

  public AppCategory$Builder()
  {
  }

  public AppCategory$Builder(AppCategory paramAppCategory)
  {
    super(paramAppCategory);
    if (paramAppCategory == null)
      return;
    this.alias = paramAppCategory.alias;
    this.level = paramAppCategory.level;
    this.name = paramAppCategory.name;
    this.type = paramAppCategory.type;
  }

  public final Builder alias(String paramString)
  {
    this.alias = paramString;
    return this;
  }

  public final AppCategory build()
  {
    return new AppCategory(this, null);
  }

  public final Builder level(Integer paramInteger)
  {
    this.level = paramInteger;
    return this;
  }

  public final Builder name(String paramString)
  {
    this.name = paramString;
    return this;
  }

  public final Builder type(String paramString)
  {
    this.type = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.AppCategory.Builder
 * JD-Core Version:    0.6.0
 */