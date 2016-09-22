package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class SuggestionDetail extends Message
{
  public static final Long DEFAULT_DEADLINE;
  public static final List<MapFieldEntry> DEFAULT_FIELD = Collections.emptyList();
  public static final String DEFAULT_NAME = "";
  public static final Integer DEFAULT_NOTIFICATION_LOCATION;
  public static final Integer DEFAULT_NOTIFICATION_STYLE;
  public static final Double DEFAULT_WEIGHT = Double.valueOf(0.0D);

  @ProtoField(tag=5, type=Message.Datatype.INT64)
  public final Long deadline;

  @ProtoField(label=Message.Label.REPEATED, tag=2)
  public final List<MapFieldEntry> field;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String name;

  @ProtoField(tag=6, type=Message.Datatype.INT32)
  public final Integer notification_location;

  @ProtoField(tag=4, type=Message.Datatype.INT32)
  public final Integer notification_style;

  @ProtoField(tag=3, type=Message.Datatype.DOUBLE)
  public final Double weight;

  static
  {
    DEFAULT_NOTIFICATION_STYLE = Integer.valueOf(0);
    DEFAULT_DEADLINE = Long.valueOf(0L);
    DEFAULT_NOTIFICATION_LOCATION = Integer.valueOf(0);
  }

  private SuggestionDetail(SuggestionDetail.Builder paramBuilder)
  {
    super(paramBuilder);
    this.name = paramBuilder.name;
    this.field = immutableCopyOf(paramBuilder.field);
    this.weight = paramBuilder.weight;
    this.notification_style = paramBuilder.notification_style;
    this.deadline = paramBuilder.deadline;
    this.notification_location = paramBuilder.notification_location;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    SuggestionDetail localSuggestionDetail;
    do
    {
      return true;
      if (!(paramObject instanceof SuggestionDetail))
        return false;
      localSuggestionDetail = (SuggestionDetail)paramObject;
    }
    while ((equals(this.name, localSuggestionDetail.name)) && (equals(this.field, localSuggestionDetail.field)) && (equals(this.weight, localSuggestionDetail.weight)) && (equals(this.notification_style, localSuggestionDetail.notification_style)) && (equals(this.deadline, localSuggestionDetail.deadline)) && (equals(this.notification_location, localSuggestionDetail.notification_location)));
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
      if (this.name == null)
        break label170;
      j = this.name.hashCode();
      int k = j * 37;
      if (this.field == null)
        break label175;
      m = this.field.hashCode();
      int n = 37 * (m + k);
      if (this.weight == null)
        break label181;
      i1 = this.weight.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.notification_style == null)
        break label187;
      i3 = this.notification_style.hashCode();
      i4 = 37 * (i3 + i2);
      if (this.deadline == null)
        break label193;
    }
    label170: label175: label181: label187: label193: for (int i5 = this.deadline.hashCode(); ; i5 = 0)
    {
      int i6 = 37 * (i5 + i4);
      Integer localInteger = this.notification_location;
      int i7 = 0;
      if (localInteger != null)
        i7 = this.notification_location.hashCode();
      i = i6 + i7;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 1;
      break label47;
      i1 = 0;
      break label72;
      i3 = 0;
      break label98;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.SuggestionDetail
 * JD-Core Version:    0.6.0
 */