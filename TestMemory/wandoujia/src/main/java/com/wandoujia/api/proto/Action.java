package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class Action extends Message
{
  public static final String DEFAULT_INTENT = "";
  public static final String DEFAULT_PACKAGE_NAME = "";
  public static final String DEFAULT_TEXT = "";
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  public static final String DEFAULT_URL = "";

  @ProtoField(tag=6)
  public final AccessAddition access_addition;

  @ProtoField(tag=7)
  public final Entity entity;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String intent;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String package_name;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String text;

  @ProtoField(tag=1, type=Message.Datatype.INT32)
  public final Integer type;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String url;

  private Action(Action.Builder paramBuilder)
  {
    super(paramBuilder);
    this.type = paramBuilder.type;
    this.intent = paramBuilder.intent;
    this.url = paramBuilder.url;
    this.text = paramBuilder.text;
    this.package_name = paramBuilder.package_name;
    this.access_addition = paramBuilder.access_addition;
    this.entity = paramBuilder.entity;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Action localAction;
    do
    {
      return true;
      if (!(paramObject instanceof Action))
        return false;
      localAction = (Action)paramObject;
    }
    while ((equals(this.type, localAction.type)) && (equals(this.intent, localAction.intent)) && (equals(this.url, localAction.url)) && (equals(this.text, localAction.text)) && (equals(this.package_name, localAction.package_name)) && (equals(this.access_addition, localAction.access_addition)) && (equals(this.entity, localAction.entity)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i3;
    label96: int i5;
    label122: int i6;
    if (i == 0)
    {
      if (this.type == null)
        break label194;
      j = this.type.hashCode();
      int k = j * 37;
      if (this.intent == null)
        break label199;
      m = this.intent.hashCode();
      int n = 37 * (m + k);
      if (this.url == null)
        break label205;
      i1 = this.url.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.text == null)
        break label211;
      i3 = this.text.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.package_name == null)
        break label217;
      i5 = this.package_name.hashCode();
      i6 = 37 * (i5 + i4);
      if (this.access_addition == null)
        break label223;
    }
    label194: label199: label205: label211: label217: label223: for (int i7 = this.access_addition.hashCode(); ; i7 = 0)
    {
      int i8 = 37 * (i7 + i6);
      Entity localEntity = this.entity;
      int i9 = 0;
      if (localEntity != null)
        i9 = this.entity.hashCode();
      i = i8 + i9;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
      i1 = 0;
      break label70;
      i3 = 0;
      break label96;
      i5 = 0;
      break label122;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Action
 * JD-Core Version:    0.6.0
 */