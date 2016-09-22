package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class Developer$Builder extends Message.Builder<Developer>
{
  public String email;
  public Long id;
  public String name;

  public Developer$Builder()
  {
  }

  public Developer$Builder(Developer paramDeveloper)
  {
    super(paramDeveloper);
    if (paramDeveloper == null)
      return;
    this.email = paramDeveloper.email;
    this.id = paramDeveloper.id;
    this.name = paramDeveloper.name;
  }

  public final Developer build()
  {
    return new Developer(this, null);
  }

  public final Builder email(String paramString)
  {
    this.email = paramString;
    return this;
  }

  public final Builder id(Long paramLong)
  {
    this.id = paramLong;
    return this;
  }

  public final Builder name(String paramString)
  {
    this.name = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Developer.Builder
 * JD-Core Version:    0.6.0
 */