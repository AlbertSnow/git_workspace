package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class Action$Builder extends Message.Builder<Action>
{
  public AccessAddition access_addition;
  public Entity entity;
  public String intent;
  public String package_name;
  public String text;
  public Integer type;
  public String url;

  public Action$Builder()
  {
  }

  public Action$Builder(Action paramAction)
  {
    super(paramAction);
    if (paramAction == null)
      return;
    this.type = paramAction.type;
    this.intent = paramAction.intent;
    this.url = paramAction.url;
    this.text = paramAction.text;
    this.package_name = paramAction.package_name;
    this.access_addition = paramAction.access_addition;
    this.entity = paramAction.entity;
  }

  public final Builder access_addition(AccessAddition paramAccessAddition)
  {
    this.access_addition = paramAccessAddition;
    return this;
  }

  public final Action build()
  {
    return new Action(this, null);
  }

  public final Builder entity(Entity paramEntity)
  {
    this.entity = paramEntity;
    return this;
  }

  public final Builder intent(String paramString)
  {
    this.intent = paramString;
    return this;
  }

  public final Builder package_name(String paramString)
  {
    this.package_name = paramString;
    return this;
  }

  public final Builder text(String paramString)
  {
    this.text = paramString;
    return this;
  }

  public final Builder type(Integer paramInteger)
  {
    this.type = paramInteger;
    return this;
  }

  public final Builder url(String paramString)
  {
    this.url = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Action.Builder
 * JD-Core Version:    0.6.0
 */