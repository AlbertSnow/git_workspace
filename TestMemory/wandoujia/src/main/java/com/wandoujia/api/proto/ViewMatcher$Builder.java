package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class ViewMatcher$Builder extends Message.Builder<ViewMatcher>
{
  public ViewMatcher.MatchType match_type;
  public List<String> match_value;

  public ViewMatcher$Builder()
  {
  }

  public ViewMatcher$Builder(ViewMatcher paramViewMatcher)
  {
    super(paramViewMatcher);
    if (paramViewMatcher == null)
      return;
    this.match_type = paramViewMatcher.match_type;
    this.match_value = ViewMatcher.access$000(paramViewMatcher.match_value);
  }

  public final ViewMatcher build()
  {
    checkRequiredFields();
    return new ViewMatcher(this, null);
  }

  public final Builder match_type(ViewMatcher.MatchType paramMatchType)
  {
    this.match_type = paramMatchType;
    return this;
  }

  public final Builder match_value(List<String> paramList)
  {
    this.match_value = checkForNulls(paramList);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ViewMatcher.Builder
 * JD-Core Version:    0.6.0
 */