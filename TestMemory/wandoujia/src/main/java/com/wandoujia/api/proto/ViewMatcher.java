package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ViewMatcher extends Message
{
  public static final ViewMatcher.MatchType DEFAULT_MATCH_TYPE = ViewMatcher.MatchType.TEXT;
  public static final List<String> DEFAULT_MATCH_VALUE = Collections.emptyList();

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.ENUM)
  public final ViewMatcher.MatchType match_type;

  @ProtoField(label=Message.Label.REPEATED, tag=2, type=Message.Datatype.STRING)
  public final List<String> match_value;

  private ViewMatcher(ViewMatcher.Builder paramBuilder)
  {
    super(paramBuilder);
    this.match_type = paramBuilder.match_type;
    this.match_value = immutableCopyOf(paramBuilder.match_value);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ViewMatcher localViewMatcher;
    do
    {
      return true;
      if (!(paramObject instanceof ViewMatcher))
        return false;
      localViewMatcher = (ViewMatcher)paramObject;
    }
    while ((equals(this.match_type, localViewMatcher.match_type)) && (equals(this.match_value, localViewMatcher.match_value)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.match_type == null)
        break label59;
      j = this.match_type.hashCode();
      k = j * 37;
      if (this.match_value == null)
        break label64;
    }
    label59: label64: for (int m = this.match_value.hashCode(); ; m = 1)
    {
      i = m + k;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ViewMatcher
 * JD-Core Version:    0.6.0
 */