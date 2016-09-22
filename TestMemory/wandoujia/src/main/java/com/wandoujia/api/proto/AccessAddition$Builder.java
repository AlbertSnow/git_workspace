package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class AccessAddition$Builder extends Message.Builder<AccessAddition>
{
  public List<AccessAction> access_action;
  public String overall_hint;

  public AccessAddition$Builder()
  {
  }

  public AccessAddition$Builder(AccessAddition paramAccessAddition)
  {
    super(paramAccessAddition);
    if (paramAccessAddition == null)
      return;
    this.overall_hint = paramAccessAddition.overall_hint;
    this.access_action = AccessAddition.access$000(paramAccessAddition.access_action);
  }

  public final Builder access_action(List<AccessAction> paramList)
  {
    this.access_action = checkForNulls(paramList);
    return this;
  }

  public final AccessAddition build()
  {
    checkRequiredFields();
    return new AccessAddition(this, null);
  }

  public final Builder overall_hint(String paramString)
  {
    this.overall_hint = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.AccessAddition.Builder
 * JD-Core Version:    0.6.0
 */