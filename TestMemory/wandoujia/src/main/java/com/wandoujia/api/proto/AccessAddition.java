package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class AccessAddition extends Message
{
  public static final List<AccessAction> DEFAULT_ACCESS_ACTION = Collections.emptyList();
  public static final String DEFAULT_OVERALL_HINT = "";

  @ProtoField(label=Message.Label.REPEATED, tag=2)
  public final List<AccessAction> access_action;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.STRING)
  public final String overall_hint;

  private AccessAddition(AccessAddition.Builder paramBuilder)
  {
    super(paramBuilder);
    this.overall_hint = paramBuilder.overall_hint;
    this.access_action = immutableCopyOf(paramBuilder.access_action);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    AccessAddition localAccessAddition;
    do
    {
      return true;
      if (!(paramObject instanceof AccessAddition))
        return false;
      localAccessAddition = (AccessAddition)paramObject;
    }
    while ((equals(this.overall_hint, localAccessAddition.overall_hint)) && (equals(this.access_action, localAccessAddition.access_action)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.overall_hint == null)
        break label59;
      j = this.overall_hint.hashCode();
      k = j * 37;
      if (this.access_action == null)
        break label64;
    }
    label59: label64: for (int m = this.access_action.hashCode(); ; m = 1)
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
 * Qualified Name:     com.wandoujia.api.proto.AccessAddition
 * JD-Core Version:    0.6.0
 */