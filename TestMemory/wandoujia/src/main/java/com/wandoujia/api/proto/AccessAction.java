package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class AccessAction extends Message
{
  public static final Long DEFAULT_ACTION_DELAY;
  public static final Integer DEFAULT_ACTION_TYPE;
  public static final String DEFAULT_ACTION_VALUE = "";
  public static final String DEFAULT_HINT = "";
  public static final Long DEFAULT_TIMEOUT;
  public static final List<ViewMatcher> DEFAULT_VIEW_MATCHER = Collections.emptyList();

  @ProtoField(tag=4, type=Message.Datatype.INT64)
  public final Long action_delay;

  @ProtoField(label=Message.Label.REQUIRED, tag=2, type=Message.Datatype.INT32)
  public final Integer action_type;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String action_value;

  @ProtoField(tag=6, type=Message.Datatype.STRING)
  public final String hint;

  @ProtoField(tag=5, type=Message.Datatype.INT64)
  public final Long timeout;

  @ProtoField(label=Message.Label.REPEATED, tag=1)
  public final List<ViewMatcher> view_matcher;

  static
  {
    DEFAULT_ACTION_TYPE = Integer.valueOf(0);
    DEFAULT_ACTION_DELAY = Long.valueOf(0L);
    DEFAULT_TIMEOUT = Long.valueOf(0L);
  }

  private AccessAction(AccessAction.Builder paramBuilder)
  {
    super(paramBuilder);
    this.view_matcher = immutableCopyOf(paramBuilder.view_matcher);
    this.action_type = paramBuilder.action_type;
    this.action_value = paramBuilder.action_value;
    this.action_delay = paramBuilder.action_delay;
    this.timeout = paramBuilder.timeout;
    this.hint = paramBuilder.hint;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    AccessAction localAccessAction;
    do
    {
      return true;
      if (!(paramObject instanceof AccessAction))
        return false;
      localAccessAction = (AccessAction)paramObject;
    }
    while ((equals(this.view_matcher, localAccessAction.view_matcher)) && (equals(this.action_type, localAccessAction.action_type)) && (equals(this.action_value, localAccessAction.action_value)) && (equals(this.action_delay, localAccessAction.action_delay)) && (equals(this.timeout, localAccessAction.timeout)) && (equals(this.hint, localAccessAction.hint)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label47: int i1;
    label72: int i3;
    label98: int i4;
    if (i == 0)
    {
      if (this.view_matcher == null)
        break label170;
      j = this.view_matcher.hashCode();
      int k = j * 37;
      if (this.action_type == null)
        break label175;
      m = this.action_type.hashCode();
      int n = 37 * (m + k);
      if (this.action_value == null)
        break label181;
      i1 = this.action_value.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.action_delay == null)
        break label187;
      i3 = this.action_delay.hashCode();
      i4 = 37 * (i3 + i2);
      if (this.timeout == null)
        break label193;
    }
    label170: label175: label181: label187: label193: for (int i5 = this.timeout.hashCode(); ; i5 = 0)
    {
      int i6 = 37 * (i5 + i4);
      String str = this.hint;
      int i7 = 0;
      if (str != null)
        i7 = this.hint.hashCode();
      i = i6 + i7;
      this.hashCode = i;
      return i;
      j = 1;
      break;
      m = 0;
      break label47;
      i1 = 0;
      break label72;
      i3 = 0;
      break label98;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.AccessAction
 * JD-Core Version:    0.6.0
 */