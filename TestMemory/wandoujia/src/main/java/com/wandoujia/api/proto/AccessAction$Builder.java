package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class AccessAction$Builder extends Message.Builder<AccessAction>
{
  public Long action_delay;
  public Integer action_type;
  public String action_value;
  public String hint;
  public Long timeout;
  public List<ViewMatcher> view_matcher;

  public AccessAction$Builder()
  {
  }

  public AccessAction$Builder(AccessAction paramAccessAction)
  {
    super(paramAccessAction);
    if (paramAccessAction == null)
      return;
    this.view_matcher = AccessAction.access$000(paramAccessAction.view_matcher);
    this.action_type = paramAccessAction.action_type;
    this.action_value = paramAccessAction.action_value;
    this.action_delay = paramAccessAction.action_delay;
    this.timeout = paramAccessAction.timeout;
    this.hint = paramAccessAction.hint;
  }

  public final Builder action_delay(Long paramLong)
  {
    this.action_delay = paramLong;
    return this;
  }

  public final Builder action_type(Integer paramInteger)
  {
    this.action_type = paramInteger;
    return this;
  }

  public final Builder action_value(String paramString)
  {
    this.action_value = paramString;
    return this;
  }

  public final AccessAction build()
  {
    checkRequiredFields();
    return new AccessAction(this, null);
  }

  public final Builder hint(String paramString)
  {
    this.hint = paramString;
    return this;
  }

  public final Builder timeout(Long paramLong)
  {
    this.timeout = paramLong;
    return this;
  }

  public final Builder view_matcher(List<ViewMatcher> paramList)
  {
    this.view_matcher = checkForNulls(paramList);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.AccessAction.Builder
 * JD-Core Version:    0.6.0
 */